@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnVpcConnectionProps

@CdkDslMarker
public class CfnVpcConnectionPropsDsl {
  private val cdkBuilder: CfnVpcConnectionProps.Builder = CfnVpcConnectionProps.builder()

  private val _clientSubnets: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  public fun authentication(authentication: String) {
    cdkBuilder.authentication(authentication)
  }

  public fun clientSubnets(vararg clientSubnets: String) {
    _clientSubnets.addAll(listOf(*clientSubnets))
  }

  public fun clientSubnets(clientSubnets: Collection<String>) {
    _clientSubnets.addAll(clientSubnets)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun targetClusterArn(targetClusterArn: String) {
    cdkBuilder.targetClusterArn(targetClusterArn)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVpcConnectionProps {
    if(_clientSubnets.isNotEmpty()) cdkBuilder.clientSubnets(_clientSubnets)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
