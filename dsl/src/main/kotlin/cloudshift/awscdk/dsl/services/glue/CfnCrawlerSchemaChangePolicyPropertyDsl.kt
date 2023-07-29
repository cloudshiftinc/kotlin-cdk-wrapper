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
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * The policy that specifies update and delete behaviors for the crawler.
 *
 * The policy tells the crawler what to do in the event that it detects a change in a table that
 * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy` does
 * not affect whether or how new tables and partitions are added. New tables and partitions are
 * always created regardless of the `SchemaChangePolicy` on a crawler.
 *
 * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * SchemaChangePolicyProperty schemaChangePolicyProperty = SchemaChangePolicyProperty.builder()
 * .deleteBehavior("deleteBehavior")
 * .updateBehavior("updateBehavior")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html)
 */
@CdkDslMarker
public class CfnCrawlerSchemaChangePolicyPropertyDsl {
    private val cdkBuilder: CfnCrawler.SchemaChangePolicyProperty.Builder =
        CfnCrawler.SchemaChangePolicyProperty.builder()

    /**
     * @param deleteBehavior The deletion behavior when the crawler finds a deleted object. A value
     *   of `LOG` specifies that if a table or partition is found to no longer exist, do not delete
     *   it, only log that it was found to no longer exist.
     *
     * A value of `DELETE_FROM_DATABASE` specifies that if a table or partition is found to have
     * been removed, delete it from the database.
     *
     * A value of `DEPRECATE_IN_DATABASE` specifies that if a table has been found to no longer
     * exist, to add a property to the table that says "DEPRECATED" and includes a timestamp with
     * the time of deprecation.
     */
    public fun deleteBehavior(deleteBehavior: String) {
        cdkBuilder.deleteBehavior(deleteBehavior)
    }

    /**
     * @param updateBehavior The update behavior when the crawler finds a changed schema. A value of
     *   `LOG` specifies that if a table or a partition already exists, and a change is detected, do
     *   not update it, only log that a change was detected. Add new tables and new partitions
     *   (including on existing tables).
     *
     * A value of `UPDATE_IN_DATABASE` specifies that if a table or partition already exists, and a
     * change is detected, update it. Add new tables and partitions.
     */
    public fun updateBehavior(updateBehavior: String) {
        cdkBuilder.updateBehavior(updateBehavior)
    }

    public fun build(): CfnCrawler.SchemaChangePolicyProperty = cdkBuilder.build()
}
