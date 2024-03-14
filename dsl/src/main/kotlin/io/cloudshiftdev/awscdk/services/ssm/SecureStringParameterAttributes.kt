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
    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun parameterName(parameterName: String) {
    }

    public fun simpleName(simpleName: Boolean) {
    }

    public fun version(version: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.SecureStringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.SecureStringParameterAttributes.builder()

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    public override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    public override fun version(version: Number) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.ssm.SecureStringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ssm.SecureStringParameterAttributes,
  ) : SecureStringParameterAttributes {
    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun parameterName(): String = unwrap(this).getParameterName()

    public override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    public override fun version(): Number? = unwrap(this).getVersion()
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
