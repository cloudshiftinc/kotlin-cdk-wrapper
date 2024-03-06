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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.CustomState
import software.constructs.Construct

/**
 * State defined by supplying Amazon States Language (ASL) in the state machine.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.dynamodb.*;
 * // create a table
 * Table table = Table.Builder.create(this, "montable")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .build();
 * Pass finalStatus = new Pass(this, "final step");
 * // States language JSON to put an item into DynamoDB
 * // snippet generated from
 * https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-code-snippet.html#tutorial-code-snippet-1
 * Map&lt;String, Object&gt; stateJson = Map.of(
 * "Type", "Task",
 * "Resource", "arn:aws:states:::dynamodb:putItem",
 * "Parameters", Map.of(
 * "TableName", table.getTableName(),
 * "Item", Map.of(
 * "id", Map.of(
 * "S", "MyEntry"))),
 * "ResultPath", null);
 * // custom state which represents a task to insert data into DynamoDB
 * CustomState custom = CustomState.Builder.create(this, "my custom task")
 * .stateJson(stateJson)
 * .build();
 * // catch errors with addCatch
 * Pass errorHandler = new Pass(this, "handle failure");
 * custom.addCatch(errorHandler);
 * // retry the task if something goes wrong
 * custom.addRetry(RetryProps.builder()
 * .errors(List.of(Errors.ALL))
 * .interval(Duration.seconds(10))
 * .maxAttempts(5)
 * .build());
 * Chain chain = Chain.start(custom).next(finalStatus);
 * StateMachine sm = StateMachine.Builder.create(this, "StateMachine")
 * .definitionBody(DefinitionBody.fromChainable(chain))
 * .timeout(Duration.seconds(30))
 * .comment("a super cool state machine")
 * .build();
 * // don't forget permissions. You need to assign them
 * table.grantWriteData(sm);
 * ```
 */
@CdkDslMarker
public class CustomStateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CustomState.Builder = CustomState.Builder.create(scope, id)

    /**
     * Amazon States Language (JSON-based) definition of the state.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     *
     * @param stateJson Amazon States Language (JSON-based) definition of the state.
     */
    public fun stateJson(stateJson: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(stateJson)
        cdkBuilder.stateJson(builder.map)
    }

    /**
     * Amazon States Language (JSON-based) definition of the state.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     *
     * @param stateJson Amazon States Language (JSON-based) definition of the state.
     */
    public fun stateJson(stateJson: Map<String, Any>) {
        cdkBuilder.stateJson(stateJson)
    }

    public fun build(): CustomState = cdkBuilder.build()
}
