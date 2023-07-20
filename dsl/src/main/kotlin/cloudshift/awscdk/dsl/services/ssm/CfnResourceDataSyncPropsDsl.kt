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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
import kotlin.String

@CdkDslMarker
public class CfnResourceDataSyncPropsDsl {
    private val cdkBuilder: CfnResourceDataSyncProps.Builder = CfnResourceDataSyncProps.builder()

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

    public fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination)
    }

    public fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty) {
        cdkBuilder.s3Destination(s3Destination)
    }

    public fun syncFormat(syncFormat: String) {
        cdkBuilder.syncFormat(syncFormat)
    }

    public fun syncName(syncName: String) {
        cdkBuilder.syncName(syncName)
    }

    public fun syncSource(syncSource: IResolvable) {
        cdkBuilder.syncSource(syncSource)
    }

    public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty) {
        cdkBuilder.syncSource(syncSource)
    }

    public fun syncType(syncType: String) {
        cdkBuilder.syncType(syncType)
    }

    public fun build(): CfnResourceDataSyncProps = cdkBuilder.build()
}
