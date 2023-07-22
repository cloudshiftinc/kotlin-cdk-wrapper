@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@CdkDslMarker
public class CfnWorkgroupConfigParameterPropertyDsl {
  private val cdkBuilder: CfnWorkgroup.ConfigParameterProperty.Builder =
      CfnWorkgroup.ConfigParameterProperty.builder()

  /**
   * @param parameterKey The key of the parameter.
   * The options are `datestyle` , `enable_user_activity_logging` , `query_group` , `search_path` ,
   * and `max_query_execution_time` .
   */
  public fun parameterKey(parameterKey: String) {
    cdkBuilder.parameterKey(parameterKey)
  }

  /**
   * @param parameterValue The value of the parameter to set.
   */
  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnWorkgroup.ConfigParameterProperty = cdkBuilder.build()
}
