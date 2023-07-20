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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnChannelProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnChannelPropsDsl {
    private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    public fun channelStorage(channelStorage: IResolvable) {
        cdkBuilder.channelStorage(channelStorage)
    }

    public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty) {
        cdkBuilder.channelStorage(channelStorage)
    }

    public fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    public fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnChannelProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
