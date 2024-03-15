@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnStep,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @CdkDslMarker
  public interface Builder {
    public fun actionOnFailure(actionOnFailure: String)

    public fun hadoopJarStep(hadoopJarStep: IResolvable)

    public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d72595de5e5e291d59e6ffe4185f7b5fae105fab39fe862ae0898e1d644bb0f")
    public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit)

    public fun jobFlowId(jobFlowId: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStep.Builder =
        software.amazon.awscdk.services.emr.CfnStep.Builder.create(scope, id)

    override fun actionOnFailure(actionOnFailure: String) {
      cdkBuilder.actionOnFailure(actionOnFailure)
    }

    override fun hadoopJarStep(hadoopJarStep: IResolvable) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
    }

    override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(HadoopJarStepConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d72595de5e5e291d59e6ffe4185f7b5fae105fab39fe862ae0898e1d644bb0f")
    override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit): Unit
        = hadoopJarStep(HadoopJarStepConfigProperty(hadoopJarStep))

    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStep = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnStep.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun args(args: List<String>)

      public fun args(vararg args: String)

      public fun jar(jar: String)

      public fun mainClass(mainClass: String)

      public fun stepProperties(stepProperties: IResolvable)

      public fun stepProperties(stepProperties: List<Any>)

      public fun stepProperties(vararg stepProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.builder()

      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      override fun args(vararg args: String): Unit = args(args.toList())

      override fun jar(jar: String) {
        cdkBuilder.jar(jar)
      }

      override fun mainClass(mainClass: String) {
        cdkBuilder.mainClass(mainClass)
      }

      override fun stepProperties(stepProperties: IResolvable) {
        cdkBuilder.stepProperties(stepProperties.let(IResolvable::unwrap))
      }

      override fun stepProperties(stepProperties: List<Any>) {
        cdkBuilder.stepProperties(stepProperties)
      }

      override fun stepProperties(vararg stepProperties: Any): Unit =
          stepProperties(stepProperties.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty,
    ) : CdkObject(cdkObject), HadoopJarStepConfigProperty {
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun jar(): String = unwrap(this).getJar()

      override fun mainClass(): String? = unwrap(this).getMainClass()

      override fun stepProperties(): Any? = unwrap(this).getStepProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HadoopJarStepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty):
          HadoopJarStepConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HadoopJarStepConfigProperty):
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty
    }
  }

  public interface KeyValueProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder =
          software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty,
    ) : CdkObject(cdkObject), KeyValueProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty):
          KeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty
    }
  }
}
