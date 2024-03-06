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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster
import software.constructs.Construct

/**
 * Creates an Amazon EKS control plane.
 *
 * The Amazon EKS control plane consists of control plane instances that run the Kubernetes
 * software, such as `etcd` and the API server. The control plane runs in an account managed by AWS
 * , and the Kubernetes API is exposed by the Amazon EKS API server endpoint. Each Amazon EKS
 * cluster control plane is single tenant and unique. It runs on its own set of Amazon EC2
 * instances.
 *
 * The cluster control plane is provisioned across multiple Availability Zones and fronted by an
 * Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network
 * interfaces in your VPC subnets to provide connectivity from the control plane instances to the
 * nodes (for example, to support `kubectl exec` , `logs` , and `proxy` data flows).
 *
 * Amazon EKS nodes run in your AWS account and connect to your cluster's control plane over the
 * Kubernetes API server endpoint and a certificate file that is created for your cluster.
 *
 * You can use the `endpointPublicAccess` and `endpointPrivateAccess` parameters to enable or
 * disable public and private access to your cluster's Kubernetes API server endpoint. By default,
 * public access is enabled, and private access is disabled. For more information, see
 * [Amazon EKS Cluster Endpoint Access Control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
 * in the **Amazon EKS User Guide** .
 *
 * You can use the `logging` parameter to enable or disable exporting the Kubernetes control plane
 * logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported
 * to CloudWatch Logs. For more information, see
 * [Amazon EKS Cluster Control Plane Logs](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
 * in the **Amazon EKS User Guide** .
 *
 * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control
 * plane logs. For more information, see
 * [CloudWatch Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
 *
 * In most cases, it takes several minutes to create a cluster. After you create an Amazon EKS
 * cluster, you must configure your Kubernetes tooling to communicate with the API server and launch
 * nodes into your cluster. For more information, see
 * [Allowing users to access your cluster](https://docs.aws.amazon.com/eks/latest/userguide/cluster-auth.html)
 * and
 * [Launching Amazon EKS nodes](https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html)
 * in the *Amazon EKS User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
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
@CdkDslMarker
public class CfnClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

    private val _encryptionConfig: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     *
     * @param accessConfig The access configuration for the cluster.
     */
    public fun accessConfig(accessConfig: IResolvable) {
        cdkBuilder.accessConfig(accessConfig)
    }

    /**
     * The access configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-accessconfig)
     *
     * @param accessConfig The access configuration for the cluster.
     */
    public fun accessConfig(accessConfig: CfnCluster.AccessConfigProperty) {
        cdkBuilder.accessConfig(accessConfig)
    }

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     *
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    public fun encryptionConfig(vararg encryptionConfig: Any) {
        _encryptionConfig.addAll(listOf(*encryptionConfig))
    }

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     *
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    public fun encryptionConfig(encryptionConfig: Collection<Any>) {
        _encryptionConfig.addAll(encryptionConfig)
    }

    /**
     * The encryption configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-encryptionconfig)
     *
     * @param encryptionConfig The encryption configuration for the cluster.
     */
    public fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     *
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
        cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig)
    }

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-kubernetesnetworkconfig)
     *
     * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
     */
    public fun kubernetesNetworkConfig(
        kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty
    ) {
        cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig)
    }

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     *
     * @param logging The logging configuration for your cluster.
     */
    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    /**
     * The logging configuration for your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-logging)
     *
     * @param logging The logging configuration for your cluster.
     */
    public fun logging(logging: CfnCluster.LoggingProperty) {
        cdkBuilder.logging(logging)
    }

    /**
     * The unique name to give to your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
     *
     * @param name The unique name to give to your cluster.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     *
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     *   cluster on an AWS Outpost.
     */
    public fun outpostConfig(outpostConfig: IResolvable) {
        cdkBuilder.outpostConfig(outpostConfig)
    }

    /**
     * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * This object isn't available for clusters on the AWS cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-outpostconfig)
     *
     * @param outpostConfig An object representing the configuration of your local Amazon EKS
     *   cluster on an AWS Outpost.
     */
    public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty) {
        cdkBuilder.outpostConfig(outpostConfig)
    }

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see
     * [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html)
     * and
     * [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html)
     * in the *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to
     * five security groups, but we recommend that you use a dedicated security group for your
     * cluster control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     *
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane.
     */
    public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
        cdkBuilder.resourcesVpcConfig(resourcesVpcConfig)
    }

    /**
     * The VPC configuration that's used by the cluster control plane.
     *
     * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For
     * more information, see
     * [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html)
     * and
     * [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html)
     * in the *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to
     * five security groups, but we recommend that you use a dedicated security group for your
     * cluster control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
     *
     * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane.
     */
    public fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty) {
        cdkBuilder.resourcesVpcConfig(resourcesVpcConfig)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes
     * control plane to make calls to AWS API operations on your behalf.
     *
     * For more information, see
     * [Amazon EKS Service IAM Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html)
     * in the **Amazon EKS User Guide** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that provides permissions for
     *   the Kubernetes control plane to make calls to AWS API operations on your behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The metadata that you apply to the cluster to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your
     * [IAM principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
     * to manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource
     * creation and update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
     *
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     *   organization.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The metadata that you apply to the cluster to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Cluster tags
     * don't propagate to any other resources associated with the cluster.
     *
     * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your
     * [IAM principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
     * to manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource
     * creation and update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-tags)
     *
     * @param tags The metadata that you apply to the cluster to assist with categorization and
     *   organization.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The desired Kubernetes version for your cluster.
     *
     * If you don't specify a value here, the default version available in Amazon EKS is used.
     *
     * The default version might not be the latest version available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-version)
     *
     * @param version The desired Kubernetes version for your cluster.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnCluster {
        if (_encryptionConfig.isNotEmpty()) cdkBuilder.encryptionConfig(_encryptionConfig)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
