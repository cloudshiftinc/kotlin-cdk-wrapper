@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnFunction

@CdkDslMarker
public class CfnFunctionFunctionConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.FunctionConfigProperty.Builder =
      CfnFunction.FunctionConfigProperty.builder()

  /**
   * @param comment A comment to describe the function. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param runtime The function's runtime environment. 
   * The only valid value is `cloudfront-js-1.0` .
   */
  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  public fun build(): CfnFunction.FunctionConfigProperty = cdkBuilder.build()
}
