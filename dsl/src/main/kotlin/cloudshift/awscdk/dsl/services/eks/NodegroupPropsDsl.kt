@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.CapacityType
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.LaunchTemplateSpec
import software.amazon.awscdk.services.eks.NodegroupAmiType
import software.amazon.awscdk.services.eks.NodegroupProps
import software.amazon.awscdk.services.eks.NodegroupRemoteAccess
import software.amazon.awscdk.services.eks.TaintSpec
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class NodegroupPropsDsl {
  private val cdkBuilder: NodegroupProps.Builder = NodegroupProps.builder()

  private val _instanceTypes: MutableList<InstanceType> = mutableListOf()

  private val _taints: MutableList<TaintSpec> = mutableListOf()

  public fun amiType(amiType: NodegroupAmiType) {
    cdkBuilder.amiType(amiType)
  }

  public fun capacityType(capacityType: CapacityType) {
    cdkBuilder.capacityType(capacityType)
  }

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun desiredSize(desiredSize: Number) {
    cdkBuilder.desiredSize(desiredSize)
  }

  public fun diskSize(diskSize: Number) {
    cdkBuilder.diskSize(diskSize)
  }

  public fun forceUpdate(forceUpdate: Boolean) {
    cdkBuilder.forceUpdate(forceUpdate)
  }

  public fun instanceTypes(vararg instanceTypes: InstanceType) {
    _instanceTypes.addAll(listOf(*instanceTypes))
  }

  public fun instanceTypes(instanceTypes: Collection<InstanceType>) {
    _instanceTypes.addAll(instanceTypes)
  }

  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  public fun launchTemplateSpec(block: LaunchTemplateSpecDsl.() -> Unit = {}) {
    val builder = LaunchTemplateSpecDsl()
    builder.apply(block)
    cdkBuilder.launchTemplateSpec(builder.build())
  }

  public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
    cdkBuilder.launchTemplateSpec(launchTemplateSpec)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun nodeRole(nodeRole: IRole) {
    cdkBuilder.nodeRole(nodeRole)
  }

  public fun nodegroupName(nodegroupName: String) {
    cdkBuilder.nodegroupName(nodegroupName)
  }

  public fun releaseVersion(releaseVersion: String) {
    cdkBuilder.releaseVersion(releaseVersion)
  }

  public fun remoteAccess(block: NodegroupRemoteAccessDsl.() -> Unit = {}) {
    val builder = NodegroupRemoteAccessDsl()
    builder.apply(block)
    cdkBuilder.remoteAccess(builder.build())
  }

  public fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
    cdkBuilder.remoteAccess(remoteAccess)
  }

  public fun subnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.subnets(builder.build())
  }

  public fun subnets(subnets: SubnetSelection) {
    cdkBuilder.subnets(subnets)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun taints(taints: TaintSpecDsl.() -> Unit) {
    _taints.add(TaintSpecDsl().apply(taints).build())
  }

  public fun taints(taints: Collection<TaintSpec>) {
    _taints.addAll(taints)
  }

  public fun build(): NodegroupProps {
    if(_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
    if(_taints.isNotEmpty()) cdkBuilder.taints(_taints)
    return cdkBuilder.build()
  }
}
