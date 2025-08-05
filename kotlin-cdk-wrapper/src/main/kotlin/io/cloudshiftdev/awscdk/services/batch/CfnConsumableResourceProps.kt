@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnConsumableResource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * CfnConsumableResourceProps cfnConsumableResourceProps = CfnConsumableResourceProps.builder()
 * .resourceType("resourceType")
 * .totalQuantity(123)
 * // the properties below are optional
 * .consumableResourceName("consumableResourceName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html)
 */
public interface CfnConsumableResourceProps {
  /**
   * The name of the consumable resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-consumableresourcename)
   */
  public fun consumableResourceName(): String? = unwrap(this).getConsumableResourceName()

  /**
   * Indicates whether the resource is available to be re-used after a job completes. Can be one
   * of:.
   *
   * * `REPLENISHABLE`
   * * `NON_REPLENISHABLE`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-resourcetype)
   */
  public fun resourceType(): String

  /**
   * The tags that you apply to the consumable resource to help you categorize and organize your
   * resources.
   *
   * Each tag consists of a key and an optional value. For more information, see [Tagging your AWS
   * Batch resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The total amount of the consumable resource that is available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-totalquantity)
   */
  public fun totalQuantity(): Number

  /**
   * A builder for [CfnConsumableResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param consumableResourceName The name of the consumable resource.
     */
    public fun consumableResourceName(consumableResourceName: String)

    /**
     * @param resourceType Indicates whether the resource is available to be re-used after a job
     * completes. Can be one of:. 
     * * `REPLENISHABLE`
     * * `NON_REPLENISHABLE`
     */
    public fun resourceType(resourceType: String)

    /**
     * @param tags The tags that you apply to the consumable resource to help you categorize and
     * organize your resources.
     * Each tag consists of a key and an optional value. For more information, see [Tagging your AWS
     * Batch resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) .
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param totalQuantity The total amount of the consumable resource that is available. 
     */
    public fun totalQuantity(totalQuantity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnConsumableResourceProps.Builder
        = software.amazon.awscdk.services.batch.CfnConsumableResourceProps.builder()

    /**
     * @param consumableResourceName The name of the consumable resource.
     */
    override fun consumableResourceName(consumableResourceName: String) {
      cdkBuilder.consumableResourceName(consumableResourceName)
    }

    /**
     * @param resourceType Indicates whether the resource is available to be re-used after a job
     * completes. Can be one of:. 
     * * `REPLENISHABLE`
     * * `NON_REPLENISHABLE`
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param tags The tags that you apply to the consumable resource to help you categorize and
     * organize your resources.
     * Each tag consists of a key and an optional value. For more information, see [Tagging your AWS
     * Batch resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param totalQuantity The total amount of the consumable resource that is available. 
     */
    override fun totalQuantity(totalQuantity: Number) {
      cdkBuilder.totalQuantity(totalQuantity)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnConsumableResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.CfnConsumableResourceProps,
  ) : CdkObject(cdkObject),
      CfnConsumableResourceProps {
    /**
     * The name of the consumable resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-consumableresourcename)
     */
    override fun consumableResourceName(): String? = unwrap(this).getConsumableResourceName()

    /**
     * Indicates whether the resource is available to be re-used after a job completes. Can be one
     * of:.
     *
     * * `REPLENISHABLE`
     * * `NON_REPLENISHABLE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()

    /**
     * The tags that you apply to the consumable resource to help you categorize and organize your
     * resources.
     *
     * Each tag consists of a key and an optional value. For more information, see [Tagging your AWS
     * Batch resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The total amount of the consumable resource that is available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-totalquantity)
     */
    override fun totalQuantity(): Number = unwrap(this).getTotalQuantity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConsumableResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnConsumableResourceProps):
        CfnConsumableResourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConsumableResourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConsumableResourceProps):
        software.amazon.awscdk.services.batch.CfnConsumableResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.CfnConsumableResourceProps
  }
}
