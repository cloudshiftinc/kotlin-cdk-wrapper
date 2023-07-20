@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnServer

@CdkDslMarker
public class CfnServerStructuredLogDestinationPropertyDsl {
  private val cdkBuilder: CfnServer.StructuredLogDestinationProperty.Builder =
      CfnServer.StructuredLogDestinationProperty.builder()

  public fun build(): CfnServer.StructuredLogDestinationProperty = cdkBuilder.build()
}
