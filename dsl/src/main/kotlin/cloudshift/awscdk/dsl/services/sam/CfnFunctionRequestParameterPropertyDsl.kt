@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionRequestParameterPropertyDsl {
  private val cdkBuilder: CfnFunction.RequestParameterProperty.Builder =
      CfnFunction.RequestParameterProperty.builder()

  /**
   * @param caching the value to be set.
   */
  public fun caching(caching: Boolean) {
    cdkBuilder.caching(caching)
  }

  /**
   * @param caching the value to be set.
   */
  public fun caching(caching: IResolvable) {
    cdkBuilder.caching(caching)
  }

  /**
   * @param required the value to be set.
   */
  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  /**
   * @param required the value to be set.
   */
  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  public fun build(): CfnFunction.RequestParameterProperty = cdkBuilder.build()
}
