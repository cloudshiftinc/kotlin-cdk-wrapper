@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface BackupVaultProps {
  public fun accessPolicy(): PolicyDocument? =
      unwrap(this).getAccessPolicy()?.let(PolicyDocument::wrap)

  public fun backupVaultName(): String? = unwrap(this).getBackupVaultName()

  public fun blockRecoveryPointDeletion(): Boolean? = unwrap(this).getBlockRecoveryPointDeletion()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun lockConfiguration(): LockConfiguration? =
      unwrap(this).getLockConfiguration()?.let(LockConfiguration::wrap)

  public fun notificationEvents(): List<BackupVaultEvents> =
      unwrap(this).getNotificationEvents()?.map(BackupVaultEvents::wrap) ?: emptyList()

  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicy(accessPolicy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f4c26299fbf4ec3af58efcb6e5c4f0a1d2a65b77bbbf65d742d23ce08222872")
    public fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit)

    public fun backupVaultName(backupVaultName: String)

    public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean)

    public fun encryptionKey(encryptionKey: IKey)

    public fun lockConfiguration(lockConfiguration: LockConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63185d52cb1e92bf98d451f351343abf46699111759b921f73b434ede0247248")
    public fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit)

    public fun notificationEvents(notificationEvents: List<BackupVaultEvents>)

    public fun notificationEvents(vararg notificationEvents: BackupVaultEvents)

    public fun notificationTopic(notificationTopic: ITopic)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupVaultProps.Builder =
        software.amazon.awscdk.services.backup.BackupVaultProps.builder()

    override fun accessPolicy(accessPolicy: PolicyDocument) {
      cdkBuilder.accessPolicy(accessPolicy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f4c26299fbf4ec3af58efcb6e5c4f0a1d2a65b77bbbf65d742d23ce08222872")
    override fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        accessPolicy(PolicyDocument(accessPolicy))

    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    override fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
      cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun lockConfiguration(lockConfiguration: LockConfiguration) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(LockConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63185d52cb1e92bf98d451f351343abf46699111759b921f73b434ede0247248")
    override fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit): Unit =
        lockConfiguration(LockConfiguration(lockConfiguration))

    override fun notificationEvents(notificationEvents: List<BackupVaultEvents>) {
      cdkBuilder.notificationEvents(notificationEvents.map(BackupVaultEvents::unwrap))
    }

    override fun notificationEvents(vararg notificationEvents: BackupVaultEvents): Unit =
        notificationEvents(notificationEvents.toList())

    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupVaultProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.BackupVaultProps,
  ) : CdkObject(cdkObject), BackupVaultProps {
    override fun accessPolicy(): PolicyDocument? =
        unwrap(this).getAccessPolicy()?.let(PolicyDocument::wrap)

    override fun backupVaultName(): String? = unwrap(this).getBackupVaultName()

    override fun blockRecoveryPointDeletion(): Boolean? =
        unwrap(this).getBlockRecoveryPointDeletion()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun lockConfiguration(): LockConfiguration? =
        unwrap(this).getLockConfiguration()?.let(LockConfiguration::wrap)

    override fun notificationEvents(): List<BackupVaultEvents> =
        unwrap(this).getNotificationEvents()?.map(BackupVaultEvents::wrap) ?: emptyList()

    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupVaultProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupVaultProps):
        BackupVaultProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupVaultProps):
        software.amazon.awscdk.services.backup.BackupVaultProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.BackupVaultProps
  }
}
