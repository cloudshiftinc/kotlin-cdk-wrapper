@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnChannelNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnChannelNamespaceProps cfnChannelNamespaceProps = CfnChannelNamespaceProps.builder()
 * .apiId("apiId")
 * .name("name")
 * // the properties below are optional
 * .codeHandlers("codeHandlers")
 * .codeS3Location("codeS3Location")
 * .publishAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * .subscribeAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html)
 */
public interface CfnChannelNamespaceProps {
  /**
   * The `Api` ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-apiid)
   */
  public fun apiId(): String

  /**
   * The event handler functions that run custom business logic to process published events and
   * subscribe requests.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codehandlers)
   */
  public fun codeHandlers(): String? = unwrap(this).getCodeHandlers()

  /**
   * The Amazon S3 endpoint where the code is located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codes3location)
   */
  public fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  /**
   * The name of the channel namespace.
   *
   * This name must be unique within the `Api` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-name)
   */
  public fun name(): String

  /**
   * The authorization mode to use for publishing messages on the channel namespace.
   *
   * This configuration overrides the default `Api` authorization configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
   */
  public fun publishAuthModes(): Any? = unwrap(this).getPublishAuthModes()

  /**
   * The authorization mode to use for subscribing to messages on the channel namespace.
   *
   * This configuration overrides the default `Api` authorization configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
   */
  public fun subscribeAuthModes(): Any? = unwrap(this).getSubscribeAuthModes()

  /**
   * A set of tags (key-value pairs) for this channel namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The `Api` ID. 
     */
    public fun apiId(apiId: String)

    /**
     * @param codeHandlers The event handler functions that run custom business logic to process
     * published events and subscribe requests.
     */
    public fun codeHandlers(codeHandlers: String)

    /**
     * @param codeS3Location The Amazon S3 endpoint where the code is located.
     */
    public fun codeS3Location(codeS3Location: String)

    /**
     * @param name The name of the channel namespace. 
     * This name must be unique within the `Api` .
     */
    public fun name(name: String)

    /**
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    public fun publishAuthModes(publishAuthModes: IResolvable)

    /**
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    public fun publishAuthModes(publishAuthModes: List<Any>)

    /**
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    public fun publishAuthModes(vararg publishAuthModes: Any)

    /**
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    public fun subscribeAuthModes(subscribeAuthModes: IResolvable)

    /**
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    public fun subscribeAuthModes(subscribeAuthModes: List<Any>)

    /**
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    public fun subscribeAuthModes(vararg subscribeAuthModes: Any)

    /**
     * @param tags A set of tags (key-value pairs) for this channel namespace.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of tags (key-value pairs) for this channel namespace.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps.Builder
        = software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps.builder()

    /**
     * @param apiId The `Api` ID. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param codeHandlers The event handler functions that run custom business logic to process
     * published events and subscribe requests.
     */
    override fun codeHandlers(codeHandlers: String) {
      cdkBuilder.codeHandlers(codeHandlers)
    }

    /**
     * @param codeS3Location The Amazon S3 endpoint where the code is located.
     */
    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    /**
     * @param name The name of the channel namespace. 
     * This name must be unique within the `Api` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    override fun publishAuthModes(publishAuthModes: IResolvable) {
      cdkBuilder.publishAuthModes(publishAuthModes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    override fun publishAuthModes(publishAuthModes: List<Any>) {
      cdkBuilder.publishAuthModes(publishAuthModes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    override fun publishAuthModes(vararg publishAuthModes: Any): Unit =
        publishAuthModes(publishAuthModes.toList())

    /**
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    override fun subscribeAuthModes(subscribeAuthModes: IResolvable) {
      cdkBuilder.subscribeAuthModes(subscribeAuthModes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    override fun subscribeAuthModes(subscribeAuthModes: List<Any>) {
      cdkBuilder.subscribeAuthModes(subscribeAuthModes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace.
     * This configuration overrides the default `Api` authorization configuration.
     */
    override fun subscribeAuthModes(vararg subscribeAuthModes: Any): Unit =
        subscribeAuthModes(subscribeAuthModes.toList())

    /**
     * @param tags A set of tags (key-value pairs) for this channel namespace.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A set of tags (key-value pairs) for this channel namespace.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps,
  ) : CdkObject(cdkObject),
      CfnChannelNamespaceProps {
    /**
     * The `Api` ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The event handler functions that run custom business logic to process published events and
     * subscribe requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codehandlers)
     */
    override fun codeHandlers(): String? = unwrap(this).getCodeHandlers()

    /**
     * The Amazon S3 endpoint where the code is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codes3location)
     */
    override fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

    /**
     * The name of the channel namespace.
     *
     * This name must be unique within the `Api` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     */
    override fun publishAuthModes(): Any? = unwrap(this).getPublishAuthModes()

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     */
    override fun subscribeAuthModes(): Any? = unwrap(this).getSubscribeAuthModes()

    /**
     * A set of tags (key-value pairs) for this channel namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps):
        CfnChannelNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelNamespaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelNamespaceProps):
        software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps
  }
}
