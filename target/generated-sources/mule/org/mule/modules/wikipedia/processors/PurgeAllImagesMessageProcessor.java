
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
 * PurgeAllImagesMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#purgeAllImages(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class PurgeAllImagesMessageProcessor
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
    protected Object gaisort;
    protected String _gaisortType;
    protected Object gaidir;
    protected String _gaidirType;
    protected Object gaifrom;
    protected String _gaifromType;
    protected Object gaito;
    protected String _gaitoType;
    protected Object gaicontinue;
    protected String _gaicontinueType;
    protected Object gaistart;
    protected String _gaistartType;
    protected Object gaiend;
    protected String _gaiendType;
    protected Object gaiprop;
    protected String _gaipropType;
    protected Object gaiprefix;
    protected String _gaiprefixType;
    protected Object gaiminsize;
    protected String _gaiminsizeType;
    protected Object gaimaxsize;
    protected String _gaimaxsizeType;
    protected Object gaisha1;
    protected String _gaisha1Type;
    protected Object gaisha1base36;
    protected String _gaisha1base36Type;
    protected Object gaiuser;
    protected String _gaiuserType;
    protected Object gaifilterbots;
    protected String _gaifilterbotsType;
    protected Object gaimime;
    protected String _gaimimeType;
    protected Object gailimit;
    protected String _gailimitType;
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

    public PurgeAllImagesMessageProcessor(String operationName) {
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
     * Sets gaiminsize
     * 
     * @param value Value to set
     */
    public void setGaiminsize(Object value) {
        this.gaiminsize = value;
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
     * Sets gaiend
     * 
     * @param value Value to set
     */
    public void setGaiend(Object value) {
        this.gaiend = value;
    }

    /**
     * Sets gaidir
     * 
     * @param value Value to set
     */
    public void setGaidir(Object value) {
        this.gaidir = value;
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
     * Sets gaifrom
     * 
     * @param value Value to set
     */
    public void setGaifrom(Object value) {
        this.gaifrom = value;
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
     * Sets gaifilterbots
     * 
     * @param value Value to set
     */
    public void setGaifilterbots(Object value) {
        this.gaifilterbots = value;
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
     * Sets converttitles
     * 
     * @param value Value to set
     */
    public void setConverttitles(Object value) {
        this.converttitles = value;
    }

    /**
     * Sets gaisha1
     * 
     * @param value Value to set
     */
    public void setGaisha1(Object value) {
        this.gaisha1 = value;
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
     * Sets gailimit
     * 
     * @param value Value to set
     */
    public void setGailimit(Object value) {
        this.gailimit = value;
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
     * Sets gaiprefix
     * 
     * @param value Value to set
     */
    public void setGaiprefix(Object value) {
        this.gaiprefix = value;
    }

    /**
     * Sets gaistart
     * 
     * @param value Value to set
     */
    public void setGaistart(Object value) {
        this.gaistart = value;
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
     * Sets gaisha1base36
     * 
     * @param value Value to set
     */
    public void setGaisha1base36(Object value) {
        this.gaisha1base36 = value;
    }

    /**
     * Sets gaiuser
     * 
     * @param value Value to set
     */
    public void setGaiuser(Object value) {
        this.gaiuser = value;
    }

    /**
     * Sets gaito
     * 
     * @param value Value to set
     */
    public void setGaito(Object value) {
        this.gaito = value;
    }

    /**
     * Sets gaicontinue
     * 
     * @param value Value to set
     */
    public void setGaicontinue(Object value) {
        this.gaicontinue = value;
    }

    /**
     * Sets gaiprop
     * 
     * @param value Value to set
     */
    public void setGaiprop(Object value) {
        this.gaiprop = value;
    }

    /**
     * Sets gaimaxsize
     * 
     * @param value Value to set
     */
    public void setGaimaxsize(Object value) {
        this.gaimaxsize = value;
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
     * Sets gaimime
     * 
     * @param value Value to set
     */
    public void setGaimime(Object value) {
        this.gaimime = value;
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
     * Sets gaisort
     * 
     * @param value Value to set
     */
    public void setGaisort(Object value) {
        this.gaisort = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedForcelinkupdate = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_forcelinkupdateType").getGenericType(), null, forcelinkupdate));
            final String _transformedForcerecursivelinkupdate = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_forcerecursivelinkupdateType").getGenericType(), null, forcerecursivelinkupdate));
            final String _transformedContinueStr = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_continueStrType").getGenericType(), null, continueStr));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGaisort = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaisortType").getGenericType(), null, gaisort));
            final String _transformedGaidir = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaidirType").getGenericType(), null, gaidir));
            final String _transformedGaifrom = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaifromType").getGenericType(), null, gaifrom));
            final String _transformedGaito = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaitoType").getGenericType(), null, gaito));
            final String _transformedGaicontinue = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaicontinueType").getGenericType(), null, gaicontinue));
            final String _transformedGaistart = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaistartType").getGenericType(), null, gaistart));
            final String _transformedGaiend = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaiendType").getGenericType(), null, gaiend));
            final String _transformedGaiprop = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaipropType").getGenericType(), null, gaiprop));
            final String _transformedGaiprefix = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaiprefixType").getGenericType(), null, gaiprefix));
            final String _transformedGaiminsize = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaiminsizeType").getGenericType(), null, gaiminsize));
            final String _transformedGaimaxsize = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaimaxsizeType").getGenericType(), null, gaimaxsize));
            final String _transformedGaisha1 = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaisha1Type").getGenericType(), null, gaisha1));
            final String _transformedGaisha1base36 = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaisha1base36Type").getGenericType(), null, gaisha1base36));
            final String _transformedGaiuser = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaiuserType").getGenericType(), null, gaiuser));
            final String _transformedGaifilterbots = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaifilterbotsType").getGenericType(), null, gaifilterbots));
            final String _transformedGaimime = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gaimimeType").getGenericType(), null, gaimime));
            final String _transformedGailimit = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_gailimitType").getGenericType(), null, gailimit));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, PurgeAllImagesMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).purgeAllImages(_transformedFormat, _transformedForcelinkupdate, _transformedForcerecursivelinkupdate, _transformedContinueStr, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGaisort, _transformedGaidir, _transformedGaifrom, _transformedGaito, _transformedGaicontinue, _transformedGaistart, _transformedGaiend, _transformedGaiprop, _transformedGaiprefix, _transformedGaiminsize, _transformedGaimaxsize, _transformedGaisha1, _transformedGaisha1base36, _transformedGaiuser, _transformedGaifilterbots, _transformedGaimime, _transformedGailimit, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at purgeAllImages retrieving was successful but result is null");
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
