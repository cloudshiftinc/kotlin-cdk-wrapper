@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLimit`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnLimitProps cfnLimitProps = CfnLimitProps.builder()
 * .amountRequirementName("amountRequirementName")
 * .displayName("displayName")
 * .farmId("farmId")
 * .maxCount(123)
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html)
 */
public interface CfnLimitProps {
  /**
   * The value that you specify as the `name` in the `amounts` field of the `hostRequirements` in a
   * step of a job template to declare the limit requirement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-amountrequirementname)
   */
  public fun amountRequirementName(): String

  /**
   * A description of the limit. A clear description helps you identify the purpose of the limit.
   *
   *
   * This field can store any content. Escape or encode this content before displaying it on a
   * webpage or any other system that might interpret the content of this field.
   *
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the limit used in lists to identify the limit.
   *
   *
   * This field can store any content. Escape or encode this content before displaying it on a
   * webpage or any other system that might interpret the content of this field.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-displayname)
   */
  public fun displayName(): String

  /**
   * The unique identifier of the farm that contains the limit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-farmid)
   */
  public fun farmId(): String

  /**
   * The maximum number of resources constrained by this limit.
   *
   * When all of the resources are in use, steps that require the limit won't be scheduled until the
   * resource is available.
   *
   * The `maxValue` must not be 0. If the value is -1, there is no restriction on the number of
   * resources that can be acquired for this limit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-maxcount)
   */
  public fun maxCount(): Number

  /**
   * A builder for [CfnLimitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amountRequirementName The value that you specify as the `name` in the `amounts` field
     * of the `hostRequirements` in a step of a job template to declare the limit requirement. 
     */
    public fun amountRequirementName(amountRequirementName: String)

    /**
     * @param description A description of the limit. A clear description helps you identify the
     * purpose of the limit.
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    public fun description(description: String)

    /**
     * @param displayName The name of the limit used in lists to identify the limit. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    public fun displayName(displayName: String)

    /**
     * @param farmId The unique identifier of the farm that contains the limit. 
     */
    public fun farmId(farmId: String)

    /**
     * @param maxCount The maximum number of resources constrained by this limit. 
     * When all of the resources are in use, steps that require the limit won't be scheduled until
     * the resource is available.
     *
     * The `maxValue` must not be 0. If the value is -1, there is no restriction on the number of
     * resources that can be acquired for this limit.
     */
    public fun maxCount(maxCount: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnLimitProps.Builder =
        software.amazon.awscdk.services.deadline.CfnLimitProps.builder()

    /**
     * @param amountRequirementName The value that you specify as the `name` in the `amounts` field
     * of the `hostRequirements` in a step of a job template to declare the limit requirement. 
     */
    override fun amountRequirementName(amountRequirementName: String) {
      cdkBuilder.amountRequirementName(amountRequirementName)
    }

    /**
     * @param description A description of the limit. A clear description helps you identify the
     * purpose of the limit.
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the limit used in lists to identify the limit. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param farmId The unique identifier of the farm that contains the limit. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param maxCount The maximum number of resources constrained by this limit. 
     * When all of the resources are in use, steps that require the limit won't be scheduled until
     * the resource is available.
     *
     * The `maxValue` must not be 0. If the value is -1, there is no restriction on the number of
     * resources that can be acquired for this limit.
     */
    override fun maxCount(maxCount: Number) {
      cdkBuilder.maxCount(maxCount)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnLimitProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnLimitProps,
  ) : CdkObject(cdkObject),
      CfnLimitProps {
    /**
     * The value that you specify as the `name` in the `amounts` field of the `hostRequirements` in
     * a step of a job template to declare the limit requirement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-amountrequirementname)
     */
    override fun amountRequirementName(): String = unwrap(this).getAmountRequirementName()

    /**
     * A description of the limit. A clear description helps you identify the purpose of the limit.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the limit used in lists to identify the limit.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The unique identifier of the farm that contains the limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-farmid)
     */
    override fun farmId(): String = unwrap(this).getFarmId()

    /**
     * The maximum number of resources constrained by this limit.
     *
     * When all of the resources are in use, steps that require the limit won't be scheduled until
     * the resource is available.
     *
     * The `maxValue` must not be 0. If the value is -1, there is no restriction on the number of
     * resources that can be acquired for this limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-maxcount)
     */
    override fun maxCount(): Number = unwrap(this).getMaxCount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLimitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnLimitProps):
        CfnLimitProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLimitProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLimitProps):
        software.amazon.awscdk.services.deadline.CfnLimitProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.deadline.CfnLimitProps
  }
}
