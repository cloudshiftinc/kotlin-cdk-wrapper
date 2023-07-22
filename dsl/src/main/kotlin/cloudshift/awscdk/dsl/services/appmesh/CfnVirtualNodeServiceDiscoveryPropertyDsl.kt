@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the service discovery information for a virtual node.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ServiceDiscoveryProperty serviceDiscoveryProperty = ServiceDiscoveryProperty.builder()
 * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
 * .namespaceName("namespaceName")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .ipPreference("ipPreference")
 * .build())
 * .dns(DnsServiceDiscoveryProperty.builder()
 * .hostname("hostname")
 * // the properties below are optional
 * .ipPreference("ipPreference")
 * .responseType("responseType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html)
 */
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
