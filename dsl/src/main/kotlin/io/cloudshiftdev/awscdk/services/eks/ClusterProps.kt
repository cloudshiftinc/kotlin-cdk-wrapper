package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ClusterProps : ClusterOptions {
  /**
   * Number of instances to allocate as an initial capacity for this cluster.
   *
   * Instance type can be configured through `defaultCapacityInstanceType`,
   * which defaults to `m5.large`.
   *
   * Use `cluster.addAutoScalingGroupCapacity` to add additional customized capacity. Set this
   * to `0` is you wish to avoid the initial capacity allocation.
   *
   * Default: 2
   */
  public fun defaultCapacity(): Number? = unwrap(this).getDefaultCapacity()

  /**
   * The instance type to use for the default capacity.
   *
   * This will only be taken
   * into account if `defaultCapacity` is &gt; 0.
   *
   * Default: m5.large
   */
  public fun defaultCapacityInstance(): InstanceType? =
      unwrap(this).getDefaultCapacityInstance()?.let(InstanceType::wrap)

  /**
   * The default capacity type for the cluster.
   *
   * Default: NODEGROUP
   */
  public fun defaultCapacityType(): DefaultCapacityType? =
      unwrap(this).getDefaultCapacityType()?.let(DefaultCapacityType::wrap)

  /**
   * The IAM role to pass to the Kubectl Lambda Handler.
   *
   * Default: - Default Lambda IAM Execution Role
   */
  public fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

  /**
   * The tags assigned to the EKS cluster.
   *
   * Default: - none
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [ClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param albController Install the AWS Load Balancer Controller onto the cluster.
     */
    public fun albController(albController: AlbControllerOptions)

    /**
     * @param albController Install the AWS Load Balancer Controller onto the cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58b259fd0fd4c6437511ab4b4e9b7577e84c77b191b58f90b8f88ea7c86ca441")
    public fun albController(albController: AlbControllerOptions.Builder.() -> Unit)

    /**
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI.
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/awscli/aws
     * ```
     */
    public fun awscliLayer(awscliLayer: ILayerVersion)

    /**
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     * endpoint to manage the cluster lifecycle.
     */
    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>)

    /**
     * @param clusterHandlerSecurityGroup A security group to associate with the Cluster Handler's
     * Lambdas.
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     */
    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup)

    /**
     * @param clusterLogging The cluster log types which you want to enable.
     */
    public fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>)

    /**
     * @param clusterLogging The cluster log types which you want to enable.
     */
    public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes)

    /**
     * @param clusterName Name for the cluster.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     * CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS.
     */
    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType)

    /**
     * @param defaultCapacity Number of instances to allocate as an initial capacity for this
     * cluster.
     * Instance type can be configured through `defaultCapacityInstanceType`,
     * which defaults to `m5.large`.
     *
     * Use `cluster.addAutoScalingGroupCapacity` to add additional customized capacity. Set this
     * to `0` is you wish to avoid the initial capacity allocation.
     */
    public fun defaultCapacity(defaultCapacity: Number)

    /**
     * @param defaultCapacityInstance The instance type to use for the default capacity.
     * This will only be taken
     * into account if `defaultCapacity` is &gt; 0.
     */
    public fun defaultCapacityInstance(defaultCapacityInstance: InstanceType)

    /**
     * @param defaultCapacityType The default capacity type for the cluster.
     */
    public fun defaultCapacityType(defaultCapacityType: DefaultCapacityType)

    /**
     * @param endpointAccess Configure access to the Kubernetes API server endpoint..
     */
    public fun endpointAccess(endpointAccess: EndpointAccess)

    /**
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses.
     */
    public fun ipFamily(ipFamily: IpFamily)

    /**
     * @param kubectlEnvironment Environment variables for the kubectl execution.
     * Only relevant for kubectl enabled clusters.
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

    /**
     * @param kubectlLambdaRole The IAM role to pass to the Kubectl Lambda Handler.
     */
    public fun kubectlLambdaRole(kubectlLambdaRole: IRole)

    /**
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm.
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
     */
    public fun kubectlLayer(kubectlLayer: ILayerVersion)

    /**
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function.
     */
    public fun kubectlMemory(kubectlMemory: Size)

    /**
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     * group.
     */
    public fun mastersRole(mastersRole: IRole)

    /**
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
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
     */
    public fun onEventLayer(onEventLayer: ILayerVersion)

    /**
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized.
     */
    public fun outputClusterName(outputClusterName: Boolean)

    /**
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized.
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     */
    public fun outputConfigCommand(outputConfigCommand: Boolean)

    /**
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     * "masters" IAM role will be synthesized (if `mastersRole` is specified).
     */
    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean)

    /**
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     * in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy.
     */
    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean)

    /**
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned.
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     */
    public fun prune(prune: Boolean)

    /**
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf.
     */
    public fun role(role: IRole)

    /**
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets.
     */
    public fun secretsEncryptionKey(secretsEncryptionKey: IKey)

    /**
     * @param securityGroup Security Group to use for Control Plane ENIs.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from.
     */
    public fun serviceIpv4Cidr(serviceIpv4Cidr: String)

    /**
     * @param tags The tags assigned to the EKS cluster.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param version The Kubernetes version to run in the cluster. 
     */
    public fun version(version: KubernetesVersion)

    /**
     * @param vpc The VPC in which to create the Cluster.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ClusterProps.Builder =
        software.amazon.awscdk.services.eks.ClusterProps.builder()

    /**
     * @param albController Install the AWS Load Balancer Controller onto the cluster.
     */
    override fun albController(albController: AlbControllerOptions) {
      cdkBuilder.albController(albController.let(AlbControllerOptions::unwrap))
    }

    /**
     * @param albController Install the AWS Load Balancer Controller onto the cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58b259fd0fd4c6437511ab4b4e9b7577e84c77b191b58f90b8f88ea7c86ca441")
    override fun albController(albController: AlbControllerOptions.Builder.() -> Unit): Unit =
        albController(AlbControllerOptions(albController))

    /**
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI.
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/awscli/aws
     * ```
     */
    override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    /**
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     * endpoint to manage the cluster lifecycle.
     */
    override fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
      cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
    }

    /**
     * @param clusterHandlerSecurityGroup A security group to associate with the Cluster Handler's
     * Lambdas.
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     */
    override fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
      cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param clusterLogging The cluster log types which you want to enable.
     */
    override fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>) {
      cdkBuilder.clusterLogging(clusterLogging.map(ClusterLoggingTypes::unwrap))
    }

    /**
     * @param clusterLogging The cluster log types which you want to enable.
     */
    override fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes): Unit =
        clusterLogging(clusterLogging.toList())

    /**
     * @param clusterName Name for the cluster.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     * CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS.
     */
    override fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
      cdkBuilder.coreDnsComputeType(coreDnsComputeType.let(CoreDnsComputeType::unwrap))
    }

    /**
     * @param defaultCapacity Number of instances to allocate as an initial capacity for this
     * cluster.
     * Instance type can be configured through `defaultCapacityInstanceType`,
     * which defaults to `m5.large`.
     *
     * Use `cluster.addAutoScalingGroupCapacity` to add additional customized capacity. Set this
     * to `0` is you wish to avoid the initial capacity allocation.
     */
    override fun defaultCapacity(defaultCapacity: Number) {
      cdkBuilder.defaultCapacity(defaultCapacity)
    }

    /**
     * @param defaultCapacityInstance The instance type to use for the default capacity.
     * This will only be taken
     * into account if `defaultCapacity` is &gt; 0.
     */
    override fun defaultCapacityInstance(defaultCapacityInstance: InstanceType) {
      cdkBuilder.defaultCapacityInstance(defaultCapacityInstance.let(InstanceType::unwrap))
    }

    /**
     * @param defaultCapacityType The default capacity type for the cluster.
     */
    override fun defaultCapacityType(defaultCapacityType: DefaultCapacityType) {
      cdkBuilder.defaultCapacityType(defaultCapacityType.let(DefaultCapacityType::unwrap))
    }

    /**
     * @param endpointAccess Configure access to the Kubernetes API server endpoint..
     */
    override fun endpointAccess(endpointAccess: EndpointAccess) {
      cdkBuilder.endpointAccess(endpointAccess.let(EndpointAccess::unwrap))
    }

    /**
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses.
     */
    override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
    }

    /**
     * @param kubectlEnvironment Environment variables for the kubectl execution.
     * Only relevant for kubectl enabled clusters.
     */
    override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * @param kubectlLambdaRole The IAM role to pass to the Kubectl Lambda Handler.
     */
    override fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
      cdkBuilder.kubectlLambdaRole(kubectlLambdaRole.let(IRole::unwrap))
    }

    /**
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm.
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
     */
    override fun kubectlLayer(kubectlLayer: ILayerVersion) {
      cdkBuilder.kubectlLayer(kubectlLayer.let(ILayerVersion::unwrap))
    }

    /**
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function.
     */
    override fun kubectlMemory(kubectlMemory: Size) {
      cdkBuilder.kubectlMemory(kubectlMemory.let(Size::unwrap))
    }

    /**
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     * group.
     */
    override fun mastersRole(mastersRole: IRole) {
      cdkBuilder.mastersRole(mastersRole.let(IRole::unwrap))
    }

    /**
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
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
     */
    override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    /**
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized.
     */
    override fun outputClusterName(outputClusterName: Boolean) {
      cdkBuilder.outputClusterName(outputClusterName)
    }

    /**
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized.
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     */
    override fun outputConfigCommand(outputConfigCommand: Boolean) {
      cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    /**
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     * "masters" IAM role will be synthesized (if `mastersRole` is specified).
     */
    override fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
      cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    /**
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     * in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy.
     */
    override fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
      cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    /**
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned.
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     */
    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    /**
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets.
     */
    override fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
      cdkBuilder.secretsEncryptionKey(secretsEncryptionKey.let(IKey::unwrap))
    }

    /**
     * @param securityGroup Security Group to use for Control Plane ENIs.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from.
     */
    override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
      cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    /**
     * @param tags The tags assigned to the EKS cluster.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param version The Kubernetes version to run in the cluster. 
     */
    override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    /**
     * @param vpc The VPC in which to create the Cluster.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where to place EKS Control Plane ENIs.
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     */
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.eks.ClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.ClusterProps,
  ) : CdkObject(cdkObject), ClusterProps {
    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     */
    override fun albController(): AlbControllerOptions? =
        unwrap(this).getAlbController()?.let(AlbControllerOptions::wrap)

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
     */
    override fun awscliLayer(): ILayerVersion? =
        unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

    /**
     * Custom environment variables when interacting with the EKS endpoint to manage the cluster
     * lifecycle.
     *
     * Default: - No environment variables.
     */
    override fun clusterHandlerEnvironment(): Map<String, String> =
        unwrap(this).getClusterHandlerEnvironment() ?: emptyMap()

    /**
     * A security group to associate with the Cluster Handler's Lambdas.
     *
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     *
     * Default: - No security group.
     */
    override fun clusterHandlerSecurityGroup(): ISecurityGroup? =
        unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     */
    override fun clusterLogging(): List<ClusterLoggingTypes> =
        unwrap(this).getClusterLogging()?.map(ClusterLoggingTypes::wrap) ?: emptyList()

    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * Controls the "eks.amazonaws.com/compute-type" annotation in the CoreDNS configuration on your
     * cluster to determine which compute type to use for CoreDNS.
     *
     * Default: CoreDnsComputeType.EC2 (for `FargateCluster` the default is FARGATE)
     */
    override fun coreDnsComputeType(): CoreDnsComputeType? =
        unwrap(this).getCoreDnsComputeType()?.let(CoreDnsComputeType::wrap)

    /**
     * Number of instances to allocate as an initial capacity for this cluster.
     *
     * Instance type can be configured through `defaultCapacityInstanceType`,
     * which defaults to `m5.large`.
     *
     * Use `cluster.addAutoScalingGroupCapacity` to add additional customized capacity. Set this
     * to `0` is you wish to avoid the initial capacity allocation.
     *
     * Default: 2
     */
    override fun defaultCapacity(): Number? = unwrap(this).getDefaultCapacity()

    /**
     * The instance type to use for the default capacity.
     *
     * This will only be taken
     * into account if `defaultCapacity` is &gt; 0.
     *
     * Default: m5.large
     */
    override fun defaultCapacityInstance(): InstanceType? =
        unwrap(this).getDefaultCapacityInstance()?.let(InstanceType::wrap)

    /**
     * The default capacity type for the cluster.
     *
     * Default: NODEGROUP
     */
    override fun defaultCapacityType(): DefaultCapacityType? =
        unwrap(this).getDefaultCapacityType()?.let(DefaultCapacityType::wrap)

    /**
     * Configure access to the Kubernetes API server endpoint..
     *
     * Default: EndpointAccess.PUBLIC_AND_PRIVATE
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     */
    override fun endpointAccess(): EndpointAccess? =
        unwrap(this).getEndpointAccess()?.let(EndpointAccess::wrap)

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     */
    override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    /**
     * Environment variables for the kubectl execution.
     *
     * Only relevant for kubectl enabled clusters.
     *
     * Default: - No environment variables.
     */
    override fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
        emptyMap()

    /**
     * The IAM role to pass to the Kubectl Lambda Handler.
     *
     * Default: - Default Lambda IAM Execution Role
     */
    override fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

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
     */
    override fun kubectlLayer(): ILayerVersion? =
        unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

    /**
     * Amount of memory to allocate to the provider's lambda function.
     *
     * Default: Size.gibibytes(1)
     */
    override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

    /**
     * An IAM role that will be added to the `system:masters` Kubernetes RBAC group.
     *
     * Default: - no masters role.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     */
    override fun mastersRole(): IRole? = unwrap(this).getMastersRole()?.let(IRole::wrap)

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
     */
    override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     */
    override fun outputClusterName(): Boolean? = unwrap(this).getOutputClusterName()

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     *
     * Default: true
     */
    override fun outputConfigCommand(): Boolean? = unwrap(this).getOutputConfigCommand()

    /**
     * Determines whether a CloudFormation output with the ARN of the "masters" IAM role will be
     * synthesized (if `mastersRole` is specified).
     *
     * Default: false
     */
    override fun outputMastersRoleArn(): Boolean? = unwrap(this).getOutputMastersRoleArn()

    /**
     * If set to true, the cluster handler functions will be placed in the private subnets of the
     * cluster vpc, subject to the `vpcSubnets` selection strategy.
     *
     * Default: false
     */
    override fun placeClusterHandlerInVpc(): Boolean? = unwrap(this).getPlaceClusterHandlerInVpc()

    /**
     * Indicates whether Kubernetes resources added through `addManifest()` can be automatically
     * pruned.
     *
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     *
     * Default: true
     */
    override fun prune(): Boolean? = unwrap(this).getPrune()

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * KMS secret for envelope encryption for Kubernetes secrets.
     *
     * Default: - By default, Kubernetes stores all secret object data within etcd and
     * all etcd volumes used by Amazon EKS are encrypted at the disk-level
     * using AWS-Managed encryption keys.
     */
    override fun secretsEncryptionKey(): IKey? =
        unwrap(this).getSecretsEncryptionKey()?.let(IKey::wrap)

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     *
     * Default: - Kubernetes assigns addresses from either the
     * 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-serviceIpv4Cidr)
     */
    override fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

    /**
     * The tags assigned to the EKS cluster.
     *
     * Default: - none
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The Kubernetes version to run in the cluster.
     */
    override fun version(): KubernetesVersion =
        unwrap(this).getVersion().let(KubernetesVersion::wrap)

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     */
    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ClusterProps): ClusterProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterProps): software.amazon.awscdk.services.eks.ClusterProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.ClusterProps
  }
}
