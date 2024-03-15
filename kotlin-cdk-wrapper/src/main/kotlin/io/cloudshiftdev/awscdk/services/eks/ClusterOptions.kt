@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public interface ClusterOptions : CommonClusterOptions {
  public fun albController(): AlbControllerOptions? =
      unwrap(this).getAlbController()?.let(AlbControllerOptions::wrap)

  public fun awscliLayer(): ILayerVersion? = unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  public fun clusterHandlerEnvironment(): Map<String, String> =
      unwrap(this).getClusterHandlerEnvironment() ?: emptyMap()

  public fun clusterHandlerSecurityGroup(): ISecurityGroup? =
      unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun clusterLogging(): List<ClusterLoggingTypes> =
      unwrap(this).getClusterLogging()?.map(ClusterLoggingTypes::wrap) ?: emptyList()

  public fun coreDnsComputeType(): CoreDnsComputeType? =
      unwrap(this).getCoreDnsComputeType()?.let(CoreDnsComputeType::wrap)

  public fun endpointAccess(): EndpointAccess? =
      unwrap(this).getEndpointAccess()?.let(EndpointAccess::wrap)

  public fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  public fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
      emptyMap()

  public fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  public fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  public fun mastersRole(): IRole? = unwrap(this).getMastersRole()?.let(IRole::wrap)

  public fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  public fun outputMastersRoleArn(): Boolean? = unwrap(this).getOutputMastersRoleArn()

  public fun placeClusterHandlerInVpc(): Boolean? = unwrap(this).getPlaceClusterHandlerInVpc()

  public fun prune(): Boolean? = unwrap(this).getPrune()

  public fun secretsEncryptionKey(): IKey? = unwrap(this).getSecretsEncryptionKey()?.let(IKey::wrap)

  public fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

  @CdkDslMarker
  public interface Builder {
    public fun albController(albController: AlbControllerOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7034d01a4cd6de485cd119ec0d7808acd3e9abdbff2eb3a14ac9c734cf630f02")
    public fun albController(albController: AlbControllerOptions.Builder.() -> Unit)

    public fun awscliLayer(awscliLayer: ILayerVersion)

    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>)

    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup)

    public fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>)

    public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes)

    public fun clusterName(clusterName: String)

    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType)

    public fun endpointAccess(endpointAccess: EndpointAccess)

    public fun ipFamily(ipFamily: IpFamily)

    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

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

    public fun version(version: KubernetesVersion)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ClusterOptions.Builder =
        software.amazon.awscdk.services.eks.ClusterOptions.builder()

    override fun albController(albController: AlbControllerOptions) {
      cdkBuilder.albController(albController.let(AlbControllerOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7034d01a4cd6de485cd119ec0d7808acd3e9abdbff2eb3a14ac9c734cf630f02")
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

    override fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes): Unit =
        clusterLogging(clusterLogging.toList())

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
      cdkBuilder.coreDnsComputeType(coreDnsComputeType.let(CoreDnsComputeType::unwrap))
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

    override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.eks.ClusterOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.ClusterOptions,
  ) : CdkObject(cdkObject), ClusterOptions {
    override fun albController(): AlbControllerOptions? =
        unwrap(this).getAlbController()?.let(AlbControllerOptions::wrap)

    override fun awscliLayer(): ILayerVersion? =
        unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

    override fun clusterHandlerEnvironment(): Map<String, String> =
        unwrap(this).getClusterHandlerEnvironment() ?: emptyMap()

    override fun clusterHandlerSecurityGroup(): ISecurityGroup? =
        unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun clusterLogging(): List<ClusterLoggingTypes> =
        unwrap(this).getClusterLogging()?.map(ClusterLoggingTypes::wrap) ?: emptyList()

    override fun clusterName(): String? = unwrap(this).getClusterName()

    override fun coreDnsComputeType(): CoreDnsComputeType? =
        unwrap(this).getCoreDnsComputeType()?.let(CoreDnsComputeType::wrap)

    override fun endpointAccess(): EndpointAccess? =
        unwrap(this).getEndpointAccess()?.let(EndpointAccess::wrap)

    override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    override fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
        emptyMap()

    override fun kubectlLayer(): ILayerVersion? =
        unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

    override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

    override fun mastersRole(): IRole? = unwrap(this).getMastersRole()?.let(IRole::wrap)

    override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    override fun outputClusterName(): Boolean? = unwrap(this).getOutputClusterName()

    override fun outputConfigCommand(): Boolean? = unwrap(this).getOutputConfigCommand()

    override fun outputMastersRoleArn(): Boolean? = unwrap(this).getOutputMastersRoleArn()

    override fun placeClusterHandlerInVpc(): Boolean? = unwrap(this).getPlaceClusterHandlerInVpc()

    override fun prune(): Boolean? = unwrap(this).getPrune()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun secretsEncryptionKey(): IKey? =
        unwrap(this).getSecretsEncryptionKey()?.let(IKey::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun serviceIpv4Cidr(): String? = unwrap(this).getServiceIpv4Cidr()

    override fun version(): KubernetesVersion =
        unwrap(this).getVersion().let(KubernetesVersion::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ClusterOptions): ClusterOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterOptions): software.amazon.awscdk.services.eks.ClusterOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.ClusterOptions
  }
}
