@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon EKS control plane.
 *
 * The Amazon EKS control plane consists of control plane instances that run the Kubernetes
 * software, such as `etcd` and the API server. The control plane runs in an account managed by AWS ,
 * and the Kubernetes API is exposed by the Amazon EKS API server endpoint. Each Amazon EKS cluster
 * control plane is single tenant and unique. It runs on its own set of Amazon EC2 instances.
 *
 * The cluster control plane is provisioned across multiple Availability Zones and fronted by an
 * Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces
 * in your VPC subnets to provide connectivity from the control plane instances to the nodes (for
 * example, to support `kubectl exec` , `logs` , and `proxy` data flows).
 *
 * Amazon EKS nodes run in your AWS account and connect to your cluster's control plane over the
 * Kubernetes API server endpoint and a certificate file that is created for your cluster.
 *
 * You can use the `endpointPublicAccess` and `endpointPrivateAccess` parameters to enable or
 * disable public and private access to your cluster's Kubernetes API server endpoint. By default,
 * public access is enabled, and private access is disabled. For more information, see [Amazon EKS
 * Cluster Endpoint Access
 * Control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon EKS
 * User Guide** .
 *
 * You can use the `logging` parameter to enable or disable exporting the Kubernetes control plane
 * logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to
 * CloudWatch Logs. For more information, see [Amazon EKS Cluster Control Plane
 * Logs](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html) in the **Amazon EKS
 * User Guide** .
 *
 *
 * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control
 * plane logs. For more information, see [CloudWatch
 * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
 *
 *
 * In most cases, it takes several minutes to create a cluster. After you create an Amazon EKS
 * cluster, you must configure your Kubernetes tooling to communicate with the API server and launch
 * nodes into your cluster. For more information, see [Allowing users to access your
 * cluster](https://docs.aws.amazon.com/eks/latest/userguide/cluster-auth.html) and [Launching Amazon
 * EKS nodes](https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html) in the *Amazon EKS
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .resourcesVpcConfig(ResourcesVpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .endpointPrivateAccess(false)
 * .endpointPublicAccess(false)
 * .publicAccessCidrs(List.of("publicAccessCidrs"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .accessConfig(AccessConfigProperty.builder()
 * .authenticationMode("authenticationMode")
 * .bootstrapClusterCreatorAdminPermissions(false)
 * .build())
 * .encryptionConfig(List.of(EncryptionConfigProperty.builder()
 * .provider(ProviderProperty.builder()
 * .keyArn("keyArn")
 * .build())
 * .resources(List.of("resources"))
 * .build()))
 * .kubernetesNetworkConfig(KubernetesNetworkConfigProperty.builder()
 * .ipFamily("ipFamily")
 * .serviceIpv4Cidr("serviceIpv4Cidr")
 * .serviceIpv6Cidr("serviceIpv6Cidr")
 * .build())
 * .logging(LoggingProperty.builder()
 * .clusterLogging(ClusterLoggingProperty.builder()
 * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .name("name")
 * .outpostConfig(OutpostConfigProperty.builder()
 * .controlPlaneInstanceType("controlPlaneInstanceType")
 * .outpostArns(List.of("outpostArns"))
 * // the properties below are optional
 * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
 * .groupName("groupName")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
 */
public open class CfnCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The access configuration for the cluster.
   */
  public open fun accessConfig(): Any? = unwrap(this).getAccessConfig()

  /**
   * The access configuration for the cluster.
   */
  public open fun accessConfig(`value`: IResolvable) {
    unwrap(this).setAccessConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The access configuration for the cluster.
   */
  public open fun accessConfig(`value`: AccessConfigProperty) {
    unwrap(this).setAccessConfig(`value`.let(AccessConfigProperty::unwrap))
  }

  /**
   * The access configuration for the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7d094533038f681e526f068a9f0842251752e3561057b41f829aefa7af896859")
  public open fun accessConfig(`value`: AccessConfigProperty.Builder.() -> Unit): Unit =
      accessConfig(AccessConfigProperty(`value`))

  /**
   * The ARN of the cluster, such as `arn:aws:eks:us-west-2:666666666666:cluster/prod` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The `certificate-authority-data` for your cluster.
   */
  public open fun attrCertificateAuthorityData(): String =
      unwrap(this).getAttrCertificateAuthorityData()

  /**
   * The cluster security group that was created by Amazon EKS for the cluster.
   *
   * Managed node groups use this security group for control plane to data plane communication.
   *
   * This parameter is only returned by Amazon EKS clusters that support managed node groups. For
   * more information, see [Managed node
   * groups](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html) in the *Amazon
   * EKS User Guide* .
   */
  public open fun attrClusterSecurityGroupId(): String =
      unwrap(this).getAttrClusterSecurityGroupId()

  /**
   * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
   */
  public open fun attrEncryptionConfigKeyArn(): String =
      unwrap(this).getAttrEncryptionConfigKeyArn()

  /**
   * The endpoint for your Kubernetes API server, such as
   * `https://5E1D0CEXAMPLEA591B746AFC5AB30262.yl4.us-west-2.eks.amazonaws.com` .
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * The ID of your local Amazon EKS cluster on an AWS Outpost.
   *
   * This property isn't available for an Amazon EKS cluster on the AWS cloud.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The CIDR block that Kubernetes Service IP addresses are assigned from if you created a `1.21`
   * or later cluster with version `&gt;1.10.1` or later of the Amazon VPC CNI add-on and specified
   * `ipv6` for *ipFamily* when you created the cluster. Kubernetes assigns Service addresses from the
   * unique local address range ( `fc00::/7` ) because you can't specify a custom `IPv6` CIDR block
   * when you create the cluster.
   */
  public open fun attrKubernetesNetworkConfigServiceIpv6Cidr(): String =
      unwrap(this).getAttrKubernetesNetworkConfigServiceIpv6Cidr()

  /**
   * The issuer URL for the OIDC identity provider of the cluster, such as
   * `https://oidc.eks.us-west-2.amazonaws.com/id/EXAMPLED539D4633E53DE1B716D3041E` . If you need to
   * remove `https://` from this output value, you can include the following code in your template.
   *
   * `!Select [1, !Split ["//", !GetAtt EKSCluster.OpenIdConnectIssuerUrl]]`
   */
  public open fun attrOpenIdConnectIssuerUrl(): String =
      unwrap(this).getAttrOpenIdConnectIssuerUrl()

  /**
   * The encryption configuration for the cluster.
   */
  public open fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  /**
   * The encryption configuration for the cluster.
   */
  public open fun encryptionConfig(`value`: IResolvable) {
    unwrap(this).setEncryptionConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The encryption configuration for the cluster.
   */
  public open fun encryptionConfig(_idx_ac66f0: List<Any>) {
    unwrap(this).setEncryptionConfig(_idx_ac66f0)
  }

  /**
   * The encryption configuration for the cluster.
   */
  public open fun encryptionConfig(vararg _idx_ac66f0: Any): Unit =
      encryptionConfig(_idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Kubernetes network configuration for the cluster.
   */
  public open fun kubernetesNetworkConfig(): Any? = unwrap(this).getKubernetesNetworkConfig()

  /**
   * The Kubernetes network configuration for the cluster.
   */
  public open fun kubernetesNetworkConfig(`value`: IResolvable) {
    unwrap(this).setKubernetesNetworkConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Kubernetes network configuration for the cluster.
   */
  public open fun kubernetesNetworkConfig(`value`: KubernetesNetworkConfigProperty) {
    unwrap(this).setKubernetesNetworkConfig(`value`.let(KubernetesNetworkConfigProperty::unwrap))
  }

  /**
   * The Kubernetes network configuration for the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ad3200466ba4740d3792f66a48b1a165681c20a4d21e1790d200e4ae5f3f30b")
  public open
      fun kubernetesNetworkConfig(`value`: KubernetesNetworkConfigProperty.Builder.() -> Unit): Unit
      = kubernetesNetworkConfig(KubernetesNetworkConfigProperty(`value`))

  /**
   * The logging configuration for your cluster.
   */
  public open fun logging(): Any? = unwrap(this).getLogging()

  /**
   * The logging configuration for your cluster.
   */
  public open fun logging(`value`: IResolvable) {
    unwrap(this).setLogging(`value`.let(IResolvable::unwrap))
  }

  /**
   * The logging configuration for your cluster.
   */
  public open fun logging(`value`: LoggingProperty) {
    unwrap(this).setLogging(`value`.let(LoggingProperty::unwrap))
  }

  /**
   * The logging configuration for your cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b20acf74cd551ac85f445abd0492dcda910bb06bd544c96d04253404c11cadad")
  public open fun logging(`value`: LoggingProperty.Builder.() -> Unit): Unit =
      logging(LoggingProperty(`value`))

  /**
   * The unique name to give to your cluster.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The unique name to give to your cluster.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
   */
  public open fun outpostConfig(): Any? = unwrap(this).getOutpostConfig()

  /**
   * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
   */
  public open fun outpostConfig(`value`: IResolvable) {
    unwrap(this).setOutpostConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
   */
  public open fun outpostConfig(`value`: OutpostConfigProperty) {
    unwrap(this).setOutpostConfig(`value`.let(OutpostConfigProperty::unwrap))
  }

  /**
   * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("460f5e890d563eabe469059d6828c96ba5b5fd92bdfd8047b19bedc7f6dc9550")
  public open fun outpostConfig(`value`: OutpostConfigProperty.Builder.() -> Unit): Unit =
      outpostConfig(OutpostConfigProperty(`value`))

  /**
   * The VPC configuration that's used by the cluster control plane.
   */
  public open fun resourcesVpcConfig(): Any = unwrap(this).getResourcesVpcConfig()

  /**
   * The VPC configuration that's used by the cluster control plane.
   */
  public open fun resourcesVpcConfig(`value`: IResolvable) {
    unwrap(this).setResourcesVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The VPC configuration that's used by the cluster control plane.
   */
  public open fun resourcesVpcConfig(`value`: ResourcesVpcConfigProperty) {
    unwrap(this).setResourcesVpcConfig(`value`.let(ResourcesVpcConfigProperty::unwrap))
  }

  /**
   * The VPC configuration that's used by the cluster control plane.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b0273a7fbee243b260ea726f43953140688a2586fb8bec86143ef2f9b56da211")
  public open fun resourcesVpcConfig(`value`: ResourcesVpcConfigProperty.Builder.() -> Unit): Unit =
      resourcesVpcConfig(ResourcesVpcConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
   * control plane to make calls to AWS API operations on your behalf.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
   * control plane to make calls to AWS API operations on your behalf.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to the cluster to assist with categorization and organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to the cluster to assist with categorization and organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The metadata that you apply to the cluster to assist with categorization and organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The desired Kubernetes version for your cluster.
   */
  public open fun version(): String? = unwrap(this).getVersion()

  /**
   * The desired Kubernetes version for your cluster.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     * @param accessConfig The access configuration for the cluster. 
     */
    public fun accessConfig(accessConfig: IResolvable)

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     * @param accessConfig The access configuration for the cluster. 
     */
    public fun accessConfig(accessConfig: AccessConfigProperty)

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     * @param accessConfig The access configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec4c1a7d3a6de171eddcfa8c911dcb17d9b0926ae11adb71b6e5b373e025c017")
    public fun accessConfig(accessConfig: AccessConfigProperty.Builder.() -> Unit)

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     * @param encryptionConfig The encryption configuration for the cluster. 
     */
    public fun encryptionConfig(encryptionConfig: IResolvable)

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     * @param encryptionConfig The encryption configuration for the cluster. 
     */
    public fun encryptionConfig(encryptionConfig: List<Any>)

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     * @param encryptionConfig The encryption configuration for the cluster. 
     */
    public fun encryptionConfig(vararg encryptionConfig: Any)

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster. 
     */
    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable)

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster. 
     */
    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty)

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790fe92404891b374995e9dfa06db968cf66fb7fea54f12e1ddfe19395e58665")
    public
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty.Builder.() -> Unit)

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     * @param logging The logging configuration for your cluster. 
     */
    public fun logging(logging: IResolvable)

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     * @param logging The logging configuration for your cluster. 
     */
    public fun logging(logging: LoggingProperty)

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     * @param logging The logging configuration for your cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6153bf06bf61e6a7a510b8026e66d18479c8742b8aa3412d834b150dcad1024")
    public fun logging(logging: LoggingProperty.Builder.() -> Unit)

    /**
     * The unique name to give to your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
     * @param name The unique name to give to your cluster. 
     */
    public fun name(name: String)

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost. 
     */
    public fun outpostConfig(outpostConfig: IResolvable)

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost. 
     */
    public fun outpostConfig(outpostConfig: OutpostConfigProperty)

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd33fe939cf4bdbab02c5d1407a0364d4da3d4d15abcbd69ab72657b980bf691")
    public fun outpostConfig(outpostConfig: OutpostConfigProperty.Builder.() -> Unit)

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     */
    public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable)

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     */
    public fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty)

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc182e569f83b4f2259bcf755a598aac7a873678fefda3a91de8d9ff379b29c")
    public fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
     * control plane to make calls to AWS API operations on your behalf.
     *
     * For more information, see [Amazon EKS Service IAM
     * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon
     * EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that provides permissions for
     * the Kubernetes control plane to make calls to AWS API operations on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The metadata that you apply to the cluster to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the cluster to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The desired Kubernetes version for your cluster.
     *
     * If you don't specify a value here, the default version available in Amazon EKS is used.
     *
     *
     * The default version might not be the latest version available.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-version)
     * @param version The desired Kubernetes version for your cluster. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnCluster.Builder =
        software.amazon.awscdk.services.eks.CfnCluster.Builder.create(scope, id)

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     * @param accessConfig The access configuration for the cluster. 
     */
    override fun accessConfig(accessConfig: IResolvable) {
      cdkBuilder.accessConfig(accessConfig.let(IResolvable::unwrap))
    }

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     * @param accessConfig The access configuration for the cluster. 
     */
    override fun accessConfig(accessConfig: AccessConfigProperty) {
      cdkBuilder.accessConfig(accessConfig.let(AccessConfigProperty::unwrap))
    }

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     * @param accessConfig The access configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec4c1a7d3a6de171eddcfa8c911dcb17d9b0926ae11adb71b6e5b373e025c017")
    override fun accessConfig(accessConfig: AccessConfigProperty.Builder.() -> Unit): Unit =
        accessConfig(AccessConfigProperty(accessConfig))

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     * @param encryptionConfig The encryption configuration for the cluster. 
     */
    override fun encryptionConfig(encryptionConfig: IResolvable) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
    }

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     * @param encryptionConfig The encryption configuration for the cluster. 
     */
    override fun encryptionConfig(encryptionConfig: List<Any>) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     * @param encryptionConfig The encryption configuration for the cluster. 
     */
    override fun encryptionConfig(vararg encryptionConfig: Any): Unit =
        encryptionConfig(encryptionConfig.toList())

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster. 
     */
    override fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(IResolvable::unwrap))
    }

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster. 
     */
    override fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(KubernetesNetworkConfigProperty::unwrap))
    }

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790fe92404891b374995e9dfa06db968cf66fb7fea54f12e1ddfe19395e58665")
    override
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: KubernetesNetworkConfigProperty.Builder.() -> Unit):
        Unit = kubernetesNetworkConfig(KubernetesNetworkConfigProperty(kubernetesNetworkConfig))

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     * @param logging The logging configuration for your cluster. 
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     * @param logging The logging configuration for your cluster. 
     */
    override fun logging(logging: LoggingProperty) {
      cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
    }

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     * @param logging The logging configuration for your cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6153bf06bf61e6a7a510b8026e66d18479c8742b8aa3412d834b150dcad1024")
    override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
        logging(LoggingProperty(logging))

    /**
     * The unique name to give to your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
     * @param name The unique name to give to your cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost. 
     */
    override fun outpostConfig(outpostConfig: IResolvable) {
      cdkBuilder.outpostConfig(outpostConfig.let(IResolvable::unwrap))
    }

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost. 
     */
    override fun outpostConfig(outpostConfig: OutpostConfigProperty) {
      cdkBuilder.outpostConfig(outpostConfig.let(OutpostConfigProperty::unwrap))
    }

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd33fe939cf4bdbab02c5d1407a0364d4da3d4d15abcbd69ab72657b980bf691")
    override fun outpostConfig(outpostConfig: OutpostConfigProperty.Builder.() -> Unit): Unit =
        outpostConfig(OutpostConfigProperty(outpostConfig))

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     */
    override fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(IResolvable::unwrap))
    }

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     */
    override fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(ResourcesVpcConfigProperty::unwrap))
    }

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc182e569f83b4f2259bcf755a598aac7a873678fefda3a91de8d9ff379b29c")
    override
        fun resourcesVpcConfig(resourcesVpcConfig: ResourcesVpcConfigProperty.Builder.() -> Unit):
        Unit = resourcesVpcConfig(ResourcesVpcConfigProperty(resourcesVpcConfig))

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
     * control plane to make calls to AWS API operations on your behalf.
     *
     * For more information, see [Amazon EKS Service IAM
     * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon
     * EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that provides permissions for
     * the Kubernetes control plane to make calls to AWS API operations on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The metadata that you apply to the cluster to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to the cluster to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The desired Kubernetes version for your cluster.
     *
     * If you don't specify a value here, the default version available in Amazon EKS is used.
     *
     *
     * The default version might not be the latest version available.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-version)
     * @param version The desired Kubernetes version for your cluster. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eks.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.eks.CfnCluster =
        wrapped.cdkObject
  }

  /**
   * The access configuration for the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * AccessConfigProperty accessConfigProperty = AccessConfigProperty.builder()
   * .authenticationMode("authenticationMode")
   * .bootstrapClusterCreatorAdminPermissions(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html)
   */
  public interface AccessConfigProperty {
    /**
     * The desired authentication mode for the cluster.
     *
     * If you create a cluster by using the EKS API, AWS SDKs, or AWS CloudFormation , the default
     * is `CONFIG_MAP` . If you create the cluster by using the AWS Management Console , the default
     * value is `API_AND_CONFIG_MAP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html#cfn-eks-cluster-accessconfig-authenticationmode)
     */
    public fun authenticationMode(): String? = unwrap(this).getAuthenticationMode()

    /**
     * Specifies whether or not the cluster creator IAM principal was set as a cluster admin access
     * entry during cluster creation time.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html#cfn-eks-cluster-accessconfig-bootstrapclustercreatoradminpermissions)
     */
    public fun bootstrapClusterCreatorAdminPermissions(): Any? =
        unwrap(this).getBootstrapClusterCreatorAdminPermissions()

    /**
     * A builder for [AccessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationMode The desired authentication mode for the cluster.
       * If you create a cluster by using the EKS API, AWS SDKs, or AWS CloudFormation , the default
       * is `CONFIG_MAP` . If you create the cluster by using the AWS Management Console , the default
       * value is `API_AND_CONFIG_MAP` .
       */
      public fun authenticationMode(authenticationMode: String)

      /**
       * @param bootstrapClusterCreatorAdminPermissions Specifies whether or not the cluster creator
       * IAM principal was set as a cluster admin access entry during cluster creation time.
       * The default value is `true` .
       */
      public
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: Boolean)

      /**
       * @param bootstrapClusterCreatorAdminPermissions Specifies whether or not the cluster creator
       * IAM principal was set as a cluster admin access entry during cluster creation time.
       * The default value is `true` .
       */
      public
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty.builder()

      /**
       * @param authenticationMode The desired authentication mode for the cluster.
       * If you create a cluster by using the EKS API, AWS SDKs, or AWS CloudFormation , the default
       * is `CONFIG_MAP` . If you create the cluster by using the AWS Management Console , the default
       * value is `API_AND_CONFIG_MAP` .
       */
      override fun authenticationMode(authenticationMode: String) {
        cdkBuilder.authenticationMode(authenticationMode)
      }

      /**
       * @param bootstrapClusterCreatorAdminPermissions Specifies whether or not the cluster creator
       * IAM principal was set as a cluster admin access entry during cluster creation time.
       * The default value is `true` .
       */
      override
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: Boolean) {
        cdkBuilder.bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions)
      }

      /**
       * @param bootstrapClusterCreatorAdminPermissions Specifies whether or not the cluster creator
       * IAM principal was set as a cluster admin access entry during cluster creation time.
       * The default value is `true` .
       */
      override
          fun bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions: IResolvable) {
        cdkBuilder.bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty,
    ) : CdkObject(cdkObject), AccessConfigProperty {
      /**
       * The desired authentication mode for the cluster.
       *
       * If you create a cluster by using the EKS API, AWS SDKs, or AWS CloudFormation , the default
       * is `CONFIG_MAP` . If you create the cluster by using the AWS Management Console , the default
       * value is `API_AND_CONFIG_MAP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html#cfn-eks-cluster-accessconfig-authenticationmode)
       */
      override fun authenticationMode(): String? = unwrap(this).getAuthenticationMode()

      /**
       * Specifies whether or not the cluster creator IAM principal was set as a cluster admin
       * access entry during cluster creation time.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html#cfn-eks-cluster-accessconfig-bootstrapclustercreatoradminpermissions)
       */
      override fun bootstrapClusterCreatorAdminPermissions(): Any? =
          unwrap(this).getBootstrapClusterCreatorAdminPermissions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty):
          AccessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.AccessConfigProperty
    }
  }

  /**
   * The placement configuration for all the control plane instances of your local Amazon EKS
   * cluster on an AWS Outpost.
   *
   * For more information, see [Capacity
   * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
   * in the Amazon EKS User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * ControlPlanePlacementProperty controlPlanePlacementProperty =
   * ControlPlanePlacementProperty.builder()
   * .groupName("groupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-controlplaneplacement.html)
   */
  public interface ControlPlanePlacementProperty {
    /**
     * The name of the placement group for the Kubernetes control plane instances.
     *
     * This property is only used for a local cluster on an AWS Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-controlplaneplacement.html#cfn-eks-cluster-controlplaneplacement-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * A builder for [ControlPlanePlacementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupName The name of the placement group for the Kubernetes control plane
       * instances.
       * This property is only used for a local cluster on an AWS Outpost.
       */
      public fun groupName(groupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty.builder()

      /**
       * @param groupName The name of the placement group for the Kubernetes control plane
       * instances.
       * This property is only used for a local cluster on an AWS Outpost.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty,
    ) : CdkObject(cdkObject), ControlPlanePlacementProperty {
      /**
       * The name of the placement group for the Kubernetes control plane instances.
       *
       * This property is only used for a local cluster on an AWS Outpost.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-controlplaneplacement.html#cfn-eks-cluster-controlplaneplacement-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ControlPlanePlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty):
          ControlPlanePlacementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlPlanePlacementProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.ControlPlanePlacementProperty
    }
  }

  /**
   * The cluster control plane logging configuration for your cluster.
   *
   *
   * When updating a resource, you must include this `ClusterLogging` property if the previous
   * CloudFormation template of the resource had it.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * ClusterLoggingProperty clusterLoggingProperty = ClusterLoggingProperty.builder()
   * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-clusterlogging.html)
   */
  public interface ClusterLoggingProperty {
    /**
     * The enabled control plane logs for your cluster. All log types are disabled if the array is
     * empty.
     *
     *
     * When updating a resource, you must include this `EnabledTypes` property if the previous
     * CloudFormation template of the resource had it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-clusterlogging.html#cfn-eks-cluster-clusterlogging-enabledtypes)
     */
    public fun enabledTypes(): Any? = unwrap(this).getEnabledTypes()

    /**
     * A builder for [ClusterLoggingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledTypes The enabled control plane logs for your cluster. All log types are
       * disabled if the array is empty.
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       */
      public fun enabledTypes(enabledTypes: IResolvable)

      /**
       * @param enabledTypes The enabled control plane logs for your cluster. All log types are
       * disabled if the array is empty.
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       */
      public fun enabledTypes(enabledTypes: List<Any>)

      /**
       * @param enabledTypes The enabled control plane logs for your cluster. All log types are
       * disabled if the array is empty.
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       */
      public fun enabledTypes(vararg enabledTypes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty.builder()

      /**
       * @param enabledTypes The enabled control plane logs for your cluster. All log types are
       * disabled if the array is empty.
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       */
      override fun enabledTypes(enabledTypes: IResolvable) {
        cdkBuilder.enabledTypes(enabledTypes.let(IResolvable::unwrap))
      }

      /**
       * @param enabledTypes The enabled control plane logs for your cluster. All log types are
       * disabled if the array is empty.
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       */
      override fun enabledTypes(enabledTypes: List<Any>) {
        cdkBuilder.enabledTypes(enabledTypes)
      }

      /**
       * @param enabledTypes The enabled control plane logs for your cluster. All log types are
       * disabled if the array is empty.
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       */
      override fun enabledTypes(vararg enabledTypes: Any): Unit =
          enabledTypes(enabledTypes.toList())

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty,
    ) : CdkObject(cdkObject), ClusterLoggingProperty {
      /**
       * The enabled control plane logs for your cluster. All log types are disabled if the array is
       * empty.
       *
       *
       * When updating a resource, you must include this `EnabledTypes` property if the previous
       * CloudFormation template of the resource had it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-clusterlogging.html#cfn-eks-cluster-clusterlogging-enabledtypes)
       */
      override fun enabledTypes(): Any? = unwrap(this).getEnabledTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterLoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty):
          ClusterLoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterLoggingProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty
    }
  }

  /**
   * An object representing the VPC configuration to use for an Amazon EKS cluster.
   *
   *
   * When updating a resource, you must include these properties if the previous CloudFormation
   * template of the resource had them:
   *
   * * `EndpointPublicAccess`
   * * `EndpointPrivateAccess`
   * * `PublicAccessCidrs`
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * ResourcesVpcConfigProperty resourcesVpcConfigProperty = ResourcesVpcConfigProperty.builder()
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .endpointPrivateAccess(false)
   * .endpointPublicAccess(false)
   * .publicAccessCidrs(List.of("publicAccessCidrs"))
   * .securityGroupIds(List.of("securityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html)
   */
  public interface ResourcesVpcConfigProperty {
    /**
     * Set this value to `true` to enable private access for your cluster's Kubernetes API server
     * endpoint.
     *
     * If you enable private access, Kubernetes API requests from within your cluster's VPC use the
     * private VPC endpoint. The default value for this parameter is `false` , which disables private
     * access for your Kubernetes API server. If you disable private access and you have nodes or AWS
     * Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the necessary CIDR
     * blocks for communication with the nodes or Fargate pods. For more information, see [Amazon EKS
     * cluster endpoint access
     * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon
     * EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-endpointprivateaccess)
     */
    public fun endpointPrivateAccess(): Any? = unwrap(this).getEndpointPrivateAccess()

    /**
     * Set this value to `false` to disable public access to your cluster's Kubernetes API server
     * endpoint.
     *
     * If you disable public access, your cluster's Kubernetes API server can only receive requests
     * from within the cluster VPC. The default value for this parameter is `true` , which enables
     * public access for your Kubernetes API server. For more information, see [Amazon EKS cluster
     * endpoint access control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     * in the **Amazon EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-endpointpublicaccess)
     */
    public fun endpointPublicAccess(): Any? = unwrap(this).getEndpointPublicAccess()

    /**
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server
     * endpoint.
     *
     * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
     * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access, make sure
     * that you specify the necessary CIDR blocks for every node and AWS Fargate `Pod` in the cluster.
     * For more information, see [Amazon EKS cluster endpoint access
     * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon
     * EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-publicaccesscidrs)
     */
    public fun publicAccessCidrs(): List<String> = unwrap(this).getPublicAccessCidrs() ?:
        emptyList()

    /**
     * Specify one or more security groups for the cross-account elastic network interfaces that
     * Amazon EKS creates to use that allow communication between your nodes and the Kubernetes control
     * plane.
     *
     * If you don't specify any security groups, then familiarize yourself with the difference
     * between Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see
     * [Amazon EKS security group
     * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * **Amazon EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * Specify subnets for your Amazon EKS nodes.
     *
     * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
     * communication between your nodes and the Kubernetes control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [ResourcesVpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointPrivateAccess Set this value to `true` to enable private access for your
       * cluster's Kubernetes API server endpoint.
       * If you enable private access, Kubernetes API requests from within your cluster's VPC use
       * the private VPC endpoint. The default value for this parameter is `false` , which disables
       * private access for your Kubernetes API server. If you disable private access and you have
       * nodes or AWS Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the
       * necessary CIDR blocks for communication with the nodes or Fargate pods. For more information,
       * see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun endpointPrivateAccess(endpointPrivateAccess: Boolean)

      /**
       * @param endpointPrivateAccess Set this value to `true` to enable private access for your
       * cluster's Kubernetes API server endpoint.
       * If you enable private access, Kubernetes API requests from within your cluster's VPC use
       * the private VPC endpoint. The default value for this parameter is `false` , which disables
       * private access for your Kubernetes API server. If you disable private access and you have
       * nodes or AWS Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the
       * necessary CIDR blocks for communication with the nodes or Fargate pods. For more information,
       * see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun endpointPrivateAccess(endpointPrivateAccess: IResolvable)

      /**
       * @param endpointPublicAccess Set this value to `false` to disable public access to your
       * cluster's Kubernetes API server endpoint.
       * If you disable public access, your cluster's Kubernetes API server can only receive
       * requests from within the cluster VPC. The default value for this parameter is `true` , which
       * enables public access for your Kubernetes API server. For more information, see [Amazon EKS
       * cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun endpointPublicAccess(endpointPublicAccess: Boolean)

      /**
       * @param endpointPublicAccess Set this value to `false` to disable public access to your
       * cluster's Kubernetes API server endpoint.
       * If you disable public access, your cluster's Kubernetes API server can only receive
       * requests from within the cluster VPC. The default value for this parameter is `true` , which
       * enables public access for your Kubernetes API server. For more information, see [Amazon EKS
       * cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun endpointPublicAccess(endpointPublicAccess: IResolvable)

      /**
       * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster's public
       * Kubernetes API server endpoint.
       * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
       * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access, make
       * sure that you specify the necessary CIDR blocks for every node and AWS Fargate `Pod` in the
       * cluster. For more information, see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun publicAccessCidrs(publicAccessCidrs: List<String>)

      /**
       * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster's public
       * Kubernetes API server endpoint.
       * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
       * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access, make
       * sure that you specify the necessary CIDR blocks for every node and AWS Fargate `Pod` in the
       * cluster. For more information, see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun publicAccessCidrs(vararg publicAccessCidrs: String)

      /**
       * @param securityGroupIds Specify one or more security groups for the cross-account elastic
       * network interfaces that Amazon EKS creates to use that allow communication between your nodes
       * and the Kubernetes control plane.
       * If you don't specify any security groups, then familiarize yourself with the difference
       * between Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see
       * [Amazon EKS security group
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds Specify one or more security groups for the cross-account elastic
       * network interfaces that Amazon EKS creates to use that allow communication between your nodes
       * and the Kubernetes control plane.
       * If you don't specify any security groups, then familiarize yourself with the difference
       * between Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see
       * [Amazon EKS security group
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
       * **Amazon EKS User Guide** .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds Specify subnets for your Amazon EKS nodes. 
       * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
       * communication between your nodes and the Kubernetes control plane.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds Specify subnets for your Amazon EKS nodes. 
       * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
       * communication between your nodes and the Kubernetes control plane.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.builder()

      /**
       * @param endpointPrivateAccess Set this value to `true` to enable private access for your
       * cluster's Kubernetes API server endpoint.
       * If you enable private access, Kubernetes API requests from within your cluster's VPC use
       * the private VPC endpoint. The default value for this parameter is `false` , which disables
       * private access for your Kubernetes API server. If you disable private access and you have
       * nodes or AWS Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the
       * necessary CIDR blocks for communication with the nodes or Fargate pods. For more information,
       * see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun endpointPrivateAccess(endpointPrivateAccess: Boolean) {
        cdkBuilder.endpointPrivateAccess(endpointPrivateAccess)
      }

      /**
       * @param endpointPrivateAccess Set this value to `true` to enable private access for your
       * cluster's Kubernetes API server endpoint.
       * If you enable private access, Kubernetes API requests from within your cluster's VPC use
       * the private VPC endpoint. The default value for this parameter is `false` , which disables
       * private access for your Kubernetes API server. If you disable private access and you have
       * nodes or AWS Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the
       * necessary CIDR blocks for communication with the nodes or Fargate pods. For more information,
       * see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun endpointPrivateAccess(endpointPrivateAccess: IResolvable) {
        cdkBuilder.endpointPrivateAccess(endpointPrivateAccess.let(IResolvable::unwrap))
      }

      /**
       * @param endpointPublicAccess Set this value to `false` to disable public access to your
       * cluster's Kubernetes API server endpoint.
       * If you disable public access, your cluster's Kubernetes API server can only receive
       * requests from within the cluster VPC. The default value for this parameter is `true` , which
       * enables public access for your Kubernetes API server. For more information, see [Amazon EKS
       * cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun endpointPublicAccess(endpointPublicAccess: Boolean) {
        cdkBuilder.endpointPublicAccess(endpointPublicAccess)
      }

      /**
       * @param endpointPublicAccess Set this value to `false` to disable public access to your
       * cluster's Kubernetes API server endpoint.
       * If you disable public access, your cluster's Kubernetes API server can only receive
       * requests from within the cluster VPC. The default value for this parameter is `true` , which
       * enables public access for your Kubernetes API server. For more information, see [Amazon EKS
       * cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun endpointPublicAccess(endpointPublicAccess: IResolvable) {
        cdkBuilder.endpointPublicAccess(endpointPublicAccess.let(IResolvable::unwrap))
      }

      /**
       * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster's public
       * Kubernetes API server endpoint.
       * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
       * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access, make
       * sure that you specify the necessary CIDR blocks for every node and AWS Fargate `Pod` in the
       * cluster. For more information, see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun publicAccessCidrs(publicAccessCidrs: List<String>) {
        cdkBuilder.publicAccessCidrs(publicAccessCidrs)
      }

      /**
       * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster's public
       * Kubernetes API server endpoint.
       * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
       * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access, make
       * sure that you specify the necessary CIDR blocks for every node and AWS Fargate `Pod` in the
       * cluster. For more information, see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun publicAccessCidrs(vararg publicAccessCidrs: String): Unit =
          publicAccessCidrs(publicAccessCidrs.toList())

      /**
       * @param securityGroupIds Specify one or more security groups for the cross-account elastic
       * network interfaces that Amazon EKS creates to use that allow communication between your nodes
       * and the Kubernetes control plane.
       * If you don't specify any security groups, then familiarize yourself with the difference
       * between Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see
       * [Amazon EKS security group
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds Specify one or more security groups for the cross-account elastic
       * network interfaces that Amazon EKS creates to use that allow communication between your nodes
       * and the Kubernetes control plane.
       * If you don't specify any security groups, then familiarize yourself with the difference
       * between Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see
       * [Amazon EKS security group
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
       * **Amazon EKS User Guide** .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds Specify subnets for your Amazon EKS nodes. 
       * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
       * communication between your nodes and the Kubernetes control plane.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds Specify subnets for your Amazon EKS nodes. 
       * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
       * communication between your nodes and the Kubernetes control plane.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty,
    ) : CdkObject(cdkObject), ResourcesVpcConfigProperty {
      /**
       * Set this value to `true` to enable private access for your cluster's Kubernetes API server
       * endpoint.
       *
       * If you enable private access, Kubernetes API requests from within your cluster's VPC use
       * the private VPC endpoint. The default value for this parameter is `false` , which disables
       * private access for your Kubernetes API server. If you disable private access and you have
       * nodes or AWS Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the
       * necessary CIDR blocks for communication with the nodes or Fargate pods. For more information,
       * see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-endpointprivateaccess)
       */
      override fun endpointPrivateAccess(): Any? = unwrap(this).getEndpointPrivateAccess()

      /**
       * Set this value to `false` to disable public access to your cluster's Kubernetes API server
       * endpoint.
       *
       * If you disable public access, your cluster's Kubernetes API server can only receive
       * requests from within the cluster VPC. The default value for this parameter is `true` , which
       * enables public access for your Kubernetes API server. For more information, see [Amazon EKS
       * cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-endpointpublicaccess)
       */
      override fun endpointPublicAccess(): Any? = unwrap(this).getEndpointPublicAccess()

      /**
       * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server
       * endpoint.
       *
       * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
       * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access, make
       * sure that you specify the necessary CIDR blocks for every node and AWS Fargate `Pod` in the
       * cluster. For more information, see [Amazon EKS cluster endpoint access
       * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
       * **Amazon EKS User Guide** .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-publicaccesscidrs)
       */
      override fun publicAccessCidrs(): List<String> = unwrap(this).getPublicAccessCidrs() ?:
          emptyList()

      /**
       * Specify one or more security groups for the cross-account elastic network interfaces that
       * Amazon EKS creates to use that allow communication between your nodes and the Kubernetes
       * control plane.
       *
       * If you don't specify any security groups, then familiarize yourself with the difference
       * between Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see
       * [Amazon EKS security group
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
       * **Amazon EKS User Guide** .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * Specify subnets for your Amazon EKS nodes.
       *
       * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
       * communication between your nodes and the Kubernetes control plane.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcesVpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty):
          ResourcesVpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcesVpcConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty
    }
  }

  /**
   * Identifies the AWS Key Management Service ( AWS KMS ) key used to encrypt the secrets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * ProviderProperty providerProperty = ProviderProperty.builder()
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html)
   */
  public interface ProviderProperty {
    /**
     * Amazon Resource Name (ARN) or alias of the KMS key.
     *
     * The KMS key must be symmetric and created in the same AWS Region as the cluster. If the KMS
     * key was created in a different account, the [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
     * must have access to the KMS key. For more information, see [Allowing users in other accounts to
     * use a KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html#cfn-eks-cluster-provider-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * A builder for [ProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyArn Amazon Resource Name (ARN) or alias of the KMS key.
       * The KMS key must be symmetric and created in the same AWS Region as the cluster. If the KMS
       * key was created in a different account, the [IAM
       * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
       * must have access to the KMS key. For more information, see [Allowing users in other accounts
       * to use a KMS
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html)
       * in the *AWS Key Management Service Developer Guide* .
       */
      public fun keyArn(keyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty.builder()

      /**
       * @param keyArn Amazon Resource Name (ARN) or alias of the KMS key.
       * The KMS key must be symmetric and created in the same AWS Region as the cluster. If the KMS
       * key was created in a different account, the [IAM
       * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
       * must have access to the KMS key. For more information, see [Allowing users in other accounts
       * to use a KMS
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html)
       * in the *AWS Key Management Service Developer Guide* .
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty,
    ) : CdkObject(cdkObject), ProviderProperty {
      /**
       * Amazon Resource Name (ARN) or alias of the KMS key.
       *
       * The KMS key must be symmetric and created in the same AWS Region as the cluster. If the KMS
       * key was created in a different account, the [IAM
       * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
       * must have access to the KMS key. For more information, see [Allowing users in other accounts
       * to use a KMS
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html)
       * in the *AWS Key Management Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html#cfn-eks-cluster-provider-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty):
          ProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderProperty):
          software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnCluster.ProviderProperty
    }
  }

  /**
   * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch
   * Logs.
   *
   * By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
   * information, see [Amazon EKS Cluster control plane
   * logs](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html) in the **Amazon
   * EKS User Guide** .
   *
   *
   * When updating a resource, you must include this `Logging` property if the previous
   * CloudFormation template of the resource had it. &gt; CloudWatch Logs ingestion, archive storage,
   * and data scanning rates apply to exported control plane logs. For more information, see
   * [CloudWatch Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * LoggingProperty loggingProperty = LoggingProperty.builder()
   * .clusterLogging(ClusterLoggingProperty.builder()
   * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
   * .type("type")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-logging.html)
   */
  public interface LoggingProperty {
    /**
     * The cluster control plane logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-logging.html#cfn-eks-cluster-logging-clusterlogging)
     */
    public fun clusterLogging(): Any? = unwrap(this).getClusterLogging()

    /**
     * A builder for [LoggingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterLogging The cluster control plane logging configuration for your cluster.
       */
      public fun clusterLogging(clusterLogging: IResolvable)

      /**
       * @param clusterLogging The cluster control plane logging configuration for your cluster.
       */
      public fun clusterLogging(clusterLogging: ClusterLoggingProperty)

      /**
       * @param clusterLogging The cluster control plane logging configuration for your cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6eef5ca98ad698d391f4345c1070b4d8235bd9d01892094d471af59ebc1ff719")
      public fun clusterLogging(clusterLogging: ClusterLoggingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty.Builder
          = software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty.builder()

      /**
       * @param clusterLogging The cluster control plane logging configuration for your cluster.
       */
      override fun clusterLogging(clusterLogging: IResolvable) {
        cdkBuilder.clusterLogging(clusterLogging.let(IResolvable::unwrap))
      }

      /**
       * @param clusterLogging The cluster control plane logging configuration for your cluster.
       */
      override fun clusterLogging(clusterLogging: ClusterLoggingProperty) {
        cdkBuilder.clusterLogging(clusterLogging.let(ClusterLoggingProperty::unwrap))
      }

      /**
       * @param clusterLogging The cluster control plane logging configuration for your cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6eef5ca98ad698d391f4345c1070b4d8235bd9d01892094d471af59ebc1ff719")
      override fun clusterLogging(clusterLogging: ClusterLoggingProperty.Builder.() -> Unit): Unit =
          clusterLogging(ClusterLoggingProperty(clusterLogging))

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty,
    ) : CdkObject(cdkObject), LoggingProperty {
      /**
       * The cluster control plane logging configuration for your cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-logging.html#cfn-eks-cluster-logging-clusterlogging)
       */
      override fun clusterLogging(): Any? = unwrap(this).getClusterLogging()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty
    }
  }

  /**
   * The configuration of your local Amazon EKS cluster on an AWS Outpost.
   *
   * Before creating a cluster on an Outpost, review [Creating a local cluster on an
   * Outpost](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-local-cluster-create.html)
   * in the *Amazon EKS User Guide* . This API isn't available for Amazon EKS clusters on the AWS
   * cloud.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * OutpostConfigProperty outpostConfigProperty = OutpostConfigProperty.builder()
   * .controlPlaneInstanceType("controlPlaneInstanceType")
   * .outpostArns(List.of("outpostArns"))
   * // the properties below are optional
   * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
   * .groupName("groupName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html)
   */
  public interface OutpostConfigProperty {
    /**
     * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on
     * Outposts.
     *
     * Choose an instance type based on the number of nodes that your cluster will have. For more
     * information, see [Capacity
     * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
     * in the *Amazon EKS User Guide* .
     *
     * The instance type that you specify is used for all Kubernetes control plane instances. The
     * instance type can't be changed after cluster creation. The control plane is not automatically
     * scaled by Amazon EKS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html#cfn-eks-cluster-outpostconfig-controlplaneinstancetype)
     */
    public fun controlPlaneInstanceType(): String

    /**
     * An object representing the placement configuration for all the control plane instances of
     * your local Amazon EKS cluster on an AWS Outpost.
     *
     * For more information, see [Capacity
     * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html#cfn-eks-cluster-outpostconfig-controlplaneplacement)
     */
    public fun controlPlanePlacement(): Any? = unwrap(this).getControlPlanePlacement()

    /**
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts.
     *
     * Only a single Outpost ARN is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html#cfn-eks-cluster-outpostconfig-outpostarns)
     */
    public fun outpostArns(): List<String>

    /**
     * A builder for [OutpostConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param controlPlaneInstanceType The Amazon EC2 instance type that you want to use for your
       * local Amazon EKS cluster on Outposts. 
       * Choose an instance type based on the number of nodes that your cluster will have. For more
       * information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       *
       * The instance type that you specify is used for all Kubernetes control plane instances. The
       * instance type can't be changed after cluster creation. The control plane is not automatically
       * scaled by Amazon EKS.
       */
      public fun controlPlaneInstanceType(controlPlaneInstanceType: String)

      /**
       * @param controlPlanePlacement An object representing the placement configuration for all the
       * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       */
      public fun controlPlanePlacement(controlPlanePlacement: IResolvable)

      /**
       * @param controlPlanePlacement An object representing the placement configuration for all the
       * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       */
      public fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty)

      /**
       * @param controlPlanePlacement An object representing the placement configuration for all the
       * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11057470261230998833a07856832074f2f428b9635537fa10ab3a00da279ff")
      public
          fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty.Builder.() -> Unit)

      /**
       * @param outpostArns The ARN of the Outpost that you want to use for your local Amazon EKS
       * cluster on Outposts. 
       * Only a single Outpost ARN is supported.
       */
      public fun outpostArns(outpostArns: List<String>)

      /**
       * @param outpostArns The ARN of the Outpost that you want to use for your local Amazon EKS
       * cluster on Outposts. 
       * Only a single Outpost ARN is supported.
       */
      public fun outpostArns(vararg outpostArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty.builder()

      /**
       * @param controlPlaneInstanceType The Amazon EC2 instance type that you want to use for your
       * local Amazon EKS cluster on Outposts. 
       * Choose an instance type based on the number of nodes that your cluster will have. For more
       * information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       *
       * The instance type that you specify is used for all Kubernetes control plane instances. The
       * instance type can't be changed after cluster creation. The control plane is not automatically
       * scaled by Amazon EKS.
       */
      override fun controlPlaneInstanceType(controlPlaneInstanceType: String) {
        cdkBuilder.controlPlaneInstanceType(controlPlaneInstanceType)
      }

      /**
       * @param controlPlanePlacement An object representing the placement configuration for all the
       * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       */
      override fun controlPlanePlacement(controlPlanePlacement: IResolvable) {
        cdkBuilder.controlPlanePlacement(controlPlanePlacement.let(IResolvable::unwrap))
      }

      /**
       * @param controlPlanePlacement An object representing the placement configuration for all the
       * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       */
      override fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty) {
        cdkBuilder.controlPlanePlacement(controlPlanePlacement.let(ControlPlanePlacementProperty::unwrap))
      }

      /**
       * @param controlPlanePlacement An object representing the placement configuration for all the
       * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11057470261230998833a07856832074f2f428b9635537fa10ab3a00da279ff")
      override
          fun controlPlanePlacement(controlPlanePlacement: ControlPlanePlacementProperty.Builder.() -> Unit):
          Unit = controlPlanePlacement(ControlPlanePlacementProperty(controlPlanePlacement))

      /**
       * @param outpostArns The ARN of the Outpost that you want to use for your local Amazon EKS
       * cluster on Outposts. 
       * Only a single Outpost ARN is supported.
       */
      override fun outpostArns(outpostArns: List<String>) {
        cdkBuilder.outpostArns(outpostArns)
      }

      /**
       * @param outpostArns The ARN of the Outpost that you want to use for your local Amazon EKS
       * cluster on Outposts. 
       * Only a single Outpost ARN is supported.
       */
      override fun outpostArns(vararg outpostArns: String): Unit = outpostArns(outpostArns.toList())

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty,
    ) : CdkObject(cdkObject), OutpostConfigProperty {
      /**
       * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on
       * Outposts.
       *
       * Choose an instance type based on the number of nodes that your cluster will have. For more
       * information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       *
       * The instance type that you specify is used for all Kubernetes control plane instances. The
       * instance type can't be changed after cluster creation. The control plane is not automatically
       * scaled by Amazon EKS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html#cfn-eks-cluster-outpostconfig-controlplaneinstancetype)
       */
      override fun controlPlaneInstanceType(): String = unwrap(this).getControlPlaneInstanceType()

      /**
       * An object representing the placement configuration for all the control plane instances of
       * your local Amazon EKS cluster on an AWS Outpost.
       *
       * For more information, see [Capacity
       * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
       * in the *Amazon EKS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html#cfn-eks-cluster-outpostconfig-controlplaneplacement)
       */
      override fun controlPlanePlacement(): Any? = unwrap(this).getControlPlanePlacement()

      /**
       * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts.
       *
       * Only a single Outpost ARN is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html#cfn-eks-cluster-outpostconfig-outpostarns)
       */
      override fun outpostArns(): List<String> = unwrap(this).getOutpostArns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutpostConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty):
          OutpostConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutpostConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.OutpostConfigProperty
    }
  }

  /**
   * The Kubernetes network configuration for the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * KubernetesNetworkConfigProperty kubernetesNetworkConfigProperty =
   * KubernetesNetworkConfigProperty.builder()
   * .ipFamily("ipFamily")
   * .serviceIpv4Cidr("serviceIpv4Cidr")
   * .serviceIpv6Cidr("serviceIpv6Cidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html)
   */
  public interface KubernetesNetworkConfigProperty {
    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * If you don't specify a value, `ipv4` is used by default. You can only specify an IP family
     * when you create a cluster and can't change this value once the cluster is created. If you
     * specify `ipv6` , the VPC and subnets that you specify for cluster creation must have both `IPv4`
     * and `IPv6` CIDR blocks assigned to them. You can't specify `ipv6` for clusters in China Regions.
     *
     * You can only specify `ipv6` for `1.21` and later clusters that use version `1.10.1` or later
     * of the Amazon VPC CNI add-on. If you specify `ipv6` , then ensure that your VPC meets the
     * requirements listed in the considerations listed in [Assigning IPv6 addresses to pods and
     * services](https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html) in the Amazon EKS User
     * Guide. Kubernetes assigns services `IPv6` addresses from the unique local address range
     * `(fc00::/7)` . You can't specify a custom `IPv6` CIDR block. Pod addresses are assigned from the
     * subnet's `IPv6` CIDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html#cfn-eks-cluster-kubernetesnetworkconfig-ipfamily)
     */
    public fun ipFamily(): String? = unwrap(this).getIpFamily()

    /**
     * Don't specify a value if you select `ipv6` for *ipFamily* .
     *
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block,
     * Kubernetes assigns addresses from either the `10.100.0.0/16` or `172.20.0.0/16` CIDR blocks. We
     * recommend that you specify a block that does not overlap with resources in other networks that
     * are peered or connected to your VPC. The block must meet the following requirements:
     *
     * * Within one of the following private IP address blocks: `10.0.0.0/8` , `172.16.0.0/12` , or
     * `192.168.0.0/16` .
     * * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
     * * Between `/24` and `/12` .
     *
     *
     * You can only specify a custom CIDR block when you create a cluster. You can't change this
     * value after the cluster is created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html#cfn-eks-cluster-kubernetesnetworkconfig-serviceipv4cidr)
     */
    public fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

    /**
     * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created
     * a 1.21 or later cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified
     * `ipv6` for *ipFamily* when you created the cluster. Kubernetes assigns service addresses from
     * the unique local address range ( `fc00::/7` ) because you can't specify a custom IPv6 CIDR block
     * when you create the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html#cfn-eks-cluster-kubernetesnetworkconfig-serviceipv6cidr)
     */
    public fun serviceIpv6Cidr(): String? = unwrap(this).getServiceIpv6Cidr()

    /**
     * A builder for [KubernetesNetworkConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
       * addresses.
       * If you don't specify a value, `ipv4` is used by default. You can only specify an IP family
       * when you create a cluster and can't change this value once the cluster is created. If you
       * specify `ipv6` , the VPC and subnets that you specify for cluster creation must have both
       * `IPv4` and `IPv6` CIDR blocks assigned to them. You can't specify `ipv6` for clusters in China
       * Regions.
       *
       * You can only specify `ipv6` for `1.21` and later clusters that use version `1.10.1` or
       * later of the Amazon VPC CNI add-on. If you specify `ipv6` , then ensure that your VPC meets
       * the requirements listed in the considerations listed in [Assigning IPv6 addresses to pods and
       * services](https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html) in the Amazon EKS
       * User Guide. Kubernetes assigns services `IPv6` addresses from the unique local address range
       * `(fc00::/7)` . You can't specify a custom `IPv6` CIDR block. Pod addresses are assigned from
       * the subnet's `IPv6` CIDR.
       */
      public fun ipFamily(ipFamily: String)

      /**
       * @param serviceIpv4Cidr Don't specify a value if you select `ipv6` for *ipFamily* .
       * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a
       * block, Kubernetes assigns addresses from either the `10.100.0.0/16` or `172.20.0.0/16` CIDR
       * blocks. We recommend that you specify a block that does not overlap with resources in other
       * networks that are peered or connected to your VPC. The block must meet the following
       * requirements:
       *
       * * Within one of the following private IP address blocks: `10.0.0.0/8` , `172.16.0.0/12` ,
       * or `192.168.0.0/16` .
       * * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
       * * Between `/24` and `/12` .
       *
       *
       * You can only specify a custom CIDR block when you create a cluster. You can't change this
       * value after the cluster is created.
       */
      public fun serviceIpv4Cidr(serviceIpv4Cidr: String)

      /**
       * @param serviceIpv6Cidr The CIDR block that Kubernetes pod and service IP addresses are
       * assigned from if you created a 1.21 or later cluster with version 1.10.1 or later of the
       * Amazon VPC CNI add-on and specified `ipv6` for *ipFamily* when you created the cluster.
       * Kubernetes assigns service addresses from the unique local address range ( `fc00::/7` )
       * because you can't specify a custom IPv6 CIDR block when you create the cluster.
       */
      public fun serviceIpv6Cidr(serviceIpv6Cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty.builder()

      /**
       * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
       * addresses.
       * If you don't specify a value, `ipv4` is used by default. You can only specify an IP family
       * when you create a cluster and can't change this value once the cluster is created. If you
       * specify `ipv6` , the VPC and subnets that you specify for cluster creation must have both
       * `IPv4` and `IPv6` CIDR blocks assigned to them. You can't specify `ipv6` for clusters in China
       * Regions.
       *
       * You can only specify `ipv6` for `1.21` and later clusters that use version `1.10.1` or
       * later of the Amazon VPC CNI add-on. If you specify `ipv6` , then ensure that your VPC meets
       * the requirements listed in the considerations listed in [Assigning IPv6 addresses to pods and
       * services](https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html) in the Amazon EKS
       * User Guide. Kubernetes assigns services `IPv6` addresses from the unique local address range
       * `(fc00::/7)` . You can't specify a custom `IPv6` CIDR block. Pod addresses are assigned from
       * the subnet's `IPv6` CIDR.
       */
      override fun ipFamily(ipFamily: String) {
        cdkBuilder.ipFamily(ipFamily)
      }

      /**
       * @param serviceIpv4Cidr Don't specify a value if you select `ipv6` for *ipFamily* .
       * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a
       * block, Kubernetes assigns addresses from either the `10.100.0.0/16` or `172.20.0.0/16` CIDR
       * blocks. We recommend that you specify a block that does not overlap with resources in other
       * networks that are peered or connected to your VPC. The block must meet the following
       * requirements:
       *
       * * Within one of the following private IP address blocks: `10.0.0.0/8` , `172.16.0.0/12` ,
       * or `192.168.0.0/16` .
       * * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
       * * Between `/24` and `/12` .
       *
       *
       * You can only specify a custom CIDR block when you create a cluster. You can't change this
       * value after the cluster is created.
       */
      override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
        cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
      }

      /**
       * @param serviceIpv6Cidr The CIDR block that Kubernetes pod and service IP addresses are
       * assigned from if you created a 1.21 or later cluster with version 1.10.1 or later of the
       * Amazon VPC CNI add-on and specified `ipv6` for *ipFamily* when you created the cluster.
       * Kubernetes assigns service addresses from the unique local address range ( `fc00::/7` )
       * because you can't specify a custom IPv6 CIDR block when you create the cluster.
       */
      override fun serviceIpv6Cidr(serviceIpv6Cidr: String) {
        cdkBuilder.serviceIpv6Cidr(serviceIpv6Cidr)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty,
    ) : CdkObject(cdkObject), KubernetesNetworkConfigProperty {
      /**
       * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
       *
       * If you don't specify a value, `ipv4` is used by default. You can only specify an IP family
       * when you create a cluster and can't change this value once the cluster is created. If you
       * specify `ipv6` , the VPC and subnets that you specify for cluster creation must have both
       * `IPv4` and `IPv6` CIDR blocks assigned to them. You can't specify `ipv6` for clusters in China
       * Regions.
       *
       * You can only specify `ipv6` for `1.21` and later clusters that use version `1.10.1` or
       * later of the Amazon VPC CNI add-on. If you specify `ipv6` , then ensure that your VPC meets
       * the requirements listed in the considerations listed in [Assigning IPv6 addresses to pods and
       * services](https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html) in the Amazon EKS
       * User Guide. Kubernetes assigns services `IPv6` addresses from the unique local address range
       * `(fc00::/7)` . You can't specify a custom `IPv6` CIDR block. Pod addresses are assigned from
       * the subnet's `IPv6` CIDR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html#cfn-eks-cluster-kubernetesnetworkconfig-ipfamily)
       */
      override fun ipFamily(): String? = unwrap(this).getIpFamily()

      /**
       * Don't specify a value if you select `ipv6` for *ipFamily* .
       *
       * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a
       * block, Kubernetes assigns addresses from either the `10.100.0.0/16` or `172.20.0.0/16` CIDR
       * blocks. We recommend that you specify a block that does not overlap with resources in other
       * networks that are peered or connected to your VPC. The block must meet the following
       * requirements:
       *
       * * Within one of the following private IP address blocks: `10.0.0.0/8` , `172.16.0.0/12` ,
       * or `192.168.0.0/16` .
       * * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
       * * Between `/24` and `/12` .
       *
       *
       * You can only specify a custom CIDR block when you create a cluster. You can't change this
       * value after the cluster is created.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html#cfn-eks-cluster-kubernetesnetworkconfig-serviceipv4cidr)
       */
      override fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

      /**
       * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you
       * created a 1.21 or later cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and
       * specified `ipv6` for *ipFamily* when you created the cluster. Kubernetes assigns service
       * addresses from the unique local address range ( `fc00::/7` ) because you can't specify a
       * custom IPv6 CIDR block when you create the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html#cfn-eks-cluster-kubernetesnetworkconfig-serviceipv6cidr)
       */
      override fun serviceIpv6Cidr(): String? = unwrap(this).getServiceIpv6Cidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesNetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty):
          KubernetesNetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KubernetesNetworkConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty
    }
  }

  /**
   * The enabled logging type.
   *
   * For a list of the valid logging types, see the [`types` property of
   * `LogSetup`](https://docs.aws.amazon.com/eks/latest/APIReference/API_LogSetup.html#AmazonEKS-Type-LogSetup-types)
   * in the *Amazon EKS API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * LoggingTypeConfigProperty loggingTypeConfigProperty = LoggingTypeConfigProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-loggingtypeconfig.html)
   */
  public interface LoggingTypeConfigProperty {
    /**
     * The name of the log type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-loggingtypeconfig.html#cfn-eks-cluster-loggingtypeconfig-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [LoggingTypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The name of the log type.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty.builder()

      /**
       * @param type The name of the log type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty,
    ) : CdkObject(cdkObject), LoggingTypeConfigProperty {
      /**
       * The name of the log type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-loggingtypeconfig.html#cfn-eks-cluster-loggingtypeconfig-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty):
          LoggingTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingTypeConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.LoggingTypeConfigProperty
    }
  }

  /**
   * The encryption configuration for the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * EncryptionConfigProperty encryptionConfigProperty = EncryptionConfigProperty.builder()
   * .provider(ProviderProperty.builder()
   * .keyArn("keyArn")
   * .build())
   * .resources(List.of("resources"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html)
   */
  public interface EncryptionConfigProperty {
    /**
     * The encryption provider for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-provider)
     */
    public fun provider(): Any? = unwrap(this).getProvider()

    /**
     * Specifies the resources to be encrypted.
     *
     * The only supported value is `secrets` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-resources)
     */
    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * A builder for [EncryptionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provider The encryption provider for the cluster.
       */
      public fun provider(provider: IResolvable)

      /**
       * @param provider The encryption provider for the cluster.
       */
      public fun provider(provider: ProviderProperty)

      /**
       * @param provider The encryption provider for the cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba6e737e61209cc121faf7416cd1f79e39e64e9efc1ac515c84c441be6580677")
      public fun provider(provider: ProviderProperty.Builder.() -> Unit)

      /**
       * @param resources Specifies the resources to be encrypted.
       * The only supported value is `secrets` .
       */
      public fun resources(resources: List<String>)

      /**
       * @param resources Specifies the resources to be encrypted.
       * The only supported value is `secrets` .
       */
      public fun resources(vararg resources: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty.builder()

      /**
       * @param provider The encryption provider for the cluster.
       */
      override fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider.let(IResolvable::unwrap))
      }

      /**
       * @param provider The encryption provider for the cluster.
       */
      override fun provider(provider: ProviderProperty) {
        cdkBuilder.provider(provider.let(ProviderProperty::unwrap))
      }

      /**
       * @param provider The encryption provider for the cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba6e737e61209cc121faf7416cd1f79e39e64e9efc1ac515c84c441be6580677")
      override fun provider(provider: ProviderProperty.Builder.() -> Unit): Unit =
          provider(ProviderProperty(provider))

      /**
       * @param resources Specifies the resources to be encrypted.
       * The only supported value is `secrets` .
       */
      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      /**
       * @param resources Specifies the resources to be encrypted.
       * The only supported value is `secrets` .
       */
      override fun resources(vararg resources: String): Unit = resources(resources.toList())

      public fun build(): software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty,
    ) : CdkObject(cdkObject), EncryptionConfigProperty {
      /**
       * The encryption provider for the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-provider)
       */
      override fun provider(): Any? = unwrap(this).getProvider()

      /**
       * Specifies the resources to be encrypted.
       *
       * The only supported value is `secrets` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html#cfn-eks-cluster-encryptionconfig-resources)
       */
      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty):
          EncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigProperty):
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnCluster.EncryptionConfigProperty
    }
  }
}
