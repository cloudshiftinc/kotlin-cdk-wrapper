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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required by each connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ConnectorProfilePropertiesProperty connectorProfilePropertiesProperty =
 * ConnectorProfilePropertiesProperty.builder()
 * .customConnector(CustomConnectorProfilePropertiesProperty.builder()
 * .oAuth2Properties(OAuth2PropertiesProperty.builder()
 * .oAuth2GrantType("oAuth2GrantType")
 * .tokenUrl("tokenUrl")
 * .tokenUrlCustomProperties(Map.of(
 * "tokenUrlCustomPropertiesKey", "tokenUrlCustomProperties"))
 * .build())
 * .profileProperties(Map.of(
 * "profilePropertiesKey", "profileProperties"))
 * .build())
 * .datadog(DatadogConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .dynatrace(DynatraceConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .inforNexus(InforNexusConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .marketo(MarketoConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .pardot(PardotConnectorProfilePropertiesProperty.builder()
 * .businessUnitId("businessUnitId")
 * // the properties below are optional
 * .instanceUrl("instanceUrl")
 * .isSandboxEnvironment(false)
 * .build())
 * .redshift(RedshiftConnectorProfilePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .clusterIdentifier("clusterIdentifier")
 * .dataApiRoleArn("dataApiRoleArn")
 * .databaseName("databaseName")
 * .databaseUrl("databaseUrl")
 * .isRedshiftServerless(false)
 * .workgroupName("workgroupName")
 * .build())
 * .salesforce(SalesforceConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .isSandboxEnvironment(false)
 * .usePrivateLinkForMetadataAndAuthorization(false)
 * .build())
 * .sapoData(SAPODataConnectorProfilePropertiesProperty.builder()
 * .applicationHostUrl("applicationHostUrl")
 * .applicationServicePath("applicationServicePath")
 * .clientNumber("clientNumber")
 * .disableSso(false)
 * .logonLanguage("logonLanguage")
 * .oAuthProperties(OAuthPropertiesProperty.builder()
 * .authCodeUrl("authCodeUrl")
 * .oAuthScopes(List.of("oAuthScopes"))
 * .tokenUrl("tokenUrl")
 * .build())
 * .portNumber(123)
 * .privateLinkServiceName("privateLinkServiceName")
 * .build())
 * .serviceNow(ServiceNowConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .slack(SlackConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .snowflake(SnowflakeConnectorProfilePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .stage("stage")
 * .warehouse("warehouse")
 * // the properties below are optional
 * .accountName("accountName")
 * .bucketPrefix("bucketPrefix")
 * .privateLinkServiceName("privateLinkServiceName")
 * .region("region")
 * .build())
 * .veeva(VeevaConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .zendesk(ZendeskConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.ConnectorProfilePropertiesProperty.builder()

    /** @param customConnector The properties required by the custom connector. */
    public fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param customConnector The properties required by the custom connector. */
    public fun customConnector(
        customConnector: CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
    ) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param datadog The connector-specific properties required by Datadog. */
    public fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog)
    }

    /** @param datadog The connector-specific properties required by Datadog. */
    public fun datadog(datadog: CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty) {
        cdkBuilder.datadog(datadog)
    }

    /** @param dynatrace The connector-specific properties required by Dynatrace. */
    public fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /** @param dynatrace The connector-specific properties required by Dynatrace. */
    public fun dynatrace(
        dynatrace: CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
    ) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /** @param inforNexus The connector-specific properties required by Infor Nexus. */
    public fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param inforNexus The connector-specific properties required by Infor Nexus. */
    public fun inforNexus(
        inforNexus: CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
    ) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param marketo The connector-specific properties required by Marketo. */
    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    /** @param marketo The connector-specific properties required by Marketo. */
    public fun marketo(marketo: CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    /** @param pardot The connector-specific properties required by Salesforce Pardot. */
    public fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot)
    }

    /** @param pardot The connector-specific properties required by Salesforce Pardot. */
    public fun pardot(pardot: CfnConnectorProfile.PardotConnectorProfilePropertiesProperty) {
        cdkBuilder.pardot(pardot)
    }

    /** @param redshift The connector-specific properties required by Amazon Redshift. */
    public fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift)
    }

    /** @param redshift The connector-specific properties required by Amazon Redshift. */
    public fun redshift(redshift: CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty) {
        cdkBuilder.redshift(redshift)
    }

    /** @param salesforce The connector-specific properties required by Salesforce. */
    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param salesforce The connector-specific properties required by Salesforce. */
    public fun salesforce(
        salesforce: CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
    ) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param sapoData The connector-specific profile properties required when using SAPOData. */
    public fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param sapoData The connector-specific profile properties required when using SAPOData. */
    public fun sapoData(sapoData: CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param serviceNow The connector-specific properties required by serviceNow. */
    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param serviceNow The connector-specific properties required by serviceNow. */
    public fun serviceNow(
        serviceNow: CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
    ) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param slack The connector-specific properties required by Slack. */
    public fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack)
    }

    /** @param slack The connector-specific properties required by Slack. */
    public fun slack(slack: CfnConnectorProfile.SlackConnectorProfilePropertiesProperty) {
        cdkBuilder.slack(slack)
    }

    /** @param snowflake The connector-specific properties required by Snowflake. */
    public fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake)
    }

    /** @param snowflake The connector-specific properties required by Snowflake. */
    public fun snowflake(
        snowflake: CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
    ) {
        cdkBuilder.snowflake(snowflake)
    }

    /** @param veeva The connector-specific properties required by Veeva. */
    public fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva)
    }

    /** @param veeva The connector-specific properties required by Veeva. */
    public fun veeva(veeva: CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty) {
        cdkBuilder.veeva(veeva)
    }

    /** @param zendesk The connector-specific properties required by Zendesk. */
    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    /** @param zendesk The connector-specific properties required by Zendesk. */
    public fun zendesk(zendesk: CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnConnectorProfile.ConnectorProfilePropertiesProperty = cdkBuilder.build()
}
