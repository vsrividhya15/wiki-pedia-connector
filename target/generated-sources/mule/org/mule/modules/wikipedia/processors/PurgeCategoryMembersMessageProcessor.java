
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
 * PurgeCategoryMembersMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#purgeCategoryMembers(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class PurgeCategoryMembersMessageProcessor
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
    protected Object gcmtitle;
    protected String _gcmtitleType;
    protected Object gcmpageid;
    protected String _gcmpageidType;
    protected Object gcmprop;
    protected String _gcmpropType;
    protected Object gcmnamespace;
    protected String _gcmnamespaceType;
    protected Object gcmtype;
    protected String _gcmtypeType;
    protected Object gcmcontinue;
    protected String _gcmcontinueType;
    protected Object gcmlimit;
    protected String _gcmlimitType;
    protected Object gcmsort;
    protected String _gcmsortType;
    protected Object gcmdir;
    protected String _gcmdirType;
    protected Object gcmstart;
    protected String _gcmstartType;
    protected Object gcmend;
    protected String _gcmendType;
    protected Object gcmstarthexsortkey;
    protected String _gcmstarthexsortkeyType;
    protected Object gcmendhexsortkey;
    protected String _gcmendhexsortkeyType;
    protected Object gcmstartsortkeyprefix;
    protected String _gcmstartsortkeyprefixType;
    protected Object gcmendsortkeyprefix;
    protected String _gcmendsortkeyprefixType;
    protected Object redirects;
    protected String _redirectsType;
    protected Object converttitles;
    protected String _converttitlesType;

    public PurgeCategoryMembersMessageProcessor(String operationName) {
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
     * Sets gcmend
     * 
     * @param value Value to set
     */
    public void setGcmend(Object value) {
        this.gcmend = value;
    }

    /**
     * Sets gcmlimit
     * 
     * @param value Value to set
     */
    public void setGcmlimit(Object value) {
        this.gcmlimit = value;
    }

    /**
     * Sets gcmprop
     * 
     * @param value Value to set
     */
    public void setGcmprop(Object value) {
        this.gcmprop = value;
    }

    /**
     * Sets gcmpageid
     * 
     * @param value Value to set
     */
    public void setGcmpageid(Object value) {
        this.gcmpageid = value;
    }

    /**
     * Sets gcmtype
     * 
     * @param value Value to set
     */
    public void setGcmtype(Object value) {
        this.gcmtype = value;
    }

    /**
     * Sets gcmstarthexsortkey
     * 
     * @param value Value to set
     */
    public void setGcmstarthexsortkey(Object value) {
        this.gcmstarthexsortkey = value;
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
     * Sets forcelinkupdate
     * 
     * @param value Value to set
     */
    public void setForcelinkupdate(Object value) {
        this.forcelinkupdate = value;
    }

    /**
     * Sets gcmendhexsortkey
     * 
     * @param value Value to set
     */
    public void setGcmendhexsortkey(Object value) {
        this.gcmendhexsortkey = value;
    }

    /**
     * Sets gcmstartsortkeyprefix
     * 
     * @param value Value to set
     */
    public void setGcmstartsortkeyprefix(Object value) {
        this.gcmstartsortkeyprefix = value;
    }

    /**
     * Sets gcmcontinue
     * 
     * @param value Value to set
     */
    public void setGcmcontinue(Object value) {
        this.gcmcontinue = value;
    }

    /**
     * Sets gcmstart
     * 
     * @param value Value to set
     */
    public void setGcmstart(Object value) {
        this.gcmstart = value;
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
     * Sets revids
     * 
     * @param value Value to set
     */
    public void setRevids(Object value) {
        this.revids = value;
    }

    /**
     * Sets gcmtitle
     * 
     * @param value Value to set
     */
    public void setGcmtitle(Object value) {
        this.gcmtitle = value;
    }

    /**
     * Sets gcmsort
     * 
     * @param value Value to set
     */
    public void setGcmsort(Object value) {
        this.gcmsort = value;
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
     * Sets titles
     * 
     * @param value Value to set
     */
    public void setTitles(Object value) {
        this.titles = value;
    }

    /**
     * Sets gcmdir
     * 
     * @param value Value to set
     */
    public void setGcmdir(Object value) {
        this.gcmdir = value;
    }

    /**
     * Sets gcmnamespace
     * 
     * @param value Value to set
     */
    public void setGcmnamespace(Object value) {
        this.gcmnamespace = value;
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
     * Sets gcmendsortkeyprefix
     * 
     * @param value Value to set
     */
    public void setGcmendsortkeyprefix(Object value) {
        this.gcmendsortkeyprefix = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedForcelinkupdate = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_forcelinkupdateType").getGenericType(), null, forcelinkupdate));
            final String _transformedForcerecursivelinkupdate = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_forcerecursivelinkupdateType").getGenericType(), null, forcerecursivelinkupdate));
            final String _transformedContinueStr = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_continueStrType").getGenericType(), null, continueStr));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGcmtitle = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmtitleType").getGenericType(), null, gcmtitle));
            final String _transformedGcmpageid = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmpageidType").getGenericType(), null, gcmpageid));
            final String _transformedGcmprop = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmpropType").getGenericType(), null, gcmprop));
            final String _transformedGcmnamespace = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmnamespaceType").getGenericType(), null, gcmnamespace));
            final String _transformedGcmtype = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmtypeType").getGenericType(), null, gcmtype));
            final String _transformedGcmcontinue = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmcontinueType").getGenericType(), null, gcmcontinue));
            final String _transformedGcmlimit = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmlimitType").getGenericType(), null, gcmlimit));
            final String _transformedGcmsort = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmsortType").getGenericType(), null, gcmsort));
            final String _transformedGcmdir = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmdirType").getGenericType(), null, gcmdir));
            final String _transformedGcmstart = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmstartType").getGenericType(), null, gcmstart));
            final String _transformedGcmend = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmendType").getGenericType(), null, gcmend));
            final String _transformedGcmstarthexsortkey = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmstarthexsortkeyType").getGenericType(), null, gcmstarthexsortkey));
            final String _transformedGcmendhexsortkey = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmendhexsortkeyType").getGenericType(), null, gcmendhexsortkey));
            final String _transformedGcmstartsortkeyprefix = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmstartsortkeyprefixType").getGenericType(), null, gcmstartsortkeyprefix));
            final String _transformedGcmendsortkeyprefix = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_gcmendsortkeyprefixType").getGenericType(), null, gcmendsortkeyprefix));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, PurgeCategoryMembersMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
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
                    return ((WikiPediaConnector) object).purgeCategoryMembers(_transformedFormat, _transformedForcelinkupdate, _transformedForcerecursivelinkupdate, _transformedContinueStr, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGcmtitle, _transformedGcmpageid, _transformedGcmprop, _transformedGcmnamespace, _transformedGcmtype, _transformedGcmcontinue, _transformedGcmlimit, _transformedGcmsort, _transformedGcmdir, _transformedGcmstart, _transformedGcmend, _transformedGcmstarthexsortkey, _transformedGcmendhexsortkey, _transformedGcmstartsortkeyprefix, _transformedGcmendsortkeyprefix, _transformedRedirects, _transformedConverttitles);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at purgeCategoryMembers retrieving was successful but result is null");
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
