@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IAsset {
  public fun assetHash(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IAsset,
  ) : CdkObject(cdkObject), IAsset {
    override fun assetHash(): String = unwrap(this).getAssetHash()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IAsset): IAsset = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAsset): software.amazon.awscdk.IAsset = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IAsset
  }
}
