@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for the addDockerImageAsset operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * AddDockerImageAssetOptions addDockerImageAssetOptions = AddDockerImageAssetOptions.builder()
 * .displayName("displayName")
 * .build();
 * ```
 */
public interface AddDockerImageAssetOptions {
  /**
   * A display name to associate with the asset.
   *
   * Default: - No display name
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * A builder for [AddDockerImageAssetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayName A display name to associate with the asset.
     */
    public fun displayName(displayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AddDockerImageAssetOptions.Builder =
        software.amazon.awscdk.AddDockerImageAssetOptions.builder()

    /**
     * @param displayName A display name to associate with the asset.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public fun build(): software.amazon.awscdk.AddDockerImageAssetOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.AddDockerImageAssetOptions,
  ) : CdkObject(cdkObject),
      AddDockerImageAssetOptions {
    /**
     * A display name to associate with the asset.
     *
     * Default: - No display name
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddDockerImageAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AddDockerImageAssetOptions):
        AddDockerImageAssetOptions = CdkObjectWrappers.wrap(cdkObject) as?
        AddDockerImageAssetOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddDockerImageAssetOptions):
        software.amazon.awscdk.AddDockerImageAssetOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.AddDockerImageAssetOptions
  }
}
