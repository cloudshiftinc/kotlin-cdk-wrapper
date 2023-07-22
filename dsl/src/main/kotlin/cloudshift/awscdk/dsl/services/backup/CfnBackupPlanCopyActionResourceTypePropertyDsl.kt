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

  /**
   * @param destinationBackupVaultArn An Amazon Resource Name (ARN) that uniquely identifies the
   * destination backup vault for the copied backup. 
   * For example, `arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.`
   */
  public fun destinationBackupVaultArn(destinationBackupVaultArn: String) {
    cdkBuilder.destinationBackupVaultArn(destinationBackupVaultArn)
  }

  /**
   * @param lifecycle Defines when a protected resource is transitioned to cold storage and when it
   * expires.
   * AWS Backup transitions and expires backups automatically according to the lifecycle that you
   * define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the source
   * backup to the destination backup.
   *
   * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
   */
  public fun lifecycle(lifecycle: IResolvable) {
    cdkBuilder.lifecycle(lifecycle)
  }

  /**
   * @param lifecycle Defines when a protected resource is transitioned to cold storage and when it
   * expires.
   * AWS Backup transitions and expires backups automatically according to the lifecycle that you
   * define. If you do not specify a lifecycle, AWS Backup applies the lifecycle policy of the source
   * backup to the destination backup.
   *
   * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
   */
  public fun lifecycle(lifecycle: CfnBackupPlan.LifecycleResourceTypeProperty) {
    cdkBuilder.lifecycle(lifecycle)
  }

  public fun build(): CfnBackupPlan.CopyActionResourceTypeProperty = cdkBuilder.build()
}
