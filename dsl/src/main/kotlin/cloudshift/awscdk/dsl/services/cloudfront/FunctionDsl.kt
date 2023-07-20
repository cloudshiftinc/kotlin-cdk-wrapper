@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.Function
import software.amazon.awscdk.services.cloudfront.FunctionCode
import software.constructs.Construct

@CdkDslMarker
public class FunctionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Function.Builder = Function.Builder.create(scope, id)

  public fun code(code: FunctionCode) {
    cdkBuilder.code(code)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun build(): Function = cdkBuilder.build()
}
