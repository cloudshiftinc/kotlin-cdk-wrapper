@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
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
import software.amazon.awscdk.services.eks.CoreDnsComputeType
import software.amazon.awscdk.services.eks.EndpointAccess
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.amazon.awscdk.services.eks.FargateProfileOptions
import software.amazon.awscdk.services.eks.IpFamily
import software.amazon.awscdk.services.eks.KubernetesVersion
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.ILayerVersion

@CdkDslMarker
public class FargateClusterPropsDsl {
  private val cdkBuilder: FargateClusterProps.Builder = FargateClusterProps.builder()

  private val _clusterLogging: MutableList<ClusterLoggingTypes> = mutableListOf()

  private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

  public fun albController(block: AlbControllerOptionsDsl.() -> Unit = {}) {
    val builder = AlbControllerOptionsDsl()
    builder.apply(block)
    cdkBuilder.albController(builder.build())
  }

  public fun albController(albController: AlbControllerOptions) {
    cdkBuilder.albController(albController)
  }

  public fun awscliLayer(awscliLayer: ILayerVersion) {
    cdkBuilder.awscliLayer(awscliLayer)
  }

  public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
    cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
  }

  public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
    cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup)
  }

  public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes) {
    _clusterLogging.addAll(listOf(*clusterLogging))
  }

  public fun clusterLogging(clusterLogging: Collection<ClusterLoggingTypes>) {
    _clusterLogging.addAll(clusterLogging)
  }

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
    cdkBuilder.coreDnsComputeType(coreDnsComputeType)
  }

  public fun defaultProfile(block: FargateProfileOptionsDsl.() -> Unit = {}) {
    val builder = FargateProfileOptionsDsl()
    builder.apply(block)
    cdkBuilder.defaultProfile(builder.build())
  }

  public fun defaultProfile(defaultProfile: FargateProfileOptions) {
    cdkBuilder.defaultProfile(defaultProfile)
  }

  public fun endpointAccess(endpointAccess: EndpointAccess) {
    cdkBuilder.endpointAccess(endpointAccess)
  }

  public fun ipFamily(ipFamily: IpFamily) {
    cdkBuilder.ipFamily(ipFamily)
  }

  public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
    cdkBuilder.kubectlEnvironment(kubectlEnvironment)
  }

  public fun kubectlLayer(kubectlLayer: ILayerVersion) {
    cdkBuilder.kubectlLayer(kubectlLayer)
  }

  public fun kubectlMemory(kubectlMemory: Size) {
    cdkBuilder.kubectlMemory(kubectlMemory)
  }

  public fun mastersRole(mastersRole: IRole) {
    cdkBuilder.mastersRole(mastersRole)
  }

  public fun onEventLayer(onEventLayer: ILayerVersion) {
    cdkBuilder.onEventLayer(onEventLayer)
  }

  public fun outputClusterName(outputClusterName: Boolean) {
    cdkBuilder.outputClusterName(outputClusterName)
  }

  public fun outputConfigCommand(outputConfigCommand: Boolean) {
    cdkBuilder.outputConfigCommand(outputConfigCommand)
  }

  public fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
    cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
  }

  public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
    cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
  }

  public fun prune(prune: Boolean) {
    cdkBuilder.prune(prune)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
    cdkBuilder.secretsEncryptionKey(secretsEncryptionKey)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
    cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
  }

  public fun version(version: KubernetesVersion) {
    cdkBuilder.version(version)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
    _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
  }

  public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
    _vpcSubnets.addAll(vpcSubnets)
  }

  public fun build(): FargateClusterProps {
    if(_clusterLogging.isNotEmpty()) cdkBuilder.clusterLogging(_clusterLogging)
    if(_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
    return cdkBuilder.build()
  }
}
