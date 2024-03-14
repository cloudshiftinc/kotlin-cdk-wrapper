package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Unit

public interface EncryptionAtRestOptions {
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  @Deprecated(message = "deprecated in CDK")
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun kmsKey(kmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions,
  ) : EncryptionAtRestOptions {
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    @Deprecated(message = "deprecated in CDK")
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions):
        EncryptionAtRestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionAtRestOptions):
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions = (wrapped as
        Wrapper).cdkObject
  }
}
