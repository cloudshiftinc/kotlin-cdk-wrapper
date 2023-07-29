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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps

/**
 * Properties for defining a `CfnCloudFrontOriginAccessIdentity`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnCloudFrontOriginAccessIdentityProps cfnCloudFrontOriginAccessIdentityProps =
 * CfnCloudFrontOriginAccessIdentityProps.builder()
 * .cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty.builder()
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
@CdkDslMarker
public class CfnCloudFrontOriginAccessIdentityPropsDsl {
    private val cdkBuilder: CfnCloudFrontOriginAccessIdentityProps.Builder =
        CfnCloudFrontOriginAccessIdentityProps.builder()

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     *   identity.
     */
    public fun cloudFrontOriginAccessIdentityConfig(
        cloudFrontOriginAccessIdentityConfig: IResolvable
    ) {
        cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
    }

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     *   identity.
     */
    public fun cloudFrontOriginAccessIdentityConfig(
        cloudFrontOriginAccessIdentityConfig:
            CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
    ) {
        cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
    }

    public fun build(): CfnCloudFrontOriginAccessIdentityProps = cdkBuilder.build()
}
