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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * ApplicationSnapshotConfigurationProperty applicationSnapshotConfigurationProperty =
 * ApplicationSnapshotConfigurationProperty.builder()
 * .snapshotsEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationApplicationSnapshotConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationSnapshotConfigurationProperty.Builder =
        CfnApplication.ApplicationSnapshotConfigurationProperty.builder()

    /**
     * @param snapshotsEnabled Describes whether snapshots are enabled for a Flink-based Kinesis
     *   Data Analytics application.
     */
    public fun snapshotsEnabled(snapshotsEnabled: Boolean) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
    }

    /**
     * @param snapshotsEnabled Describes whether snapshots are enabled for a Flink-based Kinesis
     *   Data Analytics application.
     */
    public fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
    }

    public fun build(): CfnApplication.ApplicationSnapshotConfigurationProperty = cdkBuilder.build()
}
