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
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.constructs.Construct

/**
 * An origin access identity is a special CloudFront user that you can associate with Amazon S3
 * origins, so that you can secure all or just some of your Amazon S3 content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginAccessIdentity originAccessIdentity = OriginAccessIdentity.Builder.create(this,
 * "MyOriginAccessIdentity")
 * .comment("comment")
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginAccessIdentityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: OriginAccessIdentity.Builder =
        OriginAccessIdentity.Builder.create(scope, id)

    /**
     * Any comments you want to include about the origin access identity.
     *
     * Default: "Allows CloudFront to reach the bucket"
     *
     * @param comment Any comments you want to include about the origin access identity.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): OriginAccessIdentity = cdkBuilder.build()
}
