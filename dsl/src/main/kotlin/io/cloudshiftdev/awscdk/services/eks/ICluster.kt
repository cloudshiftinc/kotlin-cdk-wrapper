package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ICluster : IResource, IConnectable {
  public fun addCdk8sChart(arg0: String, arg1: Construct): KubernetesManifest

  public fun addCdk8sChart(
    arg0: String,
    arg1: Construct,
    arg2: KubernetesManifestOptions,
  ): KubernetesManifest

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4aa4d5820d067ab42381b831bba59abb594ff3ec3fffee74d03c34cc3e2a1a91")
  public fun addCdk8sChart(
    arg0: String,
    arg1: Construct,
    arg2: KubernetesManifestOptions.Builder.() -> Unit,
  ): KubernetesManifest

  public fun addHelmChart(arg0: String, arg1: HelmChartOptions): HelmChart

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("390cea0e170c7ad005d57b32e1fc98aa144800a81fa525deaaaed667af0283fe")
  public fun addHelmChart(arg0: String, arg1: HelmChartOptions.Builder.() -> Unit): HelmChart

  public fun addManifest(arg0: String, arg1: Map<String, Any>): KubernetesManifest

  public fun addServiceAccount(arg0: String): ServiceAccount

  public fun addServiceAccount(arg0: String, arg1: ServiceAccountOptions): ServiceAccount

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c04bf62363d27f7f1fcd0ee00a0a93e786f9d5a35ef2d9e35f27368f469899")
  public fun addServiceAccount(arg0: String, arg1: ServiceAccountOptions.Builder.() -> Unit):
      ServiceAccount

  public fun awscliLayer(): ILayerVersion? = unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  public fun clusterArn(): String

  public fun clusterCertificateAuthorityData(): String

  public fun clusterEncryptionConfigKeyArn(): String

  public fun clusterEndpoint(): String

  public fun clusterHandlerSecurityGroup(): ISecurityGroup? =
      unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun clusterName(): String

  public fun clusterSecurityGroup(): ISecurityGroup

  public fun clusterSecurityGroupId(): String

  public fun connectAutoScalingGroupCapacity(arg0: AutoScalingGroup, arg1: AutoScalingGroupOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14775e4c3ffbed9dd29c98a40fe0f205fa9aac6c3d18b1d2bf8d6614dd76554c")
  public fun connectAutoScalingGroupCapacity(arg0: AutoScalingGroup,
      arg1: AutoScalingGroupOptions.Builder.() -> Unit)

  public fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  public fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
      emptyMap()

  public fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

  public fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  public fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  public fun kubectlPrivateSubnets(): List<ISubnet> =
      unwrap(this).getKubectlPrivateSubnets()?.map(ISubnet::wrap) ?: emptyList()

  public fun kubectlProvider(): IKubectlProvider? =
      unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

  public fun kubectlRole(): IRole? = unwrap(this).getKubectlRole()?.let(IRole::wrap)

  public fun kubectlSecurityGroup(): ISecurityGroup? =
      unwrap(this).getKubectlSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  public fun openIdConnectProvider(): IOpenIdConnectProvider

  public fun prune(): Boolean

  public fun vpc(): IVpc

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.ICluster,
  ) : ICluster {
    override fun addCdk8sChart(arg0: String, arg1: Construct): KubernetesManifest =
        unwrap(this).addCdk8sChart(arg0, arg1.let(Construct::unwrap)).let(KubernetesManifest::wrap)

    override fun addCdk8sChart(
      arg0: String,
      arg1: Construct,
      arg2: KubernetesManifestOptions,
    ): KubernetesManifest = unwrap(this).addCdk8sChart(arg0, arg1.let(Construct::unwrap),
        arg2.let(KubernetesManifestOptions::unwrap)).let(KubernetesManifest::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4aa4d5820d067ab42381b831bba59abb594ff3ec3fffee74d03c34cc3e2a1a91")
    override fun addCdk8sChart(
      arg0: String,
      arg1: Construct,
      arg2: KubernetesManifestOptions.Builder.() -> Unit,
    ): KubernetesManifest = addCdk8sChart(arg0, arg1, KubernetesManifestOptions(arg2))

    override fun addHelmChart(arg0: String, arg1: HelmChartOptions): HelmChart =
        unwrap(this).addHelmChart(arg0, arg1.let(HelmChartOptions::unwrap)).let(HelmChart::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("390cea0e170c7ad005d57b32e1fc98aa144800a81fa525deaaaed667af0283fe")
    override fun addHelmChart(arg0: String, arg1: HelmChartOptions.Builder.() -> Unit): HelmChart =
        addHelmChart(arg0, HelmChartOptions(arg1))

    override fun addManifest(arg0: String, arg1: Map<String, Any>): KubernetesManifest =
        unwrap(this).addManifest(arg0, arg1).let(KubernetesManifest::wrap)

    override fun addServiceAccount(arg0: String): ServiceAccount =
        unwrap(this).addServiceAccount(arg0).let(ServiceAccount::wrap)

    override fun addServiceAccount(arg0: String, arg1: ServiceAccountOptions): ServiceAccount =
        unwrap(this).addServiceAccount(arg0,
        arg1.let(ServiceAccountOptions::unwrap)).let(ServiceAccount::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1c04bf62363d27f7f1fcd0ee00a0a93e786f9d5a35ef2d9e35f27368f469899")
    override fun addServiceAccount(arg0: String, arg1: ServiceAccountOptions.Builder.() -> Unit):
        ServiceAccount = addServiceAccount(arg0, ServiceAccountOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun awscliLayer(): ILayerVersion? =
        unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

    override fun clusterArn(): String = unwrap(this).getClusterArn()

    override fun clusterCertificateAuthorityData(): String =
        unwrap(this).getClusterCertificateAuthorityData()

    override fun clusterEncryptionConfigKeyArn(): String =
        unwrap(this).getClusterEncryptionConfigKeyArn()

    override fun clusterEndpoint(): String = unwrap(this).getClusterEndpoint()

    override fun clusterHandlerSecurityGroup(): ISecurityGroup? =
        unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun clusterSecurityGroup(): ISecurityGroup =
        unwrap(this).getClusterSecurityGroup().let(ISecurityGroup::wrap)

    override fun clusterSecurityGroupId(): String = unwrap(this).getClusterSecurityGroupId()

    override fun connectAutoScalingGroupCapacity(arg0: AutoScalingGroup,
        arg1: AutoScalingGroupOptions) {
      unwrap(this).connectAutoScalingGroupCapacity(arg0.let(AutoScalingGroup::unwrap),
          arg1.let(AutoScalingGroupOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14775e4c3ffbed9dd29c98a40fe0f205fa9aac6c3d18b1d2bf8d6614dd76554c")
    override fun connectAutoScalingGroupCapacity(arg0: AutoScalingGroup,
        arg1: AutoScalingGroupOptions.Builder.() -> Unit): Unit =
        connectAutoScalingGroupCapacity(arg0, AutoScalingGroupOptions(arg1))

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    override fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
        emptyMap()

    override fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

    override fun kubectlLayer(): ILayerVersion? =
        unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

    override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

    override fun kubectlPrivateSubnets(): List<ISubnet> =
        unwrap(this).getKubectlPrivateSubnets()?.map(ISubnet::wrap) ?: emptyList()

    override fun kubectlProvider(): IKubectlProvider? =
        unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

    override fun kubectlRole(): IRole? = unwrap(this).getKubectlRole()?.let(IRole::wrap)

    override fun kubectlSecurityGroup(): ISecurityGroup? =
        unwrap(this).getKubectlSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    override fun openIdConnectProvider(): IOpenIdConnectProvider =
        unwrap(this).getOpenIdConnectProvider().let(IOpenIdConnectProvider::wrap)

    override fun prune(): Boolean = unwrap(this).getPrune()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ICluster): ICluster =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICluster): software.amazon.awscdk.services.eks.ICluster = (wrapped
        as Wrapper).cdkObject
  }
}
