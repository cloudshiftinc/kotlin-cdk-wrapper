@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityGroup.Builder = CfnSecurityGroup.Builder.create(scope, id)

  private val _securityGroupEgress: MutableList<Any> = mutableListOf()

  private val _securityGroupIngress: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun groupDescription(groupDescription: String) {
    cdkBuilder.groupDescription(groupDescription)
  }

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun securityGroupEgress(vararg securityGroupEgress: Any) {
    _securityGroupEgress.addAll(listOf(*securityGroupEgress))
  }

  public fun securityGroupEgress(securityGroupEgress: Collection<Any>) {
    _securityGroupEgress.addAll(securityGroupEgress)
  }

  public fun securityGroupEgress(securityGroupEgress: IResolvable) {
    cdkBuilder.securityGroupEgress(securityGroupEgress)
  }

  public fun securityGroupIngress(vararg securityGroupIngress: Any) {
    _securityGroupIngress.addAll(listOf(*securityGroupIngress))
  }

  public fun securityGroupIngress(securityGroupIngress: Collection<Any>) {
    _securityGroupIngress.addAll(securityGroupIngress)
  }

  public fun securityGroupIngress(securityGroupIngress: IResolvable) {
    cdkBuilder.securityGroupIngress(securityGroupIngress)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnSecurityGroup {
    if(_securityGroupEgress.isNotEmpty()) cdkBuilder.securityGroupEgress(_securityGroupEgress)
    if(_securityGroupIngress.isNotEmpty()) cdkBuilder.securityGroupIngress(_securityGroupIngress)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
