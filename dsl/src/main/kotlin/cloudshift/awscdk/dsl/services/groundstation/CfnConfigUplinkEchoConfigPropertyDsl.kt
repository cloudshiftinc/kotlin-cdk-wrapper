@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigUplinkEchoConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.UplinkEchoConfigProperty.Builder =
      CfnConfig.UplinkEchoConfigProperty.builder()

  /**
   * @param antennaUplinkConfigArn Defines the ARN of the uplink config to echo back to a dataflow
   * endpoint.
   */
  public fun antennaUplinkConfigArn(antennaUplinkConfigArn: String) {
    cdkBuilder.antennaUplinkConfigArn(antennaUplinkConfigArn)
  }

  /**
   * @param enabled Whether or not uplink echo is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Whether or not uplink echo is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnConfig.UplinkEchoConfigProperty = cdkBuilder.build()
}
