package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStackSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun administrationRoleArn(): String? = unwrap(this).getAdministrationRoleArn()

  public open fun administrationRoleArn(`value`: String) {
    unwrap(this).setAdministrationRoleArn(`value`)
  }

  public open fun attrStackSetId(): String = unwrap(this).getAttrStackSetId()

  public open fun autoDeployment(): Any? = unwrap(this).getAutoDeployment()

  public open fun autoDeployment(`value`: IResolvable) {
    unwrap(this).setAutoDeployment(`value`.let(IResolvable::unwrap))
  }

  public open fun autoDeployment(`value`: AutoDeploymentProperty) {
    unwrap(this).setAutoDeployment(`value`.let(AutoDeploymentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c9e4b53799bcfba36b87422666f272af8db3a9a07150facb79a5b2c835ea1d8")
  public open fun autoDeployment(`value`: AutoDeploymentProperty.Builder.() -> Unit): Unit =
      autoDeployment(AutoDeploymentProperty(`value`))

  public open fun callAs(): String? = unwrap(this).getCallAs()

  public open fun callAs(`value`: String) {
    unwrap(this).setCallAs(`value`)
  }

  public open fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  public open fun capabilities(`value`: List<String>) {
    unwrap(this).setCapabilities(`value`)
  }

  public open fun capabilities(vararg `value`: String): Unit = capabilities(`value`.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

  public open fun executionRoleName(`value`: String) {
    unwrap(this).setExecutionRoleName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun managedExecution(): Any? = unwrap(this).getManagedExecution()

  public open fun managedExecution(`value`: Any) {
    unwrap(this).setManagedExecution(`value`)
  }

  public open fun operationPreferences(): Any? = unwrap(this).getOperationPreferences()

  public open fun operationPreferences(`value`: IResolvable) {
    unwrap(this).setOperationPreferences(`value`.let(IResolvable::unwrap))
  }

  public open fun operationPreferences(`value`: OperationPreferencesProperty) {
    unwrap(this).setOperationPreferences(`value`.let(OperationPreferencesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c565101bb8e49d4a28f5b8838e6f5a925041f6763a5f77f8339dc824132671c8")
  public open fun operationPreferences(`value`: OperationPreferencesProperty.Builder.() -> Unit):
      Unit = operationPreferences(OperationPreferencesProperty(`value`))

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setParameters(__idx_ac66f0)
  }

  public open fun parameters(vararg __idx_ac66f0: Any): Unit = parameters(__idx_ac66f0.toList())

  public open fun permissionModel(): String = unwrap(this).getPermissionModel()

  public open fun permissionModel(`value`: String) {
    unwrap(this).setPermissionModel(`value`)
  }

  public open fun stackInstancesGroup(): Any? = unwrap(this).getStackInstancesGroup()

  public open fun stackInstancesGroup(`value`: IResolvable) {
    unwrap(this).setStackInstancesGroup(`value`.let(IResolvable::unwrap))
  }

  public open fun stackInstancesGroup(__idx_ac66f0: List<Any>) {
    unwrap(this).setStackInstancesGroup(__idx_ac66f0)
  }

  public open fun stackInstancesGroup(vararg __idx_ac66f0: Any): Unit =
      stackInstancesGroup(__idx_ac66f0.toList())

  public open fun stackSetName(): String = unwrap(this).getStackSetName()

  public open fun stackSetName(`value`: String) {
    unwrap(this).setStackSetName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun templateBody(): String? = unwrap(this).getTemplateBody()

  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  public open fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  public open fun templateUrl(`value`: String) {
    unwrap(this).setTemplateUrl(`value`)
  }

  public interface Builder {
    public fun administrationRoleArn(administrationRoleArn: String)

    public fun autoDeployment(autoDeployment: IResolvable)

    public fun autoDeployment(autoDeployment: AutoDeploymentProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ddcdd91c556cae5464a2fe43588409471eb98abea7e0368c8bf5596fe8fce05")
    public fun autoDeployment(autoDeployment: AutoDeploymentProperty.Builder.() -> Unit)

    public fun callAs(callAs: String)

    public fun capabilities(capabilities: List<String>)

    public fun capabilities(vararg capabilities: String)

    public fun description(description: String)

    public fun executionRoleName(executionRoleName: String)

    public fun managedExecution(managedExecution: Any)

    public fun operationPreferences(operationPreferences: IResolvable)

    public fun operationPreferences(operationPreferences: OperationPreferencesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25a0c4e8355fd3caaa0117fc37550dfcf5537f0c4a91376cc20668fd9be8f3d7")
    public
        fun operationPreferences(operationPreferences: OperationPreferencesProperty.Builder.() -> Unit)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: List<Any>)

    public fun parameters(vararg parameters: Any)

    public fun permissionModel(permissionModel: String)

    public fun stackInstancesGroup(stackInstancesGroup: IResolvable)

    public fun stackInstancesGroup(stackInstancesGroup: List<Any>)

    public fun stackInstancesGroup(vararg stackInstancesGroup: Any)

    public fun stackSetName(stackSetName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateBody(templateBody: String)

    public fun templateUrl(templateUrl: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnStackSet.Builder =
        software.amazon.awscdk.services.cloudformation.CfnStackSet.Builder.create(scope, id)

    override fun administrationRoleArn(administrationRoleArn: String) {
      cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    override fun autoDeployment(autoDeployment: IResolvable) {
      cdkBuilder.autoDeployment(autoDeployment.let(IResolvable::unwrap))
    }

    override fun autoDeployment(autoDeployment: AutoDeploymentProperty) {
      cdkBuilder.autoDeployment(autoDeployment.let(AutoDeploymentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ddcdd91c556cae5464a2fe43588409471eb98abea7e0368c8bf5596fe8fce05")
    override fun autoDeployment(autoDeployment: AutoDeploymentProperty.Builder.() -> Unit): Unit =
        autoDeployment(AutoDeploymentProperty(autoDeployment))

    override fun callAs(callAs: String) {
      cdkBuilder.callAs(callAs)
    }

    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    override fun managedExecution(managedExecution: Any) {
      cdkBuilder.managedExecution(managedExecution)
    }

    override fun operationPreferences(operationPreferences: IResolvable) {
      cdkBuilder.operationPreferences(operationPreferences.let(IResolvable::unwrap))
    }

    override fun operationPreferences(operationPreferences: OperationPreferencesProperty) {
      cdkBuilder.operationPreferences(operationPreferences.let(OperationPreferencesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25a0c4e8355fd3caaa0117fc37550dfcf5537f0c4a91376cc20668fd9be8f3d7")
    override
        fun operationPreferences(operationPreferences: OperationPreferencesProperty.Builder.() -> Unit):
        Unit = operationPreferences(OperationPreferencesProperty(operationPreferences))

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    override fun permissionModel(permissionModel: String) {
      cdkBuilder.permissionModel(permissionModel)
    }

    override fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup.let(IResolvable::unwrap))
    }

    override fun stackInstancesGroup(stackInstancesGroup: List<Any>) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup)
    }

    override fun stackInstancesGroup(vararg stackInstancesGroup: Any): Unit =
        stackInstancesGroup(stackInstancesGroup.toList())

    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnStackSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStackSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStackSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet):
        CfnStackSet = CfnStackSet(cdkObject)

    internal fun unwrap(wrapped: CfnStackSet):
        software.amazon.awscdk.services.cloudformation.CfnStackSet = wrapped.cdkObject
  }

  public interface ManagedExecutionProperty {
    public fun active(): Any? = unwrap(this).getActive()

    public interface Builder {
      public fun active(active: Boolean)

      public fun active(active: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ManagedExecutionProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ManagedExecutionProperty.builder()

      override fun active(active: Boolean) {
        cdkBuilder.active(active)
      }

      override fun active(active: IResolvable) {
        cdkBuilder.active(active.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ManagedExecutionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ManagedExecutionProperty,
    ) : ManagedExecutionProperty {
      override fun active(): Any? = unwrap(this).getActive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedExecutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet.ManagedExecutionProperty):
          ManagedExecutionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedExecutionProperty):
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ManagedExecutionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoDeploymentProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun retainStacksOnAccountRemoval(): Any? = unwrap(this).getRetainStacksOnAccountRemoval()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean)

      public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.AutoDeploymentProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnStackSet.AutoDeploymentProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
      }

      override fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnStackSet.AutoDeploymentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.AutoDeploymentProperty,
    ) : AutoDeploymentProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun retainStacksOnAccountRemoval(): Any? =
          unwrap(this).getRetainStacksOnAccountRemoval()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoDeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet.AutoDeploymentProperty):
          AutoDeploymentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoDeploymentProperty):
          software.amazon.awscdk.services.cloudformation.CfnStackSet.AutoDeploymentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentTargetsProperty {
    public fun accountFilterType(): String? = unwrap(this).getAccountFilterType()

    public fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

    public fun accountsUrl(): String? = unwrap(this).getAccountsUrl()

    public fun organizationalUnitIds(): List<String> = unwrap(this).getOrganizationalUnitIds() ?:
        emptyList()

    public interface Builder {
      public fun accountFilterType(accountFilterType: String)

      public fun accounts(accounts: List<String>)

      public fun accounts(vararg accounts: String)

      public fun accountsUrl(accountsUrl: String)

      public fun organizationalUnitIds(organizationalUnitIds: List<String>)

      public fun organizationalUnitIds(vararg organizationalUnitIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty.builder()

      override fun accountFilterType(accountFilterType: String) {
        cdkBuilder.accountFilterType(accountFilterType)
      }

      override fun accounts(accounts: List<String>) {
        cdkBuilder.accounts(accounts)
      }

      override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

      override fun accountsUrl(accountsUrl: String) {
        cdkBuilder.accountsUrl(accountsUrl)
      }

      override fun organizationalUnitIds(organizationalUnitIds: List<String>) {
        cdkBuilder.organizationalUnitIds(organizationalUnitIds)
      }

      override fun organizationalUnitIds(vararg organizationalUnitIds: String): Unit =
          organizationalUnitIds(organizationalUnitIds.toList())

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty,
    ) : DeploymentTargetsProperty {
      override fun accountFilterType(): String? = unwrap(this).getAccountFilterType()

      override fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

      override fun accountsUrl(): String? = unwrap(this).getAccountsUrl()

      override fun organizationalUnitIds(): List<String> = unwrap(this).getOrganizationalUnitIds()
          ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentTargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty):
          DeploymentTargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentTargetsProperty):
          software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParameterProperty {
    public fun parameterKey(): String

    public fun parameterValue(): String

    public interface Builder {
      public fun parameterKey(parameterKey: String)

      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty.Builder =
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty.builder()

      override fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty,
    ) : ParameterProperty {
      override fun parameterKey(): String = unwrap(this).getParameterKey()

      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty):
          ParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OperationPreferencesProperty {
    public fun failureToleranceCount(): Number? = unwrap(this).getFailureToleranceCount()

    public fun failureTolerancePercentage(): Number? = unwrap(this).getFailureTolerancePercentage()

    public fun maxConcurrentCount(): Number? = unwrap(this).getMaxConcurrentCount()

    public fun maxConcurrentPercentage(): Number? = unwrap(this).getMaxConcurrentPercentage()

    public fun regionConcurrencyType(): String? = unwrap(this).getRegionConcurrencyType()

    public fun regionOrder(): List<String> = unwrap(this).getRegionOrder() ?: emptyList()

    public interface Builder {
      public fun failureToleranceCount(failureToleranceCount: Number)

      public fun failureTolerancePercentage(failureTolerancePercentage: Number)

      public fun maxConcurrentCount(maxConcurrentCount: Number)

      public fun maxConcurrentPercentage(maxConcurrentPercentage: Number)

      public fun regionConcurrencyType(regionConcurrencyType: String)

      public fun regionOrder(regionOrder: List<String>)

      public fun regionOrder(vararg regionOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty.builder()

      override fun failureToleranceCount(failureToleranceCount: Number) {
        cdkBuilder.failureToleranceCount(failureToleranceCount)
      }

      override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
        cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
      }

      override fun maxConcurrentCount(maxConcurrentCount: Number) {
        cdkBuilder.maxConcurrentCount(maxConcurrentCount)
      }

      override fun maxConcurrentPercentage(maxConcurrentPercentage: Number) {
        cdkBuilder.maxConcurrentPercentage(maxConcurrentPercentage)
      }

      override fun regionConcurrencyType(regionConcurrencyType: String) {
        cdkBuilder.regionConcurrencyType(regionConcurrencyType)
      }

      override fun regionOrder(regionOrder: List<String>) {
        cdkBuilder.regionOrder(regionOrder)
      }

      override fun regionOrder(vararg regionOrder: String): Unit = regionOrder(regionOrder.toList())

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty,
    ) : OperationPreferencesProperty {
      override fun failureToleranceCount(): Number? = unwrap(this).getFailureToleranceCount()

      override fun failureTolerancePercentage(): Number? =
          unwrap(this).getFailureTolerancePercentage()

      override fun maxConcurrentCount(): Number? = unwrap(this).getMaxConcurrentCount()

      override fun maxConcurrentPercentage(): Number? = unwrap(this).getMaxConcurrentPercentage()

      override fun regionConcurrencyType(): String? = unwrap(this).getRegionConcurrencyType()

      override fun regionOrder(): List<String> = unwrap(this).getRegionOrder() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OperationPreferencesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty):
          OperationPreferencesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OperationPreferencesProperty):
          software.amazon.awscdk.services.cloudformation.CfnStackSet.OperationPreferencesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StackInstancesProperty {
    public fun deploymentTargets(): Any

    public fun parameterOverrides(): Any? = unwrap(this).getParameterOverrides()

    public fun regions(): List<String>

    public interface Builder {
      public fun deploymentTargets(deploymentTargets: IResolvable)

      public fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cc444c9f79623d86dfc01a637257d782317c22159afbb3ce5d8d02f596ad380")
      public fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty.Builder.() -> Unit)

      public fun parameterOverrides(parameterOverrides: IResolvable)

      public fun parameterOverrides(parameterOverrides: List<Any>)

      public fun parameterOverrides(vararg parameterOverrides: Any)

      public fun regions(regions: List<String>)

      public fun regions(vararg regions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty.builder()

      override fun deploymentTargets(deploymentTargets: IResolvable) {
        cdkBuilder.deploymentTargets(deploymentTargets.let(IResolvable::unwrap))
      }

      override fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty) {
        cdkBuilder.deploymentTargets(deploymentTargets.let(DeploymentTargetsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cc444c9f79623d86dfc01a637257d782317c22159afbb3ce5d8d02f596ad380")
      override
          fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty.Builder.() -> Unit):
          Unit = deploymentTargets(DeploymentTargetsProperty(deploymentTargets))

      override fun parameterOverrides(parameterOverrides: IResolvable) {
        cdkBuilder.parameterOverrides(parameterOverrides.let(IResolvable::unwrap))
      }

      override fun parameterOverrides(parameterOverrides: List<Any>) {
        cdkBuilder.parameterOverrides(parameterOverrides)
      }

      override fun parameterOverrides(vararg parameterOverrides: Any): Unit =
          parameterOverrides(parameterOverrides.toList())

      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty,
    ) : StackInstancesProperty {
      override fun deploymentTargets(): Any = unwrap(this).getDeploymentTargets()

      override fun parameterOverrides(): Any? = unwrap(this).getParameterOverrides()

      override fun regions(): List<String> = unwrap(this).getRegions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StackInstancesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty):
          StackInstancesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackInstancesProperty):
          software.amazon.awscdk.services.cloudformation.CfnStackSet.StackInstancesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
