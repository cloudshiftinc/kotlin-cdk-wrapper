@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQuerySnsConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.SnsConfigurationProperty.Builder =
      CfnScheduledQuery.SnsConfigurationProperty.builder()

  /**
   * @param topicArn SNS topic ARN that the scheduled query status notifications will be sent to. 
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnScheduledQuery.SnsConfigurationProperty = cdkBuilder.build()
}
