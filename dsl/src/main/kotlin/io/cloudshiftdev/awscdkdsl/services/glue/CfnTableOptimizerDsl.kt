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
import software.constructs.Construct

/**
 * A resource that describes the AWS Glue resource for enabling compaction to improve read
 * performance for open table formats.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnTableOptimizer cfnTableOptimizer = CfnTableOptimizer.Builder.create(this,
 * "MyCfnTableOptimizer")
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
public class CfnTableOptimizerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTableOptimizer.Builder = CfnTableOptimizer.Builder.create(scope, id)

    /**
     * The catalog ID of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
     *
     * @param catalogId The catalog ID of the table.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
     *
     * @param databaseName The name of the database.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * The table name.
     *
     * For Hive compatibility, this must be entirely lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
     *
     * @param tableName The table name.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     *
     * @param tableOptimizerConfiguration
     */
    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable) {
        cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     *
     * @param tableOptimizerConfiguration
     */
    public fun tableOptimizerConfiguration(
        tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty
    ) {
        cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration)
    }

    /**
     * The type of table optimizer.
     *
     * Currently, the only valid value is compaction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
     *
     * @param type The type of table optimizer.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTableOptimizer = cdkBuilder.build()
}
