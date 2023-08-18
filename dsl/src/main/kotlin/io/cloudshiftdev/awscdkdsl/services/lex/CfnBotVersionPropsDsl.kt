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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotVersionProps

/**
 * Properties for defining a `CfnBotVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * CfnBotVersionProps cfnBotVersionProps = CfnBotVersionProps.builder()
 * .botId("botId")
 * .botVersionLocaleSpecification(List.of(BotVersionLocaleSpecificationProperty.builder()
 * .botVersionLocaleDetails(BotVersionLocaleDetailsProperty.builder()
 * .sourceBotVersion("sourceBotVersion")
 * .build())
 * .localeId("localeId")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html)
 */
@CdkDslMarker
public class CfnBotVersionPropsDsl {
    private val cdkBuilder: CfnBotVersionProps.Builder = CfnBotVersionProps.builder()

    private val _botVersionLocaleSpecification: MutableList<Any> = mutableListOf()

    /** @param botId The unique identifier of the bot. */
    public fun botId(botId: String) {
        cdkBuilder.botId(botId)
    }

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     *   version. You can choose the Draft version or any other previously published version for
     *   each locale. When you specify a source version, the locale data is copied from the source
     *   version to the new version.
     */
    public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any) {
        _botVersionLocaleSpecification.addAll(listOf(*botVersionLocaleSpecification))
    }

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     *   version. You can choose the Draft version or any other previously published version for
     *   each locale. When you specify a source version, the locale data is copied from the source
     *   version to the new version.
     */
    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: Collection<Any>) {
        _botVersionLocaleSpecification.addAll(botVersionLocaleSpecification)
    }

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     *   version. You can choose the Draft version or any other previously published version for
     *   each locale. When you specify a source version, the locale data is copied from the source
     *   version to the new version.
     */
    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
        cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification)
    }

    /** @param description The description of the version. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnBotVersionProps {
        if (_botVersionLocaleSpecification.isNotEmpty())
            cdkBuilder.botVersionLocaleSpecification(_botVersionLocaleSpecification)
        return cdkBuilder.build()
    }
}
