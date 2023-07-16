@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowSnowflakeDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.SnowflakeDestinationPropertiesProperty.Builder =
      CfnFlow.SnowflakeDestinationPropertiesProperty.builder()

  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  public fun intermediateBucketName(intermediateBucketName: String) {
    cdkBuilder.intermediateBucketName(intermediateBucketName)
  }

  public fun build(): CfnFlow.SnowflakeDestinationPropertiesProperty = cdkBuilder.build()
}
