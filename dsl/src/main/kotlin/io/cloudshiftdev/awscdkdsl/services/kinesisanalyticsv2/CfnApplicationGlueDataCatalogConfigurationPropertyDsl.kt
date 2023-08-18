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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * The configuration of the Glue Data Catalog that you use for Apache Flink SQL queries and table
 * API transforms that you write in an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * GlueDataCatalogConfigurationProperty glueDataCatalogConfigurationProperty =
 * GlueDataCatalogConfigurationProperty.builder()
 * .databaseArn("databaseArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationGlueDataCatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.GlueDataCatalogConfigurationProperty.Builder =
        CfnApplication.GlueDataCatalogConfigurationProperty.builder()

    /** @param databaseArn The Amazon Resource Name (ARN) of the database. */
    public fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
    }

    public fun build(): CfnApplication.GlueDataCatalogConfigurationProperty = cdkBuilder.build()
}
