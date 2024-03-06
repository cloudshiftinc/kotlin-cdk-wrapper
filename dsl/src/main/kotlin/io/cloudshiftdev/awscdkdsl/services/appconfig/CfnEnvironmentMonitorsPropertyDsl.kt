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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnEnvironment

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * MonitorsProperty monitorsProperty = MonitorsProperty.builder()
 * .alarmArn("alarmArn")
 * .alarmRoleArn("alarmRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html)
 */
@CdkDslMarker
public class CfnEnvironmentMonitorsPropertyDsl {
    private val cdkBuilder: CfnEnvironment.MonitorsProperty.Builder =
        CfnEnvironment.MonitorsProperty.builder()

    /** @param alarmArn the value to be set. */
    public fun alarmArn(alarmArn: String) {
        cdkBuilder.alarmArn(alarmArn)
    }

    /** @param alarmRoleArn the value to be set. */
    public fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
    }

    public fun build(): CfnEnvironment.MonitorsProperty = cdkBuilder.build()
}
