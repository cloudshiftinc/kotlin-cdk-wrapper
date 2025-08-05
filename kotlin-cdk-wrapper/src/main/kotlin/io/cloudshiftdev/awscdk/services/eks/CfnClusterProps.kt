@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
 * .bootstrapSelfManagedAddons(false)
 * .computeConfig(ComputeConfigProperty.builder()
 * .enabled(false)
 * .nodePools(List.of("nodePools"))
 * .nodeRoleArn("nodeRoleArn")
 * .build())
 * .encryptionConfig(List.of(EncryptionConfigProperty.builder()
 * .provider(ProviderProperty.builder()
 * .keyArn("keyArn")
 * .build())
 * .resources(List.of("resources"))
 * .build()))
 * .force(false)
 * .kubernetesNetworkConfig(KubernetesNetworkConfigProperty.builder()
 * .elasticLoadBalancing(ElasticLoadBalancingProperty.builder()
 * .enabled(false)
 * .build())
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
 * .remoteNetworkConfig(RemoteNetworkConfigProperty.builder()
 * .remoteNodeNetworks(List.of(RemoteNodeNetworkProperty.builder()
 * .cidrs(List.of("cidrs"))
 * .build()))
 * // the properties below are optional
 * .remotePodNetworks(List.of(RemotePodNetworkProperty.builder()
 * .cidrs(List.of("cidrs"))
 * .build()))
 * .build())
 * .storageConfig(StorageConfigProperty.builder()
 * .blockStorage(BlockStorageProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .upgradePolicy(UpgradePolicyProperty.builder()
 * .supportType("supportType")
 * .build())
 * .version("version")
 * .zonalShiftConfig(ZonalShiftConfigProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
 */
public interface CfnClusterProps {
  /**
   * The access configuration for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
   */
  public fun accessConfig(): Any? = unwrap(this).getAccessConfig()

  /**
   * If you set this value to `False` when creating a cluster, the default networking add-ons will
   * not be installed.
   *
   * The default networking add-ons include `vpc-cni` , `coredns` , and `kube-proxy` .
   *
   * Use this option when you plan to install third-party alternative add-ons or self-manage the
   * default networking add-ons.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-bootstrapselfmanagedaddons)
   */
  public fun bootstrapSelfManagedAddons(): Any? = unwrap(this).getBootstrapSelfManagedAddons()

  /**
   * Indicates the current configuration of the compute capability on your EKS Auto Mode cluster.
   *
   * For example, if the capability is enabled or disabled. If the compute capability is enabled,
   * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
   * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-computeconfig)
   */
  public fun computeConfig(): Any? = unwrap(this).getComputeConfig()

  /**
   * The encryption configuration for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
   */
  public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  /**
   * Set this value to `true` to override upgrade-blocking readiness checks when updating a cluster.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-force)
   */
  public fun force(): Any? = unwrap(this).getForce()

  /**
   * The Kubernetes network configuration for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
   */
  public fun kubernetesNetworkConfig(): Any? = unwrap(this).getKubernetesNetworkConfig()

  /**
   * The logging configuration for your cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
   */
  public fun logging(): Any? = unwrap(this).getLogging()

  /**
   * The unique name to give to your cluster.
   *
   * The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start
   * with an alphanumeric character and can't be longer than 100 characters. The name must be unique
   * within the AWS Region and AWS account that you're creating the cluster in. Note that underscores
   * can't be used in AWS CloudFormation .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
   *
   * This object isn't available for clusters on the AWS cloud.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
   */
  public fun outpostConfig(): Any? = unwrap(this).getOutpostConfig()

  /**
   * The configuration in the cluster for EKS Hybrid Nodes.
   *
   * You can add, change, or remove this configuration after the cluster is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-remotenetworkconfig)
   */
  public fun remoteNetworkConfig(): Any? = unwrap(this).getRemoteNetworkConfig()

  /**
   * The VPC configuration that's used by the cluster control plane.
   *
   * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more
   * information, see [Cluster VPC
   * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
   * Security Group
   * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
   * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
   * security groups, but we recommend that you use a dedicated security group for your cluster control
   * plane.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
   */
  public fun resourcesVpcConfig(): Any

  /**
   * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
   * control plane to make calls to AWS API operations on your behalf.
   *
   * For more information, see [Amazon EKS Service IAM
   * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon EKS
   * User Guide** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
   */
  public fun roleArn(): String

  /**
   * Indicates the current configuration of the block storage capability on your EKS Auto Mode
   * cluster.
   *
   * For example, if the capability is enabled or disabled. If the block storage capability is
   * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
   * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-storageconfig)
   */
  public fun storageConfig(): Any? = unwrap(this).getStorageConfig()

  /**
   * The metadata that you apply to the cluster to assist with categorization and organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Cluster tags don't
   * propagate to any other resources associated with the cluster.
   *
   *
   * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
   * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
   * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
   * unexpected behavior with stack-level tags propagating to the resource during resource creation and
   * update.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * This value indicates if extended support is enabled or disabled for the cluster.
   *
   * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
   * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-upgradepolicy)
   */
  public fun upgradePolicy(): Any? = unwrap(this).getUpgradePolicy()

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
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * The configuration for zonal shift for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-zonalshiftconfig)
   */
  public fun zonalShiftConfig(): Any? = unwrap(this).getZonalShiftConfig()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessConfig The access configuration for the cluster.
     */
    public fun accessConfig(accessConfig: IResolvable)

    /**
     * @param accessConfig The access configuration for the cluster.
     */
    public fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty)

    /**
     * @param accessConfig The access configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1db3433f0287bf06c66c1c5ca6c1dd41f89f3597d9ae877ce350be7da3102116")
    public fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty.Builder.() -> Unit)

    /**
     * @param bootstrapSelfManagedAddons If you set this value to `False` when creating a cluster,
     * the default networking add-ons will not be installed.
     * The default networking add-ons include `vpc-cni` , `coredns` , and `kube-proxy` .
     *
     * Use this option when you plan to install third-party alternative add-ons or self-manage the
     * default networking add-ons.
     */
    public fun bootstrapSelfManagedAddons(bootstrapSelfManagedAddons: Boolean)

    /**
     * @param bootstrapSelfManagedAddons If you set this value to `False` when creating a cluster,
     * the default networking add-ons will not be installed.
     * The default networking add-ons include `vpc-cni` , `coredns` , and `kube-proxy` .
     *
     * Use this option when you plan to install third-party alternative add-ons or self-manage the
     * default networking add-ons.
     */
    public fun bootstrapSelfManagedAddons(bootstrapSelfManagedAddons: IResolvable)

    /**
     * @param computeConfig Indicates the current configuration of the compute capability on your
     * EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     */
    public fun computeConfig(computeConfig: IResolvable)

    /**
     * @param computeConfig Indicates the current configuration of the compute capability on your
     * EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     */
    public fun computeConfig(computeConfig: CfnCluster.ComputeConfigProperty)

    /**
     * @param computeConfig Indicates the current configuration of the compute capability on your
     * EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6ecd17793f597e6c5dd37f6d83cee516e0e704371bd39c1145bde6d175a13f4")
    public fun computeConfig(computeConfig: CfnCluster.ComputeConfigProperty.Builder.() -> Unit)

    /**
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    public fun encryptionConfig(encryptionConfig: IResolvable)

    /**
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    public fun encryptionConfig(encryptionConfig: List<Any>)

    /**
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    public fun encryptionConfig(vararg encryptionConfig: Any)

    /**
     * @param force Set this value to `true` to override upgrade-blocking readiness checks when
     * updating a cluster.
     */
    public fun force(force: Boolean)

    /**
     * @param force Set this value to `true` to override upgrade-blocking readiness checks when
     * updating a cluster.
     */
    public fun force(force: IResolvable)

    /**
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable)

    /**
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    public
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty)

    /**
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60033b808bc2c46e2bf4e1a441fca8a9dd815f315d2a5568dbb6d3931b1bf306")
    public
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty.Builder.() -> Unit)

    /**
     * @param logging The logging configuration for your cluster.
     */
    public fun logging(logging: IResolvable)

    /**
     * @param logging The logging configuration for your cluster.
     */
    public fun logging(logging: CfnCluster.LoggingProperty)

    /**
     * @param logging The logging configuration for your cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d2bc3a155e2872611187d178db5a583b733421bee14c3b75b30c8281010491e")
    public fun logging(logging: CfnCluster.LoggingProperty.Builder.() -> Unit)

    /**
     * @param name The unique name to give to your cluster.
     * The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start
     * with an alphanumeric character and can't be longer than 100 characters. The name must be unique
     * within the AWS Region and AWS account that you're creating the cluster in. Note that underscores
     * can't be used in AWS CloudFormation .
     */
    public fun name(name: String)

    /**
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost.
     * This object isn't available for clusters on the AWS cloud.
     */
    public fun outpostConfig(outpostConfig: IResolvable)

    /**
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost.
     * This object isn't available for clusters on the AWS cloud.
     */
    public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty)

    /**
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost.
     * This object isn't available for clusters on the AWS cloud.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f1d69dea2f2c473564e7ee22b1f197e68618b93fee6df6d35b64ea8684fcb51")
    public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty.Builder.() -> Unit)

    /**
     * @param remoteNetworkConfig The configuration in the cluster for EKS Hybrid Nodes.
     * You can add, change, or remove this configuration after the cluster is created.
     */
    public fun remoteNetworkConfig(remoteNetworkConfig: IResolvable)

    /**
     * @param remoteNetworkConfig The configuration in the cluster for EKS Hybrid Nodes.
     * You can add, change, or remove this configuration after the cluster is created.
     */
    public fun remoteNetworkConfig(remoteNetworkConfig: CfnCluster.RemoteNetworkConfigProperty)

    /**
     * @param remoteNetworkConfig The configuration in the cluster for EKS Hybrid Nodes.
     * You can add, change, or remove this configuration after the cluster is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cec3c4da94376326ae42354991198f4e1d93dd7e05dd1e823a9f3349e00c936")
    public
        fun remoteNetworkConfig(remoteNetworkConfig: CfnCluster.RemoteNetworkConfigProperty.Builder.() -> Unit)

    /**
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     */
    public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable)

    /**
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     */
    public fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty)

    /**
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d542b7186da75779ed8fbe27de97ba53ed1a4b34a4898e25900b66bf7bbe406")
    public
        fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that provides permissions for
     * the Kubernetes control plane to make calls to AWS API operations on your behalf. 
     * For more information, see [Amazon EKS Service IAM
     * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon
     * EKS User Guide** .
     */
    public fun roleArn(roleArn: String)

    /**
     * @param storageConfig Indicates the current configuration of the block storage capability on
     * your EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     */
    public fun storageConfig(storageConfig: IResolvable)

    /**
     * @param storageConfig Indicates the current configuration of the block storage capability on
     * your EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     */
    public fun storageConfig(storageConfig: CfnCluster.StorageConfigProperty)

    /**
     * @param storageConfig Indicates the current configuration of the block storage capability on
     * your EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("166a9eef5624306eb4c35f4469db18fc5f85a3a2eea858dd618d78055a436f8f")
    public fun storageConfig(storageConfig: CfnCluster.StorageConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param upgradePolicy This value indicates if extended support is enabled or disabled for the
     * cluster.
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     */
    public fun upgradePolicy(upgradePolicy: IResolvable)

    /**
     * @param upgradePolicy This value indicates if extended support is enabled or disabled for the
     * cluster.
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     */
    public fun upgradePolicy(upgradePolicy: CfnCluster.UpgradePolicyProperty)

    /**
     * @param upgradePolicy This value indicates if extended support is enabled or disabled for the
     * cluster.
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4575816d8008e8e1ee5740e6ac42389be44347f8d3c7618e12a69a74dba5a5")
    public fun upgradePolicy(upgradePolicy: CfnCluster.UpgradePolicyProperty.Builder.() -> Unit)

    /**
     * @param version The desired Kubernetes version for your cluster.
     * If you don't specify a value here, the default version available in Amazon EKS is used.
     *
     *
     * The default version might not be the latest version available.
     */
    public fun version(version: String)

    /**
     * @param zonalShiftConfig The configuration for zonal shift for the cluster.
     */
    public fun zonalShiftConfig(zonalShiftConfig: IResolvable)

    /**
     * @param zonalShiftConfig The configuration for zonal shift for the cluster.
     */
    public fun zonalShiftConfig(zonalShiftConfig: CfnCluster.ZonalShiftConfigProperty)

    /**
     * @param zonalShiftConfig The configuration for zonal shift for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c5f21b35789f6dee7d63d21e0bc2bad59ef4e4f053bf2ff7c143876b0c9fb4")
    public
        fun zonalShiftConfig(zonalShiftConfig: CfnCluster.ZonalShiftConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnClusterProps.Builder =
        software.amazon.awscdk.services.eks.CfnClusterProps.builder()

    /**
     * @param accessConfig The access configuration for the cluster.
     */
    override fun accessConfig(accessConfig: IResolvable) {
      cdkBuilder.accessConfig(accessConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessConfig The access configuration for the cluster.
     */
    override fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty) {
      cdkBuilder.accessConfig(accessConfig.let(CfnCluster.AccessConfigProperty.Companion::unwrap))
    }

    /**
     * @param accessConfig The access configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1db3433f0287bf06c66c1c5ca6c1dd41f89f3597d9ae877ce350be7da3102116")
    override fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty.Builder.() -> Unit):
        Unit = accessConfig(CfnCluster.AccessConfigProperty(accessConfig))

    /**
     * @param bootstrapSelfManagedAddons If you set this value to `False` when creating a cluster,
     * the default networking add-ons will not be installed.
     * The default networking add-ons include `vpc-cni` , `coredns` , and `kube-proxy` .
     *
     * Use this option when you plan to install third-party alternative add-ons or self-manage the
     * default networking add-ons.
     */
    override fun bootstrapSelfManagedAddons(bootstrapSelfManagedAddons: Boolean) {
      cdkBuilder.bootstrapSelfManagedAddons(bootstrapSelfManagedAddons)
    }

    /**
     * @param bootstrapSelfManagedAddons If you set this value to `False` when creating a cluster,
     * the default networking add-ons will not be installed.
     * The default networking add-ons include `vpc-cni` , `coredns` , and `kube-proxy` .
     *
     * Use this option when you plan to install third-party alternative add-ons or self-manage the
     * default networking add-ons.
     */
    override fun bootstrapSelfManagedAddons(bootstrapSelfManagedAddons: IResolvable) {
      cdkBuilder.bootstrapSelfManagedAddons(bootstrapSelfManagedAddons.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param computeConfig Indicates the current configuration of the compute capability on your
     * EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     */
    override fun computeConfig(computeConfig: IResolvable) {
      cdkBuilder.computeConfig(computeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param computeConfig Indicates the current configuration of the compute capability on your
     * EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     */
    override fun computeConfig(computeConfig: CfnCluster.ComputeConfigProperty) {
      cdkBuilder.computeConfig(computeConfig.let(CfnCluster.ComputeConfigProperty.Companion::unwrap))
    }

    /**
     * @param computeConfig Indicates the current configuration of the compute capability on your
     * EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6ecd17793f597e6c5dd37f6d83cee516e0e704371bd39c1145bde6d175a13f4")
    override fun computeConfig(computeConfig: CfnCluster.ComputeConfigProperty.Builder.() -> Unit):
        Unit = computeConfig(CfnCluster.ComputeConfigProperty(computeConfig))

    /**
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    override fun encryptionConfig(encryptionConfig: IResolvable) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    override fun encryptionConfig(encryptionConfig: List<Any>) {
      cdkBuilder.encryptionConfig(encryptionConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    override fun encryptionConfig(vararg encryptionConfig: Any): Unit =
        encryptionConfig(encryptionConfig.toList())

    /**
     * @param force Set this value to `true` to override upgrade-blocking readiness checks when
     * updating a cluster.
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * @param force Set this value to `true` to override upgrade-blocking readiness checks when
     * updating a cluster.
     */
    override fun force(force: IResolvable) {
      cdkBuilder.force(force.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    override fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    override
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty) {
      cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig.let(CfnCluster.KubernetesNetworkConfigProperty.Companion::unwrap))
    }

    /**
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60033b808bc2c46e2bf4e1a441fca8a9dd815f315d2a5568dbb6d3931b1bf306")
    override
        fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty.Builder.() -> Unit):
        Unit =
        kubernetesNetworkConfig(CfnCluster.KubernetesNetworkConfigProperty(kubernetesNetworkConfig))

    /**
     * @param logging The logging configuration for your cluster.
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logging The logging configuration for your cluster.
     */
    override fun logging(logging: CfnCluster.LoggingProperty) {
      cdkBuilder.logging(logging.let(CfnCluster.LoggingProperty.Companion::unwrap))
    }

    /**
     * @param logging The logging configuration for your cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d2bc3a155e2872611187d178db5a583b733421bee14c3b75b30c8281010491e")
    override fun logging(logging: CfnCluster.LoggingProperty.Builder.() -> Unit): Unit =
        logging(CfnCluster.LoggingProperty(logging))

    /**
     * @param name The unique name to give to your cluster.
     * The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start
     * with an alphanumeric character and can't be longer than 100 characters. The name must be unique
     * within the AWS Region and AWS account that you're creating the cluster in. Note that underscores
     * can't be used in AWS CloudFormation .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost.
     * This object isn't available for clusters on the AWS cloud.
     */
    override fun outpostConfig(outpostConfig: IResolvable) {
      cdkBuilder.outpostConfig(outpostConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost.
     * This object isn't available for clusters on the AWS cloud.
     */
    override fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty) {
      cdkBuilder.outpostConfig(outpostConfig.let(CfnCluster.OutpostConfigProperty.Companion::unwrap))
    }

    /**
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     * cluster on an AWS Outpost.
     * This object isn't available for clusters on the AWS cloud.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f1d69dea2f2c473564e7ee22b1f197e68618b93fee6df6d35b64ea8684fcb51")
    override fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty.Builder.() -> Unit):
        Unit = outpostConfig(CfnCluster.OutpostConfigProperty(outpostConfig))

    /**
     * @param remoteNetworkConfig The configuration in the cluster for EKS Hybrid Nodes.
     * You can add, change, or remove this configuration after the cluster is created.
     */
    override fun remoteNetworkConfig(remoteNetworkConfig: IResolvable) {
      cdkBuilder.remoteNetworkConfig(remoteNetworkConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param remoteNetworkConfig The configuration in the cluster for EKS Hybrid Nodes.
     * You can add, change, or remove this configuration after the cluster is created.
     */
    override fun remoteNetworkConfig(remoteNetworkConfig: CfnCluster.RemoteNetworkConfigProperty) {
      cdkBuilder.remoteNetworkConfig(remoteNetworkConfig.let(CfnCluster.RemoteNetworkConfigProperty.Companion::unwrap))
    }

    /**
     * @param remoteNetworkConfig The configuration in the cluster for EKS Hybrid Nodes.
     * You can add, change, or remove this configuration after the cluster is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cec3c4da94376326ae42354991198f4e1d93dd7e05dd1e823a9f3349e00c936")
    override
        fun remoteNetworkConfig(remoteNetworkConfig: CfnCluster.RemoteNetworkConfigProperty.Builder.() -> Unit):
        Unit = remoteNetworkConfig(CfnCluster.RemoteNetworkConfigProperty(remoteNetworkConfig))

    /**
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     */
    override fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     */
    override fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty) {
      cdkBuilder.resourcesVpcConfig(resourcesVpcConfig.let(CfnCluster.ResourcesVpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see [Cluster VPC
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
     * Security Group
     * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
     * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
     * security groups, but we recommend that you use a dedicated security group for your cluster
     * control plane.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d542b7186da75779ed8fbe27de97ba53ed1a4b34a4898e25900b66bf7bbe406")
    override
        fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty.Builder.() -> Unit):
        Unit = resourcesVpcConfig(CfnCluster.ResourcesVpcConfigProperty(resourcesVpcConfig))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that provides permissions for
     * the Kubernetes control plane to make calls to AWS API operations on your behalf. 
     * For more information, see [Amazon EKS Service IAM
     * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon
     * EKS User Guide** .
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param storageConfig Indicates the current configuration of the block storage capability on
     * your EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     */
    override fun storageConfig(storageConfig: IResolvable) {
      cdkBuilder.storageConfig(storageConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param storageConfig Indicates the current configuration of the block storage capability on
     * your EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     */
    override fun storageConfig(storageConfig: CfnCluster.StorageConfigProperty) {
      cdkBuilder.storageConfig(storageConfig.let(CfnCluster.StorageConfigProperty.Companion::unwrap))
    }

    /**
     * @param storageConfig Indicates the current configuration of the block storage capability on
     * your EKS Auto Mode cluster.
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("166a9eef5624306eb4c35f4469db18fc5f85a3a2eea858dd618d78055a436f8f")
    override fun storageConfig(storageConfig: CfnCluster.StorageConfigProperty.Builder.() -> Unit):
        Unit = storageConfig(CfnCluster.StorageConfigProperty(storageConfig))

    /**
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param upgradePolicy This value indicates if extended support is enabled or disabled for the
     * cluster.
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     */
    override fun upgradePolicy(upgradePolicy: IResolvable) {
      cdkBuilder.upgradePolicy(upgradePolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param upgradePolicy This value indicates if extended support is enabled or disabled for the
     * cluster.
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     */
    override fun upgradePolicy(upgradePolicy: CfnCluster.UpgradePolicyProperty) {
      cdkBuilder.upgradePolicy(upgradePolicy.let(CfnCluster.UpgradePolicyProperty.Companion::unwrap))
    }

    /**
     * @param upgradePolicy This value indicates if extended support is enabled or disabled for the
     * cluster.
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4575816d8008e8e1ee5740e6ac42389be44347f8d3c7618e12a69a74dba5a5")
    override fun upgradePolicy(upgradePolicy: CfnCluster.UpgradePolicyProperty.Builder.() -> Unit):
        Unit = upgradePolicy(CfnCluster.UpgradePolicyProperty(upgradePolicy))

    /**
     * @param version The desired Kubernetes version for your cluster.
     * If you don't specify a value here, the default version available in Amazon EKS is used.
     *
     *
     * The default version might not be the latest version available.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * @param zonalShiftConfig The configuration for zonal shift for the cluster.
     */
    override fun zonalShiftConfig(zonalShiftConfig: IResolvable) {
      cdkBuilder.zonalShiftConfig(zonalShiftConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param zonalShiftConfig The configuration for zonal shift for the cluster.
     */
    override fun zonalShiftConfig(zonalShiftConfig: CfnCluster.ZonalShiftConfigProperty) {
      cdkBuilder.zonalShiftConfig(zonalShiftConfig.let(CfnCluster.ZonalShiftConfigProperty.Companion::unwrap))
    }

    /**
     * @param zonalShiftConfig The configuration for zonal shift for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c5f21b35789f6dee7d63d21e0bc2bad59ef4e4f053bf2ff7c143876b0c9fb4")
    override
        fun zonalShiftConfig(zonalShiftConfig: CfnCluster.ZonalShiftConfigProperty.Builder.() -> Unit):
        Unit = zonalShiftConfig(CfnCluster.ZonalShiftConfigProperty(zonalShiftConfig))

    public fun build(): software.amazon.awscdk.services.eks.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     */
    override fun accessConfig(): Any? = unwrap(this).getAccessConfig()

    /**
     * If you set this value to `False` when creating a cluster, the default networking add-ons will
     * not be installed.
     *
     * The default networking add-ons include `vpc-cni` , `coredns` , and `kube-proxy` .
     *
     * Use this option when you plan to install third-party alternative add-ons or self-manage the
     * default networking add-ons.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-bootstrapselfmanagedaddons)
     */
    override fun bootstrapSelfManagedAddons(): Any? = unwrap(this).getBootstrapSelfManagedAddons()

    /**
     * Indicates the current configuration of the compute capability on your EKS Auto Mode cluster.
     *
     * For example, if the capability is enabled or disabled. If the compute capability is enabled,
     * EKS Auto Mode will create and delete EC2 Managed Instances in your AWS account. For more
     * information, see EKS Auto Mode compute capability in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-computeconfig)
     */
    override fun computeConfig(): Any? = unwrap(this).getComputeConfig()

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     */
    override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    /**
     * Set this value to `true` to override upgrade-blocking readiness checks when updating a
     * cluster.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-force)
     */
    override fun force(): Any? = unwrap(this).getForce()

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     */
    override fun kubernetesNetworkConfig(): Any? = unwrap(this).getKubernetesNetworkConfig()

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     */
    override fun logging(): Any? = unwrap(this).getLogging()

    /**
     * The unique name to give to your cluster.
     *
     * The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start
     * with an alphanumeric character and can't be longer than 100 characters. The name must be unique
     * within the AWS Region and AWS account that you're creating the cluster in. Note that underscores
     * can't be used in AWS CloudFormation .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     */
    override fun outpostConfig(): Any? = unwrap(this).getOutpostConfig()

    /**
     * The configuration in the cluster for EKS Hybrid Nodes.
     *
     * You can add, change, or remove this configuration after the cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-remotenetworkconfig)
     */
    override fun remoteNetworkConfig(): Any? = unwrap(this).getRemoteNetworkConfig()

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
     */
    override fun resourcesVpcConfig(): Any = unwrap(this).getResourcesVpcConfig()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
     * control plane to make calls to AWS API operations on your behalf.
     *
     * For more information, see [Amazon EKS Service IAM
     * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon
     * EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Indicates the current configuration of the block storage capability on your EKS Auto Mode
     * cluster.
     *
     * For example, if the capability is enabled or disabled. If the block storage capability is
     * enabled, EKS Auto Mode will create and delete EBS volumes in your AWS account. For more
     * information, see EKS Auto Mode block storage capability in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-storageconfig)
     */
    override fun storageConfig(): Any? = unwrap(this).getStorageConfig()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * This value indicates if extended support is enabled or disabled for the cluster.
     *
     * [Learn more about EKS Extended Support in the *Amazon EKS User Guide*
     * .](https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-upgradepolicy)
     */
    override fun upgradePolicy(): Any? = unwrap(this).getUpgradePolicy()

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
     */
    override fun version(): String? = unwrap(this).getVersion()

    /**
     * The configuration for zonal shift for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-zonalshiftconfig)
     */
    override fun zonalShiftConfig(): Any? = unwrap(this).getZonalShiftConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.eks.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.CfnClusterProps
  }
}
