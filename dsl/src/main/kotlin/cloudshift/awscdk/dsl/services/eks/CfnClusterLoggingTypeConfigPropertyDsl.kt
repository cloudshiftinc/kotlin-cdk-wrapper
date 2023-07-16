@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnCluster

@CdkDslMarker
public class CfnClusterLoggingTypeConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingTypeConfigProperty.Builder =
      CfnCluster.LoggingTypeConfigProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCluster.LoggingTypeConfigProperty = cdkBuilder.build()
}
