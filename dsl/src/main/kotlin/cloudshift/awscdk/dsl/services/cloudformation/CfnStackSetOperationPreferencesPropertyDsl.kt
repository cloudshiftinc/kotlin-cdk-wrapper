@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@CdkDslMarker
public class CfnStackSetOperationPreferencesPropertyDsl {
  private val cdkBuilder: CfnStackSet.OperationPreferencesProperty.Builder =
      CfnStackSet.OperationPreferencesProperty.builder()

  private val _regionOrder: MutableList<String> = mutableListOf()

  /**
   * @param failureToleranceCount The number of accounts, per Region, for which this operation can
   * fail before AWS CloudFormation stops the operation in that Region.
   * If the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
   * any subsequent Regions.
   *
   * Conditional: You must specify either `FailureToleranceCount` or `FailureTolerancePercentage`
   * (but not both).
   */
  public fun failureToleranceCount(failureToleranceCount: Number) {
    cdkBuilder.failureToleranceCount(failureToleranceCount)
  }

  /**
   * @param failureTolerancePercentage The percentage of accounts, per Region, for which this stack
   * operation can fail before AWS CloudFormation stops the operation in that Region.
   * If the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
   * any subsequent Regions.
   *
   * When calculating the number of accounts based on the specified percentage, AWS CloudFormation
   * rounds *down* to the next whole number.
   *
   * Conditional: You must specify either `FailureToleranceCount` or `FailureTolerancePercentage` ,
   * but not both.
   */
  public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
    cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
  }

  /**
   * @param maxConcurrentCount The maximum number of accounts in which to perform this operation at
   * one time.
   * This is dependent on the value of `FailureToleranceCount` . `MaxConcurrentCount` is at most one
   * more than the `FailureToleranceCount` .
   *
   * Note that this setting lets you specify the *maximum* for operations. For large deployments,
   * under certain circumstances the actual number of accounts acted upon concurrently may be lower due
   * to service throttling.
   *
   * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` , but
   * not both.
   */
  public fun maxConcurrentCount(maxConcurrentCount: Number) {
    cdkBuilder.maxConcurrentCount(maxConcurrentCount)
  }

  /**
   * @param maxConcurrentPercentage The maximum percentage of accounts in which to perform this
   * operation at one time.
   * When calculating the number of accounts based on the specified percentage, AWS CloudFormation
   * rounds down to the next whole number. This is true except in cases where rounding down would
   * result is zero. In this case, CloudFormation sets the number as one instead.
   *
   * Note that this setting lets you specify the *maximum* for operations. For large deployments,
   * under certain circumstances the actual number of accounts acted upon concurrently may be lower due
   * to service throttling.
   *
   * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` , but
   * not both.
   */
  public fun maxConcurrentPercentage(maxConcurrentPercentage: Number) {
    cdkBuilder.maxConcurrentPercentage(maxConcurrentPercentage)
  }

  /**
   * @param regionConcurrencyType The concurrency type of deploying StackSets operations in Regions,
   * could be in parallel or one Region at a time.
   */
  public fun regionConcurrencyType(regionConcurrencyType: String) {
    cdkBuilder.regionConcurrencyType(regionConcurrencyType)
  }

  /**
   * @param regionOrder The order of the Regions where you want to perform the stack operation.
   */
  public fun regionOrder(vararg regionOrder: String) {
    _regionOrder.addAll(listOf(*regionOrder))
  }

  /**
   * @param regionOrder The order of the Regions where you want to perform the stack operation.
   */
  public fun regionOrder(regionOrder: Collection<String>) {
    _regionOrder.addAll(regionOrder)
  }

  public fun build(): CfnStackSet.OperationPreferencesProperty {
    if(_regionOrder.isNotEmpty()) cdkBuilder.regionOrder(_regionOrder)
    return cdkBuilder.build()
  }
}
