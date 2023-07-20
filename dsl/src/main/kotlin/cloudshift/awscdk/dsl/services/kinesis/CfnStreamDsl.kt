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

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesis.CfnStream
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

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    public fun shardCount(shardCount: Number) {
        cdkBuilder.shardCount(shardCount)
    }

    public fun streamEncryption(streamEncryption: IResolvable) {
        cdkBuilder.streamEncryption(streamEncryption)
    }

    public fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty) {
        cdkBuilder.streamEncryption(streamEncryption)
    }

    public fun streamModeDetails(streamModeDetails: IResolvable) {
        cdkBuilder.streamModeDetails(streamModeDetails)
    }

    public fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty) {
        cdkBuilder.streamModeDetails(streamModeDetails)
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
