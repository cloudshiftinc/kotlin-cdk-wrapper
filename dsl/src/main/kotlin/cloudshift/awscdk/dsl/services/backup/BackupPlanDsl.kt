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

  /**
   * The display name of the backup plan.
   *
   * Default: - A CDK generated name
   *
   * @param backupPlanName The display name of the backup plan. 
   */
  public fun backupPlanName(backupPlanName: String) {
    cdkBuilder.backupPlanName(backupPlanName)
  }

  /**
   * Rules for the backup plan.
   *
   * Use `addRule()` to add rules after
   * instantiation.
   *
   * Default: - use `addRule()` to add rules
   *
   * @param backupPlanRules Rules for the backup plan. 
   */
  public fun backupPlanRules(backupPlanRules: BackupPlanRuleDsl.() -> Unit) {
    _backupPlanRules.add(BackupPlanRuleDsl().apply(backupPlanRules).build())
  }

  /**
   * Rules for the backup plan.
   *
   * Use `addRule()` to add rules after
   * instantiation.
   *
   * Default: - use `addRule()` to add rules
   *
   * @param backupPlanRules Rules for the backup plan. 
   */
  public fun backupPlanRules(backupPlanRules: Collection<BackupPlanRule>) {
    _backupPlanRules.addAll(backupPlanRules)
  }

  /**
   * The backup vault where backups are stored.
   *
   * Default: - use the vault defined at the rule level. If not defined a new
   * common vault for the plan will be created
   *
   * @param backupVault The backup vault where backups are stored. 
   */
  public fun backupVault(backupVault: IBackupVault) {
    cdkBuilder.backupVault(backupVault)
  }

  /**
   * Enable Windows VSS backup.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
   * @param windowsVss Enable Windows VSS backup. 
   */
  public fun windowsVss(windowsVss: Boolean) {
    cdkBuilder.windowsVss(windowsVss)
  }

  public fun build(): BackupPlan {
    if(_backupPlanRules.isNotEmpty()) cdkBuilder.backupPlanRules(_backupPlanRules)
    return cdkBuilder.build()
  }
}
