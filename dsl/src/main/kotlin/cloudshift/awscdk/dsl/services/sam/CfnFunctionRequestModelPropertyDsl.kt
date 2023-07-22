@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * RequestModelProperty requestModelProperty = RequestModelProperty.builder()
 * .model("model")
 * // the properties below are optional
 * .required(false)
 * .validateBody(false)
 * .validateParameters(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestmodel.html)
 */
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
