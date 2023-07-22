@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.FunctionAttributes

@CdkDslMarker
public class FunctionAttributesDsl {
  private val cdkBuilder: FunctionAttributes.Builder = FunctionAttributes.builder()

  /**
   * @param functionArn The ARN of the function. 
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param functionName The name of the function. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun build(): FunctionAttributes = cdkBuilder.build()
}
