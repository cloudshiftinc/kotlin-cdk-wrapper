@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotAudioLogSettingPropertyDsl {
  private val cdkBuilder: CfnBot.AudioLogSettingProperty.Builder =
      CfnBot.AudioLogSettingProperty.builder()

  /**
   * @param destination Specifies the location of the audio log files collected when conversation
   * logging is enabled for a bot. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination Specifies the location of the audio log files collected when conversation
   * logging is enabled for a bot. 
   */
  public fun destination(destination: CfnBot.AudioLogDestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param enabled Determines whether audio logging in enabled for the bot. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Determines whether audio logging in enabled for the bot. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnBot.AudioLogSettingProperty = cdkBuilder.build()
}
