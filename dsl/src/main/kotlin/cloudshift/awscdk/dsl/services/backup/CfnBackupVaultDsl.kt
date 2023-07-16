@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.constructs.Construct

@CdkDslMarker
public class CfnBackupVaultDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBackupVault.Builder = CfnBackupVault.Builder.create(scope, id)

  public fun accessPolicy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.accessPolicy(builder.map)
  }

  public fun accessPolicy(accessPolicy: Any) {
    cdkBuilder.accessPolicy(accessPolicy)
  }

  public fun backupVaultName(backupVaultName: String) {
    cdkBuilder.backupVaultName(backupVaultName)
  }

  public fun backupVaultTags(backupVaultTags: Map<String, String>) {
    cdkBuilder.backupVaultTags(backupVaultTags)
  }

  public fun backupVaultTags(backupVaultTags: IResolvable) {
    cdkBuilder.backupVaultTags(backupVaultTags)
  }

  public fun encryptionKeyArn(encryptionKeyArn: String) {
    cdkBuilder.encryptionKeyArn(encryptionKeyArn)
  }

  public fun lockConfiguration(lockConfiguration: IResolvable) {
    cdkBuilder.lockConfiguration(lockConfiguration)
  }

  public fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty) {
    cdkBuilder.lockConfiguration(lockConfiguration)
  }

  public fun notifications(notifications: IResolvable) {
    cdkBuilder.notifications(notifications)
  }

  public fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty) {
    cdkBuilder.notifications(notifications)
  }

  public fun build(): CfnBackupVault = cdkBuilder.build()
}
