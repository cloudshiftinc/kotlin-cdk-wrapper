@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnCloudFrontOriginAccessIdentityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCloudFrontOriginAccessIdentity.Builder =
        CfnCloudFrontOriginAccessIdentity.Builder.create(scope, id)

    public fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
        cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
    }

    public fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty) {
        cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
    }

    public fun build(): CfnCloudFrontOriginAccessIdentity = cdkBuilder.build()
}
