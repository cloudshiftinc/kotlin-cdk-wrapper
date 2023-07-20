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
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.CommonClusterOptions
import software.amazon.awscdk.services.eks.KubernetesVersion
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CommonClusterOptionsDsl {
    private val cdkBuilder: CommonClusterOptions.Builder = CommonClusterOptions.builder()

    private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun outputClusterName(outputClusterName: Boolean) {
        cdkBuilder.outputClusterName(outputClusterName)
    }

    public fun outputConfigCommand(outputConfigCommand: Boolean) {
        cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
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

    public fun build(): CommonClusterOptions {
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
