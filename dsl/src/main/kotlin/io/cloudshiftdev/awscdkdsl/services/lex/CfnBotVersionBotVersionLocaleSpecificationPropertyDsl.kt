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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotVersion

/**
 * Specifies the locale that Amazon Lex adds to this version.
 *
 * You can choose the Draft version or any other previously published version for each locale. When
 * you specify a source version, the locale data is copied from the source version to the new
 * version.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * BotVersionLocaleSpecificationProperty botVersionLocaleSpecificationProperty =
 * BotVersionLocaleSpecificationProperty.builder()
 * .botVersionLocaleDetails(BotVersionLocaleDetailsProperty.builder()
 * .sourceBotVersion("sourceBotVersion")
 * .build())
 * .localeId("localeId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botversion-botversionlocalespecification.html)
 */
@CdkDslMarker
public class CfnBotVersionBotVersionLocaleSpecificationPropertyDsl {
    private val cdkBuilder: CfnBotVersion.BotVersionLocaleSpecificationProperty.Builder =
        CfnBotVersion.BotVersionLocaleSpecificationProperty.builder()

    /** @param botVersionLocaleDetails The version of a bot used for a bot locale. */
    public fun botVersionLocaleDetails(botVersionLocaleDetails: IResolvable) {
        cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails)
    }

    /** @param botVersionLocaleDetails The version of a bot used for a bot locale. */
    public fun botVersionLocaleDetails(
        botVersionLocaleDetails: CfnBotVersion.BotVersionLocaleDetailsProperty
    ) {
        cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails)
    }

    /** @param localeId The identifier of the locale to add to the version. */
    public fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
    }

    public fun build(): CfnBotVersion.BotVersionLocaleSpecificationProperty = cdkBuilder.build()
}
