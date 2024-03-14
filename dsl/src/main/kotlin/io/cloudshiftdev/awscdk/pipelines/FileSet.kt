package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class FileSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.FileSet,
) : CdkObject(cdkObject), IFileSetProducer {
  /**
   * Human-readable descriptor for this file set (does not need to be unique).
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * The primary output of a file set producer.
   *
   * The primary output of a FileSet is itself.
   */
  public override fun primaryOutput(): FileSet? =
      unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  /**
   * Mark the given Step as the producer for this FileSet.
   *
   * This method can only be called once.
   *
   * @param producer
   */
  public open fun producedBy() {
    unwrap(this).producedBy()
  }

  /**
   * Mark the given Step as the producer for this FileSet.
   *
   * This method can only be called once.
   *
   * @param producer
   */
  public open fun producedBy(producer: Step) {
    unwrap(this).producedBy(producer.let(Step::unwrap))
  }

  /**
   * The Step that produces this FileSet.
   */
  public open fun producer(): Step = unwrap(this).getProducer().let(Step::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.FileSet): FileSet =
        FileSet(cdkObject)

    internal fun unwrap(wrapped: FileSet): software.amazon.awscdk.pipelines.FileSet =
        wrapped.cdkObject
  }
}
