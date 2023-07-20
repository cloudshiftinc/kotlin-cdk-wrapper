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
import kotlin.Boolean

@CdkDslMarker
public class CfnBotSentimentAnalysisSettingsPropertyDsl {
    private val cdkBuilder: CfnBot.SentimentAnalysisSettingsProperty.Builder =
        CfnBot.SentimentAnalysisSettingsProperty.builder()

    public fun detectSentiment(detectSentiment: Boolean) {
        cdkBuilder.detectSentiment(detectSentiment)
    }

    public fun detectSentiment(detectSentiment: IResolvable) {
        cdkBuilder.detectSentiment(detectSentiment)
    }

    public fun build(): CfnBot.SentimentAnalysisSettingsProperty = cdkBuilder.build()
}
