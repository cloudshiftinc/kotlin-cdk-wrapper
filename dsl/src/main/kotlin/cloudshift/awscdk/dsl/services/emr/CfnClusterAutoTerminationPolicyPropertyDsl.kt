@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterAutoTerminationPolicyPropertyDsl {
  private val cdkBuilder: CfnCluster.AutoTerminationPolicyProperty.Builder =
      CfnCluster.AutoTerminationPolicyProperty.builder()

  public fun idleTimeout(idleTimeout: Number) {
    cdkBuilder.idleTimeout(idleTimeout)
  }

  public fun build(): CfnCluster.AutoTerminationPolicyProperty = cdkBuilder.build()
}
