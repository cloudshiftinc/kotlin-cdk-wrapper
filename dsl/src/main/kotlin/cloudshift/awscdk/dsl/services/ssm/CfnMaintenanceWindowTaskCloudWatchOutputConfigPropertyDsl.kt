@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskCloudWatchOutputConfigPropertyDsl {
  private val cdkBuilder: CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.Builder =
      CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.builder()

  /**
   * @param cloudWatchLogGroupName The name of the CloudWatch Logs log group where you want to send
   * command output.
   * If you don't specify a group name, AWS Systems Manager automatically creates a log group for
   * you. The log group uses the following naming format:
   *
   * `aws/ssm/ *SystemsManagerDocumentName*`
   */
  public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
    cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
  }

  /**
   * @param cloudWatchOutputEnabled Enables Systems Manager to send command output to CloudWatch
   * Logs.
   */
  public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: Boolean) {
    cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled)
  }

  /**
   * @param cloudWatchOutputEnabled Enables Systems Manager to send command output to CloudWatch
   * Logs.
   */
  public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: IResolvable) {
    cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled)
  }

  public fun build(): CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty = cdkBuilder.build()
}
