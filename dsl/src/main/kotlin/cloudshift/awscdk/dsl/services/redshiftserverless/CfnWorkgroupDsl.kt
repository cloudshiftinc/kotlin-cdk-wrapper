@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import software.constructs.Construct

@CdkDslMarker
public class CfnWorkgroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkgroup.Builder = CfnWorkgroup.Builder.create(scope, id)

  private val _configParameters: MutableList<Any> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun baseCapacity(baseCapacity: Number) {
    cdkBuilder.baseCapacity(baseCapacity)
  }

  public fun configParameters(vararg configParameters: Any) {
    _configParameters.addAll(listOf(*configParameters))
  }

  public fun configParameters(configParameters: Collection<Any>) {
    _configParameters.addAll(configParameters)
  }

  public fun configParameters(configParameters: IResolvable) {
    cdkBuilder.configParameters(configParameters)
  }

  public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
    cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
  }

  public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
    cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
  }

  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
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

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun workgroupName(workgroupName: String) {
    cdkBuilder.workgroupName(workgroupName)
  }

  public fun build(): CfnWorkgroup {
    if(_configParameters.isNotEmpty()) cdkBuilder.configParameters(_configParameters)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
