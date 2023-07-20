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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnBrokerEncryptionOptionsPropertyDsl {
    private val cdkBuilder: CfnBroker.EncryptionOptionsProperty.Builder =
        CfnBroker.EncryptionOptionsProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun useAwsOwnedKey(useAwsOwnedKey: Boolean) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey)
    }

    public fun useAwsOwnedKey(useAwsOwnedKey: IResolvable) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey)
    }

    public fun build(): CfnBroker.EncryptionOptionsProperty = cdkBuilder.build()
}
