@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleCloudwatchLogsActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.CloudwatchLogsActionProperty.Builder =
      CfnTopicRule.CloudwatchLogsActionProperty.builder()

  /**
   * @param batchMode Indicates whether batches of log records will be extracted and uploaded into
   * CloudWatch.
   */
  public fun batchMode(batchMode: Boolean) {
    cdkBuilder.batchMode(batchMode)
  }

  /**
   * @param batchMode Indicates whether batches of log records will be extracted and uploaded into
   * CloudWatch.
   */
  public fun batchMode(batchMode: IResolvable) {
    cdkBuilder.batchMode(batchMode)
  }

  /**
   * @param logGroupName The CloudWatch log name. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param roleArn The IAM role that allows access to the CloudWatch log. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnTopicRule.CloudwatchLogsActionProperty = cdkBuilder.build()
}
