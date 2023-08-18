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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * The configuration parameters for the default Amazon Glue database.
 *
 * You use this database for SQL queries that you write in a Kinesis Data Analytics Studio notebook.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CatalogConfigurationProperty catalogConfigurationProperty =
 * CatalogConfigurationProperty.builder()
 * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
 * .databaseArn("databaseArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2CatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.CatalogConfigurationProperty.Builder =
        CfnApplicationV2.CatalogConfigurationProperty.builder()

    /**
     * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon Glue
     *   database. You use this database for Apache Flink SQL queries and table API transforms that
     *   you write in a Kinesis Data Analytics Studio notebook.
     */
    public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
    }

    /**
     * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon Glue
     *   database. You use this database for Apache Flink SQL queries and table API transforms that
     *   you write in a Kinesis Data Analytics Studio notebook.
     */
    public fun glueDataCatalogConfiguration(
        glueDataCatalogConfiguration: CfnApplicationV2.GlueDataCatalogConfigurationProperty
    ) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
    }

    public fun build(): CfnApplicationV2.CatalogConfigurationProperty = cdkBuilder.build()
}
