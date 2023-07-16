@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import software.constructs.Construct

@CdkDslMarker
public class CfnEndpointAccessDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEndpointAccess.Builder = CfnEndpointAccess.Builder.create(scope, id)

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun resourceOwner(resourceOwner: String) {
    cdkBuilder.resourceOwner(resourceOwner)
  }

  public fun subnetGroupName(subnetGroupName: String) {
    cdkBuilder.subnetGroupName(subnetGroupName)
  }

  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnEndpointAccess {
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
