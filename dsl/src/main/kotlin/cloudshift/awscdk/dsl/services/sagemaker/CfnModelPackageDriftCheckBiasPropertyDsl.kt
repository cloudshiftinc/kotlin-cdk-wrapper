@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageDriftCheckBiasPropertyDsl {
  private val cdkBuilder: CfnModelPackage.DriftCheckBiasProperty.Builder =
      CfnModelPackage.DriftCheckBiasProperty.builder()

  /**
   * @param configFile The bias config file for a model.
   */
  public fun configFile(configFile: IResolvable) {
    cdkBuilder.configFile(configFile)
  }

  /**
   * @param configFile The bias config file for a model.
   */
  public fun configFile(configFile: CfnModelPackage.FileSourceProperty) {
    cdkBuilder.configFile(configFile)
  }

  /**
   * @param postTrainingConstraints The post-training constraints.
   */
  public fun postTrainingConstraints(postTrainingConstraints: IResolvable) {
    cdkBuilder.postTrainingConstraints(postTrainingConstraints)
  }

  /**
   * @param postTrainingConstraints The post-training constraints.
   */
  public
      fun postTrainingConstraints(postTrainingConstraints: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.postTrainingConstraints(postTrainingConstraints)
  }

  /**
   * @param preTrainingConstraints The pre-training constraints.
   */
  public fun preTrainingConstraints(preTrainingConstraints: IResolvable) {
    cdkBuilder.preTrainingConstraints(preTrainingConstraints)
  }

  /**
   * @param preTrainingConstraints The pre-training constraints.
   */
  public fun preTrainingConstraints(preTrainingConstraints: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.preTrainingConstraints(preTrainingConstraints)
  }

  public fun build(): CfnModelPackage.DriftCheckBiasProperty = cdkBuilder.build()
}
