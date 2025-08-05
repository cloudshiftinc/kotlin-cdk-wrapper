@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
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
public interface CfnConnectionProps {
  /**
   * The authorization parameters to use to authorize with the endpoint.
   *
   * You must include only authorization parameters for the `AuthorizationType` you specify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
   */
  public fun authParameters(): Any? = unwrap(this).getAuthParameters()

  /**
   * The type of authorization to use for the connection.
   *
   *
   * OAUTH tokens are refreshed when a 401 or 407 response is returned.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
   */
  public fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  /**
   * A description for the connection to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * For connections to private APIs, the parameters to use for invoking the API.
   *
   * For more information, see [Connecting to private
   * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
   * **Amazon EventBridge User Guide** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
   */
  public fun invocationConnectivityParameters(): Any? =
      unwrap(this).getInvocationConnectivityParameters()

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt this connection.
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
   */
  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The name for the connection to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [CfnConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authParameters The authorization parameters to use to authorize with the endpoint.
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     */
    public fun authParameters(authParameters: IResolvable)

    /**
     * @param authParameters The authorization parameters to use to authorize with the endpoint.
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     */
    public fun authParameters(authParameters: CfnConnection.AuthParametersProperty)

    /**
     * @param authParameters The authorization parameters to use to authorize with the endpoint.
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf937ae1aa8f4c90c97e3448b625c5c03492ccadd908836c6f18632e7bbb3499")
    public
        fun authParameters(authParameters: CfnConnection.AuthParametersProperty.Builder.() -> Unit)

    /**
     * @param authorizationType The type of authorization to use for the connection.
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     */
    public fun authorizationType(authorizationType: String)

    /**
     * @param description A description for the connection to create.
     */
    public fun description(description: String)

    /**
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API.
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     */
    public fun invocationConnectivityParameters(invocationConnectivityParameters: IResolvable)

    /**
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API.
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     */
    public
        fun invocationConnectivityParameters(invocationConnectivityParameters: CfnConnection.InvocationConnectivityParametersProperty)

    /**
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API.
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cde2803880cc27f9f21bfdfcc7817f53c11e92e43490873291f8da85e402e15")
    public
        fun invocationConnectivityParameters(invocationConnectivityParameters: CfnConnection.InvocationConnectivityParametersProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt this connection.
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the connection.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * @param name The name for the connection to create.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.events.CfnConnectionProps.builder()

    /**
     * @param authParameters The authorization parameters to use to authorize with the endpoint.
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     */
    override fun authParameters(authParameters: IResolvable) {
      cdkBuilder.authParameters(authParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param authParameters The authorization parameters to use to authorize with the endpoint.
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     */
    override fun authParameters(authParameters: CfnConnection.AuthParametersProperty) {
      cdkBuilder.authParameters(authParameters.let(CfnConnection.AuthParametersProperty.Companion::unwrap))
    }

    /**
     * @param authParameters The authorization parameters to use to authorize with the endpoint.
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf937ae1aa8f4c90c97e3448b625c5c03492ccadd908836c6f18632e7bbb3499")
    override
        fun authParameters(authParameters: CfnConnection.AuthParametersProperty.Builder.() -> Unit):
        Unit = authParameters(CfnConnection.AuthParametersProperty(authParameters))

    /**
     * @param authorizationType The type of authorization to use for the connection.
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param description A description for the connection to create.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API.
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     */
    override fun invocationConnectivityParameters(invocationConnectivityParameters: IResolvable) {
      cdkBuilder.invocationConnectivityParameters(invocationConnectivityParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API.
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     */
    override
        fun invocationConnectivityParameters(invocationConnectivityParameters: CfnConnection.InvocationConnectivityParametersProperty) {
      cdkBuilder.invocationConnectivityParameters(invocationConnectivityParameters.let(CfnConnection.InvocationConnectivityParametersProperty.Companion::unwrap))
    }

    /**
     * @param invocationConnectivityParameters For connections to private APIs, the parameters to
     * use for invoking the API.
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cde2803880cc27f9f21bfdfcc7817f53c11e92e43490873291f8da85e402e15")
    override
        fun invocationConnectivityParameters(invocationConnectivityParameters: CfnConnection.InvocationConnectivityParametersProperty.Builder.() -> Unit):
        Unit =
        invocationConnectivityParameters(CfnConnection.InvocationConnectivityParametersProperty(invocationConnectivityParameters))

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt this connection.
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the connection.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param name The name for the connection to create.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.CfnConnectionProps,
  ) : CdkObject(cdkObject),
      CfnConnectionProps {
    /**
     * The authorization parameters to use to authorize with the endpoint.
     *
     * You must include only authorization parameters for the `AuthorizationType` you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     */
    override fun authParameters(): Any? = unwrap(this).getAuthParameters()

    /**
     * The type of authorization to use for the connection.
     *
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
     */
    override fun authorizationType(): String? = unwrap(this).getAuthorizationType()

    /**
     * A description for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * For connections to private APIs, the parameters to use for invoking the API.
     *
     * For more information, see [Connecting to private
     * APIs](https://docs.aws.amazon.com/eventbridge/latest/userguide/connection-private.html) in the
     * **Amazon EventBridge User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-invocationconnectivityparameters)
     */
    override fun invocationConnectivityParameters(): Any? =
        unwrap(this).getInvocationConnectivityParameters()

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
     */
    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    /**
     * The name for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnectionProps):
        CfnConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.events.CfnConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnConnectionProps
  }
}
