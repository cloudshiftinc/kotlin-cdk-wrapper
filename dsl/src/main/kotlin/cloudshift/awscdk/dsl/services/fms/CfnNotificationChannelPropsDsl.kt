@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnNotificationChannelProps

@CdkDslMarker
public class CfnNotificationChannelPropsDsl {
  private val cdkBuilder: CfnNotificationChannelProps.Builder =
      CfnNotificationChannelProps.builder()

  public fun snsRoleName(snsRoleName: String) {
    cdkBuilder.snsRoleName(snsRoleName)
  }

  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnNotificationChannelProps = cdkBuilder.build()
}
