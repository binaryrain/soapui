package com.eviware.soapui.impl.wsdl;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.impl.WorkspaceImpl;
import com.eviware.soapui.model.project.ProjectFactory;
import com.eviware.soapui.model.workspace.Workspace;
import com.eviware.soapui.support.SoapUIException;

public class WsdlProjectFactory implements ProjectFactory<WsdlProject>
{

	public static final String WSDL_TYPE = "wsdl";

	public WsdlProject createNew() throws XmlException, IOException, SoapUIException
	{
		return new WsdlProject();
	}

	public WsdlProject createNew(String path) throws XmlException, IOException, SoapUIException
	{
		return new WsdlProject(path);
	}

	public WsdlProject createNew(String projectFile, String projectPassword)
	{
		return new WsdlProject(projectFile, (WorkspaceImpl) null, true, true, null, projectPassword);
	}

	public WsdlProject createNew(Workspace workspace)
	{
		return new WsdlProject(null, (WorkspaceImpl)workspace, true);
	}

	public WsdlProject createNew(String path, Workspace workspace)
	{
		return new WsdlProject(path, (WorkspaceImpl)workspace, true);
	}

	public WsdlProject createNew(String path, Workspace workspace, boolean create)
	{
		return new WsdlProject(path, (WorkspaceImpl)workspace, create, true, null, null);
	}

	public WsdlProject createNew(String path, Workspace workspace, boolean create, boolean open, String tempName,
			String projectPassword)
	{
		return new WsdlProject(path, (WorkspaceImpl)workspace, create, open, tempName, projectPassword);
	}

}
