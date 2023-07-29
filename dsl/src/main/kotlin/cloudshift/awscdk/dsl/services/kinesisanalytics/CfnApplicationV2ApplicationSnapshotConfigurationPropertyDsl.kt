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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ApplicationSnapshotConfigurationProperty applicationSnapshotConfigurationProperty =
 * ApplicationSnapshotConfigurationProperty.builder()
 * .snapshotsEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2ApplicationSnapshotConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder =
        CfnApplicationV2.ApplicationSnapshotConfigurationProperty.builder()

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

    public fun build(): CfnApplicationV2.ApplicationSnapshotConfigurationProperty =
        cdkBuilder.build()
}
