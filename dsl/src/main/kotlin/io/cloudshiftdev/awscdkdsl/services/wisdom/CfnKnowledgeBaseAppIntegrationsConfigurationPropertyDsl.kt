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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

/**
 * Configuration information for Amazon AppIntegrations to automatically ingest content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * AppIntegrationsConfigurationProperty appIntegrationsConfigurationProperty =
 * AppIntegrationsConfigurationProperty.builder()
 * .appIntegrationArn("appIntegrationArn")
 * // the properties below are optional
 * .objectFields(List.of("objectFields"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html)
 */
@CdkDslMarker
public class CfnKnowledgeBaseAppIntegrationsConfigurationPropertyDsl {
    private val cdkBuilder: CfnKnowledgeBase.AppIntegrationsConfigurationProperty.Builder =
        CfnKnowledgeBase.AppIntegrationsConfigurationProperty.builder()

    private val _objectFields: MutableList<String> = mutableListOf()

    /**
     * @param appIntegrationArn The Amazon Resource Name (ARN) of the AppIntegrations
     *   DataIntegration to use for ingesting content.
     * * For [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
     *   , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is
     *   not provided, including at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
     *   `PublishStatus` , and `IsDeleted` as source fields.
     * * For [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
     *   , your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is
     *   not provided, including at least `number` , `short_description` , `sys_mod_count` ,
     *   `workflow_state` , and `active` as source fields.
     * * For [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
     *   , your AppIntegrations DataIntegration must have an ObjectConfiguration if `objectFields`
     *   is not provided, including at least `id` , `title` , `updated_at` , and `draft` as source
     *   fields.
     * * For [SharePoint](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/sharepoint/dev/sp-add-ins/sharepoint-net-server-csom-jsom-and-rest-api-index)
     *   , your AppIntegrations DataIntegration must have a FileConfiguration, including only file
     *   extensions that are among `docx` , `pdf` , `html` , `htm` , and `txt` .
     * * For [Amazon S3](https://docs.aws.amazon.com/https://aws.amazon.com/s3/) , the
     *   ObjectConfiguration and FileConfiguration of your AppIntegrations DataIntegration must be
     *   null. The `SourceURI` of your DataIntegration must use the following format:
     *   `s3://your_s3_bucket_name` .
     *
     * The bucket policy of the corresponding S3 bucket must allow the AWS principal
     * `app-integrations.amazonaws.com` to perform `s3:ListBucket` , `s3:GetObject` , and
     * `s3:GetBucketLocation` against the bucket.
     */
    public fun appIntegrationArn(appIntegrationArn: String) {
        cdkBuilder.appIntegrationArn(appIntegrationArn)
    }

    /**
     * @param objectFields The fields from the source that are made available to your agents in
     *   Amazon Q. Optional if ObjectConfiguration is included in the provided DataIntegration.
     * * For [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
     *   , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
     *   `PublishStatus` , and `IsDeleted` .
     * * For [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
     *   , you must include at least `number` , `short_description` , `sys_mod_count` ,
     *   `workflow_state` , and `active` .
     * * For [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
     *   , you must include at least `id` , `title` , `updated_at` , and `draft` .
     *
     * Make sure to include additional fields. These fields are indexed and used to source
     * recommendations.
     */
    public fun objectFields(vararg objectFields: String) {
        _objectFields.addAll(listOf(*objectFields))
    }

    /**
     * @param objectFields The fields from the source that are made available to your agents in
     *   Amazon Q. Optional if ObjectConfiguration is included in the provided DataIntegration.
     * * For [Salesforce](https://docs.aws.amazon.com/https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm)
     *   , you must include at least `Id` , `ArticleNumber` , `VersionNumber` , `Title` ,
     *   `PublishStatus` , and `IsDeleted` .
     * * For [ServiceNow](https://docs.aws.amazon.com/https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api)
     *   , you must include at least `number` , `short_description` , `sys_mod_count` ,
     *   `workflow_state` , and `active` .
     * * For [Zendesk](https://docs.aws.amazon.com/https://developer.zendesk.com/api-reference/help_center/help-center-api/articles/)
     *   , you must include at least `id` , `title` , `updated_at` , and `draft` .
     *
     * Make sure to include additional fields. These fields are indexed and used to source
     * recommendations.
     */
    public fun objectFields(objectFields: Collection<String>) {
        _objectFields.addAll(objectFields)
    }

    public fun build(): CfnKnowledgeBase.AppIntegrationsConfigurationProperty {
        if (_objectFields.isNotEmpty()) cdkBuilder.objectFields(_objectFields)
        return cdkBuilder.build()
    }
}
