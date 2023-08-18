@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.iam.IRole

/**
 * Attributes used to import an existing External task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * ExternalTaskDefinitionAttributes externalTaskDefinitionAttributes =
 * ExternalTaskDefinitionAttributes.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .executionRole(role)
 * .networkMode(NetworkMode.NONE)
 * .taskRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class ExternalTaskDefinitionAttributesDsl {
    private val cdkBuilder: ExternalTaskDefinitionAttributes.Builder =
        ExternalTaskDefinitionAttributes.builder()

    /**
     * @param executionRole The IAM role that grants containers and Fargate agents permission to
     *   make AWS API calls on your behalf. Some tasks do not have an execution role.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /** @param networkMode The networking mode to use for the containers in the task. */
    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    /** @param taskDefinitionArn The arn of the task definition. */
    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     *   call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    public fun build(): ExternalTaskDefinitionAttributes = cdkBuilder.build()
}
