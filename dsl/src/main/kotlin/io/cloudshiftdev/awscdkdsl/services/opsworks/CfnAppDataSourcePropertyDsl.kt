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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
 * .arn("arn")
 * .databaseName("databaseName")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html)
 */
@CdkDslMarker
public class CfnAppDataSourcePropertyDsl {
    private val cdkBuilder: CfnApp.DataSourceProperty.Builder = CfnApp.DataSourceProperty.builder()

    /** @param arn The data source's ARN. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param databaseName The database name. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param type The data source's type, `AutoSelectOpsworksMysqlInstance` ,
     *   `OpsworksMysqlInstance` , `RdsDbInstance` , or `None` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnApp.DataSourceProperty = cdkBuilder.build()
}
