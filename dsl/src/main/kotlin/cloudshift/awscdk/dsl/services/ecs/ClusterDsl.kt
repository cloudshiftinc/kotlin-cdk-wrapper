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
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.AddCapacityOptions
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class ClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Cluster.Builder = Cluster.Builder.create(scope, id)

    public fun capacity(block: AddCapacityOptionsDsl.() -> Unit = {}) {
        val builder = AddCapacityOptionsDsl()
        builder.apply(block)
        cdkBuilder.capacity(builder.build())
    }

    public fun capacity(capacity: AddCapacityOptions) {
        cdkBuilder.capacity(capacity)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun containerInsights(containerInsights: Boolean) {
        cdkBuilder.containerInsights(containerInsights)
    }

    public fun defaultCloudMapNamespace(block: CloudMapNamespaceOptionsDsl.() -> Unit = {}) {
        val builder = CloudMapNamespaceOptionsDsl()
        builder.apply(block)
        cdkBuilder.defaultCloudMapNamespace(builder.build())
    }

    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
        cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace)
    }

    public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
        cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
    }

    public fun executeCommandConfiguration(block: ExecuteCommandConfigurationDsl.() -> Unit = {}) {
        val builder = ExecuteCommandConfigurationDsl()
        builder.apply(block)
        cdkBuilder.executeCommandConfiguration(builder.build())
    }

    public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): Cluster = cdkBuilder.build()
}
