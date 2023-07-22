@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

/**
 * The output configuration for monitoring jobs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
 * MonitoringOutputConfigProperty.builder()
 * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
 * .s3Output(S3OutputProperty.builder()
 * .localPath("localPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .s3UploadMode("s3UploadMode")
 * .build())
 * .build()))
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig.html)
 */
@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder
      = CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.builder()

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

  public fun build(): CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty {
    if(_monitoringOutputs.isNotEmpty()) cdkBuilder.monitoringOutputs(_monitoringOutputs)
    return cdkBuilder.build()
  }
}
