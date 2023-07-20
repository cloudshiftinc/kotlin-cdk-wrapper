@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterConfigurationInfoPropertyDsl {
  private val cdkBuilder: CfnCluster.ConfigurationInfoProperty.Builder =
      CfnCluster.ConfigurationInfoProperty.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun revision(revision: Number) {
    cdkBuilder.revision(revision)
  }

  public fun build(): CfnCluster.ConfigurationInfoProperty = cdkBuilder.build()
}
