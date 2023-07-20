@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentComputeResourcesPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.ComputeResourcesProperty.Builder =
      CfnComputeEnvironment.ComputeResourcesProperty.builder()

  private val _ec2Configuration: MutableList<Any> = mutableListOf()

  private val _instanceTypes: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  public fun bidPercentage(bidPercentage: Number) {
    cdkBuilder.bidPercentage(bidPercentage)
  }

  public fun desiredvCpus(desiredvCpus: Number) {
    cdkBuilder.desiredvCpus(desiredvCpus)
  }

  public fun ec2Configuration(vararg ec2Configuration: Any) {
    _ec2Configuration.addAll(listOf(*ec2Configuration))
  }

  public fun ec2Configuration(ec2Configuration: Collection<Any>) {
    _ec2Configuration.addAll(ec2Configuration)
  }

  public fun ec2Configuration(ec2Configuration: IResolvable) {
    cdkBuilder.ec2Configuration(ec2Configuration)
  }

  public fun ec2KeyPair(ec2KeyPair: String) {
    cdkBuilder.ec2KeyPair(ec2KeyPair)
  }

  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  public fun instanceRole(instanceRole: String) {
    cdkBuilder.instanceRole(instanceRole)
  }

  public fun instanceTypes(vararg instanceTypes: String) {
    _instanceTypes.addAll(listOf(*instanceTypes))
  }

  public fun instanceTypes(instanceTypes: Collection<String>) {
    _instanceTypes.addAll(instanceTypes)
  }

  public fun launchTemplate(launchTemplate: IResolvable) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public
      fun launchTemplate(launchTemplate: CfnComputeEnvironment.LaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public fun maxvCpus(maxvCpus: Number) {
    cdkBuilder.maxvCpus(maxvCpus)
  }

  public fun minvCpus(minvCpus: Number) {
    cdkBuilder.minvCpus(minvCpus)
  }

  public fun placementGroup(placementGroup: String) {
    cdkBuilder.placementGroup(placementGroup)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun spotIamFleetRole(spotIamFleetRole: String) {
    cdkBuilder.spotIamFleetRole(spotIamFleetRole)
  }

  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
    cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
  }

  public fun updateToLatestImageVersion(updateToLatestImageVersion: IResolvable) {
    cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
  }

  public fun build(): CfnComputeEnvironment.ComputeResourcesProperty {
    if(_ec2Configuration.isNotEmpty()) cdkBuilder.ec2Configuration(_ec2Configuration)
    if(_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
