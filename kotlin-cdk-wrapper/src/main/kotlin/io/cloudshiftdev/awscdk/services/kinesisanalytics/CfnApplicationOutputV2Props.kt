@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationOutputV2Props {
  public fun applicationName(): String

  public fun output(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun output(output: IResolvable)

    public fun output(output: CfnApplicationOutputV2.OutputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1519e4e997aa577c3513d87f4f9cbfa39519711ba56948be31c1f046bae8c61")
    public fun output(output: CfnApplicationOutputV2.OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    override fun output(output: CfnApplicationOutputV2.OutputProperty) {
      cdkBuilder.output(output.let(CfnApplicationOutputV2.OutputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1519e4e997aa577c3513d87f4f9cbfa39519711ba56948be31c1f046bae8c61")
    override fun output(output: CfnApplicationOutputV2.OutputProperty.Builder.() -> Unit): Unit =
        output(CfnApplicationOutputV2.OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props,
  ) : CdkObject(cdkObject), CfnApplicationOutputV2Props {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun output(): Any = unwrap(this).getOutput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationOutputV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props):
        CfnApplicationOutputV2Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutputV2Props):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
  }
}
