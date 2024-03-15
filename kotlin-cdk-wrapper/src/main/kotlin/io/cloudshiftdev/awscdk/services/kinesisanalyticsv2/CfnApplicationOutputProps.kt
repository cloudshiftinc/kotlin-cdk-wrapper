@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationOutputProps {
  public fun applicationName(): String

  public fun output(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun output(output: IResolvable)

    public fun output(output: CfnApplicationOutput.OutputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8135adb7051a626323a5ccf85de017c0d6e7bc8bb87575fe2019d7a16b5c58")
    public fun output(output: CfnApplicationOutput.OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    override fun output(output: CfnApplicationOutput.OutputProperty) {
      cdkBuilder.output(output.let(CfnApplicationOutput.OutputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8135adb7051a626323a5ccf85de017c0d6e7bc8bb87575fe2019d7a16b5c58")
    override fun output(output: CfnApplicationOutput.OutputProperty.Builder.() -> Unit): Unit =
        output(CfnApplicationOutput.OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps,
  ) : CdkObject(cdkObject), CfnApplicationOutputProps {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun output(): Any = unwrap(this).getOutput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps):
        CfnApplicationOutputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutputProps):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
  }
}
