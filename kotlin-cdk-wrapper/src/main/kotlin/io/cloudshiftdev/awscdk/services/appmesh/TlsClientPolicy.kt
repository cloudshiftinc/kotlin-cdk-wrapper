@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TlsClientPolicy {
  public fun enforce(): Boolean? = unwrap(this).getEnforce()

  public fun mutualTlsCertificate(): MutualTlsCertificate? =
      unwrap(this).getMutualTlsCertificate()?.let(MutualTlsCertificate::wrap)

  public fun ports(): List<Number> = unwrap(this).getPorts() ?: emptyList()

  public fun validation(): TlsValidation

  @CdkDslMarker
  public interface Builder {
    public fun enforce(enforce: Boolean)

    public fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate)

    public fun ports(ports: List<Number>)

    public fun ports(vararg ports: Number)

    public fun validation(validation: TlsValidation)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    override fun ports(vararg ports: Number): Unit = ports(ports.toList())

    override fun validation(validation: TlsValidation) {
      cdkBuilder.validation(validation.let(TlsValidation::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dff341066282c8ab2a7042b826ea2289f0fd8205afe8a4d9debc6a31761dcca")
    override fun validation(validation: TlsValidation.Builder.() -> Unit): Unit =
        validation(TlsValidation(validation))

    public fun build(): software.amazon.awscdk.services.appmesh.TlsClientPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsClientPolicy,
  ) : CdkObject(cdkObject), TlsClientPolicy {
    override fun enforce(): Boolean? = unwrap(this).getEnforce()

    override fun mutualTlsCertificate(): MutualTlsCertificate? =
        unwrap(this).getMutualTlsCertificate()?.let(MutualTlsCertificate::wrap)

    override fun ports(): List<Number> = unwrap(this).getPorts() ?: emptyList()

    override fun validation(): TlsValidation = unwrap(this).getValidation().let(TlsValidation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TlsClientPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsClientPolicy):
        TlsClientPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsClientPolicy):
        software.amazon.awscdk.services.appmesh.TlsClientPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.TlsClientPolicy
  }
}
