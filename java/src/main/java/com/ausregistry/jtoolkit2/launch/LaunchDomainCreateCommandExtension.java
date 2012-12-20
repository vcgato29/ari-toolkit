package com.ausregistry.jtoolkit2.launch;

import org.w3c.dom.Element;

import com.ausregistry.jtoolkit2.se.Command;
import com.ausregistry.jtoolkit2.se.CommandExtension;
import com.ausregistry.jtoolkit2.se.ExtendedObjectType;
import com.ausregistry.jtoolkit2.xml.XMLWriter;

public class LaunchDomainCreateCommandExtension implements CommandExtension {

    private static final long serialVersionUID = 5202343696850193788L;
    private String phase;

    @Override
    public void addToCommand(Command command) throws Exception {
        final XMLWriter xmlWriter = command.getXmlWriter();
        final Element extensionElement = command.getExtensionElement();
        final Element createElement = xmlWriter.appendChild(extensionElement, "create",
                ExtendedObjectType.LAUNCH.getURI());

        xmlWriter.appendChild(createElement, "phase", ExtendedObjectType.LAUNCH.getURI()).setTextContent(phase);

    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

}
