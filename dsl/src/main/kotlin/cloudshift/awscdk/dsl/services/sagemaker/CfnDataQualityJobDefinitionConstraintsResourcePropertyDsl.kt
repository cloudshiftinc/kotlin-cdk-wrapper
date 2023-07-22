@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * The constraints resource for a monitoring job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-constraintsresource.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionConstraintsResourcePropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.ConstraintsResourceProperty.Builder =
      CfnDataQualityJobDefinition.ConstraintsResourceProperty.builder()

  /**
   * @param s3Uri The Amazon S3 URI for the constraints resource.
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnDataQualityJobDefinition.ConstraintsResourceProperty = cdkBuilder.build()
}
