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
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset

/**
 * An object representing an AWS Glue table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * DataQualityTargetTableProperty dataQualityTargetTableProperty =
 * DataQualityTargetTableProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-dataqualityruleset-dataqualitytargettable.html)
 */
@CdkDslMarker
public class CfnDataQualityRulesetDataQualityTargetTablePropertyDsl {
    private val cdkBuilder: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder =
        CfnDataQualityRuleset.DataQualityTargetTableProperty.builder()

    /** @param databaseName The name of the database where the AWS Glue table exists. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param tableName The name of the AWS Glue table. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnDataQualityRuleset.DataQualityTargetTableProperty = cdkBuilder.build()
}
