package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class SecretValue internal constructor(
  private val cdkObject: software.amazon.awscdk.SecretValue,
) : Intrinsic(cdkObject) {
  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  public open fun unsafeUnwrap(): String = unwrap(this).unsafeUnwrap()

  public interface Builder {
    public fun stackTrace(stackTrace: Boolean)

    public fun typeHint(typeHint: ResolutionTypeHint)
  }

  private class BuilderImpl(
    protectedValue: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.SecretValue.Builder =
        software.amazon.awscdk.SecretValue.Builder.create(protectedValue)

    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    override fun typeHint(typeHint: ResolutionTypeHint) {
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint::unwrap))
    }

    public fun build(): software.amazon.awscdk.SecretValue = cdkBuilder.build()
  }

  public companion object {
    public open fun cfnDynamicReference(ref: CfnDynamicReference): SecretValue =
        software.amazon.awscdk.SecretValue.cfnDynamicReference(ref.let(CfnDynamicReference::unwrap)).let(SecretValue::wrap)

    public open fun cfnParameter(`param`: CfnParameter): SecretValue =
        software.amazon.awscdk.SecretValue.cfnParameter(`param`.let(CfnParameter::unwrap)).let(SecretValue::wrap)

    public open fun isSecretValue(x: Any): Boolean =
        software.amazon.awscdk.SecretValue.isSecretValue(x)

    @Deprecated(message = "deprecated in CDK")
    public open fun plainText(secret: String): SecretValue =
        software.amazon.awscdk.SecretValue.plainText(secret).let(SecretValue::wrap)

    public open fun resourceAttribute(attr: String): SecretValue =
        software.amazon.awscdk.SecretValue.resourceAttribute(attr).let(SecretValue::wrap)

    public open fun secretsManager(secretId: String): SecretValue =
        software.amazon.awscdk.SecretValue.secretsManager(secretId).let(SecretValue::wrap)

    public open fun secretsManager(secretId: String, options: SecretsManagerSecretOptions):
        SecretValue = software.amazon.awscdk.SecretValue.secretsManager(secretId,
        options.let(SecretsManagerSecretOptions::unwrap)).let(SecretValue::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f7c9f1d82680cb6f5a02536b3a5ec5da53d07abf763bbfe93af1986e49e659")
    public open fun secretsManager(secretId: String,
        options: SecretsManagerSecretOptions.Builder.() -> Unit): SecretValue =
        secretsManager(secretId, SecretsManagerSecretOptions(options))

    public open fun ssmSecure(parameterName: String): SecretValue =
        software.amazon.awscdk.SecretValue.ssmSecure(parameterName).let(SecretValue::wrap)

    public open fun ssmSecure(parameterName: String, version: String): SecretValue =
        software.amazon.awscdk.SecretValue.ssmSecure(parameterName, version).let(SecretValue::wrap)

    public open fun unsafePlainText(secret: String): SecretValue =
        software.amazon.awscdk.SecretValue.unsafePlainText(secret).let(SecretValue::wrap)

    public operator fun invoke(protectedValue: Any, block: Builder.() -> Unit = {}): SecretValue {
      val builderImpl = BuilderImpl(protectedValue)
      return SecretValue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SecretValue): SecretValue =
        SecretValue(cdkObject)

    internal fun unwrap(wrapped: SecretValue): software.amazon.awscdk.SecretValue =
        wrapped.cdkObject
  }
}
