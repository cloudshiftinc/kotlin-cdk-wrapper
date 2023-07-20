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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3outposts.CfnBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketFilterAndOperatorPropertyDsl {
    private val cdkBuilder: CfnBucket.FilterAndOperatorProperty.Builder =
        CfnBucket.FilterAndOperatorProperty.builder()

    private val _tags: MutableList<CfnBucket.FilterTagProperty> = mutableListOf()

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun tags(tags: CfnBucketFilterTagPropertyDsl.() -> Unit) {
        _tags.add(CfnBucketFilterTagPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnBucket.FilterTagProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBucket.FilterAndOperatorProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
