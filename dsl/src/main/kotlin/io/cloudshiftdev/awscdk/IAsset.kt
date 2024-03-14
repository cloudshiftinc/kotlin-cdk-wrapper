package io.cloudshiftdev.awscdk

import kotlin.String

public interface IAsset {
  /**
   * A hash of this asset, which is available at construction time.
   *
   * As this is a plain string, it
   * can be used in construct IDs in order to enforce creation of a new resource when the content
   * hash has changed.
   */
  public fun assetHash(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IAsset,
  ) : CdkObject(cdkObject), IAsset {
    /**
     * A hash of this asset, which is available at construction time.
     *
     * As this is a plain string, it
     * can be used in construct IDs in order to enforce creation of a new resource when the content
     * hash has changed.
     */
    override fun assetHash(): String = unwrap(this).getAssetHash()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IAsset): IAsset = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAsset): software.amazon.awscdk.IAsset = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IAsset
  }
}
