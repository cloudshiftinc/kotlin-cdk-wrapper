@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnStackSet

@CdkDslMarker
public class CfnStackSetParameterPropertyDsl {
  private val cdkBuilder: CfnStackSet.ParameterProperty.Builder =
      CfnStackSet.ParameterProperty.builder()

  /**
   * @param parameterKey The key associated with the parameter. 
   * If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the
   * default value that's specified in your template.
   */
  public fun parameterKey(parameterKey: String) {
    cdkBuilder.parameterKey(parameterKey)
  }

  /**
   * @param parameterValue The input value associated with the parameter. 
   */
  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnStackSet.ParameterProperty = cdkBuilder.build()
}
