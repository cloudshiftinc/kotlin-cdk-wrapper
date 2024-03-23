@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Running `PutPermission` permits the specified AWS account or AWS organization to put events to
 * the specified *event bus* .
 *
 * Amazon EventBridge (CloudWatch Events) rules in your account are triggered by these events
 * arriving to an event bus in your account.
 *
 * For another account to send events to your account, that external account must have an
 * EventBridge rule with your account's event bus as a target.
 *
 * To enable multiple AWS accounts to put events to your event bus, run `PutPermission` once for
 * each of these accounts. Or, if all the accounts are members of the same AWS organization, you can
 * run `PutPermission` once specifying `Principal` as "*" and specifying the AWS organization ID in
 * `Condition` , to grant permissions to all accounts in that organization.
 *
 * If you grant permissions using an organization, then accounts in that organization must specify a
 * `RoleArn` with proper permissions when they use `PutTarget` to add your account's event bus as a
 * target. For more information, see [Sending and Receiving Events Between AWS
 * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
 * in the *Amazon EventBridge User Guide* .
 *
 * The permission policy on the event bus cannot exceed 10 KB in size.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Object statement;
 * CfnEventBusPolicy cfnEventBusPolicy = CfnEventBusPolicy.Builder.create(this,
 * "MyCfnEventBusPolicy")
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
public open class CfnEventBusPolicy(
  cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBusPolicyProps,
  ) :
      this(software.amazon.awscdk.services.events.CfnEventBusPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEventBusPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBusPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventBusPolicyProps(props)
  )

  /**
   * The action that you are enabling the other account to perform.
   */
  public open fun action(): String? = unwrap(this).getAction()

  /**
   * The action that you are enabling the other account to perform.
   */
  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * This parameter enables you to limit the permission to accounts that fulfill a certain
   * condition, such as being a member of a certain AWS organization.
   */
  public open fun condition(): Any? = unwrap(this).getCondition()

  /**
   * This parameter enables you to limit the permission to accounts that fulfill a certain
   * condition, such as being a member of a certain AWS organization.
   */
  public open fun condition(`value`: IResolvable) {
    unwrap(this).setCondition(`value`.let(IResolvable::unwrap))
  }

  /**
   * This parameter enables you to limit the permission to accounts that fulfill a certain
   * condition, such as being a member of a certain AWS organization.
   */
  public open fun condition(`value`: ConditionProperty) {
    unwrap(this).setCondition(`value`.let(ConditionProperty::unwrap))
  }

  /**
   * This parameter enables you to limit the permission to accounts that fulfill a certain
   * condition, such as being a member of a certain AWS organization.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10cee99f7782d1bba1b99ecf1ad487fe3dfd7fae7c1d07d06dd3c6b683902ee6")
  public open fun condition(`value`: ConditionProperty.Builder.() -> Unit): Unit =
      condition(ConditionProperty(`value`))

  /**
   * The name of the event bus associated with the rule.
   */
  public open fun eventBusName(): String? = unwrap(this).getEventBusName()

  /**
   * The name of the event bus associated with the rule.
   */
  public open fun eventBusName(`value`: String) {
    unwrap(this).setEventBusName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The 12-digit AWS account ID that you are permitting to put events to your default event bus.
   */
  public open fun principal(): String? = unwrap(this).getPrincipal()

  /**
   * The 12-digit AWS account ID that you are permitting to put events to your default event bus.
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * A JSON string that describes the permission policy statement.
   */
  public open fun statement(): Any? = unwrap(this).getStatement()

  /**
   * A JSON string that describes the permission policy statement.
   */
  public open fun statement(`value`: Any) {
    unwrap(this).setStatement(`value`)
  }

  /**
   * An identifier string for the external account that you are granting permissions to.
   */
  public open fun statementId(): String = unwrap(this).getStatementId()

  /**
   * An identifier string for the external account that you are granting permissions to.
   */
  public open fun statementId(`value`: String) {
    unwrap(this).setStatementId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnEventBusPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action that you are enabling the other account to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action)
     * @param action The action that you are enabling the other account to perform. 
     */
    public fun action(action: String)

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
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization. 
     */
    public fun condition(condition: IResolvable)

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
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization. 
     */
    public fun condition(condition: ConditionProperty)

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
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7c81da9166694ec5e5051df6657e0f460416690db276f5df54c6b0454046fc8")
    public fun condition(condition: ConditionProperty.Builder.() -> Unit)

    /**
     * The name of the event bus associated with the rule.
     *
     * If you omit this, the default event bus is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-eventbusname)
     * @param eventBusName The name of the event bus associated with the rule. 
     */
    public fun eventBusName(eventBusName: String)

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
     * @param principal The 12-digit AWS account ID that you are permitting to put events to your
     * default event bus. 
     */
    public fun principal(principal: String)

    /**
     * A JSON string that describes the permission policy statement.
     *
     * You can include a `Policy` parameter in the request instead of using the `StatementId` ,
     * `Action` , `Principal` , or `Condition` parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statement)
     * @param statement A JSON string that describes the permission policy statement. 
     */
    public fun statement(statement: Any)

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
    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusPolicy.Builder =
        software.amazon.awscdk.services.events.CfnEventBusPolicy.Builder.create(scope, id)

    /**
     * The action that you are enabling the other account to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action)
     * @param action The action that you are enabling the other account to perform. 
     */
    override fun action(action: String) {
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
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization. 
     */
    override fun condition(condition: IResolvable) {
      cdkBuilder.condition(condition.let(IResolvable::unwrap))
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
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization. 
     */
    override fun condition(condition: ConditionProperty) {
      cdkBuilder.condition(condition.let(ConditionProperty::unwrap))
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
     * @param condition This parameter enables you to limit the permission to accounts that fulfill
     * a certain condition, such as being a member of a certain AWS organization. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7c81da9166694ec5e5051df6657e0f460416690db276f5df54c6b0454046fc8")
    override fun condition(condition: ConditionProperty.Builder.() -> Unit): Unit =
        condition(ConditionProperty(condition))

    /**
     * The name of the event bus associated with the rule.
     *
     * If you omit this, the default event bus is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-eventbusname)
     * @param eventBusName The name of the event bus associated with the rule. 
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

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
     * @param principal The 12-digit AWS account ID that you are permitting to put events to your
     * default event bus. 
     */
    override fun principal(principal: String) {
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
    override fun statement(statement: Any) {
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
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnEventBusPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBusPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBusPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy):
        CfnEventBusPolicy = CfnEventBusPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusPolicy):
        software.amazon.awscdk.services.events.CfnEventBusPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.events.CfnEventBusPolicy
  }

  /**
   * A JSON string which you can use to limit the event bus permissions you are granting to only
   * accounts that fulfill the condition.
   *
   * Currently, the only supported condition is membership in a certain AWS organization. The string
   * must contain `Type` , `Key` , and `Value` fields. The `Value` field specifies the ID of the AWS
   * organization. Following is an example value for `Condition` :
   *
   * `'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.events.*;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
   * .key("key")
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html)
   */
  public interface ConditionProperty {
    /**
     * Specifies the key for the condition.
     *
     * Currently the only supported key is `aws:PrincipalOrgID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html#cfn-events-eventbuspolicy-condition-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * Specifies the type of condition.
     *
     * Currently the only supported value is `StringEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html#cfn-events-eventbuspolicy-condition-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * Specifies the value for the key.
     *
     * Currently, this must be the ID of the organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html#cfn-events-eventbuspolicy-condition-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key Specifies the key for the condition.
       * Currently the only supported key is `aws:PrincipalOrgID` .
       */
      public fun key(key: String)

      /**
       * @param type Specifies the type of condition.
       * Currently the only supported value is `StringEquals` .
       */
      public fun type(type: String)

      /**
       * @param value Specifies the value for the key.
       * Currently, this must be the ID of the organization.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder =
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.builder()

      /**
       * @param key Specifies the key for the condition.
       * Currently the only supported key is `aws:PrincipalOrgID` .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param type Specifies the type of condition.
       * Currently the only supported value is `StringEquals` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Specifies the value for the key.
       * Currently, this must be the ID of the organization.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty,
    ) : CdkObject(cdkObject), ConditionProperty {
      /**
       * Specifies the key for the condition.
       *
       * Currently the only supported key is `aws:PrincipalOrgID` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html#cfn-events-eventbuspolicy-condition-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * Specifies the type of condition.
       *
       * Currently the only supported value is `StringEquals` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html#cfn-events-eventbuspolicy-condition-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * Specifies the value for the key.
       *
       * Currently, this must be the ID of the organization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html#cfn-events-eventbuspolicy-condition-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty):
          ConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? ConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty
    }
  }
}
