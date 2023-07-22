@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder =
      CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder()

  private val _events: MutableList<String> = mutableListOf()

  /**
   * @param enabled Indicates whether a defined automatic rollback configuration is currently
   * enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether a defined automatic rollback configuration is currently
   * enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param events The event type or types that trigger a rollback.
   * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
   * `DEPLOYMENT_STOP_ON_REQUEST` .
   */
  public fun events(vararg events: String) {
    _events.addAll(listOf(*events))
  }

  /**
   * @param events The event type or types that trigger a rollback.
   * Valid values are `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or
   * `DEPLOYMENT_STOP_ON_REQUEST` .
   */
  public fun events(events: Collection<String>) {
    _events.addAll(events)
  }

  public fun build(): CfnDeploymentGroup.AutoRollbackConfigurationProperty {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
