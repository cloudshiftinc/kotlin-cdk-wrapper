package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

public interface DomainOptions {
  /**
   * The certificate to use with the domain name.
   */
  public fun certificate(): ICertificate

  /**
   * The actual domain name.
   *
   * For example, `api.example.com`.
   */
  public fun domainName(): String

  /**
   * A builder for [DomainOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The certificate to use with the domain name. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param domainName The actual domain name. 
     * For example, `api.example.com`.
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DomainOptions.Builder =
        software.amazon.awscdk.services.appsync.DomainOptions.builder()

    /**
     * @param certificate The certificate to use with the domain name. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param domainName The actual domain name. 
     * For example, `api.example.com`.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DomainOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.DomainOptions,
  ) : DomainOptions {
    /**
     * The certificate to use with the domain name.
     */
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    /**
     * The actual domain name.
     *
     * For example, `api.example.com`.
     */
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
