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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

/**
 * An object for you to specify your overrides for the recording mode.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * RecordingModeOverrideProperty recordingModeOverrideProperty =
 * RecordingModeOverrideProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * .resourceTypes(List.of("resourceTypes"))
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html)
 */
@CdkDslMarker
public class CfnConfigurationRecorderRecordingModeOverridePropertyDsl {
    private val cdkBuilder: CfnConfigurationRecorder.RecordingModeOverrideProperty.Builder =
        CfnConfigurationRecorder.RecordingModeOverrideProperty.builder()

    private val _resourceTypes: MutableList<String> = mutableListOf()

    /** @param description A description that you provide for the override. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param recordingFrequency The recording frequency that will be applied to all the resource
     *   types specified in the override.
     * * Continuous recording allows you to record configuration changes continuously whenever a
     *   change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     *   recent state of your resources over the last 24-hour period, only if it’s different from
     *   the previous CI recorded.
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     */
    public fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
    }

    /**
     * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
     *   includes in the override.
     *
     * Daily recording is not supported for the following resource types:
     * * `AWS::Config::ResourceCompliance`
     * * `AWS::Config::ConformancePackCompliance`
     * * `AWS::Config::ConfigurationRecorder`
     */
    public fun resourceTypes(vararg resourceTypes: String) {
        _resourceTypes.addAll(listOf(*resourceTypes))
    }

    /**
     * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
     *   includes in the override.
     *
     * Daily recording is not supported for the following resource types:
     * * `AWS::Config::ResourceCompliance`
     * * `AWS::Config::ConformancePackCompliance`
     * * `AWS::Config::ConfigurationRecorder`
     */
    public fun resourceTypes(resourceTypes: Collection<String>) {
        _resourceTypes.addAll(resourceTypes)
    }

    public fun build(): CfnConfigurationRecorder.RecordingModeOverrideProperty {
        if (_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
        return cdkBuilder.build()
    }
}
