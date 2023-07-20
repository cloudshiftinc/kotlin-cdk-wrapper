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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions
import kotlin.Boolean

@CdkDslMarker
public class EncryptionAtRestOptionsDsl {
    private val cdkBuilder: EncryptionAtRestOptions.Builder = EncryptionAtRestOptions.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): EncryptionAtRestOptions = cdkBuilder.build()
}
