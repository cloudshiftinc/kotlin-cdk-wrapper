package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStep internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnStep,
) : CfnResource(cdkObject), IInspectable {
  public open fun actionOnFailure(): String = unwrap(this).getActionOnFailure()

  public open fun actionOnFailure(`value`: String) {
    unwrap(this).setActionOnFailure(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun hadoopJarStep(): Any = unwrap(this).getHadoopJarStep()

  public open fun hadoopJarStep(`value`: IResolvable) {
    unwrap(this).setHadoopJarStep(`value`.let(IResolvable::unwrap))
  }

  public open fun hadoopJarStep(`value`: HadoopJarStepConfigProperty) {
    unwrap(this).setHadoopJarStep(`value`.let(HadoopJarStepConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d15b8c5ae9322c155e09fd18a3f314e5fb0413672a89ab863cfc45bba04e943")
  public open fun hadoopJarStep(`value`: HadoopJarStepConfigProperty.Builder.() -> Unit): Unit =
      hadoopJarStep(HadoopJarStepConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobFlowId(): String = unwrap(this).getJobFlowId()

  public open fun jobFlowId(`value`: String) {
    unwrap(this).setJobFlowId(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun actionOnFailure(actionOnFailure: String) {
    }

    public fun hadoopJarStep(hadoopJarStep: IResolvable) {
    }

    public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d72595de5e5e291d59e6ffe4185f7b5fae105fab39fe862ae0898e1d644bb0f")
    public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit) {
    }

    public fun jobFlowId(jobFlowId: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStep.Builder =
        software.amazon.awscdk.services.emr.CfnStep.Builder.create(scope, id)

    public override fun actionOnFailure(actionOnFailure: String) {
      cdkBuilder.actionOnFailure(actionOnFailure)
    }

    public override fun hadoopJarStep(hadoopJarStep: IResolvable) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
    }

    public override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(HadoopJarStepConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d72595de5e5e291d59e6ffe4185f7b5fae105fab39fe862ae0898e1d644bb0f")
    public override
        fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit): Unit =
        hadoopJarStep(HadoopJarStepConfigProperty(hadoopJarStep))

    public override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStep = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStep {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep): CfnStep =
        CfnStep(cdkObject)

    internal fun unwrap(wrapped: CfnStep): software.amazon.awscdk.services.emr.CfnStep =
        wrapped.cdkObject
  }

  public interface HadoopJarStepConfigProperty {
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun jar(): String

    public fun mainClass(): String? = unwrap(this).getMainClass()

    public fun stepProperties(): Any? = unwrap(this).getStepProperties()

    public interface Builder {
      public fun args(args: List<String>) {
      }

      public fun jar(jar: String) {
      }

      public fun mainClass(mainClass: String) {
      }

      public fun stepProperties(stepProperties: IResolvable) {
      }

      public fun stepProperties(stepProperties: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.builder()

      public override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      public override fun jar(jar: String) {
        cdkBuilder.jar(jar)
      }

      public override fun mainClass(mainClass: String) {
        cdkBuilder.mainClass(mainClass)
      }

      public override fun stepProperties(stepProperties: IResolvable) {
        cdkBuilder.stepProperties(stepProperties.let(IResolvable::unwrap))
      }

      public override fun stepProperties(stepProperties: List<Any>) {
        cdkBuilder.stepProperties(stepProperties)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty,
    ) : HadoopJarStepConfigProperty {
      public override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      public override fun jar(): String = unwrap(this).getJar()

      public override fun mainClass(): String? = unwrap(this).getMainClass()

      public override fun stepProperties(): Any? = unwrap(this).getStepProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HadoopJarStepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty):
          HadoopJarStepConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HadoopJarStepConfigProperty):
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KeyValueProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder =
          software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty,
    ) : KeyValueProperty {
      public override fun key(): String? = unwrap(this).getKey()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty):
          KeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
