package io.cloudshiftdev.awscdk.services.evidently

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

public open class CfnSegment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnSegment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the segment.
   *
   * For example, `arn:aws:evidently:us-west-2:123456789012:segment/australiaSegment`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An optional description for this segment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description for this segment.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name for the segment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the segment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The pattern to use for the segment.
   */
  public open fun pattern(): String? = unwrap(this).getPattern()

  /**
   * The pattern to use for the segment.
   */
  public open fun pattern(`value`: String) {
    unwrap(this).setPattern(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Assigns one or more tags (key-value pairs) to the feature.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.evidently.CfnSegment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for this segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-description)
     * @param description An optional description for this segment. 
     */
    public fun description(description: String)

    /**
     * A name for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-name)
     * @param name A name for the segment. 
     */
    public fun name(name: String)

    /**
     * The pattern to use for the segment.
     *
     * For more information about pattern syntax, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-pattern)
     * @param pattern The pattern to use for the segment. 
     */
    public fun pattern(pattern: String)

    /**
     * Assigns one or more tags (key-value pairs) to the feature.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a feature.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the feature. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Assigns one or more tags (key-value pairs) to the feature.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a feature.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the feature. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnSegment.Builder =
        software.amazon.awscdk.services.evidently.CfnSegment.Builder.create(scope, id)

    /**
     * An optional description for this segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-description)
     * @param description An optional description for this segment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-name)
     * @param name A name for the segment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The pattern to use for the segment.
     *
     * For more information about pattern syntax, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-pattern)
     * @param pattern The pattern to use for the segment. 
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * Assigns one or more tags (key-value pairs) to the feature.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a feature.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the feature. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Assigns one or more tags (key-value pairs) to the feature.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a feature.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the feature. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnSegment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSegment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSegment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnSegment): CfnSegment =
        CfnSegment(cdkObject)

    internal fun unwrap(wrapped: CfnSegment): software.amazon.awscdk.services.evidently.CfnSegment =
        wrapped.cdkObject
  }
}
