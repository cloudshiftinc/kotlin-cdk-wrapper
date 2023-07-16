@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration

@CdkDslMarker
public class CfnObservabilityConfigurationTraceConfigurationPropertyDsl {
  private val cdkBuilder: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder =
      CfnObservabilityConfiguration.TraceConfigurationProperty.builder()

  public fun vendor(vendor: String) {
    cdkBuilder.vendor(vendor)
  }

  public fun build(): CfnObservabilityConfiguration.TraceConfigurationProperty = cdkBuilder.build()
}
