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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * Specifies a JDBC data store to crawl.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * JdbcTargetProperty jdbcTargetProperty = JdbcTargetProperty.builder()
 * .connectionName("connectionName")
 * .exclusions(List.of("exclusions"))
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html)
 */
@CdkDslMarker
public class CfnCrawlerJdbcTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.JdbcTargetProperty.Builder =
        CfnCrawler.JdbcTargetProperty.builder()

    private val _exclusions: MutableList<String> = mutableListOf()

    /** @param connectionName The name of the connection to use to connect to the JDBC target. */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
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

    /** @param path The path of the JDBC target. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnCrawler.JdbcTargetProperty {
        if (_exclusions.isNotEmpty()) cdkBuilder.exclusions(_exclusions)
        return cdkBuilder.build()
    }
}
