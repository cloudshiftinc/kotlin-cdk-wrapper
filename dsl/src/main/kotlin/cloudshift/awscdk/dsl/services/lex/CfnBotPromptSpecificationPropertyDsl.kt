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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotPromptSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.PromptSpecificationProperty.Builder =
        CfnBot.PromptSpecificationProperty.builder()

    private val _messageGroupsList: MutableList<Any> = mutableListOf()

    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun messageGroupsList(vararg messageGroupsList: Any) {
        _messageGroupsList.addAll(listOf(*messageGroupsList))
    }

    public fun messageGroupsList(messageGroupsList: Collection<Any>) {
        _messageGroupsList.addAll(messageGroupsList)
    }

    public fun messageGroupsList(messageGroupsList: IResolvable) {
        cdkBuilder.messageGroupsList(messageGroupsList)
    }

    public fun messageSelectionStrategy(messageSelectionStrategy: String) {
        cdkBuilder.messageSelectionStrategy(messageSelectionStrategy)
    }

    public fun promptAttemptsSpecification(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.promptAttemptsSpecification(builder.map)
    }

    public fun promptAttemptsSpecification(promptAttemptsSpecification: Map<String, Any>) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
    }

    public fun promptAttemptsSpecification(promptAttemptsSpecification: IResolvable) {
        cdkBuilder.promptAttemptsSpecification(promptAttemptsSpecification)
    }

    public fun build(): CfnBot.PromptSpecificationProperty {
        if (_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
        return cdkBuilder.build()
    }
}
