@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance

@CdkDslMarker
public class CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl {
  private val cdkBuilder: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder =
      CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.builder()

  /**
   * @param minimumInstanceMetadataServiceVersion Indicates the minimum IMDS version that the
   * notebook instance supports. 
   * When passed as part of `CreateNotebookInstance` , if no value is selected, then it defaults to
   * IMDSv1. This means that both IMDSv1 and IMDSv2 are supported. If passed as part of
   * `UpdateNotebookInstance` , there is no default.
   */
  public fun minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion: String) {
    cdkBuilder.minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion)
  }

  public fun build(): CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty =
      cdkBuilder.build()
}
