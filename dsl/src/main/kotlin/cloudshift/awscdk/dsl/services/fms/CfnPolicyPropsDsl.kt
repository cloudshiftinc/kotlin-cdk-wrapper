@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fms.CfnPolicy
import software.amazon.awscdk.services.fms.CfnPolicyProps

@CdkDslMarker
public class CfnPolicyPropsDsl {
  private val cdkBuilder: CfnPolicyProps.Builder = CfnPolicyProps.builder()

  private val _resourceSetIds: MutableList<String> = mutableListOf()

  private val _resourceTags: MutableList<Any> = mutableListOf()

  private val _resourceTypeList: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnPolicy.PolicyTagProperty> = mutableListOf()

  public fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean) {
    cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources)
  }

  public fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable) {
    cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources)
  }

  public fun excludeMap(excludeMap: IResolvable) {
    cdkBuilder.excludeMap(excludeMap)
  }

  public fun excludeMap(excludeMap: CfnPolicy.IEMapProperty) {
    cdkBuilder.excludeMap(excludeMap)
  }

  public fun excludeResourceTags(excludeResourceTags: Boolean) {
    cdkBuilder.excludeResourceTags(excludeResourceTags)
  }

  public fun excludeResourceTags(excludeResourceTags: IResolvable) {
    cdkBuilder.excludeResourceTags(excludeResourceTags)
  }

  public fun includeMap(includeMap: IResolvable) {
    cdkBuilder.includeMap(includeMap)
  }

  public fun includeMap(includeMap: CfnPolicy.IEMapProperty) {
    cdkBuilder.includeMap(includeMap)
  }

  public fun policyDescription(policyDescription: String) {
    cdkBuilder.policyDescription(policyDescription)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun remediationEnabled(remediationEnabled: Boolean) {
    cdkBuilder.remediationEnabled(remediationEnabled)
  }

  public fun remediationEnabled(remediationEnabled: IResolvable) {
    cdkBuilder.remediationEnabled(remediationEnabled)
  }

  public fun resourceSetIds(vararg resourceSetIds: String) {
    _resourceSetIds.addAll(listOf(*resourceSetIds))
  }

  public fun resourceSetIds(resourceSetIds: Collection<String>) {
    _resourceSetIds.addAll(resourceSetIds)
  }

  public fun resourceTags(vararg resourceTags: Any) {
    _resourceTags.addAll(listOf(*resourceTags))
  }

  public fun resourceTags(resourceTags: Collection<Any>) {
    _resourceTags.addAll(resourceTags)
  }

  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun resourceTypeList(vararg resourceTypeList: String) {
    _resourceTypeList.addAll(listOf(*resourceTypeList))
  }

  public fun resourceTypeList(resourceTypeList: Collection<String>) {
    _resourceTypeList.addAll(resourceTypeList)
  }

  public fun resourcesCleanUp(resourcesCleanUp: Boolean) {
    cdkBuilder.resourcesCleanUp(resourcesCleanUp)
  }

  public fun resourcesCleanUp(resourcesCleanUp: IResolvable) {
    cdkBuilder.resourcesCleanUp(resourcesCleanUp)
  }

  public fun securityServicePolicyData(securityServicePolicyData: IResolvable) {
    cdkBuilder.securityServicePolicyData(securityServicePolicyData)
  }

  public
      fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty) {
    cdkBuilder.securityServicePolicyData(securityServicePolicyData)
  }

  public fun tags(tags: CfnPolicyPolicyTagPropertyDsl.() -> Unit) {
    _tags.add(CfnPolicyPolicyTagPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnPolicy.PolicyTagProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPolicyProps {
    if(_resourceSetIds.isNotEmpty()) cdkBuilder.resourceSetIds(_resourceSetIds)
    if(_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
    if(_resourceTypeList.isNotEmpty()) cdkBuilder.resourceTypeList(_resourceTypeList)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
