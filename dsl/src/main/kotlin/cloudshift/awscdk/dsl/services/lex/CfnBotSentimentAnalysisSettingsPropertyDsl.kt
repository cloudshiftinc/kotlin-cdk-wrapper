@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSentimentAnalysisSettingsPropertyDsl {
  private val cdkBuilder: CfnBot.SentimentAnalysisSettingsProperty.Builder =
      CfnBot.SentimentAnalysisSettingsProperty.builder()

  /**
   * @param detectSentiment Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment
   * of user utterances. 
   */
  public fun detectSentiment(detectSentiment: Boolean) {
    cdkBuilder.detectSentiment(detectSentiment)
  }

  /**
   * @param detectSentiment Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment
   * of user utterances. 
   */
  public fun detectSentiment(detectSentiment: IResolvable) {
    cdkBuilder.detectSentiment(detectSentiment)
  }

  public fun build(): CfnBot.SentimentAnalysisSettingsProperty = cdkBuilder.build()
}
