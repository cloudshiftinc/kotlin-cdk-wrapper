@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnResolverRule
import software.constructs.Construct

@CdkDslMarker
public class CfnResolverRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolverRule.Builder = CfnResolverRule.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetIps: MutableList<Any> = mutableListOf()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resolverEndpointId(resolverEndpointId: String) {
    cdkBuilder.resolverEndpointId(resolverEndpointId)
  }

  public fun ruleType(ruleType: String) {
    cdkBuilder.ruleType(ruleType)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetIps(vararg targetIps: Any) {
    _targetIps.addAll(listOf(*targetIps))
  }

  public fun targetIps(targetIps: Collection<Any>) {
    _targetIps.addAll(targetIps)
  }

  public fun targetIps(targetIps: IResolvable) {
    cdkBuilder.targetIps(targetIps)
  }

  public fun build(): CfnResolverRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetIps.isNotEmpty()) cdkBuilder.targetIps(_targetIps)
    return cdkBuilder.build()
  }
}
