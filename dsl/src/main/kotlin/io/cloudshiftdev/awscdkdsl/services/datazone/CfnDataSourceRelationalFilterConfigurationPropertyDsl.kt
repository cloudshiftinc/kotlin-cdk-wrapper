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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The relational filter configuration for the data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RelationalFilterConfigurationProperty relationalFilterConfigurationProperty =
 * RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceRelationalFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.RelationalFilterConfigurationProperty.Builder =
        CfnDataSource.RelationalFilterConfigurationProperty.builder()

    private val _filterExpressions: MutableList<Any> = mutableListOf()

    /**
     * @param databaseName The database name specified in the relational filter configuration for
     *   the data source.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param filterExpressions The filter expressions specified in the relational filter
     *   configuration for the data source.
     */
    public fun filterExpressions(vararg filterExpressions: Any) {
        _filterExpressions.addAll(listOf(*filterExpressions))
    }

    /**
     * @param filterExpressions The filter expressions specified in the relational filter
     *   configuration for the data source.
     */
    public fun filterExpressions(filterExpressions: Collection<Any>) {
        _filterExpressions.addAll(filterExpressions)
    }

    /**
     * @param filterExpressions The filter expressions specified in the relational filter
     *   configuration for the data source.
     */
    public fun filterExpressions(filterExpressions: IResolvable) {
        cdkBuilder.filterExpressions(filterExpressions)
    }

    /**
     * @param schemaName The schema name specified in the relational filter configuration for the
     *   data source.
     */
    public fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
    }

    public fun build(): CfnDataSource.RelationalFilterConfigurationProperty {
        if (_filterExpressions.isNotEmpty()) cdkBuilder.filterExpressions(_filterExpressions)
        return cdkBuilder.build()
    }
}
