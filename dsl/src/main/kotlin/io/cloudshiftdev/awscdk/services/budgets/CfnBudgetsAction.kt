package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBudgetsAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The trigger threshold of the action.
   */
  public open fun actionThreshold(): Any = unwrap(this).getActionThreshold()

  /**
   * The trigger threshold of the action.
   */
  public open fun actionThreshold(`value`: IResolvable) {
    unwrap(this).setActionThreshold(`value`.let(IResolvable::unwrap))
  }

  /**
   * The trigger threshold of the action.
   */
  public open fun actionThreshold(`value`: ActionThresholdProperty) {
    unwrap(this).setActionThreshold(`value`.let(ActionThresholdProperty::unwrap))
  }

  /**
   * The trigger threshold of the action.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c090ddaa4dab5516201740f46982ed7d2317298232d9ea7ff8864f11f0cc42f")
  public open fun actionThreshold(`value`: ActionThresholdProperty.Builder.() -> Unit): Unit =
      actionThreshold(ActionThresholdProperty(`value`))

  /**
   * The type of action.
   */
  public open fun actionType(): String = unwrap(this).getActionType()

  /**
   * The type of action.
   */
  public open fun actionType(`value`: String) {
    unwrap(this).setActionType(`value`)
  }

  /**
   * This specifies if the action needs manual or automatic approval.
   */
  public open fun approvalModel(): String? = unwrap(this).getApprovalModel()

  /**
   * This specifies if the action needs manual or automatic approval.
   */
  public open fun approvalModel(`value`: String) {
    unwrap(this).setApprovalModel(`value`)
  }

  /**
   * A system-generated universally unique identifier (UUID) for the action.
   */
  public open fun attrActionId(): String = unwrap(this).getAttrActionId()

  /**
   * A string that represents the budget name.
   */
  public open fun budgetName(): String = unwrap(this).getBudgetName()

  /**
   * A string that represents the budget name.
   */
  public open fun budgetName(`value`: String) {
    unwrap(this).setBudgetName(`value`)
  }

  /**
   * Specifies all of the type-specific parameters.
   */
  public open fun definition(): Any = unwrap(this).getDefinition()

  /**
   * Specifies all of the type-specific parameters.
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies all of the type-specific parameters.
   */
  public open fun definition(`value`: DefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(DefinitionProperty::unwrap))
  }

  /**
   * Specifies all of the type-specific parameters.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76c1f2c93ba1eef6943d7056edfeb981ebcbc1517133bb81d2156801a81245bf")
  public open fun definition(`value`: DefinitionProperty.Builder.() -> Unit): Unit =
      definition(DefinitionProperty(`value`))

  /**
   * The role passed for action execution and reversion.
   */
  public open fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

  /**
   * The role passed for action execution and reversion.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
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
   * The type of a notification.
   */
  public open fun notificationType(): String = unwrap(this).getNotificationType()

  /**
   * The type of a notification.
   */
  public open fun notificationType(`value`: String) {
    unwrap(this).setNotificationType(`value`)
  }

  /**
   * A list of subscribers.
   */
  public open fun subscribers(): Any = unwrap(this).getSubscribers()

  /**
   * A list of subscribers.
   */
  public open fun subscribers(`value`: IResolvable) {
    unwrap(this).setSubscribers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of subscribers.
   */
  public open fun subscribers(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscribers(__idx_ac66f0)
  }

  /**
   * A list of subscribers.
   */
  public open fun subscribers(vararg __idx_ac66f0: Any): Unit = subscribers(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.budgets.CfnBudgetsAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     * @param actionThreshold The trigger threshold of the action. 
     */
    public fun actionThreshold(actionThreshold: IResolvable)

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     * @param actionThreshold The trigger threshold of the action. 
     */
    public fun actionThreshold(actionThreshold: ActionThresholdProperty)

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     * @param actionThreshold The trigger threshold of the action. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d431faf93eadd4eb9e269a6ee1f104fce786914616d64023a9442ca2f259e5a8")
    public fun actionThreshold(actionThreshold: ActionThresholdProperty.Builder.() -> Unit)

    /**
     * The type of action.
     *
     * This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actiontype)
     * @param actionType The type of action. 
     */
    public fun actionType(actionType: String)

    /**
     * This specifies if the action needs manual or automatic approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-approvalmodel)
     * @param approvalModel This specifies if the action needs manual or automatic approval. 
     */
    public fun approvalModel(approvalModel: String)

    /**
     * A string that represents the budget name.
     *
     * ":" and "" characters aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-budgetname)
     * @param budgetName A string that represents the budget name. 
     */
    public fun budgetName(budgetName: String)

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     * @param definition Specifies all of the type-specific parameters. 
     */
    public fun definition(definition: IResolvable)

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     * @param definition Specifies all of the type-specific parameters. 
     */
    public fun definition(definition: DefinitionProperty)

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     * @param definition Specifies all of the type-specific parameters. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1823ac6b0807d50de040e9648221813ce97cd1481fa360eb133bac1b036cc24")
    public fun definition(definition: DefinitionProperty.Builder.() -> Unit)

    /**
     * The role passed for action execution and reversion.
     *
     * Roles and actions must be in the same account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-executionrolearn)
     * @param executionRoleArn The role passed for action execution and reversion. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * The type of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-notificationtype)
     * @param notificationType The type of a notification. 
     */
    public fun notificationType(notificationType: String)

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     * @param subscribers A list of subscribers. 
     */
    public fun subscribers(subscribers: IResolvable)

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     * @param subscribers A list of subscribers. 
     */
    public fun subscribers(subscribers: List<Any>)

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     * @param subscribers A list of subscribers. 
     */
    public fun subscribers(vararg subscribers: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudgetsAction.Builder =
        software.amazon.awscdk.services.budgets.CfnBudgetsAction.Builder.create(scope, id)

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     * @param actionThreshold The trigger threshold of the action. 
     */
    override fun actionThreshold(actionThreshold: IResolvable) {
      cdkBuilder.actionThreshold(actionThreshold.let(IResolvable::unwrap))
    }

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     * @param actionThreshold The trigger threshold of the action. 
     */
    override fun actionThreshold(actionThreshold: ActionThresholdProperty) {
      cdkBuilder.actionThreshold(actionThreshold.let(ActionThresholdProperty::unwrap))
    }

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     * @param actionThreshold The trigger threshold of the action. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d431faf93eadd4eb9e269a6ee1f104fce786914616d64023a9442ca2f259e5a8")
    override fun actionThreshold(actionThreshold: ActionThresholdProperty.Builder.() -> Unit): Unit
        = actionThreshold(ActionThresholdProperty(actionThreshold))

    /**
     * The type of action.
     *
     * This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actiontype)
     * @param actionType The type of action. 
     */
    override fun actionType(actionType: String) {
      cdkBuilder.actionType(actionType)
    }

    /**
     * This specifies if the action needs manual or automatic approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-approvalmodel)
     * @param approvalModel This specifies if the action needs manual or automatic approval. 
     */
    override fun approvalModel(approvalModel: String) {
      cdkBuilder.approvalModel(approvalModel)
    }

    /**
     * A string that represents the budget name.
     *
     * ":" and "" characters aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-budgetname)
     * @param budgetName A string that represents the budget name. 
     */
    override fun budgetName(budgetName: String) {
      cdkBuilder.budgetName(budgetName)
    }

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     * @param definition Specifies all of the type-specific parameters. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     * @param definition Specifies all of the type-specific parameters. 
     */
    override fun definition(definition: DefinitionProperty) {
      cdkBuilder.definition(definition.let(DefinitionProperty::unwrap))
    }

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     * @param definition Specifies all of the type-specific parameters. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1823ac6b0807d50de040e9648221813ce97cd1481fa360eb133bac1b036cc24")
    override fun definition(definition: DefinitionProperty.Builder.() -> Unit): Unit =
        definition(DefinitionProperty(definition))

    /**
     * The role passed for action execution and reversion.
     *
     * Roles and actions must be in the same account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-executionrolearn)
     * @param executionRoleArn The role passed for action execution and reversion. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * The type of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-notificationtype)
     * @param notificationType The type of a notification. 
     */
    override fun notificationType(notificationType: String) {
      cdkBuilder.notificationType(notificationType)
    }

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     * @param subscribers A list of subscribers. 
     */
    override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
    }

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     * @param subscribers A list of subscribers. 
     */
    override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers)
    }

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     * @param subscribers A list of subscribers. 
     */
    override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudgetsAction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBudgetsAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBudgetsAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction):
        CfnBudgetsAction = CfnBudgetsAction(cdkObject)

    internal fun unwrap(wrapped: CfnBudgetsAction):
        software.amazon.awscdk.services.budgets.CfnBudgetsAction = wrapped.cdkObject
  }

  public interface SsmActionDefinitionProperty {
    /**
     * The EC2 and RDS instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html#cfn-budgets-budgetsaction-ssmactiondefinition-instanceids)
     */
    public fun instanceIds(): List<String>

    /**
     * The Region to run the ( SSM ) document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html#cfn-budgets-budgetsaction-ssmactiondefinition-region)
     */
    public fun region(): String

    /**
     * The action subType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html#cfn-budgets-budgetsaction-ssmactiondefinition-subtype)
     */
    public fun subtype(): String

    /**
     * A builder for [SsmActionDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceIds The EC2 and RDS instance IDs. 
       */
      public fun instanceIds(instanceIds: List<String>)

      /**
       * @param instanceIds The EC2 and RDS instance IDs. 
       */
      public fun instanceIds(vararg instanceIds: String)

      /**
       * @param region The Region to run the ( SSM ) document. 
       */
      public fun region(region: String)

      /**
       * @param subtype The action subType. 
       */
      public fun subtype(subtype: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty.builder()

      /**
       * @param instanceIds The EC2 and RDS instance IDs. 
       */
      override fun instanceIds(instanceIds: List<String>) {
        cdkBuilder.instanceIds(instanceIds)
      }

      /**
       * @param instanceIds The EC2 and RDS instance IDs. 
       */
      override fun instanceIds(vararg instanceIds: String): Unit = instanceIds(instanceIds.toList())

      /**
       * @param region The Region to run the ( SSM ) document. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param subtype The action subType. 
       */
      override fun subtype(subtype: String) {
        cdkBuilder.subtype(subtype)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty,
    ) : SsmActionDefinitionProperty {
      /**
       * The EC2 and RDS instance IDs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html#cfn-budgets-budgetsaction-ssmactiondefinition-instanceids)
       */
      override fun instanceIds(): List<String> = unwrap(this).getInstanceIds()

      /**
       * The Region to run the ( SSM ) document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html#cfn-budgets-budgetsaction-ssmactiondefinition-region)
       */
      override fun region(): String = unwrap(this).getRegion()

      /**
       * The action subType.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html#cfn-budgets-budgetsaction-ssmactiondefinition-subtype)
       */
      override fun subtype(): String = unwrap(this).getSubtype()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SsmActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty):
          SsmActionDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmActionDefinitionProperty):
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionThresholdProperty {
    /**
     * The type of threshold for a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-actionthreshold.html#cfn-budgets-budgetsaction-actionthreshold-type)
     */
    public fun type(): String

    /**
     * The threshold of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-actionthreshold.html#cfn-budgets-budgetsaction-actionthreshold-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [ActionThresholdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of threshold for a notification. 
       */
      public fun type(type: String)

      /**
       * @param value The threshold of a notification. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty.builder()

      /**
       * @param type The type of threshold for a notification. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The threshold of a notification. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty,
    ) : ActionThresholdProperty {
      /**
       * The type of threshold for a notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-actionthreshold.html#cfn-budgets-budgetsaction-actionthreshold-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The threshold of a notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-actionthreshold.html#cfn-budgets-budgetsaction-actionthreshold-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty):
          ActionThresholdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionThresholdProperty):
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefinitionProperty {
    /**
     * The AWS Identity and Access Management ( IAM ) action definition details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html#cfn-budgets-budgetsaction-definition-iamactiondefinition)
     */
    public fun iamActionDefinition(): Any? = unwrap(this).getIamActionDefinition()

    /**
     * The service control policies (SCP) action definition details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html#cfn-budgets-budgetsaction-definition-scpactiondefinition)
     */
    public fun scpActionDefinition(): Any? = unwrap(this).getScpActionDefinition()

    /**
     * The Amazon EC2 Systems Manager ( SSM ) action definition details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html#cfn-budgets-budgetsaction-definition-ssmactiondefinition)
     */
    public fun ssmActionDefinition(): Any? = unwrap(this).getSsmActionDefinition()

    /**
     * A builder for [DefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
       * details.
       */
      public fun iamActionDefinition(iamActionDefinition: IResolvable)

      /**
       * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
       * details.
       */
      public fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty)

      /**
       * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
       * details.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c52ca7820a6fe284fd0ea3d9afc93f16bddfe032234b3317f714efc21f60583a")
      public
          fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty.Builder.() -> Unit)

      /**
       * @param scpActionDefinition The service control policies (SCP) action definition details.
       */
      public fun scpActionDefinition(scpActionDefinition: IResolvable)

      /**
       * @param scpActionDefinition The service control policies (SCP) action definition details.
       */
      public fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty)

      /**
       * @param scpActionDefinition The service control policies (SCP) action definition details.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9ff7d807d0531c6d4fa23ee7b3b44b9d6dc0cdd12a9c3129aa626e806c7876a")
      public
          fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty.Builder.() -> Unit)

      /**
       * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition
       * details.
       */
      public fun ssmActionDefinition(ssmActionDefinition: IResolvable)

      /**
       * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition
       * details.
       */
      public fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty)

      /**
       * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition
       * details.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82fccf1fba528ea2ee3866085585fe779fc0b8a34dc7177e1aa514be8ce3bcc1")
      public
          fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty.builder()

      /**
       * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
       * details.
       */
      override fun iamActionDefinition(iamActionDefinition: IResolvable) {
        cdkBuilder.iamActionDefinition(iamActionDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
       * details.
       */
      override fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty) {
        cdkBuilder.iamActionDefinition(iamActionDefinition.let(IamActionDefinitionProperty::unwrap))
      }

      /**
       * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
       * details.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c52ca7820a6fe284fd0ea3d9afc93f16bddfe032234b3317f714efc21f60583a")
      override
          fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty.Builder.() -> Unit):
          Unit = iamActionDefinition(IamActionDefinitionProperty(iamActionDefinition))

      /**
       * @param scpActionDefinition The service control policies (SCP) action definition details.
       */
      override fun scpActionDefinition(scpActionDefinition: IResolvable) {
        cdkBuilder.scpActionDefinition(scpActionDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param scpActionDefinition The service control policies (SCP) action definition details.
       */
      override fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty) {
        cdkBuilder.scpActionDefinition(scpActionDefinition.let(ScpActionDefinitionProperty::unwrap))
      }

      /**
       * @param scpActionDefinition The service control policies (SCP) action definition details.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9ff7d807d0531c6d4fa23ee7b3b44b9d6dc0cdd12a9c3129aa626e806c7876a")
      override
          fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty.Builder.() -> Unit):
          Unit = scpActionDefinition(ScpActionDefinitionProperty(scpActionDefinition))

      /**
       * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition
       * details.
       */
      override fun ssmActionDefinition(ssmActionDefinition: IResolvable) {
        cdkBuilder.ssmActionDefinition(ssmActionDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition
       * details.
       */
      override fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty) {
        cdkBuilder.ssmActionDefinition(ssmActionDefinition.let(SsmActionDefinitionProperty::unwrap))
      }

      /**
       * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition
       * details.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82fccf1fba528ea2ee3866085585fe779fc0b8a34dc7177e1aa514be8ce3bcc1")
      override
          fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty.Builder.() -> Unit):
          Unit = ssmActionDefinition(SsmActionDefinitionProperty(ssmActionDefinition))

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty,
    ) : DefinitionProperty {
      /**
       * The AWS Identity and Access Management ( IAM ) action definition details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html#cfn-budgets-budgetsaction-definition-iamactiondefinition)
       */
      override fun iamActionDefinition(): Any? = unwrap(this).getIamActionDefinition()

      /**
       * The service control policies (SCP) action definition details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html#cfn-budgets-budgetsaction-definition-scpactiondefinition)
       */
      override fun scpActionDefinition(): Any? = unwrap(this).getScpActionDefinition()

      /**
       * The Amazon EC2 Systems Manager ( SSM ) action definition details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html#cfn-budgets-budgetsaction-definition-ssmactiondefinition)
       */
      override fun ssmActionDefinition(): Any? = unwrap(this).getSsmActionDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty):
          DefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionProperty):
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SubscriberProperty {
    /**
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     *
     * When you create a subscriber, the value of `Address` can't contain line breaks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-subscriber.html#cfn-budgets-budgetsaction-subscriber-address)
     */
    public fun address(): String

    /**
     * The type of notification that AWS sends to a subscriber.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-subscriber.html#cfn-budgets-budgetsaction-subscriber-type)
     */
    public fun type(): String

    /**
     * A builder for [SubscriberProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The address that AWS sends budget notifications to, either an SNS topic or
       * an email. 
       * When you create a subscriber, the value of `Address` can't contain line breaks.
       */
      public fun address(address: String)

      /**
       * @param type The type of notification that AWS sends to a subscriber. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty.builder()

      /**
       * @param address The address that AWS sends budget notifications to, either an SNS topic or
       * an email. 
       * When you create a subscriber, the value of `Address` can't contain line breaks.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param type The type of notification that AWS sends to a subscriber. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty,
    ) : SubscriberProperty {
      /**
       * The address that AWS sends budget notifications to, either an SNS topic or an email.
       *
       * When you create a subscriber, the value of `Address` can't contain line breaks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-subscriber.html#cfn-budgets-budgetsaction-subscriber-address)
       */
      override fun address(): String = unwrap(this).getAddress()

      /**
       * The type of notification that AWS sends to a subscriber.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-subscriber.html#cfn-budgets-budgetsaction-subscriber-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty):
          SubscriberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriberProperty):
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IamActionDefinitionProperty {
    /**
     * A list of groups to be attached.
     *
     * There must be at least one group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-groups)
     */
    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the policy to be attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-policyarn)
     */
    public fun policyArn(): String

    /**
     * A list of roles to be attached.
     *
     * There must be at least one role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-roles)
     */
    public fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

    /**
     * A list of users to be attached.
     *
     * There must be at least one user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-users)
     */
    public fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

    /**
     * A builder for [IamActionDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groups A list of groups to be attached.
       * There must be at least one group.
       */
      public fun groups(groups: List<String>)

      /**
       * @param groups A list of groups to be attached.
       * There must be at least one group.
       */
      public fun groups(vararg groups: String)

      /**
       * @param policyArn The Amazon Resource Name (ARN) of the policy to be attached. 
       */
      public fun policyArn(policyArn: String)

      /**
       * @param roles A list of roles to be attached.
       * There must be at least one role.
       */
      public fun roles(roles: List<String>)

      /**
       * @param roles A list of roles to be attached.
       * There must be at least one role.
       */
      public fun roles(vararg roles: String)

      /**
       * @param users A list of users to be attached.
       * There must be at least one user.
       */
      public fun users(users: List<String>)

      /**
       * @param users A list of users to be attached.
       * There must be at least one user.
       */
      public fun users(vararg users: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty.builder()

      /**
       * @param groups A list of groups to be attached.
       * There must be at least one group.
       */
      override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      /**
       * @param groups A list of groups to be attached.
       * There must be at least one group.
       */
      override fun groups(vararg groups: String): Unit = groups(groups.toList())

      /**
       * @param policyArn The Amazon Resource Name (ARN) of the policy to be attached. 
       */
      override fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
      }

      /**
       * @param roles A list of roles to be attached.
       * There must be at least one role.
       */
      override fun roles(roles: List<String>) {
        cdkBuilder.roles(roles)
      }

      /**
       * @param roles A list of roles to be attached.
       * There must be at least one role.
       */
      override fun roles(vararg roles: String): Unit = roles(roles.toList())

      /**
       * @param users A list of users to be attached.
       * There must be at least one user.
       */
      override fun users(users: List<String>) {
        cdkBuilder.users(users)
      }

      /**
       * @param users A list of users to be attached.
       * There must be at least one user.
       */
      override fun users(vararg users: String): Unit = users(users.toList())

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty,
    ) : IamActionDefinitionProperty {
      /**
       * A list of groups to be attached.
       *
       * There must be at least one group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-groups)
       */
      override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      /**
       * The Amazon Resource Name (ARN) of the policy to be attached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-policyarn)
       */
      override fun policyArn(): String = unwrap(this).getPolicyArn()

      /**
       * A list of roles to be attached.
       *
       * There must be at least one role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-roles)
       */
      override fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

      /**
       * A list of users to be attached.
       *
       * There must be at least one user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html#cfn-budgets-budgetsaction-iamactiondefinition-users)
       */
      override fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IamActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty):
          IamActionDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamActionDefinitionProperty):
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScpActionDefinitionProperty {
    /**
     * The policy ID attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-scpactiondefinition.html#cfn-budgets-budgetsaction-scpactiondefinition-policyid)
     */
    public fun policyId(): String

    /**
     * A list of target IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-scpactiondefinition.html#cfn-budgets-budgetsaction-scpactiondefinition-targetids)
     */
    public fun targetIds(): List<String>

    /**
     * A builder for [ScpActionDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policyId The policy ID attached. 
       */
      public fun policyId(policyId: String)

      /**
       * @param targetIds A list of target IDs. 
       */
      public fun targetIds(targetIds: List<String>)

      /**
       * @param targetIds A list of target IDs. 
       */
      public fun targetIds(vararg targetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty.builder()

      /**
       * @param policyId The policy ID attached. 
       */
      override fun policyId(policyId: String) {
        cdkBuilder.policyId(policyId)
      }

      /**
       * @param targetIds A list of target IDs. 
       */
      override fun targetIds(targetIds: List<String>) {
        cdkBuilder.targetIds(targetIds)
      }

      /**
       * @param targetIds A list of target IDs. 
       */
      override fun targetIds(vararg targetIds: String): Unit = targetIds(targetIds.toList())

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty,
    ) : ScpActionDefinitionProperty {
      /**
       * The policy ID attached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-scpactiondefinition.html#cfn-budgets-budgetsaction-scpactiondefinition-policyid)
       */
      override fun policyId(): String = unwrap(this).getPolicyId()

      /**
       * A list of target IDs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-scpactiondefinition.html#cfn-budgets-budgetsaction-scpactiondefinition-targetids)
       */
      override fun targetIds(): List<String> = unwrap(this).getTargetIds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScpActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty):
          ScpActionDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScpActionDefinitionProperty):
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
