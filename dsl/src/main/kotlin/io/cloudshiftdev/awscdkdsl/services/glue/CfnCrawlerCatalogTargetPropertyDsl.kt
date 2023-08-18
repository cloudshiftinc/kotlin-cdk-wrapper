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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * Specifies an AWS Glue Data Catalog target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CatalogTargetProperty catalogTargetProperty = CatalogTargetProperty.builder()
 * .connectionName("connectionName")
 * .databaseName("databaseName")
 * .dlqEventQueueArn("dlqEventQueueArn")
 * .eventQueueArn("eventQueueArn")
 * .tables(List.of("tables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html)
 */
@CdkDslMarker
public class CfnCrawlerCatalogTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.CatalogTargetProperty.Builder =
        CfnCrawler.CatalogTargetProperty.builder()

    private val _tables: MutableList<String> = mutableListOf()

    /**
     * @param connectionName The name of the connection for an Amazon S3-backed Data Catalog table
     *   to be a target of the crawl when using a `Catalog` connection type paired with a `NETWORK`
     *   Connection type.
     */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /** @param databaseName The name of the database to be synchronized. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
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

    /** @param tables A list of the tables to be synchronized. */
    public fun tables(vararg tables: String) {
        _tables.addAll(listOf(*tables))
    }

    /** @param tables A list of the tables to be synchronized. */
    public fun tables(tables: Collection<String>) {
        _tables.addAll(tables)
    }

    public fun build(): CfnCrawler.CatalogTargetProperty {
        if (_tables.isNotEmpty()) cdkBuilder.tables(_tables)
        return cdkBuilder.build()
    }
}
