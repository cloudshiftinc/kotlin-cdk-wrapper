@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.cognito.CustomDomainOptions

/**
 * Options while specifying custom domain.
 *
 * Example:
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
@CdkDslMarker
public class CustomDomainOptionsDsl {
    private val cdkBuilder: CustomDomainOptions.Builder = CustomDomainOptions.builder()

    /** @param certificate The certificate to associate with this domain. */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param domainName The custom domain name that you would like to associate with this User
     *   Pool.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CustomDomainOptions = cdkBuilder.build()
}
