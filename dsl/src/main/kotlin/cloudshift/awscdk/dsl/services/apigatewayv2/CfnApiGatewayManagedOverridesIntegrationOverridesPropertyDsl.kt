@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

@CdkDslMarker
public class CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl {
  private val cdkBuilder: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder =
      CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun integrationMethod(integrationMethod: String) {
    cdkBuilder.integrationMethod(integrationMethod)
  }

  public fun payloadFormatVersion(payloadFormatVersion: String) {
    cdkBuilder.payloadFormatVersion(payloadFormatVersion)
  }

  public fun timeoutInMillis(timeoutInMillis: Number) {
    cdkBuilder.timeoutInMillis(timeoutInMillis)
  }

  public fun build(): CfnApiGatewayManagedOverrides.IntegrationOverridesProperty =
      cdkBuilder.build()
}
