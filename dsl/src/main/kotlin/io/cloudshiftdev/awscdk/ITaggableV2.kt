package io.cloudshiftdev.awscdk

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
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggableV2): software.amazon.awscdk.ITaggableV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITaggableV2
  }
}
