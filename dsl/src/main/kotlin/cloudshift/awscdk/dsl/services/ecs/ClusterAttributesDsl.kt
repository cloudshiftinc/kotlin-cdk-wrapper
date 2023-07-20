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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.ClusterAttributes
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
import software.amazon.awscdk.services.servicediscovery.INamespace
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ClusterAttributesDsl {
    private val cdkBuilder: ClusterAttributes.Builder = ClusterAttributes.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun autoscalingGroup(autoscalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoscalingGroup(autoscalingGroup)
    }

    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: INamespace) {
        cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace)
    }

    public fun executeCommandConfiguration(block: ExecuteCommandConfigurationDsl.() -> Unit = {}) {
        val builder = ExecuteCommandConfigurationDsl()
        builder.apply(block)
        cdkBuilder.executeCommandConfiguration(builder.build())
    }

    public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
    }

    public fun hasEc2Capacity(hasEc2Capacity: Boolean) {
        cdkBuilder.hasEc2Capacity(hasEc2Capacity)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ClusterAttributes {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
