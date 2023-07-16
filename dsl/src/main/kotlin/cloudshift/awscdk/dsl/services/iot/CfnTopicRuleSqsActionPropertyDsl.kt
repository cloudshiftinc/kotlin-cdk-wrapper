@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleSqsActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.SqsActionProperty.Builder =
      CfnTopicRule.SqsActionProperty.builder()

  public fun queueUrl(queueUrl: String) {
    cdkBuilder.queueUrl(queueUrl)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun useBase64(useBase64: Boolean) {
    cdkBuilder.useBase64(useBase64)
  }

  public fun useBase64(useBase64: IResolvable) {
    cdkBuilder.useBase64(useBase64)
  }

  public fun build(): CfnTopicRule.SqsActionProperty = cdkBuilder.build()
}
