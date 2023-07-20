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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataLakeSettingsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataLakeSettings.Builder = CfnDataLakeSettings.Builder.create(
        scope,
        id,
    )

    private val _admins: MutableList<Any> = mutableListOf()

    private val _authorizedSessionTagValueList: MutableList<String> = mutableListOf()

    private val _createDatabaseDefaultPermissions: MutableList<Any> = mutableListOf()

    private val _createTableDefaultPermissions: MutableList<Any> = mutableListOf()

    private val _externalDataFilteringAllowList: MutableList<Any> = mutableListOf()

    private val _trustedResourceOwners: MutableList<String> = mutableListOf()

    public fun admins(vararg admins: Any) {
        _admins.addAll(listOf(*admins))
    }

    public fun admins(admins: Collection<Any>) {
        _admins.addAll(admins)
    }

    public fun admins(admins: IResolvable) {
        cdkBuilder.admins(admins)
    }

    public fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean) {
        cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

    public fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable) {
        cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

    public fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String) {
        _authorizedSessionTagValueList.addAll(listOf(*authorizedSessionTagValueList))
    }

    public fun authorizedSessionTagValueList(authorizedSessionTagValueList: Collection<String>) {
        _authorizedSessionTagValueList.addAll(authorizedSessionTagValueList)
    }

    public fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any) {
        _createDatabaseDefaultPermissions.addAll(listOf(*createDatabaseDefaultPermissions))
    }

    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: Collection<Any>) {
        _createDatabaseDefaultPermissions.addAll(createDatabaseDefaultPermissions)
    }

    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable) {
        cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions)
    }

    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any) {
        _createTableDefaultPermissions.addAll(listOf(*createTableDefaultPermissions))
    }

    public fun createTableDefaultPermissions(createTableDefaultPermissions: Collection<Any>) {
        _createTableDefaultPermissions.addAll(createTableDefaultPermissions)
    }

    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
    }

    public fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any) {
        _externalDataFilteringAllowList.addAll(listOf(*externalDataFilteringAllowList))
    }

    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: Collection<Any>) {
        _externalDataFilteringAllowList.addAll(externalDataFilteringAllowList)
    }

    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable) {
        cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun trustedResourceOwners(vararg trustedResourceOwners: String) {
        _trustedResourceOwners.addAll(listOf(*trustedResourceOwners))
    }

    public fun trustedResourceOwners(trustedResourceOwners: Collection<String>) {
        _trustedResourceOwners.addAll(trustedResourceOwners)
    }

    public fun build(): CfnDataLakeSettings {
        if (_admins.isNotEmpty()) cdkBuilder.admins(_admins)
        if (_authorizedSessionTagValueList.isNotEmpty()) {
            cdkBuilder.authorizedSessionTagValueList(_authorizedSessionTagValueList)
        }
        if (_createDatabaseDefaultPermissions.isNotEmpty()) {
            cdkBuilder.createDatabaseDefaultPermissions(_createDatabaseDefaultPermissions)
        }
        if (_createTableDefaultPermissions.isNotEmpty()) {
            cdkBuilder.createTableDefaultPermissions(_createTableDefaultPermissions)
        }
        if (_externalDataFilteringAllowList.isNotEmpty()) {
            cdkBuilder.externalDataFilteringAllowList(_externalDataFilteringAllowList)
        }
        if (_trustedResourceOwners.isNotEmpty()) cdkBuilder.trustedResourceOwners(_trustedResourceOwners)
        return cdkBuilder.build()
    }
}
