@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Options while specifying a cognito prefix domain.
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
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
 */
public interface CognitoDomainOptions {
  /**
   * The prefix to the Cognito hosted domain name that will be associated with the user pool.
   */
  public fun domainPrefix(): String

  /**
   * A builder for [CognitoDomainOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainPrefix The prefix to the Cognito hosted domain name that will be associated with
     * the user pool. 
     */
    public fun domainPrefix(domainPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CognitoDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.CognitoDomainOptions.builder()

    /**
     * @param domainPrefix The prefix to the Cognito hosted domain name that will be associated with
     * the user pool. 
     */
    override fun domainPrefix(domainPrefix: String) {
      cdkBuilder.domainPrefix(domainPrefix)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CognitoDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CognitoDomainOptions,
  ) : CdkObject(cdkObject), CognitoDomainOptions {
    /**
     * The prefix to the Cognito hosted domain name that will be associated with the user pool.
     */
    override fun domainPrefix(): String = unwrap(this).getDomainPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CognitoDomainOptions):
        CognitoDomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoDomainOptions):
        software.amazon.awscdk.services.cognito.CognitoDomainOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CognitoDomainOptions
  }
}
