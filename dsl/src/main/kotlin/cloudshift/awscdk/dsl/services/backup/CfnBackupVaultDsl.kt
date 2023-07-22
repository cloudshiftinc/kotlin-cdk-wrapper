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

  /**
   * A resource-based policy that is used to manage access permissions on the target backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy)
   * @param accessPolicy A resource-based policy that is used to manage access permissions on the
   * target backup vault. 
   */
  public fun accessPolicy(accessPolicy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(accessPolicy)
    cdkBuilder.accessPolicy(builder.map)
  }

  /**
   * A resource-based policy that is used to manage access permissions on the target backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy)
   * @param accessPolicy A resource-based policy that is used to manage access permissions on the
   * target backup vault. 
   */
  public fun accessPolicy(accessPolicy: Any) {
    cdkBuilder.accessPolicy(accessPolicy)
  }

  /**
   * The name of a logical container where backups are stored.
   *
   * Backup vaults are identified by names that are unique to the account used to create them and
   * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname)
   * @param backupVaultName The name of a logical container where backups are stored. 
   */
  public fun backupVaultName(backupVaultName: String) {
    cdkBuilder.backupVaultName(backupVaultName)
  }

  /**
   * Metadata that you can assign to help organize the resources that you create.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags)
   * @param backupVaultTags Metadata that you can assign to help organize the resources that you
   * create. 
   */
  public fun backupVaultTags(backupVaultTags: Map<String, String>) {
    cdkBuilder.backupVaultTags(backupVaultTags)
  }

  /**
   * Metadata that you can assign to help organize the resources that you create.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags)
   * @param backupVaultTags Metadata that you can assign to help organize the resources that you
   * create. 
   */
  public fun backupVaultTags(backupVaultTags: IResolvable) {
    cdkBuilder.backupVaultTags(backupVaultTags)
  }

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
   * @param encryptionKeyArn A server-side encryption key you can specify to encrypt your backups
   * from services that support full AWS Backup management;. 
   */
  public fun encryptionKeyArn(encryptionKeyArn: String) {
    cdkBuilder.encryptionKeyArn(encryptionKeyArn)
  }

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
   * @param lockConfiguration Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
   */
  public fun lockConfiguration(lockConfiguration: IResolvable) {
    cdkBuilder.lockConfiguration(lockConfiguration)
  }

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
   * @param lockConfiguration Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
   */
  public fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty) {
    cdkBuilder.lockConfiguration(lockConfiguration)
  }

  /**
   * The SNS event notifications for the specified backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
   * @param notifications The SNS event notifications for the specified backup vault. 
   */
  public fun notifications(notifications: IResolvable) {
    cdkBuilder.notifications(notifications)
  }

  /**
   * The SNS event notifications for the specified backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
   * @param notifications The SNS event notifications for the specified backup vault. 
   */
  public fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty) {
    cdkBuilder.notifications(notifications)
  }

  public fun build(): CfnBackupVault = cdkBuilder.build()
}
