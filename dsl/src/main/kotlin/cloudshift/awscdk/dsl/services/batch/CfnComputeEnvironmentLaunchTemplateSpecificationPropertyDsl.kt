@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder =
      CfnComputeEnvironment.LaunchTemplateSpecificationProperty.builder()

  /**
   * @param launchTemplateId The ID of the launch template.
   */
  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  /**
   * @param launchTemplateName The name of the launch template.
   */
  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  /**
   * @param version The version number of the launch template, `$Latest` , or `$Default` .
   * If the value is `$Latest` , the latest version of the launch template is used. If the value is
   * `$Default` , the default version of the launch template is used.
   *
   *
   * If the AMI ID that's used in a compute environment is from the launch template, the AMI isn't
   * changed when the compute environment is updated. It's only changed if the
   * `updateToLatestImageVersion` parameter for the compute environment is set to `true` . During an
   * infrastructure update, if either `$Latest` or `$Default` is specified, AWS Batch re-evaluates the
   * launch template version, and it might use a different version of the launch template. This is the
   * case even if the launch template isn't specified in the update. When updating a compute
   * environment, changing the launch template requires an infrastructure update of the compute
   * environment. For more information, see [Updating compute
   * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
   * in the *AWS Batch User Guide* .
   *
   *
   * Default: `$Default` .
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnComputeEnvironment.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
