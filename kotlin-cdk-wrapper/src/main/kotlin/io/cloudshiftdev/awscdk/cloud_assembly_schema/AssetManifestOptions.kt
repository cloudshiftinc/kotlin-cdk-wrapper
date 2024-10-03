@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Configuration options for the Asset Manifest.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * AssetManifestOptions assetManifestOptions = AssetManifestOptions.builder()
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build();
 * ```
 */
public interface AssetManifestOptions {
  /**
   * SSM parameter where the bootstrap stack version number can be found.
   *
   * * If this value is not set, the bootstrap stack name must be known at
   * deployment time so the stack version can be looked up from the stack
   * outputs.
   * * If this value is set, the bootstrap stack can have any name because
   * we won't need to look it up.
   *
   * Default: - Bootstrap stack version number looked up
   */
  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  /**
   * Version of bootstrap stack required to deploy this stack.
   *
   * Default: - Version 1 (basic modern bootstrap stack)
   */
  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  /**
   * A builder for [AssetManifestOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     * number can be found.
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     * stack.
     */
    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions.Builder =
        software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions.builder()

    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     * number can be found.
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     */
    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     * stack.
     */
    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions,
  ) : CdkObject(cdkObject),
      AssetManifestOptions {
    /**
     * SSM parameter where the bootstrap stack version number can be found.
     *
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     *
     * Default: - Bootstrap stack version number looked up
     */
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    /**
     * Version of bootstrap stack required to deploy this stack.
     *
     * Default: - Version 1 (basic modern bootstrap stack)
     */
    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions):
        AssetManifestOptions = CdkObjectWrappers.wrap(cdkObject) as? AssetManifestOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestOptions):
        software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.AssetManifestOptions
  }
}
