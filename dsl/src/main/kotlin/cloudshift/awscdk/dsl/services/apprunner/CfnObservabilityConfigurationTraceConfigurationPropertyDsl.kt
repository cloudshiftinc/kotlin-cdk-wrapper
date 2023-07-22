@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration

/**
 * Describes the configuration of the tracing feature within an AWS App Runner observability
 * configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * TraceConfigurationProperty traceConfigurationProperty = TraceConfigurationProperty.builder()
 * .vendor("vendor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-observabilityconfiguration-traceconfiguration.html)
 */
@CdkDslMarker
public class CfnObservabilityConfigurationTraceConfigurationPropertyDsl {
  private val cdkBuilder: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder =
      CfnObservabilityConfiguration.TraceConfigurationProperty.builder()

  /**
   * @param vendor The implementation provider chosen for tracing App Runner services. 
   */
  public fun vendor(vendor: String) {
    cdkBuilder.vendor(vendor)
  }

  public fun build(): CfnObservabilityConfiguration.TraceConfigurationProperty = cdkBuilder.build()
}
