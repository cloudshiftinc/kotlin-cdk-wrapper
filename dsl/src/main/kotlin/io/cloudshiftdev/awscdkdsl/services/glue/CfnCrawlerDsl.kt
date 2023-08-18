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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnCrawler
import software.constructs.Construct

/**
 * The `AWS::Glue::Crawler` resource specifies an AWS Glue crawler.
 *
 * For more information, see
 * [Cataloging Tables with a Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
 * and
 * [Crawler Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-crawler-crawling.html#aws-glue-api-crawler-crawling-Crawler)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object tags;
 * CfnCrawler cfnCrawler = CfnCrawler.Builder.create(this, "MyCfnCrawler")
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
 * .icebergTargets(List.of(IcebergTargetProperty.builder()
 * .connectionName("connectionName")
 * .exclusions(List.of("exclusions"))
 * .maximumTraversalDepth(123)
 * .paths(List.of("paths"))
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
public class CfnCrawlerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCrawler.Builder = CfnCrawler.Builder.create(scope, id)

    private val _classifiers: MutableList<String> = mutableListOf()

    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     *
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     *   are associated with the crawler.
     */
    public fun classifiers(vararg classifiers: String) {
        _classifiers.addAll(listOf(*classifiers))
    }

    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     *
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     *   are associated with the crawler.
     */
    public fun classifiers(classifiers: Collection<String>) {
        _classifiers.addAll(classifiers)
    }

    /**
     * Crawler configuration information.
     *
     * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
     * information, see
     * [Configuring a Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration)
     *
     * @param configuration Crawler configuration information.
     */
    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The name of the `SecurityConfiguration` structure to be used by this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration)
     *
     * @param crawlerSecurityConfiguration The name of the `SecurityConfiguration` structure to be
     *   used by this crawler.
     */
    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String) {
        cdkBuilder.crawlerSecurityConfiguration(crawlerSecurityConfiguration)
    }

    /**
     * The name of the database in which the crawler's output is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
     *
     * @param databaseName The name of the database in which the crawler's output is stored.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * A description of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
     *
     * @param description A description of the crawler.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
     *
     * @param name The name of the crawler.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     *
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     *   crawl only folders that were added since the last crawler run.
     */
    public fun recrawlPolicy(recrawlPolicy: IResolvable) {
        cdkBuilder.recrawlPolicy(recrawlPolicy)
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     *
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     *   crawl only folders that were added since the last crawler run.
     */
    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty) {
        cdkBuilder.recrawlPolicy(recrawlPolicy)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such
     * as Amazon Simple Storage Service (Amazon S3) data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
     *
     * @param role The Amazon Resource Name (ARN) of an IAM role that's used to access customer
     *   resources, such as Amazon Simple Storage Service (Amazon S3) data.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     *
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     *
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    public fun schedule(schedule: CfnCrawler.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * The policy that specifies update and delete behaviors for the crawler.
     *
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
     *
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     *   crawler.
     */
    public fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
        cdkBuilder.schemaChangePolicy(schemaChangePolicy)
    }

    /**
     * The policy that specifies update and delete behaviors for the crawler.
     *
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
     *
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     *   crawler.
     */
    public fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty) {
        cdkBuilder.schemaChangePolicy(schemaChangePolicy)
    }

    /**
     * The prefix added to the names of tables that are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
     *
     * @param tablePrefix The prefix added to the names of tables that are created.
     */
    public fun tablePrefix(tablePrefix: String) {
        cdkBuilder.tablePrefix(tablePrefix)
    }

    /**
     * The tags to use with this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags)
     *
     * @param tags The tags to use with this crawler.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * The tags to use with this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags)
     *
     * @param tags The tags to use with this crawler.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     *
     * @param targets A collection of targets to crawl.
     */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     *
     * @param targets A collection of targets to crawl.
     */
    public fun targets(targets: CfnCrawler.TargetsProperty) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnCrawler {
        if (_classifiers.isNotEmpty()) cdkBuilder.classifiers(_classifiers)
        return cdkBuilder.build()
    }
}
