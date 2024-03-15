@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject

public interface ITaggable {
  public fun tags(): TagManager

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITaggable,
  ) : CdkObject(cdkObject), ITaggable {
    override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggable): ITaggable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggable): software.amazon.awscdk.ITaggable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITaggable
  }
}
