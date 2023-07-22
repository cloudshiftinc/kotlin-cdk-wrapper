@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@CdkDslMarker
public class CfnKnowledgeBaseRenderingConfigurationPropertyDsl {
  private val cdkBuilder: CfnKnowledgeBase.RenderingConfigurationProperty.Builder =
      CfnKnowledgeBase.RenderingConfigurationProperty.builder()

  /**
   * @param templateUri A URI template containing exactly one variable in `${variableName}` format.
   * This can only be set for `EXTERNAL` knowledge bases. For Salesforce, ServiceNow, and Zendesk,
   * the variable must be one of the following:
   *
   * * Salesforce: `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus` , or
   * `IsDeleted`
   * * ServiceNow: `number` , `short_description` , `sys_mod_count` , `workflow_state` , or `active`
   * * Zendesk: `id` , `title` , `updated_at` , or `draft`
   *
   * The variable is replaced with the actual value for a piece of content when calling
   * [GetContent](https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html) .
   */
  public fun templateUri(templateUri: String) {
    cdkBuilder.templateUri(templateUri)
  }

  public fun build(): CfnKnowledgeBase.RenderingConfigurationProperty = cdkBuilder.build()
}
