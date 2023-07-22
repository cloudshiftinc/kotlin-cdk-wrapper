@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Represents the drift check explainability baselines that can be used when the model monitor is
 * set using the model package.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DriftCheckExplainabilityProperty driftCheckExplainabilityProperty =
 * DriftCheckExplainabilityProperty.builder()
 * .configFile(FileSourceProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .contentType("contentType")
 * .build())
 * .constraints(MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html)
 */
@CdkDslMarker
public class CfnModelPackageDriftCheckExplainabilityPropertyDsl {
  private val cdkBuilder: CfnModelPackage.DriftCheckExplainabilityProperty.Builder =
      CfnModelPackage.DriftCheckExplainabilityProperty.builder()

  /**
   * @param configFile The explainability config file for the model.
   */
  public fun configFile(configFile: IResolvable) {
    cdkBuilder.configFile(configFile)
  }

  /**
   * @param configFile The explainability config file for the model.
   */
  public fun configFile(configFile: CfnModelPackage.FileSourceProperty) {
    cdkBuilder.configFile(configFile)
  }

  /**
   * @param constraints The drift check explainability constraints.
   */
  public fun constraints(constraints: IResolvable) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param constraints The drift check explainability constraints.
   */
  public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.constraints(constraints)
  }

  public fun build(): CfnModelPackage.DriftCheckExplainabilityProperty = cdkBuilder.build()
}
