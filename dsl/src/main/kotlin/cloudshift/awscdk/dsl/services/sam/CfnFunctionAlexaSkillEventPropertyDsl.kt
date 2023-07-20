@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionAlexaSkillEventPropertyDsl {
  private val cdkBuilder: CfnFunction.AlexaSkillEventProperty.Builder =
      CfnFunction.AlexaSkillEventProperty.builder()

  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnFunction.AlexaSkillEventProperty = cdkBuilder.build()
}
