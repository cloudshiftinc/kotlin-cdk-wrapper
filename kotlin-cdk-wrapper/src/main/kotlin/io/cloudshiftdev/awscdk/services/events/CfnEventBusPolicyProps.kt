@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEventBusPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
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
public interface CfnEventBusPolicyProps {
  /**
   * The action that you are enabling the other account to perform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action)
   */
  public fun action(): String? = unwrap(this).getAction()

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
   */
  public fun condition(): Any? = unwrap(this).getCondition()

  /**
   * The name of the event bus associated with the rule.
   *
   * If you omit this, the default event bus is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-eventbusname)
   */
  public fun eventBusName(): String? = unwrap(this).getEventBusName()

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
   */
  public fun principal(): String? = unwrap(this).getPrincipal()

  /**
   * A JSON string that describes the permission policy statement.
   *
   * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
   * `Action` , `Principal` , or `Condition` parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statement)
   */
  public fun statement(): Any? = unwrap(this).getStatement()

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
   */
  public fun statementId(): String

  /**
   * A builder for [CfnEventBusPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The action that you are enabling the other account to perform.
     */
    public fun action(action: String)

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization.
     * For more information about AWS Organizations, see [What Is AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     * in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    public fun condition(condition: IResolvable)

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization.
     * For more information about AWS Organizations, see [What Is AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     * in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    public fun condition(condition: CfnEventBusPolicy.ConditionProperty)

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization.
     * For more information about AWS Organizations, see [What Is AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     * in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5ce8bf20b3118b22e6d94130e52b244dfdf435c95ef3872b9697d7651a89c1")
    public fun condition(condition: CfnEventBusPolicy.ConditionProperty.Builder.() -> Unit)

    /**
     * @param eventBusName The name of the event bus associated with the rule.
     * If you omit this, the default event bus is used.
     */
    public fun eventBusName(eventBusName: String)

    /**
     * @param principal The 12-digit AWS account ID that you are permitting to put events to your
     * default event bus.
     * Specify "*" to permit any account to put events to your default event bus.
     *
     * If you specify "*" without specifying `Condition` , avoid creating rules that may match
     * undesirable events. To create more secure rules, make sure that the event pattern for each rule
     * contains an `account` field with a specific account ID from which to receive events. Rules with
     * an account field do not match any events sent from other accounts.
     */
    public fun principal(principal: String)

    /**
     * @param statement A JSON string that describes the permission policy statement.
     * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
     * `Action` , `Principal` , or `Condition` parameters.
     */
    public fun statement(statement: Any)

    /**
     * @param statementId An identifier string for the external account that you are granting
     * permissions to. 
     * If you later want to revoke the permission for this external account, specify this
     * `StatementId` when you run
     * [RemovePermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_RemovePermission.html)
     * .
     *
     *
     * Each `StatementId` must be unique.
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder =
        software.amazon.awscdk.services.events.CfnEventBusPolicyProps.builder()

    /**
     * @param action The action that you are enabling the other account to perform.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization.
     * For more information about AWS Organizations, see [What Is AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     * in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    override fun condition(condition: IResolvable) {
      cdkBuilder.condition(condition.let(IResolvable::unwrap))
    }

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization.
     * For more information about AWS Organizations, see [What Is AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     * in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    override fun condition(condition: CfnEventBusPolicy.ConditionProperty) {
      cdkBuilder.condition(condition.let(CfnEventBusPolicy.ConditionProperty::unwrap))
    }

    /**
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization.
     * For more information about AWS Organizations, see [What Is AWS
     * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html)
     * in the *AWS Organizations User Guide* .
     *
     * If you specify `Condition` with an AWS organization ID, and specify "*" as the value for
     * `Principal` , you grant permission to all the accounts in the named organization.
     *
     * The `Condition` is a JSON string which must contain `Type` , `Key` , and `Value` fields.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5ce8bf20b3118b22e6d94130e52b244dfdf435c95ef3872b9697d7651a89c1")
    override fun condition(condition: CfnEventBusPolicy.ConditionProperty.Builder.() -> Unit): Unit
        = condition(CfnEventBusPolicy.ConditionProperty(condition))

    /**
     * @param eventBusName The name of the event bus associated with the rule.
     * If you omit this, the default event bus is used.
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param principal The 12-digit AWS account ID that you are permitting to put events to your
     * default event bus.
     * Specify "*" to permit any account to put events to your default event bus.
     *
     * If you specify "*" without specifying `Condition` , avoid creating rules that may match
     * undesirable events. To create more secure rules, make sure that the event pattern for each rule
     * contains an `account` field with a specific account ID from which to receive events. Rules with
     * an account field do not match any events sent from other accounts.
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param statement A JSON string that describes the permission policy statement.
     * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
     * `Action` , `Principal` , or `Condition` parameters.
     */
    override fun statement(statement: Any) {
      cdkBuilder.statement(statement)
    }

    /**
     * @param statementId An identifier string for the external account that you are granting
     * permissions to. 
     * If you later want to revoke the permission for this external account, specify this
     * `StatementId` when you run
     * [RemovePermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_RemovePermission.html)
     * .
     *
     *
     * Each `StatementId` must be unique.
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicyProps,
  ) : CdkObject(cdkObject), CfnEventBusPolicyProps {
    /**
     * The action that you are enabling the other account to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action)
     */
    override fun action(): String? = unwrap(this).getAction()

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
     */
    override fun condition(): Any? = unwrap(this).getCondition()

    /**
     * The name of the event bus associated with the rule.
     *
     * If you omit this, the default event bus is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-eventbusname)
     */
    override fun eventBusName(): String? = unwrap(this).getEventBusName()

    /**
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus.
     *
     * Specify "*" to permit any account to put events to your default event bus.
     *
     * If you specify "*" without specifying `Condition` , avoid creating rules that may match
     * undesirable events. To create more secure rules, make sure that the event pattern for each rule
     * contains an `account` field with a specific account ID from which to receive events. Rules with
     * an account field do not match any events sent from other accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-principal)
     */
    override fun principal(): String? = unwrap(this).getPrincipal()

    /**
     * A JSON string that describes the permission policy statement.
     *
     * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
     * `Action` , `Principal` , or `Condition` parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statement)
     */
    override fun statement(): Any? = unwrap(this).getStatement()

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
     */
    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventBusPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicyProps):
        CfnEventBusPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventBusPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusPolicyProps):
        software.amazon.awscdk.services.events.CfnEventBusPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnEventBusPolicyProps
  }
}
