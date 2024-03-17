@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a custom state definition.
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
public interface CustomStateProps {
  /**
   * Amazon States Language (JSON-based) definition of the state.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   */
  public fun stateJson(): Map<String, Any>

  /**
   * A builder for [CustomStateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param stateJson Amazon States Language (JSON-based) definition of the state. 
     */
    public fun stateJson(stateJson: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CustomStateProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CustomStateProps.builder()

    /**
     * @param stateJson Amazon States Language (JSON-based) definition of the state. 
     */
    override fun stateJson(stateJson: Map<String, Any>) {
      cdkBuilder.stateJson(stateJson)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CustomStateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CustomStateProps,
  ) : CdkObject(cdkObject), CustomStateProps {
    /**
     * Amazon States Language (JSON-based) definition of the state.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     */
    override fun stateJson(): Map<String, Any> = unwrap(this).getStateJson() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomStateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CustomStateProps):
        CustomStateProps = CdkObjectWrappers.wrap(cdkObject) as? CustomStateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomStateProps):
        software.amazon.awscdk.services.stepfunctions.CustomStateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CustomStateProps
  }
}
