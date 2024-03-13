package io.cloudshiftdev.awscdk

public interface ITaggable {
  public fun tags(): TagManager

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ITaggable,
  ) : ITaggable {
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ITaggable): ITaggable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaggable): software.amazon.awscdk.ITaggable = (wrapped as
        Wrapper).cdkObject
  }
}
