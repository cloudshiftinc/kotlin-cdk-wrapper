@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.eks.ClusterAttributes
import software.amazon.awscdk.services.eks.IKubectlProvider
import software.amazon.awscdk.services.eks.IpFamily
import software.amazon.awscdk.services.iam.IOpenIdConnectProvider
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.ILayerVersion
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class ClusterAttributesDsl {
    private val cdkBuilder: ClusterAttributes.Builder = ClusterAttributes.builder()

    private val _kubectlPrivateSubnetIds: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    public fun awscliLayer(awscliLayer: ILayerVersion) {
        cdkBuilder.awscliLayer(awscliLayer)
    }

    public fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String) {
        cdkBuilder.clusterCertificateAuthorityData(clusterCertificateAuthorityData)
    }

    public fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String) {
        cdkBuilder.clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn)
    }

    public fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    public fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String) {
        cdkBuilder.clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun clusterSecurityGroupId(clusterSecurityGroupId: String) {
        cdkBuilder.clusterSecurityGroupId(clusterSecurityGroupId)
    }

    public fun ipFamily(ipFamily: IpFamily) {
        cdkBuilder.ipFamily(ipFamily)
    }

    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
        cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    public fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
        cdkBuilder.kubectlLambdaRole(kubectlLambdaRole)
    }

    public fun kubectlLayer(kubectlLayer: ILayerVersion) {
        cdkBuilder.kubectlLayer(kubectlLayer)
    }

    public fun kubectlMemory(kubectlMemory: Size) {
        cdkBuilder.kubectlMemory(kubectlMemory)
    }

    public fun kubectlPrivateSubnetIds(vararg kubectlPrivateSubnetIds: String) {
        _kubectlPrivateSubnetIds.addAll(listOf(*kubectlPrivateSubnetIds))
    }

    public fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: Collection<String>) {
        _kubectlPrivateSubnetIds.addAll(kubectlPrivateSubnetIds)
    }

    public fun kubectlProvider(kubectlProvider: IKubectlProvider) {
        cdkBuilder.kubectlProvider(kubectlProvider)
    }

    public fun kubectlRoleArn(kubectlRoleArn: String) {
        cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public fun kubectlSecurityGroupId(kubectlSecurityGroupId: String) {
        cdkBuilder.kubectlSecurityGroupId(kubectlSecurityGroupId)
    }

    public fun onEventLayer(onEventLayer: ILayerVersion) {
        cdkBuilder.onEventLayer(onEventLayer)
    }

    public fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider) {
        cdkBuilder.openIdConnectProvider(openIdConnectProvider)
    }

    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ClusterAttributes {
        if (_kubectlPrivateSubnetIds.isNotEmpty()) {
            cdkBuilder.kubectlPrivateSubnetIds(_kubectlPrivateSubnetIds)
        }
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
