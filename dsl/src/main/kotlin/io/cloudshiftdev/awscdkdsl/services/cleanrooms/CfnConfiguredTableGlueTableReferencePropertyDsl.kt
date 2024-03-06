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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * A reference to a table within an AWS Glue data catalog.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * GlueTableReferenceProperty glueTableReferenceProperty = GlueTableReferenceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-gluetablereference.html)
 */
@CdkDslMarker
public class CfnConfiguredTableGlueTableReferencePropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.GlueTableReferenceProperty.Builder =
        CfnConfiguredTable.GlueTableReferenceProperty.builder()

    /** @param databaseName The name of the database the AWS Glue table belongs to. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param tableName The name of the AWS Glue table. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnConfiguredTable.GlueTableReferenceProperty = cdkBuilder.build()
}
