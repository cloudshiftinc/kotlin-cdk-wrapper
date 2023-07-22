@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * FunctionEnvironmentProperty functionEnvironmentProperty = FunctionEnvironmentProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionenvironment.html)
 */
@CdkDslMarker
public class CfnFunctionFunctionEnvironmentPropertyDsl {
  private val cdkBuilder: CfnFunction.FunctionEnvironmentProperty.Builder =
      CfnFunction.FunctionEnvironmentProperty.builder()

  /**
   * @param variables the value to be set. 
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * @param variables the value to be set. 
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnFunction.FunctionEnvironmentProperty = cdkBuilder.build()
}
