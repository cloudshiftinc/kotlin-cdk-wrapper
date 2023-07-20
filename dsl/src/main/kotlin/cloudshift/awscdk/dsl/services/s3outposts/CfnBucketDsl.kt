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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnBucket
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBucket.Builder = CfnBucket.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
        cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
    }

    public fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty) {
        cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
    }

    public fun outpostId(outpostId: String) {
        cdkBuilder.outpostId(outpostId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBucket {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
