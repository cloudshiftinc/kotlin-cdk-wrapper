package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

public interface EncryptionConfiguration {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun encryptionOption(): EncryptionOption

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun encryptionOption(encryptionOption: EncryptionOption) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.builder()

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun encryptionOption(encryptionOption: EncryptionOption) {
      cdkBuilder.encryptionOption(encryptionOption.let(EncryptionOption::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration,
  ) : EncryptionConfiguration {
    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun encryptionOption(): EncryptionOption =
        unwrap(this).getEncryptionOption().let(EncryptionOption::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration):
        EncryptionConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
