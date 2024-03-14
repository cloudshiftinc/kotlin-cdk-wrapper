package io.cloudshiftdev.awscdk

public interface ITaggableV2 {
  public fun cdkTagManager(): TagManager

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ITaggableV2,
  ) : ITaggableV2 {
    override fun cdkTagManager(): TagManager = unwrap(this).getCdkTagManager().let(TagManager::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggableV2): ITaggableV2 =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggableV2): software.amazon.awscdk.ITaggableV2 = (wrapped as
        Wrapper).cdkObject
  }
}
