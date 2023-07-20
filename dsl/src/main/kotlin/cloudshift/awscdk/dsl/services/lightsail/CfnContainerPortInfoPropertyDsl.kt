@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnContainer

@CdkDslMarker
public class CfnContainerPortInfoPropertyDsl {
  private val cdkBuilder: CfnContainer.PortInfoProperty.Builder =
      CfnContainer.PortInfoProperty.builder()

  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnContainer.PortInfoProperty = cdkBuilder.build()
}
