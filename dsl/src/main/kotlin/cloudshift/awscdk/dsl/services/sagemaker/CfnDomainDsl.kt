@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.constructs.Construct

@CdkDslMarker
public class CfnDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun appNetworkAccessType(appNetworkAccessType: String) {
    cdkBuilder.appNetworkAccessType(appNetworkAccessType)
  }

  public fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
    cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
  }

  public fun authMode(authMode: String) {
    cdkBuilder.authMode(authMode)
  }

  public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
    cdkBuilder.defaultSpaceSettings(defaultSpaceSettings)
  }

  public fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty) {
    cdkBuilder.defaultSpaceSettings(defaultSpaceSettings)
  }

  public fun defaultUserSettings(defaultUserSettings: IResolvable) {
    cdkBuilder.defaultUserSettings(defaultUserSettings)
  }

  public fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty) {
    cdkBuilder.defaultUserSettings(defaultUserSettings)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun domainSettings(domainSettings: IResolvable) {
    cdkBuilder.domainSettings(domainSettings)
  }

  public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty) {
    cdkBuilder.domainSettings(domainSettings)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
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

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnDomain {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
