@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The Nodegroup resource class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Cluster cluster;
 * InstanceType instanceType;
 * Role role;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Nodegroup nodegroup = Nodegroup.Builder.create(this, "MyNodegroup")
 * .cluster(cluster)
 * // the properties below are optional
 * .amiType(NodegroupAmiType.AL2_X86_64)
 * .capacityType(CapacityType.SPOT)
 * .desiredSize(123)
 * .diskSize(123)
 * .forceUpdate(false)
 * .instanceTypes(List.of(instanceType))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .launchTemplateSpec(LaunchTemplateSpec.builder()
 * .id("id")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .maxSize(123)
 * .maxUnavailable(123)
 * .maxUnavailablePercentage(123)
 * .minSize(123)
 * .nodegroupName("nodegroupName")
 * .nodeRole(role)
 * .releaseVersion("releaseVersion")
 * .remoteAccess(NodegroupRemoteAccess.builder()
 * .sshKeyName("sshKeyName")
 * // the properties below are optional
 * .sourceSecurityGroups(List.of(securityGroup))
 * .build())
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taints(List.of(TaintSpec.builder()
 * .effect(TaintEffect.NO_SCHEDULE)
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 */
public open class Nodegroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.Nodegroup,
) : Resource(cdkObject), INodegroup {
  /**
   * the Amazon EKS cluster resource.
   */
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  /**
   * ARN of the nodegroup.
   */
  public open fun nodegroupArn(): String = unwrap(this).getNodegroupArn()

  /**
   * Nodegroup name.
   */
  public override fun nodegroupName(): String = unwrap(this).getNodegroupName()

  /**
   * IAM role of the instance profile for the nodegroup.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.Nodegroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param amiType The AMI type for your node group. 
     */
    public fun amiType(amiType: NodegroupAmiType)

    /**
     * The capacity type of the nodegroup.
     *
     * Default: - ON_DEMAND
     *
     * @param capacityType The capacity type of the nodegroup. 
     */
    public fun capacityType(capacityType: CapacityType)

    /**
     * Cluster resource.
     *
     * @param cluster Cluster resource. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The current number of worker nodes that the managed node group should maintain.
     *
     * If not specified,
     * the nodewgroup will initially create `minSize` instances.
     *
     * Default: 2
     *
     * @param desiredSize The current number of worker nodes that the managed node group should
     * maintain. 
     */
    public fun desiredSize(desiredSize: Number)

    /**
     * The root device disk size (in GiB) for your node group instances.
     *
     * Default: 20
     *
     * @param diskSize The root device disk size (in GiB) for your node group instances. 
     */
    public fun diskSize(diskSize: Number)

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
     *
     * @param forceUpdate Force the update if the existing node group's pods are unable to be
     * drained due to a pod disruption budget issue. 
     */
    public fun forceUpdate(forceUpdate: Boolean)

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     * @param instanceTypes The instance types to use for your node group. 
     */
    public fun instanceTypes(instanceTypes: List<InstanceType>)

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     * @param instanceTypes The instance types to use for your node group. 
     */
    public fun instanceTypes(vararg instanceTypes: InstanceType)

    /**
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param labels The Kubernetes labels to be applied to the nodes in the node group when they
     * are created. 
     */
    public fun labels(labels: Map<String, String>)

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * @param launchTemplateSpec Launch template specification used for the nodegroup. 
     */
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec)

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * @param launchTemplateSpec Launch template specification used for the nodegroup. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0ec2cad0e3c6afad5c35a57c03ad8c913e1b9d45c4576f36573c8ebe96750c8")
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit)

    /**
     * The maximum number of worker nodes that the managed node group can scale out to.
     *
     * Managed node groups can support up to 100 nodes by default.
     *
     * Default: - desiredSize
     *
     * @param maxSize The maximum number of worker nodes that the managed node group can scale out
     * to. 
     */
    public fun maxSize(maxSize: Number)

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
     * @param maxUnavailable The maximum number of nodes unavailable at once during a version
     * update. 
     */
    public fun maxUnavailable(maxUnavailable: Number)

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
     * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a version
     * update. 
     */
    public fun maxUnavailablePercentage(maxUnavailablePercentage: Number)

    /**
     * The minimum number of worker nodes that the managed node group can scale in to.
     *
     * This number must be greater than or equal to zero.
     *
     * Default: 1
     *
     * @param minSize The minimum number of worker nodes that the managed node group can scale in
     * to. 
     */
    public fun minSize(minSize: Number)

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
     *
     * @param nodeRole The IAM role to associate with your node group. 
     */
    public fun nodeRole(nodeRole: IRole)

    /**
     * Name of the Nodegroup.
     *
     * Default: - resource ID
     *
     * @param nodegroupName Name of the Nodegroup. 
     */
    public fun nodegroupName(nodegroupName: String)

    /**
     * The AMI version of the Amazon EKS-optimized AMI to use with your node group (for example,
     * `1.14.7-YYYYMMDD`).
     *
     * Default: - The latest available AMI version for the node group's current Kubernetes version
     * is used.
     *
     * @param releaseVersion The AMI version of the Amazon EKS-optimized AMI to use with your node
     * group (for example, `1.14.7-YYYYMMDD`). 
     */
    public fun releaseVersion(releaseVersion: String)

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     *
     * @param remoteAccess The remote access (SSH) configuration to use with your node group. 
     */
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess)

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     *
     * @param remoteAccess The remote access (SSH) configuration to use with your node group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fb4f88e636c401edf3e068059f986ebb822a79750c7e3a8a8bb1459c8850cf6")
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit)

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
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    public fun subnets(subnets: SubnetSelection)

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
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dd50ca0a4c271de17cdedae426d1298163fbde3c4bbfbaa5ac37016c336f894")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * The metadata to apply to the node group to assist with categorization and organization.
     *
     * Each tag consists of
     * a key and an optional value, both of which you define. Node group tags do not propagate to
     * any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     *
     * Default: - None
     *
     * @param tags The metadata to apply to the node group to assist with categorization and
     * organization. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    public fun taints(taints: List<TaintSpec>)

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    public fun taints(vararg taints: TaintSpec)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Nodegroup.Builder =
        software.amazon.awscdk.services.eks.Nodegroup.Builder.create(scope, id)

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
     *
     * @param amiType The AMI type for your node group. 
     */
    override fun amiType(amiType: NodegroupAmiType) {
      cdkBuilder.amiType(amiType.let(NodegroupAmiType::unwrap))
    }

    /**
     * The capacity type of the nodegroup.
     *
     * Default: - ON_DEMAND
     *
     * @param capacityType The capacity type of the nodegroup. 
     */
    override fun capacityType(capacityType: CapacityType) {
      cdkBuilder.capacityType(capacityType.let(CapacityType::unwrap))
    }

    /**
     * Cluster resource.
     *
     * @param cluster Cluster resource. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * The current number of worker nodes that the managed node group should maintain.
     *
     * If not specified,
     * the nodewgroup will initially create `minSize` instances.
     *
     * Default: 2
     *
     * @param desiredSize The current number of worker nodes that the managed node group should
     * maintain. 
     */
    override fun desiredSize(desiredSize: Number) {
      cdkBuilder.desiredSize(desiredSize)
    }

    /**
     * The root device disk size (in GiB) for your node group instances.
     *
     * Default: 20
     *
     * @param diskSize The root device disk size (in GiB) for your node group instances. 
     */
    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

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
     *
     * @param forceUpdate Force the update if the existing node group's pods are unable to be
     * drained due to a pod disruption budget issue. 
     */
    override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     * @param instanceTypes The instance types to use for your node group. 
     */
    override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     * @param instanceTypes The instance types to use for your node group. 
     */
    override fun instanceTypes(vararg instanceTypes: InstanceType): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param labels The Kubernetes labels to be applied to the nodes in the node group when they
     * are created. 
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * @param launchTemplateSpec Launch template specification used for the nodegroup. 
     */
    override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
      cdkBuilder.launchTemplateSpec(launchTemplateSpec.let(LaunchTemplateSpec::unwrap))
    }

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * @param launchTemplateSpec Launch template specification used for the nodegroup. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0ec2cad0e3c6afad5c35a57c03ad8c913e1b9d45c4576f36573c8ebe96750c8")
    override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit): Unit
        = launchTemplateSpec(LaunchTemplateSpec(launchTemplateSpec))

    /**
     * The maximum number of worker nodes that the managed node group can scale out to.
     *
     * Managed node groups can support up to 100 nodes by default.
     *
     * Default: - desiredSize
     *
     * @param maxSize The maximum number of worker nodes that the managed node group can scale out
     * to. 
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

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
     * @param maxUnavailable The maximum number of nodes unavailable at once during a version
     * update. 
     */
    override fun maxUnavailable(maxUnavailable: Number) {
      cdkBuilder.maxUnavailable(maxUnavailable)
    }

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
     * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a version
     * update. 
     */
    override fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
      cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
    }

    /**
     * The minimum number of worker nodes that the managed node group can scale in to.
     *
     * This number must be greater than or equal to zero.
     *
     * Default: 1
     *
     * @param minSize The minimum number of worker nodes that the managed node group can scale in
     * to. 
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

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
     *
     * @param nodeRole The IAM role to associate with your node group. 
     */
    override fun nodeRole(nodeRole: IRole) {
      cdkBuilder.nodeRole(nodeRole.let(IRole::unwrap))
    }

    /**
     * Name of the Nodegroup.
     *
     * Default: - resource ID
     *
     * @param nodegroupName Name of the Nodegroup. 
     */
    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    /**
     * The AMI version of the Amazon EKS-optimized AMI to use with your node group (for example,
     * `1.14.7-YYYYMMDD`).
     *
     * Default: - The latest available AMI version for the node group's current Kubernetes version
     * is used.
     *
     * @param releaseVersion The AMI version of the Amazon EKS-optimized AMI to use with your node
     * group (for example, `1.14.7-YYYYMMDD`). 
     */
    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     *
     * @param remoteAccess The remote access (SSH) configuration to use with your node group. 
     */
    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
      cdkBuilder.remoteAccess(remoteAccess.let(NodegroupRemoteAccess::unwrap))
    }

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you
     * specify an Amazon EC2 SSH key but do not specify a source security group when you create a
     * managed node group,
     * then port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     *
     * @param remoteAccess The remote access (SSH) configuration to use with your node group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fb4f88e636c401edf3e068059f986ebb822a79750c7e3a8a8bb1459c8850cf6")
    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit): Unit =
        remoteAccess(NodegroupRemoteAccess(remoteAccess))

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
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

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
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dd50ca0a4c271de17cdedae426d1298163fbde3c4bbfbaa5ac37016c336f894")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * The metadata to apply to the node group to assist with categorization and organization.
     *
     * Each tag consists of
     * a key and an optional value, both of which you define. Node group tags do not propagate to
     * any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     *
     * Default: - None
     *
     * @param tags The metadata to apply to the node group to assist with categorization and
     * organization. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    override fun taints(taints: List<TaintSpec>) {
      cdkBuilder.taints(taints.map(TaintSpec::unwrap))
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    override fun taints(vararg taints: TaintSpec): Unit = taints(taints.toList())

    public fun build(): software.amazon.awscdk.services.eks.Nodegroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromNodegroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      nodegroupName: String,
    ): INodegroup =
        software.amazon.awscdk.services.eks.Nodegroup.fromNodegroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, nodegroupName).let(INodegroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Nodegroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Nodegroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Nodegroup): Nodegroup =
        Nodegroup(cdkObject)

    internal fun unwrap(wrapped: Nodegroup): software.amazon.awscdk.services.eks.Nodegroup =
        wrapped.cdkObject
  }
}
