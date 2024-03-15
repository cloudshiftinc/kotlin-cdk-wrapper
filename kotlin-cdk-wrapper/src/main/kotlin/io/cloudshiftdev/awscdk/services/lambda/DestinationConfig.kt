@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DestinationConfig {
  public fun destination(): String

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DestinationConfig.Builder =
        software.amazon.awscdk.services.lambda.DestinationConfig.builder()

    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    public fun build(): software.amazon.awscdk.services.lambda.DestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.DestinationConfig,
  ) : CdkObject(cdkObject), DestinationConfig {
    override fun destination(): String = unwrap(this).getDestination()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DestinationConfig):
        DestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationConfig):
        software.amazon.awscdk.services.lambda.DestinationConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.DestinationConfig
  }
}
