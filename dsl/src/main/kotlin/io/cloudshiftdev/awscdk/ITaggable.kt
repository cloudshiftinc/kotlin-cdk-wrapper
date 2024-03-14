package io.cloudshiftdev.awscdk

public interface ITaggable {
  /**
   * TagManager to set, remove and format tags.
   */
  public fun tags(): TagManager

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITaggable,
  ) : CdkObject(cdkObject), ITaggable {
    /**
     * TagManager to set, remove and format tags.
     */
    override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggable): ITaggable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggable): software.amazon.awscdk.ITaggable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITaggable
  }
}
