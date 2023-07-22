@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object representing the path to match in the request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpPathMatchProperty httpPathMatchProperty = HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html)
 */
@CdkDslMarker
public class CfnRouteHttpPathMatchPropertyDsl {
  private val cdkBuilder: CfnRoute.HttpPathMatchProperty.Builder =
      CfnRoute.HttpPathMatchProperty.builder()

  /**
   * @param exact The exact path to match on.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  /**
   * @param regex The regex used to match the path.
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  public fun build(): CfnRoute.HttpPathMatchProperty = cdkBuilder.build()
}
