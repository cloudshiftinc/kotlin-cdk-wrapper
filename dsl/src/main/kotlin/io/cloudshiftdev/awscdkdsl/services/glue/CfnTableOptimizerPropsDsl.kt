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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTableOptimizer
import software.amazon.awscdk.services.glue.CfnTableOptimizerProps

/**
 * Properties for defining a `CfnTableOptimizer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnTableOptimizerProps cfnTableOptimizerProps = CfnTableOptimizerProps.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tableOptimizerConfiguration(TableOptimizerConfigurationProperty.builder()
 * .enabled(false)
 * .roleArn("roleArn")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html)
 */
@CdkDslMarker
public class CfnTableOptimizerPropsDsl {
    private val cdkBuilder: CfnTableOptimizerProps.Builder = CfnTableOptimizerProps.builder()

    /** @param catalogId The catalog ID of the table. */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseName The name of the database. For Hive compatibility, this is folded to
     *   lowercase when it is stored.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param tableName The table name. For Hive compatibility, this must be entirely lowercase. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /** @param tableOptimizerConfiguration the value to be set. */
    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable) {
        cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration)
    }

    /** @param tableOptimizerConfiguration the value to be set. */
    public fun tableOptimizerConfiguration(
        tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty
    ) {
        cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration)
    }

    /** @param type The type of table optimizer. Currently, the only valid value is compaction. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTableOptimizerProps = cdkBuilder.build()
}
