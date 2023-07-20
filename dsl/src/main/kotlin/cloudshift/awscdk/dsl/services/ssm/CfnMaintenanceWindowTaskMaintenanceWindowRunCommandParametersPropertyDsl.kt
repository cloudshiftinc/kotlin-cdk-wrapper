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

  public fun cloudWatchOutputConfig(cloudWatchOutputConfig: IResolvable) {
    cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig)
  }

  public
      fun cloudWatchOutputConfig(cloudWatchOutputConfig: CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty) {
    cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun documentHash(documentHash: String) {
    cdkBuilder.documentHash(documentHash)
  }

  public fun documentHashType(documentHashType: String) {
    cdkBuilder.documentHashType(documentHashType)
  }

  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  public fun notificationConfig(notificationConfig: IResolvable) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  public
      fun notificationConfig(notificationConfig: CfnMaintenanceWindowTask.NotificationConfigProperty) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  public fun outputS3BucketName(outputS3BucketName: String) {
    cdkBuilder.outputS3BucketName(outputS3BucketName)
  }

  public fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
    cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun serviceRoleArn(serviceRoleArn: String) {
    cdkBuilder.serviceRoleArn(serviceRoleArn)
  }

  public fun timeoutSeconds(timeoutSeconds: Number) {
    cdkBuilder.timeoutSeconds(timeoutSeconds)
  }

  public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty =
      cdkBuilder.build()
}
