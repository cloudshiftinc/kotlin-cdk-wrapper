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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotSlotDefaultValueSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.SlotDefaultValueSpecificationProperty.Builder =
        CfnBot.SlotDefaultValueSpecificationProperty.builder()

    private val _defaultValueList: MutableList<Any> = mutableListOf()

    public fun defaultValueList(vararg defaultValueList: Any) {
        _defaultValueList.addAll(listOf(*defaultValueList))
    }

    public fun defaultValueList(defaultValueList: Collection<Any>) {
        _defaultValueList.addAll(defaultValueList)
    }

    public fun defaultValueList(defaultValueList: IResolvable) {
        cdkBuilder.defaultValueList(defaultValueList)
    }

    public fun build(): CfnBot.SlotDefaultValueSpecificationProperty {
        if (_defaultValueList.isNotEmpty()) cdkBuilder.defaultValueList(_defaultValueList)
        return cdkBuilder.build()
    }
}
