@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointAlarmPropertyDsl {
  private val cdkBuilder: CfnEndpoint.AlarmProperty.Builder = CfnEndpoint.AlarmProperty.builder()

  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  public fun build(): CfnEndpoint.AlarmProperty = cdkBuilder.build()
}
