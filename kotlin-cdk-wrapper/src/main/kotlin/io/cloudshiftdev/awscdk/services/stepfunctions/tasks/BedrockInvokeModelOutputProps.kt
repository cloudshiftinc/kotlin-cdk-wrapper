@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BedrockInvokeModelOutputProps {
  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun s3Location(s3Location: Location)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5257a3476a510565c590204e38431da4e61b6b37c4c561db431ef52d6de54db")
    public fun s3Location(s3Location: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps.builder()

    override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5257a3476a510565c590204e38431da4e61b6b37c4c561db431ef52d6de54db")
    override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps,
  ) : CdkObject(cdkObject), BedrockInvokeModelOutputProps {
    override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps):
        BedrockInvokeModelOutputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelOutputProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps
  }
}
