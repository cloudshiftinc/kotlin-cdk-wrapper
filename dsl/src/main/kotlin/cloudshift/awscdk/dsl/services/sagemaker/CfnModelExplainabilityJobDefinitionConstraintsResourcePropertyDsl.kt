@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.Builder =
      CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.builder()

  /**
   * @param s3Uri The Amazon S3 URI for the constraints resource.
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty =
      cdkBuilder.build()
}
