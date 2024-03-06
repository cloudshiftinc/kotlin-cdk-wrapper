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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.AlbControllerOptions
import software.amazon.awscdk.services.eks.ClusterLoggingTypes
import software.amazon.awscdk.services.eks.CoreDnsComputeType
import software.amazon.awscdk.services.eks.EndpointAccess
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateProfileOptions
import software.amazon.awscdk.services.eks.IpFamily
import software.amazon.awscdk.services.eks.KubernetesVersion
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.ILayerVersion
import software.constructs.Construct

/**
 * Defines an EKS cluster that runs entirely on AWS Fargate.
 *
 * The cluster is created with a default Fargate Profile that matches the "default" and
 * "kube-system" namespaces. You can add additional profiles using `addFargateProfile`.
 *
 * Example:
 * ```
 * FargateCluster cluster = FargateCluster.Builder.create(this, "MyCluster")
 * .version(KubernetesVersion.V1_29)
 * .build();
 * ```
 */
@CdkDslMarker
public class FargateClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FargateCluster.Builder = FargateCluster.Builder.create(scope, id)

    private val _clusterLogging: MutableList<ClusterLoggingTypes> = mutableListOf()

    private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     *
     * @param albController Install the AWS Load Balancer Controller onto the cluster.
     */
    public fun albController(albController: AlbControllerOptionsDsl.() -> Unit = {}) {
        val builder = AlbControllerOptionsDsl()
        builder.apply(albController)
        cdkBuilder.albController(builder.build())
    }

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     *
     * @param albController Install the AWS Load Balancer Controller onto the cluster.
     */
    public fun albController(albController: AlbControllerOptions) {
        cdkBuilder.albController(albController)
    }

    /**
     * An AWS Lambda layer that contains the `aws` CLI.
     *
     * The handler expects the layer to include the following executables:
     * ```
     * /opt/awscli/aws
     * ```
     *
     * Default: - a default layer with the AWS CLI 1.x
     *
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI.
     */
    public fun awscliLayer(awscliLayer: ILayerVersion) {
        cdkBuilder.awscliLayer(awscliLayer)
    }

    /**
     * Custom environment variables when interacting with the EKS endpoint to manage the cluster
     * lifecycle.
     *
     * Default: - No environment variables.
     *
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     *   endpoint to manage the cluster lifecycle.
     */
    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
        cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
    }

    /**
     * A security group to associate with the Cluster Handler's Lambdas.
     *
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     *
     * Default: - No security group.
     *
     * @param clusterHandlerSecurityGroup A security group to associate with the Cluster Handler's
     *   Lambdas.
     */
    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
        cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup)
    }

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable.
     */
    public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes) {
        _clusterLogging.addAll(listOf(*clusterLogging))
    }

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable.
     */
    public fun clusterLogging(clusterLogging: Collection<ClusterLoggingTypes>) {
        _clusterLogging.addAll(clusterLogging)
    }

    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     *
     * @param clusterName Name for the cluster.
     */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * Controls the "eks.amazonaws.com/compute-type" annotation in the CoreDNS configuration on your
     * cluster to determine which compute type to use for CoreDNS.
     *
     * Default: CoreDnsComputeType.EC2 (for `FargateCluster` the default is FARGATE)
     *
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     *   CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS.
     */
    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
        cdkBuilder.coreDnsComputeType(coreDnsComputeType)
    }

    /**
     * Fargate Profile to create along with the cluster.
     *
     * Default: - A profile called "default" with 'default' and 'kube-system' selectors will be
     * created if this is left undefined.
     *
     * @param defaultProfile Fargate Profile to create along with the cluster.
     */
    public fun defaultProfile(defaultProfile: FargateProfileOptionsDsl.() -> Unit = {}) {
        val builder = FargateProfileOptionsDsl()
        builder.apply(defaultProfile)
        cdkBuilder.defaultProfile(builder.build())
    }

    /**
     * Fargate Profile to create along with the cluster.
     *
     * Default: - A profile called "default" with 'default' and 'kube-system' selectors will be
     * created if this is left undefined.
     *
     * @param defaultProfile Fargate Profile to create along with the cluster.
     */
    public fun defaultProfile(defaultProfile: FargateProfileOptions) {
        cdkBuilder.defaultProfile(defaultProfile)
    }

    /**
     * Configure access to the Kubernetes API server endpoint..
     *
     * Default: EndpointAccess.PUBLIC_AND_PRIVATE
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     *
     * @param endpointAccess Configure access to the Kubernetes API server endpoint..
     */
    public fun endpointAccess(endpointAccess: EndpointAccess) {
        cdkBuilder.endpointAccess(endpointAccess)
    }

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     *
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     *   addresses.
     */
    public fun ipFamily(ipFamily: IpFamily) {
        cdkBuilder.ipFamily(ipFamily)
    }

    /**
     * Environment variables for the kubectl execution.
     *
     * Only relevant for kubectl enabled clusters.
     *
     * Default: - No environment variables.
     *
     * @param kubectlEnvironment Environment variables for the kubectl execution.
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
        cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * An AWS Lambda Layer which includes `kubectl` and Helm.
     *
     * This layer is used by the kubectl handler to apply manifests and install helm charts. You
     * must pick an appropriate releases of one of the `&#64;aws-cdk/layer-kubectl-vXX` packages,
     * that works with the version of Kubernetes you have chosen. If you don't supply this value
     * `kubectl` 1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     *
     * Default: - a default layer with Kubectl 1.20.
     *
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm.
     */
    public fun kubectlLayer(kubectlLayer: ILayerVersion) {
        cdkBuilder.kubectlLayer(kubectlLayer)
    }

    /**
     * Amount of memory to allocate to the provider's lambda function.
     *
     * Default: Size.gibibytes(1)
     *
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function.
     */
    public fun kubectlMemory(kubectlMemory: Size) {
        cdkBuilder.kubectlMemory(kubectlMemory)
    }

    /**
     * An IAM role that will be added to the `system:masters` Kubernetes RBAC group.
     *
     * Default: - no masters role.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     *
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     *   group.
     */
    public fun mastersRole(mastersRole: IRole) {
        cdkBuilder.mastersRole(mastersRole)
    }

    /**
     * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     *
     * This layer is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * By default, the provider will use the layer included in the
     * "aws-lambda-layer-node-proxy-agent" SAR application which is available in all commercial
     * regions.
     *
     * To deploy the layer locally define it in your app as follows:
     * ```
     * LayerVersion layer = LayerVersion.Builder.create(this, "proxy-agent-layer")
     * .code(Code.fromAsset(String.format("%s/layer.zip", __dirname)))
     * .compatibleRuntimes(List.of(Runtime.NODEJS_LATEST))
     * .build();
     * ```
     *
     * Default: - a layer bundled with this module.
     *
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     */
    public fun onEventLayer(onEventLayer: ILayerVersion) {
        cdkBuilder.onEventLayer(onEventLayer)
    }

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     *
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     *   cluster will be synthesized.
     */
    public fun outputClusterName(outputClusterName: Boolean) {
        cdkBuilder.outputClusterName(outputClusterName)
    }

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include the cluster name and, if applicable, the ARN of the masters IAM
     * role.
     *
     * Default: true
     *
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     *   update-kubeconfig` command will be synthesized.
     */
    public fun outputConfigCommand(outputConfigCommand: Boolean) {
        cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    /**
     * Determines whether a CloudFormation output with the ARN of the "masters" IAM role will be
     * synthesized (if `mastersRole` is specified).
     *
     * Default: false
     *
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     *   "masters" IAM role will be synthesized (if `mastersRole` is specified).
     */
    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
        cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    /**
     * If set to true, the cluster handler functions will be placed in the private subnets of the
     * cluster vpc, subject to the `vpcSubnets` selection strategy.
     *
     * Default: false
     *
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     *   in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy.
     */
    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
        cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    /**
     * Indicates whether Kubernetes resources added through `addManifest()` can be automatically
     * pruned.
     *
     * When this is enabled (default), prune labels will be allocated and injected to each resource.
     * These labels will then be used when issuing the `kubectl apply` operation with the `--prune`
     * switch.
     *
     * Default: true
     *
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     *   automatically pruned.
     */
    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     *
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     *   AWS API operations on your behalf.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * KMS secret for envelope encryption for Kubernetes secrets.
     *
     * Default: - By default, Kubernetes stores all secret object data within etcd and all etcd
     * volumes used by Amazon EKS are encrypted at the disk-level using AWS-Managed encryption keys.
     *
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets.
     */
    public fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
        cdkBuilder.secretsEncryptionKey(secretsEncryptionKey)
    }

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     *
     * @param securityGroup Security Group to use for Control Plane ENIs.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     *
     * Default: - Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR
     * blocks
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-serviceIpv4Cidr)
     *
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from.
     */
    public fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
        cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    /**
     * The Kubernetes version to run in the cluster.
     *
     * @param version The Kubernetes version to run in the cluster.
     */
    public fun version(version: KubernetesVersion) {
        cdkBuilder.version(version)
    }

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     *
     * @param vpc The VPC in which to create the Cluster.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     *
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
        _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
    }

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     *
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     */
    public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    public fun build(): FargateCluster {
        if (_clusterLogging.isNotEmpty()) cdkBuilder.clusterLogging(_clusterLogging)
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
