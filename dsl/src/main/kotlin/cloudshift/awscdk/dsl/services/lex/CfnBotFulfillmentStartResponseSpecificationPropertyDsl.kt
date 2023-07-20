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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotFulfillmentStartResponseSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.FulfillmentStartResponseSpecificationProperty.Builder =
        CfnBot.FulfillmentStartResponseSpecificationProperty.builder()

    private val _messageGroups: MutableList<Any> = mutableListOf()

    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun delayInSeconds(delayInSeconds: Number) {
        cdkBuilder.delayInSeconds(delayInSeconds)
    }

    public fun messageGroups(vararg messageGroups: Any) {
        _messageGroups.addAll(listOf(*messageGroups))
    }

    public fun messageGroups(messageGroups: Collection<Any>) {
        _messageGroups.addAll(messageGroups)
    }

    public fun messageGroups(messageGroups: IResolvable) {
        cdkBuilder.messageGroups(messageGroups)
    }

    public fun build(): CfnBot.FulfillmentStartResponseSpecificationProperty {
        if (_messageGroups.isNotEmpty()) cdkBuilder.messageGroups(_messageGroups)
        return cdkBuilder.build()
    }
}
