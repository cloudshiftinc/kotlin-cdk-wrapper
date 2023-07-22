@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEndpoint

@CdkDslMarker
public class CfnEndpointSecondaryPropertyDsl {
  private val cdkBuilder: CfnEndpoint.SecondaryProperty.Builder =
      CfnEndpoint.SecondaryProperty.builder()

  /**
   * @param route Defines the secondary Region. 
   */
  public fun route(route: String) {
    cdkBuilder.route(route)
  }

  public fun build(): CfnEndpoint.SecondaryProperty = cdkBuilder.build()
}
