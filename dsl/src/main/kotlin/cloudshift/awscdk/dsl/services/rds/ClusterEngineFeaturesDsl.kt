@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.ClusterEngineFeatures

@CdkDslMarker
public class ClusterEngineFeaturesDsl {
  private val cdkBuilder: ClusterEngineFeatures.Builder = ClusterEngineFeatures.builder()

  public fun s3Export(s3Export: String) {
    cdkBuilder.s3Export(s3Export)
  }

  public fun s3Import(s3Import: String) {
    cdkBuilder.s3Import(s3Import)
  }

  public fun build(): ClusterEngineFeatures = cdkBuilder.build()
}
