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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * A structure containing the alert target ARN and the role ARN.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AlertTargetProperty alertTargetProperty = AlertTargetProperty.builder()
 * .alertTargetArn("alertTargetArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html)
 */
@CdkDslMarker
public class CfnSecurityProfileAlertTargetPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.AlertTargetProperty.Builder =
        CfnSecurityProfile.AlertTargetProperty.builder()

    /**
     * @param alertTargetArn The Amazon Resource Name (ARN) of the notification target to which
     *   alerts are sent.
     */
    public fun alertTargetArn(alertTargetArn: String) {
        cdkBuilder.alertTargetArn(alertTargetArn)
    }

    /**
     * @param roleArn The ARN of the role that grants permission to send alerts to the notification
     *   target.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnSecurityProfile.AlertTargetProperty = cdkBuilder.build()
}
