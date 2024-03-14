package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.FargateCluster,
) : Cluster(cdkObject) {
  public open fun defaultProfile(): FargateProfile =
      unwrap(this).getDefaultProfile().let(FargateProfile::wrap)

  public interface Builder {
    public fun albController(albController: AlbControllerOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528a333dd842b13c5cafad907c7593e4e97283440c6757fd7bf66f1e17707f07")
    public fun albController(albController: AlbControllerOptions.Builder.() -> Unit) {
    }

    public fun awscliLayer(awscliLayer: ILayerVersion) {
    }

    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
    }

    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
    }

    public fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>) {
    }

    public fun clusterName(clusterName: String) {
    }

    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
    }

    public fun defaultProfile(defaultProfile: FargateProfileOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc860ea781697ba194a8fdaea2f9a54f5247fffaacaaa032cb4d272ce0b6e7b9")
    public fun defaultProfile(defaultProfile: FargateProfileOptions.Builder.() -> Unit) {
    }

    public fun endpointAccess(endpointAccess: EndpointAccess) {
    }

    public fun ipFamily(ipFamily: IpFamily) {
    }

    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
    }

    public fun kubectlLayer(kubectlLayer: ILayerVersion) {
    }

    public fun kubectlMemory(kubectlMemory: Size) {
    }

    public fun mastersRole(mastersRole: IRole) {
    }

    public fun onEventLayer(onEventLayer: ILayerVersion) {
    }

    public fun outputClusterName(outputClusterName: Boolean) {
    }

    public fun outputConfigCommand(outputConfigCommand: Boolean) {
    }

    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
    }

    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
    }

    public fun prune(prune: Boolean) {
    }

    public fun role(role: IRole) {
    }

    public fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
    }

    public fun version(version: KubernetesVersion) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateCluster.Builder =
        software.amazon.awscdk.services.eks.FargateCluster.Builder.create(scope, id)

    public override fun albController(albController: AlbControllerOptions) {
      cdkBuilder.albController(albController.let(AlbControllerOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("528a333dd842b13c5cafad907c7593e4e97283440c6757fd7bf66f1e17707f07")
    public override fun albController(albController: AlbControllerOptions.Builder.() -> Unit): Unit
        = albController(AlbControllerOptions(albController))

    public override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    public override fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
      cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
    }

    public override fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
      cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>) {
      cdkBuilder.clusterLogging(clusterLogging.map(ClusterLoggingTypes::unwrap))
    }

    public override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public override fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
      cdkBuilder.coreDnsComputeType(coreDnsComputeType.let(CoreDnsComputeType::unwrap))
    }

    public override fun defaultProfile(defaultProfile: FargateProfileOptions) {
      cdkBuilder.defaultProfile(defaultProfile.let(FargateProfileOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc860ea781697ba194a8fdaea2f9a54f5247fffaacaaa032cb4d272ce0b6e7b9")
    public override fun defaultProfile(defaultProfile: FargateProfileOptions.Builder.() -> Unit):
        Unit = defaultProfile(FargateProfileOptions(defaultProfile))

    public override fun endpointAccess(endpointAccess: EndpointAccess) {
      cdkBuilder.endpointAccess(endpointAccess.let(EndpointAccess::unwrap))
    }

    public override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
    }

    public override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    public override fun kubectlLayer(kubectlLayer: ILayerVersion) {
      cdkBuilder.kubectlLayer(kubectlLayer.let(ILayerVersion::unwrap))
    }

    public override fun kubectlMemory(kubectlMemory: Size) {
      cdkBuilder.kubectlMemory(kubectlMemory.let(Size::unwrap))
    }

    public override fun mastersRole(mastersRole: IRole) {
      cdkBuilder.mastersRole(mastersRole.let(IRole::unwrap))
    }

    public override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    public override fun outputClusterName(outputClusterName: Boolean) {
      cdkBuilder.outputClusterName(outputClusterName)
    }

    public override fun outputConfigCommand(outputConfigCommand: Boolean) {
      cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    public override fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
      cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    public override fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
      cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    public override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
      cdkBuilder.secretsEncryptionKey(secretsEncryptionKey.let(IKey::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
      cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    public override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.FargateCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
