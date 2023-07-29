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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnEmailIdentity

/**
 * Used to configure or change the DKIM authentication settings for an email domain identity.
 *
 * You can use this operation to do any of the following:
 * * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
 * * Update the key length that should be used for Easy DKIM.
 * * Change from using no DKIM authentication to using Easy DKIM.
 * * Change from using no DKIM authentication to using BYODKIM.
 * * Change from using Easy DKIM to using BYODKIM.
 * * Change from using BYODKIM to using Easy DKIM.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DkimSigningAttributesProperty dkimSigningAttributesProperty =
 * DkimSigningAttributesProperty.builder()
 * .domainSigningPrivateKey("domainSigningPrivateKey")
 * .domainSigningSelector("domainSigningSelector")
 * .nextSigningKeyLength("nextSigningKeyLength")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html)
 */
@CdkDslMarker
public class CfnEmailIdentityDkimSigningAttributesPropertyDsl {
    private val cdkBuilder: CfnEmailIdentity.DkimSigningAttributesProperty.Builder =
        CfnEmailIdentity.DkimSigningAttributesProperty.builder()

    /**
     * @param domainSigningPrivateKey [Bring Your Own DKIM] A private key that's used to generate a
     *   DKIM signature. The private key must use 1024 or 2048-bit RSA encryption, and must be
     *   encoded using base64 encoding.
     *
     * Rather than embedding sensitive information directly in your CFN templates, we recommend you
     * use dynamic parameters in the stack template to reference sensitive information that is
     * stored and managed outside of CFN, such as in the AWS Systems Manager Parameter Store or AWS
     * Secrets Manager.
     *
     * For more information, see the
     * [Do not embed credentials in your templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * best practice.
     */
    public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
        cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    /**
     * @param domainSigningSelector [Bring Your Own DKIM] A string that's used to identify a public
     *   key in the DNS configuration for a domain.
     */
    public fun domainSigningSelector(domainSigningSelector: String) {
        cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    /**
     * @param nextSigningKeyLength [Easy DKIM] The key length of the future DKIM key pair to be
     *   generated. This can be changed at most once per day.
     *
     * Valid Values: `RSA_1024_BIT | RSA_2048_BIT`
     */
    public fun nextSigningKeyLength(nextSigningKeyLength: String) {
        cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
    }

    public fun build(): CfnEmailIdentity.DkimSigningAttributesProperty = cdkBuilder.build()
}
