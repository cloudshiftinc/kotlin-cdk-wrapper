@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
import software.amazon.awscdk.services.appflow.CfnConnectorProps
import software.amazon.awscdk.services.appflow.CfnFlow
import software.amazon.awscdk.services.appflow.CfnFlowProps
import software.constructs.Construct

public object appflow {
  /**
   * Creates a new connector profile associated with your AWS account .
   *
   * There is a soft quota of 100 connector profiles per AWS account . If you need more connector
   * profiles than this quota allows, you can submit a request to the Amazon AppFlow team through the
   * Amazon AppFlow support channel. In each connector profile that you create, you can provide the
   * credentials and properties for only one connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
   * .connectorProvisioningConfig(ConnectorProvisioningConfigProperty.builder()
   * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build())
   * .connectorProvisioningType("connectorProvisioningType")
   * // the properties below are optional
   * .connectorLabel("connectorLabel")
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html)
   */
  public inline fun cfnConnector(
    scope: Construct,
    id: String,
    block: CfnConnectorDsl.() -> Unit = {},
  ): CfnConnector {
    val builder = CfnConnectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the configuration of the connector being registered.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ConnectorProvisioningConfigProperty connectorProvisioningConfigProperty =
   * ConnectorProvisioningConfigProperty.builder()
   * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-connectorprovisioningconfig.html)
   */
  public inline
      fun cfnConnectorConnectorProvisioningConfigProperty(block: CfnConnectorConnectorProvisioningConfigPropertyDsl.() -> Unit
      = {}): CfnConnector.ConnectorProvisioningConfigProperty {
    val builder = CfnConnectorConnectorProvisioningConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the configuration of the lambda which is being registered as the
   * connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * LambdaConnectorProvisioningConfigProperty lambdaConnectorProvisioningConfigProperty =
   * LambdaConnectorProvisioningConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-lambdaconnectorprovisioningconfig.html)
   */
  public inline
      fun cfnConnectorLambdaConnectorProvisioningConfigProperty(block: CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl.() -> Unit
      = {}): CfnConnector.LambdaConnectorProvisioningConfigProperty {
    val builder = CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::AppFlow::ConnectorProfile` resource is an Amazon AppFlow resource type that specifies
   * the configuration profile for an instance of a connector.
   *
   * This includes the provided name, credentials ARN, connection-mode, and so on. The fields that
   * are common to all types of connector profiles are explicitly specified under the `Properties`
   * field. The rest of the connector-specific properties are specified under
   * `Properties/ConnectorProfileConfig` .
   *
   *
   * If you want to use AWS CloudFormation to create a connector profile for connectors that
   * implement OAuth (such as Salesforce, Slack, Zendesk, and Google Analytics), you must fetch the
   * access and refresh tokens. You can do this by implementing your own UI for OAuth, or by retrieving
   * the tokens from elsewhere. Alternatively, you can use the Amazon AppFlow console to create the
   * connector profile, and then use that connector profile in the flow creation CloudFormation
   * template.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CfnConnectorProfile cfnConnectorProfile = CfnConnectorProfile.Builder.create(this,
   * "MyCfnConnectorProfile")
   * .connectionMode("connectionMode")
   * .connectorProfileName("connectorProfileName")
   * .connectorType("connectorType")
   * // the properties below are optional
   * .connectorLabel("connectorLabel")
   * .connectorProfileConfig(ConnectorProfileConfigProperty.builder()
   * .connectorProfileCredentials(ConnectorProfileCredentialsProperty.builder()
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
   * .build())
   * .connectorProfileProperties(ConnectorProfilePropertiesProperty.builder()
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
   * .build())
   * .build())
   * .kmsArn("kmsArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html)
   */
  public inline fun cfnConnectorProfile(
    scope: Construct,
    id: String,
    block: CfnConnectorProfileDsl.() -> Unit = {},
  ): CfnConnectorProfile {
    val builder = CfnConnectorProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific credentials required when using Amplitude.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * AmplitudeConnectorProfileCredentialsProperty amplitudeConnectorProfileCredentialsProperty =
   * AmplitudeConnectorProfileCredentialsProperty.builder()
   * .apiKey("apiKey")
   * .secretKey("secretKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-amplitudeconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileAmplitudeConnectorProfileCredentialsProperty(block: CfnConnectorProfileAmplitudeConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileAmplitudeConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The API key credentials required for API key authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ApiKeyCredentialsProperty apiKeyCredentialsProperty = ApiKeyCredentialsProperty.builder()
   * .apiKey("apiKey")
   * // the properties below are optional
   * .apiSecretKey("apiSecretKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-apikeycredentials.html)
   */
  public inline
      fun cfnConnectorProfileApiKeyCredentialsProperty(block: CfnConnectorProfileApiKeyCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ApiKeyCredentialsProperty {
    val builder = CfnConnectorProfileApiKeyCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The basic auth credentials required for basic authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * BasicAuthCredentialsProperty basicAuthCredentialsProperty =
   * BasicAuthCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-basicauthcredentials.html)
   */
  public inline
      fun cfnConnectorProfileBasicAuthCredentialsProperty(block: CfnConnectorProfileBasicAuthCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.BasicAuthCredentialsProperty {
    val builder = CfnConnectorProfileBasicAuthCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Used by select connectors for which the OAuth workflow is supported, such as Salesforce, Google
   * Analytics, Marketo, Zendesk, and Slack.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ConnectorOAuthRequestProperty connectorOAuthRequestProperty =
   * ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectoroauthrequest.html)
   */
  public inline
      fun cfnConnectorProfileConnectorOAuthRequestProperty(block: CfnConnectorProfileConnectorOAuthRequestPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorOAuthRequestProperty {
    val builder = CfnConnectorProfileConnectorOAuthRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines the connector-specific configuration and credentials for the connector profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ConnectorProfileConfigProperty connectorProfileConfigProperty =
   * ConnectorProfileConfigProperty.builder()
   * .connectorProfileCredentials(ConnectorProfileCredentialsProperty.builder()
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
   * .build())
   * .connectorProfileProperties(ConnectorProfilePropertiesProperty.builder()
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
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileconfig.html)
   */
  public inline
      fun cfnConnectorProfileConnectorProfileConfigProperty(block: CfnConnectorProfileConnectorProfileConfigPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorProfileConfigProperty {
    val builder = CfnConnectorProfileConnectorProfileConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific credentials required by a connector.
   *
   * Example:
   *
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
  public inline
      fun cfnConnectorProfileConnectorProfileCredentialsProperty(block: CfnConnectorProfileConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required by each connector.
   *
   * Example:
   *
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
  public inline
      fun cfnConnectorProfileConnectorProfilePropertiesProperty(block: CfnConnectorProfileConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The custom credentials required for custom authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CustomAuthCredentialsProperty customAuthCredentialsProperty =
   * CustomAuthCredentialsProperty.builder()
   * .customAuthenticationType("customAuthenticationType")
   * // the properties below are optional
   * .credentialsMap(Map.of(
   * "credentialsMapKey", "credentialsMap"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customauthcredentials.html)
   */
  public inline
      fun cfnConnectorProfileCustomAuthCredentialsProperty(block: CfnConnectorProfileCustomAuthCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.CustomAuthCredentialsProperty {
    val builder = CfnConnectorProfileCustomAuthCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials that are required when using the custom connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CustomConnectorProfileCredentialsProperty customConnectorProfileCredentialsProperty =
   * CustomConnectorProfileCredentialsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileCustomConnectorProfileCredentialsProperty(block: CfnConnectorProfileCustomConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.CustomConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileCustomConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The profile properties required by the custom connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CustomConnectorProfilePropertiesProperty customConnectorProfilePropertiesProperty =
   * CustomConnectorProfilePropertiesProperty.builder()
   * .oAuth2Properties(OAuth2PropertiesProperty.builder()
   * .oAuth2GrantType("oAuth2GrantType")
   * .tokenUrl("tokenUrl")
   * .tokenUrlCustomProperties(Map.of(
   * "tokenUrlCustomPropertiesKey", "tokenUrlCustomProperties"))
   * .build())
   * .profileProperties(Map.of(
   * "profilePropertiesKey", "profileProperties"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileCustomConnectorProfilePropertiesProperty(block: CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.CustomConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific credentials required by Datadog.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DatadogConnectorProfileCredentialsProperty datadogConnectorProfileCredentialsProperty =
   * DatadogConnectorProfileCredentialsProperty.builder()
   * .apiKey("apiKey")
   * .applicationKey("applicationKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileDatadogConnectorProfileCredentialsProperty(block: CfnConnectorProfileDatadogConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileDatadogConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required by Datadog.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DatadogConnectorProfilePropertiesProperty datadogConnectorProfilePropertiesProperty =
   * DatadogConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileDatadogConnectorProfilePropertiesProperty(block: CfnConnectorProfileDatadogConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileDatadogConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required by Dynatrace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DynatraceConnectorProfileCredentialsProperty dynatraceConnectorProfileCredentialsProperty =
   * DynatraceConnectorProfileCredentialsProperty.builder()
   * .apiToken("apiToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileDynatraceConnectorProfileCredentialsProperty(block: CfnConnectorProfileDynatraceConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileDynatraceConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required by Dynatrace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DynatraceConnectorProfilePropertiesProperty dynatraceConnectorProfilePropertiesProperty =
   * DynatraceConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileDynatraceConnectorProfilePropertiesProperty(block: CfnConnectorProfileDynatraceConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileDynatraceConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required by Google Analytics.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * GoogleAnalyticsConnectorProfileCredentialsProperty
   * googleAnalyticsConnectorProfileCredentialsProperty =
   * GoogleAnalyticsConnectorProfileCredentialsProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * // the properties below are optional
   * .accessToken("accessToken")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsProperty(block: CfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required by Infor Nexus.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * InforNexusConnectorProfileCredentialsProperty inforNexusConnectorProfileCredentialsProperty =
   * InforNexusConnectorProfileCredentialsProperty.builder()
   * .accessKeyId("accessKeyId")
   * .datakey("datakey")
   * .secretAccessKey("secretAccessKey")
   * .userId("userId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileInforNexusConnectorProfileCredentialsProperty(block: CfnConnectorProfileInforNexusConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileInforNexusConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required by Infor Nexus.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * InforNexusConnectorProfilePropertiesProperty inforNexusConnectorProfilePropertiesProperty =
   * InforNexusConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileInforNexusConnectorProfilePropertiesProperty(block: CfnConnectorProfileInforNexusConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileInforNexusConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required by Marketo.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * MarketoConnectorProfileCredentialsProperty marketoConnectorProfileCredentialsProperty =
   * MarketoConnectorProfileCredentialsProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * // the properties below are optional
   * .accessToken("accessToken")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileMarketoConnectorProfileCredentialsProperty(block: CfnConnectorProfileMarketoConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileMarketoConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using Marketo.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * MarketoConnectorProfilePropertiesProperty marketoConnectorProfilePropertiesProperty =
   * MarketoConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileMarketoConnectorProfilePropertiesProperty(block: CfnConnectorProfileMarketoConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileMarketoConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The OAuth 2.0 credentials required for OAuth 2.0 authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * OAuth2CredentialsProperty oAuth2CredentialsProperty = OAuth2CredentialsProperty.builder()
   * .accessToken("accessToken")
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .oAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html)
   */
  public inline
      fun cfnConnectorProfileOAuth2CredentialsProperty(block: CfnConnectorProfileOAuth2CredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuth2CredentialsProperty {
    val builder = CfnConnectorProfileOAuth2CredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The OAuth 2.0 properties required for OAuth 2.0 authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * OAuth2PropertiesProperty oAuth2PropertiesProperty = OAuth2PropertiesProperty.builder()
   * .oAuth2GrantType("oAuth2GrantType")
   * .tokenUrl("tokenUrl")
   * .tokenUrlCustomProperties(Map.of(
   * "tokenUrlCustomPropertiesKey", "tokenUrlCustomProperties"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html)
   */
  public inline
      fun cfnConnectorProfileOAuth2PropertiesProperty(block: CfnConnectorProfileOAuth2PropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuth2PropertiesProperty {
    val builder = CfnConnectorProfileOAuth2PropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The OAuth credentials required for OAuth type authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * OAuthCredentialsProperty oAuthCredentialsProperty = OAuthCredentialsProperty.builder()
   * .accessToken("accessToken")
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html)
   */
  public inline
      fun cfnConnectorProfileOAuthCredentialsProperty(block: CfnConnectorProfileOAuthCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuthCredentialsProperty {
    val builder = CfnConnectorProfileOAuthCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The OAuth properties required for OAuth type authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * OAuthPropertiesProperty oAuthPropertiesProperty = OAuthPropertiesProperty.builder()
   * .authCodeUrl("authCodeUrl")
   * .oAuthScopes(List.of("oAuthScopes"))
   * .tokenUrl("tokenUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html)
   */
  public inline
      fun cfnConnectorProfileOAuthPropertiesProperty(block: CfnConnectorProfileOAuthPropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuthPropertiesProperty {
    val builder = CfnConnectorProfileOAuthPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * PardotConnectorProfileCredentialsProperty pardotConnectorProfileCredentialsProperty =
   * PardotConnectorProfileCredentialsProperty.builder()
   * .accessToken("accessToken")
   * .clientCredentialsArn("clientCredentialsArn")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfilePardotConnectorProfileCredentialsProperty(block: CfnConnectorProfilePardotConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.PardotConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfilePardotConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * PardotConnectorProfilePropertiesProperty pardotConnectorProfilePropertiesProperty =
   * PardotConnectorProfilePropertiesProperty.builder()
   * .businessUnitId("businessUnitId")
   * // the properties below are optional
   * .instanceUrl("instanceUrl")
   * .isSandboxEnvironment(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfilePardotConnectorProfilePropertiesProperty(block: CfnConnectorProfilePardotConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.PardotConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfilePardotConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnConnectorProfile`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CfnConnectorProfileProps cfnConnectorProfileProps = CfnConnectorProfileProps.builder()
   * .connectionMode("connectionMode")
   * .connectorProfileName("connectorProfileName")
   * .connectorType("connectorType")
   * // the properties below are optional
   * .connectorLabel("connectorLabel")
   * .connectorProfileConfig(ConnectorProfileConfigProperty.builder()
   * .connectorProfileCredentials(ConnectorProfileCredentialsProperty.builder()
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
   * .build())
   * .connectorProfileProperties(ConnectorProfilePropertiesProperty.builder()
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
   * .build())
   * .build())
   * .kmsArn("kmsArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html)
   */
  public inline fun cfnConnectorProfileProps(block: CfnConnectorProfilePropsDsl.() -> Unit = {}):
      CfnConnectorProfileProps {
    val builder = CfnConnectorProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Amazon Redshift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * RedshiftConnectorProfileCredentialsProperty redshiftConnectorProfileCredentialsProperty =
   * RedshiftConnectorProfileCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileRedshiftConnectorProfileCredentialsProperty(block: CfnConnectorProfileRedshiftConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileRedshiftConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties when using Amazon Redshift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * RedshiftConnectorProfilePropertiesProperty redshiftConnectorProfilePropertiesProperty =
   * RedshiftConnectorProfilePropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileRedshiftConnectorProfilePropertiesProperty(block: CfnConnectorProfileRedshiftConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileRedshiftConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using SAPOData.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SAPODataConnectorProfileCredentialsProperty sAPODataConnectorProfileCredentialsProperty =
   * SAPODataConnectorProfileCredentialsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileSAPODataConnectorProfileCredentialsProperty(block: CfnConnectorProfileSAPODataConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSAPODataConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using SAPOData.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SAPODataConnectorProfilePropertiesProperty sAPODataConnectorProfilePropertiesProperty =
   * SAPODataConnectorProfilePropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileSAPODataConnectorProfilePropertiesProperty(block: CfnConnectorProfileSAPODataConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSAPODataConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Salesforce.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SalesforceConnectorProfileCredentialsProperty salesforceConnectorProfileCredentialsProperty =
   * SalesforceConnectorProfileCredentialsProperty.builder()
   * .accessToken("accessToken")
   * .clientCredentialsArn("clientCredentialsArn")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .jwtToken("jwtToken")
   * .oAuth2GrantType("oAuth2GrantType")
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileSalesforceConnectorProfileCredentialsProperty(block: CfnConnectorProfileSalesforceConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSalesforceConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using Salesforce.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SalesforceConnectorProfilePropertiesProperty salesforceConnectorProfilePropertiesProperty =
   * SalesforceConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .isSandboxEnvironment(false)
   * .usePrivateLinkForMetadataAndAuthorization(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileSalesforceConnectorProfilePropertiesProperty(block: CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using ServiceNow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ServiceNowConnectorProfileCredentialsProperty serviceNowConnectorProfileCredentialsProperty =
   * ServiceNowConnectorProfileCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileServiceNowConnectorProfileCredentialsProperty(block: CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using ServiceNow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ServiceNowConnectorProfilePropertiesProperty serviceNowConnectorProfilePropertiesProperty =
   * ServiceNowConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileServiceNowConnectorProfilePropertiesProperty(block: CfnConnectorProfileServiceNowConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileServiceNowConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Singular.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SingularConnectorProfileCredentialsProperty singularConnectorProfileCredentialsProperty =
   * SingularConnectorProfileCredentialsProperty.builder()
   * .apiKey("apiKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-singularconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileSingularConnectorProfileCredentialsProperty(block: CfnConnectorProfileSingularConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SingularConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSingularConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Slack.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SlackConnectorProfileCredentialsProperty slackConnectorProfileCredentialsProperty =
   * SlackConnectorProfileCredentialsProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * // the properties below are optional
   * .accessToken("accessToken")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileSlackConnectorProfileCredentialsProperty(block: CfnConnectorProfileSlackConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SlackConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSlackConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using Slack.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SlackConnectorProfilePropertiesProperty slackConnectorProfilePropertiesProperty =
   * SlackConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileSlackConnectorProfilePropertiesProperty(block: CfnConnectorProfileSlackConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SlackConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSlackConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Snowflake.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SnowflakeConnectorProfileCredentialsProperty snowflakeConnectorProfileCredentialsProperty =
   * SnowflakeConnectorProfileCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileSnowflakeConnectorProfileCredentialsProperty(block: CfnConnectorProfileSnowflakeConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSnowflakeConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using Snowflake.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SnowflakeConnectorProfilePropertiesProperty snowflakeConnectorProfilePropertiesProperty =
   * SnowflakeConnectorProfilePropertiesProperty.builder()
   * .bucketName("bucketName")
   * .stage("stage")
   * .warehouse("warehouse")
   * // the properties below are optional
   * .accountName("accountName")
   * .bucketPrefix("bucketPrefix")
   * .privateLinkServiceName("privateLinkServiceName")
   * .region("region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileSnowflakeConnectorProfilePropertiesProperty(block: CfnConnectorProfileSnowflakeConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSnowflakeConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Trend Micro.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * TrendmicroConnectorProfileCredentialsProperty trendmicroConnectorProfileCredentialsProperty =
   * TrendmicroConnectorProfileCredentialsProperty.builder()
   * .apiSecretKey("apiSecretKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-trendmicroconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileTrendmicroConnectorProfileCredentialsProperty(block: CfnConnectorProfileTrendmicroConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileTrendmicroConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Veeva.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * VeevaConnectorProfileCredentialsProperty veevaConnectorProfileCredentialsProperty =
   * VeevaConnectorProfileCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileVeevaConnectorProfileCredentialsProperty(block: CfnConnectorProfileVeevaConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileVeevaConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using Veeva.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * VeevaConnectorProfilePropertiesProperty veevaConnectorProfilePropertiesProperty =
   * VeevaConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileVeevaConnectorProfilePropertiesProperty(block: CfnConnectorProfileVeevaConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileVeevaConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile credentials required when using Zendesk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ZendeskConnectorProfileCredentialsProperty zendeskConnectorProfileCredentialsProperty =
   * ZendeskConnectorProfileCredentialsProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * // the properties below are optional
   * .accessToken("accessToken")
   * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
   * .authCode("authCode")
   * .redirectUri("redirectUri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html)
   */
  public inline
      fun cfnConnectorProfileZendeskConnectorProfileCredentialsProperty(block: CfnConnectorProfileZendeskConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileZendeskConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connector-specific profile properties required when using Zendesk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ZendeskConnectorProfilePropertiesProperty zendeskConnectorProfilePropertiesProperty =
   * ZendeskConnectorProfilePropertiesProperty.builder()
   * .instanceUrl("instanceUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofileproperties.html)
   */
  public inline
      fun cfnConnectorProfileZendeskConnectorProfilePropertiesProperty(block: CfnConnectorProfileZendeskConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileZendeskConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnConnector`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
   * .connectorProvisioningConfig(ConnectorProvisioningConfigProperty.builder()
   * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build())
   * .connectorProvisioningType("connectorProvisioningType")
   * // the properties below are optional
   * .connectorLabel("connectorLabel")
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html)
   */
  public inline fun cfnConnectorProps(block: CfnConnectorPropsDsl.() -> Unit = {}):
      CfnConnectorProps {
    val builder = CfnConnectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::AppFlow::Flow` resource is an Amazon AppFlow resource type that specifies a new flow.
   *
   *
   * If you want to use AWS CloudFormation to create a connector profile for connectors that
   * implement OAuth (such as Salesforce, Slack, Zendesk, and Google Analytics), you must fetch the
   * access and refresh tokens. You can do this by implementing your own UI for OAuth, or by retrieving
   * the tokens from elsewhere. Alternatively, you can use the Amazon AppFlow console to create the
   * connector profile, and then use that connector profile in the flow creation CloudFormation
   * template.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CfnFlow cfnFlow = CfnFlow.Builder.create(this, "MyCfnFlow")
   * .destinationFlowConfigList(List.of(DestinationFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .destinationConnectorProperties(DestinationConnectorPropertiesProperty.builder()
   * .customConnector(CustomConnectorDestinationPropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .eventBridge(EventBridgeDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .lookoutMetrics(LookoutMetricsDestinationPropertiesProperty.builder()
   * .object("object")
   * .build())
   * .marketo(MarketoDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .redshift(RedshiftDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .s3(S3DestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * .preserveSourceDataTyping(false)
   * .build())
   * .build())
   * .salesforce(SalesforceDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .sapoData(SAPODataDestinationPropertiesProperty.builder()
   * .objectPath("objectPath")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .writeOperationType("writeOperationType")
   * .build())
   * .snowflake(SnowflakeDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .upsolver(UpsolverDestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * // the properties below are optional
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .build())
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .zendesk(ZendeskDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .build())
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .connectorProfileName("connectorProfileName")
   * .build()))
   * .flowName("flowName")
   * .sourceFlowConfig(SourceFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
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
   * .build())
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .connectorProfileName("connectorProfileName")
   * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build())
   * .build())
   * .tasks(List.of(TaskProperty.builder()
   * .sourceFields(List.of("sourceFields"))
   * .taskType("taskType")
   * // the properties below are optional
   * .connectorOperator(ConnectorOperatorProperty.builder()
   * .amplitude("amplitude")
   * .customConnector("customConnector")
   * .datadog("datadog")
   * .dynatrace("dynatrace")
   * .googleAnalytics("googleAnalytics")
   * .inforNexus("inforNexus")
   * .marketo("marketo")
   * .pardot("pardot")
   * .s3("s3")
   * .salesforce("salesforce")
   * .sapoData("sapoData")
   * .serviceNow("serviceNow")
   * .singular("singular")
   * .slack("slack")
   * .trendmicro("trendmicro")
   * .veeva("veeva")
   * .zendesk("zendesk")
   * .build())
   * .destinationField("destinationField")
   * .taskProperties(List.of(TaskPropertiesObjectProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .triggerConfig(TriggerConfigProperty.builder()
   * .triggerType("triggerType")
   * // the properties below are optional
   * .triggerProperties(ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .flowErrorDeactivationThreshold(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timeZone("timeZone")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .flowStatus("flowStatus")
   * .kmsArn("kmsArn")
   * .metadataCatalogConfig(MetadataCatalogConfigProperty.builder()
   * .glueDataCatalog(GlueDataCatalogProperty.builder()
   * .databaseName("databaseName")
   * .roleArn("roleArn")
   * .tablePrefix("tablePrefix")
   * .build())
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html)
   */
  public inline fun cfnFlow(
    scope: Construct,
    id: String,
    block: CfnFlowDsl.() -> Unit = {},
  ): CfnFlow {
    val builder = CfnFlowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The aggregation settings that you can use to customize the output format of your flow data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * AggregationConfigProperty aggregationConfigProperty = AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html)
   */
  public inline
      fun cfnFlowAggregationConfigProperty(block: CfnFlowAggregationConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.AggregationConfigProperty {
    val builder = CfnFlowAggregationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Amplitude is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * AmplitudeSourcePropertiesProperty amplitudeSourcePropertiesProperty =
   * AmplitudeSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-amplitudesourceproperties.html)
   */
  public inline
      fun cfnFlowAmplitudeSourcePropertiesProperty(block: CfnFlowAmplitudeSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.AmplitudeSourcePropertiesProperty {
    val builder = CfnFlowAmplitudeSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The operation to be performed on the provided source fields.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ConnectorOperatorProperty connectorOperatorProperty = ConnectorOperatorProperty.builder()
   * .amplitude("amplitude")
   * .customConnector("customConnector")
   * .datadog("datadog")
   * .dynatrace("dynatrace")
   * .googleAnalytics("googleAnalytics")
   * .inforNexus("inforNexus")
   * .marketo("marketo")
   * .pardot("pardot")
   * .s3("s3")
   * .salesforce("salesforce")
   * .sapoData("sapoData")
   * .serviceNow("serviceNow")
   * .singular("singular")
   * .slack("slack")
   * .trendmicro("trendmicro")
   * .veeva("veeva")
   * .zendesk("zendesk")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html)
   */
  public inline
      fun cfnFlowConnectorOperatorProperty(block: CfnFlowConnectorOperatorPropertyDsl.() -> Unit =
      {}): CfnFlow.ConnectorOperatorProperty {
    val builder = CfnFlowConnectorOperatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when the custom connector is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CustomConnectorDestinationPropertiesProperty customConnectorDestinationPropertiesProperty =
   * CustomConnectorDestinationPropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html)
   */
  public inline
      fun cfnFlowCustomConnectorDestinationPropertiesProperty(block: CfnFlowCustomConnectorDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.CustomConnectorDestinationPropertiesProperty {
    val builder = CfnFlowCustomConnectorDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when the custom connector is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CustomConnectorSourcePropertiesProperty customConnectorSourcePropertiesProperty =
   * CustomConnectorSourcePropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .dataTransferApi(DataTransferApiProperty.builder()
   * .name("name")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectorsourceproperties.html)
   */
  public inline
      fun cfnFlowCustomConnectorSourcePropertiesProperty(block: CfnFlowCustomConnectorSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.CustomConnectorSourcePropertiesProperty {
    val builder = CfnFlowCustomConnectorSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DataTransferApiProperty dataTransferApiProperty = DataTransferApiProperty.builder()
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html)
   */
  public inline
      fun cfnFlowDataTransferApiProperty(block: CfnFlowDataTransferApiPropertyDsl.() -> Unit = {}):
      CfnFlow.DataTransferApiProperty {
    val builder = CfnFlowDataTransferApiPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Datadog is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DatadogSourcePropertiesProperty datadogSourcePropertiesProperty =
   * DatadogSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datadogsourceproperties.html)
   */
  public inline
      fun cfnFlowDatadogSourcePropertiesProperty(block: CfnFlowDatadogSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.DatadogSourcePropertiesProperty {
    val builder = CfnFlowDatadogSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This stores the information that is required to query a particular connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DestinationConnectorPropertiesProperty destinationConnectorPropertiesProperty =
   * DestinationConnectorPropertiesProperty.builder()
   * .customConnector(CustomConnectorDestinationPropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .eventBridge(EventBridgeDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .lookoutMetrics(LookoutMetricsDestinationPropertiesProperty.builder()
   * .object("object")
   * .build())
   * .marketo(MarketoDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .redshift(RedshiftDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .s3(S3DestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * .preserveSourceDataTyping(false)
   * .build())
   * .build())
   * .salesforce(SalesforceDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .sapoData(SAPODataDestinationPropertiesProperty.builder()
   * .objectPath("objectPath")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .writeOperationType("writeOperationType")
   * .build())
   * .snowflake(SnowflakeDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .upsolver(UpsolverDestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * // the properties below are optional
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .build())
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .zendesk(ZendeskDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html)
   */
  public inline
      fun cfnFlowDestinationConnectorPropertiesProperty(block: CfnFlowDestinationConnectorPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.DestinationConnectorPropertiesProperty {
    val builder = CfnFlowDestinationConnectorPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the configuration of destination connectors present in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DestinationFlowConfigProperty destinationFlowConfigProperty =
   * DestinationFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .destinationConnectorProperties(DestinationConnectorPropertiesProperty.builder()
   * .customConnector(CustomConnectorDestinationPropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .eventBridge(EventBridgeDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .lookoutMetrics(LookoutMetricsDestinationPropertiesProperty.builder()
   * .object("object")
   * .build())
   * .marketo(MarketoDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .redshift(RedshiftDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .s3(S3DestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * .preserveSourceDataTyping(false)
   * .build())
   * .build())
   * .salesforce(SalesforceDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .sapoData(SAPODataDestinationPropertiesProperty.builder()
   * .objectPath("objectPath")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .writeOperationType("writeOperationType")
   * .build())
   * .snowflake(SnowflakeDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .upsolver(UpsolverDestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * // the properties below are optional
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .build())
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .zendesk(ZendeskDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .build())
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .connectorProfileName("connectorProfileName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html)
   */
  public inline
      fun cfnFlowDestinationFlowConfigProperty(block: CfnFlowDestinationFlowConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.DestinationFlowConfigProperty {
    val builder = CfnFlowDestinationFlowConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Dynatrace is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * DynatraceSourcePropertiesProperty dynatraceSourcePropertiesProperty =
   * DynatraceSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-dynatracesourceproperties.html)
   */
  public inline
      fun cfnFlowDynatraceSourcePropertiesProperty(block: CfnFlowDynatraceSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.DynatraceSourcePropertiesProperty {
    val builder = CfnFlowDynatraceSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The settings that determine how Amazon AppFlow handles an error when placing data in the
   * destination.
   *
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ErrorHandlingConfigProperty errorHandlingConfigProperty = ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html)
   */
  public inline
      fun cfnFlowErrorHandlingConfigProperty(block: CfnFlowErrorHandlingConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.ErrorHandlingConfigProperty {
    val builder = CfnFlowErrorHandlingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Amazon EventBridge is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * EventBridgeDestinationPropertiesProperty eventBridgeDestinationPropertiesProperty =
   * EventBridgeDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html)
   */
  public inline
      fun cfnFlowEventBridgeDestinationPropertiesProperty(block: CfnFlowEventBridgeDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.EventBridgeDestinationPropertiesProperty {
    val builder = CfnFlowEventBridgeDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Trigger settings of the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * GlueDataCatalogProperty glueDataCatalogProperty = GlueDataCatalogProperty.builder()
   * .databaseName("databaseName")
   * .roleArn("roleArn")
   * .tablePrefix("tablePrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html)
   */
  public inline
      fun cfnFlowGlueDataCatalogProperty(block: CfnFlowGlueDataCatalogPropertyDsl.() -> Unit = {}):
      CfnFlow.GlueDataCatalogProperty {
    val builder = CfnFlowGlueDataCatalogPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Google Analytics is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * GoogleAnalyticsSourcePropertiesProperty googleAnalyticsSourcePropertiesProperty =
   * GoogleAnalyticsSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-googleanalyticssourceproperties.html)
   */
  public inline
      fun cfnFlowGoogleAnalyticsSourcePropertiesProperty(block: CfnFlowGoogleAnalyticsSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.GoogleAnalyticsSourcePropertiesProperty {
    val builder = CfnFlowGoogleAnalyticsSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the configuration used when importing incremental records from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * IncrementalPullConfigProperty incrementalPullConfigProperty =
   * IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-incrementalpullconfig.html)
   */
  public inline
      fun cfnFlowIncrementalPullConfigProperty(block: CfnFlowIncrementalPullConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.IncrementalPullConfigProperty {
    val builder = CfnFlowIncrementalPullConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Infor Nexus is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * InforNexusSourcePropertiesProperty inforNexusSourcePropertiesProperty =
   * InforNexusSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-infornexussourceproperties.html)
   */
  public inline
      fun cfnFlowInforNexusSourcePropertiesProperty(block: CfnFlowInforNexusSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.InforNexusSourcePropertiesProperty {
    val builder = CfnFlowInforNexusSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Amazon Lookout for Metrics is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * LookoutMetricsDestinationPropertiesProperty lookoutMetricsDestinationPropertiesProperty =
   * LookoutMetricsDestinationPropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-lookoutmetricsdestinationproperties.html)
   */
  public inline
      fun cfnFlowLookoutMetricsDestinationPropertiesProperty(block: CfnFlowLookoutMetricsDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.LookoutMetricsDestinationPropertiesProperty {
    val builder = CfnFlowLookoutMetricsDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that Amazon AppFlow applies when you use Marketo as a flow destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * MarketoDestinationPropertiesProperty marketoDestinationPropertiesProperty =
   * MarketoDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketodestinationproperties.html)
   */
  public inline
      fun cfnFlowMarketoDestinationPropertiesProperty(block: CfnFlowMarketoDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.MarketoDestinationPropertiesProperty {
    val builder = CfnFlowMarketoDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Marketo is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * MarketoSourcePropertiesProperty marketoSourcePropertiesProperty =
   * MarketoSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-marketosourceproperties.html)
   */
  public inline
      fun cfnFlowMarketoSourcePropertiesProperty(block: CfnFlowMarketoSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.MarketoSourcePropertiesProperty {
    val builder = CfnFlowMarketoSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configurations of metadata catalog of the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * MetadataCatalogConfigProperty metadataCatalogConfigProperty =
   * MetadataCatalogConfigProperty.builder()
   * .glueDataCatalog(GlueDataCatalogProperty.builder()
   * .databaseName("databaseName")
   * .roleArn("roleArn")
   * .tablePrefix("tablePrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-metadatacatalogconfig.html)
   */
  public inline
      fun cfnFlowMetadataCatalogConfigProperty(block: CfnFlowMetadataCatalogConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.MetadataCatalogConfigProperty {
    val builder = CfnFlowMetadataCatalogConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * PardotSourcePropertiesProperty pardotSourcePropertiesProperty =
   * PardotSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-pardotsourceproperties.html)
   */
  public inline
      fun cfnFlowPardotSourcePropertiesProperty(block: CfnFlowPardotSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.PardotSourcePropertiesProperty {
    val builder = CfnFlowPardotSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies elements that Amazon AppFlow includes in the file and folder names in the flow
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * PrefixConfigProperty prefixConfigProperty = PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html)
   */
  public inline fun cfnFlowPrefixConfigProperty(block: CfnFlowPrefixConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.PrefixConfigProperty {
    val builder = CfnFlowPrefixConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnFlow`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * CfnFlowProps cfnFlowProps = CfnFlowProps.builder()
   * .destinationFlowConfigList(List.of(DestinationFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .destinationConnectorProperties(DestinationConnectorPropertiesProperty.builder()
   * .customConnector(CustomConnectorDestinationPropertiesProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .customProperties(Map.of(
   * "customPropertiesKey", "customProperties"))
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .eventBridge(EventBridgeDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .lookoutMetrics(LookoutMetricsDestinationPropertiesProperty.builder()
   * .object("object")
   * .build())
   * .marketo(MarketoDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .redshift(RedshiftDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .s3(S3DestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * .preserveSourceDataTyping(false)
   * .build())
   * .build())
   * .salesforce(SalesforceDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .sapoData(SAPODataDestinationPropertiesProperty.builder()
   * .objectPath("objectPath")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .writeOperationType("writeOperationType")
   * .build())
   * .snowflake(SnowflakeDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build())
   * .upsolver(UpsolverDestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * // the properties below are optional
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .build())
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .zendesk(ZendeskDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build())
   * .build())
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .connectorProfileName("connectorProfileName")
   * .build()))
   * .flowName("flowName")
   * .sourceFlowConfig(SourceFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
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
   * .build())
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .connectorProfileName("connectorProfileName")
   * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build())
   * .build())
   * .tasks(List.of(TaskProperty.builder()
   * .sourceFields(List.of("sourceFields"))
   * .taskType("taskType")
   * // the properties below are optional
   * .connectorOperator(ConnectorOperatorProperty.builder()
   * .amplitude("amplitude")
   * .customConnector("customConnector")
   * .datadog("datadog")
   * .dynatrace("dynatrace")
   * .googleAnalytics("googleAnalytics")
   * .inforNexus("inforNexus")
   * .marketo("marketo")
   * .pardot("pardot")
   * .s3("s3")
   * .salesforce("salesforce")
   * .sapoData("sapoData")
   * .serviceNow("serviceNow")
   * .singular("singular")
   * .slack("slack")
   * .trendmicro("trendmicro")
   * .veeva("veeva")
   * .zendesk("zendesk")
   * .build())
   * .destinationField("destinationField")
   * .taskProperties(List.of(TaskPropertiesObjectProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .triggerConfig(TriggerConfigProperty.builder()
   * .triggerType("triggerType")
   * // the properties below are optional
   * .triggerProperties(ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .flowErrorDeactivationThreshold(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timeZone("timeZone")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .flowStatus("flowStatus")
   * .kmsArn("kmsArn")
   * .metadataCatalogConfig(MetadataCatalogConfigProperty.builder()
   * .glueDataCatalog(GlueDataCatalogProperty.builder()
   * .databaseName("databaseName")
   * .roleArn("roleArn")
   * .tablePrefix("tablePrefix")
   * .build())
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html)
   */
  public inline fun cfnFlowProps(block: CfnFlowPropsDsl.() -> Unit = {}): CfnFlowProps {
    val builder = CfnFlowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Amazon Redshift is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * RedshiftDestinationPropertiesProperty redshiftDestinationPropertiesProperty =
   * RedshiftDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-redshiftdestinationproperties.html)
   */
  public inline
      fun cfnFlowRedshiftDestinationPropertiesProperty(block: CfnFlowRedshiftDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.RedshiftDestinationPropertiesProperty {
    val builder = CfnFlowRedshiftDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Amazon S3 is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * S3DestinationPropertiesProperty s3DestinationPropertiesProperty =
   * S3DestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * .preserveSourceDataTyping(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3destinationproperties.html)
   */
  public inline
      fun cfnFlowS3DestinationPropertiesProperty(block: CfnFlowS3DestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.S3DestinationPropertiesProperty {
    val builder = CfnFlowS3DestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * When you use Amazon S3 as the source, the configuration format that you provide the flow input
   * data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * S3InputFormatConfigProperty s3InputFormatConfigProperty = S3InputFormatConfigProperty.builder()
   * .s3InputFileType("s3InputFileType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3inputformatconfig.html)
   */
  public inline
      fun cfnFlowS3InputFormatConfigProperty(block: CfnFlowS3InputFormatConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.S3InputFormatConfigProperty {
    val builder = CfnFlowS3InputFormatConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration that determines how Amazon AppFlow should format the flow output data when
   * Amazon S3 is used as the destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * S3OutputFormatConfigProperty s3OutputFormatConfigProperty =
   * S3OutputFormatConfigProperty.builder()
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * .preserveSourceDataTyping(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html)
   */
  public inline
      fun cfnFlowS3OutputFormatConfigProperty(block: CfnFlowS3OutputFormatConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.S3OutputFormatConfigProperty {
    val builder = CfnFlowS3OutputFormatConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Amazon S3 is being used as the flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * S3SourcePropertiesProperty s3SourcePropertiesProperty = S3SourcePropertiesProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * // the properties below are optional
   * .s3InputFormatConfig(S3InputFormatConfigProperty.builder()
   * .s3InputFileType("s3InputFileType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html)
   */
  public inline
      fun cfnFlowS3SourcePropertiesProperty(block: CfnFlowS3SourcePropertiesPropertyDsl.() -> Unit =
      {}): CfnFlow.S3SourcePropertiesProperty {
    val builder = CfnFlowS3SourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when using SAPOData as a flow destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SAPODataDestinationPropertiesProperty sAPODataDestinationPropertiesProperty =
   * SAPODataDestinationPropertiesProperty.builder()
   * .objectPath("objectPath")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build())
   * .writeOperationType("writeOperationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html)
   */
  public inline
      fun cfnFlowSAPODataDestinationPropertiesProperty(block: CfnFlowSAPODataDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SAPODataDestinationPropertiesProperty {
    val builder = CfnFlowSAPODataDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when using SAPOData as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SAPODataSourcePropertiesProperty sAPODataSourcePropertiesProperty =
   * SAPODataSourcePropertiesProperty.builder()
   * .objectPath("objectPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html)
   */
  public inline
      fun cfnFlowSAPODataSourcePropertiesProperty(block: CfnFlowSAPODataSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SAPODataSourcePropertiesProperty {
    val builder = CfnFlowSAPODataSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Salesforce is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SalesforceDestinationPropertiesProperty salesforceDestinationPropertiesProperty =
   * SalesforceDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html)
   */
  public inline
      fun cfnFlowSalesforceDestinationPropertiesProperty(block: CfnFlowSalesforceDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SalesforceDestinationPropertiesProperty {
    val builder = CfnFlowSalesforceDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Salesforce is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SalesforceSourcePropertiesProperty salesforceSourcePropertiesProperty =
   * SalesforceSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .dataTransferApi("dataTransferApi")
   * .enableDynamicFieldUpdate(false)
   * .includeDeletedRecords(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html)
   */
  public inline
      fun cfnFlowSalesforceSourcePropertiesProperty(block: CfnFlowSalesforceSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SalesforceSourcePropertiesProperty {
    val builder = CfnFlowSalesforceSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the configuration details of a schedule-triggered flow as defined by the user.
   *
   * Currently, these settings only apply to the `Scheduled` trigger type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ScheduledTriggerPropertiesProperty scheduledTriggerPropertiesProperty =
   * ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .flowErrorDeactivationThreshold(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timeZone("timeZone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-scheduledtriggerproperties.html)
   */
  public inline
      fun cfnFlowScheduledTriggerPropertiesProperty(block: CfnFlowScheduledTriggerPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ScheduledTriggerPropertiesProperty {
    val builder = CfnFlowScheduledTriggerPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when ServiceNow is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ServiceNowSourcePropertiesProperty serviceNowSourcePropertiesProperty =
   * ServiceNowSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-servicenowsourceproperties.html)
   */
  public inline
      fun cfnFlowServiceNowSourcePropertiesProperty(block: CfnFlowServiceNowSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ServiceNowSourcePropertiesProperty {
    val builder = CfnFlowServiceNowSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Singular is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SingularSourcePropertiesProperty singularSourcePropertiesProperty =
   * SingularSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-singularsourceproperties.html)
   */
  public inline
      fun cfnFlowSingularSourcePropertiesProperty(block: CfnFlowSingularSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SingularSourcePropertiesProperty {
    val builder = CfnFlowSingularSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Slack is being used as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SlackSourcePropertiesProperty slackSourcePropertiesProperty =
   * SlackSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-slacksourceproperties.html)
   */
  public inline
      fun cfnFlowSlackSourcePropertiesProperty(block: CfnFlowSlackSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SlackSourcePropertiesProperty {
    val builder = CfnFlowSlackSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Snowflake is being used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SnowflakeDestinationPropertiesProperty snowflakeDestinationPropertiesProperty =
   * SnowflakeDestinationPropertiesProperty.builder()
   * .intermediateBucketName("intermediateBucketName")
   * .object("object")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-snowflakedestinationproperties.html)
   */
  public inline
      fun cfnFlowSnowflakeDestinationPropertiesProperty(block: CfnFlowSnowflakeDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SnowflakeDestinationPropertiesProperty {
    val builder = CfnFlowSnowflakeDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the information that is required to query a particular connector.
   *
   * Example:
   *
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
  public inline
      fun cfnFlowSourceConnectorPropertiesProperty(block: CfnFlowSourceConnectorPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SourceConnectorPropertiesProperty {
    val builder = CfnFlowSourceConnectorPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the configuration of the source connector used in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SourceFlowConfigProperty sourceFlowConfigProperty = SourceFlowConfigProperty.builder()
   * .connectorType("connectorType")
   * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
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
   * .build())
   * // the properties below are optional
   * .apiVersion("apiVersion")
   * .connectorProfileName("connectorProfileName")
   * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
   * .datetimeTypeFieldName("datetimeTypeFieldName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html)
   */
  public inline
      fun cfnFlowSourceFlowConfigProperty(block: CfnFlowSourceFlowConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.SourceFlowConfigProperty {
    val builder = CfnFlowSourceFlowConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Determines how Amazon AppFlow handles the success response that it gets from the connector
   * after placing data.
   *
   * For example, this setting would determine where to write the response from the destination
   * connector upon a successful insert operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * SuccessResponseHandlingConfigProperty successResponseHandlingConfigProperty =
   * SuccessResponseHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html)
   */
  public inline
      fun cfnFlowSuccessResponseHandlingConfigProperty(block: CfnFlowSuccessResponseHandlingConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.SuccessResponseHandlingConfigProperty {
    val builder = CfnFlowSuccessResponseHandlingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A map used to store task-related information.
   *
   * The execution service looks for particular information based on the `TaskType` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * TaskPropertiesObjectProperty taskPropertiesObjectProperty =
   * TaskPropertiesObjectProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html)
   */
  public inline
      fun cfnFlowTaskPropertiesObjectProperty(block: CfnFlowTaskPropertiesObjectPropertyDsl.() -> Unit
      = {}): CfnFlow.TaskPropertiesObjectProperty {
    val builder = CfnFlowTaskPropertiesObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A class for modeling different type of tasks.
   *
   * Task implementation varies based on the `TaskType` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * TaskProperty taskProperty = TaskProperty.builder()
   * .sourceFields(List.of("sourceFields"))
   * .taskType("taskType")
   * // the properties below are optional
   * .connectorOperator(ConnectorOperatorProperty.builder()
   * .amplitude("amplitude")
   * .customConnector("customConnector")
   * .datadog("datadog")
   * .dynatrace("dynatrace")
   * .googleAnalytics("googleAnalytics")
   * .inforNexus("inforNexus")
   * .marketo("marketo")
   * .pardot("pardot")
   * .s3("s3")
   * .salesforce("salesforce")
   * .sapoData("sapoData")
   * .serviceNow("serviceNow")
   * .singular("singular")
   * .slack("slack")
   * .trendmicro("trendmicro")
   * .veeva("veeva")
   * .zendesk("zendesk")
   * .build())
   * .destinationField("destinationField")
   * .taskProperties(List.of(TaskPropertiesObjectProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html)
   */
  public inline fun cfnFlowTaskProperty(block: CfnFlowTaskPropertyDsl.() -> Unit = {}):
      CfnFlow.TaskProperty {
    val builder = CfnFlowTaskPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when using Trend Micro as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * TrendmicroSourcePropertiesProperty trendmicroSourcePropertiesProperty =
   * TrendmicroSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-trendmicrosourceproperties.html)
   */
  public inline
      fun cfnFlowTrendmicroSourcePropertiesProperty(block: CfnFlowTrendmicroSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.TrendmicroSourcePropertiesProperty {
    val builder = CfnFlowTrendmicroSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
   * .triggerType("triggerType")
   * // the properties below are optional
   * .triggerProperties(ScheduledTriggerPropertiesProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .dataPullMode("dataPullMode")
   * .firstExecutionFrom(123)
   * .flowErrorDeactivationThreshold(123)
   * .scheduleEndTime(123)
   * .scheduleOffset(123)
   * .scheduleStartTime(123)
   * .timeZone("timeZone")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-triggerconfig.html)
   */
  public inline fun cfnFlowTriggerConfigProperty(block: CfnFlowTriggerConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.TriggerConfigProperty {
    val builder = CfnFlowTriggerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Upsolver is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * UpsolverDestinationPropertiesProperty upsolverDestinationPropertiesProperty =
   * UpsolverDestinationPropertiesProperty.builder()
   * .bucketName("bucketName")
   * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * // the properties below are optional
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .build())
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html)
   */
  public inline
      fun cfnFlowUpsolverDestinationPropertiesProperty(block: CfnFlowUpsolverDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.UpsolverDestinationPropertiesProperty {
    val builder = CfnFlowUpsolverDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration that determines how Amazon AppFlow formats the flow output data when Upsolver
   * is used as the destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * UpsolverS3OutputFormatConfigProperty upsolverS3OutputFormatConfigProperty =
   * UpsolverS3OutputFormatConfigProperty.builder()
   * .prefixConfig(PrefixConfigProperty.builder()
   * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
   * .prefixFormat("prefixFormat")
   * .prefixType("prefixType")
   * .build())
   * // the properties below are optional
   * .aggregationConfig(AggregationConfigProperty.builder()
   * .aggregationType("aggregationType")
   * .targetFileSize(123)
   * .build())
   * .fileType("fileType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html)
   */
  public inline
      fun cfnFlowUpsolverS3OutputFormatConfigProperty(block: CfnFlowUpsolverS3OutputFormatConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.UpsolverS3OutputFormatConfigProperty {
    val builder = CfnFlowUpsolverS3OutputFormatConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when using Veeva as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * VeevaSourcePropertiesProperty veevaSourcePropertiesProperty =
   * VeevaSourcePropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .documentType("documentType")
   * .includeAllVersions(false)
   * .includeRenditions(false)
   * .includeSourceFiles(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html)
   */
  public inline
      fun cfnFlowVeevaSourcePropertiesProperty(block: CfnFlowVeevaSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.VeevaSourcePropertiesProperty {
    val builder = CfnFlowVeevaSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when Zendesk is used as a destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ZendeskDestinationPropertiesProperty zendeskDestinationPropertiesProperty =
   * ZendeskDestinationPropertiesProperty.builder()
   * .object("object")
   * // the properties below are optional
   * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .failOnFirstError(false)
   * .build())
   * .idFieldNames(List.of("idFieldNames"))
   * .writeOperationType("writeOperationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html)
   */
  public inline
      fun cfnFlowZendeskDestinationPropertiesProperty(block: CfnFlowZendeskDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ZendeskDestinationPropertiesProperty {
    val builder = CfnFlowZendeskDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties that are applied when using Zendesk as a flow source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appflow.*;
   * ZendeskSourcePropertiesProperty zendeskSourcePropertiesProperty =
   * ZendeskSourcePropertiesProperty.builder()
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendesksourceproperties.html)
   */
  public inline
      fun cfnFlowZendeskSourcePropertiesProperty(block: CfnFlowZendeskSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ZendeskSourcePropertiesProperty {
    val builder = CfnFlowZendeskSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
