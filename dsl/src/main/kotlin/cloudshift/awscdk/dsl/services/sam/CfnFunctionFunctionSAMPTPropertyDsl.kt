@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * FunctionSAMPTProperty functionSAMPTProperty = FunctionSAMPTProperty.builder()
 * .functionName("functionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionsampt.html)
 */
@CdkDslMarker
public class CfnFunctionFunctionSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.FunctionSAMPTProperty.Builder =
      CfnFunction.FunctionSAMPTProperty.builder()

  /**
   * @param functionName the value to be set. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun build(): CfnFunction.FunctionSAMPTProperty = cdkBuilder.build()
}
