@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions

@CdkDslMarker
public class CommonCloudFormationStackSetOptionsDsl {
  private val cdkBuilder: CommonCloudFormationStackSetOptions.Builder =
      CommonCloudFormationStackSetOptions.builder()

  /**
   * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
   * operation can fail before AWS CloudFormation stops the operation in that Region.
   * If
   * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
   * subsequent Regions. When calculating the number
   * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole
   * number.
   */
  public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
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
  public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
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
  public fun stackSetRegion(stackSetRegion: String) {
    cdkBuilder.stackSetRegion(stackSetRegion)
  }

  public fun build(): CommonCloudFormationStackSetOptions = cdkBuilder.build()
}
