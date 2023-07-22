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
import software.amazon.awscdk.services.eks.LaunchTemplateSpec
import software.amazon.awscdk.services.eks.NodegroupAmiType
import software.amazon.awscdk.services.eks.NodegroupOptions
import software.amazon.awscdk.services.eks.NodegroupRemoteAccess
import software.amazon.awscdk.services.eks.TaintSpec
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class NodegroupOptionsDsl {
  private val cdkBuilder: NodegroupOptions.Builder = NodegroupOptions.builder()

  private val _instanceTypes: MutableList<InstanceType> = mutableListOf()

  private val _taints: MutableList<TaintSpec> = mutableListOf()

  /**
   * @param amiType The AMI type for your node group.
   * If you explicitly specify the launchTemplate with custom AMI, do not specify this property, or
   * the node group deployment will fail. In other cases, you will need to specify correct amiType
   * for the nodegroup.
   */
  public fun amiType(amiType: NodegroupAmiType) {
    cdkBuilder.amiType(amiType)
  }

  /**
   * @param capacityType The capacity type of the nodegroup.
   */
  public fun capacityType(capacityType: CapacityType) {
    cdkBuilder.capacityType(capacityType)
  }

  /**
   * @param desiredSize The current number of worker nodes that the managed node group should
   * maintain.
   * If not specified,
   * the nodewgroup will initially create `minSize` instances.
   */
  public fun desiredSize(desiredSize: Number) {
    cdkBuilder.desiredSize(desiredSize)
  }

  /**
   * @param diskSize The root device disk size (in GiB) for your node group instances.
   */
  public fun diskSize(diskSize: Number) {
    cdkBuilder.diskSize(diskSize)
  }

  /**
   * @param forceUpdate Force the update if the existing node group's pods are unable to be drained
   * due to a pod disruption budget issue.
   * If an update fails because pods could not be drained, you can force the update after it fails
   * to terminate the old
   * node whether or not any pods are
   * running on the node.
   */
  public fun forceUpdate(forceUpdate: Boolean) {
    cdkBuilder.forceUpdate(forceUpdate)
  }

  /**
   * @param instanceTypes The instance types to use for your node group.
   */
  public fun instanceTypes(vararg instanceTypes: InstanceType) {
    _instanceTypes.addAll(listOf(*instanceTypes))
  }

  /**
   * @param instanceTypes The instance types to use for your node group.
   */
  public fun instanceTypes(instanceTypes: Collection<InstanceType>) {
    _instanceTypes.addAll(instanceTypes)
  }

  /**
   * @param labels The Kubernetes labels to be applied to the nodes in the node group when they are
   * created.
   */
  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param launchTemplateSpec Launch template specification used for the nodegroup.
   */
  public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpecDsl.() -> Unit = {}) {
    val builder = LaunchTemplateSpecDsl()
    builder.apply(launchTemplateSpec)
    cdkBuilder.launchTemplateSpec(builder.build())
  }

  /**
   * @param launchTemplateSpec Launch template specification used for the nodegroup.
   */
  public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
    cdkBuilder.launchTemplateSpec(launchTemplateSpec)
  }

  /**
   * @param maxSize The maximum number of worker nodes that the managed node group can scale out to.
   * Managed node groups can support up to 100 nodes by default.
   */
  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  /**
   * @param minSize The minimum number of worker nodes that the managed node group can scale in to.
   * This number must be greater than or equal to zero.
   */
  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  /**
   * @param nodeRole The IAM role to associate with your node group.
   * The Amazon EKS worker node kubelet daemon
   * makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls
   * through
   * an IAM instance profile and associated policies. Before you can launch worker nodes and
   * register them
   * into a cluster, you must create an IAM role for those worker nodes to use when they are
   * launched.
   */
  public fun nodeRole(nodeRole: IRole) {
    cdkBuilder.nodeRole(nodeRole)
  }

  /**
   * @param nodegroupName Name of the Nodegroup.
   */
  public fun nodegroupName(nodegroupName: String) {
    cdkBuilder.nodegroupName(nodegroupName)
  }

  /**
   * @param releaseVersion The AMI version of the Amazon EKS-optimized AMI to use with your node
   * group (for example, `1.14.7-YYYYMMDD`).
   */
  public fun releaseVersion(releaseVersion: String) {
    cdkBuilder.releaseVersion(releaseVersion)
  }

  /**
   * @param remoteAccess The remote access (SSH) configuration to use with your node group.
   * Disabled by default, however, if you
   * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
   * managed node group,
   * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
   */
  public fun remoteAccess(remoteAccess: NodegroupRemoteAccessDsl.() -> Unit = {}) {
    val builder = NodegroupRemoteAccessDsl()
    builder.apply(remoteAccess)
    cdkBuilder.remoteAccess(builder.build())
  }

  /**
   * @param remoteAccess The remote access (SSH) configuration to use with your node group.
   * Disabled by default, however, if you
   * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
   * managed node group,
   * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
   */
  public fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
    cdkBuilder.remoteAccess(remoteAccess)
  }

  /**
   * @param subnets The subnets to use for the Auto Scaling group that is created for your node
   * group.
   * By specifying the
   * SubnetSelection, the selected subnets will automatically apply required tags i.e.
   * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is replaced
   * with
   * the name of your cluster.
   */
  public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnets)
    cdkBuilder.subnets(builder.build())
  }

  /**
   * @param subnets The subnets to use for the Auto Scaling group that is created for your node
   * group.
   * By specifying the
   * SubnetSelection, the selected subnets will automatically apply required tags i.e.
   * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is replaced
   * with
   * the name of your cluster.
   */
  public fun subnets(subnets: SubnetSelection) {
    cdkBuilder.subnets(subnets)
  }

  /**
   * @param tags The metadata to apply to the node group to assist with categorization and
   * organization.
   * Each tag consists of
   * a key and an optional value, both of which you define. Node group tags do not propagate to any
   * other resources
   * associated with the node group, such as the Amazon EC2 instances or subnets.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param taints The Kubernetes taints to be applied to the nodes in the node group when they are
   * created.
   */
  public fun taints(taints: TaintSpecDsl.() -> Unit) {
    _taints.add(TaintSpecDsl().apply(taints).build())
  }

  /**
   * @param taints The Kubernetes taints to be applied to the nodes in the node group when they are
   * created.
   */
  public fun taints(taints: Collection<TaintSpec>) {
    _taints.addAll(taints)
  }

  public fun build(): NodegroupOptions {
    if(_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
    if(_taints.isNotEmpty()) cdkBuilder.taints(_taints)
    return cdkBuilder.build()
  }
}
