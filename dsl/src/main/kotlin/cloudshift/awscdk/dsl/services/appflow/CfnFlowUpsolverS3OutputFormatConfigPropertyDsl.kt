@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowUpsolverS3OutputFormatConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.UpsolverS3OutputFormatConfigProperty.Builder =
      CfnFlow.UpsolverS3OutputFormatConfigProperty.builder()

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

  public fun build(): CfnFlow.UpsolverS3OutputFormatConfigProperty = cdkBuilder.build()
}
