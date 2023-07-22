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

  /**
   * @param cloudwatchLogGroup The name of the CloudWatch Logs log group.
   * Required if connection logging is enabled.
   */
  public fun cloudwatchLogGroup(cloudwatchLogGroup: String) {
    cdkBuilder.cloudwatchLogGroup(cloudwatchLogGroup)
  }

  /**
   * @param cloudwatchLogStream The name of the CloudWatch Logs log stream to which the connection
   * data is published.
   */
  public fun cloudwatchLogStream(cloudwatchLogStream: String) {
    cdkBuilder.cloudwatchLogStream(cloudwatchLogStream)
  }

  /**
   * @param enabled Indicates whether connection logging is enabled. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether connection logging is enabled. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnClientVpnEndpoint.ConnectionLogOptionsProperty = cdkBuilder.build()
}
