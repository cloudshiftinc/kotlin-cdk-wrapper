@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.DestinationConfigProperty.Builder =
      CfnFunction.DestinationConfigProperty.builder()

  public fun onFailure(onFailure: IResolvable) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun onFailure(onFailure: CfnFunction.DestinationProperty) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun build(): CfnFunction.DestinationConfigProperty = cdkBuilder.build()
}
