@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Glue::Connection` resource specifies an AWS Glue connection to a data source.
 *
 * For more information, see [Adding a Connection to Your Data
 * Store](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html) and [Connection
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-connections.html#aws-glue-api-catalog-connections-Connection)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object athenaProperties;
 * Object connectionProperties;
 * Object customAuthenticationCredentials;
 * Object pythonProperties;
 * Object sparkProperties;
 * Object tokenUrlParametersMap;
 * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
 * .catalogId("catalogId")
 * .connectionInput(ConnectionInputProperty.builder()
 * .connectionType("connectionType")
 * // the properties below are optional
 * .athenaProperties(athenaProperties)
 * .authenticationConfiguration(AuthenticationConfigurationInputProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .basicAuthenticationCredentials(BasicAuthenticationCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .customAuthenticationCredentials(customAuthenticationCredentials)
 * .kmsKeyArn("kmsKeyArn")
 * .oAuth2Properties(OAuth2PropertiesInputProperty.builder()
 * .authorizationCodeProperties(AuthorizationCodePropertiesProperty.builder()
 * .authorizationCode("authorizationCode")
 * .redirectUri("redirectUri")
 * .build())
 * .oAuth2ClientApplication(OAuth2ClientApplicationProperty.builder()
 * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
 * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
 * .build())
 * .oAuth2Credentials(OAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .jwtToken("jwtToken")
 * .refreshToken("refreshToken")
 * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
 * .build())
 * .oAuth2GrantType("oAuth2GrantType")
 * .tokenUrl("tokenUrl")
 * .tokenUrlParametersMap(tokenUrlParametersMap)
 * .build())
 * .secretArn("secretArn")
 * .build())
 * .connectionProperties(connectionProperties)
 * .description("description")
 * .matchCriteria(List.of("matchCriteria"))
 * .name("name")
 * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
 * .availabilityZone("availabilityZone")
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetId("subnetId")
 * .build())
 * .pythonProperties(pythonProperties)
 * .sparkProperties(sparkProperties)
 * .validateCredentials(false)
 * .validateForComputeEnvironments(List.of("validateForComputeEnvironments"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
 */
public open class CfnConnection(
  cdkObject: software.amazon.awscdk.services.glue.CfnConnection,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the data catalog to create the catalog object in.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The ID of the data catalog to create the catalog object in.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The connection that you want to create.
   */
  public open fun connectionInput(): Any = unwrap(this).getConnectionInput()

  /**
   * The connection that you want to create.
   */
  public open fun connectionInput(`value`: IResolvable) {
    unwrap(this).setConnectionInput(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The connection that you want to create.
   */
  public open fun connectionInput(`value`: ConnectionInputProperty) {
    unwrap(this).setConnectionInput(`value`.let(ConnectionInputProperty.Companion::unwrap))
  }

  /**
   * The connection that you want to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a70800f54815623ec235f1815fbe11bc942a5c51fe4a2ece00cb57e3b9c23b41")
  public open fun connectionInput(`value`: ConnectionInputProperty.Builder.() -> Unit): Unit =
      connectionInput(ConnectionInputProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the data catalog to create the catalog object in.
     *
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
     * @param catalogId The ID of the data catalog to create the catalog object in. 
     */
    public fun catalogId(catalogId: String)

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    public fun connectionInput(connectionInput: IResolvable)

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    public fun connectionInput(connectionInput: ConnectionInputProperty)

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c054d79a6f4f180cc0bb153a4582bd3bf2eb5bd1d65394592303eaf70bb55bab")
    public fun connectionInput(connectionInput: ConnectionInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnConnection.Builder =
        software.amazon.awscdk.services.glue.CfnConnection.Builder.create(scope, id)

    /**
     * The ID of the data catalog to create the catalog object in.
     *
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
     * @param catalogId The ID of the data catalog to create the catalog object in. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    override fun connectionInput(connectionInput: IResolvable) {
      cdkBuilder.connectionInput(connectionInput.let(IResolvable.Companion::unwrap))
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    override fun connectionInput(connectionInput: ConnectionInputProperty) {
      cdkBuilder.connectionInput(connectionInput.let(ConnectionInputProperty.Companion::unwrap))
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c054d79a6f4f180cc0bb153a4582bd3bf2eb5bd1d65394592303eaf70bb55bab")
    override fun connectionInput(connectionInput: ConnectionInputProperty.Builder.() -> Unit): Unit
        = connectionInput(ConnectionInputProperty(connectionInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnConnection = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection): CfnConnection
        = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection): software.amazon.awscdk.services.glue.CfnConnection
        = wrapped.cdkObject as software.amazon.awscdk.services.glue.CfnConnection
  }

  /**
   * A structure containing the authentication configuration in the CreateConnection request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object customAuthenticationCredentials;
   * Object tokenUrlParametersMap;
   * AuthenticationConfigurationInputProperty authenticationConfigurationInputProperty =
   * AuthenticationConfigurationInputProperty.builder()
   * .authenticationType("authenticationType")
   * // the properties below are optional
   * .basicAuthenticationCredentials(BasicAuthenticationCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build())
   * .customAuthenticationCredentials(customAuthenticationCredentials)
   * .kmsKeyArn("kmsKeyArn")
   * .oAuth2Properties(OAuth2PropertiesInputProperty.builder()
   * .authorizationCodeProperties(AuthorizationCodePropertiesProperty.builder()
   * .authorizationCode("authorizationCode")
   * .redirectUri("redirectUri")
   * .build())
   * .oAuth2ClientApplication(OAuth2ClientApplicationProperty.builder()
   * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
   * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
   * .build())
   * .oAuth2Credentials(OAuth2CredentialsProperty.builder()
   * .accessToken("accessToken")
   * .jwtToken("jwtToken")
   * .refreshToken("refreshToken")
   * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
   * .build())
   * .oAuth2GrantType("oAuth2GrantType")
   * .tokenUrl("tokenUrl")
   * .tokenUrlParametersMap(tokenUrlParametersMap)
   * .build())
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html)
   */
  public interface AuthenticationConfigurationInputProperty {
    /**
     * A structure containing the authentication configuration in the CreateConnection request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-authenticationtype)
     */
    public fun authenticationType(): String

    /**
     * The credentials used when the authentication type is basic authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-basicauthenticationcredentials)
     */
    public fun basicAuthenticationCredentials(): Any? =
        unwrap(this).getBasicAuthenticationCredentials()

    /**
     * The credentials used when the authentication type is custom authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-customauthenticationcredentials)
     */
    public fun customAuthenticationCredentials(): Any? =
        unwrap(this).getCustomAuthenticationCredentials()

    /**
     * The ARN of the KMS key used to encrypt the connection.
     *
     * Only taken an as input in the request and stored in the Secret Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The properties for OAuth2 authentication in the CreateConnection request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-oauth2properties)
     */
    public fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

    /**
     * The secret manager ARN to store credentials in the CreateConnection request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [AuthenticationConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationType A structure containing the authentication configuration in the
       * CreateConnection request. 
       */
      public fun authenticationType(authenticationType: String)

      /**
       * @param basicAuthenticationCredentials The credentials used when the authentication type is
       * basic authentication.
       */
      public fun basicAuthenticationCredentials(basicAuthenticationCredentials: IResolvable)

      /**
       * @param basicAuthenticationCredentials The credentials used when the authentication type is
       * basic authentication.
       */
      public
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty)

      /**
       * @param basicAuthenticationCredentials The credentials used when the authentication type is
       * basic authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42d2cb05019f7839f369217e0ed6e3a109978192052849e8ce940ecfe2b8348b")
      public
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty.Builder.() -> Unit)

      /**
       * @param customAuthenticationCredentials The credentials used when the authentication type is
       * custom authentication.
       */
      public fun customAuthenticationCredentials(customAuthenticationCredentials: Any)

      /**
       * @param kmsKeyArn The ARN of the KMS key used to encrypt the connection.
       * Only taken an as input in the request and stored in the Secret Manager.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param oAuth2Properties The properties for OAuth2 authentication in the CreateConnection
       * request.
       */
      public fun oAuth2Properties(oAuth2Properties: IResolvable)

      /**
       * @param oAuth2Properties The properties for OAuth2 authentication in the CreateConnection
       * request.
       */
      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesInputProperty)

      /**
       * @param oAuth2Properties The properties for OAuth2 authentication in the CreateConnection
       * request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2ee1bdfcc1f1cf5a40e6f3fa66d6cedab18274c0061c05c9eb33904878ce195")
      public
          fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param secretArn The secret manager ARN to store credentials in the CreateConnection
       * request.
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty.builder()

      /**
       * @param authenticationType A structure containing the authentication configuration in the
       * CreateConnection request. 
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      /**
       * @param basicAuthenticationCredentials The credentials used when the authentication type is
       * basic authentication.
       */
      override fun basicAuthenticationCredentials(basicAuthenticationCredentials: IResolvable) {
        cdkBuilder.basicAuthenticationCredentials(basicAuthenticationCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param basicAuthenticationCredentials The credentials used when the authentication type is
       * basic authentication.
       */
      override
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty) {
        cdkBuilder.basicAuthenticationCredentials(basicAuthenticationCredentials.let(BasicAuthenticationCredentialsProperty.Companion::unwrap))
      }

      /**
       * @param basicAuthenticationCredentials The credentials used when the authentication type is
       * basic authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42d2cb05019f7839f369217e0ed6e3a109978192052849e8ce940ecfe2b8348b")
      override
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty.Builder.() -> Unit):
          Unit =
          basicAuthenticationCredentials(BasicAuthenticationCredentialsProperty(basicAuthenticationCredentials))

      /**
       * @param customAuthenticationCredentials The credentials used when the authentication type is
       * custom authentication.
       */
      override fun customAuthenticationCredentials(customAuthenticationCredentials: Any) {
        cdkBuilder.customAuthenticationCredentials(customAuthenticationCredentials)
      }

      /**
       * @param kmsKeyArn The ARN of the KMS key used to encrypt the connection.
       * Only taken an as input in the request and stored in the Secret Manager.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param oAuth2Properties The properties for OAuth2 authentication in the CreateConnection
       * request.
       */
      override fun oAuth2Properties(oAuth2Properties: IResolvable) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2Properties The properties for OAuth2 authentication in the CreateConnection
       * request.
       */
      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesInputProperty) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(OAuth2PropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2Properties The properties for OAuth2 authentication in the CreateConnection
       * request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2ee1bdfcc1f1cf5a40e6f3fa66d6cedab18274c0061c05c9eb33904878ce195")
      override
          fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesInputProperty.Builder.() -> Unit):
          Unit = oAuth2Properties(OAuth2PropertiesInputProperty(oAuth2Properties))

      /**
       * @param secretArn The secret manager ARN to store credentials in the CreateConnection
       * request.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty,
    ) : CdkObject(cdkObject),
        AuthenticationConfigurationInputProperty {
      /**
       * A structure containing the authentication configuration in the CreateConnection request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-authenticationtype)
       */
      override fun authenticationType(): String = unwrap(this).getAuthenticationType()

      /**
       * The credentials used when the authentication type is basic authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-basicauthenticationcredentials)
       */
      override fun basicAuthenticationCredentials(): Any? =
          unwrap(this).getBasicAuthenticationCredentials()

      /**
       * The credentials used when the authentication type is custom authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-customauthenticationcredentials)
       */
      override fun customAuthenticationCredentials(): Any? =
          unwrap(this).getCustomAuthenticationCredentials()

      /**
       * The ARN of the KMS key used to encrypt the connection.
       *
       * Only taken an as input in the request and stored in the Secret Manager.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The properties for OAuth2 authentication in the CreateConnection request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-oauth2properties)
       */
      override fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

      /**
       * The secret manager ARN to store credentials in the CreateConnection request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authenticationconfigurationinput.html#cfn-glue-connection-authenticationconfigurationinput-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty):
          AuthenticationConfigurationInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthenticationConfigurationInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationInputProperty):
          software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.AuthenticationConfigurationInputProperty
    }
  }

  /**
   * The set of properties required for the the OAuth2 `AUTHORIZATION_CODE` grant type workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * AuthorizationCodePropertiesProperty authorizationCodePropertiesProperty =
   * AuthorizationCodePropertiesProperty.builder()
   * .authorizationCode("authorizationCode")
   * .redirectUri("redirectUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authorizationcodeproperties.html)
   */
  public interface AuthorizationCodePropertiesProperty {
    /**
     * An authorization code to be used in the third leg of the `AUTHORIZATION_CODE` grant workflow.
     *
     * This is a single-use code which becomes invalid once exchanged for an access token, thus it
     * is acceptable to have this value as a request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authorizationcodeproperties.html#cfn-glue-connection-authorizationcodeproperties-authorizationcode)
     */
    public fun authorizationCode(): String? = unwrap(this).getAuthorizationCode()

    /**
     * The redirect URI where the user gets redirected to by authorization server when issuing an
     * authorization code.
     *
     * The URI is subsequently used when the authorization code is exchanged for an access token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authorizationcodeproperties.html#cfn-glue-connection-authorizationcodeproperties-redirecturi)
     */
    public fun redirectUri(): String? = unwrap(this).getRedirectUri()

    /**
     * A builder for [AuthorizationCodePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationCode An authorization code to be used in the third leg of the
       * `AUTHORIZATION_CODE` grant workflow.
       * This is a single-use code which becomes invalid once exchanged for an access token, thus it
       * is acceptable to have this value as a request parameter.
       */
      public fun authorizationCode(authorizationCode: String)

      /**
       * @param redirectUri The redirect URI where the user gets redirected to by authorization
       * server when issuing an authorization code.
       * The URI is subsequently used when the authorization code is exchanged for an access token.
       */
      public fun redirectUri(redirectUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty.builder()

      /**
       * @param authorizationCode An authorization code to be used in the third leg of the
       * `AUTHORIZATION_CODE` grant workflow.
       * This is a single-use code which becomes invalid once exchanged for an access token, thus it
       * is acceptable to have this value as a request parameter.
       */
      override fun authorizationCode(authorizationCode: String) {
        cdkBuilder.authorizationCode(authorizationCode)
      }

      /**
       * @param redirectUri The redirect URI where the user gets redirected to by authorization
       * server when issuing an authorization code.
       * The URI is subsequently used when the authorization code is exchanged for an access token.
       */
      override fun redirectUri(redirectUri: String) {
        cdkBuilder.redirectUri(redirectUri)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty,
    ) : CdkObject(cdkObject),
        AuthorizationCodePropertiesProperty {
      /**
       * An authorization code to be used in the third leg of the `AUTHORIZATION_CODE` grant
       * workflow.
       *
       * This is a single-use code which becomes invalid once exchanged for an access token, thus it
       * is acceptable to have this value as a request parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authorizationcodeproperties.html#cfn-glue-connection-authorizationcodeproperties-authorizationcode)
       */
      override fun authorizationCode(): String? = unwrap(this).getAuthorizationCode()

      /**
       * The redirect URI where the user gets redirected to by authorization server when issuing an
       * authorization code.
       *
       * The URI is subsequently used when the authorization code is exchanged for an access token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-authorizationcodeproperties.html#cfn-glue-connection-authorizationcodeproperties-redirecturi)
       */
      override fun redirectUri(): String? = unwrap(this).getRedirectUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthorizationCodePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty):
          AuthorizationCodePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthorizationCodePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationCodePropertiesProperty):
          software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.AuthorizationCodePropertiesProperty
    }
  }

  /**
   * For supplying basic auth credentials when not providing a `SecretArn` value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * BasicAuthenticationCredentialsProperty basicAuthenticationCredentialsProperty =
   * BasicAuthenticationCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-basicauthenticationcredentials.html)
   */
  public interface BasicAuthenticationCredentialsProperty {
    /**
     * The password to connect to the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-basicauthenticationcredentials.html#cfn-glue-connection-basicauthenticationcredentials-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The username to connect to the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-basicauthenticationcredentials.html#cfn-glue-connection-basicauthenticationcredentials-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [BasicAuthenticationCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password to connect to the data source.
       */
      public fun password(password: String)

      /**
       * @param username The username to connect to the data source.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty.builder()

      /**
       * @param password The password to connect to the data source.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The username to connect to the data source.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty,
    ) : CdkObject(cdkObject),
        BasicAuthenticationCredentialsProperty {
      /**
       * The password to connect to the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-basicauthenticationcredentials.html#cfn-glue-connection-basicauthenticationcredentials-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The username to connect to the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-basicauthenticationcredentials.html#cfn-glue-connection-basicauthenticationcredentials-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BasicAuthenticationCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty):
          BasicAuthenticationCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BasicAuthenticationCredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthenticationCredentialsProperty):
          software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.BasicAuthenticationCredentialsProperty
    }
  }

  /**
   * A structure that is used to specify a connection to create or update.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object athenaProperties;
   * Object connectionProperties;
   * Object customAuthenticationCredentials;
   * Object pythonProperties;
   * Object sparkProperties;
   * Object tokenUrlParametersMap;
   * ConnectionInputProperty connectionInputProperty = ConnectionInputProperty.builder()
   * .connectionType("connectionType")
   * // the properties below are optional
   * .athenaProperties(athenaProperties)
   * .authenticationConfiguration(AuthenticationConfigurationInputProperty.builder()
   * .authenticationType("authenticationType")
   * // the properties below are optional
   * .basicAuthenticationCredentials(BasicAuthenticationCredentialsProperty.builder()
   * .password("password")
   * .username("username")
   * .build())
   * .customAuthenticationCredentials(customAuthenticationCredentials)
   * .kmsKeyArn("kmsKeyArn")
   * .oAuth2Properties(OAuth2PropertiesInputProperty.builder()
   * .authorizationCodeProperties(AuthorizationCodePropertiesProperty.builder()
   * .authorizationCode("authorizationCode")
   * .redirectUri("redirectUri")
   * .build())
   * .oAuth2ClientApplication(OAuth2ClientApplicationProperty.builder()
   * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
   * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
   * .build())
   * .oAuth2Credentials(OAuth2CredentialsProperty.builder()
   * .accessToken("accessToken")
   * .jwtToken("jwtToken")
   * .refreshToken("refreshToken")
   * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
   * .build())
   * .oAuth2GrantType("oAuth2GrantType")
   * .tokenUrl("tokenUrl")
   * .tokenUrlParametersMap(tokenUrlParametersMap)
   * .build())
   * .secretArn("secretArn")
   * .build())
   * .connectionProperties(connectionProperties)
   * .description("description")
   * .matchCriteria(List.of("matchCriteria"))
   * .name("name")
   * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
   * .availabilityZone("availabilityZone")
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetId("subnetId")
   * .build())
   * .pythonProperties(pythonProperties)
   * .sparkProperties(sparkProperties)
   * .validateCredentials(false)
   * .validateForComputeEnvironments(List.of("validateForComputeEnvironments"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html)
   */
  public interface ConnectionInputProperty {
    /**
     * Connection properties specific to the Athena compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-athenaproperties)
     */
    public fun athenaProperties(): Any? = unwrap(this).getAthenaProperties()

    /**
     * The authentication properties of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-authenticationconfiguration)
     */
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    /**
     * These key-value pairs define parameters for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
     */
    public fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

    /**
     * The type of the connection. Currently, these types are supported:.
     *
     * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
     *
     * `JDBC` Connections use the following ConnectionParameters.
     *
     * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
     * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
     * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
     * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
     * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
     *
     * `KAFKA` Connections use the following ConnectionParameters.
     *
     * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
     * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION` .
     * These parameters are used to configure SSL with `KAFKA` .
     * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
     * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
     * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
     * configuration with SSL in `KAFKA` .
     * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
     * `AWS_MSK_IAM` .
     * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
     * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
     * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
     * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
     * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
     * configure SASL/GSSAPI authentication with `KAFKA` .
     * * `MONGODB` - Designates a connection to a MongoDB document database.
     *
     * `MONGODB` Connections use the following ConnectionParameters.
     *
     * * Required: `CONNECTION_URL` .
     * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
     * * `VIEW_VALIDATION_REDSHIFT` - Designates a connection used for view validation by Amazon
     * Redshift.
     * * `VIEW_VALIDATION_ATHENA` - Designates a connection used for view validation by Amazon
     * Athena.
     * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
     * Private Cloud environment (Amazon VPC).
     *
     * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     *
     * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
     * Marketplace to read from and write to data stores that are not natively supported by AWS Glue .
     *
     * `MARKETPLACE` Connections use the following ConnectionParameters.
     *
     * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL` .
     * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
     * `SECRET_ID` .
     * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
     * write to data stores that are not natively supported by AWS Glue .
     *
     * Additionally, a `ConnectionType` for the following SaaS connectors is supported:
     *
     * * `FACEBOOKADS` - Designates a connection to Facebook Ads.
     * * `GOOGLEADS` - Designates a connection to Google Ads.
     * * `GOOGLESHEETS` - Designates a connection to Google Sheets.
     * * `GOOGLEANALYTICS4` - Designates a connection to Google Analytics 4.
     * * `HUBSPOT` - Designates a connection to HubSpot.
     * * `INSTAGRAMADS` - Designates a connection to Instagram Ads.
     * * `INTERCOM` - Designates a connection to Intercom.
     * * `JIRACLOUD` - Designates a connection to Jira Cloud.
     * * `MARKETO` - Designates a connection to Adobe Marketo Engage.
     * * `NETSUITEERP` - Designates a connection to Oracle NetSuite.
     * * `SALESFORCE` - Designates a connection to Salesforce using OAuth authentication.
     * * `SALESFORCEMARKETINGCLOUD` - Designates a connection to Salesforce Marketing Cloud.
     * * `SALESFORCEPARDOT` - Designates a connection to Salesforce Marketing Cloud Account
     * Engagement (MCAE).
     * * `SAPODATA` - Designates a connection to SAP OData.
     * * `SERVICENOW` - Designates a connection to ServiceNow.
     * * `SLACK` - Designates a connection to Slack.
     * * `SNAPCHATADS` - Designates a connection to Snapchat Ads.
     * * `STRIPE` - Designates a connection to Stripe.
     * * `ZENDESK` - Designates a connection to Zendesk.
     * * `ZOHOCRM` - Designates a connection to Zoho CRM.
     *
     * For more information on the connection parameters needed for a particular connector, see the
     * documentation for the connector in [Adding an AWS Glue
     * connection](https://docs.aws.amazon.com/glue/latest/dg/console-connections.html) in the AWS Glue
     * User Guide.
     *
     * `SFTP` is not supported.
     *
     * For more information about how optional ConnectionProperties are used to configure features
     * in AWS Glue , consult [AWS Glue connection
     * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
     *
     * For more information about how optional ConnectionProperties are used to configure features
     * in AWS Glue Studio, consult [Using connectors and
     * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
     */
    public fun connectionType(): String

    /**
     * The description of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of criteria that can be used in selecting this connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
     */
    public fun matchCriteria(): List<String> = unwrap(this).getMatchCriteria() ?: emptyList()

    /**
     * The name of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The physical connection requirements, such as virtual private cloud (VPC) and `SecurityGroup`
     * , that are needed to successfully make this connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
     */
    public fun physicalConnectionRequirements(): Any? =
        unwrap(this).getPhysicalConnectionRequirements()

    /**
     * Connection properties specific to the Python compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-pythonproperties)
     */
    public fun pythonProperties(): Any? = unwrap(this).getPythonProperties()

    /**
     * Connection properties specific to the Spark compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-sparkproperties)
     */
    public fun sparkProperties(): Any? = unwrap(this).getSparkProperties()

    /**
     * A flag to validate the credentials during create connection.
     *
     * Default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-validatecredentials)
     */
    public fun validateCredentials(): Any? = unwrap(this).getValidateCredentials()

    /**
     * The compute environments that the specified connection properties are validated against.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-validateforcomputeenvironments)
     */
    public fun validateForComputeEnvironments(): List<String> =
        unwrap(this).getValidateForComputeEnvironments() ?: emptyList()

    /**
     * A builder for [ConnectionInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param athenaProperties Connection properties specific to the Athena compute environment.
       */
      public fun athenaProperties(athenaProperties: Any)

      /**
       * @param authenticationConfiguration The authentication properties of the connection.
       */
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      /**
       * @param authenticationConfiguration The authentication properties of the connection.
       */
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty)

      /**
       * @param authenticationConfiguration The authentication properties of the connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("707d4cd220fc7a0f42a683c35711f7a5c88a44b98fa9a2ccc2c35836234f3ef5")
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty.Builder.() -> Unit)

      /**
       * @param connectionProperties These key-value pairs define parameters for the connection.
       */
      public fun connectionProperties(connectionProperties: Any)

      /**
       * @param connectionType The type of the connection. Currently, these types are supported:. 
       * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
       *
       * `JDBC` Connections use the following ConnectionParameters.
       *
       * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
       * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
       * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
       *
       * `KAFKA` Connections use the following ConnectionParameters.
       *
       * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
       * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION`
       * . These parameters are used to configure SSL with `KAFKA` .
       * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
       * configuration with SSL in `KAFKA` .
       * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
       * `AWS_MSK_IAM` .
       * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
       * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
       * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
       * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
       * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
       * configure SASL/GSSAPI authentication with `KAFKA` .
       * * `MONGODB` - Designates a connection to a MongoDB document database.
       *
       * `MONGODB` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * `VIEW_VALIDATION_REDSHIFT` - Designates a connection used for view validation by Amazon
       * Redshift.
       * * `VIEW_VALIDATION_ATHENA` - Designates a connection used for view validation by Amazon
       * Athena.
       * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
       * Private Cloud environment (Amazon VPC).
       *
       * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
       * PhysicalConnectionRequirements.
       *
       * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
       * Marketplace to read from and write to data stores that are not natively supported by AWS Glue
       * .
       *
       * `MARKETPLACE` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL`
       * .
       * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
       * `SECRET_ID` .
       * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
       * write to data stores that are not natively supported by AWS Glue .
       *
       * Additionally, a `ConnectionType` for the following SaaS connectors is supported:
       *
       * * `FACEBOOKADS` - Designates a connection to Facebook Ads.
       * * `GOOGLEADS` - Designates a connection to Google Ads.
       * * `GOOGLESHEETS` - Designates a connection to Google Sheets.
       * * `GOOGLEANALYTICS4` - Designates a connection to Google Analytics 4.
       * * `HUBSPOT` - Designates a connection to HubSpot.
       * * `INSTAGRAMADS` - Designates a connection to Instagram Ads.
       * * `INTERCOM` - Designates a connection to Intercom.
       * * `JIRACLOUD` - Designates a connection to Jira Cloud.
       * * `MARKETO` - Designates a connection to Adobe Marketo Engage.
       * * `NETSUITEERP` - Designates a connection to Oracle NetSuite.
       * * `SALESFORCE` - Designates a connection to Salesforce using OAuth authentication.
       * * `SALESFORCEMARKETINGCLOUD` - Designates a connection to Salesforce Marketing Cloud.
       * * `SALESFORCEPARDOT` - Designates a connection to Salesforce Marketing Cloud Account
       * Engagement (MCAE).
       * * `SAPODATA` - Designates a connection to SAP OData.
       * * `SERVICENOW` - Designates a connection to ServiceNow.
       * * `SLACK` - Designates a connection to Slack.
       * * `SNAPCHATADS` - Designates a connection to Snapchat Ads.
       * * `STRIPE` - Designates a connection to Stripe.
       * * `ZENDESK` - Designates a connection to Zendesk.
       * * `ZOHOCRM` - Designates a connection to Zoho CRM.
       *
       * For more information on the connection parameters needed for a particular connector, see
       * the documentation for the connector in [Adding an AWS Glue
       * connection](https://docs.aws.amazon.com/glue/latest/dg/console-connections.html) in the AWS
       * Glue User Guide.
       *
       * `SFTP` is not supported.
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue , consult [AWS Glue connection
       * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue Studio, consult [Using connectors and
       * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
       */
      public fun connectionType(connectionType: String)

      /**
       * @param description The description of the connection.
       */
      public fun description(description: String)

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      public fun matchCriteria(matchCriteria: List<String>)

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      public fun matchCriteria(vararg matchCriteria: String)

      /**
       * @param name The name of the connection.
       */
      public fun name(name: String)

      /**
       * @param physicalConnectionRequirements The physical connection requirements, such as virtual
       * private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      public fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable)

      /**
       * @param physicalConnectionRequirements The physical connection requirements, such as virtual
       * private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty)

      /**
       * @param physicalConnectionRequirements The physical connection requirements, such as virtual
       * private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3a681d707a4b419f21be2fa852df2b7c429b91fffc84f200ac88783cb319cdc")
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit)

      /**
       * @param pythonProperties Connection properties specific to the Python compute environment.
       */
      public fun pythonProperties(pythonProperties: Any)

      /**
       * @param sparkProperties Connection properties specific to the Spark compute environment.
       */
      public fun sparkProperties(sparkProperties: Any)

      /**
       * @param validateCredentials A flag to validate the credentials during create connection.
       * Default is true.
       */
      public fun validateCredentials(validateCredentials: Boolean)

      /**
       * @param validateCredentials A flag to validate the credentials during create connection.
       * Default is true.
       */
      public fun validateCredentials(validateCredentials: IResolvable)

      /**
       * @param validateForComputeEnvironments The compute environments that the specified
       * connection properties are validated against.
       */
      public fun validateForComputeEnvironments(validateForComputeEnvironments: List<String>)

      /**
       * @param validateForComputeEnvironments The compute environments that the specified
       * connection properties are validated against.
       */
      public fun validateForComputeEnvironments(vararg validateForComputeEnvironments: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.builder()

      /**
       * @param athenaProperties Connection properties specific to the Athena compute environment.
       */
      override fun athenaProperties(athenaProperties: Any) {
        cdkBuilder.athenaProperties(athenaProperties)
      }

      /**
       * @param authenticationConfiguration The authentication properties of the connection.
       */
      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication properties of the connection.
       */
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationInputProperty.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication properties of the connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("707d4cd220fc7a0f42a683c35711f7a5c88a44b98fa9a2ccc2c35836234f3ef5")
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(AuthenticationConfigurationInputProperty(authenticationConfiguration))

      /**
       * @param connectionProperties These key-value pairs define parameters for the connection.
       */
      override fun connectionProperties(connectionProperties: Any) {
        cdkBuilder.connectionProperties(connectionProperties)
      }

      /**
       * @param connectionType The type of the connection. Currently, these types are supported:. 
       * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
       *
       * `JDBC` Connections use the following ConnectionParameters.
       *
       * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
       * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
       * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
       *
       * `KAFKA` Connections use the following ConnectionParameters.
       *
       * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
       * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION`
       * . These parameters are used to configure SSL with `KAFKA` .
       * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
       * configuration with SSL in `KAFKA` .
       * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
       * `AWS_MSK_IAM` .
       * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
       * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
       * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
       * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
       * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
       * configure SASL/GSSAPI authentication with `KAFKA` .
       * * `MONGODB` - Designates a connection to a MongoDB document database.
       *
       * `MONGODB` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * `VIEW_VALIDATION_REDSHIFT` - Designates a connection used for view validation by Amazon
       * Redshift.
       * * `VIEW_VALIDATION_ATHENA` - Designates a connection used for view validation by Amazon
       * Athena.
       * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
       * Private Cloud environment (Amazon VPC).
       *
       * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
       * PhysicalConnectionRequirements.
       *
       * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
       * Marketplace to read from and write to data stores that are not natively supported by AWS Glue
       * .
       *
       * `MARKETPLACE` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL`
       * .
       * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
       * `SECRET_ID` .
       * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
       * write to data stores that are not natively supported by AWS Glue .
       *
       * Additionally, a `ConnectionType` for the following SaaS connectors is supported:
       *
       * * `FACEBOOKADS` - Designates a connection to Facebook Ads.
       * * `GOOGLEADS` - Designates a connection to Google Ads.
       * * `GOOGLESHEETS` - Designates a connection to Google Sheets.
       * * `GOOGLEANALYTICS4` - Designates a connection to Google Analytics 4.
       * * `HUBSPOT` - Designates a connection to HubSpot.
       * * `INSTAGRAMADS` - Designates a connection to Instagram Ads.
       * * `INTERCOM` - Designates a connection to Intercom.
       * * `JIRACLOUD` - Designates a connection to Jira Cloud.
       * * `MARKETO` - Designates a connection to Adobe Marketo Engage.
       * * `NETSUITEERP` - Designates a connection to Oracle NetSuite.
       * * `SALESFORCE` - Designates a connection to Salesforce using OAuth authentication.
       * * `SALESFORCEMARKETINGCLOUD` - Designates a connection to Salesforce Marketing Cloud.
       * * `SALESFORCEPARDOT` - Designates a connection to Salesforce Marketing Cloud Account
       * Engagement (MCAE).
       * * `SAPODATA` - Designates a connection to SAP OData.
       * * `SERVICENOW` - Designates a connection to ServiceNow.
       * * `SLACK` - Designates a connection to Slack.
       * * `SNAPCHATADS` - Designates a connection to Snapchat Ads.
       * * `STRIPE` - Designates a connection to Stripe.
       * * `ZENDESK` - Designates a connection to Zendesk.
       * * `ZOHOCRM` - Designates a connection to Zoho CRM.
       *
       * For more information on the connection parameters needed for a particular connector, see
       * the documentation for the connector in [Adding an AWS Glue
       * connection](https://docs.aws.amazon.com/glue/latest/dg/console-connections.html) in the AWS
       * Glue User Guide.
       *
       * `SFTP` is not supported.
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue , consult [AWS Glue connection
       * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue Studio, consult [Using connectors and
       * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
       */
      override fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
      }

      /**
       * @param description The description of the connection.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      override fun matchCriteria(matchCriteria: List<String>) {
        cdkBuilder.matchCriteria(matchCriteria)
      }

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      override fun matchCriteria(vararg matchCriteria: String): Unit =
          matchCriteria(matchCriteria.toList())

      /**
       * @param name The name of the connection.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param physicalConnectionRequirements The physical connection requirements, such as virtual
       * private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      override fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param physicalConnectionRequirements The physical connection requirements, such as virtual
       * private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(PhysicalConnectionRequirementsProperty.Companion::unwrap))
      }

      /**
       * @param physicalConnectionRequirements The physical connection requirements, such as virtual
       * private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3a681d707a4b419f21be2fa852df2b7c429b91fffc84f200ac88783cb319cdc")
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit):
          Unit =
          physicalConnectionRequirements(PhysicalConnectionRequirementsProperty(physicalConnectionRequirements))

      /**
       * @param pythonProperties Connection properties specific to the Python compute environment.
       */
      override fun pythonProperties(pythonProperties: Any) {
        cdkBuilder.pythonProperties(pythonProperties)
      }

      /**
       * @param sparkProperties Connection properties specific to the Spark compute environment.
       */
      override fun sparkProperties(sparkProperties: Any) {
        cdkBuilder.sparkProperties(sparkProperties)
      }

      /**
       * @param validateCredentials A flag to validate the credentials during create connection.
       * Default is true.
       */
      override fun validateCredentials(validateCredentials: Boolean) {
        cdkBuilder.validateCredentials(validateCredentials)
      }

      /**
       * @param validateCredentials A flag to validate the credentials during create connection.
       * Default is true.
       */
      override fun validateCredentials(validateCredentials: IResolvable) {
        cdkBuilder.validateCredentials(validateCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validateForComputeEnvironments The compute environments that the specified
       * connection properties are validated against.
       */
      override fun validateForComputeEnvironments(validateForComputeEnvironments: List<String>) {
        cdkBuilder.validateForComputeEnvironments(validateForComputeEnvironments)
      }

      /**
       * @param validateForComputeEnvironments The compute environments that the specified
       * connection properties are validated against.
       */
      override fun validateForComputeEnvironments(vararg validateForComputeEnvironments: String):
          Unit = validateForComputeEnvironments(validateForComputeEnvironments.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty,
    ) : CdkObject(cdkObject),
        ConnectionInputProperty {
      /**
       * Connection properties specific to the Athena compute environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-athenaproperties)
       */
      override fun athenaProperties(): Any? = unwrap(this).getAthenaProperties()

      /**
       * The authentication properties of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-authenticationconfiguration)
       */
      override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      /**
       * These key-value pairs define parameters for the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
       */
      override fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

      /**
       * The type of the connection. Currently, these types are supported:.
       *
       * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
       *
       * `JDBC` Connections use the following ConnectionParameters.
       *
       * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
       * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
       * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
       *
       * `KAFKA` Connections use the following ConnectionParameters.
       *
       * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
       * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION`
       * . These parameters are used to configure SSL with `KAFKA` .
       * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
       * configuration with SSL in `KAFKA` .
       * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
       * `AWS_MSK_IAM` .
       * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
       * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
       * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
       * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
       * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
       * configure SASL/GSSAPI authentication with `KAFKA` .
       * * `MONGODB` - Designates a connection to a MongoDB document database.
       *
       * `MONGODB` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * `VIEW_VALIDATION_REDSHIFT` - Designates a connection used for view validation by Amazon
       * Redshift.
       * * `VIEW_VALIDATION_ATHENA` - Designates a connection used for view validation by Amazon
       * Athena.
       * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
       * Private Cloud environment (Amazon VPC).
       *
       * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
       * PhysicalConnectionRequirements.
       *
       * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
       * Marketplace to read from and write to data stores that are not natively supported by AWS Glue
       * .
       *
       * `MARKETPLACE` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL`
       * .
       * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
       * `SECRET_ID` .
       * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
       * write to data stores that are not natively supported by AWS Glue .
       *
       * Additionally, a `ConnectionType` for the following SaaS connectors is supported:
       *
       * * `FACEBOOKADS` - Designates a connection to Facebook Ads.
       * * `GOOGLEADS` - Designates a connection to Google Ads.
       * * `GOOGLESHEETS` - Designates a connection to Google Sheets.
       * * `GOOGLEANALYTICS4` - Designates a connection to Google Analytics 4.
       * * `HUBSPOT` - Designates a connection to HubSpot.
       * * `INSTAGRAMADS` - Designates a connection to Instagram Ads.
       * * `INTERCOM` - Designates a connection to Intercom.
       * * `JIRACLOUD` - Designates a connection to Jira Cloud.
       * * `MARKETO` - Designates a connection to Adobe Marketo Engage.
       * * `NETSUITEERP` - Designates a connection to Oracle NetSuite.
       * * `SALESFORCE` - Designates a connection to Salesforce using OAuth authentication.
       * * `SALESFORCEMARKETINGCLOUD` - Designates a connection to Salesforce Marketing Cloud.
       * * `SALESFORCEPARDOT` - Designates a connection to Salesforce Marketing Cloud Account
       * Engagement (MCAE).
       * * `SAPODATA` - Designates a connection to SAP OData.
       * * `SERVICENOW` - Designates a connection to ServiceNow.
       * * `SLACK` - Designates a connection to Slack.
       * * `SNAPCHATADS` - Designates a connection to Snapchat Ads.
       * * `STRIPE` - Designates a connection to Stripe.
       * * `ZENDESK` - Designates a connection to Zendesk.
       * * `ZOHOCRM` - Designates a connection to Zoho CRM.
       *
       * For more information on the connection parameters needed for a particular connector, see
       * the documentation for the connector in [Adding an AWS Glue
       * connection](https://docs.aws.amazon.com/glue/latest/dg/console-connections.html) in the AWS
       * Glue User Guide.
       *
       * `SFTP` is not supported.
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue , consult [AWS Glue connection
       * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue Studio, consult [Using connectors and
       * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
       */
      override fun connectionType(): String = unwrap(this).getConnectionType()

      /**
       * The description of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A list of criteria that can be used in selecting this connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
       */
      override fun matchCriteria(): List<String> = unwrap(this).getMatchCriteria() ?: emptyList()

      /**
       * The name of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The physical connection requirements, such as virtual private cloud (VPC) and
       * `SecurityGroup` , that are needed to successfully make this connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
       */
      override fun physicalConnectionRequirements(): Any? =
          unwrap(this).getPhysicalConnectionRequirements()

      /**
       * Connection properties specific to the Python compute environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-pythonproperties)
       */
      override fun pythonProperties(): Any? = unwrap(this).getPythonProperties()

      /**
       * Connection properties specific to the Spark compute environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-sparkproperties)
       */
      override fun sparkProperties(): Any? = unwrap(this).getSparkProperties()

      /**
       * A flag to validate the credentials during create connection.
       *
       * Default is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-validatecredentials)
       */
      override fun validateCredentials(): Any? = unwrap(this).getValidateCredentials()

      /**
       * The compute environments that the specified connection properties are validated against.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-validateforcomputeenvironments)
       */
      override fun validateForComputeEnvironments(): List<String> =
          unwrap(this).getValidateForComputeEnvironments() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty):
          ConnectionInputProperty = CdkObjectWrappers.wrap(cdkObject) as? ConnectionInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionInputProperty):
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty
    }
  }

  /**
   * The OAuth2 client app used for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * OAuth2ClientApplicationProperty oAuth2ClientApplicationProperty =
   * OAuth2ClientApplicationProperty.builder()
   * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
   * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2clientapplication.html)
   */
  public interface OAuth2ClientApplicationProperty {
    /**
     * The reference to the SaaS-side client app that is AWS managed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2clientapplication.html#cfn-glue-connection-oauth2clientapplication-awsmanagedclientapplicationreference)
     */
    public fun awsManagedClientApplicationReference(): String? =
        unwrap(this).getAwsManagedClientApplicationReference()

    /**
     * The client application clientID if the ClientAppType is `USER_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2clientapplication.html#cfn-glue-connection-oauth2clientapplication-usermanagedclientapplicationclientid)
     */
    public fun userManagedClientApplicationClientId(): String? =
        unwrap(this).getUserManagedClientApplicationClientId()

    /**
     * A builder for [OAuth2ClientApplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsManagedClientApplicationReference The reference to the SaaS-side client app that
       * is AWS managed.
       */
      public fun awsManagedClientApplicationReference(awsManagedClientApplicationReference: String)

      /**
       * @param userManagedClientApplicationClientId The client application clientID if the
       * ClientAppType is `USER_MANAGED` .
       */
      public fun userManagedClientApplicationClientId(userManagedClientApplicationClientId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty.builder()

      /**
       * @param awsManagedClientApplicationReference The reference to the SaaS-side client app that
       * is AWS managed.
       */
      override
          fun awsManagedClientApplicationReference(awsManagedClientApplicationReference: String) {
        cdkBuilder.awsManagedClientApplicationReference(awsManagedClientApplicationReference)
      }

      /**
       * @param userManagedClientApplicationClientId The client application clientID if the
       * ClientAppType is `USER_MANAGED` .
       */
      override
          fun userManagedClientApplicationClientId(userManagedClientApplicationClientId: String) {
        cdkBuilder.userManagedClientApplicationClientId(userManagedClientApplicationClientId)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty,
    ) : CdkObject(cdkObject),
        OAuth2ClientApplicationProperty {
      /**
       * The reference to the SaaS-side client app that is AWS managed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2clientapplication.html#cfn-glue-connection-oauth2clientapplication-awsmanagedclientapplicationreference)
       */
      override fun awsManagedClientApplicationReference(): String? =
          unwrap(this).getAwsManagedClientApplicationReference()

      /**
       * The client application clientID if the ClientAppType is `USER_MANAGED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2clientapplication.html#cfn-glue-connection-oauth2clientapplication-usermanagedclientapplicationclientid)
       */
      override fun userManagedClientApplicationClientId(): String? =
          unwrap(this).getUserManagedClientApplicationClientId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2ClientApplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty):
          OAuth2ClientApplicationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OAuth2ClientApplicationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2ClientApplicationProperty):
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2ClientApplicationProperty
    }
  }

  /**
   * The credentials used when the authentication type is OAuth2 authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * OAuth2CredentialsProperty oAuth2CredentialsProperty = OAuth2CredentialsProperty.builder()
   * .accessToken("accessToken")
   * .jwtToken("jwtToken")
   * .refreshToken("refreshToken")
   * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html)
   */
  public interface OAuth2CredentialsProperty {
    /**
     * The access token used when the authentication type is OAuth2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The JSON Web Token (JWT) used when the authentication type is OAuth2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-jwttoken)
     */
    public fun jwtToken(): String? = unwrap(this).getJwtToken()

    /**
     * The refresh token used when the authentication type is OAuth2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * The client application client secret if the client application is user managed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-usermanagedclientapplicationclientsecret)
     */
    public fun userManagedClientApplicationClientSecret(): String? =
        unwrap(this).getUserManagedClientApplicationClientSecret()

    /**
     * A builder for [OAuth2CredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The access token used when the authentication type is OAuth2.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param jwtToken The JSON Web Token (JWT) used when the authentication type is OAuth2.
       */
      public fun jwtToken(jwtToken: String)

      /**
       * @param refreshToken The refresh token used when the authentication type is OAuth2.
       */
      public fun refreshToken(refreshToken: String)

      /**
       * @param userManagedClientApplicationClientSecret The client application client secret if the
       * client application is user managed.
       */
      public
          fun userManagedClientApplicationClientSecret(userManagedClientApplicationClientSecret: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty.Builder =
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty.builder()

      /**
       * @param accessToken The access token used when the authentication type is OAuth2.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param jwtToken The JSON Web Token (JWT) used when the authentication type is OAuth2.
       */
      override fun jwtToken(jwtToken: String) {
        cdkBuilder.jwtToken(jwtToken)
      }

      /**
       * @param refreshToken The refresh token used when the authentication type is OAuth2.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      /**
       * @param userManagedClientApplicationClientSecret The client application client secret if the
       * client application is user managed.
       */
      override
          fun userManagedClientApplicationClientSecret(userManagedClientApplicationClientSecret: String) {
        cdkBuilder.userManagedClientApplicationClientSecret(userManagedClientApplicationClientSecret)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty,
    ) : CdkObject(cdkObject),
        OAuth2CredentialsProperty {
      /**
       * The access token used when the authentication type is OAuth2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The JSON Web Token (JWT) used when the authentication type is OAuth2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-jwttoken)
       */
      override fun jwtToken(): String? = unwrap(this).getJwtToken()

      /**
       * The refresh token used when the authentication type is OAuth2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()

      /**
       * The client application client secret if the client application is user managed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2credentials.html#cfn-glue-connection-oauth2credentials-usermanagedclientapplicationclientsecret)
       */
      override fun userManagedClientApplicationClientSecret(): String? =
          unwrap(this).getUserManagedClientApplicationClientSecret()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2CredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty):
          OAuth2CredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OAuth2CredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2CredentialsProperty):
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2CredentialsProperty
    }
  }

  /**
   * A structure containing properties for OAuth2 in the CreateConnection request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object tokenUrlParametersMap;
   * OAuth2PropertiesInputProperty oAuth2PropertiesInputProperty =
   * OAuth2PropertiesInputProperty.builder()
   * .authorizationCodeProperties(AuthorizationCodePropertiesProperty.builder()
   * .authorizationCode("authorizationCode")
   * .redirectUri("redirectUri")
   * .build())
   * .oAuth2ClientApplication(OAuth2ClientApplicationProperty.builder()
   * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
   * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
   * .build())
   * .oAuth2Credentials(OAuth2CredentialsProperty.builder()
   * .accessToken("accessToken")
   * .jwtToken("jwtToken")
   * .refreshToken("refreshToken")
   * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
   * .build())
   * .oAuth2GrantType("oAuth2GrantType")
   * .tokenUrl("tokenUrl")
   * .tokenUrlParametersMap(tokenUrlParametersMap)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html)
   */
  public interface OAuth2PropertiesInputProperty {
    /**
     * The set of properties required for the the OAuth2 `AUTHORIZATION_CODE` grant type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-authorizationcodeproperties)
     */
    public fun authorizationCodeProperties(): Any? = unwrap(this).getAuthorizationCodeProperties()

    /**
     * The client application type in the CreateConnection request.
     *
     * For example, `AWS_MANAGED` or `USER_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-oauth2clientapplication)
     */
    public fun oAuth2ClientApplication(): Any? = unwrap(this).getOAuth2ClientApplication()

    /**
     * The credentials used when the authentication type is OAuth2 authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-oauth2credentials)
     */
    public fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

    /**
     * The OAuth2 grant type in the CreateConnection request.
     *
     * For example, `AUTHORIZATION_CODE` , `JWT_BEARER` , or `CLIENT_CREDENTIALS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-oauth2granttype)
     */
    public fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

    /**
     * The URL of the provider's authentication server, to exchange an authorization code for an
     * access token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-tokenurl)
     */
    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    /**
     * A map of parameters that are added to the token `GET` request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-tokenurlparametersmap)
     */
    public fun tokenUrlParametersMap(): Any? = unwrap(this).getTokenUrlParametersMap()

    /**
     * A builder for [OAuth2PropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationCodeProperties The set of properties required for the the OAuth2
       * `AUTHORIZATION_CODE` grant type.
       */
      public fun authorizationCodeProperties(authorizationCodeProperties: IResolvable)

      /**
       * @param authorizationCodeProperties The set of properties required for the the OAuth2
       * `AUTHORIZATION_CODE` grant type.
       */
      public
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty)

      /**
       * @param authorizationCodeProperties The set of properties required for the the OAuth2
       * `AUTHORIZATION_CODE` grant type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f63a8839ab8e695d0f4f345aff9083a8076b3ea3cc1d4ab328bf118f168719")
      public
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty.Builder.() -> Unit)

      /**
       * @param oAuth2ClientApplication The client application type in the CreateConnection request.
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       */
      public fun oAuth2ClientApplication(oAuth2ClientApplication: IResolvable)

      /**
       * @param oAuth2ClientApplication The client application type in the CreateConnection request.
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       */
      public fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty)

      /**
       * @param oAuth2ClientApplication The client application type in the CreateConnection request.
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f576c6e653eebf511c6578f47cccdcdd1b8c86c5b6d21a98da52f273134bc49")
      public
          fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty.Builder.() -> Unit)

      /**
       * @param oAuth2Credentials The credentials used when the authentication type is OAuth2
       * authentication.
       */
      public fun oAuth2Credentials(oAuth2Credentials: IResolvable)

      /**
       * @param oAuth2Credentials The credentials used when the authentication type is OAuth2
       * authentication.
       */
      public fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty)

      /**
       * @param oAuth2Credentials The credentials used when the authentication type is OAuth2
       * authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f7a965fff2ae5a834075a763de434c0542689442185354713256e6418fb6b29")
      public fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty.Builder.() -> Unit)

      /**
       * @param oAuth2GrantType The OAuth2 grant type in the CreateConnection request.
       * For example, `AUTHORIZATION_CODE` , `JWT_BEARER` , or `CLIENT_CREDENTIALS` .
       */
      public fun oAuth2GrantType(oAuth2GrantType: String)

      /**
       * @param tokenUrl The URL of the provider's authentication server, to exchange an
       * authorization code for an access token.
       */
      public fun tokenUrl(tokenUrl: String)

      /**
       * @param tokenUrlParametersMap A map of parameters that are added to the token `GET` request.
       */
      public fun tokenUrlParametersMap(tokenUrlParametersMap: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty.builder()

      /**
       * @param authorizationCodeProperties The set of properties required for the the OAuth2
       * `AUTHORIZATION_CODE` grant type.
       */
      override fun authorizationCodeProperties(authorizationCodeProperties: IResolvable) {
        cdkBuilder.authorizationCodeProperties(authorizationCodeProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authorizationCodeProperties The set of properties required for the the OAuth2
       * `AUTHORIZATION_CODE` grant type.
       */
      override
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty) {
        cdkBuilder.authorizationCodeProperties(authorizationCodeProperties.let(AuthorizationCodePropertiesProperty.Companion::unwrap))
      }

      /**
       * @param authorizationCodeProperties The set of properties required for the the OAuth2
       * `AUTHORIZATION_CODE` grant type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f63a8839ab8e695d0f4f345aff9083a8076b3ea3cc1d4ab328bf118f168719")
      override
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty.Builder.() -> Unit):
          Unit =
          authorizationCodeProperties(AuthorizationCodePropertiesProperty(authorizationCodeProperties))

      /**
       * @param oAuth2ClientApplication The client application type in the CreateConnection request.
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       */
      override fun oAuth2ClientApplication(oAuth2ClientApplication: IResolvable) {
        cdkBuilder.oAuth2ClientApplication(oAuth2ClientApplication.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2ClientApplication The client application type in the CreateConnection request.
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       */
      override
          fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty) {
        cdkBuilder.oAuth2ClientApplication(oAuth2ClientApplication.let(OAuth2ClientApplicationProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2ClientApplication The client application type in the CreateConnection request.
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f576c6e653eebf511c6578f47cccdcdd1b8c86c5b6d21a98da52f273134bc49")
      override
          fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty.Builder.() -> Unit):
          Unit = oAuth2ClientApplication(OAuth2ClientApplicationProperty(oAuth2ClientApplication))

      /**
       * @param oAuth2Credentials The credentials used when the authentication type is OAuth2
       * authentication.
       */
      override fun oAuth2Credentials(oAuth2Credentials: IResolvable) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2Credentials The credentials used when the authentication type is OAuth2
       * authentication.
       */
      override fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(OAuth2CredentialsProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2Credentials The credentials used when the authentication type is OAuth2
       * authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f7a965fff2ae5a834075a763de434c0542689442185354713256e6418fb6b29")
      override
          fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty.Builder.() -> Unit):
          Unit = oAuth2Credentials(OAuth2CredentialsProperty(oAuth2Credentials))

      /**
       * @param oAuth2GrantType The OAuth2 grant type in the CreateConnection request.
       * For example, `AUTHORIZATION_CODE` , `JWT_BEARER` , or `CLIENT_CREDENTIALS` .
       */
      override fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
      }

      /**
       * @param tokenUrl The URL of the provider's authentication server, to exchange an
       * authorization code for an access token.
       */
      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      /**
       * @param tokenUrlParametersMap A map of parameters that are added to the token `GET` request.
       */
      override fun tokenUrlParametersMap(tokenUrlParametersMap: Any) {
        cdkBuilder.tokenUrlParametersMap(tokenUrlParametersMap)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty,
    ) : CdkObject(cdkObject),
        OAuth2PropertiesInputProperty {
      /**
       * The set of properties required for the the OAuth2 `AUTHORIZATION_CODE` grant type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-authorizationcodeproperties)
       */
      override fun authorizationCodeProperties(): Any? =
          unwrap(this).getAuthorizationCodeProperties()

      /**
       * The client application type in the CreateConnection request.
       *
       * For example, `AWS_MANAGED` or `USER_MANAGED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-oauth2clientapplication)
       */
      override fun oAuth2ClientApplication(): Any? = unwrap(this).getOAuth2ClientApplication()

      /**
       * The credentials used when the authentication type is OAuth2 authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-oauth2credentials)
       */
      override fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

      /**
       * The OAuth2 grant type in the CreateConnection request.
       *
       * For example, `AUTHORIZATION_CODE` , `JWT_BEARER` , or `CLIENT_CREDENTIALS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-oauth2granttype)
       */
      override fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

      /**
       * The URL of the provider's authentication server, to exchange an authorization code for an
       * access token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-tokenurl)
       */
      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()

      /**
       * A map of parameters that are added to the token `GET` request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-oauth2propertiesinput.html#cfn-glue-connection-oauth2propertiesinput-tokenurlparametersmap)
       */
      override fun tokenUrlParametersMap(): Any? = unwrap(this).getTokenUrlParametersMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2PropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty):
          OAuth2PropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OAuth2PropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2PropertiesInputProperty):
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.OAuth2PropertiesInputProperty
    }
  }

  /**
   * The OAuth client app in GetConnection response.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * PhysicalConnectionRequirementsProperty physicalConnectionRequirementsProperty =
   * PhysicalConnectionRequirementsProperty.builder()
   * .availabilityZone("availabilityZone")
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html)
   */
  public interface PhysicalConnectionRequirementsProperty {
    /**
     * The connection's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The security group ID list used by the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
     */
    public fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
        emptyList()

    /**
     * The subnet ID used by the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [PhysicalConnectionRequirementsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The connection's Availability Zone.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      public fun securityGroupIdList(securityGroupIdList: List<String>)

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      public fun securityGroupIdList(vararg securityGroupIdList: String)

      /**
       * @param subnetId The subnet ID used by the connection.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.builder()

      /**
       * @param availabilityZone The connection's Availability Zone.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      override fun securityGroupIdList(securityGroupIdList: List<String>) {
        cdkBuilder.securityGroupIdList(securityGroupIdList)
      }

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      override fun securityGroupIdList(vararg securityGroupIdList: String): Unit =
          securityGroupIdList(securityGroupIdList.toList())

      /**
       * @param subnetId The subnet ID used by the connection.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty,
    ) : CdkObject(cdkObject),
        PhysicalConnectionRequirementsProperty {
      /**
       * The connection's Availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The security group ID list used by the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
       */
      override fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
          emptyList()

      /**
       * The subnet ID used by the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PhysicalConnectionRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty):
          PhysicalConnectionRequirementsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PhysicalConnectionRequirementsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalConnectionRequirementsProperty):
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
    }
  }
}
