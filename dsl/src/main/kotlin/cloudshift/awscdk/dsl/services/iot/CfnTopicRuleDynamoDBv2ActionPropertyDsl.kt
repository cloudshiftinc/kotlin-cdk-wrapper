@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleDynamoDBv2ActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.DynamoDBv2ActionProperty.Builder =
        CfnTopicRule.DynamoDBv2ActionProperty.builder()

    public fun putItem(putItem: IResolvable) {
        cdkBuilder.putItem(putItem)
    }

    public fun putItem(putItem: CfnTopicRule.PutItemInputProperty) {
        cdkBuilder.putItem(putItem)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.DynamoDBv2ActionProperty = cdkBuilder.build()
}
