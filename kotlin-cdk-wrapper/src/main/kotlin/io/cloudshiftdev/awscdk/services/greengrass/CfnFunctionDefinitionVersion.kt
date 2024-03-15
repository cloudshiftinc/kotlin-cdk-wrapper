@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunctionDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

  public open fun defaultConfig(`value`: IResolvable) {
    unwrap(this).setDefaultConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultConfig(`value`: DefaultConfigProperty) {
    unwrap(this).setDefaultConfig(`value`.let(DefaultConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("78dcce2d9060f612ef47e9dad8c41f8af04c482e01979ccc46fc7f459c08d9bc")
  public open fun defaultConfig(`value`: DefaultConfigProperty.Builder.() -> Unit): Unit =
      defaultConfig(DefaultConfigProperty(`value`))

  public open fun functionDefinitionId(): String = unwrap(this).getFunctionDefinitionId()

  public open fun functionDefinitionId(`value`: String) {
    unwrap(this).setFunctionDefinitionId(`value`)
  }

  public open fun functions(): Any = unwrap(this).getFunctions()

  public open fun functions(`value`: IResolvable) {
    unwrap(this).setFunctions(`value`.let(IResolvable::unwrap))
  }

  public open fun functions(__idx_ac66f0: List<Any>) {
    unwrap(this).setFunctions(__idx_ac66f0)
  }

  public open fun functions(vararg __idx_ac66f0: Any): Unit = functions(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun defaultConfig(defaultConfig: IResolvable)

    public fun defaultConfig(defaultConfig: DefaultConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82019ff910152f47747b71a66a37a07586105750ffcaeb88e0d746a78cec0f6")
    public fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit)

    public fun functionDefinitionId(functionDefinitionId: String)

    public fun functions(functions: IResolvable)

    public fun functions(functions: List<Any>)

    public fun functions(vararg functions: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.Builder.create(scope,
        id)

    override fun defaultConfig(defaultConfig: IResolvable) {
      cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
    }

    override fun defaultConfig(defaultConfig: DefaultConfigProperty) {
      cdkBuilder.defaultConfig(defaultConfig.let(DefaultConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82019ff910152f47747b71a66a37a07586105750ffcaeb88e0d746a78cec0f6")
    override fun defaultConfig(defaultConfig: DefaultConfigProperty.Builder.() -> Unit): Unit =
        defaultConfig(DefaultConfigProperty(defaultConfig))

    override fun functionDefinitionId(functionDefinitionId: String) {
      cdkBuilder.functionDefinitionId(functionDefinitionId)
    }

    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    override fun functions(functions: List<Any>) {
      cdkBuilder.functions(functions)
    }

    override fun functions(vararg functions: Any): Unit = functions(functions.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunctionDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunctionDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion):
        CfnFunctionDefinitionVersion = CfnFunctionDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion = wrapped.cdkObject
  }

  public interface ExecutionProperty {
    public fun isolationMode(): String? = unwrap(this).getIsolationMode()

    public fun runAs(): Any? = unwrap(this).getRunAs()

    @CdkDslMarker
    public interface Builder {
      public fun isolationMode(isolationMode: String)

      public fun runAs(runAs: IResolvable)

      public fun runAs(runAs: RunAsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05d229ae33ce9ef95d2388945e8e2b7fffebb1afeb93441d166cee3fb750a64")
      public fun runAs(runAs: RunAsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty.builder()

      override fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
      }

      override fun runAs(runAs: IResolvable) {
        cdkBuilder.runAs(runAs.let(IResolvable::unwrap))
      }

      override fun runAs(runAs: RunAsProperty) {
        cdkBuilder.runAs(runAs.let(RunAsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05d229ae33ce9ef95d2388945e8e2b7fffebb1afeb93441d166cee3fb750a64")
      override fun runAs(runAs: RunAsProperty.Builder.() -> Unit): Unit =
          runAs(RunAsProperty(runAs))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty,
    ) : CdkObject(cdkObject), ExecutionProperty {
      override fun isolationMode(): String? = unwrap(this).getIsolationMode()

      override fun runAs(): Any? = unwrap(this).getRunAs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty):
          ExecutionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
    }
  }

  public interface ResourceAccessPolicyProperty {
    public fun permission(): String? = unwrap(this).getPermission()

    public fun resourceId(): String

    @CdkDslMarker
    public interface Builder {
      public fun permission(permission: String)

      public fun resourceId(resourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.builder()

      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty,
    ) : CdkObject(cdkObject), ResourceAccessPolicyProperty {
      override fun permission(): String? = unwrap(this).getPermission()

      override fun resourceId(): String = unwrap(this).getResourceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceAccessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty):
          ResourceAccessPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceAccessPolicyProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty
    }
  }

  public interface DefaultConfigProperty {
    public fun execution(): Any

    @CdkDslMarker
    public interface Builder {
      public fun execution(execution: IResolvable)

      public fun execution(execution: ExecutionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab209a2e03d21862e10902f454c3fb314447a1fbf2f24169b400dcf856b22465")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty.builder()

      override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable::unwrap))
      }

      override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab209a2e03d21862e10902f454c3fb314447a1fbf2f24169b400dcf856b22465")
      override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty,
    ) : CdkObject(cdkObject), DefaultConfigProperty {
      override fun execution(): Any = unwrap(this).getExecution()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty):
          DefaultConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultConfigProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty
    }
  }

  public interface RunAsProperty {
    public fun gid(): Number? = unwrap(this).getGid()

    public fun uid(): Number? = unwrap(this).getUid()

    @CdkDslMarker
    public interface Builder {
      public fun gid(gid: Number)

      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty.builder()

      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty,
    ) : CdkObject(cdkObject), RunAsProperty {
      override fun gid(): Number? = unwrap(this).getGid()

      override fun uid(): Number? = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunAsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty):
          RunAsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunAsProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty
    }
  }

  public interface FunctionProperty {
    public fun functionArn(): String

    public fun functionConfiguration(): Any

    public fun id(): String

    @CdkDslMarker
    public interface Builder {
      public fun functionArn(functionArn: String)

      public fun functionConfiguration(functionConfiguration: IResolvable)

      public fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c2168400448b4a6908898625dbcd08ebc3550cb295a3a9a6f56aea1149fdbce")
      public
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty.Builder.() -> Unit)

      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty.builder()

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      override fun functionConfiguration(functionConfiguration: IResolvable) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(IResolvable::unwrap))
      }

      override fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty) {
        cdkBuilder.functionConfiguration(functionConfiguration.let(FunctionConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c2168400448b4a6908898625dbcd08ebc3550cb295a3a9a6f56aea1149fdbce")
      override
          fun functionConfiguration(functionConfiguration: FunctionConfigurationProperty.Builder.() -> Unit):
          Unit = functionConfiguration(FunctionConfigurationProperty(functionConfiguration))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty,
    ) : CdkObject(cdkObject), FunctionProperty {
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      override fun functionConfiguration(): Any = unwrap(this).getFunctionConfiguration()

      override fun id(): String = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty):
          FunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun encodingType(encodingType: String)

      public fun environment(environment: IResolvable)

      public fun environment(environment: EnvironmentProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7c32354bfdcfec201e24ffa9b00ad1629815013bfd4d0cf2281a5048400a998")
      public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

      public fun execArgs(execArgs: String)

      public fun executable(executable: String)

      public fun memorySize(memorySize: Number)

      public fun pinned(pinned: Boolean)

      public fun pinned(pinned: IResolvable)

      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty.builder()

      override fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
      }

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: EnvironmentProperty) {
        cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7c32354bfdcfec201e24ffa9b00ad1629815013bfd4d0cf2281a5048400a998")
      override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
          environment(EnvironmentProperty(environment))

      override fun execArgs(execArgs: String) {
        cdkBuilder.execArgs(execArgs)
      }

      override fun executable(executable: String) {
        cdkBuilder.executable(executable)
      }

      override fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
      }

      override fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
      }

      override fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned.let(IResolvable::unwrap))
      }

      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty,
    ) : CdkObject(cdkObject), FunctionConfigurationProperty {
      override fun encodingType(): String? = unwrap(this).getEncodingType()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun execArgs(): String? = unwrap(this).getExecArgs()

      override fun executable(): String? = unwrap(this).getExecutable()

      override fun memorySize(): Number? = unwrap(this).getMemorySize()

      override fun pinned(): Any? = unwrap(this).getPinned()

      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty):
          FunctionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionConfigurationProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty
    }
  }

  public interface EnvironmentProperty {
    public fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

    public fun execution(): Any? = unwrap(this).getExecution()

    public fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

    public fun variables(): Any? = unwrap(this).getVariables()

    @CdkDslMarker
    public interface Builder {
      public fun accessSysfs(accessSysfs: Boolean)

      public fun accessSysfs(accessSysfs: IResolvable)

      public fun execution(execution: IResolvable)

      public fun execution(execution: ExecutionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eb0289413331ee1a13511f29f86627b3364b0c1f246a611a4480965fbae462")
      public fun execution(execution: ExecutionProperty.Builder.() -> Unit)

      public fun resourceAccessPolicies(resourceAccessPolicies: IResolvable)

      public fun resourceAccessPolicies(resourceAccessPolicies: List<Any>)

      public fun resourceAccessPolicies(vararg resourceAccessPolicies: Any)

      public fun variables(variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty.builder()

      override fun accessSysfs(accessSysfs: Boolean) {
        cdkBuilder.accessSysfs(accessSysfs)
      }

      override fun accessSysfs(accessSysfs: IResolvable) {
        cdkBuilder.accessSysfs(accessSysfs.let(IResolvable::unwrap))
      }

      override fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution.let(IResolvable::unwrap))
      }

      override fun execution(execution: ExecutionProperty) {
        cdkBuilder.execution(execution.let(ExecutionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5eb0289413331ee1a13511f29f86627b3364b0c1f246a611a4480965fbae462")
      override fun execution(execution: ExecutionProperty.Builder.() -> Unit): Unit =
          execution(ExecutionProperty(execution))

      override fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies.let(IResolvable::unwrap))
      }

      override fun resourceAccessPolicies(resourceAccessPolicies: List<Any>) {
        cdkBuilder.resourceAccessPolicies(resourceAccessPolicies)
      }

      override fun resourceAccessPolicies(vararg resourceAccessPolicies: Any): Unit =
          resourceAccessPolicies(resourceAccessPolicies.toList())

      override fun variables(variables: Any) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty,
    ) : CdkObject(cdkObject), EnvironmentProperty {
      override fun accessSysfs(): Any? = unwrap(this).getAccessSysfs()

      override fun execution(): Any? = unwrap(this).getExecution()

      override fun resourceAccessPolicies(): Any? = unwrap(this).getResourceAccessPolicies()

      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty):
          EnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.EnvironmentProperty
    }
  }
}
