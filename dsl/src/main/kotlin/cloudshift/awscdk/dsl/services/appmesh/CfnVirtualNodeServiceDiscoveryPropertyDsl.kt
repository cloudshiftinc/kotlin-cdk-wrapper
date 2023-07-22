@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeServiceDiscoveryPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ServiceDiscoveryProperty.Builder =
      CfnVirtualNode.ServiceDiscoveryProperty.builder()

  /**
   * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
   */
  public fun awsCloudMap(awsCloudMap: IResolvable) {
    cdkBuilder.awsCloudMap(awsCloudMap)
  }

  /**
   * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
   */
  public fun awsCloudMap(awsCloudMap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
    cdkBuilder.awsCloudMap(awsCloudMap)
  }

  /**
   * @param dns Specifies the DNS information for the virtual node.
   */
  public fun dns(dns: IResolvable) {
    cdkBuilder.dns(dns)
  }

  /**
   * @param dns Specifies the DNS information for the virtual node.
   */
  public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
    cdkBuilder.dns(dns)
  }

  public fun build(): CfnVirtualNode.ServiceDiscoveryProperty = cdkBuilder.build()
}
