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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRoomDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoom.Builder = CfnRoom.Builder.create(scope, id)

    private val _loggingConfigurationIdentifiers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String) {
        _loggingConfigurationIdentifiers.addAll(listOf(*loggingConfigurationIdentifiers))
    }

    public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: Collection<String>) {
        _loggingConfigurationIdentifiers.addAll(loggingConfigurationIdentifiers)
    }

    public fun maximumMessageLength(maximumMessageLength: Number) {
        cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
        cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    public fun messageReviewHandler(messageReviewHandler: IResolvable) {
        cdkBuilder.messageReviewHandler(messageReviewHandler)
    }

    public fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty) {
        cdkBuilder.messageReviewHandler(messageReviewHandler)
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

    public fun build(): CfnRoom {
        if (_loggingConfigurationIdentifiers.isNotEmpty()) {
            cdkBuilder.loggingConfigurationIdentifiers(_loggingConfigurationIdentifiers)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
