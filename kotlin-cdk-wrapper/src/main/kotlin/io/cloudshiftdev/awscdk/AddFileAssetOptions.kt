@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for the addFileAsset operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * AddFileAssetOptions addFileAssetOptions = AddFileAssetOptions.builder()
 * .displayName("displayName")
 * .build();
 * ```
 */
public interface AddFileAssetOptions {
  /**
   * A display name to associate with the asset.
   *
   * Default: - No display name
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * A builder for [AddFileAssetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayName A display name to associate with the asset.
     */
    public fun displayName(displayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AddFileAssetOptions.Builder =
        software.amazon.awscdk.AddFileAssetOptions.builder()

    /**
     * @param displayName A display name to associate with the asset.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public fun build(): software.amazon.awscdk.AddFileAssetOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.AddFileAssetOptions,
  ) : CdkObject(cdkObject),
      AddFileAssetOptions {
    /**
     * A display name to associate with the asset.
     *
     * Default: - No display name
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddFileAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AddFileAssetOptions): AddFileAssetOptions =
        CdkObjectWrappers.wrap(cdkObject) as? AddFileAssetOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddFileAssetOptions): software.amazon.awscdk.AddFileAssetOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.AddFileAssetOptions
  }
}
