@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotTextLogSettingPropertyDsl {
  private val cdkBuilder: CfnBot.TextLogSettingProperty.Builder =
      CfnBot.TextLogSettingProperty.builder()

  /**
   * @param destination Specifies the Amazon CloudWatch Logs destination log group for conversation
   * text logs. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination Specifies the Amazon CloudWatch Logs destination log group for conversation
   * text logs. 
   */
  public fun destination(destination: CfnBot.TextLogDestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param enabled Determines whether conversation logs should be stored for an alias. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Determines whether conversation logs should be stored for an alias. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnBot.TextLogSettingProperty = cdkBuilder.build()
}
