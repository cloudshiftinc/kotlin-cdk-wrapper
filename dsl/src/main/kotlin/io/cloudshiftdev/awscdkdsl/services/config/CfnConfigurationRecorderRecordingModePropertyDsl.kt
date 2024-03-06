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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

/**
 * Specifies the default recording frequency that AWS Config uses to record configuration changes.
 *
 * AWS Config supports *Continuous recording* and *Daily recording* .
 * * Continuous recording allows you to record configuration changes continuously whenever a change
 *   occurs.
 * * Daily recording allows you to receive a configuration item (CI) representing the most recent
 *   state of your resources over the last 24-hour period, only if it’s different from the previous
 *   CI recorded.
 *
 * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are using
 * Firewall Manager, it is recommended that you set the recording frequency to Continuous.
 *
 * You can also override the recording frequency for specific resource types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * RecordingModeProperty recordingModeProperty = RecordingModeProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * // the properties below are optional
 * .recordingModeOverrides(List.of(RecordingModeOverrideProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * .resourceTypes(List.of("resourceTypes"))
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmode.html)
 */
@CdkDslMarker
public class CfnConfigurationRecorderRecordingModePropertyDsl {
    private val cdkBuilder: CfnConfigurationRecorder.RecordingModeProperty.Builder =
        CfnConfigurationRecorder.RecordingModeProperty.builder()

    private val _recordingModeOverrides: MutableList<Any> = mutableListOf()

    /**
     * @param recordingFrequency The default recording frequency that AWS Config uses to record
     *   configuration changes.
     *
     * Daily recording is not supported for the following resource types:
     * * `AWS::Config::ResourceCompliance`
     * * `AWS::Config::ConformancePackCompliance`
     * * `AWS::Config::ConfigurationRecorder`
     *
     * For the *allSupported* ( `ALL_SUPPORTED_RESOURCE_TYPES` ) recording strategy, these resource
     * types will be set to Continuous recording.
     */
    public fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
    }

    /**
     * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to specify
     *   your overrides for the recording mode. The `recordingModeOverride` object in the
     *   `recordingModeOverrides` array consists of three fields: a `description` , the new
     *   `recordingFrequency` , and an array of `resourceTypes` to override.
     */
    public fun recordingModeOverrides(vararg recordingModeOverrides: Any) {
        _recordingModeOverrides.addAll(listOf(*recordingModeOverrides))
    }

    /**
     * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to specify
     *   your overrides for the recording mode. The `recordingModeOverride` object in the
     *   `recordingModeOverrides` array consists of three fields: a `description` , the new
     *   `recordingFrequency` , and an array of `resourceTypes` to override.
     */
    public fun recordingModeOverrides(recordingModeOverrides: Collection<Any>) {
        _recordingModeOverrides.addAll(recordingModeOverrides)
    }

    /**
     * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to specify
     *   your overrides for the recording mode. The `recordingModeOverride` object in the
     *   `recordingModeOverrides` array consists of three fields: a `description` , the new
     *   `recordingFrequency` , and an array of `resourceTypes` to override.
     */
    public fun recordingModeOverrides(recordingModeOverrides: IResolvable) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides)
    }

    public fun build(): CfnConfigurationRecorder.RecordingModeProperty {
        if (_recordingModeOverrides.isNotEmpty())
            cdkBuilder.recordingModeOverrides(_recordingModeOverrides)
        return cdkBuilder.build()
    }
}
