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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CfnDeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeployment.Builder = CfnDeployment.Builder.create(scope, id)

    public fun components(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.components(builder.map)
    }

    public fun components(components: Map<String, Any>) {
        cdkBuilder.components(components)
    }

    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    public fun deploymentName(deploymentName: String) {
        cdkBuilder.deploymentName(deploymentName)
    }

    public fun deploymentPolicies(deploymentPolicies: IResolvable) {
        cdkBuilder.deploymentPolicies(deploymentPolicies)
    }

    public fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty) {
        cdkBuilder.deploymentPolicies(deploymentPolicies)
    }

    public fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
        cdkBuilder.iotJobConfiguration(iotJobConfiguration)
    }

    public fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty) {
        cdkBuilder.iotJobConfiguration(iotJobConfiguration)
    }

    public fun parentTargetArn(parentTargetArn: String) {
        cdkBuilder.parentTargetArn(parentTargetArn)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnDeployment = cdkBuilder.build()
}
