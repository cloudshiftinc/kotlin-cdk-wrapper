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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to write to a DynamoDB table.
 *
 * This DynamoDB action writes each attribute in the message payload into it's own column in the
 * DynamoDB table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * DynamoDBv2ActionProperty dynamoDBv2ActionProperty = DynamoDBv2ActionProperty.builder()
 * .putItem(PutItemInputProperty.builder()
 * .tableName("tableName")
 * .build())
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html)
 */
@CdkDslMarker
public class CfnTopicRuleDynamoDBv2ActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.DynamoDBv2ActionProperty.Builder =
        CfnTopicRule.DynamoDBv2ActionProperty.builder()

    /**
     * @param putItem Specifies the DynamoDB table to which the message data will be written. For
     *   example:. `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": {
     *   "tableName": "my-table" } } }`
     *
     * Each attribute in the message payload will be written to a separate column in the DynamoDB
     * database.
     */
    public fun putItem(putItem: IResolvable) {
        cdkBuilder.putItem(putItem)
    }

    /**
     * @param putItem Specifies the DynamoDB table to which the message data will be written. For
     *   example:. `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": {
     *   "tableName": "my-table" } } }`
     *
     * Each attribute in the message payload will be written to a separate column in the DynamoDB
     * database.
     */
    public fun putItem(putItem: CfnTopicRule.PutItemInputProperty) {
        cdkBuilder.putItem(putItem)
    }

    /** @param roleArn The ARN of the IAM role that grants access to the DynamoDB table. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.DynamoDBv2ActionProperty = cdkBuilder.build()
}
