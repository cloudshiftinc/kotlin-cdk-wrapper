@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.backup.CfnBackupPlan

/**
 * Specifies an object containing an array of `Transition` objects that determine how long in days
 * before a recovery point transitions to cold storage or is deleted.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * LifecycleResourceTypeProperty lifecycleResourceTypeProperty =
 * LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html)
 */
@CdkDslMarker
public class CfnBackupPlanLifecycleResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupPlan.LifecycleResourceTypeProperty.Builder =
      CfnBackupPlan.LifecycleResourceTypeProperty.builder()

  /**
   * @param deleteAfterDays Specifies the number of days after creation that a recovery point is
   * deleted.
   * Must be greater than `MoveToColdStorageAfterDays` .
   */
  public fun deleteAfterDays(deleteAfterDays: Number) {
    cdkBuilder.deleteAfterDays(deleteAfterDays)
  }

  /**
   * @param moveToColdStorageAfterDays Specifies the number of days after creation that a recovery
   * point is moved to cold storage.
   */
  public fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number) {
    cdkBuilder.moveToColdStorageAfterDays(moveToColdStorageAfterDays)
  }

  public fun build(): CfnBackupPlan.LifecycleResourceTypeProperty = cdkBuilder.build()
}
