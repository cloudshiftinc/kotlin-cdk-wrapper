package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ClusterAttributes {
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
  public fun awscliLayer(): ILayerVersion? = unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  /**
   * The certificate-authority-data for your cluster.
   *
   * Default: - if not specified `cluster.clusterCertificateAuthorityData` will
   * throw an error
   */
  public fun clusterCertificateAuthorityData(): String? =
      unwrap(this).getClusterCertificateAuthorityData()

  /**
   * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
   *
   * Default: - if not specified `cluster.clusterEncryptionConfigKeyArn` will
   * throw an error
   */
  public fun clusterEncryptionConfigKeyArn(): String? =
      unwrap(this).getClusterEncryptionConfigKeyArn()

  /**
   * The API Server endpoint URL.
   *
   * Default: - if not specified `cluster.clusterEndpoint` will throw an error.
   */
  public fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

  /**
   * A security group id to associate with the Cluster Handler's Lambdas.
   *
   * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
   *
   * Default: - No security group.
   */
  public fun clusterHandlerSecurityGroupId(): String? =
      unwrap(this).getClusterHandlerSecurityGroupId()

  /**
   * The physical name of the Cluster.
   */
  public fun clusterName(): String

  /**
   * The cluster security group that was created by Amazon EKS for the cluster.
   *
   * Default: - if not specified `cluster.clusterSecurityGroupId` will throw an
   * error
   */
  public fun clusterSecurityGroupId(): String? = unwrap(this).getClusterSecurityGroupId()

  /**
   * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
   *
   * Default: - IpFamily.IP_V4
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
   */
  public fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  /**
   * Environment variables to use when running `kubectl` against this cluster.
   *
   * Default: - no additional variables
   */
  public fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
      emptyMap()

  /**
   * An IAM role that can perform kubectl operations against this cluster.
   *
   * The role should be mapped to the `system:masters` Kubernetes RBAC role.
   *
   * This role is directly passed to the lambda handler that sends Kube Ctl commands
   * to the cluster.
   *
   * Default: - if not specified, the default role created by a lambda function will
   * be used.
   */
  public fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

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
   * Default: - a default layer with Kubectl 1.20 and helm 3.8.
   */
  public fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  /**
   * Amount of memory to allocate to the provider's lambda function.
   *
   * Default: Size.gibibytes(1)
   */
  public fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  /**
   * Subnets to host the `kubectl` compute resources.
   *
   * If not specified, the k8s
   * endpoint is expected to be accessible publicly.
   *
   * Default: - k8s endpoint is expected to be accessible publicly
   */
  public fun kubectlPrivateSubnetIds(): List<String> = unwrap(this).getKubectlPrivateSubnetIds() ?:
      emptyList()

  /**
   * KubectlProvider for issuing kubectl commands.
   *
   * Default: - Default CDK provider
   */
  public fun kubectlProvider(): IKubectlProvider? =
      unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

  /**
   * An IAM role with cluster administrator and "system:masters" permissions.
   *
   * Default: - if not specified, it not be possible to issue `kubectl` commands
   * against an imported cluster.
   */
  public fun kubectlRoleArn(): String? = unwrap(this).getKubectlRoleArn()

  /**
   * A security group to use for `kubectl` execution.
   *
   * If not specified, the k8s
   * endpoint is expected to be accessible publicly.
   *
   * Default: - k8s endpoint is expected to be accessible publicly
   */
  public fun kubectlSecurityGroupId(): String? = unwrap(this).getKubectlSecurityGroupId()

  /**
   * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
   *
   * This layer
   * is used by the onEvent handler to route AWS SDK requests through a proxy.
   *
   * The handler expects the layer to include the following node_modules:
   *
   * proxy-agent
   *
   * Default: - a layer bundled with this module.
   */
  public fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  /**
   * An Open ID Connect provider for this cluster that can be used to configure service accounts.
   *
   * You can either import an existing provider using `iam.OpenIdConnectProvider.fromProviderArn`,
   * or create a new provider using `new eks.OpenIdConnectProvider`
   *
   * Default: - if not specified `cluster.openIdConnectProvider` and `cluster.addServiceAccount`
   * will throw an error.
   */
  public fun openIdConnectProvider(): IOpenIdConnectProvider? =
      unwrap(this).getOpenIdConnectProvider()?.let(IOpenIdConnectProvider::wrap)

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
  public fun prune(): Boolean? = unwrap(this).getPrune()

  /**
   * Additional security groups associated with this cluster.
   *
   * Default: - if not specified, no additional security groups will be
   * considered in `cluster.connections`.
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The VPC in which this Cluster was created.
   *
   * Default: - if not specified `cluster.vpc` will throw an error
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [ClusterAttributes]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param clusterCertificateAuthorityData The certificate-authority-data for your cluster.
     */
    public fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String)

    /**
     * @param clusterEncryptionConfigKeyArn Amazon Resource Name (ARN) or alias of the customer
     * master key (CMK).
     */
    public fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String)

    /**
     * @param clusterEndpoint The API Server endpoint URL.
     */
    public fun clusterEndpoint(clusterEndpoint: String)

    /**
     * @param clusterHandlerSecurityGroupId A security group id to associate with the Cluster
     * Handler's Lambdas.
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     */
    public fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String)

    /**
     * @param clusterName The physical name of the Cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param clusterSecurityGroupId The cluster security group that was created by Amazon EKS for
     * the cluster.
     */
    public fun clusterSecurityGroupId(clusterSecurityGroupId: String)

    /**
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses.
     */
    public fun ipFamily(ipFamily: IpFamily)

    /**
     * @param kubectlEnvironment Environment variables to use when running `kubectl` against this
     * cluster.
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

    /**
     * @param kubectlLambdaRole An IAM role that can perform kubectl operations against this
     * cluster.
     * The role should be mapped to the `system:masters` Kubernetes RBAC role.
     *
     * This role is directly passed to the lambda handler that sends Kube Ctl commands
     * to the cluster.
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
     * @param kubectlPrivateSubnetIds Subnets to host the `kubectl` compute resources.
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     */
    public fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: List<String>)

    /**
     * @param kubectlPrivateSubnetIds Subnets to host the `kubectl` compute resources.
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     */
    public fun kubectlPrivateSubnetIds(vararg kubectlPrivateSubnetIds: String)

    /**
     * @param kubectlProvider KubectlProvider for issuing kubectl commands.
     */
    public fun kubectlProvider(kubectlProvider: IKubectlProvider)

    /**
     * @param kubectlRoleArn An IAM role with cluster administrator and "system:masters"
     * permissions.
     */
    public fun kubectlRoleArn(kubectlRoleArn: String)

    /**
     * @param kubectlSecurityGroupId A security group to use for `kubectl` execution.
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     */
    public fun kubectlSecurityGroupId(kubectlSecurityGroupId: String)

    /**
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * The handler expects the layer to include the following node_modules:
     *
     * proxy-agent
     */
    public fun onEventLayer(onEventLayer: ILayerVersion)

    /**
     * @param openIdConnectProvider An Open ID Connect provider for this cluster that can be used to
     * configure service accounts.
     * You can either import an existing provider using `iam.OpenIdConnectProvider.fromProviderArn`,
     * or create a new provider using `new eks.OpenIdConnectProvider`
     */
    public fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider)

    /**
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned.
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     */
    public fun prune(prune: Boolean)

    /**
     * @param securityGroupIds Additional security groups associated with this cluster.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds Additional security groups associated with this cluster.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param vpc The VPC in which this Cluster was created.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ClusterAttributes.Builder =
        software.amazon.awscdk.services.eks.ClusterAttributes.builder()

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
     * @param clusterCertificateAuthorityData The certificate-authority-data for your cluster.
     */
    override fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String) {
      cdkBuilder.clusterCertificateAuthorityData(clusterCertificateAuthorityData)
    }

    /**
     * @param clusterEncryptionConfigKeyArn Amazon Resource Name (ARN) or alias of the customer
     * master key (CMK).
     */
    override fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String) {
      cdkBuilder.clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn)
    }

    /**
     * @param clusterEndpoint The API Server endpoint URL.
     */
    override fun clusterEndpoint(clusterEndpoint: String) {
      cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    /**
     * @param clusterHandlerSecurityGroupId A security group id to associate with the Cluster
     * Handler's Lambdas.
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     */
    override fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String) {
      cdkBuilder.clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId)
    }

    /**
     * @param clusterName The physical name of the Cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param clusterSecurityGroupId The cluster security group that was created by Amazon EKS for
     * the cluster.
     */
    override fun clusterSecurityGroupId(clusterSecurityGroupId: String) {
      cdkBuilder.clusterSecurityGroupId(clusterSecurityGroupId)
    }

    /**
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses.
     */
    override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
    }

    /**
     * @param kubectlEnvironment Environment variables to use when running `kubectl` against this
     * cluster.
     */
    override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * @param kubectlLambdaRole An IAM role that can perform kubectl operations against this
     * cluster.
     * The role should be mapped to the `system:masters` Kubernetes RBAC role.
     *
     * This role is directly passed to the lambda handler that sends Kube Ctl commands
     * to the cluster.
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
     * @param kubectlPrivateSubnetIds Subnets to host the `kubectl` compute resources.
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     */
    override fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: List<String>) {
      cdkBuilder.kubectlPrivateSubnetIds(kubectlPrivateSubnetIds)
    }

    /**
     * @param kubectlPrivateSubnetIds Subnets to host the `kubectl` compute resources.
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     */
    override fun kubectlPrivateSubnetIds(vararg kubectlPrivateSubnetIds: String): Unit =
        kubectlPrivateSubnetIds(kubectlPrivateSubnetIds.toList())

    /**
     * @param kubectlProvider KubectlProvider for issuing kubectl commands.
     */
    override fun kubectlProvider(kubectlProvider: IKubectlProvider) {
      cdkBuilder.kubectlProvider(kubectlProvider.let(IKubectlProvider::unwrap))
    }

    /**
     * @param kubectlRoleArn An IAM role with cluster administrator and "system:masters"
     * permissions.
     */
    override fun kubectlRoleArn(kubectlRoleArn: String) {
      cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    /**
     * @param kubectlSecurityGroupId A security group to use for `kubectl` execution.
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     */
    override fun kubectlSecurityGroupId(kubectlSecurityGroupId: String) {
      cdkBuilder.kubectlSecurityGroupId(kubectlSecurityGroupId)
    }

    /**
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * The handler expects the layer to include the following node_modules:
     *
     * proxy-agent
     */
    override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    /**
     * @param openIdConnectProvider An Open ID Connect provider for this cluster that can be used to
     * configure service accounts.
     * You can either import an existing provider using `iam.OpenIdConnectProvider.fromProviderArn`,
     * or create a new provider using `new eks.OpenIdConnectProvider`
     */
    override fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider) {
      cdkBuilder.openIdConnectProvider(openIdConnectProvider.let(IOpenIdConnectProvider::unwrap))
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
     * @param securityGroupIds Additional security groups associated with this cluster.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds Additional security groups associated with this cluster.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param vpc The VPC in which this Cluster was created.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.ClusterAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.ClusterAttributes,
  ) : ClusterAttributes {
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
     * The certificate-authority-data for your cluster.
     *
     * Default: - if not specified `cluster.clusterCertificateAuthorityData` will
     * throw an error
     */
    override fun clusterCertificateAuthorityData(): String? =
        unwrap(this).getClusterCertificateAuthorityData()

    /**
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
     *
     * Default: - if not specified `cluster.clusterEncryptionConfigKeyArn` will
     * throw an error
     */
    override fun clusterEncryptionConfigKeyArn(): String? =
        unwrap(this).getClusterEncryptionConfigKeyArn()

    /**
     * The API Server endpoint URL.
     *
     * Default: - if not specified `cluster.clusterEndpoint` will throw an error.
     */
    override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    /**
     * A security group id to associate with the Cluster Handler's Lambdas.
     *
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Default: - No security group.
     */
    override fun clusterHandlerSecurityGroupId(): String? =
        unwrap(this).getClusterHandlerSecurityGroupId()

    /**
     * The physical name of the Cluster.
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     *
     * Default: - if not specified `cluster.clusterSecurityGroupId` will throw an
     * error
     */
    override fun clusterSecurityGroupId(): String? = unwrap(this).getClusterSecurityGroupId()

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     */
    override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    /**
     * Environment variables to use when running `kubectl` against this cluster.
     *
     * Default: - no additional variables
     */
    override fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
        emptyMap()

    /**
     * An IAM role that can perform kubectl operations against this cluster.
     *
     * The role should be mapped to the `system:masters` Kubernetes RBAC role.
     *
     * This role is directly passed to the lambda handler that sends Kube Ctl commands
     * to the cluster.
     *
     * Default: - if not specified, the default role created by a lambda function will
     * be used.
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
     * Default: - a default layer with Kubectl 1.20 and helm 3.8.
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
     * Subnets to host the `kubectl` compute resources.
     *
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     *
     * Default: - k8s endpoint is expected to be accessible publicly
     */
    override fun kubectlPrivateSubnetIds(): List<String> = unwrap(this).getKubectlPrivateSubnetIds()
        ?: emptyList()

    /**
     * KubectlProvider for issuing kubectl commands.
     *
     * Default: - Default CDK provider
     */
    override fun kubectlProvider(): IKubectlProvider? =
        unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

    /**
     * An IAM role with cluster administrator and "system:masters" permissions.
     *
     * Default: - if not specified, it not be possible to issue `kubectl` commands
     * against an imported cluster.
     */
    override fun kubectlRoleArn(): String? = unwrap(this).getKubectlRoleArn()

    /**
     * A security group to use for `kubectl` execution.
     *
     * If not specified, the k8s
     * endpoint is expected to be accessible publicly.
     *
     * Default: - k8s endpoint is expected to be accessible publicly
     */
    override fun kubectlSecurityGroupId(): String? = unwrap(this).getKubectlSecurityGroupId()

    /**
     * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     *
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * The handler expects the layer to include the following node_modules:
     *
     * proxy-agent
     *
     * Default: - a layer bundled with this module.
     */
    override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    /**
     * An Open ID Connect provider for this cluster that can be used to configure service accounts.
     *
     * You can either import an existing provider using `iam.OpenIdConnectProvider.fromProviderArn`,
     * or create a new provider using `new eks.OpenIdConnectProvider`
     *
     * Default: - if not specified `cluster.openIdConnectProvider` and `cluster.addServiceAccount`
     * will throw an error.
     */
    override fun openIdConnectProvider(): IOpenIdConnectProvider? =
        unwrap(this).getOpenIdConnectProvider()?.let(IOpenIdConnectProvider::wrap)

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
     * Additional security groups associated with this cluster.
     *
     * Default: - if not specified, no additional security groups will be
     * considered in `cluster.connections`.
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The VPC in which this Cluster was created.
     *
     * Default: - if not specified `cluster.vpc` will throw an error
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ClusterAttributes):
        ClusterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterAttributes):
        software.amazon.awscdk.services.eks.ClusterAttributes = (wrapped as Wrapper).cdkObject
  }
}
