@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnectorProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appflow.*;
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
 * .oAuth2Credentials(OAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .oAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build())
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
public interface CfnConnectorProfileProps {
  /**
   * Indicates the connection mode and if it is public or private.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
   */
  public fun connectionMode(): String

  /**
   * The label for the connector profile being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
   */
  public fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  /**
   * Defines the connector-specific configuration and credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
   */
  public fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

  /**
   * The name of the connector profile.
   *
   * The name is unique for each `ConnectorProfile` in the AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
   */
  public fun connectorProfileName(): String

  /**
   * The type of connector, such as Salesforce, Amplitude, and so on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
   */
  public fun connectorType(): String

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   *
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
   */
  public fun kmsArn(): String? = unwrap(this).getKmsArn()

  /**
   * A builder for [CfnConnectorProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionMode Indicates the connection mode and if it is public or private. 
     */
    public fun connectionMode(connectionMode: String)

    /**
     * @param connectorLabel The label for the connector profile being created.
     */
    public fun connectorLabel(connectorLabel: String)

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    public fun connectorProfileConfig(connectorProfileConfig: IResolvable)

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    public
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty)

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a09bc0e0ef2d9eac369cb93da67873d848462a6b911454736f0cca39e400e31e")
    public
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit)

    /**
     * @param connectorProfileName The name of the connector profile. 
     * The name is unique for each `ConnectorProfile` in the AWS account .
     */
    public fun connectorProfileName(connectorProfileName: String)

    /**
     * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
     */
    public fun connectorType(connectorType: String)

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    public fun kmsArn(kmsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.Builder
        = software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.builder()

    /**
     * @param connectionMode Indicates the connection mode and if it is public or private. 
     */
    override fun connectionMode(connectionMode: String) {
      cdkBuilder.connectionMode(connectionMode)
    }

    /**
     * @param connectorLabel The label for the connector profile being created.
     */
    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    override fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(IResolvable::unwrap))
    }

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    override
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(CfnConnectorProfile.ConnectorProfileConfigProperty::unwrap))
    }

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a09bc0e0ef2d9eac369cb93da67873d848462a6b911454736f0cca39e400e31e")
    override
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProfileConfig(CfnConnectorProfile.ConnectorProfileConfigProperty(connectorProfileConfig))

    /**
     * @param connectorProfileName The name of the connector profile. 
     * The name is unique for each `ConnectorProfile` in the AWS account .
     */
    override fun connectorProfileName(connectorProfileName: String) {
      cdkBuilder.connectorProfileName(connectorProfileName)
    }

    /**
     * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
     */
    override fun connectorType(connectorType: String) {
      cdkBuilder.connectorType(connectorType)
    }

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps,
  ) : CdkObject(cdkObject), CfnConnectorProfileProps {
    /**
     * Indicates the connection mode and if it is public or private.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
     */
    override fun connectionMode(): String = unwrap(this).getConnectionMode()

    /**
     * The label for the connector profile being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
     */
    override fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     */
    override fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

    /**
     * The name of the connector profile.
     *
     * The name is unique for each `ConnectorProfile` in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
     */
    override fun connectorProfileName(): String = unwrap(this).getConnectorProfileName()

    /**
     * The type of connector, such as Salesforce, Amplitude, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
     */
    override fun connectorType(): String = unwrap(this).getConnectorType()

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
     */
    override fun kmsArn(): String? = unwrap(this).getKmsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps):
        CfnConnectorProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProfileProps):
        software.amazon.awscdk.services.appflow.CfnConnectorProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
  }
}
