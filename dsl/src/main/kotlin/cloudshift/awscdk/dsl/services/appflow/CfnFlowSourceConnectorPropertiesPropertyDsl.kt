@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Specifies the information that is required to query a particular connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SourceConnectorPropertiesProperty sourceConnectorPropertiesProperty =
 * SourceConnectorPropertiesProperty.builder()
 * .amplitude(AmplitudeSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .customConnector(CustomConnectorSourcePropertiesProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .customProperties(Map.of(
 * "customPropertiesKey", "customProperties"))
 * .dataTransferApi(DataTransferApiProperty.builder()
 * .name("name")
 * .type("type")
 * .build())
 * .build())
 * .datadog(DatadogSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .dynatrace(DynatraceSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .googleAnalytics(GoogleAnalyticsSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .inforNexus(InforNexusSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .marketo(MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .pardot(PardotSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .s3(S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .s3InputFormatConfig(S3InputFormatConfigProperty.builder()
 * .s3InputFileType("s3InputFileType")
 * .build())
 * .build())
 * .salesforce(SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build())
 * .sapoData(SAPODataSourcePropertiesProperty.builder()
 * .objectPath("objectPath")
 * .build())
 * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .singular(SingularSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .slack(SlackSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .trendmicro(TrendmicroSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .veeva(VeevaSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .documentType("documentType")
 * .includeAllVersions(false)
 * .includeRenditions(false)
 * .includeSourceFiles(false)
 * .build())
 * .zendesk(ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceconnectorproperties.html)
 */
@CdkDslMarker
public class CfnFlowSourceConnectorPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SourceConnectorPropertiesProperty.Builder =
        CfnFlow.SourceConnectorPropertiesProperty.builder()

    /** @param amplitude Specifies the information that is required for querying Amplitude. */
    public fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude)
    }

    /** @param amplitude Specifies the information that is required for querying Amplitude. */
    public fun amplitude(amplitude: CfnFlow.AmplitudeSourcePropertiesProperty) {
        cdkBuilder.amplitude(amplitude)
    }

    /**
     * @param customConnector The properties that are applied when the custom connector is being
     *   used as a source.
     */
    public fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector)
    }

    /**
     * @param customConnector The properties that are applied when the custom connector is being
     *   used as a source.
     */
    public fun customConnector(customConnector: CfnFlow.CustomConnectorSourcePropertiesProperty) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param datadog Specifies the information that is required for querying Datadog. */
    public fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog)
    }

    /** @param datadog Specifies the information that is required for querying Datadog. */
    public fun datadog(datadog: CfnFlow.DatadogSourcePropertiesProperty) {
        cdkBuilder.datadog(datadog)
    }

    /** @param dynatrace Specifies the information that is required for querying Dynatrace. */
    public fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /** @param dynatrace Specifies the information that is required for querying Dynatrace. */
    public fun dynatrace(dynatrace: CfnFlow.DynatraceSourcePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /**
     * @param googleAnalytics Specifies the information that is required for querying Google
     *   Analytics.
     */
    public fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    /**
     * @param googleAnalytics Specifies the information that is required for querying Google
     *   Analytics.
     */
    public fun googleAnalytics(googleAnalytics: CfnFlow.GoogleAnalyticsSourcePropertiesProperty) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    /** @param inforNexus Specifies the information that is required for querying Infor Nexus. */
    public fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param inforNexus Specifies the information that is required for querying Infor Nexus. */
    public fun inforNexus(inforNexus: CfnFlow.InforNexusSourcePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param marketo Specifies the information that is required for querying Marketo. */
    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    /** @param marketo Specifies the information that is required for querying Marketo. */
    public fun marketo(marketo: CfnFlow.MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    /** @param pardot the value to be set. */
    public fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot)
    }

    /** @param pardot the value to be set. */
    public fun pardot(pardot: CfnFlow.PardotSourcePropertiesProperty) {
        cdkBuilder.pardot(pardot)
    }

    /** @param s3 Specifies the information that is required for querying Amazon S3. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 Specifies the information that is required for querying Amazon S3. */
    public fun s3(s3: CfnFlow.S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3)
    }

    /** @param salesforce Specifies the information that is required for querying Salesforce. */
    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param salesforce Specifies the information that is required for querying Salesforce. */
    public fun salesforce(salesforce: CfnFlow.SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param sapoData The properties that are applied when using SAPOData as a flow source. */
    public fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param sapoData The properties that are applied when using SAPOData as a flow source. */
    public fun sapoData(sapoData: CfnFlow.SAPODataSourcePropertiesProperty) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param serviceNow Specifies the information that is required for querying ServiceNow. */
    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param serviceNow Specifies the information that is required for querying ServiceNow. */
    public fun serviceNow(serviceNow: CfnFlow.ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param singular Specifies the information that is required for querying Singular. */
    public fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular)
    }

    /** @param singular Specifies the information that is required for querying Singular. */
    public fun singular(singular: CfnFlow.SingularSourcePropertiesProperty) {
        cdkBuilder.singular(singular)
    }

    /** @param slack Specifies the information that is required for querying Slack. */
    public fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack)
    }

    /** @param slack Specifies the information that is required for querying Slack. */
    public fun slack(slack: CfnFlow.SlackSourcePropertiesProperty) {
        cdkBuilder.slack(slack)
    }

    /** @param trendmicro Specifies the information that is required for querying Trend Micro. */
    public fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro)
    }

    /** @param trendmicro Specifies the information that is required for querying Trend Micro. */
    public fun trendmicro(trendmicro: CfnFlow.TrendmicroSourcePropertiesProperty) {
        cdkBuilder.trendmicro(trendmicro)
    }

    /** @param veeva Specifies the information that is required for querying Veeva. */
    public fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva)
    }

    /** @param veeva Specifies the information that is required for querying Veeva. */
    public fun veeva(veeva: CfnFlow.VeevaSourcePropertiesProperty) {
        cdkBuilder.veeva(veeva)
    }

    /** @param zendesk Specifies the information that is required for querying Zendesk. */
    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    /** @param zendesk Specifies the information that is required for querying Zendesk. */
    public fun zendesk(zendesk: CfnFlow.ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnFlow.SourceConnectorPropertiesProperty = cdkBuilder.build()
}
