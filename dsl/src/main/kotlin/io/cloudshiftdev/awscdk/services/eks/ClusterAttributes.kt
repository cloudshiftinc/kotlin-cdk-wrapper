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
    public fun awscliLayer(awscliLayer: ILayerVersion) {
    }

    public fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String) {
    }

    public fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String) {
    }

    public fun clusterEndpoint(clusterEndpoint: String) {
    }

    public fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String) {
    }

    public fun clusterName(clusterName: String) {
    }

    public fun clusterSecurityGroupId(clusterSecurityGroupId: String) {
    }

    public fun ipFamily(ipFamily: IpFamily) {
    }

    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
    }

    public fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
    }

    public fun kubectlLayer(kubectlLayer: ILayerVersion) {
    }

    public fun kubectlMemory(kubectlMemory: Size) {
    }

    public fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: List<String>) {
    }

    public fun kubectlProvider(kubectlProvider: IKubectlProvider) {
    }

    public fun kubectlRoleArn(kubectlRoleArn: String) {
    }

    public fun kubectlSecurityGroupId(kubectlSecurityGroupId: String) {
    }

    public fun onEventLayer(onEventLayer: ILayerVersion) {
    }

    public fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider) {
    }

    public fun prune(prune: Boolean) {
    }

    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ClusterAttributes.Builder =
        software.amazon.awscdk.services.eks.ClusterAttributes.builder()

    public override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    public override fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String) {
      cdkBuilder.clusterCertificateAuthorityData(clusterCertificateAuthorityData)
    }

    public override fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String) {
      cdkBuilder.clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn)
    }

    public override fun clusterEndpoint(clusterEndpoint: String) {
      cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    public override fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String) {
      cdkBuilder.clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId)
    }

    public override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public override fun clusterSecurityGroupId(clusterSecurityGroupId: String) {
      cdkBuilder.clusterSecurityGroupId(clusterSecurityGroupId)
    }

    public override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
    }

    public override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    public override fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
      cdkBuilder.kubectlLambdaRole(kubectlLambdaRole.let(IRole::unwrap))
    }

    public override fun kubectlLayer(kubectlLayer: ILayerVersion) {
      cdkBuilder.kubectlLayer(kubectlLayer.let(ILayerVersion::unwrap))
    }

    public override fun kubectlMemory(kubectlMemory: Size) {
      cdkBuilder.kubectlMemory(kubectlMemory.let(Size::unwrap))
    }

    public override fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: List<String>) {
      cdkBuilder.kubectlPrivateSubnetIds(kubectlPrivateSubnetIds)
    }

    public override fun kubectlProvider(kubectlProvider: IKubectlProvider) {
      cdkBuilder.kubectlProvider(kubectlProvider.let(IKubectlProvider::unwrap))
    }

    public override fun kubectlRoleArn(kubectlRoleArn: String) {
      cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public override fun kubectlSecurityGroupId(kubectlSecurityGroupId: String) {
      cdkBuilder.kubectlSecurityGroupId(kubectlSecurityGroupId)
    }

    public override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    public override fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider) {
      cdkBuilder.openIdConnectProvider(openIdConnectProvider.let(IOpenIdConnectProvider::unwrap))
    }

    public override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.ClusterAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.ClusterAttributes,
  ) : ClusterAttributes {
    public override fun awscliLayer(): ILayerVersion? =
        unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

    public override fun clusterCertificateAuthorityData(): String? =
        unwrap(this).getClusterCertificateAuthorityData()

    public override fun clusterEncryptionConfigKeyArn(): String? =
        unwrap(this).getClusterEncryptionConfigKeyArn()

    public override fun clusterEndpoint(): String? = unwrap(this).getClusterEndpoint()

    public override fun clusterHandlerSecurityGroupId(): String? =
        unwrap(this).getClusterHandlerSecurityGroupId()

    public override fun clusterName(): String = unwrap(this).getClusterName()

    public override fun clusterSecurityGroupId(): String? = unwrap(this).getClusterSecurityGroupId()

    public override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    public override fun kubectlEnvironment(): Map<String, String> =
        unwrap(this).getKubectlEnvironment() ?: emptyMap()

    public override fun kubectlLambdaRole(): IRole? =
        unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

    public override fun kubectlLayer(): ILayerVersion? =
        unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

    public override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

    public override fun kubectlPrivateSubnetIds(): List<String> =
        unwrap(this).getKubectlPrivateSubnetIds() ?: emptyList()

    public override fun kubectlProvider(): IKubectlProvider? =
        unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

    public override fun kubectlRoleArn(): String? = unwrap(this).getKubectlRoleArn()

    public override fun kubectlSecurityGroupId(): String? = unwrap(this).getKubectlSecurityGroupId()

    public override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    public override fun openIdConnectProvider(): IOpenIdConnectProvider? =
        unwrap(this).getOpenIdConnectProvider()?.let(IOpenIdConnectProvider::wrap)

    public override fun prune(): Boolean? = unwrap(this).getPrune()

    public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    public override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
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
