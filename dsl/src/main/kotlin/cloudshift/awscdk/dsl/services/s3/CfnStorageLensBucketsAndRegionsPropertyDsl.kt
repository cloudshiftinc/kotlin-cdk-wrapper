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
import software.amazon.awscdk.services.s3.CfnStorageLens
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStorageLensBucketsAndRegionsPropertyDsl {
    private val cdkBuilder: CfnStorageLens.BucketsAndRegionsProperty.Builder =
        CfnStorageLens.BucketsAndRegionsProperty.builder()

    private val _buckets: MutableList<String> = mutableListOf()

    private val _regions: MutableList<String> = mutableListOf()

    public fun buckets(vararg buckets: String) {
        _buckets.addAll(listOf(*buckets))
    }

    public fun buckets(buckets: Collection<String>) {
        _buckets.addAll(buckets)
    }

    public fun regions(vararg regions: String) {
        _regions.addAll(listOf(*regions))
    }

    public fun regions(regions: Collection<String>) {
        _regions.addAll(regions)
    }

    public fun build(): CfnStorageLens.BucketsAndRegionsProperty {
        if (_buckets.isNotEmpty()) cdkBuilder.buckets(_buckets)
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        return cdkBuilder.build()
    }
}
