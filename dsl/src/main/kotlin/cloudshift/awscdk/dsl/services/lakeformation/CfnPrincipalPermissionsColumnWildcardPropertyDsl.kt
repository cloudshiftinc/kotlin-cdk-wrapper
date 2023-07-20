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
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPrincipalPermissionsColumnWildcardPropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.ColumnWildcardProperty.Builder =
        CfnPrincipalPermissions.ColumnWildcardProperty.builder()

    private val _excludedColumnNames: MutableList<String> = mutableListOf()

    public fun excludedColumnNames(vararg excludedColumnNames: String) {
        _excludedColumnNames.addAll(listOf(*excludedColumnNames))
    }

    public fun excludedColumnNames(excludedColumnNames: Collection<String>) {
        _excludedColumnNames.addAll(excludedColumnNames)
    }

    public fun build(): CfnPrincipalPermissions.ColumnWildcardProperty {
        if (_excludedColumnNames.isNotEmpty()) cdkBuilder.excludedColumnNames(_excludedColumnNames)
        return cdkBuilder.build()
    }
}
