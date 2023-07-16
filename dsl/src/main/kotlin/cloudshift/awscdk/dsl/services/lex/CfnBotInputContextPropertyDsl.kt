@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotInputContextPropertyDsl {
  private val cdkBuilder: CfnBot.InputContextProperty.Builder =
      CfnBot.InputContextProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnBot.InputContextProperty = cdkBuilder.build()
}
