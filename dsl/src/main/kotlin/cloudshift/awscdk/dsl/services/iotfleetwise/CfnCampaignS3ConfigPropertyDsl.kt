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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import kotlin.String

@CdkDslMarker
public class CfnCampaignS3ConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.S3ConfigProperty.Builder =
        CfnCampaign.S3ConfigProperty.builder()

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun storageCompressionFormat(storageCompressionFormat: String) {
        cdkBuilder.storageCompressionFormat(storageCompressionFormat)
    }

    public fun build(): CfnCampaign.S3ConfigProperty = cdkBuilder.build()
}
