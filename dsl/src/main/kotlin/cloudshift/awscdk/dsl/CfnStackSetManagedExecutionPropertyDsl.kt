@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.IResolvable

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
