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

  public fun antennaUplinkConfigArn(antennaUplinkConfigArn: String) {
    cdkBuilder.antennaUplinkConfigArn(antennaUplinkConfigArn)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnConfig.UplinkEchoConfigProperty = cdkBuilder.build()
}
