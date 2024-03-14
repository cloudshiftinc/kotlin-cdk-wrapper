package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit

public interface S3LocationConfig {
  public fun uri(): String

  public interface Builder {
    public fun uri(uri: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig.builder()

    public override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig,
  ) : S3LocationConfig {
    public override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig):
        S3LocationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3LocationConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
