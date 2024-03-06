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
import software.amazon.awscdk.services.glue.CfnDatabase

/**
 * A structure that describes a target database for resource linking.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * DatabaseIdentifierProperty databaseIdentifierProperty = DatabaseIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html)
 */
@CdkDslMarker
public class CfnDatabaseDatabaseIdentifierPropertyDsl {
    private val cdkBuilder: CfnDatabase.DatabaseIdentifierProperty.Builder =
        CfnDatabase.DatabaseIdentifierProperty.builder()

    /** @param catalogId The ID of the Data Catalog in which the database resides. */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param databaseName The name of the catalog database. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param region The Region of the database. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnDatabase.DatabaseIdentifierProperty = cdkBuilder.build()
}
