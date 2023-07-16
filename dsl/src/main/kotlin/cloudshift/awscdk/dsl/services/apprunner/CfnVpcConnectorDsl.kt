@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.constructs.Construct

@CdkDslMarker
public class CfnVpcConnectorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVpcConnector.Builder = CfnVpcConnector.Builder.create(scope, id)

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcConnectorName(vpcConnectorName: String) {
    cdkBuilder.vpcConnectorName(vpcConnectorName)
  }

  public fun build(): CfnVpcConnector {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
