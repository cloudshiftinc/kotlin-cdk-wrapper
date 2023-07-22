@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents the HTTP header in the request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpRouteHeaderProperty httpRouteHeaderProperty = HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html)
 */
@CdkDslMarker
public class CfnRouteHttpRouteHeaderPropertyDsl {
  private val cdkBuilder: CfnRoute.HttpRouteHeaderProperty.Builder =
      CfnRoute.HttpRouteHeaderProperty.builder()

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
   * @param match The `HeaderMatchMethod` object.
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match The `HeaderMatchMethod` object.
   */
  public fun match(match: CfnRoute.HeaderMatchMethodProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name A name for the HTTP header in the client request that will be matched on. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRoute.HttpRouteHeaderProperty = cdkBuilder.build()
}
