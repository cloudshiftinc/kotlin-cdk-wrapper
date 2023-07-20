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
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
import kotlin.String

@CdkDslMarker
public class OriginAccessIdentityPropsDsl {
    private val cdkBuilder: OriginAccessIdentityProps.Builder = OriginAccessIdentityProps.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): OriginAccessIdentityProps = cdkBuilder.build()
}
