@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.UserPoolDomainOptions

/**
 * Options to create a UserPoolDomain.
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
 */
@CdkDslMarker
public class UserPoolDomainOptionsDsl {
  private val cdkBuilder: UserPoolDomainOptions.Builder = UserPoolDomainOptions.builder()

  /**
   * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
   * `customDomain` or `cognitoDomain` must be specified.
   */
  public fun cognitoDomain(cognitoDomain: CognitoDomainOptionsDsl.() -> Unit = {}) {
    val builder = CognitoDomainOptionsDsl()
    builder.apply(cognitoDomain)
    cdkBuilder.cognitoDomain(builder.build())
  }

  /**
   * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
   * `customDomain` or `cognitoDomain` must be specified.
   */
  public fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
    cdkBuilder.cognitoDomain(cognitoDomain)
  }

  /**
   * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
   * `cognitoDomain` must be specified.
   */
  public fun customDomain(customDomain: CustomDomainOptionsDsl.() -> Unit = {}) {
    val builder = CustomDomainOptionsDsl()
    builder.apply(customDomain)
    cdkBuilder.customDomain(builder.build())
  }

  /**
   * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
   * `cognitoDomain` must be specified.
   */
  public fun customDomain(customDomain: CustomDomainOptions) {
    cdkBuilder.customDomain(customDomain)
  }

  public fun build(): UserPoolDomainOptions = cdkBuilder.build()
}
