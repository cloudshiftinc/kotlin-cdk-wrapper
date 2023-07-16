@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetS3DestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.S3DestinationConfigurationProperty.Builder =
      CfnDataset.S3DestinationConfigurationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun glueConfiguration(glueConfiguration: IResolvable) {
    cdkBuilder.glueConfiguration(glueConfiguration)
  }

  public fun glueConfiguration(glueConfiguration: CfnDataset.GlueConfigurationProperty) {
    cdkBuilder.glueConfiguration(glueConfiguration)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataset.S3DestinationConfigurationProperty = cdkBuilder.build()
}
