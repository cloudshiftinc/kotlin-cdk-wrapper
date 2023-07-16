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

  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  public fun destination(destination: CfnBotAlias.TextLogDestinationProperty) {
    cdkBuilder.destination(destination)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnBotAlias.TextLogSettingProperty = cdkBuilder.build()
}
