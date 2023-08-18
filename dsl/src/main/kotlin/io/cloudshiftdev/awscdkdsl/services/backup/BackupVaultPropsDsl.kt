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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyDocumentDsl
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

/**
 * Properties for a BackupVault.
 *
 * Example:
 * ```
 * IKey myKey = Key.fromKeyArn(this, "MyKey", "aaa");
 * ITopic myTopic = Topic.fromTopicArn(this, "MyTopic", "bbb");
 * BackupVault vault = BackupVault.Builder.create(this, "Vault")
 * .encryptionKey(myKey) // Custom encryption key
 * .notificationTopic(myTopic)
 * .build();
 * ```
 */
@CdkDslMarker
public class BackupVaultPropsDsl {
    private val cdkBuilder: BackupVaultProps.Builder = BackupVaultProps.builder()

    private val _notificationEvents: MutableList<BackupVaultEvents> = mutableListOf()

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     *   backup vault.
     */
    public fun accessPolicy(accessPolicy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(accessPolicy)
        cdkBuilder.accessPolicy(builder.build())
    }

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     *   backup vault.
     */
    public fun accessPolicy(accessPolicy: PolicyDocument) {
        cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * @param backupVaultName The name of a logical container where backups are stored. Backup
     *   vaults are identified by names that are unique to the account used to create them and the
     *   AWS Region where they are created.
     */
    public fun backupVaultName(backupVaultName: String) {
        cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * @param blockRecoveryPointDeletion Whether to add statements to the vault access policy that
     *   prevents anyone from deleting a recovery point.
     */
    public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
        cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
    }

    /** @param encryptionKey The server-side encryption key to use to protect your backups. */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param lockConfiguration Configuration for AWS Backup Vault Lock. */
    public fun lockConfiguration(lockConfiguration: LockConfigurationDsl.() -> Unit = {}) {
        val builder = LockConfigurationDsl()
        builder.apply(lockConfiguration)
        cdkBuilder.lockConfiguration(builder.build())
    }

    /** @param lockConfiguration Configuration for AWS Backup Vault Lock. */
    public fun lockConfiguration(lockConfiguration: LockConfiguration) {
        cdkBuilder.lockConfiguration(lockConfiguration)
    }

    /** @param notificationEvents The vault events to send. */
    public fun notificationEvents(vararg notificationEvents: BackupVaultEvents) {
        _notificationEvents.addAll(listOf(*notificationEvents))
    }

    /** @param notificationEvents The vault events to send. */
    public fun notificationEvents(notificationEvents: Collection<BackupVaultEvents>) {
        _notificationEvents.addAll(notificationEvents)
    }

    /** @param notificationTopic A SNS topic to send vault events to. */
    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    /**
     * @param removalPolicy The removal policy to apply to the vault. Note that removing a vault
     *   that contains recovery points will fail.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): BackupVaultProps {
        if (_notificationEvents.isNotEmpty()) cdkBuilder.notificationEvents(_notificationEvents)
        return cdkBuilder.build()
    }
}
