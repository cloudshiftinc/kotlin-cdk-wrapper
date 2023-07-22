@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceServiceObservabilityConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.ServiceObservabilityConfigurationProperty.Builder =
      CfnService.ServiceObservabilityConfigurationProperty.builder()

  /**
   * @param observabilityConfigurationArn The Amazon Resource Name (ARN) of the observability
   * configuration that is associated with the service.
   * Specified only when `ObservabilityEnabled` is `true` .
   *
   * Specify an ARN with a name and a revision number to associate that revision. For example:
   * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3`
   *
   * Specify just the name to associate the latest revision. For example:
   * `arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing`
   */
  public fun observabilityConfigurationArn(observabilityConfigurationArn: String) {
    cdkBuilder.observabilityConfigurationArn(observabilityConfigurationArn)
  }

  /**
   * @param observabilityEnabled When `true` , an observability configuration resource is associated
   * with the service, and an `ObservabilityConfigurationArn` is specified. 
   */
  public fun observabilityEnabled(observabilityEnabled: Boolean) {
    cdkBuilder.observabilityEnabled(observabilityEnabled)
  }

  /**
   * @param observabilityEnabled When `true` , an observability configuration resource is associated
   * with the service, and an `ObservabilityConfigurationArn` is specified. 
   */
  public fun observabilityEnabled(observabilityEnabled: IResolvable) {
    cdkBuilder.observabilityEnabled(observabilityEnabled)
  }

  public fun build(): CfnService.ServiceObservabilityConfigurationProperty = cdkBuilder.build()
}
