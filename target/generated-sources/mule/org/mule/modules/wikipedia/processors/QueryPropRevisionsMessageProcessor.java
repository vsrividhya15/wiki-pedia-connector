
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
 * QueryPropRevisionsMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#queryPropRevisions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class QueryPropRevisionsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object list;
    protected String _listType;
    protected Object meta;
    protected String _metaType;
    protected Object rvprop;
    protected String _rvpropType;
    protected Object rvlimit;
    protected String _rvlimitType;
    protected Object rvexpandtemplates;
    protected String _rvexpandtemplatesType;
    protected Object rvgeneratexml;
    protected String _rvgeneratexmlType;
    protected Object rvparse;
    protected String _rvparseType;
    protected Object rvsection;
    protected String _rvsectionType;
    protected Object rvdiffto;
    protected String _rvdifftoType;
    protected Object rvdifftotext;
    protected String _rvdifftotextType;
    protected Object rvcontentformat;
    protected String _rvcontentformatType;
    protected Object rvstartid;
    protected String _rvstartidType;
    protected Object rvendid;
    protected String _rvendidType;
    protected Object rvstart;
    protected String _rvstartType;
    protected Object rvend;
    protected String _rvendType;
    protected Object rvdir;
    protected String _rvdirType;
    protected Object rvuser;
    protected String _rvuserType;
    protected Object rvexcludeuser;
    protected String _rvexcludeuserType;
    protected Object rvtag;
    protected String _rvtagType;
    protected Object rvcontinue;
    protected String _rvcontinueType;
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

    public QueryPropRevisionsMessageProcessor(String operationName) {
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
     * Sets rvdir
     * 
     * @param value Value to set
     */
    public void setRvdir(Object value) {
        this.rvdir = value;
    }

    /**
     * Sets rvtag
     * 
     * @param value Value to set
     */
    public void setRvtag(Object value) {
        this.rvtag = value;
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
     * Sets rvparse
     * 
     * @param value Value to set
     */
    public void setRvparse(Object value) {
        this.rvparse = value;
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
     * Sets rvdiffto
     * 
     * @param value Value to set
     */
    public void setRvdiffto(Object value) {
        this.rvdiffto = value;
    }

    /**
     * Sets rvendid
     * 
     * @param value Value to set
     */
    public void setRvendid(Object value) {
        this.rvendid = value;
    }

    /**
     * Sets rvuser
     * 
     * @param value Value to set
     */
    public void setRvuser(Object value) {
        this.rvuser = value;
    }

    /**
     * Sets rvgeneratexml
     * 
     * @param value Value to set
     */
    public void setRvgeneratexml(Object value) {
        this.rvgeneratexml = value;
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
     * Sets meta
     * 
     * @param value Value to set
     */
    public void setMeta(Object value) {
        this.meta = value;
    }

    /**
     * Sets rvdifftotext
     * 
     * @param value Value to set
     */
    public void setRvdifftotext(Object value) {
        this.rvdifftotext = value;
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
     * Sets rvstartid
     * 
     * @param value Value to set
     */
    public void setRvstartid(Object value) {
        this.rvstartid = value;
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
     * Sets rvstart
     * 
     * @param value Value to set
     */
    public void setRvstart(Object value) {
        this.rvstart = value;
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
     * Sets rvend
     * 
     * @param value Value to set
     */
    public void setRvend(Object value) {
        this.rvend = value;
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
     * Sets rvcontentformat
     * 
     * @param value Value to set
     */
    public void setRvcontentformat(Object value) {
        this.rvcontentformat = value;
    }

    /**
     * Sets rvexcludeuser
     * 
     * @param value Value to set
     */
    public void setRvexcludeuser(Object value) {
        this.rvexcludeuser = value;
    }

    /**
     * Sets rvcontinue
     * 
     * @param value Value to set
     */
    public void setRvcontinue(Object value) {
        this.rvcontinue = value;
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
     * Sets rvexpandtemplates
     * 
     * @param value Value to set
     */
    public void setRvexpandtemplates(Object value) {
        this.rvexpandtemplates = value;
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
     * Sets rvprop
     * 
     * @param value Value to set
     */
    public void setRvprop(Object value) {
        this.rvprop = value;
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
     * Sets origin
     * 
     * @param value Value to set
     */
    public void setOrigin(Object value) {
        this.origin = value;
    }

    /**
     * Sets rvsection
     * 
     * @param value Value to set
     */
    public void setRvsection(Object value) {
        this.rvsection = value;
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
     * Sets rvlimit
     * 
     * @param value Value to set
     */
    public void setRvlimit(Object value) {
        this.rvlimit = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedList = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_listType").getGenericType(), null, list));
            final String _transformedMeta = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_metaType").getGenericType(), null, meta));
            final String _transformedRvprop = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvpropType").getGenericType(), null, rvprop));
            final String _transformedRvlimit = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvlimitType").getGenericType(), null, rvlimit));
            final String _transformedRvexpandtemplates = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvexpandtemplatesType").getGenericType(), null, rvexpandtemplates));
            final String _transformedRvgeneratexml = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvgeneratexmlType").getGenericType(), null, rvgeneratexml));
            final String _transformedRvparse = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvparseType").getGenericType(), null, rvparse));
            final String _transformedRvsection = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvsectionType").getGenericType(), null, rvsection));
            final String _transformedRvdiffto = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvdifftoType").getGenericType(), null, rvdiffto));
            final String _transformedRvdifftotext = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvdifftotextType").getGenericType(), null, rvdifftotext));
            final String _transformedRvcontentformat = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvcontentformatType").getGenericType(), null, rvcontentformat));
            final String _transformedRvstartid = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvstartidType").getGenericType(), null, rvstartid));
            final String _transformedRvendid = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvendidType").getGenericType(), null, rvendid));
            final String _transformedRvstart = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvstartType").getGenericType(), null, rvstart));
            final String _transformedRvend = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvendType").getGenericType(), null, rvend));
            final String _transformedRvdir = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvdirType").getGenericType(), null, rvdir));
            final String _transformedRvuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvuserType").getGenericType(), null, rvuser));
            final String _transformedRvexcludeuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvexcludeuserType").getGenericType(), null, rvexcludeuser));
            final String _transformedRvtag = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvtagType").getGenericType(), null, rvtag));
            final String _transformedRvcontinue = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_rvcontinueType").getGenericType(), null, rvcontinue));
            final String _transformedIndexpageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_indexpageidsType").getGenericType(), null, indexpageids));
            final String _transformedExport = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_exportType").getGenericType(), null, export));
            final String _transformedExportnowrap = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_exportnowrapType").getGenericType(), null, exportnowrap));
            final String _transformedIwurl = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_iwurlType").getGenericType(), null, iwurl));
            final String _transformedContinueId = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_continueIdType").getGenericType(), null, continueId));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGenerator = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_generatorType").getGenericType(), null, generator));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, QueryPropRevisionsMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).queryPropRevisions(_transformedFormat, _transformedList, _transformedMeta, _transformedRvprop, _transformedRvlimit, _transformedRvexpandtemplates, _transformedRvgeneratexml, _transformedRvparse, _transformedRvsection, _transformedRvdiffto, _transformedRvdifftotext, _transformedRvcontentformat, _transformedRvstartid, _transformedRvendid, _transformedRvstart, _transformedRvend, _transformedRvdir, _transformedRvuser, _transformedRvexcludeuser, _transformedRvtag, _transformedRvcontinue, _transformedIndexpageids, _transformedExport, _transformedExportnowrap, _transformedIwurl, _transformedContinueId, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGenerator, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at queryPropRevisions retrieving was successful but result is null");
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
