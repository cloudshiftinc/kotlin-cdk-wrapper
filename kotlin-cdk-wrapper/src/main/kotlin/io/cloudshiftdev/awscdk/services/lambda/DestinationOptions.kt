@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface DestinationOptions {
  public fun type(): DestinationType

  @CdkDslMarker
  public interface Builder {
    public fun type(type: DestinationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DestinationOptions.Builder =
        software.amazon.awscdk.services.lambda.DestinationOptions.builder()

    override fun type(type: DestinationType) {
      cdkBuilder.type(type.let(DestinationType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.DestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.DestinationOptions,
  ) : CdkObject(cdkObject), DestinationOptions {
    override fun type(): DestinationType = unwrap(this).getType().let(DestinationType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DestinationOptions):
        DestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationOptions):
        software.amazon.awscdk.services.lambda.DestinationOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.DestinationOptions
  }
}
