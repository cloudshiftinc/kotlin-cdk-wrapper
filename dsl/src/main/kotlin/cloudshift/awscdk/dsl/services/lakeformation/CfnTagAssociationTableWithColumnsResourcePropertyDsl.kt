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
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTagAssociationTableWithColumnsResourcePropertyDsl {
    private val cdkBuilder: CfnTagAssociation.TableWithColumnsResourceProperty.Builder =
        CfnTagAssociation.TableWithColumnsResourceProperty.builder()

    private val _columnNames: MutableList<String> = mutableListOf()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun columnNames(vararg columnNames: String) {
        _columnNames.addAll(listOf(*columnNames))
    }

    public fun columnNames(columnNames: Collection<String>) {
        _columnNames.addAll(columnNames)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTagAssociation.TableWithColumnsResourceProperty {
        if (_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
        return cdkBuilder.build()
    }
}
