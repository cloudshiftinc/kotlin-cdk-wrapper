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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A view of a data source that contains information about the shape of the data in the underlying
 * source.
 *
 * This is a variant type structure. For this structure to be valid, only one of the attributes can
 * be non-null.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PhysicalTableProperty physicalTableProperty = PhysicalTableProperty.builder()
 * .customSql(CustomSqlProperty.builder()
 * .columns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .dataSourceArn("dataSourceArn")
 * .name("name")
 * .sqlQuery("sqlQuery")
 * .build())
 * .relationalTable(RelationalTableProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * .inputColumns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .catalog("catalog")
 * .schema("schema")
 * .build())
 * .s3Source(S3SourceProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * .inputColumns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .uploadSettings(UploadSettingsProperty.builder()
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .format("format")
 * .startFromRow(123)
 * .textQualifier("textQualifier")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html)
 */
@CdkDslMarker
public class CfnDataSetPhysicalTablePropertyDsl {
    private val cdkBuilder: CfnDataSet.PhysicalTableProperty.Builder =
        CfnDataSet.PhysicalTableProperty.builder()

    /** @param customSql A physical table type built from the results of the custom SQL query. */
    public fun customSql(customSql: IResolvable) {
        cdkBuilder.customSql(customSql)
    }

    /** @param customSql A physical table type built from the results of the custom SQL query. */
    public fun customSql(customSql: CfnDataSet.CustomSqlProperty) {
        cdkBuilder.customSql(customSql)
    }

    /** @param relationalTable A physical table type for relational data sources. */
    public fun relationalTable(relationalTable: IResolvable) {
        cdkBuilder.relationalTable(relationalTable)
    }

    /** @param relationalTable A physical table type for relational data sources. */
    public fun relationalTable(relationalTable: CfnDataSet.RelationalTableProperty) {
        cdkBuilder.relationalTable(relationalTable)
    }

    /** @param s3Source A physical table type for as S3 data source. */
    public fun s3Source(s3Source: IResolvable) {
        cdkBuilder.s3Source(s3Source)
    }

    /** @param s3Source A physical table type for as S3 data source. */
    public fun s3Source(s3Source: CfnDataSet.S3SourceProperty) {
        cdkBuilder.s3Source(s3Source)
    }

    public fun build(): CfnDataSet.PhysicalTableProperty = cdkBuilder.build()
}
