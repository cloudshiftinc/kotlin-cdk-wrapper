@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.constructs.Construct

@CdkDslMarker
public class CfnImageBuilderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImageBuilder.Builder = CfnImageBuilder.Builder.create(scope, id)

  private val _accessEndpoints: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessEndpoints(vararg accessEndpoints: Any) {
    _accessEndpoints.addAll(listOf(*accessEndpoints))
  }

  public fun accessEndpoints(accessEndpoints: Collection<Any>) {
    _accessEndpoints.addAll(accessEndpoints)
  }

  public fun accessEndpoints(accessEndpoints: IResolvable) {
    cdkBuilder.accessEndpoints(accessEndpoints)
  }

  public fun appstreamAgentVersion(appstreamAgentVersion: String) {
    cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun domainJoinInfo(domainJoinInfo: IResolvable) {
    cdkBuilder.domainJoinInfo(domainJoinInfo)
  }

  public fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty) {
    cdkBuilder.domainJoinInfo(domainJoinInfo)
  }

  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
  }

  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
  }

  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun imageArn(imageArn: String) {
    cdkBuilder.imageArn(imageArn)
  }

  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnImageBuilder {
    if(_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
