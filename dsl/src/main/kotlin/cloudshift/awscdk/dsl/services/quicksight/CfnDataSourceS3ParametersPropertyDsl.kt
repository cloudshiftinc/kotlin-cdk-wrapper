@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceS3ParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.S3ParametersProperty.Builder =
      CfnDataSource.S3ParametersProperty.builder()

  public fun manifestFileLocation(manifestFileLocation: IResolvable) {
    cdkBuilder.manifestFileLocation(manifestFileLocation)
  }

  public
      fun manifestFileLocation(manifestFileLocation: CfnDataSource.ManifestFileLocationProperty) {
    cdkBuilder.manifestFileLocation(manifestFileLocation)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataSource.S3ParametersProperty = cdkBuilder.build()
}
