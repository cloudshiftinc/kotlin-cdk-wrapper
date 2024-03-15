@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnApplicationProps {
  public fun applicationCode(): String? = unwrap(this).getApplicationCode()

  public fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  public fun applicationName(): String? = unwrap(this).getApplicationName()

  public fun inputs(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationCode(applicationCode: String)

    public fun applicationDescription(applicationDescription: String)

    public fun applicationName(applicationName: String)

    public fun inputs(inputs: IResolvable)

    public fun inputs(inputs: List<Any>)

    public fun inputs(vararg inputs: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.builder()

    override fun applicationCode(applicationCode: String) {
      cdkBuilder.applicationCode(applicationCode)
    }

    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun inputs(inputs: IResolvable) {
      cdkBuilder.inputs(inputs.let(IResolvable::unwrap))
    }

    override fun inputs(inputs: List<Any>) {
      cdkBuilder.inputs(inputs)
    }

    override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun applicationCode(): String? = unwrap(this).getApplicationCode()

    override fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

    override fun applicationName(): String? = unwrap(this).getApplicationName()

    override fun inputs(): Any = unwrap(this).getInputs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps
  }
}
