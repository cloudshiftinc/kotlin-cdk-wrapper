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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Specifies elements that Amazon AppFlow includes in the file and folder names in the flow
 * destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * PrefixConfigProperty prefixConfigProperty = PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-prefixconfig.html)
 */
@CdkDslMarker
public class CfnFlowPrefixConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.PrefixConfigProperty.Builder =
        CfnFlow.PrefixConfigProperty.builder()

    private val _pathPrefixHierarchy: MutableList<String> = mutableListOf()

    /**
     * @param pathPrefixHierarchy Specifies whether the destination file path includes either or
     *   both of the following elements:.
     * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
     * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
     *   version number. The version number increases by one when you change any of the following
     *   settings in your flow configuration:
     * * Source-to-destination field mappings
     * * Field data types
     * * Partition keys
     */
    public fun pathPrefixHierarchy(vararg pathPrefixHierarchy: String) {
        _pathPrefixHierarchy.addAll(listOf(*pathPrefixHierarchy))
    }

    /**
     * @param pathPrefixHierarchy Specifies whether the destination file path includes either or
     *   both of the following elements:.
     * * **EXECUTION_ID** - The ID that Amazon AppFlow assigns to the flow run.
     * * **SCHEMA_VERSION** - The version number of your data schema. Amazon AppFlow assigns this
     *   version number. The version number increases by one when you change any of the following
     *   settings in your flow configuration:
     * * Source-to-destination field mappings
     * * Field data types
     * * Partition keys
     */
    public fun pathPrefixHierarchy(pathPrefixHierarchy: Collection<String>) {
        _pathPrefixHierarchy.addAll(pathPrefixHierarchy)
    }

    /**
     * @param prefixFormat Determines the level of granularity for the date and time that's included
     *   in the prefix.
     */
    public fun prefixFormat(prefixFormat: String) {
        cdkBuilder.prefixFormat(prefixFormat)
    }

    /**
     * @param prefixType Determines the format of the prefix, and whether it applies to the file
     *   name, file path, or both.
     */
    public fun prefixType(prefixType: String) {
        cdkBuilder.prefixType(prefixType)
    }

    public fun build(): CfnFlow.PrefixConfigProperty {
        if (_pathPrefixHierarchy.isNotEmpty()) cdkBuilder.pathPrefixHierarchy(_pathPrefixHierarchy)
        return cdkBuilder.build()
    }
}
