@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionDestinationPropertyDsl {
  private val cdkBuilder: CfnFunction.DestinationProperty.Builder =
      CfnFunction.DestinationProperty.builder()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnFunction.DestinationProperty = cdkBuilder.build()
}
