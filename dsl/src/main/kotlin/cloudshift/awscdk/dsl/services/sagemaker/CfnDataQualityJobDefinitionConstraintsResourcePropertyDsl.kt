@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionConstraintsResourcePropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.ConstraintsResourceProperty.Builder =
      CfnDataQualityJobDefinition.ConstraintsResourceProperty.builder()

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnDataQualityJobDefinition.ConstraintsResourceProperty = cdkBuilder.build()
}
