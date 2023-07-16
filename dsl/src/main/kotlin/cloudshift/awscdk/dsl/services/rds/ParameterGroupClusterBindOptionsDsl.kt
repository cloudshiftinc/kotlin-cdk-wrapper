@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions

@CdkDslMarker
public class ParameterGroupClusterBindOptionsDsl {
  private val cdkBuilder: ParameterGroupClusterBindOptions.Builder =
      ParameterGroupClusterBindOptions.builder()

  public fun build(): ParameterGroupClusterBindOptions = cdkBuilder.build()
}
