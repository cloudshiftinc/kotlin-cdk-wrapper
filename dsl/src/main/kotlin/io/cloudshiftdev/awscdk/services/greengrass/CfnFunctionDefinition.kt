package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnFunctionDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: FunctionDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(FunctionDefinitionVersionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("beb5b3aa701a5afe064aec11a41e272bd9efe589ab90b6c3bc13195d44b2bfa2")
  public open fun initialVersion(`value`: FunctionDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(FunctionDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable) {
    }

    public fun initialVersion(initialVersion: FunctionDefinitionVersionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ee5dff470757cc407ff4b9413c987d9546c3773f3711023827474554734ec3")
    public
        fun initialVersion(initialVersion: FunctionDefinitionVersionProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.Builder
        = software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.Builder.create(scope, id)

    public override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    public override fun initialVersion(initialVersion: FunctionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(FunctionDefinitionVersionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ee5dff470757cc407ff4b9413c987d9546c3773f3711023827474554734ec3")
    public override
        fun initialVersion(initialVersion: FunctionDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(FunctionDefinitionVersionProperty(initialVersion))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunctionDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunctionDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition):
        CfnFunctionDefinition = CfnFunctionDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinition):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinition = wrapped.cdkObject
  }

  public interface RunAsProperty {
    public fun gid(): Number? = unwrap(this).getGid()

    public fun uid(): Number? = unwrap(this).getUid()

    public interface Builder {
      public fun gid(gid: Number) {
      }

      public fun uid(uid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty.builder()

      public override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      public override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty,
    ) : RunAsProperty {
      public override fun gid(): Number? = unwrap(this).getGid()

      public override fun uid(): Number? = unwrap(this).getUid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunAsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty):
          RunAsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunAsProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EnvironmentProperty {
    public fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

    public fun execution(): Any? = unwrap(this).getExecution()

    public fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

    public fun variables(): Any? = unwrap(this).getVariables()

    public interface Builder {
      public fun accessSysfs(accessSysfs: Boolean) {
      }

      public fun accessSysfs(accessSysfs: IResolvable) {
      }

      public fun execution(execution: IResolvable) {
      }

      public fun execution(execution: ExecutionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("672960fd906b1abcf1b7d98c45f3d0decd0fe6799e1f8677c19d7f1cabaa5865")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit) {
      }

      public fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
      }

      public fun resourceAccessPolicies(resourceAccessPolicies: List<Any>) {
      }

      public fun variables(variables: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty.builder()

      public override fun accessSysfs(accessSysfs: Boolean) {
        cdkBuilder.accessSysfs(accessSysfs)
      }

      public override fun accessSysfs(accessSysfs: IResolvable) {
        cdkBuilder.accessSysfs(accessSysfs.let(IResolvable::unwrap))
      }

      public override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable::unwrap))
      }

      public override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("672960fd906b1abcf1b7d98c45f3d0decd0fe6799e1f8677c19d7f1cabaa5865")
      public override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      public override fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies.let(IResolvable::unwrap))
      }

      public override fun resourceAccessPolicies(resourceAccessPolicies: List<Any>) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies)
      }

      public override fun variables(variables: Any) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty,
    ) : EnvironmentProperty {
      public override fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

      public override fun execution(): Any? = unwrap(this).getExecution()

      public override fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

      public override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty):
          EnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FunctionDefinitionVersionProperty {
    public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    public fun functions(): Any

    public interface Builder {
      public fun defaultConfig(defaultConfig: IResolvable) {
      }

      public fun defaultConfig(defaultConfig: DefaultConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640e413cb0991a190f5d0c30f659f1b13592efa61decd9a9413f22a1fb8fa8b3")
      public fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit) {
      }

      public fun functions(functions: IResolvable) {
      }

      public fun functions(functions: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty.builder()

      public override fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
      }

      public override fun defaultConfig(defaultConfig: DefaultConfigProperty) {
        cdkBuilder.defaultConfig(defaultConfig.let(DefaultConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("640e413cb0991a190f5d0c30f659f1b13592efa61decd9a9413f22a1fb8fa8b3")
      public override fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit):
          Unit = defaultConfig(DefaultConfigProperty(defaultConfig))

      public override fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions.let(IResolvable::unwrap))
      }

      public override fun functions(functions: List<Any>) {
        cdkBuilder.functions(functions)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty,
    ) : FunctionDefinitionVersionProperty {
      public override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

      public override fun functions(): Any = unwrap(this).getFunctions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FunctionDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty):
          FunctionDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionDefinitionVersionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultConfigProperty {
    public fun execution(): Any

    public interface Builder {
      public fun execution(execution: IResolvable) {
      }

      public fun execution(execution: ExecutionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0d7aa90f70b632c2ce686a06d0bda529e91590bcb1e14a2a20e7a4bfbb03b39")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty.builder()

      public override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable::unwrap))
      }

      public override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0d7aa90f70b632c2ce686a06d0bda529e91590bcb1e14a2a20e7a4bfbb03b39")
      public override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty,
    ) : DefaultConfigProperty {
      public override fun execution(): Any = unwrap(this).getExecution()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty):
          DefaultConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultConfigProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceAccessPolicyProperty {
    public fun permission(): String? = unwrap(this).getPermission()

    public fun resourceId(): String

    public interface Builder {
      public fun permission(permission: String) {
      }

      public fun resourceId(resourceId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty.builder()

      public override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty,
    ) : ResourceAccessPolicyProperty {
      public override fun permission(): String? = unwrap(this).getPermission()

      public override fun resourceId(): String = unwrap(this).getResourceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceAccessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty):
          ResourceAccessPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceAccessPolicyProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ResourceAccessPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FunctionConfigurationProperty {
    public fun encodingType(): String? = unwrap(this).getEncodingType()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun execArgs(): String? = unwrap(this).getExecArgs()

    public fun executable(): String? = unwrap(this).getExecutable()

    public fun memorySize(): Number? = unwrap(this).getMemorySize()

    public fun pinned(): Any? = unwrap(this).getPinned()

    public fun timeout(): Number? = unwrap(this).getTimeout()

    public interface Builder {
      public fun encodingType(encodingType: String) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: EnvironmentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("624cecd4ba9144d0fd5fd38efd0d37c8f49797e7c6d4ed99b2080ca22ad31f25")
      public fun environment(environment: EnvironmentProperty.Builder.() -> Unit) {
      }

      public fun execArgs(execArgs: String) {
      }

      public fun executable(executable: String) {
      }

      public fun memorySize(memorySize: Number) {
      }

      public fun pinned(pinned: Boolean) {
      }

      public fun pinned(pinned: IResolvable) {
      }

      public fun timeout(timeout: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty.builder()

      public override fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: EnvironmentProperty) {
        cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("624cecd4ba9144d0fd5fd38efd0d37c8f49797e7c6d4ed99b2080ca22ad31f25")
      public override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
          environment(EnvironmentProperty(environment))

      public override fun execArgs(execArgs: String) {
        cdkBuilder.execArgs(execArgs)
      }

      public override fun executable(executable: String) {
        cdkBuilder.executable(executable)
      }

      public override fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
      }

      public override fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
      }

      public override fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned.let(IResolvable::unwrap))
      }

      public override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty,
    ) : FunctionConfigurationProperty {
      public override fun encodingType(): String? = unwrap(this).getEncodingType()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun execArgs(): String? = unwrap(this).getExecArgs()

      public override fun executable(): String? = unwrap(this).getExecutable()

      public override fun memorySize(): Number? = unwrap(this).getMemorySize()

      public override fun pinned(): Any? = unwrap(this).getPinned()

      public override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty):
          FunctionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionConfigurationProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FunctionProperty {
    public fun functionArn(): String

    public fun functionConfiguration(): Any

    public fun id(): String

    public interface Builder {
      public fun functionArn(functionArn: String) {
      }

      public fun functionConfiguration(functionConfiguration: IResolvable) {
      }

      public fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b908b091068977fd0b73643160004688a7b1cd1cedeeea3833f6c37f40c63")
      public
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun id(id: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty.builder()

      public override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public override fun functionConfiguration(functionConfiguration: IResolvable) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(FunctionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b908b091068977fd0b73643160004688a7b1cd1cedeeea3833f6c37f40c63")
      public override
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty.Builder.() -> Unit):
          Unit = functionConfiguration(FunctionConfigurationProperty(functionConfiguration))

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty,
    ) : FunctionProperty {
      public override fun functionArn(): String = unwrap(this).getFunctionArn()

      public override fun functionConfiguration(): Any = unwrap(this).getFunctionConfiguration()

      public override fun id(): String = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty):
          FunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExecutionProperty {
    public fun isolationMode(): String? = unwrap(this).getIsolationMode()

    public fun runAs(): Any? = unwrap(this).getRunAs()

    public interface Builder {
      public fun isolationMode(isolationMode: String) {
      }

      public fun runAs(runAs: IResolvable) {
      }

      public fun runAs(runAs: RunAsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0586c371bdcad0496c02c8d58830c4dfdc86614590e0f6bc6161a132d5dcf809")
      public fun runAs(runAs: RunAsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty.builder()

      public override fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
      }

      public override fun runAs(runAs: IResolvable) {
        cdkBuilder.runAs(runAs.let(IResolvable::unwrap))
      }

      public override fun runAs(runAs: RunAsProperty) {
        cdkBuilder.runAs(runAs.let(RunAsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0586c371bdcad0496c02c8d58830c4dfdc86614590e0f6bc6161a132d5dcf809")
      public override fun runAs(runAs: RunAsProperty.Builder.() -> Unit): Unit =
          runAs(RunAsProperty(runAs))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty,
    ) : ExecutionProperty {
      public override fun isolationMode(): String? = unwrap(this).getIsolationMode()

      public override fun runAs(): Any? = unwrap(this).getRunAs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty):
          ExecutionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
