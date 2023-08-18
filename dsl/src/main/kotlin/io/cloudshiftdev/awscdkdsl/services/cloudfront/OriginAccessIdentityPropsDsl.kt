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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps

/**
 * Properties of CloudFront OriginAccessIdentity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginAccessIdentityProps originAccessIdentityProps = OriginAccessIdentityProps.builder()
 * .comment("comment")
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginAccessIdentityPropsDsl {
    private val cdkBuilder: OriginAccessIdentityProps.Builder = OriginAccessIdentityProps.builder()

    /** @param comment Any comments you want to include about the origin access identity. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): OriginAccessIdentityProps = cdkBuilder.build()
}
