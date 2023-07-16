@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnConnectionProps

@CdkDslMarker
public class CfnConnectionPropsDsl {
  private val cdkBuilder: CfnConnectionProps.Builder = CfnConnectionProps.builder()

  public fun authParameters(authParameters: IResolvable) {
    cdkBuilder.authParameters(authParameters)
  }

  public fun authParameters(authParameters: CfnConnection.AuthParametersProperty) {
    cdkBuilder.authParameters(authParameters)
  }

  public fun authorizationType(authorizationType: String) {
    cdkBuilder.authorizationType(authorizationType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnConnectionProps = cdkBuilder.build()
}
