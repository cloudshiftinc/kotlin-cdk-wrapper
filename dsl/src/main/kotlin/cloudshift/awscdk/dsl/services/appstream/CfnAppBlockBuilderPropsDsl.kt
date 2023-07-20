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
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps

@CdkDslMarker
public class CfnAppBlockBuilderPropsDsl {
  private val cdkBuilder: CfnAppBlockBuilderProps.Builder = CfnAppBlockBuilderProps.builder()

  private val _accessEndpoints: MutableList<Any> = mutableListOf()

  private val _appBlockArns: MutableList<String> = mutableListOf()

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

  public fun appBlockArns(vararg appBlockArns: String) {
    _appBlockArns.addAll(listOf(*appBlockArns))
  }

  public fun appBlockArns(appBlockArns: Collection<String>) {
    _appBlockArns.addAll(appBlockArns)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
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

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
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

  public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnAppBlockBuilderProps {
    if(_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
    if(_appBlockArns.isNotEmpty()) cdkBuilder.appBlockArns(_appBlockArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
