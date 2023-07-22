@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan

@CdkDslMarker
public class CfnBackupPlanBackupPlanResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder =
      CfnBackupPlan.BackupPlanResourceTypeProperty.builder()

  private val _advancedBackupSettings: MutableList<Any> = mutableListOf()

  private val _backupPlanRule: MutableList<Any> = mutableListOf()

  /**
   * @param advancedBackupSettings A list of backup options for each resource type.
   */
  public fun advancedBackupSettings(vararg advancedBackupSettings: Any) {
    _advancedBackupSettings.addAll(listOf(*advancedBackupSettings))
  }

  /**
   * @param advancedBackupSettings A list of backup options for each resource type.
   */
  public fun advancedBackupSettings(advancedBackupSettings: Collection<Any>) {
    _advancedBackupSettings.addAll(advancedBackupSettings)
  }

  /**
   * @param advancedBackupSettings A list of backup options for each resource type.
   */
  public fun advancedBackupSettings(advancedBackupSettings: IResolvable) {
    cdkBuilder.advancedBackupSettings(advancedBackupSettings)
  }

  /**
   * @param backupPlanName The display name of a backup plan. 
   */
  public fun backupPlanName(backupPlanName: String) {
    cdkBuilder.backupPlanName(backupPlanName)
  }

  /**
   * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
   * task that is used to back up a selection of resources. 
   */
  public fun backupPlanRule(vararg backupPlanRule: Any) {
    _backupPlanRule.addAll(listOf(*backupPlanRule))
  }

  /**
   * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
   * task that is used to back up a selection of resources. 
   */
  public fun backupPlanRule(backupPlanRule: Collection<Any>) {
    _backupPlanRule.addAll(backupPlanRule)
  }

  /**
   * @param backupPlanRule An array of `BackupRule` objects, each of which specifies a scheduled
   * task that is used to back up a selection of resources. 
   */
  public fun backupPlanRule(backupPlanRule: IResolvable) {
    cdkBuilder.backupPlanRule(backupPlanRule)
  }

  public fun build(): CfnBackupPlan.BackupPlanResourceTypeProperty {
    if(_advancedBackupSettings.isNotEmpty())
        cdkBuilder.advancedBackupSettings(_advancedBackupSettings)
    if(_backupPlanRule.isNotEmpty()) cdkBuilder.backupPlanRule(_backupPlanRule)
    return cdkBuilder.build()
  }
}
