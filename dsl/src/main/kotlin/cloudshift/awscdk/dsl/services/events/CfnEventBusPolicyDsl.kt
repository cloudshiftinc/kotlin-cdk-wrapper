@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnEventBusPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEventBusPolicy.Builder = CfnEventBusPolicy.Builder.create(scope, id)

  /**
   * The action that you are enabling the other account to perform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action)
   * @param action The action that you are enabling the other account to perform. 
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * This parameter enables you to limit the permission to accounts that fulfill a certain
   * condition, such as being a member of a certain AWS organization.
   *
   * For more information about AWS Organizations, see [What Is AWS
   * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
   * in the *AWS Organizations User Guide* .
   *
   * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
   * `Principal` , you grant permission to all the accounts in the named organization.
   *
   * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-condition)
   * @param condition This parameter enables you to limit the permission to accounts that fulfill a
   * certain condition, such as being a member of a certain AWS organization. 
   */
  public fun condition(condition: IResolvable) {
    cdkBuilder.condition(condition)
  }

  /**
   * This parameter enables you to limit the permission to accounts that fulfill a certain
   * condition, such as being a member of a certain AWS organization.
   *
   * For more information about AWS Organizations, see [What Is AWS
   * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
   * in the *AWS Organizations User Guide* .
   *
   * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
   * `Principal` , you grant permission to all the accounts in the named organization.
   *
   * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-condition)
   * @param condition This parameter enables you to limit the permission to accounts that fulfill a
   * certain condition, such as being a member of a certain AWS organization. 
   */
  public fun condition(condition: CfnEventBusPolicy.ConditionProperty) {
    cdkBuilder.condition(condition)
  }

  /**
   * The name of the event bus associated with the rule.
   *
   * If you omit this, the default event bus is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-eventbusname)
   * @param eventBusName The name of the event bus associated with the rule. 
   */
  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  /**
   * The 12-digit AWS account ID that you are permitting to put events to your default event bus.
   *
   * Specify "*" to permit any account to put events to your default event bus.
   *
   * If you specify "*" without specifying `Condition` , avoid creating rules that may match
   * undesirable events. To create more secure rules, make sure that the event pattern for each rule
   * contains an `account` field with a specific account ID from which to receive events. Rules with an
   * account field do not match any events sent from other accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-principal)
   * @param principal The 12-digit AWS account ID that you are permitting to put events to your
   * default event bus. 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  /**
   * A JSON string that describes the permission policy statement.
   *
   * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
   * `Action` , `Principal` , or `Condition` parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statement)
   * @param statement A JSON string that describes the permission policy statement. 
   */
  public fun statement(statement: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(statement)
    cdkBuilder.statement(builder.map)
  }

  /**
   * A JSON string that describes the permission policy statement.
   *
   * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
   * `Action` , `Principal` , or `Condition` parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statement)
   * @param statement A JSON string that describes the permission policy statement. 
   */
  public fun statement(statement: Any) {
    cdkBuilder.statement(statement)
  }

  /**
   * An identifier string for the external account that you are granting permissions to.
   *
   * If you later want to revoke the permission for this external account, specify this
   * `StatementId` when you run
   * [RemovePermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_RemovePermission.html)
   * .
   *
   *
   * Each `StatementId` must be unique.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statementid)
   * @param statementId An identifier string for the external account that you are granting
   * permissions to. 
   */
  public fun statementId(statementId: String) {
    cdkBuilder.statementId(statementId)
  }

  public fun build(): CfnEventBusPolicy = cdkBuilder.build()
}
