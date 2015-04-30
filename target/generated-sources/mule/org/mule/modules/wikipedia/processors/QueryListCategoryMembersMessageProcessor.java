
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
 * QueryListCategoryMembersMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#queryListCategoryMembers(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class QueryListCategoryMembersMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object prop;
    protected String _propType;
    protected Object meta;
    protected String _metaType;
    protected Object cmtitle;
    protected String _cmtitleType;
    protected Object cmpageid;
    protected String _cmpageidType;
    protected Object cmprop;
    protected String _cmpropType;
    protected Object cmnamespace;
    protected String _cmnamespaceType;
    protected Object cmtype;
    protected String _cmtypeType;
    protected Object cmcontinue;
    protected String _cmcontinueType;
    protected Object cmlimit;
    protected String _cmlimitType;
    protected Object cmsort;
    protected String _cmsortType;
    protected Object cmdir;
    protected String _cmdirType;
    protected Object cmstart;
    protected String _cmstartType;
    protected Object cmend;
    protected String _cmendType;
    protected Object cmstarthexsortkey;
    protected String _cmstarthexsortkeyType;
    protected Object cmendhexsortkey;
    protected String _cmendhexsortkeyType;
    protected Object cmstartsortkeyprefix;
    protected String _cmstartsortkeyprefixType;
    protected Object cmendsortkeyprefix;
    protected String _cmendsortkeyprefixType;
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

    public QueryListCategoryMembersMessageProcessor(String operationName) {
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
     * Sets cmcontinue
     * 
     * @param value Value to set
     */
    public void setCmcontinue(Object value) {
        this.cmcontinue = value;
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
     * Sets cmlimit
     * 
     * @param value Value to set
     */
    public void setCmlimit(Object value) {
        this.cmlimit = value;
    }

    /**
     * Sets cmend
     * 
     * @param value Value to set
     */
    public void setCmend(Object value) {
        this.cmend = value;
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
     * Sets cmtype
     * 
     * @param value Value to set
     */
    public void setCmtype(Object value) {
        this.cmtype = value;
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
     * Sets smaxage
     * 
     * @param value Value to set
     */
    public void setSmaxage(Object value) {
        this.smaxage = value;
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
     * Sets cmnamespace
     * 
     * @param value Value to set
     */
    public void setCmnamespace(Object value) {
        this.cmnamespace = value;
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
     * Sets cmstarthexsortkey
     * 
     * @param value Value to set
     */
    public void setCmstarthexsortkey(Object value) {
        this.cmstarthexsortkey = value;
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
     * Sets format
     * 
     * @param value Value to set
     */
    public void setFormat(Object value) {
        this.format = value;
    }

    /**
     * Sets cmendsortkeyprefix
     * 
     * @param value Value to set
     */
    public void setCmendsortkeyprefix(Object value) {
        this.cmendsortkeyprefix = value;
    }

    /**
     * Sets cmtitle
     * 
     * @param value Value to set
     */
    public void setCmtitle(Object value) {
        this.cmtitle = value;
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
     * Sets cmsort
     * 
     * @param value Value to set
     */
    public void setCmsort(Object value) {
        this.cmsort = value;
    }

    /**
     * Sets cmstartsortkeyprefix
     * 
     * @param value Value to set
     */
    public void setCmstartsortkeyprefix(Object value) {
        this.cmstartsortkeyprefix = value;
    }

    /**
     * Sets cmpageid
     * 
     * @param value Value to set
     */
    public void setCmpageid(Object value) {
        this.cmpageid = value;
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
     * Sets cmprop
     * 
     * @param value Value to set
     */
    public void setCmprop(Object value) {
        this.cmprop = value;
    }

    /**
     * Sets cmstart
     * 
     * @param value Value to set
     */
    public void setCmstart(Object value) {
        this.cmstart = value;
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
     * Sets cmdir
     * 
     * @param value Value to set
     */
    public void setCmdir(Object value) {
        this.cmdir = value;
    }

    /**
     * Sets cmendhexsortkey
     * 
     * @param value Value to set
     */
    public void setCmendhexsortkey(Object value) {
        this.cmendhexsortkey = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedProp = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_propType").getGenericType(), null, prop));
            final String _transformedMeta = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_metaType").getGenericType(), null, meta));
            final String _transformedCmtitle = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmtitleType").getGenericType(), null, cmtitle));
            final String _transformedCmpageid = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmpageidType").getGenericType(), null, cmpageid));
            final String _transformedCmprop = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmpropType").getGenericType(), null, cmprop));
            final String _transformedCmnamespace = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmnamespaceType").getGenericType(), null, cmnamespace));
            final String _transformedCmtype = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmtypeType").getGenericType(), null, cmtype));
            final String _transformedCmcontinue = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmcontinueType").getGenericType(), null, cmcontinue));
            final String _transformedCmlimit = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmlimitType").getGenericType(), null, cmlimit));
            final String _transformedCmsort = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmsortType").getGenericType(), null, cmsort));
            final String _transformedCmdir = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmdirType").getGenericType(), null, cmdir));
            final String _transformedCmstart = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmstartType").getGenericType(), null, cmstart));
            final String _transformedCmend = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmendType").getGenericType(), null, cmend));
            final String _transformedCmstarthexsortkey = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmstarthexsortkeyType").getGenericType(), null, cmstarthexsortkey));
            final String _transformedCmendhexsortkey = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmendhexsortkeyType").getGenericType(), null, cmendhexsortkey));
            final String _transformedCmstartsortkeyprefix = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmstartsortkeyprefixType").getGenericType(), null, cmstartsortkeyprefix));
            final String _transformedCmendsortkeyprefix = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_cmendsortkeyprefixType").getGenericType(), null, cmendsortkeyprefix));
            final String _transformedIndexpageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_indexpageidsType").getGenericType(), null, indexpageids));
            final String _transformedExport = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_exportType").getGenericType(), null, export));
            final String _transformedExportnowrap = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_exportnowrapType").getGenericType(), null, exportnowrap));
            final String _transformedIwurl = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_iwurlType").getGenericType(), null, iwurl));
            final String _transformedContinueId = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_continueIdType").getGenericType(), null, continueId));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGenerator = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_generatorType").getGenericType(), null, generator));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, QueryListCategoryMembersMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).queryListCategoryMembers(_transformedFormat, _transformedProp, _transformedMeta, _transformedCmtitle, _transformedCmpageid, _transformedCmprop, _transformedCmnamespace, _transformedCmtype, _transformedCmcontinue, _transformedCmlimit, _transformedCmsort, _transformedCmdir, _transformedCmstart, _transformedCmend, _transformedCmstarthexsortkey, _transformedCmendhexsortkey, _transformedCmstartsortkeyprefix, _transformedCmendsortkeyprefix, _transformedIndexpageids, _transformedExport, _transformedExportnowrap, _transformedIwurl, _transformedContinueId, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGenerator, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at queryListCategoryMembers retrieving was successful but result is null");
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
