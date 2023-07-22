@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasTextLogSettingPropertyDsl {
  private val cdkBuilder: CfnBotAlias.TextLogSettingProperty.Builder =
      CfnBotAlias.TextLogSettingProperty.builder()

  /**
   * @param destination Defines the Amazon CloudWatch Logs destination log group for conversation
   * text logs. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination Defines the Amazon CloudWatch Logs destination log group for conversation
   * text logs. 
   */
  public fun destination(destination: CfnBotAlias.TextLogDestinationProperty) {
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

  public fun build(): CfnBotAlias.TextLogSettingProperty = cdkBuilder.build()
}
