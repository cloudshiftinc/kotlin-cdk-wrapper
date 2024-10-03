@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFarm`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnFarmProps cfnFarmProps = CfnFarmProps.builder()
 * .displayName("displayName")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyArn("kmsKeyArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html)
 */
public interface CfnFarmProps {
  /**
   * A description of the farm that helps identify what the farm is used for.
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the farm.
   *
   *
   * This field can store any content. Escape or encode this content before displaying it on a
   * webpage or any other system that might interpret the content of this field.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-displayname)
   */
  public fun displayName(): String

  /**
   * The ARN for the KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The tags to add to your farm.
   *
   * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag
   * values can be empty strings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFarmProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the farm that helps identify what the farm is used for.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the farm. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    public fun displayName(displayName: String)

    /**
     * @param kmsKeyArn The ARN for the KMS key.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param tags The tags to add to your farm.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to your farm.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnFarmProps.Builder =
        software.amazon.awscdk.services.deadline.CfnFarmProps.builder()

    /**
     * @param description A description of the farm that helps identify what the farm is used for.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the farm. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param kmsKeyArn The ARN for the KMS key.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param tags The tags to add to your farm.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to your farm.
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.deadline.CfnFarmProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnFarmProps,
  ) : CdkObject(cdkObject),
      CfnFarmProps {
    /**
     * A description of the farm that helps identify what the farm is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the farm.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The ARN for the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The tags to add to your farm.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFarmProps):
        CfnFarmProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFarmProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFarmProps):
        software.amazon.awscdk.services.deadline.CfnFarmProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.deadline.CfnFarmProps
  }
}
