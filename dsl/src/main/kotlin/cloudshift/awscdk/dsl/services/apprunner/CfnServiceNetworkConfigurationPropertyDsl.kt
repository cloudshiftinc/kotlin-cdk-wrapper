@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes configuration settings related to network traffic of an AWS App Runner service.
 *
 * Consists of embedded objects for each configurable network feature.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .egressConfiguration(EgressConfigurationProperty.builder()
 * .egressType("egressType")
 * // the properties below are optional
 * .vpcConnectorArn("vpcConnectorArn")
 * .build())
 * .ingressConfiguration(IngressConfigurationProperty.builder()
 * .isPubliclyAccessible(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.NetworkConfigurationProperty.Builder =
      CfnService.NetworkConfigurationProperty.builder()

  /**
   * @param egressConfiguration Network configuration settings for outbound message traffic.
   */
  public fun egressConfiguration(egressConfiguration: IResolvable) {
    cdkBuilder.egressConfiguration(egressConfiguration)
  }

  /**
   * @param egressConfiguration Network configuration settings for outbound message traffic.
   */
  public fun egressConfiguration(egressConfiguration: CfnService.EgressConfigurationProperty) {
    cdkBuilder.egressConfiguration(egressConfiguration)
  }

  /**
   * @param ingressConfiguration Network configuration settings for inbound message traffic.
   */
  public fun ingressConfiguration(ingressConfiguration: IResolvable) {
    cdkBuilder.ingressConfiguration(ingressConfiguration)
  }

  /**
   * @param ingressConfiguration Network configuration settings for inbound message traffic.
   */
  public fun ingressConfiguration(ingressConfiguration: CfnService.IngressConfigurationProperty) {
    cdkBuilder.ingressConfiguration(ingressConfiguration)
  }

  public fun build(): CfnService.NetworkConfigurationProperty = cdkBuilder.build()
}
