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
import software.amazon.awscdk.services.eks.ClusterOptions
import software.amazon.awscdk.services.eks.CoreDnsComputeType
import software.amazon.awscdk.services.eks.EndpointAccess
import software.amazon.awscdk.services.eks.IpFamily
import software.amazon.awscdk.services.eks.KubernetesVersion
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.ILayerVersion

/**
 * Options for EKS clusters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.eks.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.kms.*;
 * import software.amazon.awscdk.services.lambda.*;
 * AlbControllerVersion albControllerVersion;
 * EndpointAccess endpointAccess;
 * Key key;
 * KubernetesVersion kubernetesVersion;
 * LayerVersion layerVersion;
 * Object policy;
 * Role role;
 * SecurityGroup securityGroup;
 * Size size;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * ClusterOptions clusterOptions = ClusterOptions.builder()
 * .version(kubernetesVersion)
 * // the properties below are optional
 * .albController(AlbControllerOptions.builder()
 * .version(albControllerVersion)
 * // the properties below are optional
 * .policy(policy)
 * .repository("repository")
 * .build())
 * .awscliLayer(layerVersion)
 * .clusterHandlerEnvironment(Map.of(
 * "clusterHandlerEnvironmentKey", "clusterHandlerEnvironment"))
 * .clusterHandlerSecurityGroup(securityGroup)
 * .clusterLogging(List.of(ClusterLoggingTypes.API))
 * .clusterName("clusterName")
 * .coreDnsComputeType(CoreDnsComputeType.EC2)
 * .endpointAccess(endpointAccess)
 * .ipFamily(IpFamily.IP_V4)
 * .kubectlEnvironment(Map.of(
 * "kubectlEnvironmentKey", "kubectlEnvironment"))
 * .kubectlLayer(layerVersion)
 * .kubectlMemory(size)
 * .mastersRole(role)
 * .onEventLayer(layerVersion)
 * .outputClusterName(false)
 * .outputConfigCommand(false)
 * .outputMastersRoleArn(false)
 * .placeClusterHandlerInVpc(false)
 * .prune(false)
 * .role(role)
 * .secretsEncryptionKey(key)
 * .securityGroup(securityGroup)
 * .serviceIpv4Cidr("serviceIpv4Cidr")
 * .vpc(vpc)
 * .vpcSubnets(List.of(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ClusterOptionsDsl {
    private val cdkBuilder: ClusterOptions.Builder = ClusterOptions.builder()

    private val _clusterLogging: MutableList<ClusterLoggingTypes> = mutableListOf()

    private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

    /** @param albController Install the AWS Load Balancer Controller onto the cluster. */
    public fun albController(albController: AlbControllerOptionsDsl.() -> Unit = {}) {
        val builder = AlbControllerOptionsDsl()
        builder.apply(albController)
        cdkBuilder.albController(builder.build())
    }

    /** @param albController Install the AWS Load Balancer Controller onto the cluster. */
    public fun albController(albController: AlbControllerOptions) {
        cdkBuilder.albController(albController)
    }

    /**
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI. The handler expects the
     *   layer to include the following executables:
     * ```
     * /opt/awscli/aws
     * ```
     */
    public fun awscliLayer(awscliLayer: ILayerVersion) {
        cdkBuilder.awscliLayer(awscliLayer)
    }

    /**
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     *   endpoint to manage the cluster lifecycle.
     */
    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
        cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
    }

    /**
     * @param clusterHandlerSecurityGroup A security group to associate with the Cluster Handler's
     *   Lambdas. The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     */
    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
        cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup)
    }

    /** @param clusterLogging The cluster log types which you want to enable. */
    public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes) {
        _clusterLogging.addAll(listOf(*clusterLogging))
    }

    /** @param clusterLogging The cluster log types which you want to enable. */
    public fun clusterLogging(clusterLogging: Collection<ClusterLoggingTypes>) {
        _clusterLogging.addAll(clusterLogging)
    }

    /** @param clusterName Name for the cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     *   CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS.
     */
    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
        cdkBuilder.coreDnsComputeType(coreDnsComputeType)
    }

    /** @param endpointAccess Configure access to the Kubernetes API server endpoint.. */
    public fun endpointAccess(endpointAccess: EndpointAccess) {
        cdkBuilder.endpointAccess(endpointAccess)
    }

    /**
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     *   addresses.
     */
    public fun ipFamily(ipFamily: IpFamily) {
        cdkBuilder.ipFamily(ipFamily)
    }

    /**
     * @param kubectlEnvironment Environment variables for the kubectl execution. Only relevant for
     *   kubectl enabled clusters.
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
        cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm. This layer is used
     *   by the kubectl handler to apply manifests and install helm charts. You must pick an
     *   appropriate releases of one of the `&#64;aws-cdk/layer-kubectl-vXX` packages, that works
     *   with the version of Kubernetes you have chosen. If you don't supply this value `kubectl`
     *   1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     */
    public fun kubectlLayer(kubectlLayer: ILayerVersion) {
        cdkBuilder.kubectlLayer(kubectlLayer)
    }

    /** @param kubectlMemory Amount of memory to allocate to the provider's lambda function. */
    public fun kubectlMemory(kubectlMemory: Size) {
        cdkBuilder.kubectlMemory(kubectlMemory)
    }

    /**
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     *   group.
     */
    public fun mastersRole(mastersRole: IRole) {
        cdkBuilder.mastersRole(mastersRole)
    }

    /**
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`. This
     *   layer is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * By default, the provider will use the layer included in the
     * "aws-lambda-layer-node-proxy-agent" SAR application which is available in all commercial
     * regions.
     *
     * To deploy the layer locally define it in your app as follows:
     * ```
     * LayerVersion layer = LayerVersion.Builder.create(this, "proxy-agent-layer")
     * .code(Code.fromAsset(String.format("%s/layer.zip", __dirname)))
     * .compatibleRuntimes(List.of(Runtime.NODEJS_14_X))
     * .build();
     * ```
     */
    public fun onEventLayer(onEventLayer: ILayerVersion) {
        cdkBuilder.onEventLayer(onEventLayer)
    }

    /**
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     *   cluster will be synthesized.
     */
    public fun outputClusterName(outputClusterName: Boolean) {
        cdkBuilder.outputClusterName(outputClusterName)
    }

    /**
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     *   update-kubeconfig` command will be synthesized. This command will include the cluster name
     *   and, if applicable, the ARN of the masters IAM role.
     */
    public fun outputConfigCommand(outputConfigCommand: Boolean) {
        cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    /**
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     *   "masters" IAM role will be synthesized (if `mastersRole` is specified).
     */
    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
        cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    /**
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     *   in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy.
     */
    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
        cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    /**
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     *   automatically pruned. When this is enabled (default), prune labels will be allocated and
     *   injected to each resource. These labels will then be used when issuing the `kubectl apply`
     *   operation with the `--prune` switch.
     */
    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    /**
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     *   AWS API operations on your behalf.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /** @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets. */
    public fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
        cdkBuilder.secretsEncryptionKey(secretsEncryptionKey)
    }

    /** @param securityGroup Security Group to use for Control Plane ENIs. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. */
    public fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
        cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    /** @param version The Kubernetes version to run in the cluster. */
    public fun version(version: KubernetesVersion) {
        cdkBuilder.version(version)
    }

    /** @param vpc The VPC in which to create the Cluster. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs. If you want to create public load
     *   balancers, this must include public subnets.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
        _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
    }

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs. If you want to create public load
     *   balancers, this must include public subnets.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    public fun build(): ClusterOptions {
        if (_clusterLogging.isNotEmpty()) cdkBuilder.clusterLogging(_clusterLogging)
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
