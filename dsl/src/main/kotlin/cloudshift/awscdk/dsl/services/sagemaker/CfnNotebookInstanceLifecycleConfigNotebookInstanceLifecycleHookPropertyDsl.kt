@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig

@CdkDslMarker
public class CfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookPropertyDsl {
  private val cdkBuilder:
      CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder =
      CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.builder()

  /**
   * @param content A base64-encoded string that contains a shell script for a notebook instance
   * lifecycle configuration.
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  public fun build(): CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty =
      cdkBuilder.build()
}
