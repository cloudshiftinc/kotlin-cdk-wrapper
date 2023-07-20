@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionFunctionEnvironmentPropertyDsl {
  private val cdkBuilder: CfnFunction.FunctionEnvironmentProperty.Builder =
      CfnFunction.FunctionEnvironmentProperty.builder()

  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnFunction.FunctionEnvironmentProperty = cdkBuilder.build()
}
