@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnAuthorizer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnAuthorizerProps cfnAuthorizerProps = CfnAuthorizerProps.builder()
 * .authorizerFunctionArn("authorizerFunctionArn")
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .enableCachingForHttp(false)
 * .signingDisabled(false)
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tokenKeyName("tokenKeyName")
 * .tokenSigningPublicKeys(Map.of(
 * "tokenSigningPublicKeysKey", "tokenSigningPublicKeys"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html)
 */
public interface CfnAuthorizerProps {
  /**
   * The authorizer's Lambda function ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizerfunctionarn)
   */
  public fun authorizerFunctionArn(): String

  /**
   * The authorizer name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizername)
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * When `true` , the result from the authorizer's Lambda function is cached for clients that use
   * persistent HTTP connections.
   *
   * The results are cached for the time specified by the Lambda function in `refreshAfterInSeconds`
   * . This value doesn't affect authorization of clients that use MQTT connections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
   */
  public fun enableCachingForHttp(): Any? = unwrap(this).getEnableCachingForHttp()

  /**
   * Specifies whether AWS IoT validates the token signature in an authorization request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
   */
  public fun signingDisabled(): Any? = unwrap(this).getSigningDisabled()

  /**
   * The status of the authorizer.
   *
   * Valid values: `ACTIVE` | `INACTIVE`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Metadata which can be used to manage the custom authorizer.
   *
   *
   * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
   *
   * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
   *
   * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The key used to extract the token from the HTTP headers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokenkeyname)
   */
  public fun tokenKeyName(): String? = unwrap(this).getTokenKeyName()

  /**
   * The public keys used to validate the token signature returned by your custom authentication
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
   */
  public fun tokenSigningPublicKeys(): Any? = unwrap(this).getTokenSigningPublicKeys()

  /**
   * A builder for [CfnAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerFunctionArn The authorizer's Lambda function ARN. 
     */
    public fun authorizerFunctionArn(authorizerFunctionArn: String)

    /**
     * @param authorizerName The authorizer name.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections.
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     */
    public fun enableCachingForHttp(enableCachingForHttp: Boolean)

    /**
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections.
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     */
    public fun enableCachingForHttp(enableCachingForHttp: IResolvable)

    /**
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request.
     */
    public fun signingDisabled(signingDisabled: Boolean)

    /**
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request.
     */
    public fun signingDisabled(signingDisabled: IResolvable)

    /**
     * @param status The status of the authorizer.
     * Valid values: `ACTIVE` | `INACTIVE`
     */
    public fun status(status: String)

    /**
     * @param tags Metadata which can be used to manage the custom authorizer.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the custom authorizer.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tokenKeyName The key used to extract the token from the HTTP headers.
     */
    public fun tokenKeyName(tokenKeyName: String)

    /**
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service.
     */
    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable)

    /**
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service.
     */
    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnAuthorizerProps.Builder =
        software.amazon.awscdk.services.iot.CfnAuthorizerProps.builder()

    /**
     * @param authorizerFunctionArn The authorizer's Lambda function ARN. 
     */
    override fun authorizerFunctionArn(authorizerFunctionArn: String) {
      cdkBuilder.authorizerFunctionArn(authorizerFunctionArn)
    }

    /**
     * @param authorizerName The authorizer name.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections.
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     */
    override fun enableCachingForHttp(enableCachingForHttp: Boolean) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    /**
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     * cached for clients that use persistent HTTP connections.
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     */
    override fun enableCachingForHttp(enableCachingForHttp: IResolvable) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request.
     */
    override fun signingDisabled(signingDisabled: Boolean) {
      cdkBuilder.signingDisabled(signingDisabled)
    }

    /**
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     * authorization request.
     */
    override fun signingDisabled(signingDisabled: IResolvable) {
      cdkBuilder.signingDisabled(signingDisabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param status The status of the authorizer.
     * Valid values: `ACTIVE` | `INACTIVE`
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags Metadata which can be used to manage the custom authorizer.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the custom authorizer.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tokenKeyName The key used to extract the token from the HTTP headers.
     */
    override fun tokenKeyName(tokenKeyName: String) {
      cdkBuilder.tokenKeyName(tokenKeyName)
    }

    /**
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service.
     */
    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     * by your custom authentication service.
     */
    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAuthorizerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizerProps,
  ) : CdkObject(cdkObject),
      CfnAuthorizerProps {
    /**
     * The authorizer's Lambda function ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizerfunctionarn)
     */
    override fun authorizerFunctionArn(): String = unwrap(this).getAuthorizerFunctionArn()

    /**
     * The authorizer name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizername)
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     */
    override fun enableCachingForHttp(): Any? = unwrap(this).getEnableCachingForHttp()

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     */
    override fun signingDisabled(): Any? = unwrap(this).getSigningDisabled()

    /**
     * The status of the authorizer.
     *
     * Valid values: `ACTIVE` | `INACTIVE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The key used to extract the token from the HTTP headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokenkeyname)
     */
    override fun tokenKeyName(): String? = unwrap(this).getTokenKeyName()

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     */
    override fun tokenSigningPublicKeys(): Any? = unwrap(this).getTokenSigningPublicKeys()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizerProps):
        CfnAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAuthorizerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizerProps):
        software.amazon.awscdk.services.iot.CfnAuthorizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnAuthorizerProps
  }
}
