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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotResponseSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.ResponseSpecificationProperty.Builder =
        CfnBot.ResponseSpecificationProperty.builder()

    private val _messageGroupsList: MutableList<Any> = mutableListOf()

    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
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

    public fun build(): CfnBot.ResponseSpecificationProperty {
        if (_messageGroupsList.isNotEmpty()) cdkBuilder.messageGroupsList(_messageGroupsList)
        return cdkBuilder.build()
    }
}
