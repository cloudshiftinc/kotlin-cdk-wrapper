@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * Identifies the resources to deploy for a monitoring job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
 * .clusterConfig(ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringresources.html)
 */
@CdkDslMarker
public class CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder =
      CfnModelBiasJobDefinition.MonitoringResourcesProperty.builder()

  /**
   * @param clusterConfig The configuration for the cluster resources used to run the processing
   * job. 
   */
  public fun clusterConfig(clusterConfig: IResolvable) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  /**
   * @param clusterConfig The configuration for the cluster resources used to run the processing
   * job. 
   */
  public fun clusterConfig(clusterConfig: CfnModelBiasJobDefinition.ClusterConfigProperty) {
    cdkBuilder.clusterConfig(clusterConfig)
  }

  public fun build(): CfnModelBiasJobDefinition.MonitoringResourcesProperty = cdkBuilder.build()
}
