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

package cloudshift.awscdk.dsl.services.kinesisvideo

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.kinesisvideo.CfnStream
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStreamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStream.Builder = CfnStream.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dataRetentionInHours(dataRetentionInHours: Number) {
        cdkBuilder.dataRetentionInHours(dataRetentionInHours)
    }

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun mediaType(mediaType: String) {
        cdkBuilder.mediaType(mediaType)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStream {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
