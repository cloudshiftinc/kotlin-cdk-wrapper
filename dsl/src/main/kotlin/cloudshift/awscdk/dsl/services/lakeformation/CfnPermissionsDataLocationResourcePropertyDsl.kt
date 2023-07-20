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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import kotlin.String

@CdkDslMarker
public class CfnPermissionsDataLocationResourcePropertyDsl {
    private val cdkBuilder: CfnPermissions.DataLocationResourceProperty.Builder =
        CfnPermissions.DataLocationResourceProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun s3Resource(s3Resource: String) {
        cdkBuilder.s3Resource(s3Resource)
    }

    public fun build(): CfnPermissions.DataLocationResourceProperty = cdkBuilder.build()
}
