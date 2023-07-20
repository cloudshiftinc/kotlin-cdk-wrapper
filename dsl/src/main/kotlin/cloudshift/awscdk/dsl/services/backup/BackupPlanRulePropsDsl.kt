@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.BackupPlanRuleProps
import software.amazon.awscdk.services.backup.IBackupVault
import software.amazon.awscdk.services.events.Schedule

@CdkDslMarker
public class BackupPlanRulePropsDsl {
  private val cdkBuilder: BackupPlanRuleProps.Builder = BackupPlanRuleProps.builder()

  private val _copyActions: MutableList<BackupPlanCopyActionProps> = mutableListOf()

  public fun backupVault(backupVault: IBackupVault) {
    cdkBuilder.backupVault(backupVault)
  }

  public fun completionWindow(completionWindow: Duration) {
    cdkBuilder.completionWindow(completionWindow)
  }

  public fun copyActions(copyActions: BackupPlanCopyActionPropsDsl.() -> Unit) {
    _copyActions.add(BackupPlanCopyActionPropsDsl().apply(copyActions).build())
  }

  public fun copyActions(copyActions: Collection<BackupPlanCopyActionProps>) {
    _copyActions.addAll(copyActions)
  }

  public fun deleteAfter(deleteAfter: Duration) {
    cdkBuilder.deleteAfter(deleteAfter)
  }

  public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
    cdkBuilder.enableContinuousBackup(enableContinuousBackup)
  }

  public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
    cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter)
  }

  public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
    cdkBuilder.recoveryPointTags(recoveryPointTags)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun scheduleExpression(scheduleExpression: Schedule) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun startWindow(startWindow: Duration) {
    cdkBuilder.startWindow(startWindow)
  }

  public fun build(): BackupPlanRuleProps {
    if(_copyActions.isNotEmpty()) cdkBuilder.copyActions(_copyActions)
    return cdkBuilder.build()
  }
}
