@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.IBackupVault

@CdkDslMarker
public class BackupPlanCopyActionPropsDsl {
  private val cdkBuilder: BackupPlanCopyActionProps.Builder = BackupPlanCopyActionProps.builder()

  public fun deleteAfter(deleteAfter: Duration) {
    cdkBuilder.deleteAfter(deleteAfter)
  }

  public fun destinationBackupVault(destinationBackupVault: IBackupVault) {
    cdkBuilder.destinationBackupVault(destinationBackupVault)
  }

  public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
    cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter)
  }

  public fun build(): BackupPlanCopyActionProps = cdkBuilder.build()
}
