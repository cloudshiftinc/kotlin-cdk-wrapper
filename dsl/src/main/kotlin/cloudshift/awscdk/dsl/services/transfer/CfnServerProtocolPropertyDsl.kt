@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnServer

@CdkDslMarker
public class CfnServerProtocolPropertyDsl {
  private val cdkBuilder: CfnServer.ProtocolProperty.Builder = CfnServer.ProtocolProperty.builder()

  public fun build(): CfnServer.ProtocolProperty = cdkBuilder.build()
}
