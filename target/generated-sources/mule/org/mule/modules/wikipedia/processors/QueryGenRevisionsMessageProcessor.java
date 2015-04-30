
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
 * QueryGenRevisionsMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#queryGenRevisions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class QueryGenRevisionsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object prop;
    protected String _propType;
    protected Object list;
    protected String _listType;
    protected Object grvprop;
    protected String _grvpropType;
    protected Object grvlimit;
    protected String _grvlimitType;
    protected Object grvexpandtemplates;
    protected String _grvexpandtemplatesType;
    protected Object grvgeneratexml;
    protected String _grvgeneratexmlType;
    protected Object grvparse;
    protected String _grvparseType;
    protected Object grvsection;
    protected String _grvsectionType;
    protected Object grvdiffto;
    protected String _grvdifftoType;
    protected Object grvdifftotext;
    protected String _grvdifftotextType;
    protected Object grvcontentformat;
    protected String _grvcontentformatType;
    protected Object grvstartid;
    protected String _grvstartidType;
    protected Object grvendid;
    protected String _grvendidType;
    protected Object grvstart;
    protected String _grvstartType;
    protected Object grvend;
    protected String _grvendType;
    protected Object grvdir;
    protected String _grvdirType;
    protected Object grvuser;
    protected String _grvuserType;
    protected Object grvexcludeuser;
    protected String _grvexcludeuserType;
    protected Object grvtag;
    protected String _grvtagType;
    protected Object grvcontinue;
    protected String _grvcontinueType;
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

    public QueryGenRevisionsMessageProcessor(String operationName) {
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
     * Sets grvexcludeuser
     * 
     * @param value Value to set
     */
    public void setGrvexcludeuser(Object value) {
        this.grvexcludeuser = value;
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
     * Sets grvparse
     * 
     * @param value Value to set
     */
    public void setGrvparse(Object value) {
        this.grvparse = value;
    }

    /**
     * Sets grvstart
     * 
     * @param value Value to set
     */
    public void setGrvstart(Object value) {
        this.grvstart = value;
    }

    /**
     * Sets grvend
     * 
     * @param value Value to set
     */
    public void setGrvend(Object value) {
        this.grvend = value;
    }

    /**
     * Sets grvdifftotext
     * 
     * @param value Value to set
     */
    public void setGrvdifftotext(Object value) {
        this.grvdifftotext = value;
    }

    /**
     * Sets grvuser
     * 
     * @param value Value to set
     */
    public void setGrvuser(Object value) {
        this.grvuser = value;
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
     * Sets grvgeneratexml
     * 
     * @param value Value to set
     */
    public void setGrvgeneratexml(Object value) {
        this.grvgeneratexml = value;
    }

    /**
     * Sets grvcontentformat
     * 
     * @param value Value to set
     */
    public void setGrvcontentformat(Object value) {
        this.grvcontentformat = value;
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
     * Sets grvcontinue
     * 
     * @param value Value to set
     */
    public void setGrvcontinue(Object value) {
        this.grvcontinue = value;
    }

    /**
     * Sets grvendid
     * 
     * @param value Value to set
     */
    public void setGrvendid(Object value) {
        this.grvendid = value;
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
     * Sets generator
     * 
     * @param value Value to set
     */
    public void setGenerator(Object value) {
        this.generator = value;
    }

    /**
     * Sets grvprop
     * 
     * @param value Value to set
     */
    public void setGrvprop(Object value) {
        this.grvprop = value;
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
     * Sets grvdiffto
     * 
     * @param value Value to set
     */
    public void setGrvdiffto(Object value) {
        this.grvdiffto = value;
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
     * Sets grvstartid
     * 
     * @param value Value to set
     */
    public void setGrvstartid(Object value) {
        this.grvstartid = value;
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
     * Sets grvexpandtemplates
     * 
     * @param value Value to set
     */
    public void setGrvexpandtemplates(Object value) {
        this.grvexpandtemplates = value;
    }

    /**
     * Sets grvlimit
     * 
     * @param value Value to set
     */
    public void setGrvlimit(Object value) {
        this.grvlimit = value;
    }

    /**
     * Sets grvdir
     * 
     * @param value Value to set
     */
    public void setGrvdir(Object value) {
        this.grvdir = value;
    }

    /**
     * Sets grvsection
     * 
     * @param value Value to set
     */
    public void setGrvsection(Object value) {
        this.grvsection = value;
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
     * Sets uselang
     * 
     * @param value Value to set
     */
    public void setUselang(Object value) {
        this.uselang = value;
    }

    /**
     * Sets grvtag
     * 
     * @param value Value to set
     */
    public void setGrvtag(Object value) {
        this.grvtag = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedProp = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_propType").getGenericType(), null, prop));
            final String _transformedList = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_listType").getGenericType(), null, list));
            final String _transformedGrvprop = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvpropType").getGenericType(), null, grvprop));
            final String _transformedGrvlimit = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvlimitType").getGenericType(), null, grvlimit));
            final String _transformedGrvexpandtemplates = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvexpandtemplatesType").getGenericType(), null, grvexpandtemplates));
            final String _transformedGrvgeneratexml = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvgeneratexmlType").getGenericType(), null, grvgeneratexml));
            final String _transformedGrvparse = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvparseType").getGenericType(), null, grvparse));
            final String _transformedGrvsection = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvsectionType").getGenericType(), null, grvsection));
            final String _transformedGrvdiffto = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvdifftoType").getGenericType(), null, grvdiffto));
            final String _transformedGrvdifftotext = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvdifftotextType").getGenericType(), null, grvdifftotext));
            final String _transformedGrvcontentformat = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvcontentformatType").getGenericType(), null, grvcontentformat));
            final String _transformedGrvstartid = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvstartidType").getGenericType(), null, grvstartid));
            final String _transformedGrvendid = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvendidType").getGenericType(), null, grvendid));
            final String _transformedGrvstart = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvstartType").getGenericType(), null, grvstart));
            final String _transformedGrvend = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvendType").getGenericType(), null, grvend));
            final String _transformedGrvdir = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvdirType").getGenericType(), null, grvdir));
            final String _transformedGrvuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvuserType").getGenericType(), null, grvuser));
            final String _transformedGrvexcludeuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvexcludeuserType").getGenericType(), null, grvexcludeuser));
            final String _transformedGrvtag = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvtagType").getGenericType(), null, grvtag));
            final String _transformedGrvcontinue = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_grvcontinueType").getGenericType(), null, grvcontinue));
            final String _transformedIndexpageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_indexpageidsType").getGenericType(), null, indexpageids));
            final String _transformedExport = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_exportType").getGenericType(), null, export));
            final String _transformedExportnowrap = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_exportnowrapType").getGenericType(), null, exportnowrap));
            final String _transformedIwurl = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_iwurlType").getGenericType(), null, iwurl));
            final String _transformedContinueId = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_continueIdType").getGenericType(), null, continueId));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGenerator = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_generatorType").getGenericType(), null, generator));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, QueryGenRevisionsMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).queryGenRevisions(_transformedFormat, _transformedProp, _transformedList, _transformedGrvprop, _transformedGrvlimit, _transformedGrvexpandtemplates, _transformedGrvgeneratexml, _transformedGrvparse, _transformedGrvsection, _transformedGrvdiffto, _transformedGrvdifftotext, _transformedGrvcontentformat, _transformedGrvstartid, _transformedGrvendid, _transformedGrvstart, _transformedGrvend, _transformedGrvdir, _transformedGrvuser, _transformedGrvexcludeuser, _transformedGrvtag, _transformedGrvcontinue, _transformedIndexpageids, _transformedExport, _transformedExportnowrap, _transformedIwurl, _transformedContinueId, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGenerator, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at queryGenRevisions retrieving was successful but result is null");
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
