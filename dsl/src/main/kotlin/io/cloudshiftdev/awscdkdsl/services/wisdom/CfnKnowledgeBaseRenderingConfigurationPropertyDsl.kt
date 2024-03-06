@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.wisdom

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

/**
 * Information about how to render the content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * RenderingConfigurationProperty renderingConfigurationProperty =
 * RenderingConfigurationProperty.builder()
 * .templateUri("templateUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-renderingconfiguration.html)
 */
@CdkDslMarker
public class CfnKnowledgeBaseRenderingConfigurationPropertyDsl {
    private val cdkBuilder: CfnKnowledgeBase.RenderingConfigurationProperty.Builder =
        CfnKnowledgeBase.RenderingConfigurationProperty.builder()

    /**
     * @param templateUri A URI template containing exactly one variable in `${variableName}`
     *   format. This can only be set for `EXTERNAL` knowledge bases. For Salesforce, ServiceNow,
     *   and Zendesk, the variable must be one of the following:
     * * Salesforce: `Id` , `ArticleNumber` , `VersionNumber` , `Title` , `PublishStatus` , or
     *   `IsDeleted`
     * * ServiceNow: `number` , `short_description` , `sys_mod_count` , `workflow_state` , or
     *   `active`
     * * Zendesk: `id` , `title` , `updated_at` , or `draft`
     *
     * The variable is replaced with the actual value for a piece of content when calling
     * [GetContent](https://docs.aws.amazon.com/amazon-q-connect/latest/APIReference/API_GetContent.html)
     * .
     */
    public fun templateUri(templateUri: String) {
        cdkBuilder.templateUri(templateUri)
    }

    public fun build(): CfnKnowledgeBase.RenderingConfigurationProperty = cdkBuilder.build()
}
