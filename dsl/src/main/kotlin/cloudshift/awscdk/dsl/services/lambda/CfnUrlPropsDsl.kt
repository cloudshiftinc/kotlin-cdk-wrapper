@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps

@CdkDslMarker
public class CfnUrlPropsDsl {
  private val cdkBuilder: CfnUrlProps.Builder = CfnUrlProps.builder()

  public fun authType(authType: String) {
    cdkBuilder.authType(authType)
  }

  public fun cors(cors: IResolvable) {
    cdkBuilder.cors(cors)
  }

  public fun cors(cors: CfnUrl.CorsProperty) {
    cdkBuilder.cors(cors)
  }

  public fun invokeMode(invokeMode: String) {
    cdkBuilder.invokeMode(invokeMode)
  }

  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun targetFunctionArn(targetFunctionArn: String) {
    cdkBuilder.targetFunctionArn(targetFunctionArn)
  }

  public fun build(): CfnUrlProps = cdkBuilder.build()
}
