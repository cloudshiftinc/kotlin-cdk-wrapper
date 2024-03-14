package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SecureStringParameterAttributes : CommonStringParameterAttributes {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun version(): Number? = unwrap(this).getVersion()

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)

    public fun version(version: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.SecureStringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.SecureStringParameterAttributes.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    override fun version(version: Number) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.ssm.SecureStringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ssm.SecureStringParameterAttributes,
  ) : SecureStringParameterAttributes {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    override fun version(): Number? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecureStringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssm.SecureStringParameterAttributes):
        SecureStringParameterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecureStringParameterAttributes):
        software.amazon.awscdk.services.ssm.SecureStringParameterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
