@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

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
