package com.topriddy.tenibot;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

@SuppressWarnings("serial")
public class XMPPReceiverServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		XMPPService xmpp = XMPPServiceFactory.getXMPPService();
		Message message = xmpp.parseMessage(req);

		JID fromJid = message.getFromJid();
		String body = message.getBody();

		String msgBody = Tenibot.processMessage(body);
		Message msg = new MessageBuilder().withRecipientJids(fromJid)
				.withBody(msgBody).build();
		xmpp.sendMessage(msg);
	}

	private String reverseMessage(String message) {
		StringBuilder builder = new StringBuilder();
		// builder.append("Reversed String:\n ");
		for (int i = message.length() - 1; i >= 0; i--) {
			builder.append(message.charAt(i));
		}
		return builder.toString();
	}
}
