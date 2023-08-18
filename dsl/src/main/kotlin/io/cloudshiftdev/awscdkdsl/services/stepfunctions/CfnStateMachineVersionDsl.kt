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
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
import software.constructs.Construct

/**
 * Represents a state machine
 * [version](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html)
 * . A published version uses the latest state machine
 * [*revision*](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html)
 * . A revision is an immutable, read-only snapshot of a state machine’s definition and
 * configuration.
 *
 * You can publish up to 1000 versions for each state machine.
 *
 * Before you delete a version, make sure that version's ARN isn't being referenced in any
 * long-running workflows or application code outside of the stack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CfnStateMachineVersion cfnStateMachineVersion = CfnStateMachineVersion.Builder.create(this,
 * "MyCfnStateMachineVersion")
 * .stateMachineArn("stateMachineArn")
 * // the properties below are optional
 * .description("description")
 * .stateMachineRevisionId("stateMachineRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
 */
@CdkDslMarker
public class CfnStateMachineVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStateMachineVersion.Builder =
        CfnStateMachineVersion.Builder.create(scope, id)

    /**
     * An optional description of the state machine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-description)
     *
     * @param description An optional description of the state machine version.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinearn)
     *
     * @param stateMachineArn The Amazon Resource Name (ARN) of the state machine.
     */
    public fun stateMachineArn(stateMachineArn: String) {
        cdkBuilder.stateMachineArn(stateMachineArn)
    }

    /**
     * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
     * machine’s definition and configuration.
     *
     * Only publish the state machine version if the current state machine's revision ID matches the
     * specified ID. Use this option to avoid publishing a version if the state machine has changed
     * since you last updated it.
     *
     * To specify the initial state machine revision, set the value as `INITIAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinerevisionid)
     *
     * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
     *   read-only snapshot of a state machine’s definition and configuration.
     */
    public fun stateMachineRevisionId(stateMachineRevisionId: String) {
        cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
    }

    public fun build(): CfnStateMachineVersion = cdkBuilder.build()
}
