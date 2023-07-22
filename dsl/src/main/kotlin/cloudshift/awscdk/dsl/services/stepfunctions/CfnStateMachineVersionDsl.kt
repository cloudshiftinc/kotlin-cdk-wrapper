@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
import software.constructs.Construct

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
   * @param description An optional description of the state machine version. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The Amazon Resource Name (ARN) of the state machine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinearn)
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
   * specified ID. Use this option to avoid publishing a version if the state machine has changed since
   * you last updated it.
   *
   * To specify the initial state machine revision, set the value as `INITIAL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinerevisionid)
   * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
   * read-only snapshot of a state machine’s definition and configuration. 
   */
  public fun stateMachineRevisionId(stateMachineRevisionId: String) {
    cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
  }

  public fun build(): CfnStateMachineVersion = cdkBuilder.build()
}
