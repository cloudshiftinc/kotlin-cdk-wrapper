package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
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
  public open fun actionThreshold(): Any = unwrap(this).getActionThreshold()

  public open fun actionThreshold(`value`: IResolvable) {
    unwrap(this).setActionThreshold(`value`.let(IResolvable::unwrap))
  }

  public open fun actionThreshold(`value`: ActionThresholdProperty) {
    unwrap(this).setActionThreshold(`value`.let(ActionThresholdProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c090ddaa4dab5516201740f46982ed7d2317298232d9ea7ff8864f11f0cc42f")
  public open fun actionThreshold(`value`: ActionThresholdProperty.Builder.() -> Unit): Unit =
      actionThreshold(ActionThresholdProperty(`value`))

  public open fun actionType(): String = unwrap(this).getActionType()

  public open fun actionType(`value`: String) {
    unwrap(this).setActionType(`value`)
  }

  public open fun approvalModel(): String? = unwrap(this).getApprovalModel()

  public open fun approvalModel(`value`: String) {
    unwrap(this).setApprovalModel(`value`)
  }

  public open fun attrActionId(): String = unwrap(this).getAttrActionId()

  public open fun budgetName(): String = unwrap(this).getBudgetName()

  public open fun budgetName(`value`: String) {
    unwrap(this).setBudgetName(`value`)
  }

  public open fun definition(): Any = unwrap(this).getDefinition()

  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun definition(`value`: DefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(DefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76c1f2c93ba1eef6943d7056edfeb981ebcbc1517133bb81d2156801a81245bf")
  public open fun definition(`value`: DefinitionProperty.Builder.() -> Unit): Unit =
      definition(DefinitionProperty(`value`))

  public open fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notificationType(): String = unwrap(this).getNotificationType()

  public open fun notificationType(`value`: String) {
    unwrap(this).setNotificationType(`value`)
  }

  public open fun subscribers(): Any = unwrap(this).getSubscribers()

  public open fun subscribers(`value`: IResolvable) {
    unwrap(this).setSubscribers(`value`.let(IResolvable::unwrap))
  }

  public open fun subscribers(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscribers(__idx_ac66f0)
  }

  public interface Builder {
    public fun actionThreshold(actionThreshold: IResolvable) {
    }

    public fun actionThreshold(actionThreshold: ActionThresholdProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d431faf93eadd4eb9e269a6ee1f104fce786914616d64023a9442ca2f259e5a8")
    public fun actionThreshold(actionThreshold: ActionThresholdProperty.Builder.() -> Unit) {
    }

    public fun actionType(actionType: String) {
    }

    public fun approvalModel(approvalModel: String) {
    }

    public fun budgetName(budgetName: String) {
    }

    public fun definition(definition: IResolvable) {
    }

    public fun definition(definition: DefinitionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1823ac6b0807d50de040e9648221813ce97cd1481fa360eb133bac1b036cc24")
    public fun definition(definition: DefinitionProperty.Builder.() -> Unit) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun notificationType(notificationType: String) {
    }

    public fun subscribers(subscribers: IResolvable) {
    }

    public fun subscribers(subscribers: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudgetsAction.Builder =
        software.amazon.awscdk.services.budgets.CfnBudgetsAction.Builder.create(scope, id)

    public override fun actionThreshold(actionThreshold: IResolvable) {
      cdkBuilder.actionThreshold(actionThreshold.let(IResolvable::unwrap))
    }

    public override fun actionThreshold(actionThreshold: ActionThresholdProperty) {
      cdkBuilder.actionThreshold(actionThreshold.let(ActionThresholdProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d431faf93eadd4eb9e269a6ee1f104fce786914616d64023a9442ca2f259e5a8")
    public override
        fun actionThreshold(actionThreshold: ActionThresholdProperty.Builder.() -> Unit): Unit =
        actionThreshold(ActionThresholdProperty(actionThreshold))

    public override fun actionType(actionType: String) {
      cdkBuilder.actionType(actionType)
    }

    public override fun approvalModel(approvalModel: String) {
      cdkBuilder.approvalModel(approvalModel)
    }

    public override fun budgetName(budgetName: String) {
      cdkBuilder.budgetName(budgetName)
    }

    public override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    public override fun definition(definition: DefinitionProperty) {
      cdkBuilder.definition(definition.let(DefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1823ac6b0807d50de040e9648221813ce97cd1481fa360eb133bac1b036cc24")
    public override fun definition(definition: DefinitionProperty.Builder.() -> Unit): Unit =
        definition(DefinitionProperty(definition))

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun notificationType(notificationType: String) {
      cdkBuilder.notificationType(notificationType)
    }

    public override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
    }

    public override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers)
    }

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
    public fun instanceIds(): List<String>

    public fun region(): String

    public fun subtype(): String

    public interface Builder {
      public fun instanceIds(instanceIds: List<String>) {
      }

      public fun region(region: String) {
      }

      public fun subtype(subtype: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SsmActionDefinitionProperty.builder()

      public override fun instanceIds(instanceIds: List<String>) {
        cdkBuilder.instanceIds(instanceIds)
      }

      public override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public override fun subtype(subtype: String) {
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
      public override fun instanceIds(): List<String> = unwrap(this).getInstanceIds() ?: emptyList()

      public override fun region(): String = unwrap(this).getRegion()

      public override fun subtype(): String = unwrap(this).getSubtype()
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
    public fun type(): String

    public fun `value`(): Number

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ActionThresholdProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Number) {
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
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Number = unwrap(this).getValue()
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
    public fun iamActionDefinition(): Any? = unwrap(this).getIamActionDefinition()

    public fun scpActionDefinition(): Any? = unwrap(this).getScpActionDefinition()

    public fun ssmActionDefinition(): Any? = unwrap(this).getSsmActionDefinition()

    public interface Builder {
      public fun iamActionDefinition(iamActionDefinition: IResolvable) {
      }

      public fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c52ca7820a6fe284fd0ea3d9afc93f16bddfe032234b3317f714efc21f60583a")
      public
          fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty.Builder.() -> Unit) {
      }

      public fun scpActionDefinition(scpActionDefinition: IResolvable) {
      }

      public fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9ff7d807d0531c6d4fa23ee7b3b44b9d6dc0cdd12a9c3129aa626e806c7876a")
      public
          fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty.Builder.() -> Unit) {
      }

      public fun ssmActionDefinition(ssmActionDefinition: IResolvable) {
      }

      public fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82fccf1fba528ea2ee3866085585fe779fc0b8a34dc7177e1aa514be8ce3bcc1")
      public
          fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.DefinitionProperty.builder()

      public override fun iamActionDefinition(iamActionDefinition: IResolvable) {
        cdkBuilder.iamActionDefinition(iamActionDefinition.let(IResolvable::unwrap))
      }

      public override fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty) {
        cdkBuilder.iamActionDefinition(iamActionDefinition.let(IamActionDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c52ca7820a6fe284fd0ea3d9afc93f16bddfe032234b3317f714efc21f60583a")
      public override
          fun iamActionDefinition(iamActionDefinition: IamActionDefinitionProperty.Builder.() -> Unit):
          Unit = iamActionDefinition(IamActionDefinitionProperty(iamActionDefinition))

      public override fun scpActionDefinition(scpActionDefinition: IResolvable) {
        cdkBuilder.scpActionDefinition(scpActionDefinition.let(IResolvable::unwrap))
      }

      public override fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty) {
        cdkBuilder.scpActionDefinition(scpActionDefinition.let(ScpActionDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9ff7d807d0531c6d4fa23ee7b3b44b9d6dc0cdd12a9c3129aa626e806c7876a")
      public override
          fun scpActionDefinition(scpActionDefinition: ScpActionDefinitionProperty.Builder.() -> Unit):
          Unit = scpActionDefinition(ScpActionDefinitionProperty(scpActionDefinition))

      public override fun ssmActionDefinition(ssmActionDefinition: IResolvable) {
        cdkBuilder.ssmActionDefinition(ssmActionDefinition.let(IResolvable::unwrap))
      }

      public override fun ssmActionDefinition(ssmActionDefinition: SsmActionDefinitionProperty) {
        cdkBuilder.ssmActionDefinition(ssmActionDefinition.let(SsmActionDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82fccf1fba528ea2ee3866085585fe779fc0b8a34dc7177e1aa514be8ce3bcc1")
      public override
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
      public override fun iamActionDefinition(): Any? = unwrap(this).getIamActionDefinition()

      public override fun scpActionDefinition(): Any? = unwrap(this).getScpActionDefinition()

      public override fun ssmActionDefinition(): Any? = unwrap(this).getSsmActionDefinition()
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
    public fun address(): String

    public fun type(): String

    public interface Builder {
      public fun address(address: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun type(type: String) {
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
      public override fun address(): String = unwrap(this).getAddress()

      public override fun type(): String = unwrap(this).getType()
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
    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    public fun policyArn(): String

    public fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

    public fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

    public interface Builder {
      public fun groups(groups: List<String>) {
      }

      public fun policyArn(policyArn: String) {
      }

      public fun roles(roles: List<String>) {
      }

      public fun users(users: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty.builder()

      public override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      public override fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
      }

      public override fun roles(roles: List<String>) {
        cdkBuilder.roles(roles)
      }

      public override fun users(users: List<String>) {
        cdkBuilder.users(users)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.IamActionDefinitionProperty,
    ) : IamActionDefinitionProperty {
      public override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      public override fun policyArn(): String = unwrap(this).getPolicyArn()

      public override fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

      public override fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()
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
    public fun policyId(): String

    public fun targetIds(): List<String>

    public interface Builder {
      public fun policyId(policyId: String) {
      }

      public fun targetIds(targetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty.builder()

      public override fun policyId(policyId: String) {
        cdkBuilder.policyId(policyId)
      }

      public override fun targetIds(targetIds: List<String>) {
        cdkBuilder.targetIds(targetIds)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.budgets.CfnBudgetsAction.ScpActionDefinitionProperty,
    ) : ScpActionDefinitionProperty {
      public override fun policyId(): String = unwrap(this).getPolicyId()

      public override fun targetIds(): List<String> = unwrap(this).getTargetIds() ?: emptyList()
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
