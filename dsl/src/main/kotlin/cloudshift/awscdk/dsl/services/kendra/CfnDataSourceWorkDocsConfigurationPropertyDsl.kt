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
public class CfnDataSourceWorkDocsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WorkDocsConfigurationProperty.Builder =
        CfnDataSource.WorkDocsConfigurationProperty.builder()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    public fun crawlComments(crawlComments: Boolean) {
        cdkBuilder.crawlComments(crawlComments)
    }

    public fun crawlComments(crawlComments: IResolvable) {
        cdkBuilder.crawlComments(crawlComments)
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

    public fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
    }

    public fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
    }

    public fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog)
    }

    public fun build(): CfnDataSource.WorkDocsConfigurationProperty {
        if (_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
        return cdkBuilder.build()
    }
}
