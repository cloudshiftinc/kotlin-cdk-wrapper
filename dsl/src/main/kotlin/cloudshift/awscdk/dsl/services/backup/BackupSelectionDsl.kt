@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.IBackupPlan
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
public class BackupSelectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: BackupSelection.Builder = BackupSelection.Builder.create(scope, id)

  private val _resources: MutableList<BackupResource> = mutableListOf()

  public fun allowRestores(allowRestores: Boolean) {
    cdkBuilder.allowRestores(allowRestores)
  }

  public fun backupPlan(backupPlan: IBackupPlan) {
    cdkBuilder.backupPlan(backupPlan)
  }

  public fun backupSelectionName(backupSelectionName: String) {
    cdkBuilder.backupSelectionName(backupSelectionName)
  }

  public fun resources(vararg resources: BackupResource) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<BackupResource>) {
    _resources.addAll(resources)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): BackupSelection {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
