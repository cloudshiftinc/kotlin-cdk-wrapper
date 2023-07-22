@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user
 * utterances.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SentimentAnalysisSettingsProperty sentimentAnalysisSettingsProperty =
 * SentimentAnalysisSettingsProperty.builder()
 * .detectSentiment(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sentimentanalysissettings.html)
 */
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
