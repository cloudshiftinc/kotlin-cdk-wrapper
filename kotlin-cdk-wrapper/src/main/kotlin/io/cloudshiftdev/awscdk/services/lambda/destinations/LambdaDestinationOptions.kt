@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface LambdaDestinationOptions {
  public fun responseOnly(): Boolean? = unwrap(this).getResponseOnly()

  @CdkDslMarker
  public interface Builder {
    public fun responseOnly(responseOnly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions.Builder =
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions.builder()

    override fun responseOnly(responseOnly: Boolean) {
      cdkBuilder.responseOnly(responseOnly)
    }

    public fun build(): software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions,
  ) : CdkObject(cdkObject), LambdaDestinationOptions {
    override fun responseOnly(): Boolean? = unwrap(this).getResponseOnly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions):
        LambdaDestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDestinationOptions):
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions
  }
}
