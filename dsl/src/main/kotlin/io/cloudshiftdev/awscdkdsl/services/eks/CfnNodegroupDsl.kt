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

/**
 * Creates a managed node group for an Amazon EKS cluster.
 *
 * You can only create a node group for your cluster that is equal to the current Kubernetes version
 * for the cluster.
 *
 * An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2
 * instances that are managed by AWS for an Amazon EKS cluster. For more information, see
 * [Managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html)
 * in the *Amazon EKS User Guide* .
 *
 * Windows AMI types are only supported for commercial Regions that support Windows Amazon EKS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnNodegroup cfnNodegroup = CfnNodegroup.Builder.create(this, "MyCfnNodegroup")
 * .clusterName("clusterName")
 * .nodeRole("nodeRole")
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .amiType("amiType")
 * .capacityType("capacityType")
 * .diskSize(123)
 * .forceUpdateEnabled(false)
 * .instanceTypes(List.of("instanceTypes"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
 * .id("id")
 * .name("name")
 * .version("version")
 * .build())
 * .nodegroupName("nodegroupName")
 * .releaseVersion("releaseVersion")
 * .remoteAccess(RemoteAccessProperty.builder()
 * .ec2SshKey("ec2SshKey")
 * // the properties below are optional
 * .sourceSecurityGroups(List.of("sourceSecurityGroups"))
 * .build())
 * .scalingConfig(ScalingConfigProperty.builder()
 * .desiredSize(123)
 * .maxSize(123)
 * .minSize(123)
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taints(List.of(TaintProperty.builder()
 * .effect("effect")
 * .key("key")
 * .value("value")
 * .build()))
 * .updateConfig(UpdateConfigProperty.builder()
 * .maxUnavailable(123)
 * .maxUnavailablePercentage(123)
 * .build())
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html)
 */
@CdkDslMarker
public class CfnNodegroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNodegroup.Builder = CfnNodegroup.Builder.create(scope, id)

    private val _instanceTypes: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    private val _taints: MutableList<Any> = mutableListOf()

    /**
     * The AMI type for your node group.
     *
     * If you specify `launchTemplate` , and your launch template uses a custom AMI, then don't
     * specify `amiType` , or the node group deployment will fail. If your launch template uses a
     * Windows custom AMI, then add `eks:kube-proxy-windows` to your Windows nodes `rolearn` in the
     * `aws-auth` `ConfigMap` . For more information about using launch templates with Amazon EKS,
     * see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype)
     *
     * @param amiType The AMI type for your node group.
     */
    public fun amiType(amiType: String) {
        cdkBuilder.amiType(amiType)
    }

    /**
     * The capacity type of your managed node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-capacitytype)
     *
     * @param capacityType The capacity type of your managed node group.
     */
    public fun capacityType(capacityType: String) {
        cdkBuilder.capacityType(capacityType)
    }

    /**
     * The name of the cluster to create the node group in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername)
     *
     * @param clusterName The name of the cluster to create the node group in.
     */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * The root device disk size (in GiB) for your node group instances.
     *
     * The default disk size is 20 GiB for Linux and Bottlerocket. The default disk size is 50 GiB
     * for Windows. If you specify `launchTemplate` , then don't specify `diskSize` , or the node
     * group deployment will fail. For more information about using launch templates with Amazon
     * EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize)
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
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled)
     *
     * @param forceUpdateEnabled Force the update if the existing node group's pods are unable to be
     *   drained due to a pod disruption budget issue.
     */
    public fun forceUpdateEnabled(forceUpdateEnabled: Boolean) {
        cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
    }

    /**
     * Force the update if the existing node group's pods are unable to be drained due to a pod
     * disruption budget issue.
     *
     * If an update fails because pods could not be drained, you can force the update after it fails
     * to terminate the old node whether or not any pods are running on the node.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled)
     *
     * @param forceUpdateEnabled Force the update if the existing node group's pods are unable to be
     *   drained due to a pod disruption budget issue.
     */
    public fun forceUpdateEnabled(forceUpdateEnabled: IResolvable) {
        cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
    }

    /**
     * Specify the instance types for a node group.
     *
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and*
     * specify any `instanceTypes` , the node group deployment will fail. If you don't specify an
     * instance type in a launch template or for `instanceTypes` , then `t3.medium` is used, by
     * default. If you specify `Spot` for `capacityType` , then we recommend specifying multiple
     * values for `instanceTypes` . For more information, see
     * [Managed node group capacity types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     *
     * @param instanceTypes Specify the instance types for a node group.
     */
    public fun instanceTypes(vararg instanceTypes: String) {
        _instanceTypes.addAll(listOf(*instanceTypes))
    }

    /**
     * Specify the instance types for a node group.
     *
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and*
     * specify any `instanceTypes` , the node group deployment will fail. If you don't specify an
     * instance type in a launch template or for `instanceTypes` , then `t3.medium` is used, by
     * default. If you specify `Spot` for `capacityType` , then we recommend specifying multiple
     * values for `instanceTypes` . For more information, see
     * [Managed node group capacity types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     *
     * @param instanceTypes Specify the instance types for a node group.
     */
    public fun instanceTypes(instanceTypes: Collection<String>) {
        _instanceTypes.addAll(instanceTypes)
    }

    /**
     * The Kubernetes labels applied to the nodes in the node group.
     *
     * Only labels that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes labels applied to the nodes in this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     *
     * @param labels The Kubernetes labels applied to the nodes in the node group.
     */
    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    /**
     * The Kubernetes labels applied to the nodes in the node group.
     *
     * Only labels that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes labels applied to the nodes in this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     *
     * @param labels The Kubernetes labels applied to the nodes in the node group.
     */
    public fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels)
    }

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     *
     * @param launchTemplate An object representing a node group's launch template specification.
     */
    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     *
     * @param launchTemplate An object representing a node group's launch template specification.
     */
    public fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to associate with your node group.
     *
     * The Amazon EKS worker node `kubelet` daemon makes calls to AWS APIs on your behalf. Nodes
     * receive permissions for these API calls through an IAM instance profile and associated
     * policies. Before you can launch nodes and register them into a cluster, you must create an
     * IAM role for those nodes to use when they are launched. For more information, see
     * [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the **Amazon EKS User Guide** . If you specify `launchTemplate` , then don't specify
     * [`IamInstanceProfile`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html)
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole)
     *
     * @param nodeRole The Amazon Resource Name (ARN) of the IAM role to associate with your node
     *   group.
     */
    public fun nodeRole(nodeRole: String) {
        cdkBuilder.nodeRole(nodeRole)
    }

    /**
     * The unique name to give your node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname)
     *
     * @param nodegroupName The unique name to give your node group.
     */
    public fun nodegroupName(nodegroupName: String) {
        cdkBuilder.nodegroupName(nodegroupName)
    }

    /**
     * The AMI version of the Amazon EKS optimized AMI to use with your node group (for example,
     * `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the node group's
     * current Kubernetes version is used. For more information, see
     * [Amazon EKS optimized Linux AMI Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html)
     * in the *Amazon EKS User Guide* .
     *
     * Changing this value triggers an update of the node group if one is available. You can't
     * update other properties at the same time as updating `Release Version` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion)
     *
     * @param releaseVersion The AMI version of the Amazon EKS optimized AMI to use with your node
     *   group (for example, `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version
     *   for the node group's current Kubernetes version is used. For more information, see
     *   [Amazon EKS optimized Linux AMI Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html)
     *   in the *Amazon EKS User Guide* .
     */
    public fun releaseVersion(releaseVersion: String) {
        cdkBuilder.releaseVersion(releaseVersion)
    }

    /**
     * The remote access configuration to use with your node group.
     *
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will
     * fail. For more information about using launch templates with Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-remoteaccess)
     *
     * @param remoteAccess The remote access configuration to use with your node group.
     */
    public fun remoteAccess(remoteAccess: IResolvable) {
        cdkBuilder.remoteAccess(remoteAccess)
    }

    /**
     * The remote access configuration to use with your node group.
     *
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will
     * fail. For more information about using launch templates with Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-remoteaccess)
     *
     * @param remoteAccess The remote access configuration to use with your node group.
     */
    public fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty) {
        cdkBuilder.remoteAccess(remoteAccess)
    }

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     *
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     *   created for your node group.
     */
    public fun scalingConfig(scalingConfig: IResolvable) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     *
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     *   created for your node group.
     */
    public fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    /**
     * The subnets to use for the Auto Scaling group that is created for your node group.
     *
     * If you specify `launchTemplate` , then don't specify
     * [`SubnetId`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets)
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     *   group.
     */
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * The subnets to use for the Auto Scaling group that is created for your node group.
     *
     * If you specify `launchTemplate` , then don't specify
     * [`SubnetId`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets)
     *
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     *   group.
     */
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    /**
     * The metadata applied to the node group to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Node group tags do not
     * propagate to any other resources associated with the node group, such as the Amazon EC2
     * instances or subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags)
     *
     * @param tags The metadata applied to the node group to assist with categorization and
     *   organization.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes.
     * For more information, see
     * [Node taints on managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     *   are created.
     */
    public fun taints(vararg taints: Any) {
        _taints.addAll(listOf(*taints))
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes.
     * For more information, see
     * [Node taints on managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     *   are created.
     */
    public fun taints(taints: Collection<Any>) {
        _taints.addAll(taints)
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes.
     * For more information, see
     * [Node taints on managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     *
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     *   are created.
     */
    public fun taints(taints: IResolvable) {
        cdkBuilder.taints(taints)
    }

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     *
     * @param updateConfig The node group update configuration.
     */
    public fun updateConfig(updateConfig: IResolvable) {
        cdkBuilder.updateConfig(updateConfig)
    }

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     *
     * @param updateConfig The node group update configuration.
     */
    public fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty) {
        cdkBuilder.updateConfig(updateConfig)
    }

    /**
     * The Kubernetes version to use for your managed nodes.
     *
     * By default, the Kubernetes version of the cluster is used, and this is the only accepted
     * specified value. If you specify `launchTemplate` , and your launch template uses a custom
     * AMI, then don't specify `version` , or the node group deployment will fail. For more
     * information about using launch templates with Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * You can't update other properties at the same time as updating `Version` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version)
     *
     * @param version The Kubernetes version to use for your managed nodes.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnNodegroup {
        if (_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        if (_taints.isNotEmpty()) cdkBuilder.taints(_taints)
        return cdkBuilder.build()
    }
}
