@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@CdkDslMarker
public class CfnScheduledActionResumeClusterMessagePropertyDsl {
  private val cdkBuilder: CfnScheduledAction.ResumeClusterMessageProperty.Builder =
      CfnScheduledAction.ResumeClusterMessageProperty.builder()

  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun build(): CfnScheduledAction.ResumeClusterMessageProperty = cdkBuilder.build()
}
