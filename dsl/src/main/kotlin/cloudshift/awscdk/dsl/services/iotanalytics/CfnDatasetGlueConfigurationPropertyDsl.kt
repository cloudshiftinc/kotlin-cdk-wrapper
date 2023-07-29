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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Configuration information for coordination with AWS Glue , a fully managed extract, transform and
 * load (ETL) service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * GlueConfigurationProperty glueConfigurationProperty = GlueConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetGlueConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.GlueConfigurationProperty.Builder =
        CfnDataset.GlueConfigurationProperty.builder()

    /**
     * @param databaseName The name of the database in your AWS Glue Data Catalog in which the table
     *   is located. An AWS Glue Data Catalog database contains metadata tables.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param tableName The name of the table in your AWS Glue Data Catalog that is used to perform
     *   the ETL operations. An AWS Glue Data Catalog table contains partitioned data and
     *   descriptions of data sources and targets.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnDataset.GlueConfigurationProperty = cdkBuilder.build()
}
