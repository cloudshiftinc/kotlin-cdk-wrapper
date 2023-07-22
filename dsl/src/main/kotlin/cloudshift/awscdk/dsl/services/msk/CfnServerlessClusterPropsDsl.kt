@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.amazon.awscdk.services.msk.CfnServerlessClusterProps

/**
 * Properties for defining a `CfnServerlessCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnServerlessClusterProps cfnServerlessClusterProps = CfnServerlessClusterProps.builder()
 * .clientAuthentication(ClientAuthenticationProperty.builder()
 * .sasl(SaslProperty.builder()
 * .iam(IamProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build())
 * .clusterName("clusterName")
 * .vpcConfigs(List.of(VpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroups(List.of("securityGroups"))
 * .build()))
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html)
 */
@CdkDslMarker
public class CfnServerlessClusterPropsDsl {
  private val cdkBuilder: CfnServerlessClusterProps.Builder = CfnServerlessClusterProps.builder()

  private val _vpcConfigs: MutableList<Any> = mutableListOf()

  /**
   * @param clientAuthentication the value to be set. 
   */
  public fun clientAuthentication(clientAuthentication: IResolvable) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * @param clientAuthentication the value to be set. 
   */
  public
      fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * @param clusterName the value to be set. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param tags A key-value pair to associate with a resource.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param vpcConfigs the value to be set. 
   */
  public fun vpcConfigs(vararg vpcConfigs: Any) {
    _vpcConfigs.addAll(listOf(*vpcConfigs))
  }

  /**
   * @param vpcConfigs the value to be set. 
   */
  public fun vpcConfigs(vpcConfigs: Collection<Any>) {
    _vpcConfigs.addAll(vpcConfigs)
  }

  /**
   * @param vpcConfigs the value to be set. 
   */
  public fun vpcConfigs(vpcConfigs: IResolvable) {
    cdkBuilder.vpcConfigs(vpcConfigs)
  }

  public fun build(): CfnServerlessClusterProps {
    if(_vpcConfigs.isNotEmpty()) cdkBuilder.vpcConfigs(_vpcConfigs)
    return cdkBuilder.build()
  }
}
