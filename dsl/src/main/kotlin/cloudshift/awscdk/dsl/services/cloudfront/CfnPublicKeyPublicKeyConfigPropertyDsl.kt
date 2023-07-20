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
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import kotlin.String

@CdkDslMarker
public class CfnPublicKeyPublicKeyConfigPropertyDsl {
    private val cdkBuilder: CfnPublicKey.PublicKeyConfigProperty.Builder =
        CfnPublicKey.PublicKeyConfigProperty.builder()

    public fun callerReference(callerReference: String) {
        cdkBuilder.callerReference(callerReference)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPublicKey.PublicKeyConfigProperty = cdkBuilder.build()
}
