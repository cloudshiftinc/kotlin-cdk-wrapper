@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowSourceConnectorPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SourceConnectorPropertiesProperty.Builder =
        CfnFlow.SourceConnectorPropertiesProperty.builder()

    public fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude)
    }

    public fun amplitude(amplitude: CfnFlow.AmplitudeSourcePropertiesProperty) {
        cdkBuilder.amplitude(amplitude)
    }

    public fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector)
    }

    public fun customConnector(customConnector: CfnFlow.CustomConnectorSourcePropertiesProperty) {
        cdkBuilder.customConnector(customConnector)
    }

    public fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog)
    }

    public fun datadog(datadog: CfnFlow.DatadogSourcePropertiesProperty) {
        cdkBuilder.datadog(datadog)
    }

    public fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace)
    }

    public fun dynatrace(dynatrace: CfnFlow.DynatraceSourcePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace)
    }

    public fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    public fun googleAnalytics(googleAnalytics: CfnFlow.GoogleAnalyticsSourcePropertiesProperty) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    public fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus)
    }

    public fun inforNexus(inforNexus: CfnFlow.InforNexusSourcePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus)
    }

    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    public fun marketo(marketo: CfnFlow.MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    public fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot)
    }

    public fun pardot(pardot: CfnFlow.PardotSourcePropertiesProperty) {
        cdkBuilder.pardot(pardot)
    }

    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    public fun s3(s3: CfnFlow.S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3)
    }

    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun salesforce(salesforce: CfnFlow.SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData)
    }

    public fun sapoData(sapoData: CfnFlow.SAPODataSourcePropertiesProperty) {
        cdkBuilder.sapoData(sapoData)
    }

    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun serviceNow(serviceNow: CfnFlow.ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular)
    }

    public fun singular(singular: CfnFlow.SingularSourcePropertiesProperty) {
        cdkBuilder.singular(singular)
    }

    public fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack)
    }

    public fun slack(slack: CfnFlow.SlackSourcePropertiesProperty) {
        cdkBuilder.slack(slack)
    }

    public fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro)
    }

    public fun trendmicro(trendmicro: CfnFlow.TrendmicroSourcePropertiesProperty) {
        cdkBuilder.trendmicro(trendmicro)
    }

    public fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva)
    }

    public fun veeva(veeva: CfnFlow.VeevaSourcePropertiesProperty) {
        cdkBuilder.veeva(veeva)
    }

    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun zendesk(zendesk: CfnFlow.ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnFlow.SourceConnectorPropertiesProperty = cdkBuilder.build()
}
