@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject

public interface ITaggableV2 {
  public fun cdkTagManager(): TagManager

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITaggableV2,
  ) : CdkObject(cdkObject), ITaggableV2 {
    override fun cdkTagManager(): TagManager = unwrap(this).getCdkTagManager().let(TagManager::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggableV2): ITaggableV2 =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggableV2): software.amazon.awscdk.ITaggableV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITaggableV2
  }
}
