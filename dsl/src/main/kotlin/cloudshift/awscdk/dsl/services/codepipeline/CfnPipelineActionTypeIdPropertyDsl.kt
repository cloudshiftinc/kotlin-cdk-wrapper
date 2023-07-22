@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Represents information about an action type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * ActionTypeIdProperty actionTypeIdProperty = ActionTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html)
 */
@CdkDslMarker
public class CfnPipelineActionTypeIdPropertyDsl {
  private val cdkBuilder: CfnPipeline.ActionTypeIdProperty.Builder =
      CfnPipeline.ActionTypeIdProperty.builder()

  /**
   * @param category A category defines what kind of action can be taken in the stage, and
   * constrains the provider type for the action. 
   * Valid categories are limited to one of the values below.
   *
   * * `Source`
   * * `Build`
   * * `Test`
   * * `Deploy`
   * * `Invoke`
   * * `Approval`
   */
  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  /**
   * @param owner The creator of the action being called. 
   * There are three valid values for the `Owner` field in the action category section within your
   * pipeline structure: `AWS` , `ThirdParty` , and `Custom` . For more information, see [Valid Action
   * Types and Providers in
   * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
   * .
   */
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * @param provider The provider of the service being called by the action. 
   * Valid providers are determined by the action category. For example, an action in the Deploy
   * category type might have a provider of CodeDeploy, which would be specified as `CodeDeploy` . For
   * more information, see [Valid Action Types and Providers in
   * CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#actions-valid-providers)
   * .
   */
  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param version A string that describes the action version. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnPipeline.ActionTypeIdProperty = cdkBuilder.build()
}
