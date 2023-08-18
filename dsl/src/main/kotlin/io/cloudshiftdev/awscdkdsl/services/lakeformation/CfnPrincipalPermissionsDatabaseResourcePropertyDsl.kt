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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

/**
 * A structure for the database object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * DatabaseResourceProperty databaseResourceProperty = DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsDatabaseResourcePropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.DatabaseResourceProperty.Builder =
        CfnPrincipalPermissions.DatabaseResourceProperty.builder()

    /**
     * @param catalogId The identifier for the Data Catalog. By default, it is the account ID of the
     *   caller.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param name The name of the database resource. Unique to the Data Catalog. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPrincipalPermissions.DatabaseResourceProperty = cdkBuilder.build()
}
