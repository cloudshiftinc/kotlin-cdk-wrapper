@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.CfnBackupVault

@CdkDslMarker
public class CfnBackupVaultNotificationObjectTypePropertyDsl {
  private val cdkBuilder: CfnBackupVault.NotificationObjectTypeProperty.Builder =
      CfnBackupVault.NotificationObjectTypeProperty.builder()

  private val _backupVaultEvents: MutableList<String> = mutableListOf()

  /**
   * @param backupVaultEvents An array of events that indicate the status of jobs to back up
   * resources to the backup vault. 
   * For valid events, see
   * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
   * in the *AWS Backup API Guide* .
   */
  public fun backupVaultEvents(vararg backupVaultEvents: String) {
    _backupVaultEvents.addAll(listOf(*backupVaultEvents))
  }

  /**
   * @param backupVaultEvents An array of events that indicate the status of jobs to back up
   * resources to the backup vault. 
   * For valid events, see
   * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
   * in the *AWS Backup API Guide* .
   */
  public fun backupVaultEvents(backupVaultEvents: Collection<String>) {
    _backupVaultEvents.addAll(backupVaultEvents)
  }

  /**
   * @param snsTopicArn An ARN that uniquely identifies an Amazon Simple Notification Service
   * (Amazon SNS) topic;. 
   * for example, `arn:aws:sns:us-west-2:111122223333:MyTopic` .
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnBackupVault.NotificationObjectTypeProperty {
    if(_backupVaultEvents.isNotEmpty()) cdkBuilder.backupVaultEvents(_backupVaultEvents)
    return cdkBuilder.build()
  }
}
