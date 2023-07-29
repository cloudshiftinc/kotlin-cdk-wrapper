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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps

/**
 * Properties for defining a `CfnCrawler`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object tags;
 * CfnCrawlerProps cfnCrawlerProps = CfnCrawlerProps.builder()
 * .role("role")
 * .targets(TargetsProperty.builder()
 * .catalogTargets(List.of(CatalogTargetProperty.builder()
 * .connectionName("connectionName")
 * .databaseName("databaseName")
 * .dlqEventQueueArn("dlqEventQueueArn")
 * .eventQueueArn("eventQueueArn")
 * .tables(List.of("tables"))
 * .build()))
 * .deltaTargets(List.of(DeltaTargetProperty.builder()
 * .connectionName("connectionName")
 * .createNativeDeltaTable(false)
 * .deltaTables(List.of("deltaTables"))
 * .writeManifest(false)
 * .build()))
 * .dynamoDbTargets(List.of(DynamoDBTargetProperty.builder()
 * .path("path")
 * .build()))
 * .jdbcTargets(List.of(JdbcTargetProperty.builder()
 * .connectionName("connectionName")
 * .exclusions(List.of("exclusions"))
 * .path("path")
 * .build()))
 * .mongoDbTargets(List.of(MongoDBTargetProperty.builder()
 * .connectionName("connectionName")
 * .path("path")
 * .build()))
 * .s3Targets(List.of(S3TargetProperty.builder()
 * .connectionName("connectionName")
 * .dlqEventQueueArn("dlqEventQueueArn")
 * .eventQueueArn("eventQueueArn")
 * .exclusions(List.of("exclusions"))
 * .path("path")
 * .sampleSize(123)
 * .build()))
 * .build())
 * // the properties below are optional
 * .classifiers(List.of("classifiers"))
 * .configuration("configuration")
 * .crawlerSecurityConfiguration("crawlerSecurityConfiguration")
 * .databaseName("databaseName")
 * .description("description")
 * .name("name")
 * .recrawlPolicy(RecrawlPolicyProperty.builder()
 * .recrawlBehavior("recrawlBehavior")
 * .build())
 * .schedule(ScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .schemaChangePolicy(SchemaChangePolicyProperty.builder()
 * .deleteBehavior("deleteBehavior")
 * .updateBehavior("updateBehavior")
 * .build())
 * .tablePrefix("tablePrefix")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html)
 */
@CdkDslMarker
public class CfnCrawlerPropsDsl {
    private val cdkBuilder: CfnCrawlerProps.Builder = CfnCrawlerProps.builder()

    private val _classifiers: MutableList<String> = mutableListOf()

    /**
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     *   are associated with the crawler.
     */
    public fun classifiers(vararg classifiers: String) {
        _classifiers.addAll(listOf(*classifiers))
    }

    /**
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     *   are associated with the crawler.
     */
    public fun classifiers(classifiers: Collection<String>) {
        _classifiers.addAll(classifiers)
    }

    /**
     * @param configuration Crawler configuration information. This versioned JSON string allows
     *   users to specify aspects of a crawler's behavior. For more information, see
     *   [Configuring a Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html)
     *   .
     */
    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param crawlerSecurityConfiguration The name of the `SecurityConfiguration` structure to be
     *   used by this crawler.
     */
    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String) {
        cdkBuilder.crawlerSecurityConfiguration(crawlerSecurityConfiguration)
    }

    /** @param databaseName The name of the database in which the crawler's output is stored. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param description A description of the crawler. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the crawler. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     *   crawl only folders that were added since the last crawler run.
     */
    public fun recrawlPolicy(recrawlPolicy: IResolvable) {
        cdkBuilder.recrawlPolicy(recrawlPolicy)
    }

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     *   crawl only folders that were added since the last crawler run.
     */
    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty) {
        cdkBuilder.recrawlPolicy(recrawlPolicy)
    }

    /**
     * @param role The Amazon Resource Name (ARN) of an IAM role that's used to access customer
     *   resources, such as Amazon Simple Storage Service (Amazon S3) data.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /** @param schedule For scheduled crawlers, the schedule when the crawler runs. */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /** @param schedule For scheduled crawlers, the schedule when the crawler runs. */
    public fun schedule(schedule: CfnCrawler.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     *   crawler. The policy tells the crawler what to do in the event that it detects a change in a
     *   table that already exists in the customer's database at the time of the crawl. The
     *   `SchemaChangePolicy` does not affect whether or how new tables and partitions are added.
     *   New tables and partitions are always created regardless of the `SchemaChangePolicy` on a
     *   crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    public fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
        cdkBuilder.schemaChangePolicy(schemaChangePolicy)
    }

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     *   crawler. The policy tells the crawler what to do in the event that it detects a change in a
     *   table that already exists in the customer's database at the time of the crawl. The
     *   `SchemaChangePolicy` does not affect whether or how new tables and partitions are added.
     *   New tables and partitions are always created regardless of the `SchemaChangePolicy` on a
     *   crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    public fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty) {
        cdkBuilder.schemaChangePolicy(schemaChangePolicy)
    }

    /** @param tablePrefix The prefix added to the names of tables that are created. */
    public fun tablePrefix(tablePrefix: String) {
        cdkBuilder.tablePrefix(tablePrefix)
    }

    /** @param tags The tags to use with this crawler. */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /** @param tags The tags to use with this crawler. */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /** @param targets A collection of targets to crawl. */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    /** @param targets A collection of targets to crawl. */
    public fun targets(targets: CfnCrawler.TargetsProperty) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnCrawlerProps {
        if (_classifiers.isNotEmpty()) cdkBuilder.classifiers(_classifiers)
        return cdkBuilder.build()
    }
}
