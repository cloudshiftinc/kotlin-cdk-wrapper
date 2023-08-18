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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

/**
 * An Amazon CloudWatch alarm configured to monitor metrics on an endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * AlarmProperty alarmProperty = AlarmProperty.builder()
 * .alarmName("alarmName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-alarm.html)
 */
@CdkDslMarker
public class CfnEndpointAlarmPropertyDsl {
    private val cdkBuilder: CfnEndpoint.AlarmProperty.Builder = CfnEndpoint.AlarmProperty.builder()

    /** @param alarmName The name of a CloudWatch alarm in your account. */
    public fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
    }

    public fun build(): CfnEndpoint.AlarmProperty = cdkBuilder.build()
}
