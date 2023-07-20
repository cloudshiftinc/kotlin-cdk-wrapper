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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.String

@CdkDslMarker
public class CfnDeliveryStreamKMSEncryptionConfigPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.KMSEncryptionConfigProperty.Builder =
        CfnDeliveryStream.KMSEncryptionConfigProperty.builder()

    public fun awskmsKeyArn(awskmsKeyArn: String) {
        cdkBuilder.awskmsKeyArn(awskmsKeyArn)
    }

    public fun build(): CfnDeliveryStream.KMSEncryptionConfigProperty = cdkBuilder.build()
}
