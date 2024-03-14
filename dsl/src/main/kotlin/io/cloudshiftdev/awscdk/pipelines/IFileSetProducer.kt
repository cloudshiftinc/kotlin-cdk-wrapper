package io.cloudshiftdev.awscdk.pipelines

public interface IFileSetProducer {
  public fun primaryOutput(): FileSet? = unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer,
  ) : IFileSetProducer {
    public override fun primaryOutput(): FileSet? =
        unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer):
        IFileSetProducer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSetProducer):
        software.amazon.awscdk.pipelines.IFileSetProducer = (wrapped as Wrapper).cdkObject
  }
}
