@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps

@CdkDslMarker
public class CfnBackupPlanPropsDsl {
  private val cdkBuilder: CfnBackupPlanProps.Builder = CfnBackupPlanProps.builder()

  /**
   * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
   * resources. 
   */
  public fun backupPlan(backupPlan: IResolvable) {
    cdkBuilder.backupPlan(backupPlan)
  }

  /**
   * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
   * resources. 
   */
  public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
    cdkBuilder.backupPlan(backupPlan)
  }

  /**
   * @param backupPlanTags To help organize your resources, you can assign your own metadata to the
   * resources that you create.
   * Each tag is a key-value pair. The specified tags are assigned to all backups created with this
   * plan.
   */
  public fun backupPlanTags(backupPlanTags: Map<String, String>) {
    cdkBuilder.backupPlanTags(backupPlanTags)
  }

  /**
   * @param backupPlanTags To help organize your resources, you can assign your own metadata to the
   * resources that you create.
   * Each tag is a key-value pair. The specified tags are assigned to all backups created with this
   * plan.
   */
  public fun backupPlanTags(backupPlanTags: IResolvable) {
    cdkBuilder.backupPlanTags(backupPlanTags)
  }

  public fun build(): CfnBackupPlanProps = cdkBuilder.build()
}
