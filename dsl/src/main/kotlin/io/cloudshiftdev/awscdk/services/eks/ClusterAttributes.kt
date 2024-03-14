package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Size
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
  public fun awscliLayer(): ILayerVersion? = unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  public fun clusterCertificateAuthorityData(): String? =
      unwrap(this).getClusterCertificateAuthorityData()

  public fun clusterEncryptionConfigKeyArn(): String? =
      unwrap(this).getClusterEncryptionConfigKeyArn()

  public fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

  public fun clusterHandlerSecurityGroupId(): String? =
      unwrap(this).getClusterHandlerSecurityGroupId()

  public fun clusterName(): String

  public fun clusterSecurityGroupId(): String? = unwrap(this).getClusterSecurityGroupId()

  public fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  public fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
      emptyMap()

  public fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

  public fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  public fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  public fun kubectlPrivateSubnetIds(): List<String> = unwrap(this).getKubectlPrivateSubnetIds() ?:
      emptyList()

  public fun kubectlProvider(): IKubectlProvider? =
      unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

  public fun kubectlRoleArn(): String? = unwrap(this).getKubectlRoleArn()

  public fun kubectlSecurityGroupId(): String? = unwrap(this).getKubectlSecurityGroupId()

  public fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  public fun openIdConnectProvider(): IOpenIdConnectProvider? =
      unwrap(this).getOpenIdConnectProvider()?.let(IOpenIdConnectProvider::wrap)

  public fun prune(): Boolean? = unwrap(this).getPrune()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public interface Builder {
    public fun awscliLayer(awscliLayer: ILayerVersion)

    public fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String)

    public fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String)

    public fun clusterEndpoint(clusterEndpoint: String)

    public fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String)

    public fun clusterName(clusterName: String)

    public fun clusterSecurityGroupId(clusterSecurityGroupId: String)

    public fun ipFamily(ipFamily: IpFamily)

    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

    public fun kubectlLambdaRole(kubectlLambdaRole: IRole)

    public fun kubectlLayer(kubectlLayer: ILayerVersion)

    public fun kubectlMemory(kubectlMemory: Size)

    public fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: List<String>)

    public fun kubectlPrivateSubnetIds(vararg kubectlPrivateSubnetIds: String)

    public fun kubectlProvider(kubectlProvider: IKubectlProvider)

    public fun kubectlRoleArn(kubectlRoleArn: String)

    public fun kubectlSecurityGroupId(kubectlSecurityGroupId: String)

    public fun onEventLayer(onEventLayer: ILayerVersion)

    public fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider)

    public fun prune(prune: Boolean)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ClusterAttributes.Builder =
        software.amazon.awscdk.services.eks.ClusterAttributes.builder()

    override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    override fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String) {
      cdkBuilder.clusterCertificateAuthorityData(clusterCertificateAuthorityData)
    }

    override fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String) {
      cdkBuilder.clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn)
    }

    override fun clusterEndpoint(clusterEndpoint: String) {
      cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    override fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String) {
      cdkBuilder.clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun clusterSecurityGroupId(clusterSecurityGroupId: String) {
      cdkBuilder.clusterSecurityGroupId(clusterSecurityGroupId)
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

    override fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: List<String>) {
      cdkBuilder.kubectlPrivateSubnetIds(kubectlPrivateSubnetIds)
    }

    override fun kubectlPrivateSubnetIds(vararg kubectlPrivateSubnetIds: String): Unit =
        kubectlPrivateSubnetIds(kubectlPrivateSubnetIds.toList())

    override fun kubectlProvider(kubectlProvider: IKubectlProvider) {
      cdkBuilder.kubectlProvider(kubectlProvider.let(IKubectlProvider::unwrap))
    }

    override fun kubectlRoleArn(kubectlRoleArn: String) {
      cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    override fun kubectlSecurityGroupId(kubectlSecurityGroupId: String) {
      cdkBuilder.kubectlSecurityGroupId(kubectlSecurityGroupId)
    }

    override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    override fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider) {
      cdkBuilder.openIdConnectProvider(openIdConnectProvider.let(IOpenIdConnectProvider::unwrap))
    }

    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.ClusterAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.ClusterAttributes,
  ) : ClusterAttributes {
    override fun awscliLayer(): ILayerVersion? =
        unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

    override fun clusterCertificateAuthorityData(): String? =
        unwrap(this).getClusterCertificateAuthorityData()

    override fun clusterEncryptionConfigKeyArn(): String? =
        unwrap(this).getClusterEncryptionConfigKeyArn()

    override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    override fun clusterHandlerSecurityGroupId(): String? =
        unwrap(this).getClusterHandlerSecurityGroupId()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun clusterSecurityGroupId(): String? = unwrap(this).getClusterSecurityGroupId()

    override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    override fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
        emptyMap()

    override fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

    override fun kubectlLayer(): ILayerVersion? =
        unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

    override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

    override fun kubectlPrivateSubnetIds(): List<String> = unwrap(this).getKubectlPrivateSubnetIds()
        ?: emptyList()

    override fun kubectlProvider(): IKubectlProvider? =
        unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

    override fun kubectlRoleArn(): String? = unwrap(this).getKubectlRoleArn()

    override fun kubectlSecurityGroupId(): String? = unwrap(this).getKubectlSecurityGroupId()

    override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    override fun openIdConnectProvider(): IOpenIdConnectProvider? =
        unwrap(this).getOpenIdConnectProvider()?.let(IOpenIdConnectProvider::wrap)

    override fun prune(): Boolean? = unwrap(this).getPrune()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

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
