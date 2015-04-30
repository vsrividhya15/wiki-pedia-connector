
package org.mule.modules.wikipedia.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.wikipedia.WikiPediaConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>WikiPediaConnectorProcessAdapter</code> is a wrapper around {@link WikiPediaConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public abstract class WikiPediaConnectorProcessAdapter
    extends WikiPediaConnectorLifecycleAdapter
    implements ProcessAdapter<WikiPediaConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, WikiPediaConnectorCapabilitiesAdapter> getProcessTemplate() {
        final WikiPediaConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,WikiPediaConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, WikiPediaConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, WikiPediaConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
