@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * The default value to use when a user doesn't provide a value for a slot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotDefaultValueSpecificationProperty slotDefaultValueSpecificationProperty =
 * SlotDefaultValueSpecificationProperty.builder()
 * .defaultValueList(List.of(SlotDefaultValueProperty.builder()
 * .defaultValue("defaultValue")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvaluespecification.html)
 */
@CdkDslMarker
public class CfnBotSlotDefaultValueSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.SlotDefaultValueSpecificationProperty.Builder =
        CfnBot.SlotDefaultValueSpecificationProperty.builder()

    private val _defaultValueList: MutableList<Any> = mutableListOf()

    /**
     * @param defaultValueList A list of default values. Amazon Lex chooses the default value to use
     *   in the order that they are presented in the list.
     */
    public fun defaultValueList(vararg defaultValueList: Any) {
        _defaultValueList.addAll(listOf(*defaultValueList))
    }

    /**
     * @param defaultValueList A list of default values. Amazon Lex chooses the default value to use
     *   in the order that they are presented in the list.
     */
    public fun defaultValueList(defaultValueList: Collection<Any>) {
        _defaultValueList.addAll(defaultValueList)
    }

    /**
     * @param defaultValueList A list of default values. Amazon Lex chooses the default value to use
     *   in the order that they are presented in the list.
     */
    public fun defaultValueList(defaultValueList: IResolvable) {
        cdkBuilder.defaultValueList(defaultValueList)
    }

    public fun build(): CfnBot.SlotDefaultValueSpecificationProperty {
        if (_defaultValueList.isNotEmpty()) cdkBuilder.defaultValueList(_defaultValueList)
        return cdkBuilder.build()
    }
}
