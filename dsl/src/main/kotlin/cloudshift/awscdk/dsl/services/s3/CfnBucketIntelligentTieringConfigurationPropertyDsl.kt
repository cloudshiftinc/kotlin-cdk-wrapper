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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketIntelligentTieringConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.IntelligentTieringConfigurationProperty.Builder =
        CfnBucket.IntelligentTieringConfigurationProperty.builder()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    private val _tierings: MutableList<Any> = mutableListOf()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun tierings(vararg tierings: Any) {
        _tierings.addAll(listOf(*tierings))
    }

    public fun tierings(tierings: Collection<Any>) {
        _tierings.addAll(tierings)
    }

    public fun tierings(tierings: IResolvable) {
        cdkBuilder.tierings(tierings)
    }

    public fun build(): CfnBucket.IntelligentTieringConfigurationProperty {
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        if (_tierings.isNotEmpty()) cdkBuilder.tierings(_tierings)
        return cdkBuilder.build()
    }
}
