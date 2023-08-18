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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * Specifies an Amazon DynamoDB table to crawl.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * DynamoDBTargetProperty dynamoDBTargetProperty = DynamoDBTargetProperty.builder()
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-dynamodbtarget.html)
 */
@CdkDslMarker
public class CfnCrawlerDynamoDBTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.DynamoDBTargetProperty.Builder =
        CfnCrawler.DynamoDBTargetProperty.builder()

    /** @param path The name of the DynamoDB table to crawl. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnCrawler.DynamoDBTargetProperty = cdkBuilder.build()
}
