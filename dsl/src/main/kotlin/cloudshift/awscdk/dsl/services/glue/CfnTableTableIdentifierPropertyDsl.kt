@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableTableIdentifierPropertyDsl {
    private val cdkBuilder: CfnTable.TableIdentifierProperty.Builder =
        CfnTable.TableIdentifierProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTable.TableIdentifierProperty = cdkBuilder.build()
}
