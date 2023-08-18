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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

/**
 * A complex type that contains an optional comment about your hosted zone.
 *
 * If you don't want to specify a comment, omit both the `HostedZoneConfig` and `Comment` elements.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * HostedZoneConfigProperty hostedZoneConfigProperty = HostedZoneConfigProperty.builder()
 * .comment("comment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html)
 */
@CdkDslMarker
public class CfnHostedZoneHostedZoneConfigPropertyDsl {
    private val cdkBuilder: CfnHostedZone.HostedZoneConfigProperty.Builder =
        CfnHostedZone.HostedZoneConfigProperty.builder()

    /** @param comment Any comments that you want to include about the hosted zone. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): CfnHostedZone.HostedZoneConfigProperty = cdkBuilder.build()
}
