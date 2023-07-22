@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents the query parameter in the request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * QueryParameterProperty queryParameterProperty = QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html)
 */
@CdkDslMarker
public class CfnRouteQueryParameterPropertyDsl {
  private val cdkBuilder: CfnRoute.QueryParameterProperty.Builder =
      CfnRoute.QueryParameterProperty.builder()

  /**
   * @param match The query parameter to match on.
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match The query parameter to match on.
   */
  public fun match(match: CfnRoute.HttpQueryParameterMatchProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name A name for the query parameter that will be matched on. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRoute.QueryParameterProperty = cdkBuilder.build()
}
