package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNodegroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The AMI type for your node group.
   */
  public open fun amiType(): String? = unwrap(this).getAmiType()

  /**
   * The AMI type for your node group.
   */
  public open fun amiType(`value`: String) {
    unwrap(this).setAmiType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) associated with the managed node group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of your cluster.
   */
  public open fun attrClusterName(): String = unwrap(this).getAttrClusterName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name associated with an Amazon EKS managed node group.
   */
  public open fun attrNodegroupName(): String = unwrap(this).getAttrNodegroupName()

  /**
   * The capacity type of your managed node group.
   */
  public open fun capacityType(): String? = unwrap(this).getCapacityType()

  /**
   * The capacity type of your managed node group.
   */
  public open fun capacityType(`value`: String) {
    unwrap(this).setCapacityType(`value`)
  }

  /**
   * The name of your cluster.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The root device disk size (in GiB) for your node group instances.
   */
  public open fun diskSize(): Number? = unwrap(this).getDiskSize()

  /**
   * The root device disk size (in GiB) for your node group instances.
   */
  public open fun diskSize(`value`: Number) {
    unwrap(this).setDiskSize(`value`)
  }

  /**
   * Force the update if any `Pod` on the existing node group can't be drained due to a `Pod`
   * disruption budget issue.
   */
  public open fun forceUpdateEnabled(): Any? = unwrap(this).getForceUpdateEnabled()

  /**
   * Force the update if any `Pod` on the existing node group can't be drained due to a `Pod`
   * disruption budget issue.
   */
  public open fun forceUpdateEnabled(`value`: Boolean) {
    unwrap(this).setForceUpdateEnabled(`value`)
  }

  /**
   * Force the update if any `Pod` on the existing node group can't be drained due to a `Pod`
   * disruption budget issue.
   */
  public open fun forceUpdateEnabled(`value`: IResolvable) {
    unwrap(this).setForceUpdateEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specify the instance types for a node group.
   */
  public open fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  /**
   * Specify the instance types for a node group.
   */
  public open fun instanceTypes(`value`: List<String>) {
    unwrap(this).setInstanceTypes(`value`)
  }

  /**
   * Specify the instance types for a node group.
   */
  public open fun instanceTypes(vararg `value`: String): Unit = instanceTypes(`value`.toList())

  /**
   * The Kubernetes `labels` applied to the nodes in the node group.
   */
  public open fun labels(): Any? = unwrap(this).getLabels()

  /**
   * The Kubernetes `labels` applied to the nodes in the node group.
   */
  public open fun labels(`value`: IResolvable) {
    unwrap(this).setLabels(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Kubernetes `labels` applied to the nodes in the node group.
   */
  public open fun labels(`value`: Map<String, String>) {
    unwrap(this).setLabels(`value`)
  }

  /**
   * An object representing a node group's launch template specification.
   */
  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * An object representing a node group's launch template specification.
   */
  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object representing a node group's launch template specification.
   */
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateSpecificationProperty::unwrap))
  }

  /**
   * An object representing a node group's launch template specification.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a5f66481a02aaf3745dcc97639fe91048324fa5a66dbd712c77907fb65a95a4")
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
      Unit = launchTemplate(LaunchTemplateSpecificationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the IAM role to associate with your node group.
   */
  public open fun nodeRole(): String = unwrap(this).getNodeRole()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to associate with your node group.
   */
  public open fun nodeRole(`value`: String) {
    unwrap(this).setNodeRole(`value`)
  }

  /**
   * The unique name to give your node group.
   */
  public open fun nodegroupName(): String? = unwrap(this).getNodegroupName()

  /**
   * The unique name to give your node group.
   */
  public open fun nodegroupName(`value`: String) {
    unwrap(this).setNodegroupName(`value`)
  }

  /**
   * The AMI version of the Amazon EKS optimized AMI to use with your node group (for example,
   * `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the node group's current
   * Kubernetes version is used. For more information, see [Amazon EKS optimized Linux AMI
   * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
   * *Amazon EKS User Guide* .
   */
  public open fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

  /**
   * The AMI version of the Amazon EKS optimized AMI to use with your node group (for example,
   * `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the node group's current
   * Kubernetes version is used. For more information, see [Amazon EKS optimized Linux AMI
   * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
   * *Amazon EKS User Guide* .
   */
  public open fun releaseVersion(`value`: String) {
    unwrap(this).setReleaseVersion(`value`)
  }

  /**
   * The remote access configuration to use with your node group.
   */
  public open fun remoteAccess(): Any? = unwrap(this).getRemoteAccess()

  /**
   * The remote access configuration to use with your node group.
   */
  public open fun remoteAccess(`value`: IResolvable) {
    unwrap(this).setRemoteAccess(`value`.let(IResolvable::unwrap))
  }

  /**
   * The remote access configuration to use with your node group.
   */
  public open fun remoteAccess(`value`: RemoteAccessProperty) {
    unwrap(this).setRemoteAccess(`value`.let(RemoteAccessProperty::unwrap))
  }

  /**
   * The remote access configuration to use with your node group.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0a13b210227591ba798c1f3cc9326757e84e45bb46380b951fa2e82121e78f5")
  public open fun remoteAccess(`value`: RemoteAccessProperty.Builder.() -> Unit): Unit =
      remoteAccess(RemoteAccessProperty(`value`))

  /**
   * The scaling configuration details for the Auto Scaling group that is created for your node
   * group.
   */
  public open fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  /**
   * The scaling configuration details for the Auto Scaling group that is created for your node
   * group.
   */
  public open fun scalingConfig(`value`: IResolvable) {
    unwrap(this).setScalingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The scaling configuration details for the Auto Scaling group that is created for your node
   * group.
   */
  public open fun scalingConfig(`value`: ScalingConfigProperty) {
    unwrap(this).setScalingConfig(`value`.let(ScalingConfigProperty::unwrap))
  }

  /**
   * The scaling configuration details for the Auto Scaling group that is created for your node
   * group.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01eaf0ee320f0401dfa3956db7b14aefb52fff51ca80253b1ed3d533a61b70db")
  public open fun scalingConfig(`value`: ScalingConfigProperty.Builder.() -> Unit): Unit =
      scalingConfig(ScalingConfigProperty(`value`))

  /**
   * The subnets to use for the Auto Scaling group that is created for your node group.
   */
  public open fun subnets(): List<String> = unwrap(this).getSubnets()

  /**
   * The subnets to use for the Auto Scaling group that is created for your node group.
   */
  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  /**
   * The subnets to use for the Auto Scaling group that is created for your node group.
   */
  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The Kubernetes taints to be applied to the nodes in the node group when they are created.
   */
  public open fun taints(): Any? = unwrap(this).getTaints()

  /**
   * The Kubernetes taints to be applied to the nodes in the node group when they are created.
   */
  public open fun taints(`value`: IResolvable) {
    unwrap(this).setTaints(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Kubernetes taints to be applied to the nodes in the node group when they are created.
   */
  public open fun taints(__idx_ac66f0: List<Any>) {
    unwrap(this).setTaints(__idx_ac66f0)
  }

  /**
   * The Kubernetes taints to be applied to the nodes in the node group when they are created.
   */
  public open fun taints(vararg __idx_ac66f0: Any): Unit = taints(__idx_ac66f0.toList())

  /**
   * The node group update configuration.
   */
  public open fun updateConfig(): Any? = unwrap(this).getUpdateConfig()

  /**
   * The node group update configuration.
   */
  public open fun updateConfig(`value`: IResolvable) {
    unwrap(this).setUpdateConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The node group update configuration.
   */
  public open fun updateConfig(`value`: UpdateConfigProperty) {
    unwrap(this).setUpdateConfig(`value`.let(UpdateConfigProperty::unwrap))
  }

  /**
   * The node group update configuration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fb53899535eaab6a1c796449b23e0b1f9e8e4468252c065115715c2f546fa751")
  public open fun updateConfig(`value`: UpdateConfigProperty.Builder.() -> Unit): Unit =
      updateConfig(UpdateConfigProperty(`value`))

  /**
   * The Kubernetes version to use for your managed nodes.
   */
  public open fun version(): String? = unwrap(this).getVersion()

  /**
   * The Kubernetes version to use for your managed nodes.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnNodegroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param amiType The AMI type for your node group. 
     */
    public fun amiType(amiType: String)

    /**
     * The capacity type of your managed node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-capacitytype)
     * @param capacityType The capacity type of your managed node group. 
     */
    public fun capacityType(capacityType: String)

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername)
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

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
     * @param diskSize The root device disk size (in GiB) for your node group instances. 
     */
    public fun diskSize(diskSize: Number)

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
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue. 
     */
    public fun forceUpdateEnabled(forceUpdateEnabled: Boolean)

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
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue. 
     */
    public fun forceUpdateEnabled(forceUpdateEnabled: IResolvable)

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
     * @param instanceTypes Specify the instance types for a node group. 
     */
    public fun instanceTypes(instanceTypes: List<String>)

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
     * @param instanceTypes Specify the instance types for a node group. 
     */
    public fun instanceTypes(vararg instanceTypes: String)

    /**
     * The Kubernetes `labels` applied to the nodes in the node group.
     *
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     * @param labels The Kubernetes `labels` applied to the nodes in the node group. 
     */
    public fun labels(labels: IResolvable)

    /**
     * The Kubernetes `labels` applied to the nodes in the node group.
     *
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     * @param labels The Kubernetes `labels` applied to the nodes in the node group. 
     */
    public fun labels(labels: Map<String, String>)

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     * @param launchTemplate An object representing a node group's launch template specification. 
     */
    public fun launchTemplate(launchTemplate: IResolvable)

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     * @param launchTemplate An object representing a node group's launch template specification. 
     */
    public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     * @param launchTemplate An object representing a node group's launch template specification. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5068e50e47e72b3ca242878b66224aab505a0ee1fd81a4c5f18f7fa09be6ffbb")
    public
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

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
     * @param nodeRole The Amazon Resource Name (ARN) of the IAM role to associate with your node
     * group. 
     */
    public fun nodeRole(nodeRole: String)

    /**
     * The unique name to give your node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname)
     * @param nodegroupName The unique name to give your node group. 
     */
    public fun nodegroupName(nodegroupName: String)

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
     * @param releaseVersion The AMI version of the Amazon EKS optimized AMI to use with your node
     * group (for example, `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the
     * node group's current Kubernetes version is used. For more information, see [Amazon EKS optimized
     * Linux AMI
     * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
     * *Amazon EKS User Guide* . 
     */
    public fun releaseVersion(releaseVersion: String)

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
     * @param remoteAccess The remote access configuration to use with your node group. 
     */
    public fun remoteAccess(remoteAccess: IResolvable)

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
     * @param remoteAccess The remote access configuration to use with your node group. 
     */
    public fun remoteAccess(remoteAccess: RemoteAccessProperty)

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
     * @param remoteAccess The remote access configuration to use with your node group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82542f9443ef3a2998f13604cf218be5d421703ca8bd76e7665b75614c9a70bb")
    public fun remoteAccess(remoteAccess: RemoteAccessProperty.Builder.() -> Unit)

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group. 
     */
    public fun scalingConfig(scalingConfig: IResolvable)

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group. 
     */
    public fun scalingConfig(scalingConfig: ScalingConfigProperty)

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d474cf15f29677c1e2f73f1335826830b07542e05be7dce571165d79bfd1c7b")
    public fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit)

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
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    public fun subnets(subnets: List<String>)

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
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    public fun subnets(vararg subnets: String)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    public fun taints(taints: IResolvable)

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    public fun taints(taints: List<Any>)

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    public fun taints(vararg taints: Any)

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     * @param updateConfig The node group update configuration. 
     */
    public fun updateConfig(updateConfig: IResolvable)

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     * @param updateConfig The node group update configuration. 
     */
    public fun updateConfig(updateConfig: UpdateConfigProperty)

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     * @param updateConfig The node group update configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10744ef3f8e694462160026bb5d9bfd15ba5bf27ea2f4c0c27caa1bb5194d743")
    public fun updateConfig(updateConfig: UpdateConfigProperty.Builder.() -> Unit)

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
     * @param version The Kubernetes version to use for your managed nodes. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnNodegroup.Builder =
        software.amazon.awscdk.services.eks.CfnNodegroup.Builder.create(scope, id)

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
     * @param amiType The AMI type for your node group. 
     */
    override fun amiType(amiType: String) {
      cdkBuilder.amiType(amiType)
    }

    /**
     * The capacity type of your managed node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-capacitytype)
     * @param capacityType The capacity type of your managed node group. 
     */
    override fun capacityType(capacityType: String) {
      cdkBuilder.capacityType(capacityType)
    }

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername)
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

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
     * @param diskSize The root device disk size (in GiB) for your node group instances. 
     */
    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

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
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue. 
     */
    override fun forceUpdateEnabled(forceUpdateEnabled: Boolean) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
    }

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
     * @param forceUpdateEnabled Force the update if any `Pod` on the existing node group can't be
     * drained due to a `Pod` disruption budget issue. 
     */
    override fun forceUpdateEnabled(forceUpdateEnabled: IResolvable) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled.let(IResolvable::unwrap))
    }

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
     * @param instanceTypes Specify the instance types for a node group. 
     */
    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

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
     * @param instanceTypes Specify the instance types for a node group. 
     */
    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * The Kubernetes `labels` applied to the nodes in the node group.
     *
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     * @param labels The Kubernetes `labels` applied to the nodes in the node group. 
     */
    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    /**
     * The Kubernetes `labels` applied to the nodes in the node group.
     *
     *
     * Only `labels` that are applied with the Amazon EKS API are shown here. There may be other
     * Kubernetes `labels` applied to the nodes in this group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels)
     * @param labels The Kubernetes `labels` applied to the nodes in the node group. 
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     * @param launchTemplate An object representing a node group's launch template specification. 
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     * @param launchTemplate An object representing a node group's launch template specification. 
     */
    override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
    }

    /**
     * An object representing a node group's launch template specification.
     *
     * If specified, then do not specify `instanceTypes` , `diskSize` , or `remoteAccess` and make
     * sure that the launch template meets the requirements in `launchTemplateSpecification` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-launchtemplate)
     * @param launchTemplate An object representing a node group's launch template specification. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5068e50e47e72b3ca242878b66224aab505a0ee1fd81a4c5f18f7fa09be6ffbb")
    override
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

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
     * @param nodeRole The Amazon Resource Name (ARN) of the IAM role to associate with your node
     * group. 
     */
    override fun nodeRole(nodeRole: String) {
      cdkBuilder.nodeRole(nodeRole)
    }

    /**
     * The unique name to give your node group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname)
     * @param nodegroupName The unique name to give your node group. 
     */
    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

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
     * @param releaseVersion The AMI version of the Amazon EKS optimized AMI to use with your node
     * group (for example, `1.14.7- *YYYYMMDD*` ). By default, the latest available AMI version for the
     * node group's current Kubernetes version is used. For more information, see [Amazon EKS optimized
     * Linux AMI
     * Versions](https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html) in the
     * *Amazon EKS User Guide* . 
     */
    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

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
     * @param remoteAccess The remote access configuration to use with your node group. 
     */
    override fun remoteAccess(remoteAccess: IResolvable) {
      cdkBuilder.remoteAccess(remoteAccess.let(IResolvable::unwrap))
    }

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
     * @param remoteAccess The remote access configuration to use with your node group. 
     */
    override fun remoteAccess(remoteAccess: RemoteAccessProperty) {
      cdkBuilder.remoteAccess(remoteAccess.let(RemoteAccessProperty::unwrap))
    }

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
     * @param remoteAccess The remote access configuration to use with your node group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82542f9443ef3a2998f13604cf218be5d421703ca8bd76e7665b75614c9a70bb")
    override fun remoteAccess(remoteAccess: RemoteAccessProperty.Builder.() -> Unit): Unit =
        remoteAccess(RemoteAccessProperty(remoteAccess))

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group. 
     */
    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group. 
     */
    override fun scalingConfig(scalingConfig: ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(ScalingConfigProperty::unwrap))
    }

    /**
     * The scaling configuration details for the Auto Scaling group that is created for your node
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-scalingconfig)
     * @param scalingConfig The scaling configuration details for the Auto Scaling group that is
     * created for your node group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d474cf15f29677c1e2f73f1335826830b07542e05be7dce571165d79bfd1c7b")
    override fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit): Unit =
        scalingConfig(ScalingConfigProperty(scalingConfig))

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
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

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
     * @param subnets The subnets to use for the Auto Scaling group that is created for your node
     * group. 
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    override fun taints(taints: IResolvable) {
      cdkBuilder.taints(taints.let(IResolvable::unwrap))
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    override fun taints(taints: List<Any>) {
      cdkBuilder.taints(taints)
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group when they are created.
     *
     * Effect is one of `No_Schedule` , `Prefer_No_Schedule` , or `No_Execute` . Kubernetes taints
     * can be used together with tolerations to control how workloads are scheduled to your nodes. For
     * more information, see [Node taints on managed node
     * groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-taints)
     * @param taints The Kubernetes taints to be applied to the nodes in the node group when they
     * are created. 
     */
    override fun taints(vararg taints: Any): Unit = taints(taints.toList())

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     * @param updateConfig The node group update configuration. 
     */
    override fun updateConfig(updateConfig: IResolvable) {
      cdkBuilder.updateConfig(updateConfig.let(IResolvable::unwrap))
    }

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     * @param updateConfig The node group update configuration. 
     */
    override fun updateConfig(updateConfig: UpdateConfigProperty) {
      cdkBuilder.updateConfig(updateConfig.let(UpdateConfigProperty::unwrap))
    }

    /**
     * The node group update configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-updateconfig)
     * @param updateConfig The node group update configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10744ef3f8e694462160026bb5d9bfd15ba5bf27ea2f4c0c27caa1bb5194d743")
    override fun updateConfig(updateConfig: UpdateConfigProperty.Builder.() -> Unit): Unit =
        updateConfig(UpdateConfigProperty(updateConfig))

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
     * @param version The Kubernetes version to use for your managed nodes. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNodegroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNodegroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup): CfnNodegroup =
        CfnNodegroup(cdkObject)

    internal fun unwrap(wrapped: CfnNodegroup): software.amazon.awscdk.services.eks.CfnNodegroup =
        wrapped.cdkObject
  }

  public interface TaintProperty {
    /**
     * The effect of the taint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html#cfn-eks-nodegroup-taint-effect)
     */
    public fun effect(): String? = unwrap(this).getEffect()

    /**
     * The key of the taint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html#cfn-eks-nodegroup-taint-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value of the taint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html#cfn-eks-nodegroup-taint-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TaintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param effect The effect of the taint.
       */
      public fun effect(effect: String)

      /**
       * @param key The key of the taint.
       */
      public fun key(key: String)

      /**
       * @param value The value of the taint.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty.Builder
          = software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty.builder()

      /**
       * @param effect The effect of the taint.
       */
      override fun effect(effect: String) {
        cdkBuilder.effect(effect)
      }

      /**
       * @param key The key of the taint.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the taint.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty,
    ) : TaintProperty {
      /**
       * The effect of the taint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html#cfn-eks-nodegroup-taint-effect)
       */
      override fun effect(): String? = unwrap(this).getEffect()

      /**
       * The key of the taint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html#cfn-eks-nodegroup-taint-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value of the taint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html#cfn-eks-nodegroup-taint-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty):
          TaintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaintProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateSpecificationProperty {
    /**
     * The ID of the launch template.
     *
     * You must specify either the launch template ID or the launch template name in the request,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html#cfn-eks-nodegroup-launchtemplatespecification-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The name of the launch template.
     *
     * You must specify either the launch template name or the launch template ID in the request,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html#cfn-eks-nodegroup-launchtemplatespecification-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The version number of the launch template to use.
     *
     * If no version is specified, then the template's default version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html#cfn-eks-nodegroup-launchtemplatespecification-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [LaunchTemplateSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the launch template.
       * You must specify either the launch template ID or the launch template name in the request,
       * but not both.
       */
      public fun id(id: String)

      /**
       * @param name The name of the launch template.
       * You must specify either the launch template name or the launch template ID in the request,
       * but not both.
       */
      public fun name(name: String)

      /**
       * @param version The version number of the launch template to use.
       * If no version is specified, then the template's default version is used.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty.builder()

      /**
       * @param id The ID of the launch template.
       * You must specify either the launch template ID or the launch template name in the request,
       * but not both.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the launch template.
       * You must specify either the launch template name or the launch template ID in the request,
       * but not both.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version number of the launch template to use.
       * If no version is specified, then the template's default version is used.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty,
    ) : LaunchTemplateSpecificationProperty {
      /**
       * The ID of the launch template.
       *
       * You must specify either the launch template ID or the launch template name in the request,
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html#cfn-eks-nodegroup-launchtemplatespecification-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The name of the launch template.
       *
       * You must specify either the launch template name or the launch template ID in the request,
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html#cfn-eks-nodegroup-launchtemplatespecification-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The version number of the launch template to use.
       *
       * If no version is specified, then the template's default version is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html#cfn-eks-nodegroup-launchtemplatespecification-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RemoteAccessProperty {
    /**
     * The Amazon EC2 SSH key name that provides access for SSH communication with the nodes in the
     * managed node group.
     *
     * For more information, see [Amazon EC2 key pairs and Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
     * *Amazon Elastic Compute Cloud User Guide for Linux Instances* . For Windows, an Amazon EC2 SSH
     * key is used to obtain the RDP password. For more information, see [Amazon EC2 key pairs and
     * Windows instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-key-pairs.html) in
     * the *Amazon Elastic Compute Cloud User Guide for Windows Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-ec2sshkey)
     */
    public fun ec2SshKey(): String

    /**
     * The security group IDs that are allowed SSH access (port 22) to the nodes.
     *
     * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a
     * source security group when you create a managed node group, then the port on the nodes is opened
     * to the internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
     * Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-sourcesecuritygroups)
     */
    public fun sourceSecurityGroups(): List<String> = unwrap(this).getSourceSecurityGroups() ?:
        emptyList()

    /**
     * A builder for [RemoteAccessProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ec2SshKey The Amazon EC2 SSH key name that provides access for SSH communication
       * with the nodes in the managed node group. 
       * For more information, see [Amazon EC2 key pairs and Linux
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
       * *Amazon Elastic Compute Cloud User Guide for Linux Instances* . For Windows, an Amazon EC2 SSH
       * key is used to obtain the RDP password. For more information, see [Amazon EC2 key pairs and
       * Windows instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-key-pairs.html)
       * in the *Amazon Elastic Compute Cloud User Guide for Windows Instances* .
       */
      public fun ec2SshKey(ec2SshKey: String)

      /**
       * @param sourceSecurityGroups The security group IDs that are allowed SSH access (port 22) to
       * the nodes.
       * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a
       * source security group when you create a managed node group, then the port on the nodes is
       * opened to the internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * Virtual Private Cloud User Guide* .
       */
      public fun sourceSecurityGroups(sourceSecurityGroups: List<String>)

      /**
       * @param sourceSecurityGroups The security group IDs that are allowed SSH access (port 22) to
       * the nodes.
       * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a
       * source security group when you create a managed node group, then the port on the nodes is
       * opened to the internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * Virtual Private Cloud User Guide* .
       */
      public fun sourceSecurityGroups(vararg sourceSecurityGroups: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty.Builder =
          software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty.builder()

      /**
       * @param ec2SshKey The Amazon EC2 SSH key name that provides access for SSH communication
       * with the nodes in the managed node group. 
       * For more information, see [Amazon EC2 key pairs and Linux
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
       * *Amazon Elastic Compute Cloud User Guide for Linux Instances* . For Windows, an Amazon EC2 SSH
       * key is used to obtain the RDP password. For more information, see [Amazon EC2 key pairs and
       * Windows instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-key-pairs.html)
       * in the *Amazon Elastic Compute Cloud User Guide for Windows Instances* .
       */
      override fun ec2SshKey(ec2SshKey: String) {
        cdkBuilder.ec2SshKey(ec2SshKey)
      }

      /**
       * @param sourceSecurityGroups The security group IDs that are allowed SSH access (port 22) to
       * the nodes.
       * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a
       * source security group when you create a managed node group, then the port on the nodes is
       * opened to the internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * Virtual Private Cloud User Guide* .
       */
      override fun sourceSecurityGroups(sourceSecurityGroups: List<String>) {
        cdkBuilder.sourceSecurityGroups(sourceSecurityGroups)
      }

      /**
       * @param sourceSecurityGroups The security group IDs that are allowed SSH access (port 22) to
       * the nodes.
       * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a
       * source security group when you create a managed node group, then the port on the nodes is
       * opened to the internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * Virtual Private Cloud User Guide* .
       */
      override fun sourceSecurityGroups(vararg sourceSecurityGroups: String): Unit =
          sourceSecurityGroups(sourceSecurityGroups.toList())

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty,
    ) : RemoteAccessProperty {
      /**
       * The Amazon EC2 SSH key name that provides access for SSH communication with the nodes in
       * the managed node group.
       *
       * For more information, see [Amazon EC2 key pairs and Linux
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
       * *Amazon Elastic Compute Cloud User Guide for Linux Instances* . For Windows, an Amazon EC2 SSH
       * key is used to obtain the RDP password. For more information, see [Amazon EC2 key pairs and
       * Windows instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-key-pairs.html)
       * in the *Amazon Elastic Compute Cloud User Guide for Windows Instances* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-ec2sshkey)
       */
      override fun ec2SshKey(): String = unwrap(this).getEc2SshKey()

      /**
       * The security group IDs that are allowed SSH access (port 22) to the nodes.
       *
       * For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a
       * source security group when you create a managed node group, then the port on the nodes is
       * opened to the internet ( `0.0.0.0/0` ). For more information, see [Security Groups for Your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * Virtual Private Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html#cfn-eks-nodegroup-remoteaccess-sourcesecuritygroups)
       */
      override fun sourceSecurityGroups(): List<String> = unwrap(this).getSourceSecurityGroups() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RemoteAccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty):
          RemoteAccessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoteAccessProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UpdateConfigProperty {
    /**
     * The maximum number of nodes unavailable at once during a version update.
     *
     * Nodes are updated in parallel. This value or `maxUnavailablePercentage` is required to have a
     * value.The maximum number is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailable)
     */
    public fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

    /**
     * The maximum percentage of nodes unavailable during a version update.
     *
     * This percentage of nodes are updated in parallel, up to 100 nodes at once. This value or
     * `maxUnavailable` is required to have a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailablepercentage)
     */
    public fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()

    /**
     * A builder for [UpdateConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxUnavailable The maximum number of nodes unavailable at once during a version
       * update.
       * Nodes are updated in parallel. This value or `maxUnavailablePercentage` is required to have
       * a value.The maximum number is 100.
       */
      public fun maxUnavailable(maxUnavailable: Number)

      /**
       * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a
       * version update.
       * This percentage of nodes are updated in parallel, up to 100 nodes at once. This value or
       * `maxUnavailable` is required to have a value.
       */
      public fun maxUnavailablePercentage(maxUnavailablePercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty.builder()

      /**
       * @param maxUnavailable The maximum number of nodes unavailable at once during a version
       * update.
       * Nodes are updated in parallel. This value or `maxUnavailablePercentage` is required to have
       * a value.The maximum number is 100.
       */
      override fun maxUnavailable(maxUnavailable: Number) {
        cdkBuilder.maxUnavailable(maxUnavailable)
      }

      /**
       * @param maxUnavailablePercentage The maximum percentage of nodes unavailable during a
       * version update.
       * This percentage of nodes are updated in parallel, up to 100 nodes at once. This value or
       * `maxUnavailable` is required to have a value.
       */
      override fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
        cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty,
    ) : UpdateConfigProperty {
      /**
       * The maximum number of nodes unavailable at once during a version update.
       *
       * Nodes are updated in parallel. This value or `maxUnavailablePercentage` is required to have
       * a value.The maximum number is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailable)
       */
      override fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

      /**
       * The maximum percentage of nodes unavailable during a version update.
       *
       * This percentage of nodes are updated in parallel, up to 100 nodes at once. This value or
       * `maxUnavailable` is required to have a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html#cfn-eks-nodegroup-updateconfig-maxunavailablepercentage)
       */
      override fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UpdateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty):
          UpdateConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateConfigProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScalingConfigProperty {
    /**
     * The current number of nodes that the managed node group should maintain.
     *
     *
     * If you use the Kubernetes [Cluster
     * Autoscaler](https://docs.aws.amazon.com/https://github.com/kubernetes/autoscaler#kubernetes-autoscaler)
     * , you shouldn't change the `desiredSize` value directly, as this can cause the Cluster
     * Autoscaler to suddenly scale up or scale down.
     *
     *
     * Whenever this parameter changes, the number of worker nodes in the node group is updated to
     * the specified size. If this parameter is given a value that is smaller than the current number
     * of running worker nodes, the necessary number of worker nodes are terminated to match the given
     * value. When using CloudFormation, no action occurs if you remove this parameter from your CFN
     * template.
     *
     * This parameter can be different from `minSize` in some cases, such as when starting with
     * extra hosts for testing. This parameter can also be different when you want to start with an
     * estimated number of needed hosts, but let the Cluster Autoscaler reduce the number if there are
     * too many. When the Cluster Autoscaler is used, the `desiredSize` parameter is altered by the
     * Cluster Autoscaler (but can be out-of-date for short periods of time). the Cluster Autoscaler
     * doesn't scale a managed node group lower than `minSize` or higher than `maxSize` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-desiredsize)
     */
    public fun desiredSize(): Number? = unwrap(this).getDesiredSize()

    /**
     * The maximum number of nodes that the managed node group can scale out to.
     *
     * For information about the maximum number that you can specify, see [Amazon EKS service
     * quotas](https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html) in the *Amazon EKS
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-maxsize)
     */
    public fun maxSize(): Number? = unwrap(this).getMaxSize()

    /**
     * The minimum number of nodes that the managed node group can scale in to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-minsize)
     */
    public fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * A builder for [ScalingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredSize The current number of nodes that the managed node group should maintain.
       *
       * If you use the Kubernetes [Cluster
       * Autoscaler](https://docs.aws.amazon.com/https://github.com/kubernetes/autoscaler#kubernetes-autoscaler)
       * , you shouldn't change the `desiredSize` value directly, as this can cause the Cluster
       * Autoscaler to suddenly scale up or scale down.
       *
       *
       * Whenever this parameter changes, the number of worker nodes in the node group is updated to
       * the specified size. If this parameter is given a value that is smaller than the current number
       * of running worker nodes, the necessary number of worker nodes are terminated to match the
       * given value. When using CloudFormation, no action occurs if you remove this parameter from
       * your CFN template.
       *
       * This parameter can be different from `minSize` in some cases, such as when starting with
       * extra hosts for testing. This parameter can also be different when you want to start with an
       * estimated number of needed hosts, but let the Cluster Autoscaler reduce the number if there
       * are too many. When the Cluster Autoscaler is used, the `desiredSize` parameter is altered by
       * the Cluster Autoscaler (but can be out-of-date for short periods of time). the Cluster
       * Autoscaler doesn't scale a managed node group lower than `minSize` or higher than `maxSize` .
       */
      public fun desiredSize(desiredSize: Number)

      /**
       * @param maxSize The maximum number of nodes that the managed node group can scale out to.
       * For information about the maximum number that you can specify, see [Amazon EKS service
       * quotas](https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html) in the *Amazon
       * EKS User Guide* .
       */
      public fun maxSize(maxSize: Number)

      /**
       * @param minSize The minimum number of nodes that the managed node group can scale in to.
       */
      public fun minSize(minSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty.builder()

      /**
       * @param desiredSize The current number of nodes that the managed node group should maintain.
       *
       * If you use the Kubernetes [Cluster
       * Autoscaler](https://docs.aws.amazon.com/https://github.com/kubernetes/autoscaler#kubernetes-autoscaler)
       * , you shouldn't change the `desiredSize` value directly, as this can cause the Cluster
       * Autoscaler to suddenly scale up or scale down.
       *
       *
       * Whenever this parameter changes, the number of worker nodes in the node group is updated to
       * the specified size. If this parameter is given a value that is smaller than the current number
       * of running worker nodes, the necessary number of worker nodes are terminated to match the
       * given value. When using CloudFormation, no action occurs if you remove this parameter from
       * your CFN template.
       *
       * This parameter can be different from `minSize` in some cases, such as when starting with
       * extra hosts for testing. This parameter can also be different when you want to start with an
       * estimated number of needed hosts, but let the Cluster Autoscaler reduce the number if there
       * are too many. When the Cluster Autoscaler is used, the `desiredSize` parameter is altered by
       * the Cluster Autoscaler (but can be out-of-date for short periods of time). the Cluster
       * Autoscaler doesn't scale a managed node group lower than `minSize` or higher than `maxSize` .
       */
      override fun desiredSize(desiredSize: Number) {
        cdkBuilder.desiredSize(desiredSize)
      }

      /**
       * @param maxSize The maximum number of nodes that the managed node group can scale out to.
       * For information about the maximum number that you can specify, see [Amazon EKS service
       * quotas](https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html) in the *Amazon
       * EKS User Guide* .
       */
      override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      /**
       * @param minSize The minimum number of nodes that the managed node group can scale in to.
       */
      override fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty,
    ) : ScalingConfigProperty {
      /**
       * The current number of nodes that the managed node group should maintain.
       *
       *
       * If you use the Kubernetes [Cluster
       * Autoscaler](https://docs.aws.amazon.com/https://github.com/kubernetes/autoscaler#kubernetes-autoscaler)
       * , you shouldn't change the `desiredSize` value directly, as this can cause the Cluster
       * Autoscaler to suddenly scale up or scale down.
       *
       *
       * Whenever this parameter changes, the number of worker nodes in the node group is updated to
       * the specified size. If this parameter is given a value that is smaller than the current number
       * of running worker nodes, the necessary number of worker nodes are terminated to match the
       * given value. When using CloudFormation, no action occurs if you remove this parameter from
       * your CFN template.
       *
       * This parameter can be different from `minSize` in some cases, such as when starting with
       * extra hosts for testing. This parameter can also be different when you want to start with an
       * estimated number of needed hosts, but let the Cluster Autoscaler reduce the number if there
       * are too many. When the Cluster Autoscaler is used, the `desiredSize` parameter is altered by
       * the Cluster Autoscaler (but can be out-of-date for short periods of time). the Cluster
       * Autoscaler doesn't scale a managed node group lower than `minSize` or higher than `maxSize` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-desiredsize)
       */
      override fun desiredSize(): Number? = unwrap(this).getDesiredSize()

      /**
       * The maximum number of nodes that the managed node group can scale out to.
       *
       * For information about the maximum number that you can specify, see [Amazon EKS service
       * quotas](https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html) in the *Amazon
       * EKS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-maxsize)
       */
      override fun maxSize(): Number? = unwrap(this).getMaxSize()

      /**
       * The minimum number of nodes that the managed node group can scale in to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html#cfn-eks-nodegroup-scalingconfig-minsize)
       */
      override fun minSize(): Number? = unwrap(this).getMinSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty):
          ScalingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
