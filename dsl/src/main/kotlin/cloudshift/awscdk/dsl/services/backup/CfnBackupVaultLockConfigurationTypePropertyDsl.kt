@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.backup.CfnBackupVault

@CdkDslMarker
public class CfnBackupVaultLockConfigurationTypePropertyDsl {
  private val cdkBuilder: CfnBackupVault.LockConfigurationTypeProperty.Builder =
      CfnBackupVault.LockConfigurationTypeProperty.builder()

  public fun changeableForDays(changeableForDays: Number) {
    cdkBuilder.changeableForDays(changeableForDays)
  }

  public fun maxRetentionDays(maxRetentionDays: Number) {
    cdkBuilder.maxRetentionDays(maxRetentionDays)
  }

  public fun minRetentionDays(minRetentionDays: Number) {
    cdkBuilder.minRetentionDays(minRetentionDays)
  }

  public fun build(): CfnBackupVault.LockConfigurationTypeProperty = cdkBuilder.build()
}
