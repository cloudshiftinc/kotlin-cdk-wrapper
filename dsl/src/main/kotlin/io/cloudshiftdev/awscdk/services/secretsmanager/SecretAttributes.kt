package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface SecretAttributes {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun secretCompleteArn(): String? = unwrap(this).getSecretCompleteArn()

  public fun secretPartialArn(): String? = unwrap(this).getSecretPartialArn()

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun secretCompleteArn(secretCompleteArn: String)

    public fun secretPartialArn(secretPartialArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.SecretAttributes.Builder
        = software.amazon.awscdk.services.secretsmanager.SecretAttributes.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun secretCompleteArn(secretCompleteArn: String) {
      cdkBuilder.secretCompleteArn(secretCompleteArn)
    }

    override fun secretPartialArn(secretPartialArn: String) {
      cdkBuilder.secretPartialArn(secretPartialArn)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttributes,
  ) : SecretAttributes {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun secretCompleteArn(): String? = unwrap(this).getSecretCompleteArn()

    override fun secretPartialArn(): String? = unwrap(this).getSecretPartialArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttributes):
        SecretAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretAttributes):
        software.amazon.awscdk.services.secretsmanager.SecretAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
