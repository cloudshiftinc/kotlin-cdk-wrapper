@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

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
