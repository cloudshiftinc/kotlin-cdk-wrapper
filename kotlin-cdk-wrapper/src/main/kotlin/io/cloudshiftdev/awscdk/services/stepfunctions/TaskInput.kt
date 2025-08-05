@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Type union for task classes that accept multiple types of payload.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * RestApi api;
 * CallApiGatewayRestApiEndpoint.jsonata(this, "Endpoint",
 * CallApiGatewayRestApiEndpointJsonataProps.builder()
 * .api(api)
 * .stageName("Stage")
 * .method(HttpMethod.PUT)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .headers(TaskInput.fromObject(Map.of(
 * "TaskToken", "{% States.Array($states.context.taskToken) %}")))
 * .build());
 * ```
 */
public open class TaskInput(
  cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput,
) : CdkObject(cdkObject) {
  /**
   * type of task input.
   */
  public open fun type(): InputType = unwrap(this).getType().let(InputType::wrap)

  /**
   * payload for the corresponding input type.
   *
   * It can be a JSON-encoded object, context, data, etc.
   */
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public fun fromJsonPathAt(path: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromJsonPathAt(path).let(TaskInput::wrap)

    public fun fromObject(obj: Map<String, Any>): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromObject(obj.mapValues{CdkObjectWrappers.unwrap(it.value)}).let(TaskInput::wrap)

    public fun fromText(text: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromText(text).let(TaskInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput): TaskInput
        = TaskInput(cdkObject)

    internal fun unwrap(wrapped: TaskInput): software.amazon.awscdk.services.stepfunctions.TaskInput
        = wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.TaskInput
  }
}
