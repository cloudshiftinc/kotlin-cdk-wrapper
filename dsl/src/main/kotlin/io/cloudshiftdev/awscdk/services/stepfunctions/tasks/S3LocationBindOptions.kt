package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.Boolean
import kotlin.Unit

public interface S3LocationBindOptions {
  public fun forReading(): Boolean? = unwrap(this).getForReading()

  public fun forWriting(): Boolean? = unwrap(this).getForWriting()

  public interface Builder {
    public fun forReading(forReading: Boolean) {
    }

    public fun forWriting(forWriting: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions.builder()

    public override fun forReading(forReading: Boolean) {
      cdkBuilder.forReading(forReading)
    }

    public override fun forWriting(forWriting: Boolean) {
      cdkBuilder.forWriting(forWriting)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions,
  ) : S3LocationBindOptions {
    public override fun forReading(): Boolean? = unwrap(this).getForReading()

    public override fun forWriting(): Boolean? = unwrap(this).getForWriting()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions):
        S3LocationBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3LocationBindOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
