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
import software.amazon.awscdk.services.cloudfront.PublicKeyProps
import kotlin.String

@CdkDslMarker
public class PublicKeyPropsDsl {
    private val cdkBuilder: PublicKeyProps.Builder = PublicKeyProps.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
    }

    public fun publicKeyName(publicKeyName: String) {
        cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): PublicKeyProps = cdkBuilder.build()
}
