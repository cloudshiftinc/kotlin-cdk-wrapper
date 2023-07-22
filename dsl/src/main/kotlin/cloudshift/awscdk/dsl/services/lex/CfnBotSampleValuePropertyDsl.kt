@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSampleValuePropertyDsl {
  private val cdkBuilder: CfnBot.SampleValueProperty.Builder = CfnBot.SampleValueProperty.builder()

  /**
   * @param value The value that can be used for a slot type. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBot.SampleValueProperty = cdkBuilder.build()
}
