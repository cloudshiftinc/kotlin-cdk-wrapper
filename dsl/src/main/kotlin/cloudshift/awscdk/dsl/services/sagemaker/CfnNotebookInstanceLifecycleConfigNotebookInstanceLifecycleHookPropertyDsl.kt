@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig

/**
 * Specifies the notebook instance lifecycle configuration script.
 *
 * Each lifecycle configuration script has a limit of 16384 characters.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * NotebookInstanceLifecycleHookProperty notebookInstanceLifecycleHookProperty =
 * NotebookInstanceLifecycleHookProperty.builder()
 * .content("content")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html)
 */
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
