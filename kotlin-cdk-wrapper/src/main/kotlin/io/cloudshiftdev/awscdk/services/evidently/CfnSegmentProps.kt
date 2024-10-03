@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSegment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evidently.*;
 * CfnSegmentProps cfnSegmentProps = CfnSegmentProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .pattern("pattern")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html)
 */
public interface CfnSegmentProps {
  /**
   * An optional description for this segment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the segment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-name)
   */
  public fun name(): String

  /**
   * The pattern to use for the segment.
   *
   * For more information about pattern syntax, see [Segment rule pattern
   * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-pattern)
   */
  public fun pattern(): String? = unwrap(this).getPattern()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSegmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description for this segment.
     */
    public fun description(description: String)

    /**
     * @param name A name for the segment. 
     */
    public fun name(name: String)

    /**
     * @param pattern The pattern to use for the segment.
     * For more information about pattern syntax, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     */
    public fun pattern(pattern: String)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnSegmentProps.Builder =
        software.amazon.awscdk.services.evidently.CfnSegmentProps.builder()

    /**
     * @param description An optional description for this segment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the segment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param pattern The pattern to use for the segment.
     * For more information about pattern syntax, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnSegmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.evidently.CfnSegmentProps,
  ) : CdkObject(cdkObject),
      CfnSegmentProps {
    /**
     * An optional description for this segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The pattern to use for the segment.
     *
     * For more information about pattern syntax, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html#cfn-evidently-segment-pattern)
     */
    override fun pattern(): String? = unwrap(this).getPattern()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSegmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnSegmentProps):
        CfnSegmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSegmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSegmentProps):
        software.amazon.awscdk.services.evidently.CfnSegmentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnSegmentProps
  }
}
