@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * The dynamic parameter value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * DynamicSsmParameterValueProperty dynamicSsmParameterValueProperty =
 * DynamicSsmParameterValueProperty.builder()
 * .variable("variable")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparametervalue.html)
 */
@CdkDslMarker
public class CfnResponsePlanDynamicSsmParameterValuePropertyDsl {
  private val cdkBuilder: CfnResponsePlan.DynamicSsmParameterValueProperty.Builder =
      CfnResponsePlan.DynamicSsmParameterValueProperty.builder()

  /**
   * @param variable Variable dynamic parameters.
   * A parameter value is determined when an incident is created.
   */
  public fun variable(variable: String) {
    cdkBuilder.variable(variable)
  }

  public fun build(): CfnResponsePlan.DynamicSsmParameterValueProperty = cdkBuilder.build()
}
