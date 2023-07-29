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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnEventBusPolicyProps

/**
 * Properties for defining a `CfnEventBusPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * Object statement;
 * CfnEventBusPolicyProps cfnEventBusPolicyProps = CfnEventBusPolicyProps.builder()
 * .statementId("statementId")
 * // the properties below are optional
 * .action("action")
 * .condition(ConditionProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build())
 * .eventBusName("eventBusName")
 * .principal("principal")
 * .statement(statement)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html)
 */
@CdkDslMarker
public class CfnEventBusPolicyPropsDsl {
    private val cdkBuilder: CfnEventBusPolicyProps.Builder = CfnEventBusPolicyProps.builder()

    /** @param action The action that you are enabling the other account to perform. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     *   a certain condition, such as being a member of a certain AWS organization. For more
     *   information about AWS Organizations, see
     *   [What Is AWS Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     *   in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    public fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     *   a certain condition, such as being a member of a certain AWS organization. For more
     *   information about AWS Organizations, see
     *   [What Is AWS Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     *   in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    public fun condition(condition: CfnEventBusPolicy.ConditionProperty) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param eventBusName The name of the event bus associated with the rule. If you omit this, the
     *   default event bus is used.
     */
    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param principal The 12-digit AWS account ID that you are permitting to put events to your
     *   default event bus. Specify "*" to permit any account to put events to your default event
     *   bus.
     *
     * If you specify "*" without specifying `Condition` , avoid creating rules that may match
     * undesirable events. To create more secure rules, make sure that the event pattern for each
     * rule contains an `account` field with a specific account ID from which to receive events.
     * Rules with an account field do not match any events sent from other accounts.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * @param statement A JSON string that describes the permission policy statement. You can
     *   include a `Policy` parameter in the request instead of using the `StatementId` , `Action` ,
     *   `Principal` , or `Condition` parameters.
     */
    public fun statement(statement: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(statement)
        cdkBuilder.statement(builder.map)
    }

    /**
     * @param statement A JSON string that describes the permission policy statement. You can
     *   include a `Policy` parameter in the request instead of using the `StatementId` , `Action` ,
     *   `Principal` , or `Condition` parameters.
     */
    public fun statement(statement: Any) {
        cdkBuilder.statement(statement)
    }

    /**
     * @param statementId An identifier string for the external account that you are granting
     *   permissions to. If you later want to revoke the permission for this external account,
     *   specify this `StatementId` when you run
     *   [RemovePermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_RemovePermission.html)
     *   .
     *
     * Each `StatementId` must be unique.
     */
    public fun statementId(statementId: String) {
        cdkBuilder.statementId(statementId)
    }

    public fun build(): CfnEventBusPolicyProps = cdkBuilder.build()
}
