@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.constructs.Construct

@CdkDslMarker
public class CfnBackupSelectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBackupSelection.Builder = CfnBackupSelection.Builder.create(scope, id)

  public fun backupPlanId(backupPlanId: String) {
    cdkBuilder.backupPlanId(backupPlanId)
  }

  public fun backupSelection(backupSelection: IResolvable) {
    cdkBuilder.backupSelection(backupSelection)
  }

  public
      fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty) {
    cdkBuilder.backupSelection(backupSelection)
  }

  public fun build(): CfnBackupSelection = cdkBuilder.build()
}
