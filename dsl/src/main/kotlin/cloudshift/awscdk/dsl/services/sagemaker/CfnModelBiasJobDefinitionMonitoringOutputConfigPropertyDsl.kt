@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder =
      CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.builder()

  private val _monitoringOutputs: MutableList<Any> = mutableListOf()

  /**
   * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
   * encrypt the model artifacts at rest using Amazon S3 server-side encryption.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
   * This is where the output of the periodic monitoring jobs is uploaded.
   */
  public fun monitoringOutputs(vararg monitoringOutputs: Any) {
    _monitoringOutputs.addAll(listOf(*monitoringOutputs))
  }

  /**
   * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
   * This is where the output of the periodic monitoring jobs is uploaded.
   */
  public fun monitoringOutputs(monitoringOutputs: Collection<Any>) {
    _monitoringOutputs.addAll(monitoringOutputs)
  }

  /**
   * @param monitoringOutputs Monitoring outputs for monitoring jobs. 
   * This is where the output of the periodic monitoring jobs is uploaded.
   */
  public fun monitoringOutputs(monitoringOutputs: IResolvable) {
    cdkBuilder.monitoringOutputs(monitoringOutputs)
  }

  public fun build(): CfnModelBiasJobDefinition.MonitoringOutputConfigProperty {
    if(_monitoringOutputs.isNotEmpty()) cdkBuilder.monitoringOutputs(_monitoringOutputs)
    return cdkBuilder.build()
  }
}
