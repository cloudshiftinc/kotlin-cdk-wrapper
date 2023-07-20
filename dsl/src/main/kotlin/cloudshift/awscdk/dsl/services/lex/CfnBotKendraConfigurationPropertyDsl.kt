@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotKendraConfigurationPropertyDsl {
  private val cdkBuilder: CfnBot.KendraConfigurationProperty.Builder =
      CfnBot.KendraConfigurationProperty.builder()

  public fun kendraIndex(kendraIndex: String) {
    cdkBuilder.kendraIndex(kendraIndex)
  }

  public fun queryFilterString(queryFilterString: String) {
    cdkBuilder.queryFilterString(queryFilterString)
  }

  public fun queryFilterStringEnabled(queryFilterStringEnabled: Boolean) {
    cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled)
  }

  public fun queryFilterStringEnabled(queryFilterStringEnabled: IResolvable) {
    cdkBuilder.queryFilterStringEnabled(queryFilterStringEnabled)
  }

  public fun build(): CfnBot.KendraConfigurationProperty = cdkBuilder.build()
}
