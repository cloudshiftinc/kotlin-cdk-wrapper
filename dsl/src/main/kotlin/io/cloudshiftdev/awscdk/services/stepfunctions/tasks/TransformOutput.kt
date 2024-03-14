package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface TransformOutput {
  public fun accept(): String? = unwrap(this).getAccept()

  public fun assembleWith(): AssembleWith? = unwrap(this).getAssembleWith()?.let(AssembleWith::wrap)

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun s3OutputPath(): String

  public interface Builder {
    public fun accept(accept: String)

    public fun assembleWith(assembleWith: AssembleWith)

    public fun encryptionKey(encryptionKey: IKey)

    public fun s3OutputPath(s3OutputPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput.builder()

    override fun accept(accept: String) {
      cdkBuilder.accept(accept)
    }

    override fun assembleWith(assembleWith: AssembleWith) {
      cdkBuilder.assembleWith(assembleWith.let(AssembleWith::unwrap))
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun s3OutputPath(s3OutputPath: String) {
      cdkBuilder.s3OutputPath(s3OutputPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput,
  ) : TransformOutput {
    override fun accept(): String? = unwrap(this).getAccept()

    override fun assembleWith(): AssembleWith? =
        unwrap(this).getAssembleWith()?.let(AssembleWith::wrap)

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun s3OutputPath(): String = unwrap(this).getS3OutputPath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TransformOutput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput):
        TransformOutput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformOutput):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput = (wrapped as
        Wrapper).cdkObject
  }
}
