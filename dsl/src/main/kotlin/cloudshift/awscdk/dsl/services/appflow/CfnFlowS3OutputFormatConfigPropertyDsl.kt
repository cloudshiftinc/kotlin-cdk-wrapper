@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowS3OutputFormatConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.S3OutputFormatConfigProperty.Builder =
      CfnFlow.S3OutputFormatConfigProperty.builder()

  public fun aggregationConfig(aggregationConfig: IResolvable) {
    cdkBuilder.aggregationConfig(aggregationConfig)
  }

  public fun aggregationConfig(aggregationConfig: CfnFlow.AggregationConfigProperty) {
    cdkBuilder.aggregationConfig(aggregationConfig)
  }

  public fun fileType(fileType: String) {
    cdkBuilder.fileType(fileType)
  }

  public fun prefixConfig(prefixConfig: IResolvable) {
    cdkBuilder.prefixConfig(prefixConfig)
  }

  public fun prefixConfig(prefixConfig: CfnFlow.PrefixConfigProperty) {
    cdkBuilder.prefixConfig(prefixConfig)
  }

  public fun preserveSourceDataTyping(preserveSourceDataTyping: Boolean) {
    cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping)
  }

  public fun preserveSourceDataTyping(preserveSourceDataTyping: IResolvable) {
    cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping)
  }

  public fun build(): CfnFlow.S3OutputFormatConfigProperty = cdkBuilder.build()
}
