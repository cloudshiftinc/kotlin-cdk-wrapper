@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotOutputContextPropertyDsl {
  private val cdkBuilder: CfnBot.OutputContextProperty.Builder =
      CfnBot.OutputContextProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun timeToLiveInSeconds(timeToLiveInSeconds: Number) {
    cdkBuilder.timeToLiveInSeconds(timeToLiveInSeconds)
  }

  public fun turnsToLive(turnsToLive: Number) {
    cdkBuilder.turnsToLive(turnsToLive)
  }

  public fun build(): CfnBot.OutputContextProperty = cdkBuilder.build()
}
