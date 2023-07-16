@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointConnectionLogOptionsPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder =
      CfnClientVpnEndpoint.ConnectionLogOptionsProperty.builder()

  public fun cloudwatchLogGroup(cloudwatchLogGroup: String) {
    cdkBuilder.cloudwatchLogGroup(cloudwatchLogGroup)
  }

  public fun cloudwatchLogStream(cloudwatchLogStream: String) {
    cdkBuilder.cloudwatchLogStream(cloudwatchLogStream)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnClientVpnEndpoint.ConnectionLogOptionsProperty = cdkBuilder.build()
}
