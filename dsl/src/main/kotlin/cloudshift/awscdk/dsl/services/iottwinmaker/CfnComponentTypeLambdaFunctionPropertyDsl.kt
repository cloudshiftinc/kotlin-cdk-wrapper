@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * The Lambda function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * LambdaFunctionProperty lambdaFunctionProperty = LambdaFunctionProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-lambdafunction.html)
 */
@CdkDslMarker
public class CfnComponentTypeLambdaFunctionPropertyDsl {
  private val cdkBuilder: CfnComponentType.LambdaFunctionProperty.Builder =
      CfnComponentType.LambdaFunctionProperty.builder()

  /**
   * @param arn The Lambda function ARN. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnComponentType.LambdaFunctionProperty = cdkBuilder.build()
}
