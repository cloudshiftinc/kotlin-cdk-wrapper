@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.backup.BackupVaultEvents
import software.amazon.awscdk.services.backup.BackupVaultProps
import software.amazon.awscdk.services.backup.LockConfiguration
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class BackupVaultPropsDsl {
  private val cdkBuilder: BackupVaultProps.Builder = BackupVaultProps.builder()

  private val _notificationEvents: MutableList<BackupVaultEvents> = mutableListOf()

  public fun accessPolicy(block: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(block)
    cdkBuilder.accessPolicy(builder.build())
  }

  public fun accessPolicy(accessPolicy: PolicyDocument) {
    cdkBuilder.accessPolicy(accessPolicy)
  }

  public fun backupVaultName(backupVaultName: String) {
    cdkBuilder.backupVaultName(backupVaultName)
  }

  public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
    cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
  }

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun lockConfiguration(block: LockConfigurationDsl.() -> Unit = {}) {
    val builder = LockConfigurationDsl()
    builder.apply(block)
    cdkBuilder.lockConfiguration(builder.build())
  }

  public fun lockConfiguration(lockConfiguration: LockConfiguration) {
    cdkBuilder.lockConfiguration(lockConfiguration)
  }

  public fun notificationEvents(vararg notificationEvents: BackupVaultEvents) {
    _notificationEvents.addAll(listOf(*notificationEvents))
  }

  public fun notificationEvents(notificationEvents: Collection<BackupVaultEvents>) {
    _notificationEvents.addAll(notificationEvents)
  }

  public fun notificationTopic(notificationTopic: ITopic) {
    cdkBuilder.notificationTopic(notificationTopic)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): BackupVaultProps {
    if(_notificationEvents.isNotEmpty()) cdkBuilder.notificationEvents(_notificationEvents)
    return cdkBuilder.build()
  }
}
