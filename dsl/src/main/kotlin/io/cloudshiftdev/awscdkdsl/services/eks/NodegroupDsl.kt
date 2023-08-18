@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
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
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.NodegroupAmiType
import software.amazon.awscdk.services.eks.NodegroupRemoteAccess
import software.amazon.awscdk.services.eks.TaintSpec
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * The Nodegroup resource class.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.eks.*;
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class NodegroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Nodegroup.Builder = Nodegroup.Builder.create(scope, id)

    private val _instanceTypes: MutableList<InstanceType> = mutableListOf()

    private val _taints: MutableList<TaintSpec> = mutableListOf()

    /**
     * The AMI type for your node group.
     *
     * If you explicitly specify the launchTemplate with custom AMI, do not specify this property,
     * or the node group deployment will fail. In other cases, you will need to specify correct
     * amiType for the nodegroup.
     *
     * Default: - auto-determined from the instanceTypes property when launchTemplateSpec property
     * is not specified
     *
     * @param amiType The AMI type for your node group.
     */
    public fun amiType(amiType: NodegroupAmiType) {
        cdkBuilder.amiType(amiType)
    }

    /**
     * The capacity type of the nodegroup.
     *
     * Default: - ON_DEMAND
     *
     * @param capacityType The capacity type of the nodegroup.
     */
    public fun capacityType(capacityType: CapacityType) {
        cdkBuilder.capacityType(capacityType)
    }

    /**
     * Cluster resource.
     *
     * @param cluster Cluster resource.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * The current number of worker nodes that the managed node group should maintain.
     *
     * If not specified, the nodewgroup will initially create `minSize` instances.
     *
     * Default: 2
     *
     * @param desiredSize The current number of worker nodes that the managed node group should
     *   maintain.
     */
    public fun desiredSize(desiredSize: Number) {
        cdkBuilder.desiredSize(desiredSize)
    }

    /**
     * The root device disk size (in GiB) for your node group instances.
     *
     * Default: 20
     *
     * @param diskSize The root device disk size (in GiB) for your node group instances.
     */
    public fun diskSize(diskSize: Number) {
        cdkBuilder.diskSize(diskSize)
    }

    /**
     * Force the update if the existing node group's pods are unable to be drained due to a pod
     * disruption budget issue.
     *
     * If an update fails because pods could not be drained, you can force the update after it fails
     * to terminate the old node whether or not any pods are running on the node.
     *
     * Default: true
     *
     * @param forceUpdate Force the update if the existing node group's pods are unable to be
     *   drained due to a pod disruption budget issue.
     */
    public fun forceUpdate(forceUpdate: Boolean) {
        cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     *
     * @param instanceTypes The instance types to use for your node group.
     */
    public fun instanceTypes(vararg instanceTypes: InstanceType) {
        _instanceTypes.addAll(listOf(*instanceTypes))
    }

    /**
     * The instance types to use for your node group.
     *
     * Default: t3.medium will be used according to the cloudformation document.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     *
     * @param instanceTypes The instance types to use for your node group.
     */
    public fun instanceTypes(instanceTypes: Collection<InstanceType>) {
        _instanceTypes.addAll(instanceTypes)
    }

    /**
     * The Kubernetes labels to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param labels The Kubernetes labels to be applied to the nodes in the node group when they
     *   are created.
     */
    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     *
     * @param launchTemplateSpec Launch template specification used for the nodegroup.
     */
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpecDsl.() -> Unit = {}) {
        val builder = LaunchTemplateSpecDsl()
        builder.apply(launchTemplateSpec)
        cdkBuilder.launchTemplateSpec(builder.build())
    }

    /**
     * Launch template specification used for the nodegroup.
     *
     * Default: - no launch template
     *
     * [Documentation]( - https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     *
     * @param launchTemplateSpec Launch template specification used for the nodegroup.
     */
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
        cdkBuilder.launchTemplateSpec(launchTemplateSpec)
    }

    /**
     * The maximum number of worker nodes that the managed node group can scale out to.
     *
     * Managed node groups can support up to 100 nodes by default.
     *
     * Default: - desiredSize
     *
     * @param maxSize The maximum number of worker nodes that the managed node group can scale out
     *   to.
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * The minimum number of worker nodes that the managed node group can scale in to.
     *
     * This number must be greater than or equal to zero.
     *
     * Default: 1
     *
     * @param minSize The minimum number of worker nodes that the managed node group can scale in
     *   to.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * The IAM role to associate with your node group.
     *
     * The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker
     * nodes receive permissions for these API calls through an IAM instance profile and associated
     * policies. Before you can launch worker nodes and register them into a cluster, you must
     * create an IAM role for those worker nodes to use when they are launched.
     *
     * Default: - None. Auto-generated if not specified.
     *
     * @param nodeRole The IAM role to associate with your node group.
     */
    public fun nodeRole(nodeRole: IRole) {
        cdkBuilder.nodeRole(nodeRole)
    }

    /**
     * Name of the Nodegroup.
     *
     * Default: - resource ID
     *
     * @param nodegroupName Name of the Nodegroup.
     */
    public fun nodegroupName(nodegroupName: String) {
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
     *   group (for example, `1.14.7-YYYYMMDD`).
     */
    public fun releaseVersion(releaseVersion: String) {
        cdkBuilder.releaseVersion(releaseVersion)
    }

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you specify an Amazon EC2 SSH key but do not specify a
     * source security group when you create a managed node group, then port 22 on the worker nodes
     * is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     *
     * @param remoteAccess The remote access (SSH) configuration to use with your node group.
     */
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccessDsl.() -> Unit = {}) {
        val builder = NodegroupRemoteAccessDsl()
        builder.apply(remoteAccess)
        cdkBuilder.remoteAccess(builder.build())
    }

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Disabled by default, however, if you specify an Amazon EC2 SSH key but do not specify a
     * source security group when you create a managed node group, then port 22 on the worker nodes
     * is opened to the internet (0.0.0.0/0)
     *
     * Default: - disabled
     *
     * @param remoteAccess The remote access (SSH) configuration to use with your node group.
     */
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
        cdkBuilder.remoteAccess(remoteAccess)
    }

    /**
     * The subnets to use for the Auto Scaling group that is created for your node group.
     *
     * By specifying the SubnetSelection, the selected subnets will automatically apply required
     * tags i.e. `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME`
     * is replaced with the name of your cluster.
     *
     * Default: - private subnets
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     *   group.
     */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnets)
        cdkBuilder.subnets(builder.build())
    }

    /**
     * The subnets to use for the Auto Scaling group that is created for your node group.
     *
     * By specifying the SubnetSelection, the selected subnets will automatically apply required
     * tags i.e. `kubernetes.io/cluster/CLUSTER_NAME` with a value of `shared`, where `CLUSTER_NAME`
     * is replaced with the name of your cluster.
     *
     * Default: - private subnets
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     *   group.
     */
    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    /**
     * The metadata to apply to the node group to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Node group tags
     * do not propagate to any other resources associated with the node group, such as the Amazon
     * EC2 instances or subnets.
     *
     * Default: - None
     *
     * @param tags The metadata to apply to the node group to assist with categorization and
     *   organization.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     *   are created.
     */
    public fun taints(taints: TaintSpecDsl.() -> Unit) {
        _taints.add(TaintSpecDsl().apply(taints).build())
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Default: - None
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     *   are created.
     */
    public fun taints(taints: Collection<TaintSpec>) {
        _taints.addAll(taints)
    }

    public fun build(): Nodegroup {
        if (_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
        if (_taints.isNotEmpty()) cdkBuilder.taints(_taints)
        return cdkBuilder.build()
    }
}
