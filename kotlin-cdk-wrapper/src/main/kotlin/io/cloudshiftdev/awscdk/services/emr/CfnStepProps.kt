@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnStepProps {
  public fun actionOnFailure(): String

  public fun hadoopJarStep(): Any

  public fun jobFlowId(): String

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun actionOnFailure(actionOnFailure: String)

    public fun hadoopJarStep(hadoopJarStep: IResolvable)

    public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13004e87498c75b024f431388d737d13eb5dfa0ce703e7af122c0b5caf1914d4")
    public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty.Builder.() -> Unit)

    public fun jobFlowId(jobFlowId: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStepProps.Builder =
        software.amazon.awscdk.services.emr.CfnStepProps.builder()

    override fun actionOnFailure(actionOnFailure: String) {
      cdkBuilder.actionOnFailure(actionOnFailure)
    }

    override fun hadoopJarStep(hadoopJarStep: IResolvable) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
    }

    override fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(CfnStep.HadoopJarStepConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13004e87498c75b024f431388d737d13eb5dfa0ce703e7af122c0b5caf1914d4")
    override
        fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty.Builder.() -> Unit):
        Unit = hadoopJarStep(CfnStep.HadoopJarStepConfigProperty(hadoopJarStep))

    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStepProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnStepProps,
  ) : CdkObject(cdkObject), CfnStepProps {
    override fun actionOnFailure(): String = unwrap(this).getActionOnFailure()

    override fun hadoopJarStep(): Any = unwrap(this).getHadoopJarStep()

    override fun jobFlowId(): String = unwrap(this).getJobFlowId()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStepProps): CfnStepProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStepProps): software.amazon.awscdk.services.emr.CfnStepProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStepProps
  }
}
