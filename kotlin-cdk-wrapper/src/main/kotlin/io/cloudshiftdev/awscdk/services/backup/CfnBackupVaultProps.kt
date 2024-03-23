@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBackupVault`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
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
public interface CfnBackupVaultProps {
  /**
   * A resource-based policy that is used to manage access permissions on the target backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy)
   */
  public fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

  /**
   * The name of a logical container where backups are stored.
   *
   * Backup vaults are identified by names that are unique to the account used to create them and
   * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname)
   */
  public fun backupVaultName(): String

  /**
   * Metadata that you can assign to help organize the resources that you create.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags)
   */
  public fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
      emptyMap()

  /**
   * A server-side encryption key you can specify to encrypt your backups from services that support
   * full AWS Backup management;
   *
   * for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` . If
   * you specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
   * Backup creates a KMS key for you by default.
   *
   * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
   * handles encryption for backups from services that do not yet support full AWS Backup , see
   * [Encryption for backups in AWS
   * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn)
   */
  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
   */
  public fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

  /**
   * The SNS event notifications for the specified backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
   */
  public fun notifications(): Any? = unwrap(this).getNotifications()

  /**
   * A builder for [CfnBackupVaultProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * target backup vault.
     */
    public fun accessPolicy(accessPolicy: Any)

    /**
     * @param backupVaultName The name of a logical container where backups are stored. 
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     */
    public fun backupVaultName(backupVaultName: String)

    /**
     * @param backupVaultTags Metadata that you can assign to help organize the resources that you
     * create.
     * Each tag is a key-value pair.
     */
    public fun backupVaultTags(backupVaultTags: Map<String, String>)

    /**
     * @param encryptionKeyArn A server-side encryption key you can specify to encrypt your backups
     * from services that support full AWS Backup management;.
     * for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * If you specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
     * Backup creates a KMS key for you by default.
     *
     * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
     * handles encryption for backups from services that do not yet support full AWS Backup , see
     * [Encryption for backups in AWS
     * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     */
    public fun lockConfiguration(lockConfiguration: IResolvable)

    /**
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     */
    public fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty)

    /**
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b12854a83d82c7db8221c5c5eb0aabd4fd69d163615fc7b6713f10b51fc8b59b")
    public
        fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param notifications The SNS event notifications for the specified backup vault.
     */
    public fun notifications(notifications: IResolvable)

    /**
     * @param notifications The SNS event notifications for the specified backup vault.
     */
    public fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty)

    /**
     * @param notifications The SNS event notifications for the specified backup vault.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29aa0e09e1ef908d0b104d072a254efdd1ba75409e20f44d06e4a8feee593d2a")
    public
        fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupVaultProps.Builder =
        software.amazon.awscdk.services.backup.CfnBackupVaultProps.builder()

    /**
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * target backup vault.
     */
    override fun accessPolicy(accessPolicy: Any) {
      cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * @param backupVaultName The name of a logical container where backups are stored. 
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     */
    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * @param backupVaultTags Metadata that you can assign to help organize the resources that you
     * create.
     * Each tag is a key-value pair.
     */
    override fun backupVaultTags(backupVaultTags: Map<String, String>) {
      cdkBuilder.backupVaultTags(backupVaultTags)
    }

    /**
     * @param encryptionKeyArn A server-side encryption key you can specify to encrypt your backups
     * from services that support full AWS Backup management;.
     * for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * If you specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
     * Backup creates a KMS key for you by default.
     *
     * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
     * handles encryption for backups from services that do not yet support full AWS Backup , see
     * [Encryption for backups in AWS
     * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     */
    override fun lockConfiguration(lockConfiguration: IResolvable) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     */
    override
        fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(CfnBackupVault.LockConfigurationTypeProperty::unwrap))
    }

    /**
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b12854a83d82c7db8221c5c5eb0aabd4fd69d163615fc7b6713f10b51fc8b59b")
    override
        fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty.Builder.() -> Unit):
        Unit = lockConfiguration(CfnBackupVault.LockConfigurationTypeProperty(lockConfiguration))

    /**
     * @param notifications The SNS event notifications for the specified backup vault.
     */
    override fun notifications(notifications: IResolvable) {
      cdkBuilder.notifications(notifications.let(IResolvable::unwrap))
    }

    /**
     * @param notifications The SNS event notifications for the specified backup vault.
     */
    override fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty) {
      cdkBuilder.notifications(notifications.let(CfnBackupVault.NotificationObjectTypeProperty::unwrap))
    }

    /**
     * @param notifications The SNS event notifications for the specified backup vault.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29aa0e09e1ef908d0b104d072a254efdd1ba75409e20f44d06e4a8feee593d2a")
    override
        fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit):
        Unit = notifications(CfnBackupVault.NotificationObjectTypeProperty(notifications))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupVaultProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.CfnBackupVaultProps,
  ) : CdkObject(cdkObject), CfnBackupVaultProps {
    /**
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy)
     */
    override fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname)
     */
    override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

    /**
     * Metadata that you can assign to help organize the resources that you create.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags)
     */
    override fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
        emptyMap()

    /**
     * A server-side encryption key you can specify to encrypt your backups from services that
     * support full AWS Backup management;
     *
     * for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * If you specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
     * Backup creates a KMS key for you by default.
     *
     * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
     * handles encryption for backups from services that do not yet support full AWS Backup , see
     * [Encryption for backups in AWS
     * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn)
     */
    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     */
    override fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     */
    override fun notifications(): Any? = unwrap(this).getNotifications()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBackupVaultProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVaultProps):
        CfnBackupVaultProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBackupVaultProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBackupVaultProps):
        software.amazon.awscdk.services.backup.CfnBackupVaultProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.CfnBackupVaultProps
  }
}
