@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLink
import software.constructs.Construct

@CdkDslMarker
public class CfnVpcLinkDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVpcLink.Builder = CfnVpcLink.Builder.create(scope, id)

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnVpcLink {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
