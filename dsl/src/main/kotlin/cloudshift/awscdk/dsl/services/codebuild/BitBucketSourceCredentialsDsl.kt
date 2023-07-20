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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class BitBucketSourceCredentialsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BitBucketSourceCredentials.Builder =
        BitBucketSourceCredentials.Builder.create(scope, id)

    public fun password(password: SecretValue) {
        cdkBuilder.password(password)
    }

    public fun username(username: SecretValue) {
        cdkBuilder.username(username)
    }

    public fun build(): BitBucketSourceCredentials = cdkBuilder.build()
}
