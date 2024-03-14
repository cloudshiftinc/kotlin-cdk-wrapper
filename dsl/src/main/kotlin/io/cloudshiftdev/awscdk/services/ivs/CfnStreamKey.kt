package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ivs.CfnStreamKey,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The stream-key ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:stream-key/g1H2I3j4k5L6`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The stream-key value.
   *
   * For example: `sk_us-west-2_abcdABCDefgh_567890abcdef`
   */
  public open fun attrValue(): String = unwrap(this).getAttrValue()

  /**
   * Channel ARN for the stream.
   */
  public open fun channelArn(): String = unwrap(this).getChannelArn()

  /**
   * Channel ARN for the stream.
   */
  public open fun channelArn(`value`: String) {
    unwrap(this).setChannelArn(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnStreamKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Channel ARN for the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html#cfn-ivs-streamkey-channelarn)
     * @param channelArn Channel ARN for the stream. 
     */
    public fun channelArn(channelArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-streamkey-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html#cfn-ivs-streamkey-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-streamkey-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html#cfn-ivs-streamkey-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnStreamKey.Builder =
        software.amazon.awscdk.services.ivs.CfnStreamKey.Builder.create(scope, id)

    /**
     * Channel ARN for the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html#cfn-ivs-streamkey-channelarn)
     * @param channelArn Channel ARN for the stream. 
     */
    override fun channelArn(channelArn: String) {
      cdkBuilder.channelArn(channelArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-streamkey-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html#cfn-ivs-streamkey-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-streamkey-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html#cfn-ivs-streamkey-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnStreamKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnStreamKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStreamKey): CfnStreamKey =
        CfnStreamKey(cdkObject)

    internal fun unwrap(wrapped: CfnStreamKey): software.amazon.awscdk.services.ivs.CfnStreamKey =
        wrapped.cdkObject
  }
}
