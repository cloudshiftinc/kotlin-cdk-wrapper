@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasSentimentAnalysisSettingsPropertyDsl {
  private val cdkBuilder: CfnBotAlias.SentimentAnalysisSettingsProperty.Builder =
      CfnBotAlias.SentimentAnalysisSettingsProperty.builder()

  public fun detectSentiment(detectSentiment: Boolean) {
    cdkBuilder.detectSentiment(detectSentiment)
  }

  public fun detectSentiment(detectSentiment: IResolvable) {
    cdkBuilder.detectSentiment(detectSentiment)
  }

  public fun build(): CfnBotAlias.SentimentAnalysisSettingsProperty = cdkBuilder.build()
}
