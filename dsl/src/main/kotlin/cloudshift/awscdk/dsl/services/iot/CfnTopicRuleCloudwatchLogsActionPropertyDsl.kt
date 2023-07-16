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

  public fun batchMode(batchMode: Boolean) {
    cdkBuilder.batchMode(batchMode)
  }

  public fun batchMode(batchMode: IResolvable) {
    cdkBuilder.batchMode(batchMode)
  }

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnTopicRule.CloudwatchLogsActionProperty = cdkBuilder.build()
}
