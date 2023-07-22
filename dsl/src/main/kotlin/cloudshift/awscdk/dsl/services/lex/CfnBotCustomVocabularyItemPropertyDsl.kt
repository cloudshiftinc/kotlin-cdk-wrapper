@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotCustomVocabularyItemPropertyDsl {
  private val cdkBuilder: CfnBot.CustomVocabularyItemProperty.Builder =
      CfnBot.CustomVocabularyItemProperty.builder()

  /**
   * @param displayAs The DisplayAs value for the custom vocabulary item from the custom vocabulary
   * list.
   */
  public fun displayAs(displayAs: String) {
    cdkBuilder.displayAs(displayAs)
  }

  /**
   * @param phrase Specifies 1 - 4 words that should be recognized. 
   */
  public fun phrase(phrase: String) {
    cdkBuilder.phrase(phrase)
  }

  /**
   * @param weight Specifies the degree to which the phrase recognition is boosted.
   * The default value is 1.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnBot.CustomVocabularyItemProperty = cdkBuilder.build()
}
