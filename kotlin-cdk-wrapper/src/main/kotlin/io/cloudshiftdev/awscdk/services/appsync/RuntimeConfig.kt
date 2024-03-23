@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Config for binding runtime to a function or resolver.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * RuntimeConfig runtimeConfig = RuntimeConfig.builder()
 * .name("name")
 * .runtimeVersion("runtimeVersion")
 * .build();
 * ```
 */
public interface RuntimeConfig {
  /**
   * The name of the runtime.
   */
  public fun name(): String

  /**
   * The version string of the runtime.
   */
  public fun runtimeVersion(): String

  /**
   * A builder for [RuntimeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the runtime. 
     */
    public fun name(name: String)

    /**
     * @param runtimeVersion The version string of the runtime. 
     */
    public fun runtimeVersion(runtimeVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RuntimeConfig.Builder =
        software.amazon.awscdk.services.appsync.RuntimeConfig.builder()

    /**
     * @param name The name of the runtime. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param runtimeVersion The version string of the runtime. 
     */
    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): software.amazon.awscdk.services.appsync.RuntimeConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig,
  ) : CdkObject(cdkObject), RuntimeConfig {
    /**
     * The name of the runtime.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The version string of the runtime.
     */
    override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig):
        RuntimeConfig = CdkObjectWrappers.wrap(cdkObject) as? RuntimeConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimeConfig):
        software.amazon.awscdk.services.appsync.RuntimeConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.RuntimeConfig
  }
}
