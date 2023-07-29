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
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain

/**
 * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your
 * application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CustomDomainConfigTypeProperty customDomainConfigTypeProperty =
 * CustomDomainConfigTypeProperty.builder()
 * .certificateArn("certificateArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html)
 */
@CdkDslMarker
public class CfnUserPoolDomainCustomDomainConfigTypePropertyDsl {
    private val cdkBuilder: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder =
        CfnUserPoolDomain.CustomDomainConfigTypeProperty.builder()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL
     *   certificate. You use this certificate for the subdomain of your custom domain.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun build(): CfnUserPoolDomain.CustomDomainConfigTypeProperty = cdkBuilder.build()
}
