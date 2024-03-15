@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface LambdaDestinationOptions {
  public fun addPermissions(): Boolean? = unwrap(this).getAddPermissions()

  @CdkDslMarker
  public interface Builder {
    public fun addPermissions(addPermissions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.Builder =
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.builder()

    override fun addPermissions(addPermissions: Boolean) {
      cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions,
  ) : CdkObject(cdkObject), LambdaDestinationOptions {
    override fun addPermissions(): Boolean? = unwrap(this).getAddPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions):
        LambdaDestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDestinationOptions):
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions
  }
}
