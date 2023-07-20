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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import kotlin.String

@CdkDslMarker
public class CfnResourceDataSyncS3DestinationPropertyDsl {
    private val cdkBuilder: CfnResourceDataSync.S3DestinationProperty.Builder =
        CfnResourceDataSync.S3DestinationProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun bucketRegion(bucketRegion: String) {
        cdkBuilder.bucketRegion(bucketRegion)
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun syncFormat(syncFormat: String) {
        cdkBuilder.syncFormat(syncFormat)
    }

    public fun build(): CfnResourceDataSync.S3DestinationProperty = cdkBuilder.build()
}
