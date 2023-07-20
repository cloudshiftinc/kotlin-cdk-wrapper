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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnCrawler
import kotlin.String

@CdkDslMarker
public class CfnCrawlerDynamoDBTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.DynamoDBTargetProperty.Builder =
        CfnCrawler.DynamoDBTargetProperty.builder()

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnCrawler.DynamoDBTargetProperty = cdkBuilder.build()
}
