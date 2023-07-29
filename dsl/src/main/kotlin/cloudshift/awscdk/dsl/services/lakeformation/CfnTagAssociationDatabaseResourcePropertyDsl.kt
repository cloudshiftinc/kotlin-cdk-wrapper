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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html)
 */
@CdkDslMarker
public class CfnTagAssociationDatabaseResourcePropertyDsl {
    private val cdkBuilder: CfnTagAssociation.DatabaseResourceProperty.Builder =
        CfnTagAssociation.DatabaseResourceProperty.builder()

    /**
     * @param catalogId The identifier for the Data Catalog . By default, it should be the account
     *   ID of the caller.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param name The name of the database resource. Unique to the Data Catalog. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTagAssociation.DatabaseResourceProperty = cdkBuilder.build()
}
