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
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

/**
 * Specifies the recording strategy of the configuration recorder.
 *
 * Valid values include: `ALL_SUPPORTED_RESOURCE_TYPES` , `INCLUSION_BY_RESOURCE_TYPES` , and
 * `EXCLUSION_BY_RESOURCE_TYPES` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * RecordingStrategyProperty recordingStrategyProperty = RecordingStrategyProperty.builder()
 * .useOnly("useOnly")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
 */
@CdkDslMarker
public class CfnConfigurationRecorderRecordingStrategyPropertyDsl {
    private val cdkBuilder: CfnConfigurationRecorder.RecordingStrategyProperty.Builder =
        CfnConfigurationRecorder.RecordingStrategyProperty.builder()

    /**
     * @param useOnly The recording strategy for the configuration recorder.
     * * If you set this option to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration
     *   changes for all supported resource types, excluding the global IAM resource types. You also
     *   must set the `AllSupported` field of
     *   [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     *   to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
     *   starts recording resources of that type. For a list of supported resource types, see
     *   [Supported Resource Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
     *   in the *AWS Config developer guide* .
     * * If you set this option to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration
     *   changes for only the resource types that you specify in the `ResourceTypes` field of
     *   [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     *   .
     * * If you set this option to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration
     *   changes for all supported resource types, except the resource types that you specify to
     *   exclude from being recorded in the `ResourceTypes` field of
     *   [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     *   .
     *
     * *Required and optional fields*
     *
     * The `recordingStrategy` field is optional when you set the `AllSupported` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` .
     *
     * The `recordingStrategy` field is optional when you list resource types in the `ResourceTypes`
     * field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * .
     *
     * The `recordingStrategy` field is required if you list resource types to exclude from
     * recording in the `ResourceTypes` field of
     * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     * . &gt; *Overriding fields*
     *
     * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
     * `ExclusionByResourceTypes` field will override other properties in the request.
     *
     * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource types
     * will still be automatically recorded in this option unless those resource types are
     * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes`
     * . &gt; *Global resource types and the exclusion recording strategy*
     *
     * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
     * Config adds support for a new resource type in the Region where you set up the configuration
     * recorder, including global resource types, AWS Config starts recording resources of that type
     * automatically.
     *
     * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
     * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
     *
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where
     * you set up the configuration recorder if that is a Region where AWS Config was available
     * before February 2022. You cannot be record the global IAM resouce types in Regions supported
     * by AWS Config after February 2022. This list where you cannot record the global IAM resource
     * types includes the following Regions:
     * * Asia Pacific (Hyderabad)
     * * Asia Pacific (Melbourne)
     * * Canada West (Calgary)
     * * Europe (Spain)
     * * Europe (Zurich)
     * * Israel (Tel Aviv)
     * * Middle East (UAE)
     */
    public fun useOnly(useOnly: String) {
        cdkBuilder.useOnly(useOnly)
    }

    public fun build(): CfnConfigurationRecorder.RecordingStrategyProperty = cdkBuilder.build()
}
