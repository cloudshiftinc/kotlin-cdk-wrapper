package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

public interface Login {
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  public fun secretName(): String? = unwrap(this).getSecretName()

  public fun username(): String

  public interface Builder {
    public fun excludeCharacters(excludeCharacters: String)

    public fun kmsKey(kmsKey: IKey)

    public fun password(password: SecretValue)

    public fun secretName(secretName: String)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.Login.Builder =
        software.amazon.awscdk.services.docdb.Login.builder()

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.docdb.Login = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.Login,
  ) : Login {
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    override fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

    override fun secretName(): String? = unwrap(this).getSecretName()

    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Login {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.Login): Login =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Login): software.amazon.awscdk.services.docdb.Login = (wrapped as
        Wrapper).cdkObject
  }
}
