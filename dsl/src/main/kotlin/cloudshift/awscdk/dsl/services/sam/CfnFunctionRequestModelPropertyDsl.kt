@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionRequestModelPropertyDsl {
  private val cdkBuilder: CfnFunction.RequestModelProperty.Builder =
      CfnFunction.RequestModelProperty.builder()

  /**
   * @param model the value to be set. 
   */
  public fun model(model: String) {
    cdkBuilder.model(model)
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

  /**
   * @param validateBody the value to be set.
   */
  public fun validateBody(validateBody: Boolean) {
    cdkBuilder.validateBody(validateBody)
  }

  /**
   * @param validateBody the value to be set.
   */
  public fun validateBody(validateBody: IResolvable) {
    cdkBuilder.validateBody(validateBody)
  }

  /**
   * @param validateParameters the value to be set.
   */
  public fun validateParameters(validateParameters: Boolean) {
    cdkBuilder.validateParameters(validateParameters)
  }

  /**
   * @param validateParameters the value to be set.
   */
  public fun validateParameters(validateParameters: IResolvable) {
    cdkBuilder.validateParameters(validateParameters)
  }

  public fun build(): CfnFunction.RequestModelProperty = cdkBuilder.build()
}
