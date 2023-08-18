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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.CfnMapping
import software.constructs.Construct

/**
 * Represents a CloudFormation mapping.
 *
 * Example:
 * ```
 * CfnMapping regionTable = CfnMapping.Builder.create(this, "RegionTable")
 * .mapping(Map.of(
 * "us-east-1", Map.of(
 * "regionName", "US East (N. Virginia)"),
 * "us-east-2", Map.of(
 * "regionName", "US East (Ohio)")))
 * .build();
 * regionTable.findInMap(Aws.REGION, "regionName");
 * ```
 */
@CdkDslMarker
public class CfnMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMapping.Builder = CfnMapping.Builder.create(scope, id)

    /** @param lazy */
    public fun lazy(lazy: Boolean) {
        cdkBuilder.lazy(lazy)
    }

    /**
     * Mapping of key to a set of corresponding set of named values.
     *
     * The key identifies a map of name-value pairs and must be unique within the mapping.
     *
     * For example, if you want to set values based on a region, you can create a mapping that uses
     * the region name as a key and contains the values you want to specify for each specific
     * region.
     *
     * Default: - No mapping.
     *
     * @param mapping Mapping of key to a set of corresponding set of named values.
     */
    public fun mapping(mapping: Map<String, Map<String, Any>>) {
        cdkBuilder.mapping(mapping)
    }

    public fun build(): CfnMapping = cdkBuilder.build()
}
