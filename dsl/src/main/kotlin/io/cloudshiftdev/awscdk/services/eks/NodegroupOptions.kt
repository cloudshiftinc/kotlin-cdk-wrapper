package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface NodegroupOptions {
  /**
   * The AMI type for your node group.
   *
   * If you explicitly specify the launchTemplate with custom AMI, do not specify this property, or
   * the node group deployment will fail. In other cases, you will need to specify correct amiType
   * for the nodegroup.
   *
   * Default: - auto-determined from the instanceTypes property when launchTemplateSpec property is
   * not specified
   */
  public fun amiType(): NodegroupAmiType? = unwrap(this).getAmiType()?.let(NodegroupAmiType::wrap)

  /**
   * The capacity type of the nodegroup.
   *
   * Default: - ON_DEMAND
   */
  public fun capacityType(): CapacityType? = unwrap(this).getCapacityType()?.let(CapacityType::wrap)

  /**
   * The current number of worker nodes that the managed node group should maintain.
   *
   * If not specified,
   * the nodewgroup will initially create `minSize` instances.
   *
   * Default: 2
   */
  public fun desiredSize(): Number? = unwrap(this).getDesiredSize()

  /**
   * The root device disk size (in GiB) for your node group instances.
   *
   * Default: 20
   */
  public fun diskSize(): Number? = unwrap(this).getDiskSize()

  /**
   * Force the update if the existing node group's pods are unable to be drained due to a pod
   * disruption budget issue.
   *
   * If an update fails because pods could not be drained, you can force the update after it fails
   * to terminate the old
   * node whether or not any pods are
   * running on the node.
   *
   * Default: true
   */
  public fun forceUpdate(): Boolean? = unwrap(this).getForceUpdate()

  /**
   * The instance types to use for your node group.
   *
   * Default: t3.medium will be used according to the cloudformation document.
   *
   * [Documentation]( -
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
   */
  public fun instanceTypes(): List<InstanceType> =
      unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

  /**
   * The Kubernetes labels to be applied to the nodes in the node group when they are created.
   *
   * Default: - None
   */
  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  /**
   * Launch template specification used for the nodegroup.
   *
   * Default: - no launch template
   *
   * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
   */
  public fun launchTemplateSpec(): LaunchTemplateSpec? =
      unwrap(this).getLaunchTemplateSpec()?.let(LaunchTemplateSpec::wrap)

  /**
   * The maximum number of worker nodes that the managed node group can scale out to.
   *
   * Managed node groups can support up to 100 nodes by default.
   *
   * Default: - desiredSize
   */
  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The maximum number of nodes unavailable at once during a version update.
   *
   * Nodes will be updated in parallel. The maximum number is 100.
   *
   * This value or `maxUnavailablePercentage` is required to have a value for custom update
   * configurations to be applied.
   *
   * Default: 1
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailable)
   */
  public fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

  /**
   * The maximum percentage of nodes unavailable during a version update.
   *
   * This percentage of nodes will be updated in parallel, up to 100 nodes at once.
   *
   * This value or `maxUnavailable` is required to have a value for custom update configurations to
   * be applied.
   *
   * Default: undefined - node groups will update instances one at a time
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailablepercentage)
   */
  public fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()

  /**
   * The minimum number of worker nodes that the managed node group can scale in to.
   *
   * This number must be greater than or equal to zero.
   *
   * Default: 1
   */
  public fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * The IAM role to associate with your node group.
   *
   * The Amazon EKS worker node kubelet daemon
   * makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls
   * through
   * an IAM instance profile and associated policies. Before you can launch worker nodes and
   * register them
   * into a cluster, you must create an IAM role for those worker nodes to use when they are
   * launched.
   *
   * Default: - None. Auto-generated if not specified.
   */
  public fun nodeRole(): IRole? = unwrap(this).getNodeRole()?.let(IRole::wrap)

  /**
   * Name of the Nodegroup.
   *
   * Default: - resource ID
   */
  public fun nodegroupName(): String? = unwrap(this).getNodegroupName()

  /**
   * The AMI version of the Amazon EKS-optimized AMI to use with your node group (for example,
   * `1.14.7-YYYYMMDD`).
   *
   * Default: - The latest available AMI version for the node group's current Kubernetes version is
   * used.
   */
  public fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

  /**
   * The remote access (SSH) configuration to use with your node group.
   *
   * Disabled by default, however, if you
   * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
   * managed node group,
   * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
   *
   * Default: - disabled
   */
  public fun remoteAccess(): NodegroupRemoteAccess? =
      unwrap(this).getRemoteAccess()?.let(NodegroupRemoteAccess::wrap)

  /**
   * The subnets to use for the Auto Scaling group that is created for your node group.
   *
   * By specifying the
   * SubnetSelection, the selected subnets will automatically apply required tags i.e.
   * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is replaced
   * with
   * the name of your cluster.
   *
   * Default: - private subnets
   */
  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  /**
   * The metadata to apply to the node group to assist with categorization and organization.
   *
   * Each tag consists of
   * a key and an optional value, both of which you define. Node group tags do not propagate to any
   * other resources
   * associated with the node group, such as the Amazon EC2 instances or subnets.
   *
   * Default: - None
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The Kubernetes taints to be applied to the nodes in the node group when they are created.
   *
   * Default: - None
   */
  public fun taints(): List<TaintSpec> = unwrap(this).getTaints()?.map(TaintSpec::wrap) ?:
      emptyList()

  /**
   * A builder for [NodegroupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amiType The AMI type for your node group.
     * If you explicitly specify the launchTemplate with custom AMI, do not specify this property,
     * or
     * the node group deployment will fail. In other cases, you will need to specify correct amiType
     * for the nodegroup.
     */
    public fun amiType(amiType: NodegroupAmiType)

    /**
     * @param capacityType The capacity type of the nodegroup.
     */
    public fun capacityType(capacityType: CapacityType)

    /**
     * @param desiredSize The current number of worker nodes that the managed node group should
     * maintain.
     * If not specified,
     * the nodewgroup will initially create `minSize` instances.
     */
    public fun desiredSize(desiredSize: Number)

    /**
     * @param diskSize The root device disk size (in GiB) for your node group instances.
     */
    public fun diskSize(diskSize: Number)

    /**
     * @param forceUpdate Force the update if the existing node group's pods are unable to be
     * drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails
     * to terminate the old
     * node whether or not any pods are
     * running on the node.
     */
    public fun forceUpdate(forceUpdate: Boolean)

    /**
     * @param instanceTypes The instance types to use for your node group.
     */
    public fun instanceTypes(instanceTypes: List<InstanceType>)

    /**
     * @param instanceTypes The instance types to use for your node group.
     */
    public fun instanceTypes(vararg instanceTypes: InstanceType)

    /**
     * @param labels The Kubernetes labels to be applied to the nodes in the node group when they
     * are created.
     */
    public fun labels(labels: Map<String, String>)

    /**
     * @param launchTemplateSpec Launch template specification used for the nodegroup.
     */
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec)

    /**
     * @param launchTemplateSpec Launch template specification used for the nodegroup.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0e8b2f2dc3405f67a3cd7b21e4833e4e2c73a9564c2179aeab53d1807472b1f")
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit)

    /**
     * @param maxSize The maximum number of worker nodes that the managed node group can scale out
     * to.
     * Managed node groups can support up to 100 nodes by default.
     */
    public fun maxSize(maxSize: Number)

    /**
     * @param maxUnavailable The maximum number of nodes unavailable at once during a version
     * update.
     * Nodes will be updated in parallel. The maximum number is 100.
     *
     * This value or `maxUnavailablePercentage` is required to have a value for custom update
     * configurations to be applied.
     */
    public fun maxUnavailable(maxUnavailable: Number)

    /**
     * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a version
     * update.
     * This percentage of nodes will be updated in parallel, up to 100 nodes at once.
     *
     * This value or `maxUnavailable` is required to have a value for custom update configurations
     * to be applied.
     */
    public fun maxUnavailablePercentage(maxUnavailablePercentage: Number)

    /**
     * @param minSize The minimum number of worker nodes that the managed node group can scale in
     * to.
     * This number must be greater than or equal to zero.
     */
    public fun minSize(minSize: Number)

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
    public fun nodeRole(nodeRole: IRole)

    /**
     * @param nodegroupName Name of the Nodegroup.
     */
    public fun nodegroupName(nodegroupName: String)

    /**
     * @param releaseVersion The AMI version of the Amazon EKS-optimized AMI to use with your node
     * group (for example, `1.14.7-YYYYMMDD`).
     */
    public fun releaseVersion(releaseVersion: String)

    /**
     * @param remoteAccess The remote access (SSH) configuration to use with your node group.
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     */
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess)

    /**
     * @param remoteAccess The remote access (SSH) configuration to use with your node group.
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aab14c8127f28641dca0351541b634eaa4cefe76d2a52b4211aee6cf249310f0")
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit)

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group.
     * By specifying the
     * SubnetSelection, the selected subnets will automatically apply required tags i.e.
     * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is
     * replaced with
     * the name of your cluster.
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group.
     * By specifying the
     * SubnetSelection, the selected subnets will automatically apply required tags i.e.
     * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is
     * replaced with
     * the name of your cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad32f602f50066d331d71a96a83719c01828628afe15012a768997ca8fc9f6ae")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param tags The metadata to apply to the node group to assist with categorization and
     * organization.
     * Each tag consists of
     * a key and an optional value, both of which you define. Node group tags do not propagate to
     * any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     */
    public fun taints(taints: List<TaintSpec>)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     */
    public fun taints(vararg taints: TaintSpec)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.NodegroupOptions.Builder =
        software.amazon.awscdk.services.eks.NodegroupOptions.builder()

    /**
     * @param amiType The AMI type for your node group.
     * If you explicitly specify the launchTemplate with custom AMI, do not specify this property,
     * or
     * the node group deployment will fail. In other cases, you will need to specify correct amiType
     * for the nodegroup.
     */
    override fun amiType(amiType: NodegroupAmiType) {
      cdkBuilder.amiType(amiType.let(NodegroupAmiType::unwrap))
    }

    /**
     * @param capacityType The capacity type of the nodegroup.
     */
    override fun capacityType(capacityType: CapacityType) {
      cdkBuilder.capacityType(capacityType.let(CapacityType::unwrap))
    }

    /**
     * @param desiredSize The current number of worker nodes that the managed node group should
     * maintain.
     * If not specified,
     * the nodewgroup will initially create `minSize` instances.
     */
    override fun desiredSize(desiredSize: Number) {
      cdkBuilder.desiredSize(desiredSize)
    }

    /**
     * @param diskSize The root device disk size (in GiB) for your node group instances.
     */
    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

    /**
     * @param forceUpdate Force the update if the existing node group's pods are unable to be
     * drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails
     * to terminate the old
     * node whether or not any pods are
     * running on the node.
     */
    override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * @param instanceTypes The instance types to use for your node group.
     */
    override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    /**
     * @param instanceTypes The instance types to use for your node group.
     */
    override fun instanceTypes(vararg instanceTypes: InstanceType): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * @param labels The Kubernetes labels to be applied to the nodes in the node group when they
     * are created.
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * @param launchTemplateSpec Launch template specification used for the nodegroup.
     */
    override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
      cdkBuilder.launchTemplateSpec(launchTemplateSpec.let(LaunchTemplateSpec::unwrap))
    }

    /**
     * @param launchTemplateSpec Launch template specification used for the nodegroup.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0e8b2f2dc3405f67a3cd7b21e4833e4e2c73a9564c2179aeab53d1807472b1f")
    override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit): Unit
        = launchTemplateSpec(LaunchTemplateSpec(launchTemplateSpec))

    /**
     * @param maxSize The maximum number of worker nodes that the managed node group can scale out
     * to.
     * Managed node groups can support up to 100 nodes by default.
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param maxUnavailable The maximum number of nodes unavailable at once during a version
     * update.
     * Nodes will be updated in parallel. The maximum number is 100.
     *
     * This value or `maxUnavailablePercentage` is required to have a value for custom update
     * configurations to be applied.
     */
    override fun maxUnavailable(maxUnavailable: Number) {
      cdkBuilder.maxUnavailable(maxUnavailable)
    }

    /**
     * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a version
     * update.
     * This percentage of nodes will be updated in parallel, up to 100 nodes at once.
     *
     * This value or `maxUnavailable` is required to have a value for custom update configurations
     * to be applied.
     */
    override fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
      cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
    }

    /**
     * @param minSize The minimum number of worker nodes that the managed node group can scale in
     * to.
     * This number must be greater than or equal to zero.
     */
    override fun minSize(minSize: Number) {
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
    override fun nodeRole(nodeRole: IRole) {
      cdkBuilder.nodeRole(nodeRole.let(IRole::unwrap))
    }

    /**
     * @param nodegroupName Name of the Nodegroup.
     */
    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    /**
     * @param releaseVersion The AMI version of the Amazon EKS-optimized AMI to use with your node
     * group (for example, `1.14.7-YYYYMMDD`).
     */
    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    /**
     * @param remoteAccess The remote access (SSH) configuration to use with your node group.
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     */
    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
      cdkBuilder.remoteAccess(remoteAccess.let(NodegroupRemoteAccess::unwrap))
    }

    /**
     * @param remoteAccess The remote access (SSH) configuration to use with your node group.
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aab14c8127f28641dca0351541b634eaa4cefe76d2a52b4211aee6cf249310f0")
    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit): Unit =
        remoteAccess(NodegroupRemoteAccess(remoteAccess))

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group.
     * By specifying the
     * SubnetSelection, the selected subnets will automatically apply required tags i.e.
     * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is
     * replaced with
     * the name of your cluster.
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group.
     * By specifying the
     * SubnetSelection, the selected subnets will automatically apply required tags i.e.
     * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is
     * replaced with
     * the name of your cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad32f602f50066d331d71a96a83719c01828628afe15012a768997ca8fc9f6ae")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * @param tags The metadata to apply to the node group to assist with categorization and
     * organization.
     * Each tag consists of
     * a key and an optional value, both of which you define. Node group tags do not propagate to
     * any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     */
    override fun taints(taints: List<TaintSpec>) {
      cdkBuilder.taints(taints.map(TaintSpec::unwrap))
    }

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     */
    override fun taints(vararg taints: TaintSpec): Unit = taints(taints.toList())

    public fun build(): software.amazon.awscdk.services.eks.NodegroupOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.NodegroupOptions,
  ) : CdkObject(cdkObject), NodegroupOptions {
    /**
     * The AMI type for your node group.
     *
     * If you explicitly specify the launchTemplate with custom AMI, do not specify this property,
     * or
     * the node group deployment will fail. In other cases, you will need to specify correct amiType
     * for the nodegroup.
     *
     * Default: - auto-determined from the instanceTypes property when launchTemplateSpec property
     * is not specified
     */
    override fun amiType(): NodegroupAmiType? =
        unwrap(this).getAmiType()?.let(NodegroupAmiType::wrap)

    /**
     * The capacity type of the nodegroup.
     *
     * Default: - ON_DEMAND
     */
    override fun capacityType(): CapacityType? =
        unwrap(this).getCapacityType()?.let(CapacityType::wrap)

    /**
     * The current number of worker nodes that the managed node group should maintain.
     *
     * If not specified,
     * the nodewgroup will initially create `minSize` instances.
     *
     * Default: 2
     */
    override fun desiredSize(): Number? = unwrap(this).getDesiredSize()

    /**
     * The root device disk size (in GiB) for your node group instances.
     *
     * Default: 20
     */
    override fun diskSize(): Number? = unwrap(this).getDiskSize()

    /**
     * Force the update if the existing node group's pods are unable to be drained due to a pod
     * disruption budget issue.
     *
     * If an update fails because pods could not be drained, you can force the update after it fails
     * to terminate the old
     * node whether or not any pods are
     * running on the node.
     *
     * Default: true
     */
    override fun forceUpdate(): Boolean? = unwrap(this).getForceUpdate()

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     */
    override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

    /**
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     */
    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     */
    override fun launchTemplateSpec(): LaunchTemplateSpec? =
        unwrap(this).getLaunchTemplateSpec()?.let(LaunchTemplateSpec::wrap)

    /**
     * The maximum number of worker nodes that the managed node group can scale out to.
     *
     * Managed node groups can support up to 100 nodes by default.
     *
     * Default: - desiredSize
     */
    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    /**
     * The maximum number of nodes unavailable at once during a version update.
     *
     * Nodes will be updated in parallel. The maximum number is 100.
     *
     * This value or `maxUnavailablePercentage` is required to have a value for custom update
     * configurations to be applied.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailable)
     */
    override fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

    /**
     * The maximum percentage of nodes unavailable during a version update.
     *
     * This percentage of nodes will be updated in parallel, up to 100 nodes at once.
     *
     * This value or `maxUnavailable` is required to have a value for custom update configurations
     * to be applied.
     *
     * Default: undefined - node groups will update instances one at a time
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailablepercentage)
     */
    override fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()

    /**
     * The minimum number of worker nodes that the managed node group can scale in to.
     *
     * This number must be greater than or equal to zero.
     *
     * Default: 1
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * The IAM role to associate with your node group.
     *
     * The Amazon EKS worker node kubelet daemon
     * makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls
     * through
     * an IAM instance profile and associated policies. Before you can launch worker nodes and
     * register them
     * into a cluster, you must create an IAM role for those worker nodes to use when they are
     * launched.
     *
     * Default: - None. Auto-generated if not specified.
     */
    override fun nodeRole(): IRole? = unwrap(this).getNodeRole()?.let(IRole::wrap)

    /**
     * Name of the Nodegroup.
     *
     * Default: - resource ID
     */
    override fun nodegroupName(): String? = unwrap(this).getNodegroupName()

    /**
     * The AMI version of the Amazon EKS-optimized AMI to use with your node group (for example,
     * `1.14.7-YYYYMMDD`).
     *
     * Default: - The latest available AMI version for the node group's current Kubernetes version
     * is used.
     */
    override fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     */
    override fun remoteAccess(): NodegroupRemoteAccess? =
        unwrap(this).getRemoteAccess()?.let(NodegroupRemoteAccess::wrap)

    /**
     * The subnets to use for the Auto Scaling group that is created for your node group.
     *
     * By specifying the
     * SubnetSelection, the selected subnets will automatically apply required tags i.e.
     * `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME` is
     * replaced with
     * the name of your cluster.
     *
     * Default: - private subnets
     */
    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    /**
     * The metadata to apply to the node group to assist with categorization and organization.
     *
     * Each tag consists of
     * a key and an optional value, both of which you define. Node group tags do not propagate to
     * any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     *
     * Default: - None
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     */
    override fun taints(): List<TaintSpec> = unwrap(this).getTaints()?.map(TaintSpec::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodegroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupOptions):
        NodegroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodegroupOptions):
        software.amazon.awscdk.services.eks.NodegroupOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.NodegroupOptions
  }
}
