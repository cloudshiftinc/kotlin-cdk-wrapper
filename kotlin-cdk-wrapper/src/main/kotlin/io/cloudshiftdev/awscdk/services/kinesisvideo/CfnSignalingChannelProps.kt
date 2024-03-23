@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSignalingChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisvideo.*;
 * CfnSignalingChannelProps cfnSignalingChannelProps = CfnSignalingChannelProps.builder()
 * .messageTtlSeconds(123)
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html)
 */
public interface CfnSignalingChannelProps {
  /**
   * The period of time a signaling channel retains undelivered messages before they are discarded.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-messagettlseconds)
   */
  public fun messageTtlSeconds(): Number? = unwrap(this).getMessageTtlSeconds()

  /**
   * A name for the signaling channel that you are creating.
   *
   * It must be unique for each AWS account and AWS Region .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A type of the signaling channel that you are creating.
   *
   * Currently, `SINGLE_MASTER` is the only supported channel type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnSignalingChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param messageTtlSeconds The period of time a signaling channel retains undelivered messages
     * before they are discarded.
     */
    public fun messageTtlSeconds(messageTtlSeconds: Number)

    /**
     * @param name A name for the signaling channel that you are creating.
     * It must be unique for each AWS account and AWS Region .
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type A type of the signaling channel that you are creating.
     * Currently, `SINGLE_MASTER` is the only supported channel type.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps.Builder =
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps.builder()

    /**
     * @param messageTtlSeconds The period of time a signaling channel retains undelivered messages
     * before they are discarded.
     */
    override fun messageTtlSeconds(messageTtlSeconds: Number) {
      cdkBuilder.messageTtlSeconds(messageTtlSeconds)
    }

    /**
     * @param name A name for the signaling channel that you are creating.
     * It must be unique for each AWS account and AWS Region .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type A type of the signaling channel that you are creating.
     * Currently, `SINGLE_MASTER` is the only supported channel type.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps,
  ) : CdkObject(cdkObject), CfnSignalingChannelProps {
    /**
     * The period of time a signaling channel retains undelivered messages before they are
     * discarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-messagettlseconds)
     */
    override fun messageTtlSeconds(): Number? = unwrap(this).getMessageTtlSeconds()

    /**
     * A name for the signaling channel that you are creating.
     *
     * It must be unique for each AWS account and AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A type of the signaling channel that you are creating.
     *
     * Currently, `SINGLE_MASTER` is the only supported channel type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSignalingChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps):
        CfnSignalingChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSignalingChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSignalingChannelProps):
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
  }
}
