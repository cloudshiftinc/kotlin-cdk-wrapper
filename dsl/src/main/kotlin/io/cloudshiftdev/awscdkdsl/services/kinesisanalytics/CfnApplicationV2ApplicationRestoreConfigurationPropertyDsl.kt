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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Specifies the method and snapshot to use when restarting an application using previously saved
 * application state.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ApplicationRestoreConfigurationProperty applicationRestoreConfigurationProperty =
 * ApplicationRestoreConfigurationProperty.builder()
 * .applicationRestoreType("applicationRestoreType")
 * // the properties below are optional
 * .snapshotName("snapshotName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ApplicationRestoreConfigurationProperty.Builder =
        CfnApplicationV2.ApplicationRestoreConfigurationProperty.builder()

    /** @param applicationRestoreType Specifies how the application should be restored. */
    public fun applicationRestoreType(applicationRestoreType: String) {
        cdkBuilder.applicationRestoreType(applicationRestoreType)
    }

    /**
     * @param snapshotName The identifier of an existing snapshot of application state to use to
     *   restart an application. The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT`
     *   is specified for the `ApplicationRestoreType` .
     */
    public fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
    }

    public fun build(): CfnApplicationV2.ApplicationRestoreConfigurationProperty =
        cdkBuilder.build()
}
