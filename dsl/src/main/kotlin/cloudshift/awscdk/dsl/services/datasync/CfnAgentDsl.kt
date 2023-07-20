@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnAgent
import software.constructs.Construct

@CdkDslMarker
public class CfnAgentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAgent.Builder = CfnAgent.Builder.create(scope, id)

  private val _securityGroupArns: MutableList<String> = mutableListOf()

  private val _subnetArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun activationKey(activationKey: String) {
    cdkBuilder.activationKey(activationKey)
  }

  public fun agentName(agentName: String) {
    cdkBuilder.agentName(agentName)
  }

  public fun securityGroupArns(vararg securityGroupArns: String) {
    _securityGroupArns.addAll(listOf(*securityGroupArns))
  }

  public fun securityGroupArns(securityGroupArns: Collection<String>) {
    _securityGroupArns.addAll(securityGroupArns)
  }

  public fun subnetArns(vararg subnetArns: String) {
    _subnetArns.addAll(listOf(*subnetArns))
  }

  public fun subnetArns(subnetArns: Collection<String>) {
    _subnetArns.addAll(subnetArns)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  public fun build(): CfnAgent {
    if(_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
    if(_subnetArns.isNotEmpty()) cdkBuilder.subnetArns(_subnetArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
