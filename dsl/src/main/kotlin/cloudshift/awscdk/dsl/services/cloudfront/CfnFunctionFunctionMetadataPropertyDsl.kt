@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnFunction

@CdkDslMarker
public class CfnFunctionFunctionMetadataPropertyDsl {
  private val cdkBuilder: CfnFunction.FunctionMetadataProperty.Builder =
      CfnFunction.FunctionMetadataProperty.builder()

  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  public fun build(): CfnFunction.FunctionMetadataProperty = cdkBuilder.build()
}
