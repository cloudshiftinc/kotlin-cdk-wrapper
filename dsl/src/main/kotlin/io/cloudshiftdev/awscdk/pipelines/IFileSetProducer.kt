package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject

public interface IFileSetProducer {
  /**
   * The `FileSet` produced by this file set producer.
   *
   * Default: - This producer doesn't produce any file set
   */
  public fun primaryOutput(): FileSet? = unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer,
  ) : CdkObject(cdkObject), IFileSetProducer {
    /**
     * The `FileSet` produced by this file set producer.
     *
     * Default: - This producer doesn't produce any file set
     */
    override fun primaryOutput(): FileSet? = unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer):
        IFileSetProducer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSetProducer):
        software.amazon.awscdk.pipelines.IFileSetProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.IFileSetProducer
  }
}
