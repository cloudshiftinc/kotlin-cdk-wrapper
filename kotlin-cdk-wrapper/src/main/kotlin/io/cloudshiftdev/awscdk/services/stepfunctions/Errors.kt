@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Predefined error strings Error names in Amazon States Language -
 * https://states-language.net/spec.html#appendix-a Error handling in Step Functions -
 * https://docs.aws.amazon.com/step-functions/latest/dg/concepts-error-handling.html.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
public open class Errors internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Errors,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.stepfunctions.Errors()
  )

  public companion object {
    public val ALL: String = software.amazon.awscdk.services.stepfunctions.Errors.ALL

    public val BRANCH_FAILED: String =
        software.amazon.awscdk.services.stepfunctions.Errors.BRANCH_FAILED

    public val HEARTBEAT_TIMEOUT: String =
        software.amazon.awscdk.services.stepfunctions.Errors.HEARTBEAT_TIMEOUT

    public val NO_CHOICE_MATCHED: String =
        software.amazon.awscdk.services.stepfunctions.Errors.NO_CHOICE_MATCHED

    public val PARAMETER_PATH_FAILURE: String =
        software.amazon.awscdk.services.stepfunctions.Errors.PARAMETER_PATH_FAILURE

    public val PERMISSIONS: String =
        software.amazon.awscdk.services.stepfunctions.Errors.PERMISSIONS

    public val RESULT_PATH_MATCH_FAILURE: String =
        software.amazon.awscdk.services.stepfunctions.Errors.RESULT_PATH_MATCH_FAILURE

    public val TASKS_FAILED: String =
        software.amazon.awscdk.services.stepfunctions.Errors.TASKS_FAILED

    public val TIMEOUT: String = software.amazon.awscdk.services.stepfunctions.Errors.TIMEOUT

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Errors): Errors =
        Errors(cdkObject)

    internal fun unwrap(wrapped: Errors): software.amazon.awscdk.services.stepfunctions.Errors =
        wrapped.cdkObject
  }
}
