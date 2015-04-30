
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
 * ParseContentMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#parseContent(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class ParseContentMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object title;
    protected String _titleType;
    protected Object text;
    protected String _textType;
    protected Object summary;
    protected String _summaryType;
    protected Object page;
    protected String _pageType;
    protected Object pageid;
    protected String _pageidType;
    protected Object redirects;
    protected String _redirectsType;
    protected Object oldid;
    protected String _oldidType;
    protected Object prop;
    protected String _propType;
    protected Object pst;
    protected String _pstType;
    protected Object onlypst;
    protected String _onlypstType;
    protected Object effectivelanglinks;
    protected String _effectivelanglinksType;
    protected Object section;
    protected String _sectionType;
    protected Object sectiontitle;
    protected String _sectiontitleType;
    protected Object disablepp;
    protected String _disableppType;
    protected Object disableeditsection;
    protected String _disableeditsectionType;
    protected Object generatexml;
    protected String _generatexmlType;
    protected Object preview;
    protected String _previewType;
    protected Object sectionpreview;
    protected String _sectionpreviewType;
    protected Object disabletoc;
    protected String _disabletocType;
    protected Object contentformat;
    protected String _contentformatType;
    protected Object contentmodel;
    protected String _contentmodelType;
    protected Object mobileformat;
    protected String _mobileformatType;
    protected Object noimages;
    protected String _noimagesType;
    protected Object mainpage;
    protected String _mainpageType;
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

    public ParseContentMessageProcessor(String operationName) {
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
     * Sets summary
     * 
     * @param value Value to set
     */
    public void setSummary(Object value) {
        this.summary = value;
    }

    /**
     * Sets pst
     * 
     * @param value Value to set
     */
    public void setPst(Object value) {
        this.pst = value;
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
     * Sets disabletoc
     * 
     * @param value Value to set
     */
    public void setDisabletoc(Object value) {
        this.disabletoc = value;
    }

    /**
     * Sets oldid
     * 
     * @param value Value to set
     */
    public void setOldid(Object value) {
        this.oldid = value;
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
     * Sets sectionpreview
     * 
     * @param value Value to set
     */
    public void setSectionpreview(Object value) {
        this.sectionpreview = value;
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
     * Sets mobileformat
     * 
     * @param value Value to set
     */
    public void setMobileformat(Object value) {
        this.mobileformat = value;
    }

    /**
     * Sets title
     * 
     * @param value Value to set
     */
    public void setTitle(Object value) {
        this.title = value;
    }

    /**
     * Sets page
     * 
     * @param value Value to set
     */
    public void setPage(Object value) {
        this.page = value;
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
     * Sets onlypst
     * 
     * @param value Value to set
     */
    public void setOnlypst(Object value) {
        this.onlypst = value;
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
     * Sets contentmodel
     * 
     * @param value Value to set
     */
    public void setContentmodel(Object value) {
        this.contentmodel = value;
    }

    /**
     * Sets effectivelanglinks
     * 
     * @param value Value to set
     */
    public void setEffectivelanglinks(Object value) {
        this.effectivelanglinks = value;
    }

    /**
     * Sets disableeditsection
     * 
     * @param value Value to set
     */
    public void setDisableeditsection(Object value) {
        this.disableeditsection = value;
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
     * Sets pageid
     * 
     * @param value Value to set
     */
    public void setPageid(Object value) {
        this.pageid = value;
    }

    /**
     * Sets noimages
     * 
     * @param value Value to set
     */
    public void setNoimages(Object value) {
        this.noimages = value;
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
     * Sets text
     * 
     * @param value Value to set
     */
    public void setText(Object value) {
        this.text = value;
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
     * Sets centralauthtoken
     * 
     * @param value Value to set
     */
    public void setCentralauthtoken(Object value) {
        this.centralauthtoken = value;
    }

    /**
     * Sets generatexml
     * 
     * @param value Value to set
     */
    public void setGeneratexml(Object value) {
        this.generatexml = value;
    }

    /**
     * Sets section
     * 
     * @param value Value to set
     */
    public void setSection(Object value) {
        this.section = value;
    }

    /**
     * Sets mainpage
     * 
     * @param value Value to set
     */
    public void setMainpage(Object value) {
        this.mainpage = value;
    }

    /**
     * Sets disablepp
     * 
     * @param value Value to set
     */
    public void setDisablepp(Object value) {
        this.disablepp = value;
    }

    /**
     * Sets contentformat
     * 
     * @param value Value to set
     */
    public void setContentformat(Object value) {
        this.contentformat = value;
    }

    /**
     * Sets sectiontitle
     * 
     * @param value Value to set
     */
    public void setSectiontitle(Object value) {
        this.sectiontitle = value;
    }

    /**
     * Sets preview
     * 
     * @param value Value to set
     */
    public void setPreview(Object value) {
        this.preview = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedTitle = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_titleType").getGenericType(), null, title));
            final String _transformedText = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_textType").getGenericType(), null, text));
            final String _transformedSummary = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_summaryType").getGenericType(), null, summary));
            final String _transformedPage = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_pageType").getGenericType(), null, page));
            final String _transformedPageid = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_pageidType").getGenericType(), null, pageid));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedOldid = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_oldidType").getGenericType(), null, oldid));
            final String _transformedProp = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_propType").getGenericType(), null, prop));
            final String _transformedPst = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_pstType").getGenericType(), null, pst));
            final String _transformedOnlypst = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_onlypstType").getGenericType(), null, onlypst));
            final String _transformedEffectivelanglinks = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_effectivelanglinksType").getGenericType(), null, effectivelanglinks));
            final String _transformedSection = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_sectionType").getGenericType(), null, section));
            final String _transformedSectiontitle = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_sectiontitleType").getGenericType(), null, sectiontitle));
            final String _transformedDisablepp = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_disableppType").getGenericType(), null, disablepp));
            final String _transformedDisableeditsection = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_disableeditsectionType").getGenericType(), null, disableeditsection));
            final String _transformedGeneratexml = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_generatexmlType").getGenericType(), null, generatexml));
            final String _transformedPreview = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_previewType").getGenericType(), null, preview));
            final String _transformedSectionpreview = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_sectionpreviewType").getGenericType(), null, sectionpreview));
            final String _transformedDisabletoc = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_disabletocType").getGenericType(), null, disabletoc));
            final String _transformedContentformat = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_contentformatType").getGenericType(), null, contentformat));
            final String _transformedContentmodel = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_contentmodelType").getGenericType(), null, contentmodel));
            final String _transformedMobileformat = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_mobileformatType").getGenericType(), null, mobileformat));
            final String _transformedNoimages = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_noimagesType").getGenericType(), null, noimages));
            final String _transformedMainpage = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_mainpageType").getGenericType(), null, mainpage));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, ParseContentMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).parseContent(_transformedFormat, _transformedTitle, _transformedText, _transformedSummary, _transformedPage, _transformedPageid, _transformedRedirects, _transformedOldid, _transformedProp, _transformedPst, _transformedOnlypst, _transformedEffectivelanglinks, _transformedSection, _transformedSectiontitle, _transformedDisablepp, _transformedDisableeditsection, _transformedGeneratexml, _transformedPreview, _transformedSectionpreview, _transformedDisabletoc, _transformedContentformat, _transformedContentmodel, _transformedMobileformat, _transformedNoimages, _transformedMainpage, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at parseContent retrieving was successful but result is null");
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
