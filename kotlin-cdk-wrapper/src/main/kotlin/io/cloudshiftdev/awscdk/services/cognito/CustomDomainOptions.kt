@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

/**
 * Options while specifying custom domain.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * pool.addDomain("CognitoDomain", UserPoolDomainOptions.builder()
 * .cognitoDomain(CognitoDomainOptions.builder()
 * .domainPrefix("my-awesome-app")
 * .build())
 * .build());
 * String certificateArn =
 * "arn:aws:acm:us-east-1:123456789012:certificate/11-3336f1-44483d-adc7-9cd375c5169d";
 * ICertificate domainCert = Certificate.fromCertificateArn(this, "domainCert", certificateArn);
 * pool.addDomain("CustomDomain", UserPoolDomainOptions.builder()
 * .customDomain(CustomDomainOptions.builder()
 * .domainName("user.myapp.com")
 * .certificate(domainCert)
 * .build())
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
 */
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CustomDomainOptions,
  ) : CdkObject(cdkObject), CustomDomainOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomDomainOptions):
        CustomDomainOptions = CdkObjectWrappers.wrap(cdkObject) as? CustomDomainOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomDomainOptions):
        software.amazon.awscdk.services.cognito.CustomDomainOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CustomDomainOptions
  }
}
