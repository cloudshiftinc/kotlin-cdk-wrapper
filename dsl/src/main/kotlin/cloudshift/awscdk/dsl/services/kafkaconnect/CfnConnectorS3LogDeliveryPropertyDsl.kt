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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnConnectorS3LogDeliveryPropertyDsl {
    private val cdkBuilder: CfnConnector.S3LogDeliveryProperty.Builder =
        CfnConnector.S3LogDeliveryProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnConnector.S3LogDeliveryProperty = cdkBuilder.build()
}
