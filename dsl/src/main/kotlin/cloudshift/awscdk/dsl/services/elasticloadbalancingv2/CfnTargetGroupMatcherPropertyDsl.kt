@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup

@CdkDslMarker
public class CfnTargetGroupMatcherPropertyDsl {
  private val cdkBuilder: CfnTargetGroup.MatcherProperty.Builder =
      CfnTargetGroup.MatcherProperty.builder()

  /**
   * @param grpcCode You can specify values between 0 and 99.
   * You can specify multiple values (for example, "0,1") or a range of values (for example, "0-5").
   * The default value is 12.
   */
  public fun grpcCode(grpcCode: String) {
    cdkBuilder.grpcCode(grpcCode)
  }

  /**
   * @param httpCode For Application Load Balancers, you can specify values between 200 and 499,
   * with the default value being 200.
   * You can specify multiple values (for example, "200,202") or a range of values (for example,
   * "200-299").
   *
   * For Network Load Balancers, you can specify values between 200 and 599, with the default value
   * being 200-399. You can specify multiple values (for example, "200,202") or a range of values (for
   * example, "200-299").
   *
   * For Gateway Load Balancers, this must be "200–399".
   *
   * Note that when using shorthand syntax, some values such as commas need to be escaped.
   */
  public fun httpCode(httpCode: String) {
    cdkBuilder.httpCode(httpCode)
  }

  public fun build(): CfnTargetGroup.MatcherProperty = cdkBuilder.build()
}
