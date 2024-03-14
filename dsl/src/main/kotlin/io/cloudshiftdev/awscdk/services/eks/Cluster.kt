package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.Role
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
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

public open class Cluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.Cluster,
) : Resource(cdkObject), ICluster {
  public open fun addAutoScalingGroupCapacity(id: String, options: AutoScalingGroupCapacityOptions):
      AutoScalingGroup = unwrap(this).addAutoScalingGroupCapacity(id,
      options.let(AutoScalingGroupCapacityOptions::unwrap)).let(AutoScalingGroup::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a5d349d842f3a08a9233762265229179388ab103e877c400676db8cd89075df")
  public open fun addAutoScalingGroupCapacity(id: String,
      options: AutoScalingGroupCapacityOptions.Builder.() -> Unit): AutoScalingGroup =
      addAutoScalingGroupCapacity(id, AutoScalingGroupCapacityOptions(options))

  public override fun addCdk8sChart(id: String, chart: CloudshiftdevConstructsConstruct):
      KubernetesManifest = unwrap(this).addCdk8sChart(id,
      chart.let(CloudshiftdevConstructsConstruct::unwrap)).let(KubernetesManifest::wrap)

  public override fun addCdk8sChart(
    id: String,
    chart: CloudshiftdevConstructsConstruct,
    options: KubernetesManifestOptions,
  ): KubernetesManifest = unwrap(this).addCdk8sChart(id,
      chart.let(CloudshiftdevConstructsConstruct::unwrap),
      options.let(KubernetesManifestOptions::unwrap)).let(KubernetesManifest::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4aa4d5820d067ab42381b831bba59abb594ff3ec3fffee74d03c34cc3e2a1a91")
  public override fun addCdk8sChart(
    id: String,
    chart: CloudshiftdevConstructsConstruct,
    options: KubernetesManifestOptions.Builder.() -> Unit,
  ): KubernetesManifest = addCdk8sChart(id, chart, KubernetesManifestOptions(options))

  public open fun addFargateProfile(id: String, options: FargateProfileOptions): FargateProfile =
      unwrap(this).addFargateProfile(id,
      options.let(FargateProfileOptions::unwrap)).let(FargateProfile::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f1c4f3c83b7b737b1b89b4b6e71821d514b522cbbde457db0787383654f5aa5")
  public open fun addFargateProfile(id: String, options: FargateProfileOptions.Builder.() -> Unit):
      FargateProfile = addFargateProfile(id, FargateProfileOptions(options))

  public override fun addHelmChart(id: String, options: HelmChartOptions): HelmChart =
      unwrap(this).addHelmChart(id, options.let(HelmChartOptions::unwrap)).let(HelmChart::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("390cea0e170c7ad005d57b32e1fc98aa144800a81fa525deaaaed667af0283fe")
  public override fun addHelmChart(id: String, options: HelmChartOptions.Builder.() -> Unit):
      HelmChart = addHelmChart(id, HelmChartOptions(options))

  public override fun addManifest(id: String, manifest: Map<String, Any>): KubernetesManifest =
      unwrap(this).addManifest(id, manifest).let(KubernetesManifest::wrap)

  public open fun addNodegroupCapacity(id: String): Nodegroup =
      unwrap(this).addNodegroupCapacity(id).let(Nodegroup::wrap)

  public open fun addNodegroupCapacity(id: String, options: NodegroupOptions): Nodegroup =
      unwrap(this).addNodegroupCapacity(id,
      options.let(NodegroupOptions::unwrap)).let(Nodegroup::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("81cc765289b6d8db6c417efadcd4f7dbc248d9f38bdbe2c86bfdf7c74bdb529b")
  public open fun addNodegroupCapacity(id: String, options: NodegroupOptions.Builder.() -> Unit):
      Nodegroup = addNodegroupCapacity(id, NodegroupOptions(options))

  public override fun addServiceAccount(id: String): ServiceAccount =
      unwrap(this).addServiceAccount(id).let(ServiceAccount::wrap)

  public override fun addServiceAccount(id: String, options: ServiceAccountOptions): ServiceAccount
      = unwrap(this).addServiceAccount(id,
      options.let(ServiceAccountOptions::unwrap)).let(ServiceAccount::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c04bf62363d27f7f1fcd0ee00a0a93e786f9d5a35ef2d9e35f27368f469899")
  public override fun addServiceAccount(id: String,
      options: ServiceAccountOptions.Builder.() -> Unit): ServiceAccount = addServiceAccount(id,
      ServiceAccountOptions(options))

  public open fun adminRole(): Role = unwrap(this).getAdminRole().let(Role::wrap)

  public open fun albController(): AlbController? =
      unwrap(this).getAlbController()?.let(AlbController::wrap)

  public open fun awsAuth(): AwsAuth = unwrap(this).getAwsAuth().let(AwsAuth::wrap)

  public override fun awscliLayer(): ILayerVersion? =
      unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  public override fun clusterCertificateAuthorityData(): String =
      unwrap(this).getClusterCertificateAuthorityData()

  public override fun clusterEncryptionConfigKeyArn(): String =
      unwrap(this).getClusterEncryptionConfigKeyArn()

  public override fun clusterEndpoint(): String = unwrap(this).getClusterEndpoint()

  public override fun clusterHandlerSecurityGroup(): ISecurityGroup? =
      unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

  public override fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterOpenIdConnectIssuer(): String =
      unwrap(this).getClusterOpenIdConnectIssuer()

  public open fun clusterOpenIdConnectIssuerUrl(): String =
      unwrap(this).getClusterOpenIdConnectIssuerUrl()

  public override fun clusterSecurityGroup(): ISecurityGroup =
      unwrap(this).getClusterSecurityGroup().let(ISecurityGroup::wrap)

  public override fun clusterSecurityGroupId(): String = unwrap(this).getClusterSecurityGroupId()

  public override fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
      options: AutoScalingGroupOptions) {
    unwrap(this).connectAutoScalingGroupCapacity(autoScalingGroup.let(AutoScalingGroup::unwrap),
        options.let(AutoScalingGroupOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14775e4c3ffbed9dd29c98a40fe0f205fa9aac6c3d18b1d2bf8d6614dd76554c")
  public override fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
      options: AutoScalingGroupOptions.Builder.() -> Unit): Unit =
      connectAutoScalingGroupCapacity(autoScalingGroup, AutoScalingGroupOptions(options))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun defaultCapacity(): AutoScalingGroup? =
      unwrap(this).getDefaultCapacity()?.let(AutoScalingGroup::wrap)

  public open fun defaultNodegroup(): Nodegroup? =
      unwrap(this).getDefaultNodegroup()?.let(Nodegroup::wrap)

  public open fun ingressLoadBalancerAddress(ingressName: String): String =
      unwrap(this).getIngressLoadBalancerAddress(ingressName)

  public open fun ingressLoadBalancerAddress(ingressName: String,
      options: IngressLoadBalancerAddressOptions): String =
      unwrap(this).getIngressLoadBalancerAddress(ingressName,
      options.let(IngressLoadBalancerAddressOptions::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e9e71598624d0a7f3b023683e3add88cf6bbbb113ae03c0b2b9b80a288b321c")
  public open fun ingressLoadBalancerAddress(ingressName: String,
      options: IngressLoadBalancerAddressOptions.Builder.() -> Unit): String =
      ingressLoadBalancerAddress(ingressName, IngressLoadBalancerAddressOptions(options))

  public override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  public override fun kubectlEnvironment(): Map<String, String> =
      unwrap(this).getKubectlEnvironment() ?: emptyMap()

  public override fun kubectlLambdaRole(): IRole? =
      unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

  public override fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  public override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  public override fun kubectlPrivateSubnets(): List<ISubnet> =
      unwrap(this).getKubectlPrivateSubnets()?.map(ISubnet::wrap) ?: emptyList()

  public override fun kubectlRole(): IRole? = unwrap(this).getKubectlRole()?.let(IRole::wrap)

  public override fun kubectlSecurityGroup(): ISecurityGroup? =
      unwrap(this).getKubectlSecurityGroup()?.let(ISecurityGroup::wrap)

  public override fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  public override fun openIdConnectProvider(): IOpenIdConnectProvider =
      unwrap(this).getOpenIdConnectProvider().let(IOpenIdConnectProvider::wrap)

  public override fun prune(): Boolean = unwrap(this).getPrune()

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public open fun serviceLoadBalancerAddress(serviceName: String): String =
      unwrap(this).getServiceLoadBalancerAddress(serviceName)

  public open fun serviceLoadBalancerAddress(serviceName: String,
      options: ServiceLoadBalancerAddressOptions): String =
      unwrap(this).getServiceLoadBalancerAddress(serviceName,
      options.let(ServiceLoadBalancerAddressOptions::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f2df9c9afaea6399ae5a301560a0d9fdabc2ff5123a1482b5da3b99a043a51e7")
  public open fun serviceLoadBalancerAddress(serviceName: String,
      options: ServiceLoadBalancerAddressOptions.Builder.() -> Unit): String =
      serviceLoadBalancerAddress(serviceName, ServiceLoadBalancerAddressOptions(options))

  public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  public interface Builder {
    public fun albController(albController: AlbControllerOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbe068c46270cace75364fb602b5c014effada559e8728ea8145d8012378d9d")
    public fun albController(albController: AlbControllerOptions.Builder.() -> Unit)

    public fun awscliLayer(awscliLayer: ILayerVersion)

    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>)

    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup)

    public fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>)

    public fun clusterName(clusterName: String)

    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType)

    public fun defaultCapacity(defaultCapacity: Number)

    public fun defaultCapacityInstance(defaultCapacityInstance: InstanceType)

    public fun defaultCapacityType(defaultCapacityType: DefaultCapacityType)

    public fun endpointAccess(endpointAccess: EndpointAccess)

    public fun ipFamily(ipFamily: IpFamily)

    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

    public fun kubectlLambdaRole(kubectlLambdaRole: IRole)

    public fun kubectlLayer(kubectlLayer: ILayerVersion)

    public fun kubectlMemory(kubectlMemory: Size)

    public fun mastersRole(mastersRole: IRole)

    public fun onEventLayer(onEventLayer: ILayerVersion)

    public fun outputClusterName(outputClusterName: Boolean)

    public fun outputConfigCommand(outputConfigCommand: Boolean)

    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean)

    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean)

    public fun prune(prune: Boolean)

    public fun role(role: IRole)

    public fun secretsEncryptionKey(secretsEncryptionKey: IKey)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun serviceIpv4Cidr(serviceIpv4Cidr: String)

    public fun tags(tags: Map<String, String>)

    public fun version(version: KubernetesVersion)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Cluster.Builder =
        software.amazon.awscdk.services.eks.Cluster.Builder.create(scope, id)

    override fun albController(albController: AlbControllerOptions) {
      cdkBuilder.albController(albController.let(AlbControllerOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbe068c46270cace75364fb602b5c014effada559e8728ea8145d8012378d9d")
    override fun albController(albController: AlbControllerOptions.Builder.() -> Unit): Unit =
        albController(AlbControllerOptions(albController))

    override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    override fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
      cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
    }

    override fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
      cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup.let(ISecurityGroup::unwrap))
    }

    override fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>) {
      cdkBuilder.clusterLogging(clusterLogging.map(ClusterLoggingTypes::unwrap))
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
      cdkBuilder.coreDnsComputeType(coreDnsComputeType.let(CoreDnsComputeType::unwrap))
    }

    override fun defaultCapacity(defaultCapacity: Number) {
      cdkBuilder.defaultCapacity(defaultCapacity)
    }

    override fun defaultCapacityInstance(defaultCapacityInstance: InstanceType) {
      cdkBuilder.defaultCapacityInstance(defaultCapacityInstance.let(InstanceType::unwrap))
    }

    override fun defaultCapacityType(defaultCapacityType: DefaultCapacityType) {
      cdkBuilder.defaultCapacityType(defaultCapacityType.let(DefaultCapacityType::unwrap))
    }

    override fun endpointAccess(endpointAccess: EndpointAccess) {
      cdkBuilder.endpointAccess(endpointAccess.let(EndpointAccess::unwrap))
    }

    override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
    }

    override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    override fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
      cdkBuilder.kubectlLambdaRole(kubectlLambdaRole.let(IRole::unwrap))
    }

    override fun kubectlLayer(kubectlLayer: ILayerVersion) {
      cdkBuilder.kubectlLayer(kubectlLayer.let(ILayerVersion::unwrap))
    }

    override fun kubectlMemory(kubectlMemory: Size) {
      cdkBuilder.kubectlMemory(kubectlMemory.let(Size::unwrap))
    }

    override fun mastersRole(mastersRole: IRole) {
      cdkBuilder.mastersRole(mastersRole.let(IRole::unwrap))
    }

    override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    override fun outputClusterName(outputClusterName: Boolean) {
      cdkBuilder.outputClusterName(outputClusterName)
    }

    override fun outputConfigCommand(outputConfigCommand: Boolean) {
      cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    override fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
      cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    override fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
      cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
      cdkBuilder.secretsEncryptionKey(secretsEncryptionKey.let(IKey::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
      cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.Cluster = cdkBuilder.build()
  }

  public companion object {
    public open fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes,
    ): ICluster =
        software.amazon.awscdk.services.eks.Cluster.fromClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ClusterAttributes::unwrap)).let(ICluster::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f9f698ebef13011b7bab8c610cfa73efb97bee56308d6cafa66534ab5f42b49")
    public open fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes.Builder.() -> Unit,
    ): ICluster = fromClusterAttributes(scope, id, ClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Cluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Cluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Cluster): Cluster =
        Cluster(cdkObject)

    internal fun unwrap(wrapped: Cluster): software.amazon.awscdk.services.eks.Cluster =
        wrapped.cdkObject
  }
}
