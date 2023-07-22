@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointAutoRollbackConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.AutoRollbackConfigProperty.Builder =
      CfnEndpoint.AutoRollbackConfigProperty.builder()

  private val _alarms: MutableList<Any> = mutableListOf()

  /**
   * @param alarms List of CloudWatch alarms in your account that are configured to monitor metrics
   * on an endpoint. 
   * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
   */
  public fun alarms(vararg alarms: Any) {
    _alarms.addAll(listOf(*alarms))
  }

  /**
   * @param alarms List of CloudWatch alarms in your account that are configured to monitor metrics
   * on an endpoint. 
   * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
   */
  public fun alarms(alarms: Collection<Any>) {
    _alarms.addAll(alarms)
  }

  /**
   * @param alarms List of CloudWatch alarms in your account that are configured to monitor metrics
   * on an endpoint. 
   * If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
   */
  public fun alarms(alarms: IResolvable) {
    cdkBuilder.alarms(alarms)
  }

  public fun build(): CfnEndpoint.AutoRollbackConfigProperty {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
