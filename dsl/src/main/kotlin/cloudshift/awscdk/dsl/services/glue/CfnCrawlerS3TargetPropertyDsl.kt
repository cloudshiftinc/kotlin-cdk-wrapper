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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * Specifies a data store in Amazon Simple Storage Service (Amazon S3).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * S3TargetProperty s3TargetProperty = S3TargetProperty.builder()
 * .connectionName("connectionName")
 * .dlqEventQueueArn("dlqEventQueueArn")
 * .eventQueueArn("eventQueueArn")
 * .exclusions(List.of("exclusions"))
 * .path("path")
 * .sampleSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html)
 */
@CdkDslMarker
public class CfnCrawlerS3TargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.S3TargetProperty.Builder =
        CfnCrawler.S3TargetProperty.builder()

    private val _exclusions: MutableList<String> = mutableListOf()

    /**
     * @param connectionName The name of a connection which allows a job or crawler to access data
     *   in Amazon S3 within an Amazon Virtual Private Cloud environment (Amazon VPC).
     */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /**
     * @param dlqEventQueueArn A valid Amazon dead-letter SQS ARN. For example,
     *   `arn:aws:sqs:region:account:deadLetterQueue` .
     */
    public fun dlqEventQueueArn(dlqEventQueueArn: String) {
        cdkBuilder.dlqEventQueueArn(dlqEventQueueArn)
    }

    /**
     * @param eventQueueArn A valid Amazon SQS ARN. For example, `arn:aws:sqs:region:account:sqs` .
     */
    public fun eventQueueArn(eventQueueArn: String) {
        cdkBuilder.eventQueueArn(eventQueueArn)
    }

    /**
     * @param exclusions A list of glob patterns used to exclude from the crawl. For more
     *   information, see
     *   [Catalog Tables with a Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
     *   .
     */
    public fun exclusions(vararg exclusions: String) {
        _exclusions.addAll(listOf(*exclusions))
    }

    /**
     * @param exclusions A list of glob patterns used to exclude from the crawl. For more
     *   information, see
     *   [Catalog Tables with a Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
     *   .
     */
    public fun exclusions(exclusions: Collection<String>) {
        _exclusions.addAll(exclusions)
    }

    /** @param path The path to the Amazon S3 target. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param sampleSize Sets the number of files in each leaf folder to be crawled when crawling
     *   sample files in a dataset. If not set, all the files are crawled. A valid value is an
     *   integer between 1 and 249.
     */
    public fun sampleSize(sampleSize: Number) {
        cdkBuilder.sampleSize(sampleSize)
    }

    public fun build(): CfnCrawler.S3TargetProperty {
        if (_exclusions.isNotEmpty()) cdkBuilder.exclusions(_exclusions)
        return cdkBuilder.build()
    }
}
