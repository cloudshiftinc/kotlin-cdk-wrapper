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
