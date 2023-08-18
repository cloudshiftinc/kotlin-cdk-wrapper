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
 * When crawling an Amazon S3 data source after the first crawl is complete, specifies whether to
 * crawl the entire dataset again or to crawl only folders that were added since the last crawler
 * run.
 *
 * For more information, see
 * [Incremental Crawls in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/incremental-crawls.html)
 * in the developer guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * RecrawlPolicyProperty recrawlPolicyProperty = RecrawlPolicyProperty.builder()
 * .recrawlBehavior("recrawlBehavior")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-recrawlpolicy.html)
 */
@CdkDslMarker
public class CfnCrawlerRecrawlPolicyPropertyDsl {
    private val cdkBuilder: CfnCrawler.RecrawlPolicyProperty.Builder =
        CfnCrawler.RecrawlPolicyProperty.builder()

    /**
     * @param recrawlBehavior Specifies whether to crawl the entire dataset again or to crawl only
     *   folders that were added since the last crawler run. A value of `CRAWL_EVERYTHING` specifies
     *   crawling the entire dataset again.
     *
     * A value of `CRAWL_NEW_FOLDERS_ONLY` specifies crawling only folders that were added since the
     * last crawler run.
     *
     * A value of `CRAWL_EVENT_MODE` specifies crawling only the changes identified by Amazon S3
     * events.
     */
    public fun recrawlBehavior(recrawlBehavior: String) {
        cdkBuilder.recrawlBehavior(recrawlBehavior)
    }

    public fun build(): CfnCrawler.RecrawlPolicyProperty = cdkBuilder.build()
}
