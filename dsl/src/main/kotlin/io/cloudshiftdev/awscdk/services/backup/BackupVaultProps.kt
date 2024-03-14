package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface BackupVaultProps {
  /**
   * A resource-based policy that is used to manage access permissions on the backup vault.
   *
   * Default: - access is not restricted
   */
  public fun accessPolicy(): PolicyDocument? =
      unwrap(this).getAccessPolicy()?.let(PolicyDocument::wrap)

  /**
   * The name of a logical container where backups are stored.
   *
   * Backup vaults
   * are identified by names that are unique to the account used to create
   * them and the AWS Region where they are created.
   *
   * Default: - A CDK generated name
   */
  public fun backupVaultName(): String? = unwrap(this).getBackupVaultName()

  /**
   * Whether to add statements to the vault access policy that prevents anyone from deleting a
   * recovery point.
   *
   * Default: false
   */
  public fun blockRecoveryPointDeletion(): Boolean? = unwrap(this).getBlockRecoveryPointDeletion()

  /**
   * The server-side encryption key to use to protect your backups.
   *
   * Default: - an Amazon managed KMS key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Configuration for AWS Backup Vault Lock.
   *
   * Default: - AWS Backup Vault Lock is disabled
   *
   * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
   */
  public fun lockConfiguration(): LockConfiguration? =
      unwrap(this).getLockConfiguration()?.let(LockConfiguration::wrap)

  /**
   * The vault events to send.
   *
   * Default: - all vault events if `notificationTopic` is defined
   *
   * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
   */
  public fun notificationEvents(): List<BackupVaultEvents> =
      unwrap(this).getNotificationEvents()?.map(BackupVaultEvents::wrap) ?: emptyList()

  /**
   * A SNS topic to send vault events to.
   *
   * Default: - no notifications
   *
   * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
   */
  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  /**
   * The removal policy to apply to the vault.
   *
   * Note that removing a vault
   * that contains recovery points will fail.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [BackupVaultProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault.
     */
    public fun accessPolicy(accessPolicy: PolicyDocument)

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f4c26299fbf4ec3af58efcb6e5c4f0a1d2a65b77bbbf65d742d23ce08222872")
    public fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit)

    /**
     * @param backupVaultName The name of a logical container where backups are stored.
     * Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created.
     */
    public fun backupVaultName(backupVaultName: String)

    /**
     * @param blockRecoveryPointDeletion Whether to add statements to the vault access policy that
     * prevents anyone from deleting a recovery point.
     */
    public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean)

    /**
     * @param encryptionKey The server-side encryption key to use to protect your backups.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param lockConfiguration Configuration for AWS Backup Vault Lock.
     */
    public fun lockConfiguration(lockConfiguration: LockConfiguration)

    /**
     * @param lockConfiguration Configuration for AWS Backup Vault Lock.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63185d52cb1e92bf98d451f351343abf46699111759b921f73b434ede0247248")
    public fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit)

    /**
     * @param notificationEvents The vault events to send.
     */
    public fun notificationEvents(notificationEvents: List<BackupVaultEvents>)

    /**
     * @param notificationEvents The vault events to send.
     */
    public fun notificationEvents(vararg notificationEvents: BackupVaultEvents)

    /**
     * @param notificationTopic A SNS topic to send vault events to.
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * @param removalPolicy The removal policy to apply to the vault.
     * Note that removing a vault
     * that contains recovery points will fail.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupVaultProps.Builder =
        software.amazon.awscdk.services.backup.BackupVaultProps.builder()

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault.
     */
    override fun accessPolicy(accessPolicy: PolicyDocument) {
      cdkBuilder.accessPolicy(accessPolicy.let(PolicyDocument::unwrap))
    }

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f4c26299fbf4ec3af58efcb6e5c4f0a1d2a65b77bbbf65d742d23ce08222872")
    override fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        accessPolicy(PolicyDocument(accessPolicy))

    /**
     * @param backupVaultName The name of a logical container where backups are stored.
     * Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created.
     */
    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * @param blockRecoveryPointDeletion Whether to add statements to the vault access policy that
     * prevents anyone from deleting a recovery point.
     */
    override fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
      cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
    }

    /**
     * @param encryptionKey The server-side encryption key to use to protect your backups.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param lockConfiguration Configuration for AWS Backup Vault Lock.
     */
    override fun lockConfiguration(lockConfiguration: LockConfiguration) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(LockConfiguration::unwrap))
    }

    /**
     * @param lockConfiguration Configuration for AWS Backup Vault Lock.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63185d52cb1e92bf98d451f351343abf46699111759b921f73b434ede0247248")
    override fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit): Unit =
        lockConfiguration(LockConfiguration(lockConfiguration))

    /**
     * @param notificationEvents The vault events to send.
     */
    override fun notificationEvents(notificationEvents: List<BackupVaultEvents>) {
      cdkBuilder.notificationEvents(notificationEvents.map(BackupVaultEvents::unwrap))
    }

    /**
     * @param notificationEvents The vault events to send.
     */
    override fun notificationEvents(vararg notificationEvents: BackupVaultEvents): Unit =
        notificationEvents(notificationEvents.toList())

    /**
     * @param notificationTopic A SNS topic to send vault events to.
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    /**
     * @param removalPolicy The removal policy to apply to the vault.
     * Note that removing a vault
     * that contains recovery points will fail.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupVaultProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.BackupVaultProps,
  ) : CdkObject(cdkObject), BackupVaultProps {
    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     */
    override fun accessPolicy(): PolicyDocument? =
        unwrap(this).getAccessPolicy()?.let(PolicyDocument::wrap)

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created.
     *
     * Default: - A CDK generated name
     */
    override fun backupVaultName(): String? = unwrap(this).getBackupVaultName()

    /**
     * Whether to add statements to the vault access policy that prevents anyone from deleting a
     * recovery point.
     *
     * Default: false
     */
    override fun blockRecoveryPointDeletion(): Boolean? =
        unwrap(this).getBlockRecoveryPointDeletion()

    /**
     * The server-side encryption key to use to protect your backups.
     *
     * Default: - an Amazon managed KMS key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     */
    override fun lockConfiguration(): LockConfiguration? =
        unwrap(this).getLockConfiguration()?.let(LockConfiguration::wrap)

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     */
    override fun notificationEvents(): List<BackupVaultEvents> =
        unwrap(this).getNotificationEvents()?.map(BackupVaultEvents::wrap) ?: emptyList()

    /**
     * A SNS topic to send vault events to.
     *
     * Default: - no notifications
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     */
    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    /**
     * The removal policy to apply to the vault.
     *
     * Note that removing a vault
     * that contains recovery points will fail.
     *
     * Default: RemovalPolicy.RETAIN
     */
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
