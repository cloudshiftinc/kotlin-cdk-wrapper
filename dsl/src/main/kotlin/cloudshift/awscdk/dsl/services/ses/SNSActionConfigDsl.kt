@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.SNSActionConfig

@CdkDslMarker
public class SNSActionConfigDsl {
  private val cdkBuilder: SNSActionConfig.Builder = SNSActionConfig.builder()

  public fun encoding(encoding: String) {
    cdkBuilder.encoding(encoding)
  }

  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): SNSActionConfig = cdkBuilder.build()
}
