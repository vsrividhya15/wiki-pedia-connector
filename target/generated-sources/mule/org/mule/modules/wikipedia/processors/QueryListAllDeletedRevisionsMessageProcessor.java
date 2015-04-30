
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
 * QueryListAllDeletedRevisionsMessageProcessor invokes the {@link org.mule.modules.wikipedia.WikiPediaConnector#queryListAllDeletedRevisions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link WikiPediaConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class QueryListAllDeletedRevisionsMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object format;
    protected String _formatType;
    protected Object prop;
    protected String _propType;
    protected Object meta;
    protected String _metaType;
    protected Object adrprop;
    protected String _adrpropType;
    protected Object adrlimit;
    protected String _adrlimitType;
    protected Object adrexpandtemplates;
    protected String _adrexpandtemplatesType;
    protected Object adrgeneratexml;
    protected String _adrgeneratexmlType;
    protected Object adrparse;
    protected String _adrparseType;
    protected Object adrsection;
    protected String _adrsectionType;
    protected Object adrdiffto;
    protected String _adrdifftoType;
    protected Object adrdifftotext;
    protected String _adrdifftotextType;
    protected Object adrcontentformat;
    protected String _adrcontentformatType;
    protected Object adruser;
    protected String _adruserType;
    protected Object adrnamespace;
    protected String _adrnamespaceType;
    protected Object adrstart;
    protected String _adrstartType;
    protected Object adrend;
    protected String _adrendType;
    protected Object adrdir;
    protected String _adrdirType;
    protected Object adrfrom;
    protected String _adrfromType;
    protected Object adrto;
    protected String _adrtoType;
    protected Object adrprefix;
    protected String _adrprefixType;
    protected Object adrexcludeuser;
    protected String _adrexcludeuserType;
    protected Object adrtag;
    protected String _adrtagType;
    protected Object adrcontinue;
    protected String _adrcontinueType;
    protected Object adrgeneratetitles;
    protected String _adrgeneratetitlesType;
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

    public QueryListAllDeletedRevisionsMessageProcessor(String operationName) {
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
     * Sets adruser
     * 
     * @param value Value to set
     */
    public void setAdruser(Object value) {
        this.adruser = value;
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
     * Sets adrdir
     * 
     * @param value Value to set
     */
    public void setAdrdir(Object value) {
        this.adrdir = value;
    }

    /**
     * Sets adrparse
     * 
     * @param value Value to set
     */
    public void setAdrparse(Object value) {
        this.adrparse = value;
    }

    /**
     * Sets adrnamespace
     * 
     * @param value Value to set
     */
    public void setAdrnamespace(Object value) {
        this.adrnamespace = value;
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
     * Sets adrexcludeuser
     * 
     * @param value Value to set
     */
    public void setAdrexcludeuser(Object value) {
        this.adrexcludeuser = value;
    }

    /**
     * Sets adrexpandtemplates
     * 
     * @param value Value to set
     */
    public void setAdrexpandtemplates(Object value) {
        this.adrexpandtemplates = value;
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
     * Sets adrsection
     * 
     * @param value Value to set
     */
    public void setAdrsection(Object value) {
        this.adrsection = value;
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
     * Sets adrstart
     * 
     * @param value Value to set
     */
    public void setAdrstart(Object value) {
        this.adrstart = value;
    }

    /**
     * Sets adrfrom
     * 
     * @param value Value to set
     */
    public void setAdrfrom(Object value) {
        this.adrfrom = value;
    }

    /**
     * Sets adrdiffto
     * 
     * @param value Value to set
     */
    public void setAdrdiffto(Object value) {
        this.adrdiffto = value;
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
     * Sets adrgeneratexml
     * 
     * @param value Value to set
     */
    public void setAdrgeneratexml(Object value) {
        this.adrgeneratexml = value;
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
     * Sets adrcontentformat
     * 
     * @param value Value to set
     */
    public void setAdrcontentformat(Object value) {
        this.adrcontentformat = value;
    }

    /**
     * Sets adrtag
     * 
     * @param value Value to set
     */
    public void setAdrtag(Object value) {
        this.adrtag = value;
    }

    /**
     * Sets adrgeneratetitles
     * 
     * @param value Value to set
     */
    public void setAdrgeneratetitles(Object value) {
        this.adrgeneratetitles = value;
    }

    /**
     * Sets adrend
     * 
     * @param value Value to set
     */
    public void setAdrend(Object value) {
        this.adrend = value;
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
     * Sets adrto
     * 
     * @param value Value to set
     */
    public void setAdrto(Object value) {
        this.adrto = value;
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
     * Sets adrdifftotext
     * 
     * @param value Value to set
     */
    public void setAdrdifftotext(Object value) {
        this.adrdifftotext = value;
    }

    /**
     * Sets adrprop
     * 
     * @param value Value to set
     */
    public void setAdrprop(Object value) {
        this.adrprop = value;
    }

    /**
     * Sets adrprefix
     * 
     * @param value Value to set
     */
    public void setAdrprefix(Object value) {
        this.adrprefix = value;
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
     * Sets adrlimit
     * 
     * @param value Value to set
     */
    public void setAdrlimit(Object value) {
        this.adrlimit = value;
    }

    /**
     * Sets adrcontinue
     * 
     * @param value Value to set
     */
    public void setAdrcontinue(Object value) {
        this.adrcontinue = value;
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
            final String _transformedFormat = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_formatType").getGenericType(), null, format));
            final String _transformedProp = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_propType").getGenericType(), null, prop));
            final String _transformedMeta = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_metaType").getGenericType(), null, meta));
            final String _transformedAdrprop = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrpropType").getGenericType(), null, adrprop));
            final String _transformedAdrlimit = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrlimitType").getGenericType(), null, adrlimit));
            final String _transformedAdrexpandtemplates = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrexpandtemplatesType").getGenericType(), null, adrexpandtemplates));
            final String _transformedAdrgeneratexml = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrgeneratexmlType").getGenericType(), null, adrgeneratexml));
            final String _transformedAdrparse = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrparseType").getGenericType(), null, adrparse));
            final String _transformedAdrsection = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrsectionType").getGenericType(), null, adrsection));
            final String _transformedAdrdiffto = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrdifftoType").getGenericType(), null, adrdiffto));
            final String _transformedAdrdifftotext = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrdifftotextType").getGenericType(), null, adrdifftotext));
            final String _transformedAdrcontentformat = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrcontentformatType").getGenericType(), null, adrcontentformat));
            final String _transformedAdruser = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adruserType").getGenericType(), null, adruser));
            final String _transformedAdrnamespace = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrnamespaceType").getGenericType(), null, adrnamespace));
            final String _transformedAdrstart = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrstartType").getGenericType(), null, adrstart));
            final String _transformedAdrend = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrendType").getGenericType(), null, adrend));
            final String _transformedAdrdir = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrdirType").getGenericType(), null, adrdir));
            final String _transformedAdrfrom = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrfromType").getGenericType(), null, adrfrom));
            final String _transformedAdrto = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrtoType").getGenericType(), null, adrto));
            final String _transformedAdrprefix = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrprefixType").getGenericType(), null, adrprefix));
            final String _transformedAdrexcludeuser = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrexcludeuserType").getGenericType(), null, adrexcludeuser));
            final String _transformedAdrtag = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrtagType").getGenericType(), null, adrtag));
            final String _transformedAdrcontinue = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrcontinueType").getGenericType(), null, adrcontinue));
            final String _transformedAdrgeneratetitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_adrgeneratetitlesType").getGenericType(), null, adrgeneratetitles));
            final String _transformedIndexpageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_indexpageidsType").getGenericType(), null, indexpageids));
            final String _transformedExport = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_exportType").getGenericType(), null, export));
            final String _transformedExportnowrap = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_exportnowrapType").getGenericType(), null, exportnowrap));
            final String _transformedIwurl = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_iwurlType").getGenericType(), null, iwurl));
            final String _transformedContinueId = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_continueIdType").getGenericType(), null, continueId));
            final String _transformedTitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_titlesType").getGenericType(), null, titles));
            final String _transformedPageids = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_pageidsType").getGenericType(), null, pageids));
            final String _transformedRevids = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_revidsType").getGenericType(), null, revids));
            final String _transformedGenerator = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_generatorType").getGenericType(), null, generator));
            final String _transformedRedirects = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_redirectsType").getGenericType(), null, redirects));
            final String _transformedConverttitles = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_converttitlesType").getGenericType(), null, converttitles));
            final String _transformedMaxlag = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_maxlagType").getGenericType(), null, maxlag));
            final String _transformedSmaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_smaxageType").getGenericType(), null, smaxage));
            final String _transformedMaxage = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_maxageType").getGenericType(), null, maxage));
            final String _transformedAssertUser = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_assertUserType").getGenericType(), null, assertUser));
            final String _transformedRequestid = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_requestidType").getGenericType(), null, requestid));
            final String _transformedServedby = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_servedbyType").getGenericType(), null, servedby));
            final String _transformedCurtimestamp = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_curtimestampType").getGenericType(), null, curtimestamp));
            final String _transformedOrigin = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_originType").getGenericType(), null, origin));
            final String _transformedUselang = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_uselangType").getGenericType(), null, uselang));
            final String _transformedCentralauthtoken = ((String) evaluateAndTransform(getMuleContext(), event, QueryListAllDeletedRevisionsMessageProcessor.class.getDeclaredField("_centralauthtokenType").getGenericType(), null, centralauthtoken));
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
                    return ((WikiPediaConnector) object).queryListAllDeletedRevisions(_transformedFormat, _transformedProp, _transformedMeta, _transformedAdrprop, _transformedAdrlimit, _transformedAdrexpandtemplates, _transformedAdrgeneratexml, _transformedAdrparse, _transformedAdrsection, _transformedAdrdiffto, _transformedAdrdifftotext, _transformedAdrcontentformat, _transformedAdruser, _transformedAdrnamespace, _transformedAdrstart, _transformedAdrend, _transformedAdrdir, _transformedAdrfrom, _transformedAdrto, _transformedAdrprefix, _transformedAdrexcludeuser, _transformedAdrtag, _transformedAdrcontinue, _transformedAdrgeneratetitles, _transformedIndexpageids, _transformedExport, _transformedExportnowrap, _transformedIwurl, _transformedContinueId, _transformedTitles, _transformedPageids, _transformedRevids, _transformedGenerator, _transformedRedirects, _transformedConverttitles, _transformedMaxlag, _transformedSmaxage, _transformedMaxage, _transformedAssertUser, _transformedRequestid, _transformedServedby, _transformedCurtimestamp, _transformedOrigin, _transformedUselang, _transformedCentralauthtoken);
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
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at WikiPediaConnector at queryListAllDeletedRevisions retrieving was successful but result is null");
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
