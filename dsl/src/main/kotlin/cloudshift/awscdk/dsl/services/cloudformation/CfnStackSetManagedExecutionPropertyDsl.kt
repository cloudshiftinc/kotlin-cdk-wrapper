@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnStackSet

/**
 * Describes whether StackSets performs non-conflicting operations concurrently and queues
 * conflicting operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * ManagedExecutionProperty managedExecutionProperty = ManagedExecutionProperty.builder()
 * .active(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-managedexecution.html)
 */
@CdkDslMarker
public class CfnStackSetManagedExecutionPropertyDsl {
  private val cdkBuilder: CfnStackSet.ManagedExecutionProperty.Builder =
      CfnStackSet.ManagedExecutionProperty.builder()

  /**
   * @param active When `true` , StackSets performs non-conflicting operations concurrently and
   * queues conflicting operations.
   * After conflicting operations finish, StackSets starts queued operations in request order.
   *
   *
   * If there are already running or queued operations, StackSets queues all incoming operations
   * even if they are non-conflicting.
   *
   * You can't modify your stack set's execution configuration while there are running or queued
   * operations for that stack set.
   *
   *
   * When `false` (default), StackSets performs one operation at a time in request order.
   */
  public fun active(active: Boolean) {
    cdkBuilder.active(active)
  }

  /**
   * @param active When `true` , StackSets performs non-conflicting operations concurrently and
   * queues conflicting operations.
   * After conflicting operations finish, StackSets starts queued operations in request order.
   *
   *
   * If there are already running or queued operations, StackSets queues all incoming operations
   * even if they are non-conflicting.
   *
   * You can't modify your stack set's execution configuration while there are running or queued
   * operations for that stack set.
   *
   *
   * When `false` (default), StackSets performs one operation at a time in request order.
   */
  public fun active(active: IResolvable) {
    cdkBuilder.active(active)
  }

  public fun build(): CfnStackSet.ManagedExecutionProperty = cdkBuilder.build()
}
