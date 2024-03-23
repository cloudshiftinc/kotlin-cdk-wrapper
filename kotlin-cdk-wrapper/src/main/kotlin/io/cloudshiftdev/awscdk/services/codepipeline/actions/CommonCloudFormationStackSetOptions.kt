@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Options in common between both StackSet actions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * CommonCloudFormationStackSetOptions commonCloudFormationStackSetOptions =
 * CommonCloudFormationStackSetOptions.builder()
 * .failureTolerancePercentage(123)
 * .maxAccountConcurrencyPercentage(123)
 * .stackSetRegion("stackSetRegion")
 * .build();
 * ```
 */
public interface CommonCloudFormationStackSetOptions {
  /**
   * The percentage of accounts per Region for which this stack operation can fail before AWS
   * CloudFormation stops the operation in that Region.
   *
   * If
   * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
   * subsequent Regions. When calculating the number
   * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole
   * number.
   *
   * Default: 0%
   */
  public fun failureTolerancePercentage(): Number? = unwrap(this).getFailureTolerancePercentage()

  /**
   * The maximum percentage of accounts in which to perform this operation at one time.
   *
   * When calculating the number of accounts based on the specified
   * percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
   * result in zero, AWS CloudFormation sets the number as
   * one instead. Although you use this setting to specify the maximum, for large deployments the
   * actual number of accounts acted upon concurrently
   * may be lower due to service throttling.
   *
   * Default: 1%
   */
  public fun maxAccountConcurrencyPercentage(): Number? =
      unwrap(this).getMaxAccountConcurrencyPercentage()

  /**
   * The AWS Region the StackSet is in.
   *
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   *
   * Default: - same region as the Pipeline
   */
  public fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()

  /**
   * A builder for [CommonCloudFormationStackSetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     * operation can fail before AWS CloudFormation stops the operation in that Region.
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     */
    public fun failureTolerancePercentage(failureTolerancePercentage: Number)

    /**
     * @param maxAccountConcurrencyPercentage The maximum percentage of accounts in which to perform
     * this operation at one time.
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
     * result in zero, AWS CloudFormation sets the number as
     * one instead. Although you use this setting to specify the maximum, for large deployments the
     * actual number of accounts acted upon concurrently
     * may be lower due to service throttling.
     */
    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number)

    /**
     * @param stackSetRegion The AWS Region the StackSet is in.
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    public fun stackSetRegion(stackSetRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions.builder()

    /**
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     * operation can fail before AWS CloudFormation stops the operation in that Region.
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     */
    override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
      cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    /**
     * @param maxAccountConcurrencyPercentage The maximum percentage of accounts in which to perform
     * this operation at one time.
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
     * result in zero, AWS CloudFormation sets the number as
     * one instead. Although you use this setting to specify the maximum, for large deployments the
     * actual number of accounts acted upon concurrently
     * may be lower due to service throttling.
     */
    override fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
      cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    /**
     * @param stackSetRegion The AWS Region the StackSet is in.
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    override fun stackSetRegion(stackSetRegion: String) {
      cdkBuilder.stackSetRegion(stackSetRegion)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions,
  ) : CdkObject(cdkObject), CommonCloudFormationStackSetOptions {
    /**
     * The percentage of accounts per Region for which this stack operation can fail before AWS
     * CloudFormation stops the operation in that Region.
     *
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     *
     * Default: 0%
     */
    override fun failureTolerancePercentage(): Number? =
        unwrap(this).getFailureTolerancePercentage()

    /**
     * The maximum percentage of accounts in which to perform this operation at one time.
     *
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
     * result in zero, AWS CloudFormation sets the number as
     * one instead. Although you use this setting to specify the maximum, for large deployments the
     * actual number of accounts acted upon concurrently
     * may be lower due to service throttling.
     *
     * Default: 1%
     */
    override fun maxAccountConcurrencyPercentage(): Number? =
        unwrap(this).getMaxAccountConcurrencyPercentage()

    /**
     * The AWS Region the StackSet is in.
     *
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     *
     * Default: - same region as the Pipeline
     */
    override fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CommonCloudFormationStackSetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions):
        CommonCloudFormationStackSetOptions = CdkObjectWrappers.wrap(cdkObject) as?
        CommonCloudFormationStackSetOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonCloudFormationStackSetOptions):
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions
  }
}
