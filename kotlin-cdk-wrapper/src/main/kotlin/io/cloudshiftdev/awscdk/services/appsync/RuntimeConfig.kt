@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RuntimeConfig {
  public fun name(): String

  public fun runtimeVersion(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun runtimeVersion(runtimeVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RuntimeConfig.Builder =
        software.amazon.awscdk.services.appsync.RuntimeConfig.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): software.amazon.awscdk.services.appsync.RuntimeConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig,
  ) : CdkObject(cdkObject), RuntimeConfig {
    override fun name(): String = unwrap(this).getName()

    override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig):
        RuntimeConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimeConfig):
        software.amazon.awscdk.services.appsync.RuntimeConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.RuntimeConfig
  }
}
