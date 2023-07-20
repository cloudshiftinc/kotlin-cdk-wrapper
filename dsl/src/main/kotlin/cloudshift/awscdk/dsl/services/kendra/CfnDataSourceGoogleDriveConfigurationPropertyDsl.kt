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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceGoogleDriveConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.GoogleDriveConfigurationProperty.Builder =
        CfnDataSource.GoogleDriveConfigurationProperty.builder()

    private val _excludeMimeTypes: MutableList<String> = mutableListOf()

    private val _excludeSharedDrives: MutableList<String> = mutableListOf()

    private val _excludeUserAccounts: MutableList<String> = mutableListOf()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    public fun excludeMimeTypes(vararg excludeMimeTypes: String) {
        _excludeMimeTypes.addAll(listOf(*excludeMimeTypes))
    }

    public fun excludeMimeTypes(excludeMimeTypes: Collection<String>) {
        _excludeMimeTypes.addAll(excludeMimeTypes)
    }

    public fun excludeSharedDrives(vararg excludeSharedDrives: String) {
        _excludeSharedDrives.addAll(listOf(*excludeSharedDrives))
    }

    public fun excludeSharedDrives(excludeSharedDrives: Collection<String>) {
        _excludeSharedDrives.addAll(excludeSharedDrives)
    }

    public fun excludeUserAccounts(vararg excludeUserAccounts: String) {
        _excludeUserAccounts.addAll(listOf(*excludeUserAccounts))
    }

    public fun excludeUserAccounts(excludeUserAccounts: Collection<String>) {
        _excludeUserAccounts.addAll(excludeUserAccounts)
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

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnDataSource.GoogleDriveConfigurationProperty {
        if (_excludeMimeTypes.isNotEmpty()) cdkBuilder.excludeMimeTypes(_excludeMimeTypes)
        if (_excludeSharedDrives.isNotEmpty()) cdkBuilder.excludeSharedDrives(_excludeSharedDrives)
        if (_excludeUserAccounts.isNotEmpty()) cdkBuilder.excludeUserAccounts(_excludeUserAccounts)
        if (_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
        return cdkBuilder.build()
    }
}
