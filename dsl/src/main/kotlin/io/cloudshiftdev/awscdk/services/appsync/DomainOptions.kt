package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

public interface DomainOptions {
  public fun certificate(): ICertificate

  public fun domainName(): String

  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DomainOptions.Builder =
        software.amazon.awscdk.services.appsync.DomainOptions.builder()

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DomainOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.DomainOptions,
  ) : DomainOptions {
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.DomainOptions):
        DomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainOptions):
        software.amazon.awscdk.services.appsync.DomainOptions = (wrapped as Wrapper).cdkObject
  }
}
