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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * OpenSearchActionProperty openSearchActionProperty = OpenSearchActionProperty.builder()
 * .endpoint("endpoint")
 * .id("id")
 * .index("index")
 * .roleArn("roleArn")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleOpenSearchActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.OpenSearchActionProperty.Builder =
        CfnTopicRule.OpenSearchActionProperty.builder()

    /** @param endpoint The endpoint of your OpenSearch domain. */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param id The unique identifier for the document you are storing. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param index The OpenSearch index where you want to store your data. */
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

    public fun build(): CfnTopicRule.OpenSearchActionProperty = cdkBuilder.build()
}
