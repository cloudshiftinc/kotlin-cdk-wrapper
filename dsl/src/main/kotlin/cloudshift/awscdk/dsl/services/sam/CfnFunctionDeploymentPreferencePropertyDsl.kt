@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionDeploymentPreferencePropertyDsl {
  private val cdkBuilder: CfnFunction.DeploymentPreferenceProperty.Builder =
      CfnFunction.DeploymentPreferenceProperty.builder()

  private val _alarms: MutableList<String> = mutableListOf()

  public fun alarms(vararg alarms: String) {
    _alarms.addAll(listOf(*alarms))
  }

  public fun alarms(alarms: Collection<String>) {
    _alarms.addAll(alarms)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun hooks(hooks: IResolvable) {
    cdkBuilder.hooks(hooks)
  }

  public fun hooks(hooks: CfnFunction.HooksProperty) {
    cdkBuilder.hooks(hooks)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnFunction.DeploymentPreferenceProperty {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
