package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnRemediationConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun automatic(): Any? = unwrap(this).getAutomatic()

  public open fun automatic(`value`: Boolean) {
    unwrap(this).setAutomatic(`value`)
  }

  public open fun automatic(`value`: IResolvable) {
    unwrap(this).setAutomatic(`value`.let(IResolvable::unwrap))
  }

  public open fun configRuleName(): String = unwrap(this).getConfigRuleName()

  public open fun configRuleName(`value`: String) {
    unwrap(this).setConfigRuleName(`value`)
  }

  public open fun executionControls(): Any? = unwrap(this).getExecutionControls()

  public open fun executionControls(`value`: IResolvable) {
    unwrap(this).setExecutionControls(`value`.let(IResolvable::unwrap))
  }

  public open fun executionControls(`value`: ExecutionControlsProperty) {
    unwrap(this).setExecutionControls(`value`.let(ExecutionControlsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b16899e776e943e7366d05ee8e1a8f09b2a85804caad30354c16b882731fe0")
  public open fun executionControls(`value`: ExecutionControlsProperty.Builder.() -> Unit): Unit =
      executionControls(ExecutionControlsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maximumAutomaticAttempts(): Number? = unwrap(this).getMaximumAutomaticAttempts()

  public open fun maximumAutomaticAttempts(`value`: Number) {
    unwrap(this).setMaximumAutomaticAttempts(`value`)
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  public open fun resourceType(): String? = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public open fun retryAttemptSeconds(): Number? = unwrap(this).getRetryAttemptSeconds()

  public open fun retryAttemptSeconds(`value`: Number) {
    unwrap(this).setRetryAttemptSeconds(`value`)
  }

  public open fun targetId(): String = unwrap(this).getTargetId()

  public open fun targetId(`value`: String) {
    unwrap(this).setTargetId(`value`)
  }

  public open fun targetType(): String = unwrap(this).getTargetType()

  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  public open fun targetVersion(): String? = unwrap(this).getTargetVersion()

  public open fun targetVersion(`value`: String) {
    unwrap(this).setTargetVersion(`value`)
  }

  public interface Builder {
    public fun automatic(automatic: Boolean)

    public fun automatic(automatic: IResolvable)

    public fun configRuleName(configRuleName: String)

    public fun executionControls(executionControls: IResolvable)

    public fun executionControls(executionControls: ExecutionControlsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3a45ce517b58c86588a47a50ae3f6fff75472adb1a9bb29cbe4bd2da29274f")
    public fun executionControls(executionControls: ExecutionControlsProperty.Builder.() -> Unit)

    public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number)

    public fun parameters(parameters: Any)

    public fun resourceType(resourceType: String)

    public fun retryAttemptSeconds(retryAttemptSeconds: Number)

    public fun targetId(targetId: String)

    public fun targetType(targetType: String)

    public fun targetVersion(targetVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnRemediationConfiguration.Builder =
        software.amazon.awscdk.services.config.CfnRemediationConfiguration.Builder.create(scope, id)

    override fun automatic(automatic: Boolean) {
      cdkBuilder.automatic(automatic)
    }

    override fun automatic(automatic: IResolvable) {
      cdkBuilder.automatic(automatic.let(IResolvable::unwrap))
    }

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun executionControls(executionControls: IResolvable) {
      cdkBuilder.executionControls(executionControls.let(IResolvable::unwrap))
    }

    override fun executionControls(executionControls: ExecutionControlsProperty) {
      cdkBuilder.executionControls(executionControls.let(ExecutionControlsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3a45ce517b58c86588a47a50ae3f6fff75472adb1a9bb29cbe4bd2da29274f")
    override fun executionControls(executionControls: ExecutionControlsProperty.Builder.() -> Unit):
        Unit = executionControls(ExecutionControlsProperty(executionControls))

    override fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
      cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun retryAttemptSeconds(retryAttemptSeconds: Number) {
      cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
    }

    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    override fun targetVersion(targetVersion: String) {
      cdkBuilder.targetVersion(targetVersion)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnRemediationConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRemediationConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRemediationConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration):
        CfnRemediationConfiguration = CfnRemediationConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnRemediationConfiguration):
        software.amazon.awscdk.services.config.CfnRemediationConfiguration = wrapped.cdkObject
  }

  public interface ResourceValueProperty {
    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty,
    ) : ResourceValueProperty {
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty):
          ResourceValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceValueProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExecutionControlsProperty {
    public fun ssmControls(): Any? = unwrap(this).getSsmControls()

    public interface Builder {
      public fun ssmControls(ssmControls: IResolvable)

      public fun ssmControls(ssmControls: SsmControlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b4b643ffb4f3a16cf00c0244f3bd7a404fc2d41a89b02ab4615003c0613676c")
      public fun ssmControls(ssmControls: SsmControlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty.builder()

      override fun ssmControls(ssmControls: IResolvable) {
        cdkBuilder.ssmControls(ssmControls.let(IResolvable::unwrap))
      }

      override fun ssmControls(ssmControls: SsmControlsProperty) {
        cdkBuilder.ssmControls(ssmControls.let(SsmControlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b4b643ffb4f3a16cf00c0244f3bd7a404fc2d41a89b02ab4615003c0613676c")
      override fun ssmControls(ssmControls: SsmControlsProperty.Builder.() -> Unit): Unit =
          ssmControls(SsmControlsProperty(ssmControls))

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty,
    ) : ExecutionControlsProperty {
      override fun ssmControls(): Any? = unwrap(this).getSsmControls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionControlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty):
          ExecutionControlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionControlsProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SsmControlsProperty {
    public fun concurrentExecutionRatePercentage(): Number? =
        unwrap(this).getConcurrentExecutionRatePercentage()

    public fun errorPercentage(): Number? = unwrap(this).getErrorPercentage()

    public interface Builder {
      public fun concurrentExecutionRatePercentage(concurrentExecutionRatePercentage: Number)

      public fun errorPercentage(errorPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty.builder()

      override fun concurrentExecutionRatePercentage(concurrentExecutionRatePercentage: Number) {
        cdkBuilder.concurrentExecutionRatePercentage(concurrentExecutionRatePercentage)
      }

      override fun errorPercentage(errorPercentage: Number) {
        cdkBuilder.errorPercentage(errorPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty,
    ) : SsmControlsProperty {
      override fun concurrentExecutionRatePercentage(): Number? =
          unwrap(this).getConcurrentExecutionRatePercentage()

      override fun errorPercentage(): Number? = unwrap(this).getErrorPercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SsmControlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty):
          SsmControlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmControlsProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StaticValueProperty {
    public fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun `value`(`value`: List<String>)

      public fun `value`(vararg `value`: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty.builder()

      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty,
    ) : StaticValueProperty {
      override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StaticValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty):
          StaticValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StaticValueProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RemediationParameterValueProperty {
    public fun resourceValue(): Any? = unwrap(this).getResourceValue()

    public fun staticValue(): Any? = unwrap(this).getStaticValue()

    public interface Builder {
      public fun resourceValue(resourceValue: IResolvable)

      public fun resourceValue(resourceValue: ResourceValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1446444839d26f366a9c554c7dad27fe1feaef75c5dbb0601c8b3d433e992f")
      public fun resourceValue(resourceValue: ResourceValueProperty.Builder.() -> Unit)

      public fun staticValue(staticValue: IResolvable)

      public fun staticValue(staticValue: StaticValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f05fed1261a019c0caa131c0722b34f856f69966d834f444b31a673c861ea26")
      public fun staticValue(staticValue: StaticValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty.builder()

      override fun resourceValue(resourceValue: IResolvable) {
        cdkBuilder.resourceValue(resourceValue.let(IResolvable::unwrap))
      }

      override fun resourceValue(resourceValue: ResourceValueProperty) {
        cdkBuilder.resourceValue(resourceValue.let(ResourceValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1446444839d26f366a9c554c7dad27fe1feaef75c5dbb0601c8b3d433e992f")
      override fun resourceValue(resourceValue: ResourceValueProperty.Builder.() -> Unit): Unit =
          resourceValue(ResourceValueProperty(resourceValue))

      override fun staticValue(staticValue: IResolvable) {
        cdkBuilder.staticValue(staticValue.let(IResolvable::unwrap))
      }

      override fun staticValue(staticValue: StaticValueProperty) {
        cdkBuilder.staticValue(staticValue.let(StaticValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f05fed1261a019c0caa131c0722b34f856f69966d834f444b31a673c861ea26")
      override fun staticValue(staticValue: StaticValueProperty.Builder.() -> Unit): Unit =
          staticValue(StaticValueProperty(staticValue))

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty,
    ) : RemediationParameterValueProperty {
      override fun resourceValue(): Any? = unwrap(this).getResourceValue()

      override fun staticValue(): Any? = unwrap(this).getStaticValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RemediationParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty):
          RemediationParameterValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemediationParameterValueProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
