@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * The configuration object that specifies the snapshot to use as the origin of the data for the
 * volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * OriginSnapshotProperty originSnapshotProperty = OriginSnapshotProperty.builder()
 * .copyStrategy("copyStrategy")
 * .snapshotArn("snapshotArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html)
 */
@CdkDslMarker
public class CfnVolumeOriginSnapshotPropertyDsl {
    private val cdkBuilder: CfnVolume.OriginSnapshotProperty.Builder =
        CfnVolume.OriginSnapshotProperty.builder()

    /**
     * @param copyStrategy Specifies the strategy used when copying data from the snapshot to the
     *   new volume.
     * * `CLONE` - The new volume references the data in the origin snapshot. Cloning a snapshot is
     *   faster than copying data from the snapshot to a new volume and doesn't consume disk
     *   throughput. However, the origin snapshot can't be deleted if there is a volume using its
     *   copied data.
     * * `FULL_COPY` - Copies all data from the snapshot to the new volume.
     *
     * Specify this option to create the volume from a snapshot on another FSx for OpenZFS file
     * system.
     *
     * The `INCREMENTAL_COPY` option is only for updating an existing volume by using a snapshot
     * from another FSx for OpenZFS file system. For more information, see
     * [CopySnapshotAndUpdateVolume](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CopySnapshotAndUpdateVolume.html)
     * .
     */
    public fun copyStrategy(copyStrategy: String) {
        cdkBuilder.copyStrategy(copyStrategy)
    }

    /**
     * @param snapshotArn Specifies the snapshot to use when creating an OpenZFS volume from a
     *   snapshot.
     */
    public fun snapshotArn(snapshotArn: String) {
        cdkBuilder.snapshotArn(snapshotArn)
    }

    public fun build(): CfnVolume.OriginSnapshotProperty = cdkBuilder.build()
}
