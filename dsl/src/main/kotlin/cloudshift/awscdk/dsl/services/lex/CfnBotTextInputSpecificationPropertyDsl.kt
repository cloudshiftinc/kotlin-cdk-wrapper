@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotTextInputSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.TextInputSpecificationProperty.Builder =
      CfnBot.TextInputSpecificationProperty.builder()

  /**
   * @param startTimeoutMs Time for which a bot waits before re-prompting a customer for text input.
   * 
   */
  public fun startTimeoutMs(startTimeoutMs: Number) {
    cdkBuilder.startTimeoutMs(startTimeoutMs)
  }

  public fun build(): CfnBot.TextInputSpecificationProperty = cdkBuilder.build()
}
