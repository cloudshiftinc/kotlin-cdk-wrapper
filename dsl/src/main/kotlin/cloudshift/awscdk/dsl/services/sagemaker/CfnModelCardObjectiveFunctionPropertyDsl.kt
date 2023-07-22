@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The function that is optimized during model training.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ObjectiveFunctionProperty objectiveFunctionProperty = ObjectiveFunctionProperty.builder()
 * .function(FunctionProperty.builder()
 * .condition("condition")
 * .facet("facet")
 * .function("function")
 * .build())
 * .notes("notes")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html)
 */
@CdkDslMarker
public class CfnModelCardObjectiveFunctionPropertyDsl {
  private val cdkBuilder: CfnModelCard.ObjectiveFunctionProperty.Builder =
      CfnModelCard.ObjectiveFunctionProperty.builder()

  /**
   * @param function A function object that details optimization direction, metric, and additional
   * descriptions.
   */
  public fun function(function: IResolvable) {
    cdkBuilder.function(function)
  }

  /**
   * @param function A function object that details optimization direction, metric, and additional
   * descriptions.
   */
  public fun function(function: CfnModelCard.FunctionProperty) {
    cdkBuilder.function(function)
  }

  /**
   * @param notes Notes about the object function, including other considerations for possible
   * objective functions.
   */
  public fun notes(notes: String) {
    cdkBuilder.notes(notes)
  }

  public fun build(): CfnModelCard.ObjectiveFunctionProperty = cdkBuilder.build()
}
