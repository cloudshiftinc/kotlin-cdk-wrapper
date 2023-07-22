@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteGrpcRouteMetadataPropertyDsl {
  private val cdkBuilder: CfnRoute.GrpcRouteMetadataProperty.Builder =
      CfnRoute.GrpcRouteMetadataProperty.builder()

  /**
   * @param invert Specify `True` to match anything except the match criteria.
   * The default value is `False` .
   */
  public fun invert(invert: Boolean) {
    cdkBuilder.invert(invert)
  }

  /**
   * @param invert Specify `True` to match anything except the match criteria.
   * The default value is `False` .
   */
  public fun invert(invert: IResolvable) {
    cdkBuilder.invert(invert)
  }

  /**
   * @param match An object that represents the data to match from the request.
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match An object that represents the data to match from the request.
   */
  public fun match(match: CfnRoute.GrpcRouteMetadataMatchMethodProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name The name of the route. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRoute.GrpcRouteMetadataProperty = cdkBuilder.build()
}
