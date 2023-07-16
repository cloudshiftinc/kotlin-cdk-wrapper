@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointElasticsearchSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.ElasticsearchSettingsProperty.Builder =
      CfnEndpoint.ElasticsearchSettingsProperty.builder()

  public fun endpointUri(endpointUri: String) {
    cdkBuilder.endpointUri(endpointUri)
  }

  public fun errorRetryDuration(errorRetryDuration: Number) {
    cdkBuilder.errorRetryDuration(errorRetryDuration)
  }

  public fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
    cdkBuilder.fullLoadErrorPercentage(fullLoadErrorPercentage)
  }

  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  public fun build(): CfnEndpoint.ElasticsearchSettingsProperty = cdkBuilder.build()
}
