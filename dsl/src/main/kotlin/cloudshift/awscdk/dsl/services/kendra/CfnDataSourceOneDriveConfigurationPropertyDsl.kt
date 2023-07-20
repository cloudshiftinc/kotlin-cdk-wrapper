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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceOneDriveConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.OneDriveConfigurationProperty.Builder =
        CfnDataSource.OneDriveConfigurationProperty.builder()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    public fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
    }

    public fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
    }

    public fun exclusionPatterns(vararg exclusionPatterns: String) {
        _exclusionPatterns.addAll(listOf(*exclusionPatterns))
    }

    public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
        _exclusionPatterns.addAll(exclusionPatterns)
    }

    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    public fun inclusionPatterns(vararg inclusionPatterns: String) {
        _inclusionPatterns.addAll(listOf(*inclusionPatterns))
    }

    public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
        _inclusionPatterns.addAll(inclusionPatterns)
    }

    public fun oneDriveUsers(oneDriveUsers: IResolvable) {
        cdkBuilder.oneDriveUsers(oneDriveUsers)
    }

    public fun oneDriveUsers(oneDriveUsers: CfnDataSource.OneDriveUsersProperty) {
        cdkBuilder.oneDriveUsers(oneDriveUsers)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun tenantDomain(tenantDomain: String) {
        cdkBuilder.tenantDomain(tenantDomain)
    }

    public fun build(): CfnDataSource.OneDriveConfigurationProperty {
        if (_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
        return cdkBuilder.build()
    }
}
