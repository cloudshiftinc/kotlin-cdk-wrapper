@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.BackupVaultEvents
import software.amazon.awscdk.services.backup.LockConfiguration
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sns.ITopic
import software.constructs.Construct

/**
 * A backup vault.
 *
 * Example:
 * ```
 * IBackupVault importedVault = BackupVault.fromBackupVaultName(this, "Vault", "myVaultName");
 * Role role = Role.Builder.create(this, "Access Role").assumedBy(new
 * ServicePrincipal("lambda.amazonaws.com")).build();
 * importedVault.grant(role, "backup:StartBackupJob");
 * ```
 */
@CdkDslMarker
public class BackupVaultDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BackupVault.Builder = BackupVault.Builder.create(scope, id)

    private val _notificationEvents: MutableList<BackupVaultEvents> = mutableListOf()

    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     *
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     *   backup vault.
     */
    public fun accessPolicy(accessPolicy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(accessPolicy)
        cdkBuilder.accessPolicy(builder.build())
    }

    /**
     * A resource-based policy that is used to manage access permissions on the backup vault.
     *
     * Default: - access is not restricted
     *
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     *   backup vault.
     */
    public fun accessPolicy(accessPolicy: PolicyDocument) {
        cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created.
     *
     * Default: - A CDK generated name
     *
     * @param backupVaultName The name of a logical container where backups are stored.
     */
    public fun backupVaultName(backupVaultName: String) {
        cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * Whether to add statements to the vault access policy that prevents anyone from deleting a
     * recovery point.
     *
     * Default: false
     *
     * @param blockRecoveryPointDeletion Whether to add statements to the vault access policy that
     *   prevents anyone from deleting a recovery point.
     */
    public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
        cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
    }

    /**
     * The server-side encryption key to use to protect your backups.
     *
     * Default: - an Amazon managed KMS key
     *
     * @param encryptionKey The server-side encryption key to use to protect your backups.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     *
     * @param lockConfiguration Configuration for AWS Backup Vault Lock.
     */
    public fun lockConfiguration(lockConfiguration: LockConfigurationDsl.() -> Unit = {}) {
        val builder = LockConfigurationDsl()
        builder.apply(lockConfiguration)
        cdkBuilder.lockConfiguration(builder.build())
    }

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Default: - AWS Backup Vault Lock is disabled
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     *
     * @param lockConfiguration Configuration for AWS Backup Vault Lock.
     */
    public fun lockConfiguration(lockConfiguration: LockConfiguration) {
        cdkBuilder.lockConfiguration(lockConfiguration)
    }

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     *
     * @param notificationEvents The vault events to send.
     */
    public fun notificationEvents(vararg notificationEvents: BackupVaultEvents) {
        _notificationEvents.addAll(listOf(*notificationEvents))
    }

    /**
     * The vault events to send.
     *
     * Default: - all vault events if `notificationTopic` is defined
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     *
     * @param notificationEvents The vault events to send.
     */
    public fun notificationEvents(notificationEvents: Collection<BackupVaultEvents>) {
        _notificationEvents.addAll(notificationEvents)
    }

    /**
     * A SNS topic to send vault events to.
     *
     * Default: - no notifications
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/sns-notifications.html)
     *
     * @param notificationTopic A SNS topic to send vault events to.
     */
    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    /**
     * The removal policy to apply to the vault.
     *
     * Note that removing a vault that contains recovery points will fail.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the vault.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): BackupVault {
        if (_notificationEvents.isNotEmpty()) cdkBuilder.notificationEvents(_notificationEvents)
        return cdkBuilder.build()
    }
}
