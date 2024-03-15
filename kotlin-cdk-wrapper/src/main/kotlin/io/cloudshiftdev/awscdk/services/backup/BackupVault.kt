@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A backup vault.
 *
 * Example:
 *
 * ```
 * IBackupVault importedVault = BackupVault.fromBackupVaultName(this, "Vault", "myVaultName");
 * Role role = Role.Builder.create(this, "Access Role").assumedBy(new
 * ServicePrincipal("lambda.amazonaws.com")).build();
 * importedVault.grant(role, "backup:StartBackupJob");
 * ```
 */
public open class BackupVault internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.BackupVault,
) : Resource(cdkObject), IBackupVault {
  /**
   * Adds a statement to the vault access policy.
   *
   * @param statement 
   */
  public open fun addToAccessPolicy(statement: PolicyStatement) {
    unwrap(this).addToAccessPolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Adds a statement to the vault access policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc0762d9426cc157e5ba4c37c43d819271923214298beb4ea3dcd72232fc6f21")
  public open fun addToAccessPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToAccessPolicy(PolicyStatement(statement))

  /**
   * The ARN of the backup vault.
   */
  public override fun backupVaultArn(): String = unwrap(this).getBackupVaultArn()

  /**
   * The name of a logical container where backups are stored.
   */
  public override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

  /**
   * Adds a statement to the vault access policy that prevents anyone from deleting a recovery
   * point.
   */
  public open fun blockRecoveryPointDeletion() {
    unwrap(this).blockRecoveryPointDeletion()
  }

  /**
   * Grant the actions defined in actions to the given grantee on this Backup Vault resource.
   *
   * @param grantee Principal to grant right to. 
   * @param actions The actions to grant. 
   */
  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.BackupVault].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     *
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault. 
     */
    public fun accessPolicy(accessPolicy: PolicyDocument)

    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     *
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("300aa7cbfdf6d896a21f7e35992336f28e09bd473bace3ea72e84b46ced4a2df")
    public fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit)

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created.
     *
     * Default: - A CDK generated name
     *
     * @param backupVaultName The name of a logical container where backups are stored. 
     */
    public fun backupVaultName(backupVaultName: String)

    /**
     * Whether to add statements to the vault access policy that prevents anyone from deleting a
     * recovery point.
     *
     * Default: false
     *
     * @param blockRecoveryPointDeletion Whether to add statements to the vault access policy that
     * prevents anyone from deleting a recovery point. 
     */
    public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean)

    /**
     * The server-side encryption key to use to protect your backups.
     *
     * Default: - an Amazon managed KMS key
     *
     * @param encryptionKey The server-side encryption key to use to protect your backups. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     * @param lockConfiguration Configuration for AWS Backup Vault Lock. 
     */
    public fun lockConfiguration(lockConfiguration: LockConfiguration)

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     * @param lockConfiguration Configuration for AWS Backup Vault Lock. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8503a03f95ef9fb6ebebe12304a5acfc4e2828a77d35540b88b2695e6c6a92")
    public fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit)

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     * @param notificationEvents The vault events to send. 
     */
    public fun notificationEvents(notificationEvents: List<BackupVaultEvents>)

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     * @param notificationEvents The vault events to send. 
     */
    public fun notificationEvents(vararg notificationEvents: BackupVaultEvents)

    /**
     * A SNS topic to send vault events to.
     *
     * Default: - no notifications
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     * @param notificationTopic A SNS topic to send vault events to. 
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * The removal policy to apply to the vault.
     *
     * Note that removing a vault
     * that contains recovery points will fail.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the vault. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupVault.Builder =
        software.amazon.awscdk.services.backup.BackupVault.Builder.create(scope, id)

    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     *
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault. 
     */
    override fun accessPolicy(accessPolicy: PolicyDocument) {
      cdkBuilder.accessPolicy(accessPolicy.let(PolicyDocument::unwrap))
    }

    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     *
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * backup vault. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("300aa7cbfdf6d896a21f7e35992336f28e09bd473bace3ea72e84b46ced4a2df")
    override fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        accessPolicy(PolicyDocument(accessPolicy))

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created.
     *
     * Default: - A CDK generated name
     *
     * @param backupVaultName The name of a logical container where backups are stored. 
     */
    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * Whether to add statements to the vault access policy that prevents anyone from deleting a
     * recovery point.
     *
     * Default: false
     *
     * @param blockRecoveryPointDeletion Whether to add statements to the vault access policy that
     * prevents anyone from deleting a recovery point. 
     */
    override fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
      cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
    }

    /**
     * The server-side encryption key to use to protect your backups.
     *
     * Default: - an Amazon managed KMS key
     *
     * @param encryptionKey The server-side encryption key to use to protect your backups. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     * @param lockConfiguration Configuration for AWS Backup Vault Lock. 
     */
    override fun lockConfiguration(lockConfiguration: LockConfiguration) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(LockConfiguration::unwrap))
    }

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     * @param lockConfiguration Configuration for AWS Backup Vault Lock. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8503a03f95ef9fb6ebebe12304a5acfc4e2828a77d35540b88b2695e6c6a92")
    override fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit): Unit =
        lockConfiguration(LockConfiguration(lockConfiguration))

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     * @param notificationEvents The vault events to send. 
     */
    override fun notificationEvents(notificationEvents: List<BackupVaultEvents>) {
      cdkBuilder.notificationEvents(notificationEvents.map(BackupVaultEvents::unwrap))
    }

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     * @param notificationEvents The vault events to send. 
     */
    override fun notificationEvents(vararg notificationEvents: BackupVaultEvents): Unit =
        notificationEvents(notificationEvents.toList())

    /**
     * A SNS topic to send vault events to.
     *
     * Default: - no notifications
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     * @param notificationTopic A SNS topic to send vault events to. 
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    /**
     * The removal policy to apply to the vault.
     *
     * Note that removing a vault
     * that contains recovery points will fail.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the vault. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupVault = cdkBuilder.build()
  }

  public companion object {
    public fun fromBackupVaultArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVaultArn: String,
    ): IBackupVault =
        software.amazon.awscdk.services.backup.BackupVault.fromBackupVaultArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVaultArn).let(IBackupVault::wrap)

    public fun fromBackupVaultName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVaultName: String,
    ): IBackupVault =
        software.amazon.awscdk.services.backup.BackupVault.fromBackupVaultName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVaultName).let(IBackupVault::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BackupVault {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BackupVault(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupVault): BackupVault =
        BackupVault(cdkObject)

    internal fun unwrap(wrapped: BackupVault): software.amazon.awscdk.services.backup.BackupVault =
        wrapped.cdkObject
  }
}
