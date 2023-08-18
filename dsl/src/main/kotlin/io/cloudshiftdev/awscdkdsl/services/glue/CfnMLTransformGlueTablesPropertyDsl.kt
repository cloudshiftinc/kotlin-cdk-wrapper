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
import software.amazon.awscdk.services.glue.CfnMLTransform

/**
 * The database and table in the AWS Glue Data Catalog that is used for input or output data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * GlueTablesProperty glueTablesProperty = GlueTablesProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .connectionName("connectionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html)
 */
@CdkDslMarker
public class CfnMLTransformGlueTablesPropertyDsl {
    private val cdkBuilder: CfnMLTransform.GlueTablesProperty.Builder =
        CfnMLTransform.GlueTablesProperty.builder()

    /** @param catalogId A unique identifier for the AWS Glue Data Catalog . */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param connectionName The name of the connection to the AWS Glue Data Catalog . */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /** @param databaseName A database name in the AWS Glue Data Catalog . */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param tableName A table name in the AWS Glue Data Catalog . */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnMLTransform.GlueTablesProperty = cdkBuilder.build()
}
