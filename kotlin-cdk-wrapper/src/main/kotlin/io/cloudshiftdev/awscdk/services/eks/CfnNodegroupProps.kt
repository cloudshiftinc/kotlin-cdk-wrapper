@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNodegroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnNodegroupProps cfnNodegroupProps = CfnNodegroupProps.builder()
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
public interface CfnNodegroupProps {
  /**
   * The AMI type for your node group.
   *
   * If you specify `launchTemplate` , and your launch template uses a custom AMI, then don't
   * specify `amiType` , or the node group deployment will fail. If your launch template uses a Windows
   * custom AMI, then add `eks:kube-proxy-windows` to your Windows nodes `rolearn` in the `aws-auth`
   * `ConfigMap` . For more information about using launch templates with Amazon EKS, see [Launch
   * template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the
   * *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype)
   */
  public fun amiType(): String? = unwrap(this).getAmiType()

  /**
   * The capacity type of your managed node group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-capacitytype)
   */
  public fun capacityType(): String? = unwrap(this).getCapacityType()

  /**
   * The name of your cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername)
   */
  public fun clusterName(): String

  /**
   * The root device disk size (in GiB) for your node group instances.
   *
   * The default disk size is 20 GiB for Linux and Bottlerocket. The default disk size is 50 GiB for
   * Windows. If you specify `launchTemplate` , then don't specify `diskSize` , or the node group
   * deployment will fail. For more information about using launch templates with Amazon EKS, see
   * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
   * in the *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize)
   */
  public fun diskSize(): Number? = unwrap(this).getDiskSize()

  /**
   * Force the update if any `Pod` on the existing node group can't be drained due to a `Pod`
   * disruption budget issue.
   *
   * If an update fails because all Pods can't be drained, you can force the update after it fails
   * to terminate the old node whether or not any `Pod` is running on the node.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled)
   */
  public fun forceUpdateEnabled(): Any? = unwrap(this).getForceUpdateEnabled()

  /**
   * Specify the instance types for a node group.
   *
   * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
   * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
   * instance type in your launch template *or* you can specify 0-20 instance types for `instanceTypes`
   * . If however, you specify an instance type in your launch template *and* specify any
   * `instanceTypes` , the node group deployment will fail. If you don't specify an instance type in a
   * launch template or for `instanceTypes` , then `t3.medium` is used, by default. If you specify
   * `Spot` for `capacityType` , then we recommend specifying multiple values for `instanceTypes` . For
   * more information, see [Managed node group capacity
   * types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
   * and [Launch template
   * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
   * EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
   */
  public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  /**
   * The Kubernetes `labels` applied to the nodes in the node group.
   *
   *
   * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
   * Kubernetes `labels` applied to the nodes in this group.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
   */
  public fun labels(): Any? = unwrap(this).getLabels()

  /**
   * An object representing a node group's launch template specification.
   *
   * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
   * sure that the launch template meets the requirements in `launchTemplateSpecification` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
   */
  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to associate with your node group.
   *
   * The Amazon EKS worker node `kubelet` daemon makes calls to AWS APIs on your behalf. Nodes
   * receive permissions for these API calls through an IAM instance profile and associated policies.
   * Before you can launch nodes and register them into a cluster, you must create an IAM role for
   * those nodes to use when they are launched. For more information, see [Amazon EKS node IAM
   * role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html) in the **Amazon EKS
   * User Guide** . If you specify `launchTemplate` , then don't specify
   * `[IamInstanceProfile](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html)`
   * in your launch template, or the node group deployment will fail. For more information about using
   * launch templates with Amazon EKS, see [Launch template
   * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
   * EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole)
   */
  public fun nodeRole(): String

  /**
   * The unique name to give your node group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname)
   */
  public fun nodegroupName(): String? = unwrap(this).getNodegroupName()

  /**
   * The AMI version of the Amazon EKS optimized AMI to use with your node group (for example,
   * `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the node group's current
   * Kubernetes version is used. For more information, see [Amazon EKS optimized Linux AMI
   * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
   * *Amazon EKS User Guide* .
   *
   *
   * Changing this value triggers an update of the node group if one is available. You can't update
   * other properties at the same time as updating `Release Version` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion)
   */
  public fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

  /**
   * The remote access configuration to use with your node group.
   *
   * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
   * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail. For
   * more information about using launch templates with Amazon EKS, see [Launch template
   * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
   * EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-remoteaccess)
   */
  public fun remoteAccess(): Any? = unwrap(this).getRemoteAccess()

  /**
   * The scaling configuration details for the Auto Scaling group that is created for your node
   * group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
   */
  public fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  /**
   * The subnets to use for the Auto Scaling group that is created for your node group.
   *
   * If you specify `launchTemplate` , then don't specify
   * `[SubnetId](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)`
   * in your launch template, or the node group deployment will fail. For more information about using
   * launch templates with Amazon EKS, see [Launch template
   * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
   * EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets)
   */
  public fun subnets(): List<String>

  /**
   * Metadata that assists with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Tags don't propagate to any
   * other cluster or AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The Kubernetes taints to be applied to the nodes in the node group when they are created.
   *
   * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints can
   * be used together with tolerations to control how workloads are scheduled to your nodes. For more
   * information, see [Node taints on managed node
   * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
   */
  public fun taints(): Any? = unwrap(this).getTaints()

  /**
   * The node group update configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
   */
  public fun updateConfig(): Any? = unwrap(this).getUpdateConfig()

  /**
   * The Kubernetes version to use for your managed nodes.
   *
   * By default, the Kubernetes version of the cluster is used, and this is the only accepted
   * specified value. If you specify `launchTemplate` , and your launch template uses a custom AMI,
   * then don't specify `version` , or the node group deployment will fail. For more information about
   * using launch templates with Amazon EKS, see [Launch template
   * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
   * EKS User Guide* .
   *
   *
   * You can't update other properties at the same time as updating `Version` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version)
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [CfnNodegroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amiType The AMI type for your node group.
     * If you specify `launchTemplate` , and your launch template uses a custom AMI, then don't
     * specify `amiType` , or the node group deployment will fail. If your launch template uses a
     * Windows custom AMI, then add `eks:kube-proxy-windows` to your Windows nodes `rolearn` in the
     * `aws-auth` `ConfigMap` . For more information about using launch templates with Amazon EKS, see
     * [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun amiType(amiType: String)

    /**
     * @param capacityType The capacity type of your managed node group.
     */
    public fun capacityType(capacityType: String)

    /**
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param diskSize The root device disk size (in GiB) for your node group instances.
     * The default disk size is 20 GiB for Linux and Bottlerocket. The default disk size is 50 GiB
     * for Windows. If you specify `launchTemplate` , then don't specify `diskSize` , or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see
     * [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun diskSize(diskSize: Number)

    /**
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue.
     * If an update fails because all Pods can't be drained, you can force the update after it fails
     * to terminate the old node whether or not any `Pod` is running on the node.
     */
    public fun forceUpdateEnabled(forceUpdateEnabled: Boolean)

    /**
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue.
     * If an update fails because all Pods can't be drained, you can force the update after it fails
     * to terminate the old node whether or not any `Pod` is running on the node.
     */
    public fun forceUpdateEnabled(forceUpdateEnabled: IResolvable)

    /**
     * @param instanceTypes Specify the instance types for a node group.
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and* specify
     * any `instanceTypes` , the node group deployment will fail. If you don't specify an instance type
     * in a launch template or for `instanceTypes` , then `t3.medium` is used, by default. If you
     * specify `Spot` for `capacityType` , then we recommend specifying multiple values for
     * `instanceTypes` . For more information, see [Managed node group capacity
     * types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun instanceTypes(instanceTypes: List<String>)

    /**
     * @param instanceTypes Specify the instance types for a node group.
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and* specify
     * any `instanceTypes` , the node group deployment will fail. If you don't specify an instance type
     * in a launch template or for `instanceTypes` , then `t3.medium` is used, by default. If you
     * specify `Spot` for `capacityType` , then we recommend specifying multiple values for
     * `instanceTypes` . For more information, see [Managed node group capacity
     * types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun instanceTypes(vararg instanceTypes: String)

    /**
     * @param labels The Kubernetes `labels` applied to the nodes in the node group.
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     */
    public fun labels(labels: IResolvable)

    /**
     * @param labels The Kubernetes `labels` applied to the nodes in the node group.
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     */
    public fun labels(labels: Map<String, String>)

    /**
     * @param launchTemplate An object representing a node group's launch template specification.
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     */
    public fun launchTemplate(launchTemplate: IResolvable)

    /**
     * @param launchTemplate An object representing a node group's launch template specification.
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     */
    public fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty)

    /**
     * @param launchTemplate An object representing a node group's launch template specification.
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18969c3bfdf19d3641486ae46a5013a3e6802b5482a7ebd85b52450aa667aa99")
    public
        fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    /**
     * @param nodeRole The Amazon Resource Name (ARN) of the IAM role to associate with your node
     * group. 
     * The Amazon EKS worker node `kubelet` daemon makes calls to AWS APIs on your behalf. Nodes
     * receive permissions for these API calls through an IAM instance profile and associated policies.
     * Before you can launch nodes and register them into a cluster, you must create an IAM role for
     * those nodes to use when they are launched. For more information, see [Amazon EKS node IAM
     * role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html) in the **Amazon
     * EKS User Guide** . If you specify `launchTemplate` , then don't specify
     * `[IamInstanceProfile](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun nodeRole(nodeRole: String)

    /**
     * @param nodegroupName The unique name to give your node group.
     */
    public fun nodegroupName(nodegroupName: String)

    /**
     * @param releaseVersion The AMI version of the Amazon EKS optimized AMI to use with your node
     * group (for example, `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the
     * node group's current Kubernetes version is used. For more information, see [Amazon EKS optimized
     * Linux AMI
     * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
     * *Amazon EKS User Guide* .
     *
     * Changing this value triggers an update of the node group if one is available. You can't
     * update other properties at the same time as updating `Release Version` .
     */
    public fun releaseVersion(releaseVersion: String)

    /**
     * @param remoteAccess The remote access configuration to use with your node group.
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun remoteAccess(remoteAccess: IResolvable)

    /**
     * @param remoteAccess The remote access configuration to use with your node group.
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty)

    /**
     * @param remoteAccess The remote access configuration to use with your node group.
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f39ff54f381c2a00ad3b9e744a041218336b0931c5b42b819859c985d10a3a5")
    public fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit)

    /**
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group.
     */
    public fun scalingConfig(scalingConfig: IResolvable)

    /**
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group.
     */
    public fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty)

    /**
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cab8b43e22c8f3fdacd3df66c43824c9b0a4a40d16c5ee222a381428ce2bcce6")
    public fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty.Builder.() -> Unit)

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     * If you specify `launchTemplate` , then don't specify
     * `[SubnetId](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun subnets(subnets: List<String>)

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     * If you specify `launchTemplate` , then don't specify
     * `[SubnetId](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    public fun subnets(vararg subnets: String)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     */
    public fun taints(taints: IResolvable)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     */
    public fun taints(taints: List<Any>)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     */
    public fun taints(vararg taints: Any)

    /**
     * @param updateConfig The node group update configuration.
     */
    public fun updateConfig(updateConfig: IResolvable)

    /**
     * @param updateConfig The node group update configuration.
     */
    public fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty)

    /**
     * @param updateConfig The node group update configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4dbafb1a7a495a5b14585187cd5802fbf5edeac3c315a8210bb3125da71894")
    public fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty.Builder.() -> Unit)

    /**
     * @param version The Kubernetes version to use for your managed nodes.
     * By default, the Kubernetes version of the cluster is used, and this is the only accepted
     * specified value. If you specify `launchTemplate` , and your launch template uses a custom AMI,
     * then don't specify `version` , or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     *
     * You can't update other properties at the same time as updating `Version` .
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnNodegroupProps.Builder =
        software.amazon.awscdk.services.eks.CfnNodegroupProps.builder()

    /**
     * @param amiType The AMI type for your node group.
     * If you specify `launchTemplate` , and your launch template uses a custom AMI, then don't
     * specify `amiType` , or the node group deployment will fail. If your launch template uses a
     * Windows custom AMI, then add `eks:kube-proxy-windows` to your Windows nodes `rolearn` in the
     * `aws-auth` `ConfigMap` . For more information about using launch templates with Amazon EKS, see
     * [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun amiType(amiType: String) {
      cdkBuilder.amiType(amiType)
    }

    /**
     * @param capacityType The capacity type of your managed node group.
     */
    override fun capacityType(capacityType: String) {
      cdkBuilder.capacityType(capacityType)
    }

    /**
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param diskSize The root device disk size (in GiB) for your node group instances.
     * The default disk size is 20 GiB for Linux and Bottlerocket. The default disk size is 50 GiB
     * for Windows. If you specify `launchTemplate` , then don't specify `diskSize` , or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see
     * [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

    /**
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue.
     * If an update fails because all Pods can't be drained, you can force the update after it fails
     * to terminate the old node whether or not any `Pod` is running on the node.
     */
    override fun forceUpdateEnabled(forceUpdateEnabled: Boolean) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
    }

    /**
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue.
     * If an update fails because all Pods can't be drained, you can force the update after it fails
     * to terminate the old node whether or not any `Pod` is running on the node.
     */
    override fun forceUpdateEnabled(forceUpdateEnabled: IResolvable) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param instanceTypes Specify the instance types for a node group.
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and* specify
     * any `instanceTypes` , the node group deployment will fail. If you don't specify an instance type
     * in a launch template or for `instanceTypes` , then `t3.medium` is used, by default. If you
     * specify `Spot` for `capacityType` , then we recommend specifying multiple values for
     * `instanceTypes` . For more information, see [Managed node group capacity
     * types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    /**
     * @param instanceTypes Specify the instance types for a node group.
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and* specify
     * any `instanceTypes` , the node group deployment will fail. If you don't specify an instance type
     * in a launch template or for `instanceTypes` , then `t3.medium` is used, by default. If you
     * specify `Spot` for `capacityType` , then we recommend specifying multiple values for
     * `instanceTypes` . For more information, see [Managed node group capacity
     * types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * @param labels The Kubernetes `labels` applied to the nodes in the node group.
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     */
    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    /**
     * @param labels The Kubernetes `labels` applied to the nodes in the node group.
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * @param launchTemplate An object representing a node group's launch template specification.
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    /**
     * @param launchTemplate An object representing a node group's launch template specification.
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     */
    override fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnNodegroup.LaunchTemplateSpecificationProperty::unwrap))
    }

    /**
     * @param launchTemplate An object representing a node group's launch template specification.
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18969c3bfdf19d3641486ae46a5013a3e6802b5482a7ebd85b52450aa667aa99")
    override
        fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(CfnNodegroup.LaunchTemplateSpecificationProperty(launchTemplate))

    /**
     * @param nodeRole The Amazon Resource Name (ARN) of the IAM role to associate with your node
     * group. 
     * The Amazon EKS worker node `kubelet` daemon makes calls to AWS APIs on your behalf. Nodes
     * receive permissions for these API calls through an IAM instance profile and associated policies.
     * Before you can launch nodes and register them into a cluster, you must create an IAM role for
     * those nodes to use when they are launched. For more information, see [Amazon EKS node IAM
     * role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html) in the **Amazon
     * EKS User Guide** . If you specify `launchTemplate` , then don't specify
     * `[IamInstanceProfile](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun nodeRole(nodeRole: String) {
      cdkBuilder.nodeRole(nodeRole)
    }

    /**
     * @param nodegroupName The unique name to give your node group.
     */
    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    /**
     * @param releaseVersion The AMI version of the Amazon EKS optimized AMI to use with your node
     * group (for example, `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the
     * node group's current Kubernetes version is used. For more information, see [Amazon EKS optimized
     * Linux AMI
     * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
     * *Amazon EKS User Guide* .
     *
     * Changing this value triggers an update of the node group if one is available. You can't
     * update other properties at the same time as updating `Release Version` .
     */
    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    /**
     * @param remoteAccess The remote access configuration to use with your node group.
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun remoteAccess(remoteAccess: IResolvable) {
      cdkBuilder.remoteAccess(remoteAccess.let(IResolvable::unwrap))
    }

    /**
     * @param remoteAccess The remote access configuration to use with your node group.
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty) {
      cdkBuilder.remoteAccess(remoteAccess.let(CfnNodegroup.RemoteAccessProperty::unwrap))
    }

    /**
     * @param remoteAccess The remote access configuration to use with your node group.
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f39ff54f381c2a00ad3b9e744a041218336b0931c5b42b819859c985d10a3a5")
    override fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit):
        Unit = remoteAccess(CfnNodegroup.RemoteAccessProperty(remoteAccess))

    /**
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group.
     */
    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group.
     */
    override fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(CfnNodegroup.ScalingConfigProperty::unwrap))
    }

    /**
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cab8b43e22c8f3fdacd3df66c43824c9b0a4a40d16c5ee222a381428ce2bcce6")
    override
        fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty.Builder.() -> Unit):
        Unit = scalingConfig(CfnNodegroup.ScalingConfigProperty(scalingConfig))

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     * If you specify `launchTemplate` , then don't specify
     * `[SubnetId](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    /**
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     * If you specify `launchTemplate` , then don't specify
     * `[SubnetId](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     */
    override fun taints(taints: IResolvable) {
      cdkBuilder.taints(taints.let(IResolvable::unwrap))
    }

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     */
    override fun taints(taints: List<Any>) {
      cdkBuilder.taints(taints)
    }

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created.
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     */
    override fun taints(vararg taints: Any): Unit = taints(taints.toList())

    /**
     * @param updateConfig The node group update configuration.
     */
    override fun updateConfig(updateConfig: IResolvable) {
      cdkBuilder.updateConfig(updateConfig.let(IResolvable::unwrap))
    }

    /**
     * @param updateConfig The node group update configuration.
     */
    override fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty) {
      cdkBuilder.updateConfig(updateConfig.let(CfnNodegroup.UpdateConfigProperty::unwrap))
    }

    /**
     * @param updateConfig The node group update configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4dbafb1a7a495a5b14585187cd5802fbf5edeac3c315a8210bb3125da71894")
    override fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty.Builder.() -> Unit):
        Unit = updateConfig(CfnNodegroup.UpdateConfigProperty(updateConfig))

    /**
     * @param version The Kubernetes version to use for your managed nodes.
     * By default, the Kubernetes version of the cluster is used, and this is the only accepted
     * specified value. If you specify `launchTemplate` , and your launch template uses a custom AMI,
     * then don't specify `version` , or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     *
     * You can't update other properties at the same time as updating `Version` .
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnNodegroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.CfnNodegroupProps,
  ) : CdkObject(cdkObject), CfnNodegroupProps {
    /**
     * The AMI type for your node group.
     *
     * If you specify `launchTemplate` , and your launch template uses a custom AMI, then don't
     * specify `amiType` , or the node group deployment will fail. If your launch template uses a
     * Windows custom AMI, then add `eks:kube-proxy-windows` to your Windows nodes `rolearn` in the
     * `aws-auth` `ConfigMap` . For more information about using launch templates with Amazon EKS, see
     * [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype)
     */
    override fun amiType(): String? = unwrap(this).getAmiType()

    /**
     * The capacity type of your managed node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-capacitytype)
     */
    override fun capacityType(): String? = unwrap(this).getCapacityType()

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The root device disk size (in GiB) for your node group instances.
     *
     * The default disk size is 20 GiB for Linux and Bottlerocket. The default disk size is 50 GiB
     * for Windows. If you specify `launchTemplate` , then don't specify `diskSize` , or the node group
     * deployment will fail. For more information about using launch templates with Amazon EKS, see
     * [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize)
     */
    override fun diskSize(): Number? = unwrap(this).getDiskSize()

    /**
     * Force the update if any `Pod` on the existing node group can't be drained due to a `Pod`
     * disruption budget issue.
     *
     * If an update fails because all Pods can't be drained, you can force the update after it fails
     * to terminate the old node whether or not any `Pod` is running on the node.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled)
     */
    override fun forceUpdateEnabled(): Any? = unwrap(this).getForceUpdateEnabled()

    /**
     * Specify the instance types for a node group.
     *
     * If you specify a GPU instance type, make sure to also specify an applicable GPU AMI type with
     * the `amiType` parameter. If you specify `launchTemplate` , then you can specify zero or one
     * instance type in your launch template *or* you can specify 0-20 instance types for
     * `instanceTypes` . If however, you specify an instance type in your launch template *and* specify
     * any `instanceTypes` , the node group deployment will fail. If you don't specify an instance type
     * in a launch template or for `instanceTypes` , then `t3.medium` is used, by default. If you
     * specify `Spot` for `capacityType` , then we recommend specifying multiple values for
     * `instanceTypes` . For more information, see [Managed node group capacity
     * types](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html#managed-node-group-capacity-types)
     * and [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes)
     */
    override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    /**
     * The Kubernetes `labels` applied to the nodes in the node group.
     *
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     */
    override fun labels(): Any? = unwrap(this).getLabels()

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     */
    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to associate with your node group.
     *
     * The Amazon EKS worker node `kubelet` daemon makes calls to AWS APIs on your behalf. Nodes
     * receive permissions for these API calls through an IAM instance profile and associated policies.
     * Before you can launch nodes and register them into a cluster, you must create an IAM role for
     * those nodes to use when they are launched. For more information, see [Amazon EKS node IAM
     * role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html) in the **Amazon
     * EKS User Guide** . If you specify `launchTemplate` , then don't specify
     * `[IamInstanceProfile](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole)
     */
    override fun nodeRole(): String = unwrap(this).getNodeRole()

    /**
     * The unique name to give your node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname)
     */
    override fun nodegroupName(): String? = unwrap(this).getNodegroupName()

    /**
     * The AMI version of the Amazon EKS optimized AMI to use with your node group (for example,
     * `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the node group's
     * current Kubernetes version is used. For more information, see [Amazon EKS optimized Linux AMI
     * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
     * *Amazon EKS User Guide* .
     *
     *
     * Changing this value triggers an update of the node group if one is available. You can't
     * update other properties at the same time as updating `Release Version` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion)
     */
    override fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

    /**
     * The remote access configuration to use with your node group.
     *
     * For Linux, the protocol is SSH. For Windows, the protocol is RDP. If you specify
     * `launchTemplate` , then don't specify `remoteAccess` , or the node group deployment will fail.
     * For more information about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-remoteaccess)
     */
    override fun remoteAccess(): Any? = unwrap(this).getRemoteAccess()

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     */
    override fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

    /**
     * The subnets to use for the Auto Scaling group that is created for your node group.
     *
     * If you specify `launchTemplate` , then don't specify
     * `[SubnetId](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)`
     * in your launch template, or the node group deployment will fail. For more information about
     * using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets)
     */
    override fun subnets(): List<String> = unwrap(this).getSubnets()

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     */
    override fun taints(): Any? = unwrap(this).getTaints()

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     */
    override fun updateConfig(): Any? = unwrap(this).getUpdateConfig()

    /**
     * The Kubernetes version to use for your managed nodes.
     *
     * By default, the Kubernetes version of the cluster is used, and this is the only accepted
     * specified value. If you specify `launchTemplate` , and your launch template uses a custom AMI,
     * then don't specify `version` , or the node group deployment will fail. For more information
     * about using launch templates with Amazon EKS, see [Launch template
     * support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html) in the *Amazon
     * EKS User Guide* .
     *
     *
     * You can't update other properties at the same time as updating `Version` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version)
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNodegroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroupProps):
        CfnNodegroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNodegroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNodegroupProps):
        software.amazon.awscdk.services.eks.CfnNodegroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.CfnNodegroupProps
  }
}
