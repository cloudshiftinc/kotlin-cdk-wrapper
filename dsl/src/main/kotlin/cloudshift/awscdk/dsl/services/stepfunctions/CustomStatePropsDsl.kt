@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.CustomStateProps

/**
 * Properties for defining a custom state definition.
 *
 * Example:
 *
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
 * Chain chain = Chain.start(custom).next(finalStatus);
 * StateMachine sm = StateMachine.Builder.create(this, "StateMachine")
 * .definition(chain)
 * .timeout(Duration.seconds(30))
 * .build();
 * // don't forget permissions. You need to assign them
 * table.grantWriteData(sm);
 * ```
 */
@CdkDslMarker
public class CustomStatePropsDsl {
  private val cdkBuilder: CustomStateProps.Builder = CustomStateProps.builder()

  /**
   * @param stateJson Amazon States Language (JSON-based) definition of the state. 
   */
  public fun stateJson(stateJson: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(stateJson)
    cdkBuilder.stateJson(builder.map)
  }

  /**
   * @param stateJson Amazon States Language (JSON-based) definition of the state. 
   */
  public fun stateJson(stateJson: Map<String, Any>) {
    cdkBuilder.stateJson(stateJson)
  }

  public fun build(): CustomStateProps = cdkBuilder.build()
}
