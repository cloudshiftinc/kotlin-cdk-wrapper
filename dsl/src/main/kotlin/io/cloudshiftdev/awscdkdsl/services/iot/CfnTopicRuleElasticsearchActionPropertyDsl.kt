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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action that writes data to an Amazon OpenSearch Service domain.
 *
 * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule action
 * or to update an existing rule action, use the `OpenSearch` rule action instead. For more
 * information, see
 * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ElasticsearchActionProperty elasticsearchActionProperty = ElasticsearchActionProperty.builder()
 * .endpoint("endpoint")
 * .id("id")
 * .index("index")
 * .roleArn("roleArn")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleElasticsearchActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.ElasticsearchActionProperty.Builder =
        CfnTopicRule.ElasticsearchActionProperty.builder()

    /** @param endpoint The endpoint of your OpenSearch domain. */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param id The unique identifier for the document you are storing. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param index The index where you want to store your data. */
    public fun index(index: String) {
        cdkBuilder.index(index)
    }

    /** @param roleArn The IAM role ARN that has access to OpenSearch. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param type The type of document you are storing. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTopicRule.ElasticsearchActionProperty = cdkBuilder.build()
}
