package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAuthorizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the authorizer.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The authorizer's Lambda function ARN.
   */
  public open fun authorizerFunctionArn(): String = unwrap(this).getAuthorizerFunctionArn()

  /**
   * The authorizer's Lambda function ARN.
   */
  public open fun authorizerFunctionArn(`value`: String) {
    unwrap(this).setAuthorizerFunctionArn(`value`)
  }

  /**
   * The authorizer name.
   */
  public open fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The authorizer name.
   */
  public open fun authorizerName(`value`: String) {
    unwrap(this).setAuthorizerName(`value`)
  }

  /**
   * When `true` , the result from the authorizer's Lambda function is cached for clients that use
   * persistent HTTP connections.
   */
  public open fun enableCachingForHttp(): Any? = unwrap(this).getEnableCachingForHttp()

  /**
   * When `true` , the result from the authorizer's Lambda function is cached for clients that use
   * persistent HTTP connections.
   */
  public open fun enableCachingForHttp(`value`: Boolean) {
    unwrap(this).setEnableCachingForHttp(`value`)
  }

  /**
   * When `true` , the result from the authorizer's Lambda function is cached for clients that use
   * persistent HTTP connections.
   */
  public open fun enableCachingForHttp(`value`: IResolvable) {
    unwrap(this).setEnableCachingForHttp(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies whether AWS IoT validates the token signature in an authorization request.
   */
  public open fun signingDisabled(): Any? = unwrap(this).getSigningDisabled()

  /**
   * Specifies whether AWS IoT validates the token signature in an authorization request.
   */
  public open fun signingDisabled(`value`: Boolean) {
    unwrap(this).setSigningDisabled(`value`)
  }

  /**
   * Specifies whether AWS IoT validates the token signature in an authorization request.
   */
  public open fun signingDisabled(`value`: IResolvable) {
    unwrap(this).setSigningDisabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The status of the authorizer.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the authorizer.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the custom authorizer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the custom authorizer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the custom authorizer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The key used to extract the token from the HTTP headers.
   */
  public open fun tokenKeyName(): String? = unwrap(this).getTokenKeyName()

  /**
   * The key used to extract the token from the HTTP headers.
   */
  public open fun tokenKeyName(`value`: String) {
    unwrap(this).setTokenKeyName(`value`)
  }

  /**
   * The public keys used to validate the token signature returned by your custom authentication
   * service.
   */
  public open fun tokenSigningPublicKeys(): Any? = unwrap(this).getTokenSigningPublicKeys()

  /**
   * The public keys used to validate the token signature returned by your custom authentication
   * service.
   */
  public open fun tokenSigningPublicKeys(`value`: IResolvable) {
    unwrap(this).setTokenSigningPublicKeys(`value`.let(IResolvable::unwrap))
  }

  /**
   * The public keys used to validate the token signature returned by your custom authentication
   * service.
   */
  public open fun tokenSigningPublicKeys(`value`: Map<String, String>) {
    unwrap(this).setTokenSigningPublicKeys(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The authorizer's Lambda function ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizerfunctionarn)
     * @param authorizerFunctionArn The authorizer's Lambda function ARN. 
     */
    public fun authorizerFunctionArn(authorizerFunctionArn: String)

    /**
     * The authorizer name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizername)
     * @param authorizerName The authorizer name. 
     */
    public fun authorizerName(authorizerName: String)

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections. 
     */
    public fun enableCachingForHttp(enableCachingForHttp: Boolean)

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections. 
     */
    public fun enableCachingForHttp(enableCachingForHttp: IResolvable)

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request. 
     */
    public fun signingDisabled(signingDisabled: Boolean)

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request. 
     */
    public fun signingDisabled(signingDisabled: IResolvable)

    /**
     * The status of the authorizer.
     *
     * Valid values: `ACTIVE` | `INACTIVE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-status)
     * @param status The status of the authorizer. 
     */
    public fun status(status: String)

    /**
     * Metadata which can be used to manage the custom authorizer.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
     * @param tags Metadata which can be used to manage the custom authorizer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the custom authorizer.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
     * @param tags Metadata which can be used to manage the custom authorizer. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The key used to extract the token from the HTTP headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokenkeyname)
     * @param tokenKeyName The key used to extract the token from the HTTP headers. 
     */
    public fun tokenKeyName(tokenKeyName: String)

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service. 
     */
    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable)

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service. 
     */
    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnAuthorizer.Builder =
        software.amazon.awscdk.services.iot.CfnAuthorizer.Builder.create(scope, id)

    /**
     * The authorizer's Lambda function ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizerfunctionarn)
     * @param authorizerFunctionArn The authorizer's Lambda function ARN. 
     */
    override fun authorizerFunctionArn(authorizerFunctionArn: String) {
      cdkBuilder.authorizerFunctionArn(authorizerFunctionArn)
    }

    /**
     * The authorizer name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizername)
     * @param authorizerName The authorizer name. 
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections. 
     */
    override fun enableCachingForHttp(enableCachingForHttp: Boolean) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections. 
     */
    override fun enableCachingForHttp(enableCachingForHttp: IResolvable) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request. 
     */
    override fun signingDisabled(signingDisabled: Boolean) {
      cdkBuilder.signingDisabled(signingDisabled)
    }

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request. 
     */
    override fun signingDisabled(signingDisabled: IResolvable) {
      cdkBuilder.signingDisabled(signingDisabled.let(IResolvable::unwrap))
    }

    /**
     * The status of the authorizer.
     *
     * Valid values: `ACTIVE` | `INACTIVE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-status)
     * @param status The status of the authorizer. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * Metadata which can be used to manage the custom authorizer.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
     * @param tags Metadata which can be used to manage the custom authorizer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the custom authorizer.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
     * @param tags Metadata which can be used to manage the custom authorizer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The key used to extract the token from the HTTP headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokenkeyname)
     * @param tokenKeyName The key used to extract the token from the HTTP headers. 
     */
    override fun tokenKeyName(tokenKeyName: String) {
      cdkBuilder.tokenKeyName(tokenKeyName)
    }

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service. 
     */
    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys.let(IResolvable::unwrap))
    }

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service. 
     */
    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAuthorizer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizer): CfnAuthorizer =
        CfnAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizer): software.amazon.awscdk.services.iot.CfnAuthorizer =
        wrapped.cdkObject
  }
}
