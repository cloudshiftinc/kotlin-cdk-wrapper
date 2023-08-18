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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.TaskRole

/**
 * Specifies a target role assumed by the State Machine's execution role for invoking the task's
 * resource.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function submitLambda;
 * Role iamRole;
 * // use a fixed role for all task invocations
 * TaskRole role = TaskRole.fromRole(iamRole);
 * // or use a json expression to resolve the role at runtime based on task inputs
 * //const role = sfn.TaskRole.fromRoleArnJsonPath('$.RoleArn');
 * LambdaInvoke submitJob = LambdaInvoke.Builder.create(this, "Submit Job")
 * .lambdaFunction(submitLambda)
 * .outputPath("$.Payload")
 * // use credentials
 * .credentials(Credentials.builder().role(role).build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-task-state.html#task-state-fields)
 */
@CdkDslMarker
public class CredentialsDsl {
    private val cdkBuilder: Credentials.Builder = Credentials.builder()

    /** @param role The role to be assumed for executing the Task. */
    public fun role(role: TaskRole) {
        cdkBuilder.role(role)
    }

    public fun build(): Credentials = cdkBuilder.build()
}
