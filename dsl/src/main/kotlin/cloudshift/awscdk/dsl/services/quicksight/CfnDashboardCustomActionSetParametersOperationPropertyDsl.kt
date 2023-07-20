@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCustomActionSetParametersOperationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomActionSetParametersOperationProperty.Builder =
      CfnDashboard.CustomActionSetParametersOperationProperty.builder()

  private val _parameterValueConfigurations: MutableList<Any> = mutableListOf()

  public fun parameterValueConfigurations(vararg parameterValueConfigurations: Any) {
    _parameterValueConfigurations.addAll(listOf(*parameterValueConfigurations))
  }

  public fun parameterValueConfigurations(parameterValueConfigurations: Collection<Any>) {
    _parameterValueConfigurations.addAll(parameterValueConfigurations)
  }

  public fun parameterValueConfigurations(parameterValueConfigurations: IResolvable) {
    cdkBuilder.parameterValueConfigurations(parameterValueConfigurations)
  }

  public fun build(): CfnDashboard.CustomActionSetParametersOperationProperty {
    if(_parameterValueConfigurations.isNotEmpty())
        cdkBuilder.parameterValueConfigurations(_parameterValueConfigurations)
    return cdkBuilder.build()
  }
}
