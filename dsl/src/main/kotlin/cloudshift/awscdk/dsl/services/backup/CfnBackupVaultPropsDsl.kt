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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps

/**
 * Properties for defining a `CfnBackupVault`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object accessPolicy;
 * CfnBackupVaultProps cfnBackupVaultProps = CfnBackupVaultProps.builder()
 * .backupVaultName("backupVaultName")
 * // the properties below are optional
 * .accessPolicy(accessPolicy)
 * .backupVaultTags(Map.of(
 * "backupVaultTagsKey", "backupVaultTags"))
 * .encryptionKeyArn("encryptionKeyArn")
 * .lockConfiguration(LockConfigurationTypeProperty.builder()
 * .minRetentionDays(123)
 * // the properties below are optional
 * .changeableForDays(123)
 * .maxRetentionDays(123)
 * .build())
 * .notifications(NotificationObjectTypeProperty.builder()
 * .backupVaultEvents(List.of("backupVaultEvents"))
 * .snsTopicArn("snsTopicArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html)
 */
@CdkDslMarker
public class CfnBackupVaultPropsDsl {
    private val cdkBuilder: CfnBackupVaultProps.Builder = CfnBackupVaultProps.builder()

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     *   target backup vault.
     */
    public fun accessPolicy(accessPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(accessPolicy)
        cdkBuilder.accessPolicy(builder.map)
    }

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     *   target backup vault.
     */
    public fun accessPolicy(accessPolicy: Any) {
        cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * @param backupVaultName The name of a logical container where backups are stored. Backup
     *   vaults are identified by names that are unique to the account used to create them and the
     *   AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     */
    public fun backupVaultName(backupVaultName: String) {
        cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * @param backupVaultTags Metadata that you can assign to help organize the resources that you
     *   create. Each tag is a key-value pair.
     */
    public fun backupVaultTags(backupVaultTags: Map<String, String>) {
        cdkBuilder.backupVaultTags(backupVaultTags)
    }

    /**
     * @param backupVaultTags Metadata that you can assign to help organize the resources that you
     *   create. Each tag is a key-value pair.
     */
    public fun backupVaultTags(backupVaultTags: IResolvable) {
        cdkBuilder.backupVaultTags(backupVaultTags)
    }

    /**
     * @param encryptionKeyArn A server-side encryption key you can specify to encrypt your backups
     *   from services that support full AWS Backup management;. for example,
     *   `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` . If you
     *   specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
     *   Backup creates a KMS key for you by default.
     *
     * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
     * handles encryption for backups from services that do not yet support full AWS Backup , see
     * [Encryption for backups in AWS Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param lockConfiguration Configuration for
     *   [AWS Backup Vault Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     *   .
     */
    public fun lockConfiguration(lockConfiguration: IResolvable) {
        cdkBuilder.lockConfiguration(lockConfiguration)
    }

    /**
     * @param lockConfiguration Configuration for
     *   [AWS Backup Vault Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     *   .
     */
    public fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty) {
        cdkBuilder.lockConfiguration(lockConfiguration)
    }

    /** @param notifications The SNS event notifications for the specified backup vault. */
    public fun notifications(notifications: IResolvable) {
        cdkBuilder.notifications(notifications)
    }

    /** @param notifications The SNS event notifications for the specified backup vault. */
    public fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty) {
        cdkBuilder.notifications(notifications)
    }

    public fun build(): CfnBackupVaultProps = cdkBuilder.build()
}
