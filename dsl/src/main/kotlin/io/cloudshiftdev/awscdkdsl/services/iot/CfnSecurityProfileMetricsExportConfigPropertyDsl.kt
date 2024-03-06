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
 * Specifies the MQTT topic and role ARN required for metric export.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * MetricsExportConfigProperty metricsExportConfigProperty = MetricsExportConfigProperty.builder()
 * .mqttTopic("mqttTopic")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricsexportconfig.html)
 */
@CdkDslMarker
public class CfnSecurityProfileMetricsExportConfigPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.MetricsExportConfigProperty.Builder =
        CfnSecurityProfile.MetricsExportConfigProperty.builder()

    /**
     * @param mqttTopic The MQTT topic that Device Defender Detect should publish messages to for
     *   metrics export.
     */
    public fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
    }

    /**
     * @param roleArn This role ARN has permission to publish MQTT messages, after which Device
     *   Defender Detect can assume the role and publish messages on your behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnSecurityProfile.MetricsExportConfigProperty = cdkBuilder.build()
}
