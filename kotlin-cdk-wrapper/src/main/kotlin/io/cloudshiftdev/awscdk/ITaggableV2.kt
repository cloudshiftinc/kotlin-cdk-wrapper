@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Modernized version of ITaggable.
 *
 * `ITaggable` has a problem: for a number of L1 resources, we failed to generate
 * `tags: TagManager`, and generated `tags: CfnSomeResource.TagProperty[]` instead.
 *
 * To mark these resources as taggable, we need to put the `TagManager` in a new property
 * whose name is unlikely to conflict with any existing properties. Hence, a new interface
 * for that purpose. All future resources will implement `ITaggableV2`.
 */
public interface ITaggableV2 {
  /**
   * TagManager to set, remove and format tags.
   */
  public fun cdkTagManager(): TagManager

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITaggableV2,
  ) : CdkObject(cdkObject), ITaggableV2 {
    /**
     * TagManager to set, remove and format tags.
     */
    override fun cdkTagManager(): TagManager = unwrap(this).getCdkTagManager().let(TagManager::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggableV2): ITaggableV2 =
        CdkObjectWrappers.wrap(cdkObject) as? ITaggableV2 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggableV2): software.amazon.awscdk.ITaggableV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITaggableV2
  }
}
