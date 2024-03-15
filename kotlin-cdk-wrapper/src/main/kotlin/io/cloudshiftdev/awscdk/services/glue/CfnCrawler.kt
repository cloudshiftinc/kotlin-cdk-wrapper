@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Glue::Crawler` resource specifies an AWS Glue crawler.
 *
 * For more information, see [Cataloging Tables with a
 * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) and [Crawler
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-crawler-crawling.html#aws-glue-api-crawler-crawling-Crawler)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
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
public open class CfnCrawler internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
   * the crawler.
   */
  public open fun classifiers(): List<String> = unwrap(this).getClassifiers() ?: emptyList()

  /**
   * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
   * the crawler.
   */
  public open fun classifiers(`value`: List<String>) {
    unwrap(this).setClassifiers(`value`)
  }

  /**
   * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
   * the crawler.
   */
  public open fun classifiers(vararg `value`: String): Unit = classifiers(`value`.toList())

  /**
   * Crawler configuration information.
   */
  public open fun configuration(): String? = unwrap(this).getConfiguration()

  /**
   * Crawler configuration information.
   */
  public open fun configuration(`value`: String) {
    unwrap(this).setConfiguration(`value`)
  }

  /**
   * The name of the `SecurityConfiguration` structure to be used by this crawler.
   */
  public open fun crawlerSecurityConfiguration(): String? =
      unwrap(this).getCrawlerSecurityConfiguration()

  /**
   * The name of the `SecurityConfiguration` structure to be used by this crawler.
   */
  public open fun crawlerSecurityConfiguration(`value`: String) {
    unwrap(this).setCrawlerSecurityConfiguration(`value`)
  }

  /**
   * The name of the database in which the crawler's output is stored.
   */
  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * The name of the database in which the crawler's output is stored.
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  /**
   * A description of the crawler.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the crawler.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the crawler.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the crawler.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
   * that were added since the last crawler run.
   */
  public open fun recrawlPolicy(): Any? = unwrap(this).getRecrawlPolicy()

  /**
   * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
   * that were added since the last crawler run.
   */
  public open fun recrawlPolicy(`value`: IResolvable) {
    unwrap(this).setRecrawlPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
   * that were added since the last crawler run.
   */
  public open fun recrawlPolicy(`value`: RecrawlPolicyProperty) {
    unwrap(this).setRecrawlPolicy(`value`.let(RecrawlPolicyProperty::unwrap))
  }

  /**
   * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
   * that were added since the last crawler run.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("09fed8f4eef13b0ea0626860b85955cc21bceb090515bcfb518210a4bdb4b5fb")
  public open fun recrawlPolicy(`value`: RecrawlPolicyProperty.Builder.() -> Unit): Unit =
      recrawlPolicy(RecrawlPolicyProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as
   * Amazon Simple Storage Service (Amazon S3) data.
   */
  public open fun role(): String = unwrap(this).getRole()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as
   * Amazon Simple Storage Service (Amazon S3) data.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * For scheduled crawlers, the schedule when the crawler runs.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * For scheduled crawlers, the schedule when the crawler runs.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  /**
   * For scheduled crawlers, the schedule when the crawler runs.
   */
  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  /**
   * For scheduled crawlers, the schedule when the crawler runs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5633d9c796a85d98f1c57006fc714d1f065a39305374fd17df40123db4a7e04d")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  /**
   * The policy that specifies update and delete behaviors for the crawler.
   */
  public open fun schemaChangePolicy(): Any? = unwrap(this).getSchemaChangePolicy()

  /**
   * The policy that specifies update and delete behaviors for the crawler.
   */
  public open fun schemaChangePolicy(`value`: IResolvable) {
    unwrap(this).setSchemaChangePolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The policy that specifies update and delete behaviors for the crawler.
   */
  public open fun schemaChangePolicy(`value`: SchemaChangePolicyProperty) {
    unwrap(this).setSchemaChangePolicy(`value`.let(SchemaChangePolicyProperty::unwrap))
  }

  /**
   * The policy that specifies update and delete behaviors for the crawler.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe33944b1a08ade4e129bc0dc62c7a6f2791e469329f198a69669566073ff19f")
  public open fun schemaChangePolicy(`value`: SchemaChangePolicyProperty.Builder.() -> Unit): Unit =
      schemaChangePolicy(SchemaChangePolicyProperty(`value`))

  /**
   * The prefix added to the names of tables that are created.
   */
  public open fun tablePrefix(): String? = unwrap(this).getTablePrefix()

  /**
   * The prefix added to the names of tables that are created.
   */
  public open fun tablePrefix(`value`: String) {
    unwrap(this).setTablePrefix(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to use with this crawler.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The tags to use with this crawler.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A collection of targets to crawl.
   */
  public open fun targets(): Any = unwrap(this).getTargets()

  /**
   * A collection of targets to crawl.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * A collection of targets to crawl.
   */
  public open fun targets(`value`: TargetsProperty) {
    unwrap(this).setTargets(`value`.let(TargetsProperty::unwrap))
  }

  /**
   * A collection of targets to crawl.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5b9c12edf304f1fe865c731da232241bee912b7f43f1ee98266704083660b9e")
  public open fun targets(`value`: TargetsProperty.Builder.() -> Unit): Unit =
      targets(TargetsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnCrawler].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler. 
     */
    public fun classifiers(classifiers: List<String>)

    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler. 
     */
    public fun classifiers(vararg classifiers: String)

    /**
     * Crawler configuration information.
     *
     * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
     * information, see [Configuring a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration)
     * @param configuration Crawler configuration information. 
     */
    public fun configuration(configuration: String)

    /**
     * The name of the `SecurityConfiguration` structure to be used by this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration)
     * @param crawlerSecurityConfiguration The name of the `SecurityConfiguration` structure to be
     * used by this crawler. 
     */
    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String)

    /**
     * The name of the database in which the crawler's output is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
     * @param databaseName The name of the database in which the crawler's output is stored. 
     */
    public fun databaseName(databaseName: String)

    /**
     * A description of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
     * @param description A description of the crawler. 
     */
    public fun description(description: String)

    /**
     * The name of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
     * @param name The name of the crawler. 
     */
    public fun name(name: String)

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run. 
     */
    public fun recrawlPolicy(recrawlPolicy: IResolvable)

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run. 
     */
    public fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty)

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ba5594a016b6832aaa15f4ee49c0d1fb127a8678f8be249d8255e368f35d7a3")
    public fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such
     * as Amazon Simple Storage Service (Amazon S3) data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
     * @param role The Amazon Resource Name (ARN) of an IAM role that's used to access customer
     * resources, such as Amazon Simple Storage Service (Amazon S3) data. 
     */
    public fun role(role: String)

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     * @param schedule For scheduled crawlers, the schedule when the crawler runs. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     * @param schedule For scheduled crawlers, the schedule when the crawler runs. 
     */
    public fun schedule(schedule: ScheduleProperty)

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     * @param schedule For scheduled crawlers, the schedule when the crawler runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a696fd1898cddc8c22693f98a8145cbc8b15e7bc3d6054d10900cc716e5d471")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

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
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler. 
     */
    public fun schemaChangePolicy(schemaChangePolicy: IResolvable)

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
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler. 
     */
    public fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty)

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
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b716e27af2a3d3a2fad1065e6f782d8ab4f64ae1928e7549f53995479842be3c")
    public fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty.Builder.() -> Unit)

    /**
     * The prefix added to the names of tables that are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
     * @param tablePrefix The prefix added to the names of tables that are created. 
     */
    public fun tablePrefix(tablePrefix: String)

    /**
     * The tags to use with this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags)
     * @param tags The tags to use with this crawler. 
     */
    public fun tags(tags: Any)

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     * @param targets A collection of targets to crawl. 
     */
    public fun targets(targets: IResolvable)

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     * @param targets A collection of targets to crawl. 
     */
    public fun targets(targets: TargetsProperty)

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     * @param targets A collection of targets to crawl. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cc3927cdad123b2c3fb3f63af5bb8db9e9dfaaa55ca1464764d438161323d7")
    public fun targets(targets: TargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCrawler.Builder =
        software.amazon.awscdk.services.glue.CfnCrawler.Builder.create(scope, id)

    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler. 
     */
    override fun classifiers(classifiers: List<String>) {
      cdkBuilder.classifiers(classifiers)
    }

    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler. 
     */
    override fun classifiers(vararg classifiers: String): Unit = classifiers(classifiers.toList())

    /**
     * Crawler configuration information.
     *
     * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
     * information, see [Configuring a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration)
     * @param configuration Crawler configuration information. 
     */
    override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * The name of the `SecurityConfiguration` structure to be used by this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration)
     * @param crawlerSecurityConfiguration The name of the `SecurityConfiguration` structure to be
     * used by this crawler. 
     */
    override fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String) {
      cdkBuilder.crawlerSecurityConfiguration(crawlerSecurityConfiguration)
    }

    /**
     * The name of the database in which the crawler's output is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
     * @param databaseName The name of the database in which the crawler's output is stored. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * A description of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
     * @param description A description of the crawler. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
     * @param name The name of the crawler. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run. 
     */
    override fun recrawlPolicy(recrawlPolicy: IResolvable) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(IResolvable::unwrap))
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run. 
     */
    override fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(RecrawlPolicyProperty::unwrap))
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ba5594a016b6832aaa15f4ee49c0d1fb127a8678f8be249d8255e368f35d7a3")
    override fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty.Builder.() -> Unit): Unit =
        recrawlPolicy(RecrawlPolicyProperty(recrawlPolicy))

    /**
     * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such
     * as Amazon Simple Storage Service (Amazon S3) data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
     * @param role The Amazon Resource Name (ARN) of an IAM role that's used to access customer
     * resources, such as Amazon Simple Storage Service (Amazon S3) data. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     * @param schedule For scheduled crawlers, the schedule when the crawler runs. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     * @param schedule For scheduled crawlers, the schedule when the crawler runs. 
     */
    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     * @param schedule For scheduled crawlers, the schedule when the crawler runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a696fd1898cddc8c22693f98a8145cbc8b15e7bc3d6054d10900cc716e5d471")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

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
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler. 
     */
    override fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(IResolvable::unwrap))
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
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler. 
     */
    override fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(SchemaChangePolicyProperty::unwrap))
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
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b716e27af2a3d3a2fad1065e6f782d8ab4f64ae1928e7549f53995479842be3c")
    override
        fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty.Builder.() -> Unit):
        Unit = schemaChangePolicy(SchemaChangePolicyProperty(schemaChangePolicy))

    /**
     * The prefix added to the names of tables that are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
     * @param tablePrefix The prefix added to the names of tables that are created. 
     */
    override fun tablePrefix(tablePrefix: String) {
      cdkBuilder.tablePrefix(tablePrefix)
    }

    /**
     * The tags to use with this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags)
     * @param tags The tags to use with this crawler. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     * @param targets A collection of targets to crawl. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     * @param targets A collection of targets to crawl. 
     */
    override fun targets(targets: TargetsProperty) {
      cdkBuilder.targets(targets.let(TargetsProperty::unwrap))
    }

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     * @param targets A collection of targets to crawl. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cc3927cdad123b2c3fb3f63af5bb8db9e9dfaaa55ca1464764d438161323d7")
    override fun targets(targets: TargetsProperty.Builder.() -> Unit): Unit =
        targets(TargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.glue.CfnCrawler = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnCrawler.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCrawler {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCrawler(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler): CfnCrawler =
        CfnCrawler(cdkObject)

    internal fun unwrap(wrapped: CfnCrawler): software.amazon.awscdk.services.glue.CfnCrawler =
        wrapped.cdkObject
  }

  /**
   * Specifies a data store in Amazon Simple Storage Service (Amazon S3).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
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
  public interface S3TargetProperty {
    /**
     * The name of a connection which allows a job or crawler to access data in Amazon S3 within an
     * Amazon Virtual Private Cloud environment (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * A valid Amazon dead-letter SQS ARN.
     *
     * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-dlqeventqueuearn)
     */
    public fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

    /**
     * A valid Amazon SQS ARN.
     *
     * For example, `arn:aws:sqs:region:account:sqs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-eventqueuearn)
     */
    public fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

    /**
     * A list of glob patterns used to exclude from the crawl.
     *
     * For more information, see [Catalog Tables with a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions)
     */
    public fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

    /**
     * The path to the Amazon S3 target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * Sets the number of files in each leaf folder to be crawled when crawling sample files in a
     * dataset.
     *
     * If not set, all the files are crawled. A valid value is an integer between 1 and 249.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-samplesize)
     */
    public fun sampleSize(): Number? = unwrap(this).getSampleSize()

    /**
     * A builder for [S3TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of a connection which allows a job or crawler to access data
       * in Amazon S3 within an Amazon Virtual Private Cloud environment (Amazon VPC).
       */
      public fun connectionName(connectionName: String)

      /**
       * @param dlqEventQueueArn A valid Amazon dead-letter SQS ARN.
       * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
       */
      public fun dlqEventQueueArn(dlqEventQueueArn: String)

      /**
       * @param eventQueueArn A valid Amazon SQS ARN.
       * For example, `arn:aws:sqs:region:account:sqs` .
       */
      public fun eventQueueArn(eventQueueArn: String)

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      public fun exclusions(exclusions: List<String>)

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      public fun exclusions(vararg exclusions: String)

      /**
       * @param path The path to the Amazon S3 target.
       */
      public fun path(path: String)

      /**
       * @param sampleSize Sets the number of files in each leaf folder to be crawled when crawling
       * sample files in a dataset.
       * If not set, all the files are crawled. A valid value is an integer between 1 and 249.
       */
      public fun sampleSize(sampleSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty.builder()

      /**
       * @param connectionName The name of a connection which allows a job or crawler to access data
       * in Amazon S3 within an Amazon Virtual Private Cloud environment (Amazon VPC).
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param dlqEventQueueArn A valid Amazon dead-letter SQS ARN.
       * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
       */
      override fun dlqEventQueueArn(dlqEventQueueArn: String) {
        cdkBuilder.dlqEventQueueArn(dlqEventQueueArn)
      }

      /**
       * @param eventQueueArn A valid Amazon SQS ARN.
       * For example, `arn:aws:sqs:region:account:sqs` .
       */
      override fun eventQueueArn(eventQueueArn: String) {
        cdkBuilder.eventQueueArn(eventQueueArn)
      }

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      override fun exclusions(exclusions: List<String>) {
        cdkBuilder.exclusions(exclusions)
      }

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      override fun exclusions(vararg exclusions: String): Unit = exclusions(exclusions.toList())

      /**
       * @param path The path to the Amazon S3 target.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param sampleSize Sets the number of files in each leaf folder to be crawled when crawling
       * sample files in a dataset.
       * If not set, all the files are crawled. A valid value is an integer between 1 and 249.
       */
      override fun sampleSize(sampleSize: Number) {
        cdkBuilder.sampleSize(sampleSize)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty,
    ) : CdkObject(cdkObject), S3TargetProperty {
      /**
       * The name of a connection which allows a job or crawler to access data in Amazon S3 within
       * an Amazon Virtual Private Cloud environment (Amazon VPC).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * A valid Amazon dead-letter SQS ARN.
       *
       * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-dlqeventqueuearn)
       */
      override fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

      /**
       * A valid Amazon SQS ARN.
       *
       * For example, `arn:aws:sqs:region:account:sqs` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-eventqueuearn)
       */
      override fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

      /**
       * A list of glob patterns used to exclude from the crawl.
       *
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions)
       */
      override fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

      /**
       * The path to the Amazon S3 target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * Sets the number of files in each leaf folder to be crawled when crawling sample files in a
       * dataset.
       *
       * If not set, all the files are crawled. A valid value is an integer between 1 and 249.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-samplesize)
       */
      override fun sampleSize(): Number? = unwrap(this).getSampleSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty):
          S3TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3TargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty
    }
  }

  /**
   * When crawling an Amazon S3 data source after the first crawl is complete, specifies whether to
   * crawl the entire dataset again or to crawl only folders that were added since the last crawler
   * run.
   *
   * For more information, see [Incremental Crawls in AWS
   * Glue](https://docs.aws.amazon.com/glue/latest/dg/incremental-crawls.html) in the developer guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * RecrawlPolicyProperty recrawlPolicyProperty = RecrawlPolicyProperty.builder()
   * .recrawlBehavior("recrawlBehavior")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-recrawlpolicy.html)
   */
  public interface RecrawlPolicyProperty {
    /**
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added
     * since the last crawler run.
     *
     * A value of `CRAWL_EVERYTHING` specifies crawling the entire dataset again.
     *
     * A value of `CRAWL_NEW_FOLDERS_ONLY` specifies crawling only folders that were added since the
     * last crawler run.
     *
     * A value of `CRAWL_EVENT_MODE` specifies crawling only the changes identified by Amazon S3
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-recrawlpolicy.html#cfn-glue-crawler-recrawlpolicy-recrawlbehavior)
     */
    public fun recrawlBehavior(): String? = unwrap(this).getRecrawlBehavior()

    /**
     * A builder for [RecrawlPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recrawlBehavior Specifies whether to crawl the entire dataset again or to crawl only
       * folders that were added since the last crawler run.
       * A value of `CRAWL_EVERYTHING` specifies crawling the entire dataset again.
       *
       * A value of `CRAWL_NEW_FOLDERS_ONLY` specifies crawling only folders that were added since
       * the last crawler run.
       *
       * A value of `CRAWL_EVENT_MODE` specifies crawling only the changes identified by Amazon S3
       * events.
       */
      public fun recrawlBehavior(recrawlBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty.builder()

      /**
       * @param recrawlBehavior Specifies whether to crawl the entire dataset again or to crawl only
       * folders that were added since the last crawler run.
       * A value of `CRAWL_EVERYTHING` specifies crawling the entire dataset again.
       *
       * A value of `CRAWL_NEW_FOLDERS_ONLY` specifies crawling only folders that were added since
       * the last crawler run.
       *
       * A value of `CRAWL_EVENT_MODE` specifies crawling only the changes identified by Amazon S3
       * events.
       */
      override fun recrawlBehavior(recrawlBehavior: String) {
        cdkBuilder.recrawlBehavior(recrawlBehavior)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty,
    ) : CdkObject(cdkObject), RecrawlPolicyProperty {
      /**
       * Specifies whether to crawl the entire dataset again or to crawl only folders that were
       * added since the last crawler run.
       *
       * A value of `CRAWL_EVERYTHING` specifies crawling the entire dataset again.
       *
       * A value of `CRAWL_NEW_FOLDERS_ONLY` specifies crawling only folders that were added since
       * the last crawler run.
       *
       * A value of `CRAWL_EVENT_MODE` specifies crawling only the changes identified by Amazon S3
       * events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-recrawlpolicy.html#cfn-glue-crawler-recrawlpolicy-recrawlbehavior)
       */
      override fun recrawlBehavior(): String? = unwrap(this).getRecrawlBehavior()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecrawlPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty):
          RecrawlPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecrawlPolicyProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty
    }
  }

  /**
   * Specifies an AWS Glue Data Catalog target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
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
  public interface CatalogTargetProperty {
    /**
     * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the
     * crawl when using a `Catalog` connection type paired with a `NETWORK` Connection type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * The name of the database to be synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * A valid Amazon dead-letter SQS ARN.
     *
     * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-dlqeventqueuearn)
     */
    public fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

    /**
     * A valid Amazon SQS ARN.
     *
     * For example, `arn:aws:sqs:region:account:sqs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-eventqueuearn)
     */
    public fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

    /**
     * A list of the tables to be synchronized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-tables)
     */
    public fun tables(): List<String> = unwrap(this).getTables() ?: emptyList()

    /**
     * A builder for [CatalogTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of the connection for an Amazon S3-backed Data Catalog table
       * to be a target of the crawl when using a `Catalog` connection type paired with a `NETWORK`
       * Connection type.
       */
      public fun connectionName(connectionName: String)

      /**
       * @param databaseName The name of the database to be synchronized.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param dlqEventQueueArn A valid Amazon dead-letter SQS ARN.
       * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
       */
      public fun dlqEventQueueArn(dlqEventQueueArn: String)

      /**
       * @param eventQueueArn A valid Amazon SQS ARN.
       * For example, `arn:aws:sqs:region:account:sqs` .
       */
      public fun eventQueueArn(eventQueueArn: String)

      /**
       * @param tables A list of the tables to be synchronized.
       */
      public fun tables(tables: List<String>)

      /**
       * @param tables A list of the tables to be synchronized.
       */
      public fun tables(vararg tables: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty.builder()

      /**
       * @param connectionName The name of the connection for an Amazon S3-backed Data Catalog table
       * to be a target of the crawl when using a `Catalog` connection type paired with a `NETWORK`
       * Connection type.
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param databaseName The name of the database to be synchronized.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param dlqEventQueueArn A valid Amazon dead-letter SQS ARN.
       * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
       */
      override fun dlqEventQueueArn(dlqEventQueueArn: String) {
        cdkBuilder.dlqEventQueueArn(dlqEventQueueArn)
      }

      /**
       * @param eventQueueArn A valid Amazon SQS ARN.
       * For example, `arn:aws:sqs:region:account:sqs` .
       */
      override fun eventQueueArn(eventQueueArn: String) {
        cdkBuilder.eventQueueArn(eventQueueArn)
      }

      /**
       * @param tables A list of the tables to be synchronized.
       */
      override fun tables(tables: List<String>) {
        cdkBuilder.tables(tables)
      }

      /**
       * @param tables A list of the tables to be synchronized.
       */
      override fun tables(vararg tables: String): Unit = tables(tables.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty,
    ) : CdkObject(cdkObject), CatalogTargetProperty {
      /**
       * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the
       * crawl when using a `Catalog` connection type paired with a `NETWORK` Connection type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * The name of the database to be synchronized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * A valid Amazon dead-letter SQS ARN.
       *
       * For example, `arn:aws:sqs:region:account:deadLetterQueue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-dlqeventqueuearn)
       */
      override fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

      /**
       * A valid Amazon SQS ARN.
       *
       * For example, `arn:aws:sqs:region:account:sqs` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-eventqueuearn)
       */
      override fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

      /**
       * A list of the tables to be synchronized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html#cfn-glue-crawler-catalogtarget-tables)
       */
      override fun tables(): List<String> = unwrap(this).getTables() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CatalogTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty):
          CatalogTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CatalogTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty
    }
  }

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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * SchemaChangePolicyProperty schemaChangePolicyProperty = SchemaChangePolicyProperty.builder()
   * .deleteBehavior("deleteBehavior")
   * .updateBehavior("updateBehavior")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html)
   */
  public interface SchemaChangePolicyProperty {
    /**
     * The deletion behavior when the crawler finds a deleted object.
     *
     * A value of `LOG` specifies that if a table or partition is found to no longer exist, do not
     * delete it, only log that it was found to no longer exist.
     *
     * A value of `DELETE_FROM_DATABASE` specifies that if a table or partition is found to have
     * been removed, delete it from the database.
     *
     * A value of `DEPRECATE_IN_DATABASE` specifies that if a table has been found to no longer
     * exist, to add a property to the table that says "DEPRECATED" and includes a timestamp with the
     * time of deprecation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior)
     */
    public fun deleteBehavior(): String? = unwrap(this).getDeleteBehavior()

    /**
     * The update behavior when the crawler finds a changed schema.
     *
     * A value of `LOG` specifies that if a table or a partition already exists, and a change is
     * detected, do not update it, only log that a change was detected. Add new tables and new
     * partitions (including on existing tables).
     *
     * A value of `UPDATE_IN_DATABASE` specifies that if a table or partition already exists, and a
     * change is detected, update it. Add new tables and partitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior)
     */
    public fun updateBehavior(): String? = unwrap(this).getUpdateBehavior()

    /**
     * A builder for [SchemaChangePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteBehavior The deletion behavior when the crawler finds a deleted object.
       * A value of `LOG` specifies that if a table or partition is found to no longer exist, do not
       * delete it, only log that it was found to no longer exist.
       *
       * A value of `DELETE_FROM_DATABASE` specifies that if a table or partition is found to have
       * been removed, delete it from the database.
       *
       * A value of `DEPRECATE_IN_DATABASE` specifies that if a table has been found to no longer
       * exist, to add a property to the table that says "DEPRECATED" and includes a timestamp with the
       * time of deprecation.
       */
      public fun deleteBehavior(deleteBehavior: String)

      /**
       * @param updateBehavior The update behavior when the crawler finds a changed schema.
       * A value of `LOG` specifies that if a table or a partition already exists, and a change is
       * detected, do not update it, only log that a change was detected. Add new tables and new
       * partitions (including on existing tables).
       *
       * A value of `UPDATE_IN_DATABASE` specifies that if a table or partition already exists, and
       * a change is detected, update it. Add new tables and partitions.
       */
      public fun updateBehavior(updateBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty.builder()

      /**
       * @param deleteBehavior The deletion behavior when the crawler finds a deleted object.
       * A value of `LOG` specifies that if a table or partition is found to no longer exist, do not
       * delete it, only log that it was found to no longer exist.
       *
       * A value of `DELETE_FROM_DATABASE` specifies that if a table or partition is found to have
       * been removed, delete it from the database.
       *
       * A value of `DEPRECATE_IN_DATABASE` specifies that if a table has been found to no longer
       * exist, to add a property to the table that says "DEPRECATED" and includes a timestamp with the
       * time of deprecation.
       */
      override fun deleteBehavior(deleteBehavior: String) {
        cdkBuilder.deleteBehavior(deleteBehavior)
      }

      /**
       * @param updateBehavior The update behavior when the crawler finds a changed schema.
       * A value of `LOG` specifies that if a table or a partition already exists, and a change is
       * detected, do not update it, only log that a change was detected. Add new tables and new
       * partitions (including on existing tables).
       *
       * A value of `UPDATE_IN_DATABASE` specifies that if a table or partition already exists, and
       * a change is detected, update it. Add new tables and partitions.
       */
      override fun updateBehavior(updateBehavior: String) {
        cdkBuilder.updateBehavior(updateBehavior)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty,
    ) : CdkObject(cdkObject), SchemaChangePolicyProperty {
      /**
       * The deletion behavior when the crawler finds a deleted object.
       *
       * A value of `LOG` specifies that if a table or partition is found to no longer exist, do not
       * delete it, only log that it was found to no longer exist.
       *
       * A value of `DELETE_FROM_DATABASE` specifies that if a table or partition is found to have
       * been removed, delete it from the database.
       *
       * A value of `DEPRECATE_IN_DATABASE` specifies that if a table has been found to no longer
       * exist, to add a property to the table that says "DEPRECATED" and includes a timestamp with the
       * time of deprecation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior)
       */
      override fun deleteBehavior(): String? = unwrap(this).getDeleteBehavior()

      /**
       * The update behavior when the crawler finds a changed schema.
       *
       * A value of `LOG` specifies that if a table or a partition already exists, and a change is
       * detected, do not update it, only log that a change was detected. Add new tables and new
       * partitions (including on existing tables).
       *
       * A value of `UPDATE_IN_DATABASE` specifies that if a table or partition already exists, and
       * a change is detected, update it. Add new tables and partitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior)
       */
      override fun updateBehavior(): String? = unwrap(this).getUpdateBehavior()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaChangePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty):
          SchemaChangePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaChangePolicyProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty
    }
  }

  /**
   * Specifies a Delta data store to crawl one or more Delta tables.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * DeltaTargetProperty deltaTargetProperty = DeltaTargetProperty.builder()
   * .connectionName("connectionName")
   * .createNativeDeltaTable(false)
   * .deltaTables(List.of("deltaTables"))
   * .writeManifest(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html)
   */
  public interface DeltaTargetProperty {
    /**
     * The name of the connection to use to connect to the Delta table target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * Specifies whether the crawler will create native tables, to allow integration with query
     * engines that support querying of the Delta transaction log directly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-createnativedeltatable)
     */
    public fun createNativeDeltaTable(): Any? = unwrap(this).getCreateNativeDeltaTable()

    /**
     * A list of the Amazon S3 paths to the Delta tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-deltatables)
     */
    public fun deltaTables(): List<String> = unwrap(this).getDeltaTables() ?: emptyList()

    /**
     * Specifies whether to write the manifest files to the Delta table path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-writemanifest)
     */
    public fun writeManifest(): Any? = unwrap(this).getWriteManifest()

    /**
     * A builder for [DeltaTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of the connection to use to connect to the Delta table
       * target.
       */
      public fun connectionName(connectionName: String)

      /**
       * @param createNativeDeltaTable Specifies whether the crawler will create native tables, to
       * allow integration with query engines that support querying of the Delta transaction log
       * directly.
       */
      public fun createNativeDeltaTable(createNativeDeltaTable: Boolean)

      /**
       * @param createNativeDeltaTable Specifies whether the crawler will create native tables, to
       * allow integration with query engines that support querying of the Delta transaction log
       * directly.
       */
      public fun createNativeDeltaTable(createNativeDeltaTable: IResolvable)

      /**
       * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
       */
      public fun deltaTables(deltaTables: List<String>)

      /**
       * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
       */
      public fun deltaTables(vararg deltaTables: String)

      /**
       * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
       */
      public fun writeManifest(writeManifest: Boolean)

      /**
       * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
       */
      public fun writeManifest(writeManifest: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty.builder()

      /**
       * @param connectionName The name of the connection to use to connect to the Delta table
       * target.
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param createNativeDeltaTable Specifies whether the crawler will create native tables, to
       * allow integration with query engines that support querying of the Delta transaction log
       * directly.
       */
      override fun createNativeDeltaTable(createNativeDeltaTable: Boolean) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable)
      }

      /**
       * @param createNativeDeltaTable Specifies whether the crawler will create native tables, to
       * allow integration with query engines that support querying of the Delta transaction log
       * directly.
       */
      override fun createNativeDeltaTable(createNativeDeltaTable: IResolvable) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable.let(IResolvable::unwrap))
      }

      /**
       * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
       */
      override fun deltaTables(deltaTables: List<String>) {
        cdkBuilder.deltaTables(deltaTables)
      }

      /**
       * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
       */
      override fun deltaTables(vararg deltaTables: String): Unit = deltaTables(deltaTables.toList())

      /**
       * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
       */
      override fun writeManifest(writeManifest: Boolean) {
        cdkBuilder.writeManifest(writeManifest)
      }

      /**
       * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
       */
      override fun writeManifest(writeManifest: IResolvable) {
        cdkBuilder.writeManifest(writeManifest.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty,
    ) : CdkObject(cdkObject), DeltaTargetProperty {
      /**
       * The name of the connection to use to connect to the Delta table target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * Specifies whether the crawler will create native tables, to allow integration with query
       * engines that support querying of the Delta transaction log directly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-createnativedeltatable)
       */
      override fun createNativeDeltaTable(): Any? = unwrap(this).getCreateNativeDeltaTable()

      /**
       * A list of the Amazon S3 paths to the Delta tables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-deltatables)
       */
      override fun deltaTables(): List<String> = unwrap(this).getDeltaTables() ?: emptyList()

      /**
       * Specifies whether to write the manifest files to the Delta table path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html#cfn-glue-crawler-deltatarget-writemanifest)
       */
      override fun writeManifest(): Any? = unwrap(this).getWriteManifest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeltaTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty):
          DeltaTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty
    }
  }

  /**
   * A scheduling object using a `cron` statement to schedule an event.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * A `cron` expression used to specify the schedule.
     *
     * For more information, see [Time-Based Schedules for Jobs and
     * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) . For
     * example, to run something every day at 12:15 UTC, specify `cron(15 12 * * ? *)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression)
     */
    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scheduleExpression A `cron` expression used to specify the schedule.
       * For more information, see [Time-Based Schedules for Jobs and
       * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) .
       * For example, to run something every day at 12:15 UTC, specify `cron(15 12 * * ? *)` .
       */
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty.builder()

      /**
       * @param scheduleExpression A `cron` expression used to specify the schedule.
       * For more information, see [Time-Based Schedules for Jobs and
       * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) .
       * For example, to run something every day at 12:15 UTC, specify `cron(15 12 * * ? *)` .
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty,
    ) : CdkObject(cdkObject), ScheduleProperty {
      /**
       * A `cron` expression used to specify the schedule.
       *
       * For more information, see [Time-Based Schedules for Jobs and
       * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) .
       * For example, to run something every day at 12:15 UTC, specify `cron(15 12 * * ? *)` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression)
       */
      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty
    }
  }

  /**
   * Specifies data stores to crawl.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * TargetsProperty targetsProperty = TargetsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html)
   */
  public interface TargetsProperty {
    /**
     * Specifies AWS Glue Data Catalog targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-catalogtargets)
     */
    public fun catalogTargets(): Any? = unwrap(this).getCatalogTargets()

    /**
     * Specifies an array of Delta data store targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-deltatargets)
     */
    public fun deltaTargets(): Any? = unwrap(this).getDeltaTargets()

    /**
     * Specifies Amazon DynamoDB targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-dynamodbtargets)
     */
    public fun dynamoDbTargets(): Any? = unwrap(this).getDynamoDbTargets()

    /**
     * Specifies Apache Iceberg data store targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-icebergtargets)
     */
    public fun icebergTargets(): Any? = unwrap(this).getIcebergTargets()

    /**
     * Specifies JDBC targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets)
     */
    public fun jdbcTargets(): Any? = unwrap(this).getJdbcTargets()

    /**
     * A list of Mongo DB targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-mongodbtargets)
     */
    public fun mongoDbTargets(): Any? = unwrap(this).getMongoDbTargets()

    /**
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets)
     */
    public fun s3Targets(): Any? = unwrap(this).getS3Targets()

    /**
     * A builder for [TargetsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogTargets Specifies AWS Glue Data Catalog targets.
       */
      public fun catalogTargets(catalogTargets: IResolvable)

      /**
       * @param catalogTargets Specifies AWS Glue Data Catalog targets.
       */
      public fun catalogTargets(catalogTargets: List<Any>)

      /**
       * @param catalogTargets Specifies AWS Glue Data Catalog targets.
       */
      public fun catalogTargets(vararg catalogTargets: Any)

      /**
       * @param deltaTargets Specifies an array of Delta data store targets.
       */
      public fun deltaTargets(deltaTargets: IResolvable)

      /**
       * @param deltaTargets Specifies an array of Delta data store targets.
       */
      public fun deltaTargets(deltaTargets: List<Any>)

      /**
       * @param deltaTargets Specifies an array of Delta data store targets.
       */
      public fun deltaTargets(vararg deltaTargets: Any)

      /**
       * @param dynamoDbTargets Specifies Amazon DynamoDB targets.
       */
      public fun dynamoDbTargets(dynamoDbTargets: IResolvable)

      /**
       * @param dynamoDbTargets Specifies Amazon DynamoDB targets.
       */
      public fun dynamoDbTargets(dynamoDbTargets: List<Any>)

      /**
       * @param dynamoDbTargets Specifies Amazon DynamoDB targets.
       */
      public fun dynamoDbTargets(vararg dynamoDbTargets: Any)

      /**
       * @param icebergTargets Specifies Apache Iceberg data store targets.
       */
      public fun icebergTargets(icebergTargets: IResolvable)

      /**
       * @param icebergTargets Specifies Apache Iceberg data store targets.
       */
      public fun icebergTargets(icebergTargets: List<Any>)

      /**
       * @param icebergTargets Specifies Apache Iceberg data store targets.
       */
      public fun icebergTargets(vararg icebergTargets: Any)

      /**
       * @param jdbcTargets Specifies JDBC targets.
       */
      public fun jdbcTargets(jdbcTargets: IResolvable)

      /**
       * @param jdbcTargets Specifies JDBC targets.
       */
      public fun jdbcTargets(jdbcTargets: List<Any>)

      /**
       * @param jdbcTargets Specifies JDBC targets.
       */
      public fun jdbcTargets(vararg jdbcTargets: Any)

      /**
       * @param mongoDbTargets A list of Mongo DB targets.
       */
      public fun mongoDbTargets(mongoDbTargets: IResolvable)

      /**
       * @param mongoDbTargets A list of Mongo DB targets.
       */
      public fun mongoDbTargets(mongoDbTargets: List<Any>)

      /**
       * @param mongoDbTargets A list of Mongo DB targets.
       */
      public fun mongoDbTargets(vararg mongoDbTargets: Any)

      /**
       * @param s3Targets Specifies Amazon Simple Storage Service (Amazon S3) targets.
       */
      public fun s3Targets(s3Targets: IResolvable)

      /**
       * @param s3Targets Specifies Amazon Simple Storage Service (Amazon S3) targets.
       */
      public fun s3Targets(s3Targets: List<Any>)

      /**
       * @param s3Targets Specifies Amazon Simple Storage Service (Amazon S3) targets.
       */
      public fun s3Targets(vararg s3Targets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty.builder()

      /**
       * @param catalogTargets Specifies AWS Glue Data Catalog targets.
       */
      override fun catalogTargets(catalogTargets: IResolvable) {
        cdkBuilder.catalogTargets(catalogTargets.let(IResolvable::unwrap))
      }

      /**
       * @param catalogTargets Specifies AWS Glue Data Catalog targets.
       */
      override fun catalogTargets(catalogTargets: List<Any>) {
        cdkBuilder.catalogTargets(catalogTargets)
      }

      /**
       * @param catalogTargets Specifies AWS Glue Data Catalog targets.
       */
      override fun catalogTargets(vararg catalogTargets: Any): Unit =
          catalogTargets(catalogTargets.toList())

      /**
       * @param deltaTargets Specifies an array of Delta data store targets.
       */
      override fun deltaTargets(deltaTargets: IResolvable) {
        cdkBuilder.deltaTargets(deltaTargets.let(IResolvable::unwrap))
      }

      /**
       * @param deltaTargets Specifies an array of Delta data store targets.
       */
      override fun deltaTargets(deltaTargets: List<Any>) {
        cdkBuilder.deltaTargets(deltaTargets)
      }

      /**
       * @param deltaTargets Specifies an array of Delta data store targets.
       */
      override fun deltaTargets(vararg deltaTargets: Any): Unit =
          deltaTargets(deltaTargets.toList())

      /**
       * @param dynamoDbTargets Specifies Amazon DynamoDB targets.
       */
      override fun dynamoDbTargets(dynamoDbTargets: IResolvable) {
        cdkBuilder.dynamoDbTargets(dynamoDbTargets.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDbTargets Specifies Amazon DynamoDB targets.
       */
      override fun dynamoDbTargets(dynamoDbTargets: List<Any>) {
        cdkBuilder.dynamoDbTargets(dynamoDbTargets)
      }

      /**
       * @param dynamoDbTargets Specifies Amazon DynamoDB targets.
       */
      override fun dynamoDbTargets(vararg dynamoDbTargets: Any): Unit =
          dynamoDbTargets(dynamoDbTargets.toList())

      /**
       * @param icebergTargets Specifies Apache Iceberg data store targets.
       */
      override fun icebergTargets(icebergTargets: IResolvable) {
        cdkBuilder.icebergTargets(icebergTargets.let(IResolvable::unwrap))
      }

      /**
       * @param icebergTargets Specifies Apache Iceberg data store targets.
       */
      override fun icebergTargets(icebergTargets: List<Any>) {
        cdkBuilder.icebergTargets(icebergTargets)
      }

      /**
       * @param icebergTargets Specifies Apache Iceberg data store targets.
       */
      override fun icebergTargets(vararg icebergTargets: Any): Unit =
          icebergTargets(icebergTargets.toList())

      /**
       * @param jdbcTargets Specifies JDBC targets.
       */
      override fun jdbcTargets(jdbcTargets: IResolvable) {
        cdkBuilder.jdbcTargets(jdbcTargets.let(IResolvable::unwrap))
      }

      /**
       * @param jdbcTargets Specifies JDBC targets.
       */
      override fun jdbcTargets(jdbcTargets: List<Any>) {
        cdkBuilder.jdbcTargets(jdbcTargets)
      }

      /**
       * @param jdbcTargets Specifies JDBC targets.
       */
      override fun jdbcTargets(vararg jdbcTargets: Any): Unit = jdbcTargets(jdbcTargets.toList())

      /**
       * @param mongoDbTargets A list of Mongo DB targets.
       */
      override fun mongoDbTargets(mongoDbTargets: IResolvable) {
        cdkBuilder.mongoDbTargets(mongoDbTargets.let(IResolvable::unwrap))
      }

      /**
       * @param mongoDbTargets A list of Mongo DB targets.
       */
      override fun mongoDbTargets(mongoDbTargets: List<Any>) {
        cdkBuilder.mongoDbTargets(mongoDbTargets)
      }

      /**
       * @param mongoDbTargets A list of Mongo DB targets.
       */
      override fun mongoDbTargets(vararg mongoDbTargets: Any): Unit =
          mongoDbTargets(mongoDbTargets.toList())

      /**
       * @param s3Targets Specifies Amazon Simple Storage Service (Amazon S3) targets.
       */
      override fun s3Targets(s3Targets: IResolvable) {
        cdkBuilder.s3Targets(s3Targets.let(IResolvable::unwrap))
      }

      /**
       * @param s3Targets Specifies Amazon Simple Storage Service (Amazon S3) targets.
       */
      override fun s3Targets(s3Targets: List<Any>) {
        cdkBuilder.s3Targets(s3Targets)
      }

      /**
       * @param s3Targets Specifies Amazon Simple Storage Service (Amazon S3) targets.
       */
      override fun s3Targets(vararg s3Targets: Any): Unit = s3Targets(s3Targets.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty,
    ) : CdkObject(cdkObject), TargetsProperty {
      /**
       * Specifies AWS Glue Data Catalog targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-catalogtargets)
       */
      override fun catalogTargets(): Any? = unwrap(this).getCatalogTargets()

      /**
       * Specifies an array of Delta data store targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-deltatargets)
       */
      override fun deltaTargets(): Any? = unwrap(this).getDeltaTargets()

      /**
       * Specifies Amazon DynamoDB targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-dynamodbtargets)
       */
      override fun dynamoDbTargets(): Any? = unwrap(this).getDynamoDbTargets()

      /**
       * Specifies Apache Iceberg data store targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-icebergtargets)
       */
      override fun icebergTargets(): Any? = unwrap(this).getIcebergTargets()

      /**
       * Specifies JDBC targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets)
       */
      override fun jdbcTargets(): Any? = unwrap(this).getJdbcTargets()

      /**
       * A list of Mongo DB targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-mongodbtargets)
       */
      override fun mongoDbTargets(): Any? = unwrap(this).getMongoDbTargets()

      /**
       * Specifies Amazon Simple Storage Service (Amazon S3) targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets)
       */
      override fun s3Targets(): Any? = unwrap(this).getS3Targets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty
    }
  }

  /**
   * Specifies an Amazon DynamoDB table to crawl.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * DynamoDBTargetProperty dynamoDBTargetProperty = DynamoDBTargetProperty.builder()
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-dynamodbtarget.html)
   */
  public interface DynamoDBTargetProperty {
    /**
     * The name of the DynamoDB table to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-dynamodbtarget.html#cfn-glue-crawler-dynamodbtarget-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [DynamoDBTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param path The name of the DynamoDB table to crawl.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty.builder()

      /**
       * @param path The name of the DynamoDB table to crawl.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty,
    ) : CdkObject(cdkObject), DynamoDBTargetProperty {
      /**
       * The name of the DynamoDB table to crawl.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-dynamodbtarget.html#cfn-glue-crawler-dynamodbtarget-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty):
          DynamoDBTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty
    }
  }

  /**
   * Specifies an Amazon DocumentDB or MongoDB data store to crawl.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * MongoDBTargetProperty mongoDBTargetProperty = MongoDBTargetProperty.builder()
   * .connectionName("connectionName")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html)
   */
  public interface MongoDBTargetProperty {
    /**
     * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html#cfn-glue-crawler-mongodbtarget-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html#cfn-glue-crawler-mongodbtarget-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [MongoDBTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of the connection to use to connect to the Amazon DocumentDB
       * or MongoDB target.
       */
      public fun connectionName(connectionName: String)

      /**
       * @param path The path of the Amazon DocumentDB or MongoDB target (database/collection).
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty.builder()

      /**
       * @param connectionName The name of the connection to use to connect to the Amazon DocumentDB
       * or MongoDB target.
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param path The path of the Amazon DocumentDB or MongoDB target (database/collection).
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty,
    ) : CdkObject(cdkObject), MongoDBTargetProperty {
      /**
       * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html#cfn-glue-crawler-mongodbtarget-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * The path of the Amazon DocumentDB or MongoDB target (database/collection).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html#cfn-glue-crawler-mongodbtarget-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MongoDBTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty):
          MongoDBTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MongoDBTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty
    }
  }

  /**
   * Specifies Apache Iceberg data store targets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * IcebergTargetProperty icebergTargetProperty = IcebergTargetProperty.builder()
   * .connectionName("connectionName")
   * .exclusions(List.of("exclusions"))
   * .maximumTraversalDepth(123)
   * .paths(List.of("paths"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html)
   */
  public interface IcebergTargetProperty {
    /**
     * The name of the connection to use to connect to the Iceberg target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * A list of global patterns used to exclude from the crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-exclusions)
     */
    public fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

    /**
     * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg
     * metadata folder in your Amazon S3 path.
     *
     * Used to limit the crawler run time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-maximumtraversaldepth)
     */
    public fun maximumTraversalDepth(): Number? = unwrap(this).getMaximumTraversalDepth()

    /**
     * One or more Amazon S3 paths that contains Iceberg metadata folders as s3://bucket/prefix .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-paths)
     */
    public fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()

    /**
     * A builder for [IcebergTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of the connection to use to connect to the Iceberg target.
       */
      public fun connectionName(connectionName: String)

      /**
       * @param exclusions A list of global patterns used to exclude from the crawl.
       */
      public fun exclusions(exclusions: List<String>)

      /**
       * @param exclusions A list of global patterns used to exclude from the crawl.
       */
      public fun exclusions(vararg exclusions: String)

      /**
       * @param maximumTraversalDepth The maximum depth of Amazon S3 paths that the crawler can
       * traverse to discover the Iceberg metadata folder in your Amazon S3 path.
       * Used to limit the crawler run time.
       */
      public fun maximumTraversalDepth(maximumTraversalDepth: Number)

      /**
       * @param paths One or more Amazon S3 paths that contains Iceberg metadata folders as
       * s3://bucket/prefix .
       */
      public fun paths(paths: List<String>)

      /**
       * @param paths One or more Amazon S3 paths that contains Iceberg metadata folders as
       * s3://bucket/prefix .
       */
      public fun paths(vararg paths: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty.builder()

      /**
       * @param connectionName The name of the connection to use to connect to the Iceberg target.
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param exclusions A list of global patterns used to exclude from the crawl.
       */
      override fun exclusions(exclusions: List<String>) {
        cdkBuilder.exclusions(exclusions)
      }

      /**
       * @param exclusions A list of global patterns used to exclude from the crawl.
       */
      override fun exclusions(vararg exclusions: String): Unit = exclusions(exclusions.toList())

      /**
       * @param maximumTraversalDepth The maximum depth of Amazon S3 paths that the crawler can
       * traverse to discover the Iceberg metadata folder in your Amazon S3 path.
       * Used to limit the crawler run time.
       */
      override fun maximumTraversalDepth(maximumTraversalDepth: Number) {
        cdkBuilder.maximumTraversalDepth(maximumTraversalDepth)
      }

      /**
       * @param paths One or more Amazon S3 paths that contains Iceberg metadata folders as
       * s3://bucket/prefix .
       */
      override fun paths(paths: List<String>) {
        cdkBuilder.paths(paths)
      }

      /**
       * @param paths One or more Amazon S3 paths that contains Iceberg metadata folders as
       * s3://bucket/prefix .
       */
      override fun paths(vararg paths: String): Unit = paths(paths.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty,
    ) : CdkObject(cdkObject), IcebergTargetProperty {
      /**
       * The name of the connection to use to connect to the Iceberg target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * A list of global patterns used to exclude from the crawl.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-exclusions)
       */
      override fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

      /**
       * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Iceberg
       * metadata folder in your Amazon S3 path.
       *
       * Used to limit the crawler run time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-maximumtraversaldepth)
       */
      override fun maximumTraversalDepth(): Number? = unwrap(this).getMaximumTraversalDepth()

      /**
       * One or more Amazon S3 paths that contains Iceberg metadata folders as s3://bucket/prefix .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html#cfn-glue-crawler-icebergtarget-paths)
       */
      override fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty):
          IcebergTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty
    }
  }

  /**
   * Specifies a JDBC data store to crawl.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * JdbcTargetProperty jdbcTargetProperty = JdbcTargetProperty.builder()
   * .connectionName("connectionName")
   * .exclusions(List.of("exclusions"))
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html)
   */
  public interface JdbcTargetProperty {
    /**
     * The name of the connection to use to connect to the JDBC target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * A list of glob patterns used to exclude from the crawl.
     *
     * For more information, see [Catalog Tables with a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions)
     */
    public fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

    /**
     * The path of the JDBC target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [JdbcTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of the connection to use to connect to the JDBC target.
       */
      public fun connectionName(connectionName: String)

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      public fun exclusions(exclusions: List<String>)

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      public fun exclusions(vararg exclusions: String)

      /**
       * @param path The path of the JDBC target.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty.builder()

      /**
       * @param connectionName The name of the connection to use to connect to the JDBC target.
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      override fun exclusions(exclusions: List<String>) {
        cdkBuilder.exclusions(exclusions)
      }

      /**
       * @param exclusions A list of glob patterns used to exclude from the crawl.
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       */
      override fun exclusions(vararg exclusions: String): Unit = exclusions(exclusions.toList())

      /**
       * @param path The path of the JDBC target.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty,
    ) : CdkObject(cdkObject), JdbcTargetProperty {
      /**
       * The name of the connection to use to connect to the JDBC target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * A list of glob patterns used to exclude from the crawl.
       *
       * For more information, see [Catalog Tables with a
       * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions)
       */
      override fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

      /**
       * The path of the JDBC target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JdbcTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty):
          JdbcTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JdbcTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty
    }
  }
}
