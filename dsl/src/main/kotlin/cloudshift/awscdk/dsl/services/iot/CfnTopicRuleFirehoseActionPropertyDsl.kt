@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleFirehoseActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.FirehoseActionProperty.Builder =
      CfnTopicRule.FirehoseActionProperty.builder()

  public fun batchMode(batchMode: Boolean) {
    cdkBuilder.batchMode(batchMode)
  }

  public fun batchMode(batchMode: IResolvable) {
    cdkBuilder.batchMode(batchMode)
  }

  public fun deliveryStreamName(deliveryStreamName: String) {
    cdkBuilder.deliveryStreamName(deliveryStreamName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun separator(separator: String) {
    cdkBuilder.separator(separator)
  }

  public fun build(): CfnTopicRule.FirehoseActionProperty = cdkBuilder.build()
}
