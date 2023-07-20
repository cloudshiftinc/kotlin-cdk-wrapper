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
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps

@CdkDslMarker
public class CfnResolverEndpointPropsDsl {
  private val cdkBuilder: CfnResolverEndpointProps.Builder = CfnResolverEndpointProps.builder()

  private val _ipAddresses: MutableList<Any> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  public fun ipAddresses(vararg ipAddresses: Any) {
    _ipAddresses.addAll(listOf(*ipAddresses))
  }

  public fun ipAddresses(ipAddresses: Collection<Any>) {
    _ipAddresses.addAll(ipAddresses)
  }

  public fun ipAddresses(ipAddresses: IResolvable) {
    cdkBuilder.ipAddresses(ipAddresses)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outpostArn(outpostArn: String) {
    cdkBuilder.outpostArn(outpostArn)
  }

  public fun preferredInstanceType(preferredInstanceType: String) {
    cdkBuilder.preferredInstanceType(preferredInstanceType)
  }

  public fun resolverEndpointType(resolverEndpointType: String) {
    cdkBuilder.resolverEndpointType(resolverEndpointType)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnResolverEndpointProps {
    if(_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
