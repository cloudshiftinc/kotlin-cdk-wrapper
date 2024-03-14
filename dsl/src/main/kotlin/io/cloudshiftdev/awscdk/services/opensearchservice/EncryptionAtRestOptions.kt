package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Unit

public interface EncryptionAtRestOptions {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public interface Builder {
    public fun enabled(enabled: Boolean) {
    }

    public fun kmsKey(kmsKey: IKey) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions.builder()

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions,
  ) : EncryptionAtRestOptions {
    public override fun enabled(): Boolean? = unwrap(this).getEnabled()

    public override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions):
        EncryptionAtRestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionAtRestOptions):
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions = (wrapped as
        Wrapper).cdkObject
  }
}
