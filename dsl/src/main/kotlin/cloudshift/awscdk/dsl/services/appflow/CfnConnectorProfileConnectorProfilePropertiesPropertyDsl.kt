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
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.ConnectorProfilePropertiesProperty.builder()

    public fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector)
    }

    public fun customConnector(customConnector: CfnConnectorProfile.CustomConnectorProfilePropertiesProperty) {
        cdkBuilder.customConnector(customConnector)
    }

    public fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog)
    }

    public fun datadog(datadog: CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty) {
        cdkBuilder.datadog(datadog)
    }

    public fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace)
    }

    public fun dynatrace(dynatrace: CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace)
    }

    public fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus)
    }

    public fun inforNexus(inforNexus: CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus)
    }

    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    public fun marketo(marketo: CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    public fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot)
    }

    public fun pardot(pardot: CfnConnectorProfile.PardotConnectorProfilePropertiesProperty) {
        cdkBuilder.pardot(pardot)
    }

    public fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift)
    }

    public fun redshift(redshift: CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty) {
        cdkBuilder.redshift(redshift)
    }

    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun salesforce(salesforce: CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData)
    }

    public fun sapoData(sapoData: CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty) {
        cdkBuilder.sapoData(sapoData)
    }

    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun serviceNow(serviceNow: CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack)
    }

    public fun slack(slack: CfnConnectorProfile.SlackConnectorProfilePropertiesProperty) {
        cdkBuilder.slack(slack)
    }

    public fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake)
    }

    public fun snowflake(snowflake: CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty) {
        cdkBuilder.snowflake(snowflake)
    }

    public fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva)
    }

    public fun veeva(veeva: CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty) {
        cdkBuilder.veeva(veeva)
    }

    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun zendesk(zendesk: CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnConnectorProfile.ConnectorProfilePropertiesProperty = cdkBuilder.build()
}
