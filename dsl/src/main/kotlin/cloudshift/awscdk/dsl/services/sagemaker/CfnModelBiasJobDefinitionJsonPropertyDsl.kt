@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionJsonPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.JsonProperty.Builder =
      CfnModelBiasJobDefinition.JsonProperty.builder()

  public fun line(line: Boolean) {
    cdkBuilder.line(line)
  }

  public fun line(line: IResolvable) {
    cdkBuilder.line(line)
  }

  public fun build(): CfnModelBiasJobDefinition.JsonProperty = cdkBuilder.build()
}
