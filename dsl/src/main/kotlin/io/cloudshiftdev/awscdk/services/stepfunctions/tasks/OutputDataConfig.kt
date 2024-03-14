package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

public interface OutputDataConfig {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun s3OutputLocation(): S3Location

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun s3OutputLocation(s3OutputLocation: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun s3OutputLocation(s3OutputLocation: S3Location) {
      cdkBuilder.s3OutputLocation(s3OutputLocation.let(S3Location::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig,
  ) : OutputDataConfig {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun s3OutputLocation(): S3Location =
        unwrap(this).getS3OutputLocation().let(S3Location::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OutputDataConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig):
        OutputDataConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OutputDataConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig = (wrapped as
        Wrapper).cdkObject
  }
}
