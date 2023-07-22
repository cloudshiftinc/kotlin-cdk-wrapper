@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.IBackupVault

@CdkDslMarker
public class BackupPlanCopyActionPropsDsl {
  private val cdkBuilder: BackupPlanCopyActionProps.Builder = BackupPlanCopyActionProps.builder()

  /**
   * @param deleteAfter Specifies the duration after creation that a copied recovery point is
   * deleted from the destination vault.
   * Must be at least 90 days greater than `moveToColdStorageAfter`, if specified.
   */
  public fun deleteAfter(deleteAfter: Duration) {
    cdkBuilder.deleteAfter(deleteAfter)
  }

  /**
   * @param destinationBackupVault Destination Vault for recovery points to be copied into. 
   */
  public fun destinationBackupVault(destinationBackupVault: IBackupVault) {
    cdkBuilder.destinationBackupVault(destinationBackupVault)
  }

  /**
   * @param moveToColdStorageAfter Specifies the duration after creation that a copied recovery
   * point is moved to cold storage.
   */
  public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
    cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter)
  }

  public fun build(): BackupPlanCopyActionProps = cdkBuilder.build()
}
