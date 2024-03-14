package io.cloudshiftdev.awscdk

import kotlin.String

public interface IAsset {
  public fun assetHash(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IAsset,
  ) : IAsset {
    override fun assetHash(): String = unwrap(this).getAssetHash()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IAsset): IAsset = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAsset): software.amazon.awscdk.IAsset = (wrapped as
        Wrapper).cdkObject
  }
}
