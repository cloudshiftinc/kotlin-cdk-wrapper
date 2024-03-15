@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines an EKS cluster that runs entirely on AWS Fargate.
 *
 * The cluster is created with a default Fargate Profile that matches the
 * "default" and "kube-system" namespaces. You can add additional profiles using
 * `addFargateProfile`.
 *
 * Example:
 *
 * ```
 * FargateCluster cluster = FargateCluster.Builder.create(this, "MyCluster")
 * .version(KubernetesVersion.V1_29)
 * .build();
 * ```
 */
public open class FargateCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.FargateCluster,
) : Cluster(cdkObject) {
  /**
   * Fargate Profile that was created with the cluster.
   */
  public open fun defaultProfile(): FargateProfile =
      unwrap(this).getDefaultProfile().let(FargateProfile::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.FargateCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    public fun albController(albController: AlbControllerOptions)

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528a333dd842b13c5cafad907c7593e4e97283440c6757fd7bf66f1e17707f07")
    public fun albController(albController: AlbControllerOptions.Builder.() -> Unit)

    /**
     * An AWS Lambda layer that contains the `aws` CLI.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/awscli/aws
     * ```
     *
     * Default: - a default layer with the AWS CLI 1.x
     *
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI. 
     */
    public fun awscliLayer(awscliLayer: ILayerVersion)

    /**
     * Custom environment variables when interacting with the EKS endpoint to manage the cluster
     * lifecycle.
     *
     * Default: - No environment variables.
     *
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     * endpoint to manage the cluster lifecycle. 
     */
    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>)

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
     * Lambdas. 
     */
    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup)

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    public fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>)

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes)

    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     *
     * @param clusterName Name for the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * Controls the "eks.amazonaws.com/compute-type" annotation in the CoreDNS configuration on your
     * cluster to determine which compute type to use for CoreDNS.
     *
     * Default: CoreDnsComputeType.EC2 (for `FargateCluster` the default is FARGATE)
     *
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     * CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS. 
     */
    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType)

    /**
     * Fargate Profile to create along with the cluster.
     *
     * Default: - A profile called "default" with 'default' and 'kube-system'
     * selectors will be created if this is left undefined.
     *
     * @param defaultProfile Fargate Profile to create along with the cluster. 
     */
    public fun defaultProfile(defaultProfile: FargateProfileOptions)

    /**
     * Fargate Profile to create along with the cluster.
     *
     * Default: - A profile called "default" with 'default' and 'kube-system'
     * selectors will be created if this is left undefined.
     *
     * @param defaultProfile Fargate Profile to create along with the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc860ea781697ba194a8fdaea2f9a54f5247fffaacaaa032cb4d272ce0b6e7b9")
    public fun defaultProfile(defaultProfile: FargateProfileOptions.Builder.() -> Unit)

    /**
     * Configure access to the Kubernetes API server endpoint..
     *
     * Default: EndpointAccess.PUBLIC_AND_PRIVATE
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     * @param endpointAccess Configure access to the Kubernetes API server endpoint.. 
     */
    public fun endpointAccess(endpointAccess: EndpointAccess)

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses. 
     */
    public fun ipFamily(ipFamily: IpFamily)

    /**
     * Environment variables for the kubectl execution.
     *
     * Only relevant for kubectl enabled clusters.
     *
     * Default: - No environment variables.
     *
     * @param kubectlEnvironment Environment variables for the kubectl execution. 
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

    /**
     * An AWS Lambda Layer which includes `kubectl` and Helm.
     *
     * This layer is used by the kubectl handler to apply manifests and install
     * helm charts. You must pick an appropriate releases of one of the
     * `&#64;aws-cdk/layer-kubectl-vXX` packages, that works with the version of
     * Kubernetes you have chosen. If you don't supply this value `kubectl`
     * 1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     *
     * Default: - a default layer with Kubectl 1.20.
     *
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm. 
     */
    public fun kubectlLayer(kubectlLayer: ILayerVersion)

    /**
     * Amount of memory to allocate to the provider's lambda function.
     *
     * Default: Size.gibibytes(1)
     *
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function. 
     */
    public fun kubectlMemory(kubectlMemory: Size)

    /**
     * An IAM role that will be added to the `system:masters` Kubernetes RBAC group.
     *
     * Default: - no masters role.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     * group. 
     */
    public fun mastersRole(mastersRole: IRole)

    /**
     * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     *
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * By default, the provider will use the layer included in the
     * "aws-lambda-layer-node-proxy-agent" SAR application which is available in all
     * commercial regions.
     *
     * To deploy the layer locally define it in your app as follows:
     *
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
    public fun onEventLayer(onEventLayer: ILayerVersion)

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     *
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized. 
     */
    public fun outputClusterName(outputClusterName: Boolean)

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     *
     * Default: true
     *
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized. 
     */
    public fun outputConfigCommand(outputConfigCommand: Boolean)

    /**
     * Determines whether a CloudFormation output with the ARN of the "masters" IAM role will be
     * synthesized (if `mastersRole` is specified).
     *
     * Default: false
     *
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     * "masters" IAM role will be synthesized (if `mastersRole` is specified). 
     */
    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean)

    /**
     * If set to true, the cluster handler functions will be placed in the private subnets of the
     * cluster vpc, subject to the `vpcSubnets` selection strategy.
     *
     * Default: false
     *
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     * in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy. 
     */
    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean)

    /**
     * Indicates whether Kubernetes resources added through `addManifest()` can be automatically
     * pruned.
     *
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     *
     * Default: true
     *
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned. 
     */
    public fun prune(prune: Boolean)

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     *
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf. 
     */
    public fun role(role: IRole)

    /**
     * KMS secret for envelope encryption for Kubernetes secrets.
     *
     * Default: - By default, Kubernetes stores all secret object data within etcd and
     * all etcd volumes used by Amazon EKS are encrypted at the disk-level
     * using AWS-Managed encryption keys.
     *
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets. 
     */
    public fun secretsEncryptionKey(secretsEncryptionKey: IKey)

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     *
     * @param securityGroup Security Group to use for Control Plane ENIs. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     *
     * Default: - Kubernetes assigns addresses from either the
     * 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-serviceIpv4Cidr)
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. 
     */
    public fun serviceIpv4Cidr(serviceIpv4Cidr: String)

    /**
     * The Kubernetes version to run in the cluster.
     *
     * @param version The Kubernetes version to run in the cluster. 
     */
    public fun version(version: KubernetesVersion)

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     *
     * @param vpc The VPC in which to create the Cluster. 
     */
    public fun vpc(vpc: IVpc)

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
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

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
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateCluster.Builder =
        software.amazon.awscdk.services.eks.FargateCluster.Builder.create(scope, id)

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    override fun albController(albController: AlbControllerOptions) {
      cdkBuilder.albController(albController.let(AlbControllerOptions::unwrap))
    }

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528a333dd842b13c5cafad907c7593e4e97283440c6757fd7bf66f1e17707f07")
    override fun albController(albController: AlbControllerOptions.Builder.() -> Unit): Unit =
        albController(AlbControllerOptions(albController))

    /**
     * An AWS Lambda layer that contains the `aws` CLI.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/awscli/aws
     * ```
     *
     * Default: - a default layer with the AWS CLI 1.x
     *
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI. 
     */
    override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    /**
     * Custom environment variables when interacting with the EKS endpoint to manage the cluster
     * lifecycle.
     *
     * Default: - No environment variables.
     *
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     * endpoint to manage the cluster lifecycle. 
     */
    override fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
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
     * Lambdas. 
     */
    override fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
      cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    override fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>) {
      cdkBuilder.clusterLogging(clusterLogging.map(ClusterLoggingTypes::unwrap))
    }

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    override fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes): Unit =
        clusterLogging(clusterLogging.toList())

    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     *
     * @param clusterName Name for the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * Controls the "eks.amazonaws.com/compute-type" annotation in the CoreDNS configuration on your
     * cluster to determine which compute type to use for CoreDNS.
     *
     * Default: CoreDnsComputeType.EC2 (for `FargateCluster` the default is FARGATE)
     *
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     * CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS. 
     */
    override fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
      cdkBuilder.coreDnsComputeType(coreDnsComputeType.let(CoreDnsComputeType::unwrap))
    }

    /**
     * Fargate Profile to create along with the cluster.
     *
     * Default: - A profile called "default" with 'default' and 'kube-system'
     * selectors will be created if this is left undefined.
     *
     * @param defaultProfile Fargate Profile to create along with the cluster. 
     */
    override fun defaultProfile(defaultProfile: FargateProfileOptions) {
      cdkBuilder.defaultProfile(defaultProfile.let(FargateProfileOptions::unwrap))
    }

    /**
     * Fargate Profile to create along with the cluster.
     *
     * Default: - A profile called "default" with 'default' and 'kube-system'
     * selectors will be created if this is left undefined.
     *
     * @param defaultProfile Fargate Profile to create along with the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc860ea781697ba194a8fdaea2f9a54f5247fffaacaaa032cb4d272ce0b6e7b9")
    override fun defaultProfile(defaultProfile: FargateProfileOptions.Builder.() -> Unit): Unit =
        defaultProfile(FargateProfileOptions(defaultProfile))

    /**
     * Configure access to the Kubernetes API server endpoint..
     *
     * Default: EndpointAccess.PUBLIC_AND_PRIVATE
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     * @param endpointAccess Configure access to the Kubernetes API server endpoint.. 
     */
    override fun endpointAccess(endpointAccess: EndpointAccess) {
      cdkBuilder.endpointAccess(endpointAccess.let(EndpointAccess::unwrap))
    }

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses. 
     */
    override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
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
    override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * An AWS Lambda Layer which includes `kubectl` and Helm.
     *
     * This layer is used by the kubectl handler to apply manifests and install
     * helm charts. You must pick an appropriate releases of one of the
     * `&#64;aws-cdk/layer-kubectl-vXX` packages, that works with the version of
     * Kubernetes you have chosen. If you don't supply this value `kubectl`
     * 1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     *
     * Default: - a default layer with Kubectl 1.20.
     *
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm. 
     */
    override fun kubectlLayer(kubectlLayer: ILayerVersion) {
      cdkBuilder.kubectlLayer(kubectlLayer.let(ILayerVersion::unwrap))
    }

    /**
     * Amount of memory to allocate to the provider's lambda function.
     *
     * Default: Size.gibibytes(1)
     *
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function. 
     */
    override fun kubectlMemory(kubectlMemory: Size) {
      cdkBuilder.kubectlMemory(kubectlMemory.let(Size::unwrap))
    }

    /**
     * An IAM role that will be added to the `system:masters` Kubernetes RBAC group.
     *
     * Default: - no masters role.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     * group. 
     */
    override fun mastersRole(mastersRole: IRole) {
      cdkBuilder.mastersRole(mastersRole.let(IRole::unwrap))
    }

    /**
     * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     *
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * By default, the provider will use the layer included in the
     * "aws-lambda-layer-node-proxy-agent" SAR application which is available in all
     * commercial regions.
     *
     * To deploy the layer locally define it in your app as follows:
     *
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
    override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     *
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized. 
     */
    override fun outputClusterName(outputClusterName: Boolean) {
      cdkBuilder.outputClusterName(outputClusterName)
    }

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     *
     * Default: true
     *
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized. 
     */
    override fun outputConfigCommand(outputConfigCommand: Boolean) {
      cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    /**
     * Determines whether a CloudFormation output with the ARN of the "masters" IAM role will be
     * synthesized (if `mastersRole` is specified).
     *
     * Default: false
     *
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     * "masters" IAM role will be synthesized (if `mastersRole` is specified). 
     */
    override fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
      cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    /**
     * If set to true, the cluster handler functions will be placed in the private subnets of the
     * cluster vpc, subject to the `vpcSubnets` selection strategy.
     *
     * Default: false
     *
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     * in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy. 
     */
    override fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
      cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    /**
     * Indicates whether Kubernetes resources added through `addManifest()` can be automatically
     * pruned.
     *
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     *
     * Default: true
     *
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned. 
     */
    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     *
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * KMS secret for envelope encryption for Kubernetes secrets.
     *
     * Default: - By default, Kubernetes stores all secret object data within etcd and
     * all etcd volumes used by Amazon EKS are encrypted at the disk-level
     * using AWS-Managed encryption keys.
     *
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets. 
     */
    override fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
      cdkBuilder.secretsEncryptionKey(secretsEncryptionKey.let(IKey::unwrap))
    }

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     *
     * @param securityGroup Security Group to use for Control Plane ENIs. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     *
     * Default: - Kubernetes assigns addresses from either the
     * 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-serviceIpv4Cidr)
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. 
     */
    override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
      cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    /**
     * The Kubernetes version to run in the cluster.
     *
     * @param version The Kubernetes version to run in the cluster. 
     */
    override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     *
     * @param vpc The VPC in which to create the Cluster. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
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
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
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
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.eks.FargateCluster = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateCluster): FargateCluster
        = FargateCluster(cdkObject)

    internal fun unwrap(wrapped: FargateCluster): software.amazon.awscdk.services.eks.FargateCluster
        = wrapped.cdkObject
  }
}
