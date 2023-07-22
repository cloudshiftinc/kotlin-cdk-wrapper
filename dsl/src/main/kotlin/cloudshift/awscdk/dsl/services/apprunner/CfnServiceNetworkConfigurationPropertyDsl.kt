@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

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
