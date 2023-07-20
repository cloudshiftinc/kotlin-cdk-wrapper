@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

@CdkDslMarker
public class CfnLaunchConfigurationMetadataOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchConfiguration.MetadataOptionsProperty.Builder =
      CfnLaunchConfiguration.MetadataOptionsProperty.builder()

  public fun httpEndpoint(httpEndpoint: String) {
    cdkBuilder.httpEndpoint(httpEndpoint)
  }

  public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
    cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
  }

  public fun httpTokens(httpTokens: String) {
    cdkBuilder.httpTokens(httpTokens)
  }

  public fun build(): CfnLaunchConfiguration.MetadataOptionsProperty = cdkBuilder.build()
}
