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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration

/**
 * Trace content for your wireless gateway and wireless device resources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * TraceContentProperty traceContentProperty = TraceContentProperty.builder()
 * .logLevel("logLevel")
 * .wirelessDeviceFrameInfo("wirelessDeviceFrameInfo")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html)
 */
@CdkDslMarker
public class CfnNetworkAnalyzerConfigurationTraceContentPropertyDsl {
    private val cdkBuilder: CfnNetworkAnalyzerConfiguration.TraceContentProperty.Builder =
        CfnNetworkAnalyzerConfiguration.TraceContentProperty.builder()

    /**
     * @param logLevel The log level for a log message. The log levels can be disabled, or set to
     *   `ERROR` to display less verbose logs containing only error information, or to `INFO` for
     *   more detailed logs
     */
    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    /**
     * @param wirelessDeviceFrameInfo `FrameInfo` of your wireless device resources for the trace
     *   content. Use FrameInfo to debug the communication between your LoRaWAN end devices and the
     *   network server.
     */
    public fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String) {
        cdkBuilder.wirelessDeviceFrameInfo(wirelessDeviceFrameInfo)
    }

    public fun build(): CfnNetworkAnalyzerConfiguration.TraceContentProperty = cdkBuilder.build()
}
