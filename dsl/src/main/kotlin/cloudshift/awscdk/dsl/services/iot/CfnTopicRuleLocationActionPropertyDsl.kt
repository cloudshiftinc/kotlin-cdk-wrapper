@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleLocationActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.LocationActionProperty.Builder =
      CfnTopicRule.LocationActionProperty.builder()

  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  public fun latitude(latitude: String) {
    cdkBuilder.latitude(latitude)
  }

  public fun longitude(longitude: String) {
    cdkBuilder.longitude(longitude)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun timestamp(timestamp: IResolvable) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun timestamp(timestamp: CfnTopicRule.TimestampProperty) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun trackerName(trackerName: String) {
    cdkBuilder.trackerName(trackerName)
  }

  public fun build(): CfnTopicRule.LocationActionProperty = cdkBuilder.build()
}
