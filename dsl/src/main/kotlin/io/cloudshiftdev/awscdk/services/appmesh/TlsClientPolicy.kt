package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Boolean
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TlsClientPolicy {
  public fun enforce(): Boolean? = unwrap(this).getEnforce()

  public fun mutualTlsCertificate(): MutualTlsCertificate? =
      unwrap(this).getMutualTlsCertificate()?.let(MutualTlsCertificate::wrap)

  public fun ports(): List<Number> = unwrap(this).getPorts() ?: emptyList()

  public fun validation(): TlsValidation

  public interface Builder {
    public fun enforce(enforce: Boolean)

    public fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate)

    public fun ports(ports: List<Number>)

    public fun validation(validation: TlsValidation)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dff341066282c8ab2a7042b826ea2289f0fd8205afe8a4d9debc6a31761dcca")
    public fun validation(validation: TlsValidation.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsClientPolicy.Builder =
        software.amazon.awscdk.services.appmesh.TlsClientPolicy.builder()

    override fun enforce(enforce: Boolean) {
      cdkBuilder.enforce(enforce)
    }

    override fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate) {
      cdkBuilder.mutualTlsCertificate(mutualTlsCertificate.let(MutualTlsCertificate::unwrap))
    }

    override fun ports(ports: List<Number>) {
      cdkBuilder.ports(ports)
    }

    override fun validation(validation: TlsValidation) {
      cdkBuilder.validation(validation.let(TlsValidation::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dff341066282c8ab2a7042b826ea2289f0fd8205afe8a4d9debc6a31761dcca")
    override fun validation(validation: TlsValidation.Builder.() -> Unit): Unit =
        validation(TlsValidation(validation))

    public fun build(): software.amazon.awscdk.services.appmesh.TlsClientPolicy = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TlsClientPolicy,
  ) : TlsClientPolicy {
    override fun enforce(): Boolean? = unwrap(this).getEnforce()

    override fun mutualTlsCertificate(): MutualTlsCertificate? =
        unwrap(this).getMutualTlsCertificate()?.let(MutualTlsCertificate::wrap)

    override fun ports(): List<Number> = unwrap(this).getPorts() ?: emptyList()

    override fun validation(): TlsValidation = unwrap(this).getValidation().let(TlsValidation::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TlsClientPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsClientPolicy):
        TlsClientPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsClientPolicy):
        software.amazon.awscdk.services.appmesh.TlsClientPolicy = (wrapped as Wrapper).cdkObject
  }
}
