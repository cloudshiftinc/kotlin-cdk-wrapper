@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowRunCommandParametersPropertyDsl {
  private val cdkBuilder:
      CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.Builder =
      CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.builder()

  /**
   * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
   * CloudWatch Logs.
   */
  public fun cloudWatchOutputConfig(cloudWatchOutputConfig: IResolvable) {
    cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig)
  }

  /**
   * @param cloudWatchOutputConfig Configuration options for sending command output to Amazon
   * CloudWatch Logs.
   */
  public
      fun cloudWatchOutputConfig(cloudWatchOutputConfig: CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty) {
    cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig)
  }

  /**
   * @param comment Information about the command or commands to run.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param documentHash The SHA-256 or SHA-1 hash created by the system when the document was
   * created.
   * SHA-1 hashes have been deprecated.
   */
  public fun documentHash(documentHash: String) {
    cdkBuilder.documentHash(documentHash)
  }

  /**
   * @param documentHashType The SHA-256 or SHA-1 hash type.
   * SHA-1 hashes are deprecated.
   */
  public fun documentHashType(documentHashType: String) {
    cdkBuilder.documentHashType(documentHashType)
  }

  /**
   * @param documentVersion The AWS Systems Manager document (SSM document) version to use in the
   * request.
   * You can specify `$DEFAULT` , `$LATEST` , or a specific version number. If you run commands by
   * using the AWS CLI, then you must escape the first two options by using a backslash. If you specify
   * a version number, then you don't need to use the backslash. For example:
   *
   * `--document-version "\$DEFAULT"`
   *
   * `--document-version "\$LATEST"`
   *
   * `--document-version "3"`
   */
  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  /**
   * @param notificationConfig Configurations for sending notifications about command status changes
   * on a per-managed node basis.
   */
  public fun notificationConfig(notificationConfig: IResolvable) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  /**
   * @param notificationConfig Configurations for sending notifications about command status changes
   * on a per-managed node basis.
   */
  public
      fun notificationConfig(notificationConfig: CfnMaintenanceWindowTask.NotificationConfigProperty) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  /**
   * @param outputS3BucketName The name of the Amazon Simple Storage Service (Amazon S3) bucket.
   */
  public fun outputS3BucketName(outputS3BucketName: String) {
    cdkBuilder.outputS3BucketName(outputS3BucketName)
  }

  /**
   * @param outputS3KeyPrefix The S3 bucket subfolder.
   */
  public fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
    cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
  }

  /**
   * @param parameters The parameters for the `RUN_COMMAND` task execution.
   * The supported parameters are the same as those for the `SendCommand` API call. For more
   * information, see
   * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
   * in the *AWS Systems Manager API Reference* .
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters The parameters for the `RUN_COMMAND` task execution.
   * The supported parameters are the same as those for the `SendCommand` API call. For more
   * information, see
   * [SendCommand](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendCommand.html)
   * in the *AWS Systems Manager API Reference* .
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param serviceRoleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management
   * (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications
   * for maintenance window Run Command tasks.
   */
  public fun serviceRoleArn(serviceRoleArn: String) {
    cdkBuilder.serviceRoleArn(serviceRoleArn)
  }

  /**
   * @param timeoutSeconds If this time is reached and the command hasn't already started running,
   * it doesn't run.
   */
  public fun timeoutSeconds(timeoutSeconds: Number) {
    cdkBuilder.timeoutSeconds(timeoutSeconds)
  }

  public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty =
      cdkBuilder.build()
}
