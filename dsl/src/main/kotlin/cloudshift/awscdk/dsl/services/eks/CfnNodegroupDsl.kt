@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.constructs.Construct

@CdkDslMarker
public class CfnNodegroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNodegroup.Builder = CfnNodegroup.Builder.create(scope, id)

  private val _instanceTypes: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _taints: MutableList<Any> = mutableListOf()

  public fun amiType(amiType: String) {
    cdkBuilder.amiType(amiType)
  }

  public fun capacityType(capacityType: String) {
    cdkBuilder.capacityType(capacityType)
  }

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun diskSize(diskSize: Number) {
    cdkBuilder.diskSize(diskSize)
  }

  public fun forceUpdateEnabled(forceUpdateEnabled: Boolean) {
    cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
  }

  public fun forceUpdateEnabled(forceUpdateEnabled: IResolvable) {
    cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
  }

  public fun instanceTypes(vararg instanceTypes: String) {
    _instanceTypes.addAll(listOf(*instanceTypes))
  }

  public fun instanceTypes(instanceTypes: Collection<String>) {
    _instanceTypes.addAll(instanceTypes)
  }

  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  public fun labels(labels: IResolvable) {
    cdkBuilder.labels(labels)
  }

  public fun launchTemplate(launchTemplate: IResolvable) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public fun nodeRole(nodeRole: String) {
    cdkBuilder.nodeRole(nodeRole)
  }

  public fun nodegroupName(nodegroupName: String) {
    cdkBuilder.nodegroupName(nodegroupName)
  }

  public fun releaseVersion(releaseVersion: String) {
    cdkBuilder.releaseVersion(releaseVersion)
  }

  public fun remoteAccess(remoteAccess: IResolvable) {
    cdkBuilder.remoteAccess(remoteAccess)
  }

  public fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty) {
    cdkBuilder.remoteAccess(remoteAccess)
  }

  public fun scalingConfig(scalingConfig: IResolvable) {
    cdkBuilder.scalingConfig(scalingConfig)
  }

  public fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty) {
    cdkBuilder.scalingConfig(scalingConfig)
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

  public fun taints(vararg taints: Any) {
    _taints.addAll(listOf(*taints))
  }

  public fun taints(taints: Collection<Any>) {
    _taints.addAll(taints)
  }

  public fun taints(taints: IResolvable) {
    cdkBuilder.taints(taints)
  }

  public fun updateConfig(updateConfig: IResolvable) {
    cdkBuilder.updateConfig(updateConfig)
  }

  public fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty) {
    cdkBuilder.updateConfig(updateConfig)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnNodegroup {
    if(_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    if(_taints.isNotEmpty()) cdkBuilder.taints(_taints)
    return cdkBuilder.build()
  }
}
