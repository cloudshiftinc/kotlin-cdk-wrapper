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
 * Specifies whether the configuration recorder excludes certain resource types from being recorded.
 *
 * Use the `ResourceTypes` field to enter a comma-separated list of resource types you want to
 * exclude from recording.
 *
 * By default, when AWS Config adds support for a new resource type in the Region where you set up
 * the configuration recorder, including global resource types, AWS Config starts recording
 * resources of that type automatically.
 *
 * *How to use the exclusion recording strategy*
 *
 * To use this option, you must set the `useOnly` field of
 * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
 * to `EXCLUSION_BY_RESOURCE_TYPES` .
 *
 * AWS Config will then record configuration changes for all supported resource types, except the
 * resource types that you specify to exclude from being recorded.
 *
 * *Global resource types and the exclusion recording strategy*
 *
 * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
 * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
 *
 * IAM users, groups, roles, and customer managed policies will be recorded in the Region where you
 * set up the configuration recorder if that is a Region where AWS Config was available before
 * February
 * 2022. You cannot be record the global IAM resouce types in Regions supported by AWS Config after
 *       February 2022. This list where you cannot record the global IAM resource types includes the
 *       following Regions:
 * * Asia Pacific (Hyderabad)
 * * Asia Pacific (Melbourne)
 * * Canada West (Calgary)
 * * Europe (Spain)
 * * Europe (Zurich)
 * * Israel (Tel Aviv)
 * * Middle East (UAE)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * ExclusionByResourceTypesProperty exclusionByResourceTypesProperty =
 * ExclusionByResourceTypesProperty.builder()
 * .resourceTypes(List.of("resourceTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-exclusionbyresourcetypes.html)
 */
@CdkDslMarker
public class CfnConfigurationRecorderExclusionByResourceTypesPropertyDsl {
    private val cdkBuilder: CfnConfigurationRecorder.ExclusionByResourceTypesProperty.Builder =
        CfnConfigurationRecorder.ExclusionByResourceTypesProperty.builder()

    private val _resourceTypes: MutableList<String> = mutableListOf()

    /**
     * @param resourceTypes A comma-separated list of resource types to exclude from recording by
     *   the configuration recorder.
     */
    public fun resourceTypes(vararg resourceTypes: String) {
        _resourceTypes.addAll(listOf(*resourceTypes))
    }

    /**
     * @param resourceTypes A comma-separated list of resource types to exclude from recording by
     *   the configuration recorder.
     */
    public fun resourceTypes(resourceTypes: Collection<String>) {
        _resourceTypes.addAll(resourceTypes)
    }

    public fun build(): CfnConfigurationRecorder.ExclusionByResourceTypesProperty {
        if (_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
        return cdkBuilder.build()
    }
}
