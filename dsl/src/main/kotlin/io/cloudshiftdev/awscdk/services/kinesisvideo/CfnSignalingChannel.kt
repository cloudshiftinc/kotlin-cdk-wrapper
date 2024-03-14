package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSignalingChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the signaling channel.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The period of time a signaling channel retains undelivered messages before they are discarded.
   */
  public open fun messageTtlSeconds(): Number? = unwrap(this).getMessageTtlSeconds()

  /**
   * The period of time a signaling channel retains undelivered messages before they are discarded.
   */
  public open fun messageTtlSeconds(`value`: Number) {
    unwrap(this).setMessageTtlSeconds(`value`)
  }

  /**
   * A name for the signaling channel that you are creating.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A name for the signaling channel that you are creating.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A type of the signaling channel that you are creating.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * A type of the signaling channel that you are creating.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisvideo.CfnSignalingChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The period of time a signaling channel retains undelivered messages before they are
     * discarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-messagettlseconds)
     * @param messageTtlSeconds The period of time a signaling channel retains undelivered messages
     * before they are discarded. 
     */
    public fun messageTtlSeconds(messageTtlSeconds: Number)

    /**
     * A name for the signaling channel that you are creating.
     *
     * It must be unique for each AWS account and AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-name)
     * @param name A name for the signaling channel that you are creating. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A type of the signaling channel that you are creating.
     *
     * Currently, `SINGLE_MASTER` is the only supported channel type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-type)
     * @param type A type of the signaling channel that you are creating. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel.Builder
        = software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel.Builder.create(scope, id)

    /**
     * The period of time a signaling channel retains undelivered messages before they are
     * discarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-messagettlseconds)
     * @param messageTtlSeconds The period of time a signaling channel retains undelivered messages
     * before they are discarded. 
     */
    override fun messageTtlSeconds(messageTtlSeconds: Number) {
      cdkBuilder.messageTtlSeconds(messageTtlSeconds)
    }

    /**
     * A name for the signaling channel that you are creating.
     *
     * It must be unique for each AWS account and AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-name)
     * @param name A name for the signaling channel that you are creating. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A type of the signaling channel that you are creating.
     *
     * Currently, `SINGLE_MASTER` is the only supported channel type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-type)
     * @param type A type of the signaling channel that you are creating. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSignalingChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSignalingChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel):
        CfnSignalingChannel = CfnSignalingChannel(cdkObject)

    internal fun unwrap(wrapped: CfnSignalingChannel):
        software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel = wrapped.cdkObject
  }
}
