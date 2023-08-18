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
 * Specifies an Amazon DocumentDB or MongoDB data store to crawl.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * MongoDBTargetProperty mongoDBTargetProperty = MongoDBTargetProperty.builder()
 * .connectionName("connectionName")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html)
 */
@CdkDslMarker
public class CfnCrawlerMongoDBTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.MongoDBTargetProperty.Builder =
        CfnCrawler.MongoDBTargetProperty.builder()

    /**
     * @param connectionName The name of the connection to use to connect to the Amazon DocumentDB
     *   or MongoDB target.
     */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /** @param path The path of the Amazon DocumentDB or MongoDB target (database/collection). */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnCrawler.MongoDBTargetProperty = cdkBuilder.build()
}
