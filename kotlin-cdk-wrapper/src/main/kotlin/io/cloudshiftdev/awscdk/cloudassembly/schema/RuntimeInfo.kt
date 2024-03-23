@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Information about the application's runtime components.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * RuntimeInfo runtimeInfo = RuntimeInfo.builder()
 * .libraries(Map.of(
 * "librariesKey", "libraries"))
 * .build();
 * ```
 */
public interface RuntimeInfo {
  /**
   * The list of libraries loaded in the application, associated with their versions.
   */
  public fun libraries(): Map<String, String>

  /**
   * A builder for [RuntimeInfo]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param libraries The list of libraries loaded in the application, associated with their
     * versions. 
     */
    public fun libraries(libraries: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.RuntimeInfo.Builder =
        software.amazon.awscdk.cloudassembly.schema.RuntimeInfo.builder()

    /**
     * @param libraries The list of libraries loaded in the application, associated with their
     * versions. 
     */
    override fun libraries(libraries: Map<String, String>) {
      cdkBuilder.libraries(libraries)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.RuntimeInfo = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.RuntimeInfo,
  ) : CdkObject(cdkObject), RuntimeInfo {
    /**
     * The list of libraries loaded in the application, associated with their versions.
     */
    override fun libraries(): Map<String, String> = unwrap(this).getLibraries() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeInfo {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.RuntimeInfo):
        RuntimeInfo = CdkObjectWrappers.wrap(cdkObject) as? RuntimeInfo ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimeInfo):
        software.amazon.awscdk.cloudassembly.schema.RuntimeInfo = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.RuntimeInfo
  }
}
