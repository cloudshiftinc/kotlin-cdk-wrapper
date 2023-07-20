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
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.iam.IRole
import kotlin.String

@CdkDslMarker
public class Ec2TaskDefinitionAttributesDsl {
    private val cdkBuilder: Ec2TaskDefinitionAttributes.Builder =
        Ec2TaskDefinitionAttributes.builder()

    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    public fun build(): Ec2TaskDefinitionAttributes = cdkBuilder.build()
}
