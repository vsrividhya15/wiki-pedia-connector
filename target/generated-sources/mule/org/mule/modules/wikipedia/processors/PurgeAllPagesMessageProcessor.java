
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
 * PurgeAllPagesMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#purgeAllPages(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class PurgeAllPagesMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object forcelinkupdate;
    protected String _forcelinkupdateType;
    protected Object forcerecursivelinkupdate;
    protected String _forcerecursivelinkupdateType;
    protected Object continueStr;
    protected String _continueStrType;
    protected Object titles;
    protected String _titlesType;
    protected Object pageids;
    protected String _pageidsType;
    protected Object revids;
    protected String _revidsType;
    protected Object gapcontinue;
    protected String _gapcontinueType;
    protected Object gapfrom;
    protected String _gapfromType;
    protected Object gapto;
    protected String _gaptoType;
    protected Object gapprefix;
    protected String _gapprefixType;
    protected Object gapnamespace;
    protected String _gapnamespaceType;
    protected Object gapfilterredir;
    protected String _gapfilterredirType;
    protected Object gapminsize;
    protected String _gapminsizeType;
    protected Object gapmaxsize;
    protected String _gapmaxsizeType;
    protected Object gapprtype;
    protected String _gapprtypeType;
    protected Object gapprlevel;
    protected String _gapprlevelType;
    protected Object gapprfiltercascade;
    protected String _gapprfiltercascadeType;
    protected Object gaplimit;
    protected String _gaplimitType;
    protected Object gapdir;
    protected String _gapdirType;
    protected Object gapfilterlanglinks;
    protected String _gapfilterlanglinksType;
    protected Object gapprexpiry;
    protected String _gapprexpiryType;
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

    public PurgeAllPagesMessageProcessor(String operationName) {
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
     * Sets gapnamespace
     * 
     * @param value Value to set
     */
    public void setGapnamespace(Object value) {
        this.gapnamespace = value;
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
     * Sets gapfilterlanglinks
     * 
     * @param value Value to set
     */
    public void setGapfilterlanglinks(Object value) {
        this.gapfilterlanglinks = value;
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
     * Sets gapprfiltercascade
     * 
     * @param value Value to set
     */
    public void setGapprfiltercascade(Object value) {
        this.gapprfiltercascade = value;
    }

    /**
     * Sets gaplimit
     * 
     * @param value Value to set
     */
    public void setGaplimit(Object value) {
        this.gaplimit = value;
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
     * Sets continueStr
     * 
     * @param value Value to set
     */
    public void setContinueStr(Object value) {
        this.continueStr = value;
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
     * Sets forcerecursivelinkupdate
     * 
     * @param value Value to set
     */
    public void setForcerecursivelinkupdate(Object value) {
        this.forcerecursivelinkupdate = value;
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
     * Sets gapprefix
     * 
     * @param value Value to set
     */
    public void setGapprefix(Object value) {
        this.gapprefix = value;
    }

    /**
     * Sets gapprtype
     * 
     * @param value Value to set
     */
    public void setGapprtype(Object value) {
        this.gapprtype = value;
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
     * Sets gapminsize
     * 
     * @param value Value to set
     */
    public void setGapminsize(Object value) {
        this.gapminsize = value;
    }

    /**
     * Sets gapdir
     * 
     * @param value Value to set
     */
    public void setGapdir(Object value) {
        this.gapdir = value;
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
     * Sets gapfilterredir
     * 
     * @param value Value to set
     */
    public void setGapfilterredir(Object value) {
        this.gapfilterredir = value;
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
     * Sets forcelinkupdate
     * 
     * @param value Value to set
     */
    public void setForcelinkupdate(Object value) {
        this.forcelinkupdate = value;
    }

    /**
     * Sets gapprlevel
     * 
     * @param value Value to set
     */
    public void setGapprlevel(Object value) {
        this.gapprlevel = value;
    }

    /**
     * Sets gapprexpiry
     * 
     * @param value Value to set
     */
    public void setGapprexpiry(Object value) {
        this.gapprexpiry = value;
    }

    /**
     * Sets gapcontinue
     * 
     * @param value Value to set
     */
    public void setGapcontinue(Object value) {
        this.gapcontinue = value;
    }

    /**
     * Sets gapmaxsize
     * 
     * @param value Value to set
     */
    public void setGapmaxsize(Object value) {
        this.gapmaxsize = value;
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
     * Sets gapto
     * 
     * @param value Value to set
     */
    public void setGapto(Object value) {
        this.gapto = value;
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
     * Sets gapfrom
     * 
     * @param value Value to set
     */
    public void setGapfrom(Object value) {
        this.gapfrom = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedForcelinkupdate = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_forcelinkupdateType").getGenericType(), null, forcelinkupdate));
            final String _transformedForcerecursivelinkupdate = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_forcerecursivelinkupdateType").getGenericType(), null, forcerecursivelinkupdate));
            final String _transformedContinueStr = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_continueStrType").getGenericType(), null, continueStr));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGapcontinue = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapcontinueType").getGenericType(), null, gapcontinue));
            final String _transformedGapfrom = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapfromType").getGenericType(), null, gapfrom));
            final String _transformedGapto = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gaptoType").getGenericType(), null, gapto));
            final String _transformedGapprefix = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapprefixType").getGenericType(), null, gapprefix));
            final String _transformedGapnamespace = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapnamespaceType").getGenericType(), null, gapnamespace));
            final String _transformedGapfilterredir = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapfilterredirType").getGenericType(), null, gapfilterredir));
            final String _transformedGapminsize = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapminsizeType").getGenericType(), null, gapminsize));
            final String _transformedGapmaxsize = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapmaxsizeType").getGenericType(), null, gapmaxsize));
            final String _transformedGapprtype = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapprtypeType").getGenericType(), null, gapprtype));
            final String _transformedGapprlevel = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapprlevelType").getGenericType(), null, gapprlevel));
            final String _transformedGapprfiltercascade = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapprfiltercascadeType").getGenericType(), null, gapprfiltercascade));
            final String _transformedGaplimit = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gaplimitType").getGenericType(), null, gaplimit));
            final String _transformedGapdir = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapdirType").getGenericType(), null, gapdir));
            final String _transformedGapfilterlanglinks = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapfilterlanglinksType").getGenericType(), null, gapfilterlanglinks));
            final String _transformedGapprexpiry = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_gapprexpiryType").getGenericType(), null, gapprexpiry));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllPagesMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).purgeAllPages(_transformedFormat, _transformedForcelinkupdate, _transformedForcerecursivelinkupdate, _transformedContinueStr, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGapcontinue, _transformedGapfrom, _transformedGapto, _transformedGapprefix, _transformedGapnamespace, _transformedGapfilterredir, _transformedGapminsize, _transformedGapmaxsize, _transformedGapprtype, _transformedGapprlevel, _transformedGapprfiltercascade, _transformedGaplimit, _transformedGapdir, _transformedGapfilterlanglinks, _transformedGapprexpiry, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at purgeAllPages retrieving was successful but result is null");
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