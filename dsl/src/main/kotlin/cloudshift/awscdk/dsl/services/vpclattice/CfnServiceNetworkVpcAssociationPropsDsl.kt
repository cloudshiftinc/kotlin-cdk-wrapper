@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps

@CdkDslMarker
public class CfnServiceNetworkVpcAssociationPropsDsl {
  private val cdkBuilder: CfnServiceNetworkVpcAssociationProps.Builder =
      CfnServiceNetworkVpcAssociationProps.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
    cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcIdentifier(vpcIdentifier: String) {
    cdkBuilder.vpcIdentifier(vpcIdentifier)
  }

  public fun build(): CfnServiceNetworkVpcAssociationProps {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
