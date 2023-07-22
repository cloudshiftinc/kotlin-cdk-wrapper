@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Describes a session context that is activated when an intent is fulfilled.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * OutputContextProperty outputContextProperty = OutputContextProperty.builder()
 * .name("name")
 * .timeToLiveInSeconds(123)
 * .turnsToLive(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-outputcontext.html)
 */
@CdkDslMarker
public class CfnBotOutputContextPropertyDsl {
  private val cdkBuilder: CfnBot.OutputContextProperty.Builder =
      CfnBot.OutputContextProperty.builder()

  /**
   * @param name The name of the output context. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param timeToLiveInSeconds The amount of time, in seconds, that the output context should
   * remain active. 
   * The time is figured from the first time the context is sent to the user.
   */
  public fun timeToLiveInSeconds(timeToLiveInSeconds: Number) {
    cdkBuilder.timeToLiveInSeconds(timeToLiveInSeconds)
  }

  /**
   * @param turnsToLive The number of conversation turns that the output context should remain
   * active. 
   * The number of turns is counted from the first time that the context is sent to the user.
   */
  public fun turnsToLive(turnsToLive: Number) {
    cdkBuilder.turnsToLive(turnsToLive)
  }

  public fun build(): CfnBot.OutputContextProperty = cdkBuilder.build()
}
