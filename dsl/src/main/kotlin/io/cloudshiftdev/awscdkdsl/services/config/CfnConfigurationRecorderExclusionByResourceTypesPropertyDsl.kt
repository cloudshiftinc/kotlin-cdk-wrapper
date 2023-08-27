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
 * Specifies whether the configuration recorder excludes resource types from being recorded.
 *
 * Use the `resourceTypes` field to enter a comma-separated list of resource types to exclude as
 * exemptions.
 *
 * To use this option, you must set the `useOnly` field of
 * [AWS::Config::ConfigurationRecorder RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
 * to `EXCLUSION_BY_RESOURCE_TYPES` .
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
