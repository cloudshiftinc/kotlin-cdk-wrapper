@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps

/**
 * Properties for defining a `CfnStateMachineVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CfnStateMachineVersionProps cfnStateMachineVersionProps = CfnStateMachineVersionProps.builder()
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
public class CfnStateMachineVersionPropsDsl {
  private val cdkBuilder: CfnStateMachineVersionProps.Builder =
      CfnStateMachineVersionProps.builder()

  /**
   * @param description An optional description of the state machine version.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param stateMachineArn The Amazon Resource Name (ARN) of the state machine. 
   */
  public fun stateMachineArn(stateMachineArn: String) {
    cdkBuilder.stateMachineArn(stateMachineArn)
  }

  /**
   * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
   * read-only snapshot of a state machine’s definition and configuration.
   * Only publish the state machine version if the current state machine's revision ID matches the
   * specified ID. Use this option to avoid publishing a version if the state machine has changed since
   * you last updated it.
   *
   * To specify the initial state machine revision, set the value as `INITIAL` .
   */
  public fun stateMachineRevisionId(stateMachineRevisionId: String) {
    cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
  }

  public fun build(): CfnStateMachineVersionProps = cdkBuilder.build()
}
