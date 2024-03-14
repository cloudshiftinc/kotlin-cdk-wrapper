package io.cloudshiftdev.awscdk.pipelines

import kotlin.String

public open class FileSet internal constructor(
  private val cdkObject: software.amazon.awscdk.pipelines.FileSet,
) : IFileSetProducer {
  public open fun id(): String = unwrap(this).getId()

  public override fun primaryOutput(): FileSet? =
      unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  public open fun producedBy() {
    unwrap(this).producedBy()
  }

  public open fun producedBy(producer: Step) {
    unwrap(this).producedBy(producer.let(Step::unwrap))
  }

  public open fun producer(): Step = unwrap(this).getProducer().let(Step::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.FileSet): FileSet =
        FileSet(cdkObject)

    internal fun unwrap(wrapped: FileSet): software.amazon.awscdk.pipelines.FileSet =
        wrapped.cdkObject
  }
}
