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
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific credentials required by a connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ConnectorProfileCredentialsProperty connectorProfileCredentialsProperty =
 * ConnectorProfileCredentialsProperty.builder()
 * .amplitude(AmplitudeConnectorProfileCredentialsProperty.builder()
 * .apiKey("apiKey")
 * .secretKey("secretKey")
 * .build())
 * .customConnector(CustomConnectorProfileCredentialsProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .apiKey(ApiKeyCredentialsProperty.builder()
 * .apiKey("apiKey")
 * // the properties below are optional
 * .apiSecretKey("apiSecretKey")
 * .build())
 * .basic(BasicAuthCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .custom(CustomAuthCredentialsProperty.builder()
 * .customAuthenticationType("customAuthenticationType")
 * // the properties below are optional
 * .credentialsMap(Map.of(
 * "credentialsMapKey", "credentialsMap"))
 * .build())
 * .oauth2(OAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .oAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .build())
 * .datadog(DatadogConnectorProfileCredentialsProperty.builder()
 * .apiKey("apiKey")
 * .applicationKey("applicationKey")
 * .build())
 * .dynatrace(DynatraceConnectorProfileCredentialsProperty.builder()
 * .apiToken("apiToken")
 * .build())
 * .googleAnalytics(GoogleAnalyticsConnectorProfileCredentialsProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .inforNexus(InforNexusConnectorProfileCredentialsProperty.builder()
 * .accessKeyId("accessKeyId")
 * .datakey("datakey")
 * .secretAccessKey("secretAccessKey")
 * .userId("userId")
 * .build())
 * .marketo(MarketoConnectorProfileCredentialsProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .build())
 * .pardot(PardotConnectorProfileCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientCredentialsArn("clientCredentialsArn")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .redshift(RedshiftConnectorProfileCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .salesforce(SalesforceConnectorProfileCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientCredentialsArn("clientCredentialsArn")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .jwtToken("jwtToken")
 * .oAuth2GrantType("oAuth2GrantType")
 * .refreshToken("refreshToken")
 * .build())
 * .sapoData(SAPODataConnectorProfileCredentialsProperty.builder()
 * .basicAuthCredentials(BasicAuthCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .oAuthCredentials(OAuthCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
 * .build())
 * .serviceNow(ServiceNowConnectorProfileCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .singular(SingularConnectorProfileCredentialsProperty.builder()
 * .apiKey("apiKey")
 * .build())
 * .slack(SlackConnectorProfileCredentialsProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .build())
 * .snowflake(SnowflakeConnectorProfileCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .trendmicro(TrendmicroConnectorProfileCredentialsProperty.builder()
 * .apiSecretKey("apiSecretKey")
 * .build())
 * .veeva(VeevaConnectorProfileCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .zendesk(ZendeskConnectorProfileCredentialsProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.ConnectorProfileCredentialsProperty.builder()

    /** @param amplitude The connector-specific credentials required when using Amplitude. */
    public fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude)
    }

    /** @param amplitude The connector-specific credentials required when using Amplitude. */
    public fun amplitude(
        amplitude: CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.amplitude(amplitude)
    }

    /**
     * @param customConnector The connector-specific profile credentials that are required when
     *   using the custom connector.
     */
    public fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector)
    }

    /**
     * @param customConnector The connector-specific profile credentials that are required when
     *   using the custom connector.
     */
    public fun customConnector(
        customConnector: CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param datadog The connector-specific credentials required when using Datadog. */
    public fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog)
    }

    /** @param datadog The connector-specific credentials required when using Datadog. */
    public fun datadog(datadog: CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty) {
        cdkBuilder.datadog(datadog)
    }

    /** @param dynatrace The connector-specific credentials required when using Dynatrace. */
    public fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /** @param dynatrace The connector-specific credentials required when using Dynatrace. */
    public fun dynatrace(
        dynatrace: CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /**
     * @param googleAnalytics The connector-specific credentials required when using Google
     *   Analytics.
     */
    public fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    /**
     * @param googleAnalytics The connector-specific credentials required when using Google
     *   Analytics.
     */
    public fun googleAnalytics(
        googleAnalytics: CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    /** @param inforNexus The connector-specific credentials required when using Infor Nexus. */
    public fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param inforNexus The connector-specific credentials required when using Infor Nexus. */
    public fun inforNexus(
        inforNexus: CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param marketo The connector-specific credentials required when using Marketo. */
    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    /** @param marketo The connector-specific credentials required when using Marketo. */
    public fun marketo(marketo: CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty) {
        cdkBuilder.marketo(marketo)
    }

    /** @param pardot the value to be set. */
    public fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot)
    }

    /** @param pardot the value to be set. */
    public fun pardot(pardot: CfnConnectorProfile.PardotConnectorProfileCredentialsProperty) {
        cdkBuilder.pardot(pardot)
    }

    /** @param redshift The connector-specific credentials required when using Amazon Redshift. */
    public fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift)
    }

    /** @param redshift The connector-specific credentials required when using Amazon Redshift. */
    public fun redshift(redshift: CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty) {
        cdkBuilder.redshift(redshift)
    }

    /** @param salesforce The connector-specific credentials required when using Salesforce. */
    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param salesforce The connector-specific credentials required when using Salesforce. */
    public fun salesforce(
        salesforce: CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param sapoData The connector-specific profile credentials required when using SAPOData. */
    public fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param sapoData The connector-specific profile credentials required when using SAPOData. */
    public fun sapoData(sapoData: CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param serviceNow The connector-specific credentials required when using ServiceNow. */
    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param serviceNow The connector-specific credentials required when using ServiceNow. */
    public fun serviceNow(
        serviceNow: CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param singular The connector-specific credentials required when using Singular. */
    public fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular)
    }

    /** @param singular The connector-specific credentials required when using Singular. */
    public fun singular(singular: CfnConnectorProfile.SingularConnectorProfileCredentialsProperty) {
        cdkBuilder.singular(singular)
    }

    /** @param slack The connector-specific credentials required when using Slack. */
    public fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack)
    }

    /** @param slack The connector-specific credentials required when using Slack. */
    public fun slack(slack: CfnConnectorProfile.SlackConnectorProfileCredentialsProperty) {
        cdkBuilder.slack(slack)
    }

    /** @param snowflake The connector-specific credentials required when using Snowflake. */
    public fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake)
    }

    /** @param snowflake The connector-specific credentials required when using Snowflake. */
    public fun snowflake(
        snowflake: CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.snowflake(snowflake)
    }

    /** @param trendmicro The connector-specific credentials required when using Trend Micro. */
    public fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro)
    }

    /** @param trendmicro The connector-specific credentials required when using Trend Micro. */
    public fun trendmicro(
        trendmicro: CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
    ) {
        cdkBuilder.trendmicro(trendmicro)
    }

    /** @param veeva The connector-specific credentials required when using Veeva. */
    public fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva)
    }

    /** @param veeva The connector-specific credentials required when using Veeva. */
    public fun veeva(veeva: CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty) {
        cdkBuilder.veeva(veeva)
    }

    /** @param zendesk The connector-specific credentials required when using Zendesk. */
    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    /** @param zendesk The connector-specific credentials required when using Zendesk. */
    public fun zendesk(zendesk: CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnConnectorProfile.ConnectorProfileCredentialsProperty = cdkBuilder.build()
}
