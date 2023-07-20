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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceConfluenceBlogConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConfluenceBlogConfigurationProperty.Builder =
        CfnDataSource.ConfluenceBlogConfigurationProperty.builder()

    private val _blogFieldMappings: MutableList<Any> = mutableListOf()

    public fun blogFieldMappings(vararg blogFieldMappings: Any) {
        _blogFieldMappings.addAll(listOf(*blogFieldMappings))
    }

    public fun blogFieldMappings(blogFieldMappings: Collection<Any>) {
        _blogFieldMappings.addAll(blogFieldMappings)
    }

    public fun blogFieldMappings(blogFieldMappings: IResolvable) {
        cdkBuilder.blogFieldMappings(blogFieldMappings)
    }

    public fun build(): CfnDataSource.ConfluenceBlogConfigurationProperty {
        if (_blogFieldMappings.isNotEmpty()) cdkBuilder.blogFieldMappings(_blogFieldMappings)
        return cdkBuilder.build()
    }
}
