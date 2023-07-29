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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * The configuration of the Glue Data Catalog that you use for Apache Flink SQL queries and table
 * API transforms that you write in an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * GlueDataCatalogConfigurationProperty glueDataCatalogConfigurationProperty =
 * GlueDataCatalogConfigurationProperty.builder()
 * .databaseArn("databaseArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.GlueDataCatalogConfigurationProperty.Builder =
        CfnApplicationV2.GlueDataCatalogConfigurationProperty.builder()

    /** @param databaseArn The Amazon Resource Name (ARN) of the database. */
    public fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
    }

    public fun build(): CfnApplicationV2.GlueDataCatalogConfigurationProperty = cdkBuilder.build()
}
