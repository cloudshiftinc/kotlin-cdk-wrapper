@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * AssemblyBuildOptions assemblyBuildOptions = AssemblyBuildOptions.builder().build();
 * ```
 */
public interface AssemblyBuildOptions {
  /**
   * A builder for [AssemblyBuildOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.AssemblyBuildOptions.Builder =
        software.amazon.awscdk.cxapi.AssemblyBuildOptions.builder()

    public fun build(): software.amazon.awscdk.cxapi.AssemblyBuildOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cxapi.AssemblyBuildOptions,
  ) : CdkObject(cdkObject), AssemblyBuildOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssemblyBuildOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.AssemblyBuildOptions):
        AssemblyBuildOptions = CdkObjectWrappers.wrap(cdkObject) as? AssemblyBuildOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssemblyBuildOptions):
        software.amazon.awscdk.cxapi.AssemblyBuildOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.AssemblyBuildOptions
  }
}
