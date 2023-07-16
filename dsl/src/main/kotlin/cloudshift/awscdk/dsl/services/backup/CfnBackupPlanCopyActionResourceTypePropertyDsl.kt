@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan

@CdkDslMarker
public class CfnBackupPlanCopyActionResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupPlan.CopyActionResourceTypeProperty.Builder =
      CfnBackupPlan.CopyActionResourceTypeProperty.builder()

  public fun destinationBackupVaultArn(destinationBackupVaultArn: String) {
    cdkBuilder.destinationBackupVaultArn(destinationBackupVaultArn)
  }

  public fun lifecycle(lifecycle: IResolvable) {
    cdkBuilder.lifecycle(lifecycle)
  }

  public fun lifecycle(lifecycle: CfnBackupPlan.LifecycleResourceTypeProperty) {
    cdkBuilder.lifecycle(lifecycle)
  }

  public fun build(): CfnBackupPlan.CopyActionResourceTypeProperty = cdkBuilder.build()
}
