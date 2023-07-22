@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnGateway

@CdkDslMarker
public class CfnGatewayGatewayCapabilitySummaryPropertyDsl {
  private val cdkBuilder: CfnGateway.GatewayCapabilitySummaryProperty.Builder =
      CfnGateway.GatewayCapabilitySummaryProperty.builder()

  /**
   * @param capabilityConfiguration The JSON document that defines the configuration for the gateway
   * capability.
   * For more information, see [Configuring data sources
   * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli)
   * in the *AWS IoT SiteWise User Guide* .
   */
  public fun capabilityConfiguration(capabilityConfiguration: String) {
    cdkBuilder.capabilityConfiguration(capabilityConfiguration)
  }

  /**
   * @param capabilityNamespace The namespace of the capability configuration. 
   * For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
   * capability configuration has the namespace `iotsitewise:opcuacollector:version` , where `version`
   * is a number such as `1` .
   *
   * The maximum length is 512 characters with the pattern `^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$` .
   */
  public fun capabilityNamespace(capabilityNamespace: String) {
    cdkBuilder.capabilityNamespace(capabilityNamespace)
  }

  public fun build(): CfnGateway.GatewayCapabilitySummaryProperty = cdkBuilder.build()
}
