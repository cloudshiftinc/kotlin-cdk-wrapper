@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupPlanRule
import software.amazon.awscdk.services.backup.IBackupVault
import software.constructs.Construct

@CdkDslMarker
public class BackupPlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: BackupPlan.Builder = BackupPlan.Builder.create(scope, id)

  private val _backupPlanRules: MutableList<BackupPlanRule> = mutableListOf()

  public fun backupPlanName(backupPlanName: String) {
    cdkBuilder.backupPlanName(backupPlanName)
  }

  public fun backupPlanRules(backupPlanRules: BackupPlanRuleDsl.() -> Unit) {
    _backupPlanRules.add(BackupPlanRuleDsl().apply(backupPlanRules).build())
  }

  public fun backupPlanRules(backupPlanRules: Collection<BackupPlanRule>) {
    _backupPlanRules.addAll(backupPlanRules)
  }

  public fun backupVault(backupVault: IBackupVault) {
    cdkBuilder.backupVault(backupVault)
  }

  public fun windowsVss(windowsVss: Boolean) {
    cdkBuilder.windowsVss(windowsVss)
  }

  public fun build(): BackupPlan {
    if(_backupPlanRules.isNotEmpty()) cdkBuilder.backupPlanRules(_backupPlanRules)
    return cdkBuilder.build()
  }
}
