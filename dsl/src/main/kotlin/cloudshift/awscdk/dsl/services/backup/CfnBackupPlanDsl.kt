@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.constructs.Construct

@CdkDslMarker
public class CfnBackupPlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBackupPlan.Builder = CfnBackupPlan.Builder.create(scope, id)

  public fun backupPlan(backupPlan: IResolvable) {
    cdkBuilder.backupPlan(backupPlan)
  }

  public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
    cdkBuilder.backupPlan(backupPlan)
  }

  public fun backupPlanTags(backupPlanTags: Map<String, String>) {
    cdkBuilder.backupPlanTags(backupPlanTags)
  }

  public fun backupPlanTags(backupPlanTags: IResolvable) {
    cdkBuilder.backupPlanTags(backupPlanTags)
  }

  public fun build(): CfnBackupPlan = cdkBuilder.build()
}
