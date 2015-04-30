
package org.mule.modules.wikipedia.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.wikipedia.WikiPediaConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * QueryGenDeletedRevisionsMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#queryGenDeletedRevisions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class QueryGenDeletedRevisionsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object prop;
    protected String _propType;
    protected Object list;
    protected String _listType;
    protected Object gdrvprop;
    protected String _gdrvpropType;
    protected Object gdrvlimit;
    protected String _gdrvlimitType;
    protected Object gdrvexpandtemplates;
    protected String _gdrvexpandtemplatesType;
    protected Object gdrvgeneratexml;
    protected String _gdrvgeneratexmlType;
    protected Object gdrvparse;
    protected String _gdrvparseType;
    protected Object gdrvsection;
    protected String _gdrvsectionType;
    protected Object gdrvdiffto;
    protected String _gdrvdifftoType;
    protected Object gdrvdifftotext;
    protected String _gdrvdifftotextType;
    protected Object gdrvcontentformat;
    protected String _gdrvcontentformatType;
    protected Object gdrvstart;
    protected String _gdrvstartType;
    protected Object gdrvend;
    protected String _gdrvendType;
    protected Object gdrvdir;
    protected String _gdrvdirType;
    protected Object gdrvtag;
    protected String _gdrvtagType;
    protected Object gdrvuser;
    protected String _gdrvuserType;
    protected Object gdrvexcludeuser;
    protected String _gdrvexcludeuserType;
    protected Object gdrvcontinue;
    protected String _gdrvcontinueType;
    protected Object indexpageids;
    protected String _indexpageidsType;
    protected Object export;
    protected String _exportType;
    protected Object exportnowrap;
    protected String _exportnowrapType;
    protected Object iwurl;
    protected String _iwurlType;
    protected Object continueId;
    protected String _continueIdType;
    protected Object titles;
    protected String _titlesType;
    protected Object pageids;
    protected String _pageidsType;
    protected Object revids;
    protected String _revidsType;
    protected Object generator;
    protected String _generatorType;
    protected Object redirects;
    protected String _redirectsType;
    protected Object converttitles;
    protected String _converttitlesType;
    protected Object maxlag;
    protected String _maxlagType;
    protected Object smaxage;
    protected String _smaxageType;
    protected Object maxage;
    protected String _maxageType;
    protected Object assertUser;
    protected String _assertUserType;
    protected Object requestid;
    protected String _requestidType;
    protected Object servedby;
    protected String _servedbyType;
    protected Object curtimestamp;
    protected String _curtimestampType;
    protected Object origin;
    protected String _originType;
    protected Object uselang;
    protected String _uselangType;
    protected Object centralauthtoken;
    protected String _centralauthtokenType;

    public QueryGenDeletedRevisionsMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets exportnowrap
     * 
     * @param value Value to set
     */
    public void setExportnowrap(Object value) {
        this.exportnowrap = value;
    }

    /**
     * Sets pageids
     * 
     * @param value Value to set
     */
    public void setPageids(Object value) {
        this.pageids = value;
    }

    /**
     * Sets maxage
     * 
     * @param value Value to set
     */
    public void setMaxage(Object value) {
        this.maxage = value;
    }

    /**
     * Sets maxlag
     * 
     * @param value Value to set
     */
    public void setMaxlag(Object value) {
        this.maxlag = value;
    }

    /**
     * Sets continueId
     * 
     * @param value Value to set
     */
    public void setContinueId(Object value) {
        this.continueId = value;
    }

    /**
     * Sets smaxage
     * 
     * @param value Value to set
     */
    public void setSmaxage(Object value) {
        this.smaxage = value;
    }

    /**
     * Sets gdrvcontinue
     * 
     * @param value Value to set
     */
    public void setGdrvcontinue(Object value) {
        this.gdrvcontinue = value;
    }

    /**
     * Sets revids
     * 
     * @param value Value to set
     */
    public void setRevids(Object value) {
        this.revids = value;
    }

    /**
     * Sets servedby
     * 
     * @param value Value to set
     */
    public void setServedby(Object value) {
        this.servedby = value;
    }

    /**
     * Sets redirects
     * 
     * @param value Value to set
     */
    public void setRedirects(Object value) {
        this.redirects = value;
    }

    /**
     * Sets gdrvlimit
     * 
     * @param value Value to set
     */
    public void setGdrvlimit(Object value) {
        this.gdrvlimit = value;
    }

    /**
     * Sets generator
     * 
     * @param value Value to set
     */
    public void setGenerator(Object value) {
        this.generator = value;
    }

    /**
     * Sets gdrvparse
     * 
     * @param value Value to set
     */
    public void setGdrvparse(Object value) {
        this.gdrvparse = value;
    }

    /**
     * Sets converttitles
     * 
     * @param value Value to set
     */
    public void setConverttitles(Object value) {
        this.converttitles = value;
    }

    /**
     * Sets curtimestamp
     * 
     * @param value Value to set
     */
    public void setCurtimestamp(Object value) {
        this.curtimestamp = value;
    }

    /**
     * Sets gdrvstart
     * 
     * @param value Value to set
     */
    public void setGdrvstart(Object value) {
        this.gdrvstart = value;
    }

    /**
     * Sets assertUser
     * 
     * @param value Value to set
     */
    public void setAssertUser(Object value) {
        this.assertUser = value;
    }

    /**
     * Sets export
     * 
     * @param value Value to set
     */
    public void setExport(Object value) {
        this.export = value;
    }

    /**
     * Sets indexpageids
     * 
     * @param value Value to set
     */
    public void setIndexpageids(Object value) {
        this.indexpageids = value;
    }

    /**
     * Sets gdrvuser
     * 
     * @param value Value to set
     */
    public void setGdrvuser(Object value) {
        this.gdrvuser = value;
    }

    /**
     * Sets gdrvprop
     * 
     * @param value Value to set
     */
    public void setGdrvprop(Object value) {
        this.gdrvprop = value;
    }

    /**
     * Sets gdrvcontentformat
     * 
     * @param value Value to set
     */
    public void setGdrvcontentformat(Object value) {
        this.gdrvcontentformat = value;
    }

    /**
     * Sets gdrvsection
     * 
     * @param value Value to set
     */
    public void setGdrvsection(Object value) {
        this.gdrvsection = value;
    }

    /**
     * Sets origin
     * 
     * @param value Value to set
     */
    public void setOrigin(Object value) {
        this.origin = value;
    }

    /**
     * Sets prop
     * 
     * @param value Value to set
     */
    public void setProp(Object value) {
        this.prop = value;
    }

    /**
     * Sets gdrvexpandtemplates
     * 
     * @param value Value to set
     */
    public void setGdrvexpandtemplates(Object value) {
        this.gdrvexpandtemplates = value;
    }

    /**
     * Sets list
     * 
     * @param value Value to set
     */
    public void setList(Object value) {
        this.list = value;
    }

    /**
     * Sets format
     * 
     * @param value Value to set
     */
    public void setFormat(Object value) {
        this.format = value;
    }

    /**
     * Sets centralauthtoken
     * 
     * @param value Value to set
     */
    public void setCentralauthtoken(Object value) {
        this.centralauthtoken = value;
    }

    /**
     * Sets gdrvdiffto
     * 
     * @param value Value to set
     */
    public void setGdrvdiffto(Object value) {
        this.gdrvdiffto = value;
    }

    /**
     * Sets gdrvdir
     * 
     * @param value Value to set
     */
    public void setGdrvdir(Object value) {
        this.gdrvdir = value;
    }

    /**
     * Sets gdrvdifftotext
     * 
     * @param value Value to set
     */
    public void setGdrvdifftotext(Object value) {
        this.gdrvdifftotext = value;
    }

    /**
     * Sets gdrvexcludeuser
     * 
     * @param value Value to set
     */
    public void setGdrvexcludeuser(Object value) {
        this.gdrvexcludeuser = value;
    }

    /**
     * Sets iwurl
     * 
     * @param value Value to set
     */
    public void setIwurl(Object value) {
        this.iwurl = value;
    }

    /**
     * Sets titles
     * 
     * @param value Value to set
     */
    public void setTitles(Object value) {
        this.titles = value;
    }

    /**
     * Sets gdrvend
     * 
     * @param value Value to set
     */
    public void setGdrvend(Object value) {
        this.gdrvend = value;
    }

    /**
     * Sets uselang
     * 
     * @param value Value to set
     */
    public void setUselang(Object value) {
        this.uselang = value;
    }

    /**
     * Sets gdrvtag
     * 
     * @param value Value to set
     */
    public void setGdrvtag(Object value) {
        this.gdrvtag = value;
    }

    /**
     * Sets requestid
     * 
     * @param value Value to set
     */
    public void setRequestid(Object value) {
        this.requestid = value;
    }

    /**
     * Sets gdrvgeneratexml
     * 
     * @param value Value to set
     */
    public void setGdrvgeneratexml(Object value) {
        this.gdrvgeneratexml = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedProp = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_propType").getGenericType(), null, prop));
            final String _transformedList = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_listType").getGenericType(), null, list));
            final String _transformedGdrvprop = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvpropType").getGenericType(), null, gdrvprop));
            final String _transformedGdrvlimit = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvlimitType").getGenericType(), null, gdrvlimit));
            final String _transformedGdrvexpandtemplates = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvexpandtemplatesType").getGenericType(), null, gdrvexpandtemplates));
            final String _transformedGdrvgeneratexml = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvgeneratexmlType").getGenericType(), null, gdrvgeneratexml));
            final String _transformedGdrvparse = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvparseType").getGenericType(), null, gdrvparse));
            final String _transformedGdrvsection = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvsectionType").getGenericType(), null, gdrvsection));
            final String _transformedGdrvdiffto = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvdifftoType").getGenericType(), null, gdrvdiffto));
            final String _transformedGdrvdifftotext = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvdifftotextType").getGenericType(), null, gdrvdifftotext));
            final String _transformedGdrvcontentformat = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvcontentformatType").getGenericType(), null, gdrvcontentformat));
            final String _transformedGdrvstart = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvstartType").getGenericType(), null, gdrvstart));
            final String _transformedGdrvend = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvendType").getGenericType(), null, gdrvend));
            final String _transformedGdrvdir = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvdirType").getGenericType(), null, gdrvdir));
            final String _transformedGdrvtag = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvtagType").getGenericType(), null, gdrvtag));
            final String _transformedGdrvuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvuserType").getGenericType(), null, gdrvuser));
            final String _transformedGdrvexcludeuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvexcludeuserType").getGenericType(), null, gdrvexcludeuser));
            final String _transformedGdrvcontinue = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_gdrvcontinueType").getGenericType(), null, gdrvcontinue));
            final String _transformedIndexpageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_indexpageidsType").getGenericType(), null, indexpageids));
            final String _transformedExport = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_exportType").getGenericType(), null, export));
            final String _transformedExportnowrap = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_exportnowrapType").getGenericType(), null, exportnowrap));
            final String _transformedIwurl = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_iwurlType").getGenericType(), null, iwurl));
            final String _transformedContinueId = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_continueIdType").getGenericType(), null, continueId));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGenerator = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_generatorType").getGenericType(), null, generator));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenDeletedRevisionsMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return Arrays.asList(((Class<? extends Exception> []) new Class[] {Exception.class }));
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((WikiPediaConnector) object).queryGenDeletedRevisions(_transformedFormat, _transformedProp, _transformedList, _transformedGdrvprop, _transformedGdrvlimit, _transformedGdrvexpandtemplates, _transformedGdrvgeneratexml, _transformedGdrvparse, _transformedGdrvsection, _transformedGdrvdiffto, _transformedGdrvdifftotext, _transformedGdrvcontentformat, _transformedGdrvstart, _transformedGdrvend, _transformedGdrvdir, _transformedGdrvtag, _transformedGdrvuser, _transformedGdrvexcludeuser, _transformedGdrvcontinue, _transformedIndexpageids, _transformedExport, _transformedExportnowrap, _transformedIwurl, _transformedContinueId, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGenerator, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(String.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at queryGenDeletedRevisions retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
