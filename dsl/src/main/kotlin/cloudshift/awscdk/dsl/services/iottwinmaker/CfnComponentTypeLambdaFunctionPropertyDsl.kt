@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

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
