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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTable

/**
 * A structure that describes a target table for resource linking.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * TableIdentifierProperty tableIdentifierProperty = TableIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html)
 */
@CdkDslMarker
public class CfnTableTableIdentifierPropertyDsl {
    private val cdkBuilder: CfnTable.TableIdentifierProperty.Builder =
        CfnTable.TableIdentifierProperty.builder()

    /** @param catalogId The ID of the Data Catalog in which the table resides. */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param databaseName The name of the catalog database that contains the target table. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param name The name of the target table. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTable.TableIdentifierProperty = cdkBuilder.build()
}
