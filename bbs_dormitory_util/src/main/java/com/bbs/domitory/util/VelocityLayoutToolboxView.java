package com.bbs.domitory.util;

import org.apache.velocity.context.Context;
import org.apache.velocity.tools.Scope;
import org.apache.velocity.tools.ToolManager;
import org.apache.velocity.tools.view.ViewToolContext;
import org.springframework.web.servlet.view.velocity.VelocityLayoutView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author: wuci
 * @date: 2017/12/19
 * @copyright:zjkj
 * @since : V1.0
 */
public class VelocityLayoutToolboxView extends VelocityLayoutView {
	@Override
	protected Context createVelocityContext(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ViewToolContext ctx = new ViewToolContext(this.getVelocityEngine(), request, response,
				this.getServletContext());

		if(this.getToolboxConfigLocation() != null) {
			ToolManager tm = new ToolManager();
			tm.setVelocityEngine(this.getVelocityEngine());
			tm.configure(this.getServletContext().getRealPath(this.getToolboxConfigLocation()));

			for(String scope : Scope.values()) {
				ctx.addToolbox(tm.getToolboxFactory().createToolbox(scope));
			}
		}

		if(model != null && !model.isEmpty()) {
			ctx.putAll(model);
		}

		return ctx;
	}
}