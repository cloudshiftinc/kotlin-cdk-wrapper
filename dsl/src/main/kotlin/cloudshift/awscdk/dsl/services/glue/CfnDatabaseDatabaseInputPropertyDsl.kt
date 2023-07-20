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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDatabaseDatabaseInputPropertyDsl {
    private val cdkBuilder: CfnDatabase.DatabaseInputProperty.Builder =
        CfnDatabase.DatabaseInputProperty.builder()

    private val _createTableDefaultPermissions: MutableList<Any> = mutableListOf()

    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any) {
        _createTableDefaultPermissions.addAll(listOf(*createTableDefaultPermissions))
    }

    public fun createTableDefaultPermissions(createTableDefaultPermissions: Collection<Any>) {
        _createTableDefaultPermissions.addAll(createTableDefaultPermissions)
    }

    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun federatedDatabase(federatedDatabase: IResolvable) {
        cdkBuilder.federatedDatabase(federatedDatabase)
    }

    public fun federatedDatabase(federatedDatabase: CfnDatabase.FederatedDatabaseProperty) {
        cdkBuilder.federatedDatabase(federatedDatabase)
    }

    public fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun targetDatabase(targetDatabase: IResolvable) {
        cdkBuilder.targetDatabase(targetDatabase)
    }

    public fun targetDatabase(targetDatabase: CfnDatabase.DatabaseIdentifierProperty) {
        cdkBuilder.targetDatabase(targetDatabase)
    }

    public fun build(): CfnDatabase.DatabaseInputProperty {
        if (_createTableDefaultPermissions.isNotEmpty()) {
            cdkBuilder.createTableDefaultPermissions(_createTableDefaultPermissions)
        }
        return cdkBuilder.build()
    }
}
