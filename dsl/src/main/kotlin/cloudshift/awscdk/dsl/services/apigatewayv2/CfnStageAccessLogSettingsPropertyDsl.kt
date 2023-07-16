@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnStage

@CdkDslMarker
public class CfnStageAccessLogSettingsPropertyDsl {
  private val cdkBuilder: CfnStage.AccessLogSettingsProperty.Builder =
      CfnStage.AccessLogSettingsProperty.builder()

  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun build(): CfnStage.AccessLogSettingsProperty = cdkBuilder.build()
}
