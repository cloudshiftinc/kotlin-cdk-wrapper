@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for the loadManifest operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * LoadManifestOptions loadManifestOptions = LoadManifestOptions.builder()
 * .skipEnumCheck(false)
 * .skipVersionCheck(false)
 * .topoSort(false)
 * .build();
 * ```
 */
public interface LoadManifestOptions {
  /**
   * Skip enum checks.
   *
   * This means you may read enum values you don't know about yet. Make sure to always
   * check the values of enums you encounter in the manifest.
   *
   * Default: false
   */
  public fun skipEnumCheck(): Boolean? = unwrap(this).getSkipEnumCheck()

  /**
   * Skip the version check.
   *
   * This means you may read a newer cloud assembly than the CX API is designed
   * to support, and your application may not be aware of all features that in use
   * in the Cloud Assembly.
   *
   * Default: false
   */
  public fun skipVersionCheck(): Boolean? = unwrap(this).getSkipVersionCheck()

  /**
   * Topologically sort all artifacts.
   *
   * This parameter is only respected by the constructor of `CloudAssembly`. The
   * property lives here for backwards compatibility reasons.
   *
   * Default: true
   */
  public fun topoSort(): Boolean? = unwrap(this).getTopoSort()

  /**
   * A builder for [LoadManifestOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param skipEnumCheck Skip enum checks.
     * This means you may read enum values you don't know about yet. Make sure to always
     * check the values of enums you encounter in the manifest.
     */
    public fun skipEnumCheck(skipEnumCheck: Boolean)

    /**
     * @param skipVersionCheck Skip the version check.
     * This means you may read a newer cloud assembly than the CX API is designed
     * to support, and your application may not be aware of all features that in use
     * in the Cloud Assembly.
     */
    public fun skipVersionCheck(skipVersionCheck: Boolean)

    /**
     * @param topoSort Topologically sort all artifacts.
     * This parameter is only respected by the constructor of `CloudAssembly`. The
     * property lives here for backwards compatibility reasons.
     */
    public fun topoSort(topoSort: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions.Builder
        = software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions.builder()

    /**
     * @param skipEnumCheck Skip enum checks.
     * This means you may read enum values you don't know about yet. Make sure to always
     * check the values of enums you encounter in the manifest.
     */
    override fun skipEnumCheck(skipEnumCheck: Boolean) {
      cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    /**
     * @param skipVersionCheck Skip the version check.
     * This means you may read a newer cloud assembly than the CX API is designed
     * to support, and your application may not be aware of all features that in use
     * in the Cloud Assembly.
     */
    override fun skipVersionCheck(skipVersionCheck: Boolean) {
      cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    /**
     * @param topoSort Topologically sort all artifacts.
     * This parameter is only respected by the constructor of `CloudAssembly`. The
     * property lives here for backwards compatibility reasons.
     */
    override fun topoSort(topoSort: Boolean) {
      cdkBuilder.topoSort(topoSort)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions,
  ) : CdkObject(cdkObject), LoadManifestOptions {
    /**
     * Skip enum checks.
     *
     * This means you may read enum values you don't know about yet. Make sure to always
     * check the values of enums you encounter in the manifest.
     *
     * Default: false
     */
    override fun skipEnumCheck(): Boolean? = unwrap(this).getSkipEnumCheck()

    /**
     * Skip the version check.
     *
     * This means you may read a newer cloud assembly than the CX API is designed
     * to support, and your application may not be aware of all features that in use
     * in the Cloud Assembly.
     *
     * Default: false
     */
    override fun skipVersionCheck(): Boolean? = unwrap(this).getSkipVersionCheck()

    /**
     * Topologically sort all artifacts.
     *
     * This parameter is only respected by the constructor of `CloudAssembly`. The
     * property lives here for backwards compatibility reasons.
     *
     * Default: true
     */
    override fun topoSort(): Boolean? = unwrap(this).getTopoSort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadManifestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions):
        LoadManifestOptions = CdkObjectWrappers.wrap(cdkObject) as LoadManifestOptions

    internal fun unwrap(wrapped: LoadManifestOptions):
        software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions
  }
}
