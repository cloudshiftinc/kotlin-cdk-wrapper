@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.BackupPlanProps
import software.amazon.awscdk.services.backup.BackupPlanRule
import software.amazon.awscdk.services.backup.IBackupVault

/**
 * Properties for a BackupPlan.
 *
 * Example:
 *
 * ```
 * BackupPlan plan = BackupPlan.Builder.create(this, "Plan")
 * .windowsVss(true)
 * .build();
 * ```
 */
@CdkDslMarker
public class BackupPlanPropsDsl {
  private val cdkBuilder: BackupPlanProps.Builder = BackupPlanProps.builder()

  private val _backupPlanRules: MutableList<BackupPlanRule> = mutableListOf()

  /**
   * @param backupPlanName The display name of the backup plan.
   */
  public fun backupPlanName(backupPlanName: String) {
    cdkBuilder.backupPlanName(backupPlanName)
  }

  /**
   * @param backupPlanRules Rules for the backup plan.
   * Use `addRule()` to add rules after
   * instantiation.
   */
  public fun backupPlanRules(backupPlanRules: BackupPlanRuleDsl.() -> Unit) {
    _backupPlanRules.add(BackupPlanRuleDsl().apply(backupPlanRules).build())
  }

  /**
   * @param backupPlanRules Rules for the backup plan.
   * Use `addRule()` to add rules after
   * instantiation.
   */
  public fun backupPlanRules(backupPlanRules: Collection<BackupPlanRule>) {
    _backupPlanRules.addAll(backupPlanRules)
  }

  /**
   * @param backupVault The backup vault where backups are stored.
   */
  public fun backupVault(backupVault: IBackupVault) {
    cdkBuilder.backupVault(backupVault)
  }

  /**
   * @param windowsVss Enable Windows VSS backup.
   */
  public fun windowsVss(windowsVss: Boolean) {
    cdkBuilder.windowsVss(windowsVss)
  }

  public fun build(): BackupPlanProps {
    if(_backupPlanRules.isNotEmpty()) cdkBuilder.backupPlanRules(_backupPlanRules)
    return cdkBuilder.build()
  }
}
