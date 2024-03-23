@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Interface to implement tags.
 */
public interface ITaggable {
  /**
   * TagManager to set, remove and format tags.
   */
  public fun tags(): TagManager

  private class Wrapper(
    cdkObject: software.amazon.awscdk.ITaggable,
  ) : CdkObject(cdkObject), ITaggable {
    /**
     * TagManager to set, remove and format tags.
     */
    override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggable): ITaggable =
        CdkObjectWrappers.wrap(cdkObject) as? ITaggable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggable): software.amazon.awscdk.ITaggable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITaggable
  }
}
