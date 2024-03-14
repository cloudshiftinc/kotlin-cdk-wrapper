package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

public interface CustomDomainOptions {
  /**
   * The certificate to associate with this domain.
   */
  public fun certificate(): ICertificate

  /**
   * The custom domain name that you would like to associate with this User Pool.
   */
  public fun domainName(): String

  /**
   * A builder for [CustomDomainOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The certificate to associate with this domain. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param domainName The custom domain name that you would like to associate with this User
     * Pool. 
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CustomDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.CustomDomainOptions.builder()

    /**
     * @param certificate The certificate to associate with this domain. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param domainName The custom domain name that you would like to associate with this User
     * Pool. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CustomDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.CustomDomainOptions,
  ) : CustomDomainOptions {
    /**
     * The certificate to associate with this domain.
     */
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    /**
     * The custom domain name that you would like to associate with this User Pool.
     */
    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomDomainOptions):
        CustomDomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomDomainOptions):
        software.amazon.awscdk.services.cognito.CustomDomainOptions = (wrapped as Wrapper).cdkObject
  }
}
