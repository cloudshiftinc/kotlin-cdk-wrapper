@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.emr.CfnStudioProps

@CdkDslMarker
public class CfnStudioPropsDsl {
  private val cdkBuilder: CfnStudioProps.Builder = CfnStudioProps.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun authMode(authMode: String) {
    cdkBuilder.authMode(authMode)
  }

  public fun defaultS3Location(defaultS3Location: String) {
    cdkBuilder.defaultS3Location(defaultS3Location)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun engineSecurityGroupId(engineSecurityGroupId: String) {
    cdkBuilder.engineSecurityGroupId(engineSecurityGroupId)
  }

  public fun idpAuthUrl(idpAuthUrl: String) {
    cdkBuilder.idpAuthUrl(idpAuthUrl)
  }

  public fun idpRelayStateParameterName(idpRelayStateParameterName: String) {
    cdkBuilder.idpRelayStateParameterName(idpRelayStateParameterName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
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

  public fun userRole(userRole: String) {
    cdkBuilder.userRole(userRole)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String) {
    cdkBuilder.workspaceSecurityGroupId(workspaceSecurityGroupId)
  }

  public fun build(): CfnStudioProps {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
