@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnRotationScheduleProps {
  public fun hostedRotationLambda(): Any? = unwrap(this).getHostedRotationLambda()

  public fun rotateImmediatelyOnUpdate(): Any? = unwrap(this).getRotateImmediatelyOnUpdate()

  public fun rotationLambdaArn(): String? = unwrap(this).getRotationLambdaArn()

  public fun rotationRules(): Any? = unwrap(this).getRotationRules()

  public fun secretId(): String

  @CdkDslMarker
  public interface Builder {
    public fun hostedRotationLambda(hostedRotationLambda: IResolvable)

    public
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fefc0177980977567cd24d7fe070e3c5ef0a0a7bb6703268147adbb62f31acbb")
    public
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty.Builder.() -> Unit)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable)

    public fun rotationLambdaArn(rotationLambdaArn: String)

    public fun rotationRules(rotationRules: IResolvable)

    public fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31d4f53800c44d4c988878c5fea3c428f9042adcf58bf52672e481da8dbf438")
    public
        fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit)

    public fun secretId(secretId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.builder()

    override fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(IResolvable::unwrap))
    }

    override
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(CfnRotationSchedule.HostedRotationLambdaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fefc0177980977567cd24d7fe070e3c5ef0a0a7bb6703268147adbb62f31acbb")
    override
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty.Builder.() -> Unit):
        Unit =
        hostedRotationLambda(CfnRotationSchedule.HostedRotationLambdaProperty(hostedRotationLambda))

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate.let(IResolvable::unwrap))
    }

    override fun rotationLambdaArn(rotationLambdaArn: String) {
      cdkBuilder.rotationLambdaArn(rotationLambdaArn)
    }

    override fun rotationRules(rotationRules: IResolvable) {
      cdkBuilder.rotationRules(rotationRules.let(IResolvable::unwrap))
    }

    override fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty) {
      cdkBuilder.rotationRules(rotationRules.let(CfnRotationSchedule.RotationRulesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31d4f53800c44d4c988878c5fea3c428f9042adcf58bf52672e481da8dbf438")
    override
        fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit):
        Unit = rotationRules(CfnRotationSchedule.RotationRulesProperty(rotationRules))

    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps,
  ) : CdkObject(cdkObject), CfnRotationScheduleProps {
    override fun hostedRotationLambda(): Any? = unwrap(this).getHostedRotationLambda()

    override fun rotateImmediatelyOnUpdate(): Any? = unwrap(this).getRotateImmediatelyOnUpdate()

    override fun rotationLambdaArn(): String? = unwrap(this).getRotationLambdaArn()

    override fun rotationRules(): Any? = unwrap(this).getRotationRules()

    override fun secretId(): String = unwrap(this).getSecretId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRotationScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps):
        CfnRotationScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRotationScheduleProps):
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
  }
}
