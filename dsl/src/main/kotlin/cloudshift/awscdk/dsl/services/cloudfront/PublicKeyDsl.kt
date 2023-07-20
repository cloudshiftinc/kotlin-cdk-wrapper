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
import software.amazon.awscdk.services.cloudfront.PublicKey
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class PublicKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PublicKey.Builder = PublicKey.Builder.create(scope, id)

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
    }

    public fun publicKeyName(publicKeyName: String) {
        cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): PublicKey = cdkBuilder.build()
}
