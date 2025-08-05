@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

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
 * Creates a connection.
 *
 * A connection defines the authorization type and credentials to use for authorization with an API
 * destination HTTP endpoint.
 *
 * For more information, see [Connections for endpoint
 * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection.html) in the
 * *Amazon EventBridge User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
 * .authorizationType("authorizationType")
 * .authParameters(AuthParametersProperty.builder()
 * .apiKeyAuthParameters(ApiKeyAuthParametersProperty.builder()
 * .apiKeyName("apiKeyName")
 * .apiKeyValue("apiKeyValue")
 * .build())
 * .basicAuthParameters(BasicAuthParametersProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .connectivityParameters(ConnectivityParametersProperty.builder()
 * .resourceParameters(ResourceParametersProperty.builder()
 * .resourceConfigurationArn("resourceConfigurationArn")
 * // the properties below are optional
 * .resourceAssociationArn("resourceAssociationArn")
 * .build())
 * .build())
 * .invocationHttpParameters(ConnectionHttpParametersProperty.builder()
 * .bodyParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .headerParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .queryStringParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .build())
 * .oAuthParameters(OAuthParametersProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientParameters(ClientParametersProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .build())
 * .httpMethod("httpMethod")
 * // the properties below are optional
 * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
 * .bodyParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .headerParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .queryStringParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .build())
 * .build())
 * .build())
 * .description("description")
 * .invocationConnectivityParameters(InvocationConnectivityParametersProperty.builder()
 * .resourceParameters(ResourceParametersProperty.builder()
 * .resourceConfigurationArn("resourceConfigurationArn")
 * // the properties below are optional
 * .resourceAssociationArn("resourceAssociationArn")
 * .build())
 * .build())
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html)
 */
public open class CfnConnection(
  cdkObject: software.amazon.awscdk.services.events.CfnConnection,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.events.CfnConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps,
  ) :
      this(software.amazon.awscdk.services.events.CfnConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectionProps(props)
  )

  /**
   * The ARN of the connection that was created by the request.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the Amazon Resource Name (ARN) of a connection in resource format, so it can be used in
   * the `Resource` element of IAM permission policy statements.
   *
   * For more information, see [Resource types defined by Amazon
   * EventBridge](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazoneventbridge.html#amazoneventbridge-resources-for-iam-policies)
   * in the *Service Authorization Reference* .
   *
   * For example, the following resource defines an IAM policy that grants permission to update a
   * specific connection.
   *
   * `Resources: ExamplePolicy: Type: AWS::IAM::Policy Properties: PolicyName: ExamplePolicy
   * PolicyDocument: Version: '2012-10-17' Statement: - Effect: Allow Action: - events:UpdateConnection
   * Resource: - !GetAtt myConnection.ArnForPolicy`
   */
  public open fun attrArnForPolicy(): String = unwrap(this).getAttrArnForPolicy()

  /**
   * For connections to private APIs, the Amazon Resource Name (ARN) of the resource association
   * EventBridge created between the connection and the private API's resource configuration.
   *
   *
   * The value of this property is set by EventBridge . Any value you specify in your template is
   * ignored.
   */
  public open
      fun attrAuthParametersConnectivityParametersResourceParametersResourceAssociationArn(): String
      =
      unwrap(this).getAttrAuthParametersConnectivityParametersResourceParametersResourceAssociationArn()

  /**
   * For connections to private APIs, the Amazon Resource Name (ARN) of the resource association
   * EventBridge created between the connection and the private API's resource configuration.
   *
   *
   * The value of this property is set by EventBridge . Any value you specify in your template is
   * ignored.
   */
  public open fun attrInvocationConnectivityParametersResourceParametersResourceAssociationArn():
      String =
      unwrap(this).getAttrInvocationConnectivityParametersResourceParametersResourceAssociationArn()

  /**
   * The ARN for the secret created for the connection.
   */
  public open fun attrSecretArn(): String = unwrap(this).getAttrSecretArn()

  /**
   * The authorization parameters to use to authorize with the endpoint.
   */
  public open fun authParameters(): Any? = unwrap(this).getAuthParameters()

  /**
   * The authorization parameters to use to authorize with the endpoint.
   */
  public open fun authParameters(`value`: IResolvable) {
    unwrap(this).setAuthParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The authorization parameters to use to authorize with the endpoint.
   */
  public open fun authParameters(`value`: AuthParametersProperty) {
    unwrap(this).setAuthParameters(`value`.let(AuthParametersProperty.Companion::unwrap))
  }

  /**
   * The authorization parameters to use to authorize with the endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec5f6b852a44a1435db3f6d1f7c0a6b8f7fbc35da4d12cb8215710bee5e0daa4")
  public open fun authParameters(`value`: AuthParametersProperty.Builder.() -> Unit): Unit =
      authParameters(AuthParametersProperty(`value`))

  /**
   * The type of authorization to use for the connection.
   */
  public open fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  /**
   * The type of authorization to use for the connection.
   */
  public open fun authorizationType(`value`: String) {
    unwrap(this).setAuthorizationType(`value`)
  }

  /**
   * A description for the connection to create.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the connection to create.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * For connections to private APIs, the parameters to use for invoking the API.
   */
  public open fun invocationConnectivityParameters(): Any? =
      unwrap(this).getInvocationConnectivityParameters()

  /**
   * For connections to private APIs, the parameters to use for invoking the API.
   */
  public open fun invocationConnectivityParameters(`value`: IResolvable) {
    unwrap(this).setInvocationConnectivityParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * For connections to private APIs, the parameters to use for invoking the API.
   */
  public open
      fun invocationConnectivityParameters(`value`: InvocationConnectivityParametersProperty) {
    unwrap(this).setInvocationConnectivityParameters(`value`.let(InvocationConnectivityParametersProperty.Companion::unwrap))
  }

  /**
   * For connections to private APIs, the parameters to use for invoking the API.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38adfdd7face237c5f007ca55f16e6508595048c2eaf41b1a0a60c42985d2355")
  public open
      fun invocationConnectivityParameters(`value`: InvocationConnectivityParametersProperty.Builder.() -> Unit):
      Unit = invocationConnectivityParameters(InvocationConnectivityParametersProperty(`value`))

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt this connection.
   */
  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt this connection.
   */
  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  /**
   * The name for the connection to create.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name for the connection to create.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     * @param authParameters The authorization parameters to use to authorize with the endpoint. 
     */
    public fun authParameters(authParameters: IResolvable)

    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     * @param authParameters The authorization parameters to use to authorize with the endpoint. 
     */
    public fun authParameters(authParameters: AuthParametersProperty)

    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     * @param authParameters The authorization parameters to use to authorize with the endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94678fbe23b8920d06561e2226c4cfaf721f1b3ec79ed52a301a0ffc478061ed")
    public fun authParameters(authParameters: AuthParametersProperty.Builder.() -> Unit)

    /**
     * The type of authorization to use for the connection.
     *
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
     * @param authorizationType The type of authorization to use for the connection. 
     */
    public fun authorizationType(authorizationType: String)

    /**
     * A description for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
     * @param description A description for the connection to create. 
     */
    public fun description(description: String)

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API. 
     */
    public fun invocationConnectivityParameters(invocationConnectivityParameters: IResolvable)

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API. 
     */
    public
        fun invocationConnectivityParameters(invocationConnectivityParameters: InvocationConnectivityParametersProperty)

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a337166580c9555a2a5aca7237263c17e3d8648807a680d1da4c884c851b7b2")
    public
        fun invocationConnectivityParameters(invocationConnectivityParameters: InvocationConnectivityParametersProperty.Builder.() -> Unit)

    /**
     * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to
     * use a customer managed key to encrypt this connection.
     *
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the connection.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-kmskeyidentifier)
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt this connection. 
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * The name for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
     * @param name The name for the connection to create. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnConnection.Builder =
        software.amazon.awscdk.services.events.CfnConnection.Builder.create(scope, id)

    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     * @param authParameters The authorization parameters to use to authorize with the endpoint. 
     */
    override fun authParameters(authParameters: IResolvable) {
      cdkBuilder.authParameters(authParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     * @param authParameters The authorization parameters to use to authorize with the endpoint. 
     */
    override fun authParameters(authParameters: AuthParametersProperty) {
      cdkBuilder.authParameters(authParameters.let(AuthParametersProperty.Companion::unwrap))
    }

    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     * @param authParameters The authorization parameters to use to authorize with the endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94678fbe23b8920d06561e2226c4cfaf721f1b3ec79ed52a301a0ffc478061ed")
    override fun authParameters(authParameters: AuthParametersProperty.Builder.() -> Unit): Unit =
        authParameters(AuthParametersProperty(authParameters))

    /**
     * The type of authorization to use for the connection.
     *
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
     * @param authorizationType The type of authorization to use for the connection. 
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * A description for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
     * @param description A description for the connection to create. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API. 
     */
    override fun invocationConnectivityParameters(invocationConnectivityParameters: IResolvable) {
      cdkBuilder.invocationConnectivityParameters(invocationConnectivityParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API. 
     */
    override
        fun invocationConnectivityParameters(invocationConnectivityParameters: InvocationConnectivityParametersProperty) {
      cdkBuilder.invocationConnectivityParameters(invocationConnectivityParameters.let(InvocationConnectivityParametersProperty.Companion::unwrap))
    }

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a337166580c9555a2a5aca7237263c17e3d8648807a680d1da4c884c851b7b2")
    override
        fun invocationConnectivityParameters(invocationConnectivityParameters: InvocationConnectivityParametersProperty.Builder.() -> Unit):
        Unit =
        invocationConnectivityParameters(InvocationConnectivityParametersProperty(invocationConnectivityParameters))

    /**
     * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to
     * use a customer managed key to encrypt this connection.
     *
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the connection.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-kmskeyidentifier)
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt this connection. 
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * The name for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
     * @param name The name for the connection to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnConnection = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection):
        CfnConnection = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection):
        software.amazon.awscdk.services.events.CfnConnection = wrapped.cdkObject as
        software.amazon.awscdk.services.events.CfnConnection
  }

  /**
   * The API key authorization parameters for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ApiKeyAuthParametersProperty apiKeyAuthParametersProperty =
   * ApiKeyAuthParametersProperty.builder()
   * .apiKeyName("apiKeyName")
   * .apiKeyValue("apiKeyValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html)
   */
  public interface ApiKeyAuthParametersProperty {
    /**
     * The name of the API key to use for authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html#cfn-events-connection-apikeyauthparameters-apikeyname)
     */
    public fun apiKeyName(): String

    /**
     * The value for the API key to use for authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html#cfn-events-connection-apikeyauthparameters-apikeyvalue)
     */
    public fun apiKeyValue(): String

    /**
     * A builder for [ApiKeyAuthParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKeyName The name of the API key to use for authorization. 
       */
      public fun apiKeyName(apiKeyName: String)

      /**
       * @param apiKeyValue The value for the API key to use for authorization. 
       */
      public fun apiKeyValue(apiKeyValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty.builder()

      /**
       * @param apiKeyName The name of the API key to use for authorization. 
       */
      override fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
      }

      /**
       * @param apiKeyValue The value for the API key to use for authorization. 
       */
      override fun apiKeyValue(apiKeyValue: String) {
        cdkBuilder.apiKeyValue(apiKeyValue)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty,
    ) : CdkObject(cdkObject),
        ApiKeyAuthParametersProperty {
      /**
       * The name of the API key to use for authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html#cfn-events-connection-apikeyauthparameters-apikeyname)
       */
      override fun apiKeyName(): String = unwrap(this).getApiKeyName()

      /**
       * The value for the API key to use for authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html#cfn-events-connection-apikeyauthparameters-apikeyvalue)
       */
      override fun apiKeyValue(): String = unwrap(this).getApiKeyValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyAuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty):
          ApiKeyAuthParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApiKeyAuthParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiKeyAuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty
    }
  }

  /**
   * Tthe authorization parameters to use for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * AuthParametersProperty authParametersProperty = AuthParametersProperty.builder()
   * .apiKeyAuthParameters(ApiKeyAuthParametersProperty.builder()
   * .apiKeyName("apiKeyName")
   * .apiKeyValue("apiKeyValue")
   * .build())
   * .basicAuthParameters(BasicAuthParametersProperty.builder()
   * .password("password")
   * .username("username")
   * .build())
   * .connectivityParameters(ConnectivityParametersProperty.builder()
   * .resourceParameters(ResourceParametersProperty.builder()
   * .resourceConfigurationArn("resourceConfigurationArn")
   * // the properties below are optional
   * .resourceAssociationArn("resourceAssociationArn")
   * .build())
   * .build())
   * .invocationHttpParameters(ConnectionHttpParametersProperty.builder()
   * .bodyParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .headerParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .queryStringParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .build())
   * .oAuthParameters(OAuthParametersProperty.builder()
   * .authorizationEndpoint("authorizationEndpoint")
   * .clientParameters(ClientParametersProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .build())
   * .httpMethod("httpMethod")
   * // the properties below are optional
   * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
   * .bodyParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .headerParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .queryStringParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html)
   */
  public interface AuthParametersProperty {
    /**
     * The API Key parameters to use for authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-apikeyauthparameters)
     */
    public fun apiKeyAuthParameters(): Any? = unwrap(this).getApiKeyAuthParameters()

    /**
     * The authorization parameters for Basic authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-basicauthparameters)
     */
    public fun basicAuthParameters(): Any? = unwrap(this).getBasicAuthParameters()

    /**
     * For private OAuth authentication endpoints. The parameters EventBridge uses to authenticate
     * against the endpoint.
     *
     * For more information, see [Authorization methods for
     * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
     * in the **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-connectivityparameters)
     */
    public fun connectivityParameters(): Any? = unwrap(this).getConnectivityParameters()

    /**
     * Additional parameters for the connection that are passed through with every invocation to the
     * HTTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-invocationhttpparameters)
     */
    public fun invocationHttpParameters(): Any? = unwrap(this).getInvocationHttpParameters()

    /**
     * The OAuth parameters to use for authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-oauthparameters)
     */
    public fun oAuthParameters(): Any? = unwrap(this).getOAuthParameters()

    /**
     * A builder for [AuthParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKeyAuthParameters The API Key parameters to use for authorization.
       */
      public fun apiKeyAuthParameters(apiKeyAuthParameters: IResolvable)

      /**
       * @param apiKeyAuthParameters The API Key parameters to use for authorization.
       */
      public fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty)

      /**
       * @param apiKeyAuthParameters The API Key parameters to use for authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("723a82afcbbfa2ecd48766393c12b31448f0fac2c63f0643fcc5587494b8dccf")
      public
          fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty.Builder.() -> Unit)

      /**
       * @param basicAuthParameters The authorization parameters for Basic authorization.
       */
      public fun basicAuthParameters(basicAuthParameters: IResolvable)

      /**
       * @param basicAuthParameters The authorization parameters for Basic authorization.
       */
      public fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty)

      /**
       * @param basicAuthParameters The authorization parameters for Basic authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8391c04181ee307d13f27c4c07e9b7cb8da421d5c7083f0daa00b60cb0c742c")
      public
          fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty.Builder.() -> Unit)

      /**
       * @param connectivityParameters For private OAuth authentication endpoints. The parameters
       * EventBridge uses to authenticate against the endpoint.
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       */
      public fun connectivityParameters(connectivityParameters: IResolvable)

      /**
       * @param connectivityParameters For private OAuth authentication endpoints. The parameters
       * EventBridge uses to authenticate against the endpoint.
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       */
      public fun connectivityParameters(connectivityParameters: ConnectivityParametersProperty)

      /**
       * @param connectivityParameters For private OAuth authentication endpoints. The parameters
       * EventBridge uses to authenticate against the endpoint.
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0e0f26d10f7d57c423e97f54284633e5b6539da6e8946f125b45ee272ca6735")
      public
          fun connectivityParameters(connectivityParameters: ConnectivityParametersProperty.Builder.() -> Unit)

      /**
       * @param invocationHttpParameters Additional parameters for the connection that are passed
       * through with every invocation to the HTTP endpoint.
       */
      public fun invocationHttpParameters(invocationHttpParameters: IResolvable)

      /**
       * @param invocationHttpParameters Additional parameters for the connection that are passed
       * through with every invocation to the HTTP endpoint.
       */
      public
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty)

      /**
       * @param invocationHttpParameters Additional parameters for the connection that are passed
       * through with every invocation to the HTTP endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f4a8ec205c8ce9c11affdb1ec143bf824588bd19130a147201673fc31b12db")
      public
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit)

      /**
       * @param oAuthParameters The OAuth parameters to use for authorization.
       */
      public fun oAuthParameters(oAuthParameters: IResolvable)

      /**
       * @param oAuthParameters The OAuth parameters to use for authorization.
       */
      public fun oAuthParameters(oAuthParameters: OAuthParametersProperty)

      /**
       * @param oAuthParameters The OAuth parameters to use for authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1971362123bfe5682d0da49ac80108ae47f27a7beb3908b1961a0c1574b9db2e")
      public fun oAuthParameters(oAuthParameters: OAuthParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty.builder()

      /**
       * @param apiKeyAuthParameters The API Key parameters to use for authorization.
       */
      override fun apiKeyAuthParameters(apiKeyAuthParameters: IResolvable) {
        cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param apiKeyAuthParameters The API Key parameters to use for authorization.
       */
      override fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty) {
        cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters.let(ApiKeyAuthParametersProperty.Companion::unwrap))
      }

      /**
       * @param apiKeyAuthParameters The API Key parameters to use for authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("723a82afcbbfa2ecd48766393c12b31448f0fac2c63f0643fcc5587494b8dccf")
      override
          fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty.Builder.() -> Unit):
          Unit = apiKeyAuthParameters(ApiKeyAuthParametersProperty(apiKeyAuthParameters))

      /**
       * @param basicAuthParameters The authorization parameters for Basic authorization.
       */
      override fun basicAuthParameters(basicAuthParameters: IResolvable) {
        cdkBuilder.basicAuthParameters(basicAuthParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param basicAuthParameters The authorization parameters for Basic authorization.
       */
      override fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty) {
        cdkBuilder.basicAuthParameters(basicAuthParameters.let(BasicAuthParametersProperty.Companion::unwrap))
      }

      /**
       * @param basicAuthParameters The authorization parameters for Basic authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8391c04181ee307d13f27c4c07e9b7cb8da421d5c7083f0daa00b60cb0c742c")
      override
          fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty.Builder.() -> Unit):
          Unit = basicAuthParameters(BasicAuthParametersProperty(basicAuthParameters))

      /**
       * @param connectivityParameters For private OAuth authentication endpoints. The parameters
       * EventBridge uses to authenticate against the endpoint.
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       */
      override fun connectivityParameters(connectivityParameters: IResolvable) {
        cdkBuilder.connectivityParameters(connectivityParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connectivityParameters For private OAuth authentication endpoints. The parameters
       * EventBridge uses to authenticate against the endpoint.
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       */
      override fun connectivityParameters(connectivityParameters: ConnectivityParametersProperty) {
        cdkBuilder.connectivityParameters(connectivityParameters.let(ConnectivityParametersProperty.Companion::unwrap))
      }

      /**
       * @param connectivityParameters For private OAuth authentication endpoints. The parameters
       * EventBridge uses to authenticate against the endpoint.
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0e0f26d10f7d57c423e97f54284633e5b6539da6e8946f125b45ee272ca6735")
      override
          fun connectivityParameters(connectivityParameters: ConnectivityParametersProperty.Builder.() -> Unit):
          Unit = connectivityParameters(ConnectivityParametersProperty(connectivityParameters))

      /**
       * @param invocationHttpParameters Additional parameters for the connection that are passed
       * through with every invocation to the HTTP endpoint.
       */
      override fun invocationHttpParameters(invocationHttpParameters: IResolvable) {
        cdkBuilder.invocationHttpParameters(invocationHttpParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param invocationHttpParameters Additional parameters for the connection that are passed
       * through with every invocation to the HTTP endpoint.
       */
      override
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty) {
        cdkBuilder.invocationHttpParameters(invocationHttpParameters.let(ConnectionHttpParametersProperty.Companion::unwrap))
      }

      /**
       * @param invocationHttpParameters Additional parameters for the connection that are passed
       * through with every invocation to the HTTP endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f4a8ec205c8ce9c11affdb1ec143bf824588bd19130a147201673fc31b12db")
      override
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit):
          Unit =
          invocationHttpParameters(ConnectionHttpParametersProperty(invocationHttpParameters))

      /**
       * @param oAuthParameters The OAuth parameters to use for authorization.
       */
      override fun oAuthParameters(oAuthParameters: IResolvable) {
        cdkBuilder.oAuthParameters(oAuthParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuthParameters The OAuth parameters to use for authorization.
       */
      override fun oAuthParameters(oAuthParameters: OAuthParametersProperty) {
        cdkBuilder.oAuthParameters(oAuthParameters.let(OAuthParametersProperty.Companion::unwrap))
      }

      /**
       * @param oAuthParameters The OAuth parameters to use for authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1971362123bfe5682d0da49ac80108ae47f27a7beb3908b1961a0c1574b9db2e")
      override fun oAuthParameters(oAuthParameters: OAuthParametersProperty.Builder.() -> Unit):
          Unit = oAuthParameters(OAuthParametersProperty(oAuthParameters))

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty,
    ) : CdkObject(cdkObject),
        AuthParametersProperty {
      /**
       * The API Key parameters to use for authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-apikeyauthparameters)
       */
      override fun apiKeyAuthParameters(): Any? = unwrap(this).getApiKeyAuthParameters()

      /**
       * The authorization parameters for Basic authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-basicauthparameters)
       */
      override fun basicAuthParameters(): Any? = unwrap(this).getBasicAuthParameters()

      /**
       * For private OAuth authentication endpoints. The parameters EventBridge uses to authenticate
       * against the endpoint.
       *
       * For more information, see [Authorization methods for
       * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
       * in the **Amazon EventBridge User Guide** .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-connectivityparameters)
       */
      override fun connectivityParameters(): Any? = unwrap(this).getConnectivityParameters()

      /**
       * Additional parameters for the connection that are passed through with every invocation to
       * the HTTP endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-invocationhttpparameters)
       */
      override fun invocationHttpParameters(): Any? = unwrap(this).getInvocationHttpParameters()

      /**
       * The OAuth parameters to use for authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html#cfn-events-connection-authparameters-oauthparameters)
       */
      override fun oAuthParameters(): Any? = unwrap(this).getOAuthParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty):
          AuthParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty
    }
  }

  /**
   * The Basic authorization parameters for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * BasicAuthParametersProperty basicAuthParametersProperty = BasicAuthParametersProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html)
   */
  public interface BasicAuthParametersProperty {
    /**
     * The password associated with the user name to use for Basic authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html#cfn-events-connection-basicauthparameters-password)
     */
    public fun password(): String

    /**
     * The user name to use for Basic authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html#cfn-events-connection-basicauthparameters-username)
     */
    public fun username(): String

    /**
     * A builder for [BasicAuthParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password associated with the user name to use for Basic authorization. 
       */
      public fun password(password: String)

      /**
       * @param username The user name to use for Basic authorization. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty.builder()

      /**
       * @param password The password associated with the user name to use for Basic authorization. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The user name to use for Basic authorization. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty,
    ) : CdkObject(cdkObject),
        BasicAuthParametersProperty {
      /**
       * The password associated with the user name to use for Basic authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html#cfn-events-connection-basicauthparameters-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The user name to use for Basic authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html#cfn-events-connection-basicauthparameters-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty):
          BasicAuthParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BasicAuthParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty
    }
  }

  /**
   * The OAuth authorization parameters to use for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ClientParametersProperty clientParametersProperty = ClientParametersProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html)
   */
  public interface ClientParametersProperty {
    /**
     * The client ID to use for OAuth authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html#cfn-events-connection-clientparameters-clientid)
     */
    public fun clientId(): String

    /**
     * The client secret assciated with the client ID to use for OAuth authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html#cfn-events-connection-clientparameters-clientsecret)
     */
    public fun clientSecret(): String

    /**
     * A builder for [ClientParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientId The client ID to use for OAuth authorization. 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret assciated with the client ID to use for OAuth
       * authorization. 
       */
      public fun clientSecret(clientSecret: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty.builder()

      /**
       * @param clientId The client ID to use for OAuth authorization. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret assciated with the client ID to use for OAuth
       * authorization. 
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty,
    ) : CdkObject(cdkObject),
        ClientParametersProperty {
      /**
       * The client ID to use for OAuth authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html#cfn-events-connection-clientparameters-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The client secret assciated with the client ID to use for OAuth authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html#cfn-events-connection-clientparameters-clientsecret)
       */
      override fun clientSecret(): String = unwrap(this).getClientSecret()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty):
          ClientParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? ClientParametersProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty
    }
  }

  /**
   * Any additional parameters for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ConnectionHttpParametersProperty connectionHttpParametersProperty =
   * ConnectionHttpParametersProperty.builder()
   * .bodyParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .headerParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .queryStringParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html)
   */
  public interface ConnectionHttpParametersProperty {
    /**
     * Any additional body string parameters for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html#cfn-events-connection-connectionhttpparameters-bodyparameters)
     */
    public fun bodyParameters(): Any? = unwrap(this).getBodyParameters()

    /**
     * Any additional header parameters for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html#cfn-events-connection-connectionhttpparameters-headerparameters)
     */
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    /**
     * Any additional query string parameters for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html#cfn-events-connection-connectionhttpparameters-querystringparameters)
     */
    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    /**
     * A builder for [ConnectionHttpParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bodyParameters Any additional body string parameters for the connection.
       */
      public fun bodyParameters(bodyParameters: IResolvable)

      /**
       * @param bodyParameters Any additional body string parameters for the connection.
       */
      public fun bodyParameters(bodyParameters: List<Any>)

      /**
       * @param bodyParameters Any additional body string parameters for the connection.
       */
      public fun bodyParameters(vararg bodyParameters: Any)

      /**
       * @param headerParameters Any additional header parameters for the connection.
       */
      public fun headerParameters(headerParameters: IResolvable)

      /**
       * @param headerParameters Any additional header parameters for the connection.
       */
      public fun headerParameters(headerParameters: List<Any>)

      /**
       * @param headerParameters Any additional header parameters for the connection.
       */
      public fun headerParameters(vararg headerParameters: Any)

      /**
       * @param queryStringParameters Any additional query string parameters for the connection.
       */
      public fun queryStringParameters(queryStringParameters: IResolvable)

      /**
       * @param queryStringParameters Any additional query string parameters for the connection.
       */
      public fun queryStringParameters(queryStringParameters: List<Any>)

      /**
       * @param queryStringParameters Any additional query string parameters for the connection.
       */
      public fun queryStringParameters(vararg queryStringParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty.builder()

      /**
       * @param bodyParameters Any additional body string parameters for the connection.
       */
      override fun bodyParameters(bodyParameters: IResolvable) {
        cdkBuilder.bodyParameters(bodyParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bodyParameters Any additional body string parameters for the connection.
       */
      override fun bodyParameters(bodyParameters: List<Any>) {
        cdkBuilder.bodyParameters(bodyParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param bodyParameters Any additional body string parameters for the connection.
       */
      override fun bodyParameters(vararg bodyParameters: Any): Unit =
          bodyParameters(bodyParameters.toList())

      /**
       * @param headerParameters Any additional header parameters for the connection.
       */
      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param headerParameters Any additional header parameters for the connection.
       */
      override fun headerParameters(headerParameters: List<Any>) {
        cdkBuilder.headerParameters(headerParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param headerParameters Any additional header parameters for the connection.
       */
      override fun headerParameters(vararg headerParameters: Any): Unit =
          headerParameters(headerParameters.toList())

      /**
       * @param queryStringParameters Any additional query string parameters for the connection.
       */
      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param queryStringParameters Any additional query string parameters for the connection.
       */
      override fun queryStringParameters(queryStringParameters: List<Any>) {
        cdkBuilder.queryStringParameters(queryStringParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param queryStringParameters Any additional query string parameters for the connection.
       */
      override fun queryStringParameters(vararg queryStringParameters: Any): Unit =
          queryStringParameters(queryStringParameters.toList())

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty,
    ) : CdkObject(cdkObject),
        ConnectionHttpParametersProperty {
      /**
       * Any additional body string parameters for the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html#cfn-events-connection-connectionhttpparameters-bodyparameters)
       */
      override fun bodyParameters(): Any? = unwrap(this).getBodyParameters()

      /**
       * Any additional header parameters for the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html#cfn-events-connection-connectionhttpparameters-headerparameters)
       */
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      /**
       * Any additional query string parameters for the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html#cfn-events-connection-connectionhttpparameters-querystringparameters)
       */
      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty):
          ConnectionHttpParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionHttpParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionHttpParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty
    }
  }

  /**
   * If you specify a private OAuth endpoint, the parameters for EventBridge to use when
   * authenticating against the endpoint.
   *
   * For more information, see [Authorization methods for
   * connections](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-target-connection-auth.html)
   * in the **Amazon EventBridge User Guide** .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ConnectivityParametersProperty connectivityParametersProperty =
   * ConnectivityParametersProperty.builder()
   * .resourceParameters(ResourceParametersProperty.builder()
   * .resourceConfigurationArn("resourceConfigurationArn")
   * // the properties below are optional
   * .resourceAssociationArn("resourceAssociationArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectivityparameters.html)
   */
  public interface ConnectivityParametersProperty {
    /**
     * The parameters for EventBridge to use when invoking the resource endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectivityparameters.html#cfn-events-connection-connectivityparameters-resourceparameters)
     */
    public fun resourceParameters(): Any

    /**
     * A builder for [ConnectivityParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      public fun resourceParameters(resourceParameters: IResolvable)

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      public fun resourceParameters(resourceParameters: ResourceParametersProperty)

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("631a05aeda854718ad91124394a4b0540fae4efae6a438dd9d5f0773dcbb8d2c")
      public
          fun resourceParameters(resourceParameters: ResourceParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty.builder()

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      override fun resourceParameters(resourceParameters: IResolvable) {
        cdkBuilder.resourceParameters(resourceParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      override fun resourceParameters(resourceParameters: ResourceParametersProperty) {
        cdkBuilder.resourceParameters(resourceParameters.let(ResourceParametersProperty.Companion::unwrap))
      }

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("631a05aeda854718ad91124394a4b0540fae4efae6a438dd9d5f0773dcbb8d2c")
      override
          fun resourceParameters(resourceParameters: ResourceParametersProperty.Builder.() -> Unit):
          Unit = resourceParameters(ResourceParametersProperty(resourceParameters))

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty,
    ) : CdkObject(cdkObject),
        ConnectivityParametersProperty {
      /**
       * The parameters for EventBridge to use when invoking the resource endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectivityparameters.html#cfn-events-connection-connectivityparameters-resourceparameters)
       */
      override fun resourceParameters(): Any = unwrap(this).getResourceParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectivityParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty):
          ConnectivityParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectivityParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectivityParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.ConnectivityParametersProperty
    }
  }

  /**
   * For connections to private APIs, the parameters to use for invoking the API.
   *
   * For more information, see [Connecting to private
   * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
   * **Amazon EventBridge User Guide** .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * InvocationConnectivityParametersProperty invocationConnectivityParametersProperty =
   * InvocationConnectivityParametersProperty.builder()
   * .resourceParameters(ResourceParametersProperty.builder()
   * .resourceConfigurationArn("resourceConfigurationArn")
   * // the properties below are optional
   * .resourceAssociationArn("resourceAssociationArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-invocationconnectivityparameters.html)
   */
  public interface InvocationConnectivityParametersProperty {
    /**
     * The parameters for EventBridge to use when invoking the resource endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-invocationconnectivityparameters.html#cfn-events-connection-invocationconnectivityparameters-resourceparameters)
     */
    public fun resourceParameters(): Any

    /**
     * A builder for [InvocationConnectivityParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      public fun resourceParameters(resourceParameters: IResolvable)

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      public fun resourceParameters(resourceParameters: ResourceParametersProperty)

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e019e752ea951abb6e5cc43613ddb0ea299ecb1685bab19de5e6655f1e5ba4c2")
      public
          fun resourceParameters(resourceParameters: ResourceParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty.builder()

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      override fun resourceParameters(resourceParameters: IResolvable) {
        cdkBuilder.resourceParameters(resourceParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      override fun resourceParameters(resourceParameters: ResourceParametersProperty) {
        cdkBuilder.resourceParameters(resourceParameters.let(ResourceParametersProperty.Companion::unwrap))
      }

      /**
       * @param resourceParameters The parameters for EventBridge to use when invoking the resource
       * endpoint. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e019e752ea951abb6e5cc43613ddb0ea299ecb1685bab19de5e6655f1e5ba4c2")
      override
          fun resourceParameters(resourceParameters: ResourceParametersProperty.Builder.() -> Unit):
          Unit = resourceParameters(ResourceParametersProperty(resourceParameters))

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty,
    ) : CdkObject(cdkObject),
        InvocationConnectivityParametersProperty {
      /**
       * The parameters for EventBridge to use when invoking the resource endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-invocationconnectivityparameters.html#cfn-events-connection-invocationconnectivityparameters-resourceparameters)
       */
      override fun resourceParameters(): Any = unwrap(this).getResourceParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InvocationConnectivityParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty):
          InvocationConnectivityParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InvocationConnectivityParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InvocationConnectivityParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.InvocationConnectivityParametersProperty
    }
  }

  /**
   * Contains the OAuth authorization parameters to use for the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * OAuthParametersProperty oAuthParametersProperty = OAuthParametersProperty.builder()
   * .authorizationEndpoint("authorizationEndpoint")
   * .clientParameters(ClientParametersProperty.builder()
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .build())
   * .httpMethod("httpMethod")
   * // the properties below are optional
   * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
   * .bodyParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .headerParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .queryStringParameters(List.of(ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html)
   */
  public interface OAuthParametersProperty {
    /**
     * The URL to the authorization endpoint when OAuth is specified as the authorization type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-authorizationendpoint)
     */
    public fun authorizationEndpoint(): String

    /**
     * The client parameters for OAuth authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-clientparameters)
     */
    public fun clientParameters(): Any

    /**
     * The method to use for the authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-httpmethod)
     */
    public fun httpMethod(): String

    /**
     * Details about the additional parameters to use for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-oauthhttpparameters)
     */
    public fun oAuthHttpParameters(): Any? = unwrap(this).getOAuthHttpParameters()

    /**
     * A builder for [OAuthParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationEndpoint The URL to the authorization endpoint when OAuth is specified
       * as the authorization type. 
       */
      public fun authorizationEndpoint(authorizationEndpoint: String)

      /**
       * @param clientParameters The client parameters for OAuth authorization. 
       */
      public fun clientParameters(clientParameters: IResolvable)

      /**
       * @param clientParameters The client parameters for OAuth authorization. 
       */
      public fun clientParameters(clientParameters: ClientParametersProperty)

      /**
       * @param clientParameters The client parameters for OAuth authorization. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69449c8ef7149b345eee5d7a1b69718c7908ca77a8c2da1131b583a13753e758")
      public fun clientParameters(clientParameters: ClientParametersProperty.Builder.() -> Unit)

      /**
       * @param httpMethod The method to use for the authorization request. 
       */
      public fun httpMethod(httpMethod: String)

      /**
       * @param oAuthHttpParameters Details about the additional parameters to use for the
       * connection.
       */
      public fun oAuthHttpParameters(oAuthHttpParameters: IResolvable)

      /**
       * @param oAuthHttpParameters Details about the additional parameters to use for the
       * connection.
       */
      public fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty)

      /**
       * @param oAuthHttpParameters Details about the additional parameters to use for the
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e35f666f3d23291168480c694ab8d9cc79dd9dbbce39449a8b35b7755a6e1fb")
      public
          fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty.builder()

      /**
       * @param authorizationEndpoint The URL to the authorization endpoint when OAuth is specified
       * as the authorization type. 
       */
      override fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
      }

      /**
       * @param clientParameters The client parameters for OAuth authorization. 
       */
      override fun clientParameters(clientParameters: IResolvable) {
        cdkBuilder.clientParameters(clientParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clientParameters The client parameters for OAuth authorization. 
       */
      override fun clientParameters(clientParameters: ClientParametersProperty) {
        cdkBuilder.clientParameters(clientParameters.let(ClientParametersProperty.Companion::unwrap))
      }

      /**
       * @param clientParameters The client parameters for OAuth authorization. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69449c8ef7149b345eee5d7a1b69718c7908ca77a8c2da1131b583a13753e758")
      override fun clientParameters(clientParameters: ClientParametersProperty.Builder.() -> Unit):
          Unit = clientParameters(ClientParametersProperty(clientParameters))

      /**
       * @param httpMethod The method to use for the authorization request. 
       */
      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      /**
       * @param oAuthHttpParameters Details about the additional parameters to use for the
       * connection.
       */
      override fun oAuthHttpParameters(oAuthHttpParameters: IResolvable) {
        cdkBuilder.oAuthHttpParameters(oAuthHttpParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuthHttpParameters Details about the additional parameters to use for the
       * connection.
       */
      override fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty) {
        cdkBuilder.oAuthHttpParameters(oAuthHttpParameters.let(ConnectionHttpParametersProperty.Companion::unwrap))
      }

      /**
       * @param oAuthHttpParameters Details about the additional parameters to use for the
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e35f666f3d23291168480c694ab8d9cc79dd9dbbce39449a8b35b7755a6e1fb")
      override
          fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit):
          Unit = oAuthHttpParameters(ConnectionHttpParametersProperty(oAuthHttpParameters))

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty,
    ) : CdkObject(cdkObject),
        OAuthParametersProperty {
      /**
       * The URL to the authorization endpoint when OAuth is specified as the authorization type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-authorizationendpoint)
       */
      override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

      /**
       * The client parameters for OAuth authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-clientparameters)
       */
      override fun clientParameters(): Any = unwrap(this).getClientParameters()

      /**
       * The method to use for the authorization request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-httpmethod)
       */
      override fun httpMethod(): String = unwrap(this).getHttpMethod()

      /**
       * Details about the additional parameters to use for the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html#cfn-events-connection-oauthparameters-oauthhttpparameters)
       */
      override fun oAuthHttpParameters(): Any? = unwrap(this).getOAuthHttpParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty):
          OAuthParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? OAuthParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty
    }
  }

  /**
   * Any additional query string parameter for the connection.
   *
   * You can include up to 100 additional query string parameters per request. Each additional
   * parameter counts towards the event payload size, which cannot exceed 64 KB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .isValueSecret(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html)
   */
  public interface ParameterProperty {
    /**
     * Specifies whether the value is secret.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html#cfn-events-connection-parameter-isvaluesecret)
     */
    public fun isValueSecret(): Any? = unwrap(this).getIsValueSecret()

    /**
     * The key for a query string parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html#cfn-events-connection-parameter-key)
     */
    public fun key(): String

    /**
     * The value associated with the key for the query string parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html#cfn-events-connection-parameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isValueSecret Specifies whether the value is secret.
       */
      public fun isValueSecret(isValueSecret: Boolean)

      /**
       * @param isValueSecret Specifies whether the value is secret.
       */
      public fun isValueSecret(isValueSecret: IResolvable)

      /**
       * @param key The key for a query string parameter. 
       */
      public fun key(key: String)

      /**
       * @param value The value associated with the key for the query string parameter. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty.builder()

      /**
       * @param isValueSecret Specifies whether the value is secret.
       */
      override fun isValueSecret(isValueSecret: Boolean) {
        cdkBuilder.isValueSecret(isValueSecret)
      }

      /**
       * @param isValueSecret Specifies whether the value is secret.
       */
      override fun isValueSecret(isValueSecret: IResolvable) {
        cdkBuilder.isValueSecret(isValueSecret.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param key The key for a query string parameter. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value associated with the key for the query string parameter. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnConnection.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.ParameterProperty,
    ) : CdkObject(cdkObject),
        ParameterProperty {
      /**
       * Specifies whether the value is secret.
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html#cfn-events-connection-parameter-isvaluesecret)
       */
      override fun isValueSecret(): Any? = unwrap(this).getIsValueSecret()

      /**
       * The key for a query string parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html#cfn-events-connection-parameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value associated with the key for the query string parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html#cfn-events-connection-parameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ParameterProperty):
          ParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty
    }
  }

  /**
   * The parameters for EventBridge to use when invoking the resource endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ResourceParametersProperty resourceParametersProperty = ResourceParametersProperty.builder()
   * .resourceConfigurationArn("resourceConfigurationArn")
   * // the properties below are optional
   * .resourceAssociationArn("resourceAssociationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-resourceparameters.html)
   */
  public interface ResourceParametersProperty {
    /**
     * For connections to private APIs, the Amazon Resource Name (ARN) of the resource association
     * EventBridge created between the connection and the private API's resource configuration.
     *
     *
     * The value of this property is set by EventBridge . Any value you specify in your template is
     * ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-resourceparameters.html#cfn-events-connection-resourceparameters-resourceassociationarn)
     */
    public fun resourceAssociationArn(): String? = unwrap(this).getResourceAssociationArn()

    /**
     * The Amazon Resource Name (ARN) of the Amazon VPC Lattice resource configuration for the
     * resource endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-resourceparameters.html#cfn-events-connection-resourceparameters-resourceconfigurationarn)
     */
    public fun resourceConfigurationArn(): String

    /**
     * A builder for [ResourceParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceAssociationArn For connections to private APIs, the Amazon Resource Name
       * (ARN) of the resource association EventBridge created between the connection and the private
       * API's resource configuration.
       *
       * The value of this property is set by EventBridge . Any value you specify in your template
       * is ignored.
       */
      public fun resourceAssociationArn(resourceAssociationArn: String)

      /**
       * @param resourceConfigurationArn The Amazon Resource Name (ARN) of the Amazon VPC Lattice
       * resource configuration for the resource endpoint. 
       */
      public fun resourceConfigurationArn(resourceConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty.builder()

      /**
       * @param resourceAssociationArn For connections to private APIs, the Amazon Resource Name
       * (ARN) of the resource association EventBridge created between the connection and the private
       * API's resource configuration.
       *
       * The value of this property is set by EventBridge . Any value you specify in your template
       * is ignored.
       */
      override fun resourceAssociationArn(resourceAssociationArn: String) {
        cdkBuilder.resourceAssociationArn(resourceAssociationArn)
      }

      /**
       * @param resourceConfigurationArn The Amazon Resource Name (ARN) of the Amazon VPC Lattice
       * resource configuration for the resource endpoint. 
       */
      override fun resourceConfigurationArn(resourceConfigurationArn: String) {
        cdkBuilder.resourceConfigurationArn(resourceConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty,
    ) : CdkObject(cdkObject),
        ResourceParametersProperty {
      /**
       * For connections to private APIs, the Amazon Resource Name (ARN) of the resource association
       * EventBridge created between the connection and the private API's resource configuration.
       *
       *
       * The value of this property is set by EventBridge . Any value you specify in your template
       * is ignored.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-resourceparameters.html#cfn-events-connection-resourceparameters-resourceassociationarn)
       */
      override fun resourceAssociationArn(): String? = unwrap(this).getResourceAssociationArn()

      /**
       * The Amazon Resource Name (ARN) of the Amazon VPC Lattice resource configuration for the
       * resource endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-resourceparameters.html#cfn-events-connection-resourceparameters-resourceconfigurationarn)
       */
      override fun resourceConfigurationArn(): String = unwrap(this).getResourceConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty):
          ResourceParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnConnection.ResourceParametersProperty
    }
  }
}
