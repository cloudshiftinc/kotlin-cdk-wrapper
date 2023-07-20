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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPermissionsColumnWildcardPropertyDsl {
    private val cdkBuilder: CfnPermissions.ColumnWildcardProperty.Builder =
        CfnPermissions.ColumnWildcardProperty.builder()

    private val _excludedColumnNames: MutableList<String> = mutableListOf()

    public fun excludedColumnNames(vararg excludedColumnNames: String) {
        _excludedColumnNames.addAll(listOf(*excludedColumnNames))
    }

    public fun excludedColumnNames(excludedColumnNames: Collection<String>) {
        _excludedColumnNames.addAll(excludedColumnNames)
    }

    public fun build(): CfnPermissions.ColumnWildcardProperty {
        if (_excludedColumnNames.isNotEmpty()) cdkBuilder.excludedColumnNames(_excludedColumnNames)
        return cdkBuilder.build()
    }
}
