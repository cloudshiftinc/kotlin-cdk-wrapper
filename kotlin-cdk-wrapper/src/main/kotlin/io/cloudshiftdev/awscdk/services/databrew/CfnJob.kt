@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a new DataBrew job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
 * CfnJob cfnJob = CfnJob.Builder.create(this, "MyCfnJob")
 * .name("name")
 * .roleArn("roleArn")
 * .type("type")
 * // the properties below are optional
 * .databaseOutputs(List.of(DatabaseOutputProperty.builder()
 * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
 * .tableName("tableName")
 * // the properties below are optional
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .glueConnectionName("glueConnectionName")
 * // the properties below are optional
 * .databaseOutputMode("databaseOutputMode")
 * .build()))
 * .dataCatalogOutputs(List.of(DataCatalogOutputProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
 * .tableName("tableName")
 * // the properties below are optional
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .overwrite(false)
 * .s3Options(S3TableOutputOptionsProperty.builder()
 * .location(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .build()))
 * .datasetName("datasetName")
 * .encryptionKeyArn("encryptionKeyArn")
 * .encryptionMode("encryptionMode")
 * .jobSample(JobSampleProperty.builder()
 * .mode("mode")
 * .size(123)
 * .build())
 * .logSubscription("logSubscription")
 * .maxCapacity(123)
 * .maxRetries(123)
 * .outputLocation(OutputLocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .outputs(List.of(OutputProperty.builder()
 * .location(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * // the properties below are optional
 * .compressionFormat("compressionFormat")
 * .format("format")
 * .formatOptions(OutputFormatOptionsProperty.builder()
 * .csv(CsvOutputOptionsProperty.builder()
 * .delimiter("delimiter")
 * .build())
 * .build())
 * .maxOutputFiles(123)
 * .overwrite(false)
 * .partitionColumns(List.of("partitionColumns"))
 * .build()))
 * .profileConfiguration(ProfileConfigurationProperty.builder()
 * .columnStatisticsConfigurations(List.of(ColumnStatisticsConfigurationProperty.builder()
 * .statistics(StatisticsConfigurationProperty.builder()
 * .includedStatistics(List.of("includedStatistics"))
 * .overrides(List.of(StatisticOverrideProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .statistic("statistic")
 * .build()))
 * .build())
 * // the properties below are optional
 * .selectors(List.of(ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .build()))
 * .datasetStatisticsConfiguration(StatisticsConfigurationProperty.builder()
 * .includedStatistics(List.of("includedStatistics"))
 * .overrides(List.of(StatisticOverrideProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .statistic("statistic")
 * .build()))
 * .build())
 * .entityDetectorConfiguration(EntityDetectorConfigurationProperty.builder()
 * .entityTypes(List.of("entityTypes"))
 * // the properties below are optional
 * .allowedStatistics(AllowedStatisticsProperty.builder()
 * .statistics(List.of("statistics"))
 * .build())
 * .build())
 * .profileColumns(List.of(ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .build())
 * .projectName("projectName")
 * .recipe(RecipeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeout(123)
 * .validationConfigurations(List.of(ValidationConfigurationProperty.builder()
 * .rulesetArn("rulesetArn")
 * // the properties below are optional
 * .validationMode("validationMode")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html)
 */
public open class CfnJob internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.databrew.CfnJob,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
   */
  public open fun dataCatalogOutputs(): Any? = unwrap(this).getDataCatalogOutputs()

  /**
   * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
   */
  public open fun dataCatalogOutputs(`value`: IResolvable) {
    unwrap(this).setDataCatalogOutputs(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
   */
  public open fun dataCatalogOutputs(`value`: List<Any>) {
    unwrap(this).setDataCatalogOutputs(`value`)
  }

  /**
   * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
   */
  public open fun dataCatalogOutputs(vararg `value`: Any): Unit =
      dataCatalogOutputs(`value`.toList())

  /**
   * Represents a list of JDBC database output objects which defines the output destination for a
   * DataBrew recipe job to write into.
   */
  public open fun databaseOutputs(): Any? = unwrap(this).getDatabaseOutputs()

  /**
   * Represents a list of JDBC database output objects which defines the output destination for a
   * DataBrew recipe job to write into.
   */
  public open fun databaseOutputs(`value`: IResolvable) {
    unwrap(this).setDatabaseOutputs(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents a list of JDBC database output objects which defines the output destination for a
   * DataBrew recipe job to write into.
   */
  public open fun databaseOutputs(`value`: List<Any>) {
    unwrap(this).setDatabaseOutputs(`value`)
  }

  /**
   * Represents a list of JDBC database output objects which defines the output destination for a
   * DataBrew recipe job to write into.
   */
  public open fun databaseOutputs(vararg `value`: Any): Unit = databaseOutputs(`value`.toList())

  /**
   * A dataset that the job is to process.
   */
  public open fun datasetName(): String? = unwrap(this).getDatasetName()

  /**
   * A dataset that the job is to process.
   */
  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output.
   */
  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output.
   */
  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  /**
   * The encryption mode for the job, which can be one of the following:.
   */
  public open fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

  /**
   * The encryption mode for the job, which can be one of the following:.
   */
  public open fun encryptionMode(`value`: String) {
    unwrap(this).setEncryptionMode(`value`)
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
   * A sample configuration for profile jobs only, which determines the number of rows on which the
   * profile job is run.
   */
  public open fun jobSample(): Any? = unwrap(this).getJobSample()

  /**
   * A sample configuration for profile jobs only, which determines the number of rows on which the
   * profile job is run.
   */
  public open fun jobSample(`value`: IResolvable) {
    unwrap(this).setJobSample(`value`.let(IResolvable::unwrap))
  }

  /**
   * A sample configuration for profile jobs only, which determines the number of rows on which the
   * profile job is run.
   */
  public open fun jobSample(`value`: JobSampleProperty) {
    unwrap(this).setJobSample(`value`.let(JobSampleProperty::unwrap))
  }

  /**
   * A sample configuration for profile jobs only, which determines the number of rows on which the
   * profile job is run.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("709c321b978ca824edfd05368ce1be494c5ad3e138abd44a4b2121492a1565c6")
  public open fun jobSample(`value`: JobSampleProperty.Builder.() -> Unit): Unit =
      jobSample(JobSampleProperty(`value`))

  /**
   * The current status of Amazon CloudWatch logging for the job.
   */
  public open fun logSubscription(): String? = unwrap(this).getLogSubscription()

  /**
   * The current status of Amazon CloudWatch logging for the job.
   */
  public open fun logSubscription(`value`: String) {
    unwrap(this).setLogSubscription(`value`)
  }

  /**
   * The maximum number of nodes that can be consumed when the job processes data.
   */
  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The maximum number of nodes that can be consumed when the job processes data.
   */
  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  /**
   * The maximum number of times to retry the job after a job run fails.
   */
  public open fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * The maximum number of times to retry the job after a job run fails.
   */
  public open fun maxRetries(`value`: Number) {
    unwrap(this).setMaxRetries(`value`)
  }

  /**
   * The unique name of the job.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique name of the job.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The location in Amazon S3 where the job writes its output.
   */
  public open fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  /**
   * The location in Amazon S3 where the job writes its output.
   */
  public open fun outputLocation(`value`: IResolvable) {
    unwrap(this).setOutputLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The location in Amazon S3 where the job writes its output.
   */
  public open fun outputLocation(`value`: OutputLocationProperty) {
    unwrap(this).setOutputLocation(`value`.let(OutputLocationProperty::unwrap))
  }

  /**
   * The location in Amazon S3 where the job writes its output.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79bb4cffea50a81b2f4e000059042b6539267f49931de1e204da7b4931e680cc")
  public open fun outputLocation(`value`: OutputLocationProperty.Builder.() -> Unit): Unit =
      outputLocation(OutputLocationProperty(`value`))

  /**
   * One or more artifacts that represent output from running the job.
   */
  public open fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * One or more artifacts that represent output from running the job.
   */
  public open fun outputs(`value`: IResolvable) {
    unwrap(this).setOutputs(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more artifacts that represent output from running the job.
   */
  public open fun outputs(`value`: List<Any>) {
    unwrap(this).setOutputs(`value`)
  }

  /**
   * One or more artifacts that represent output from running the job.
   */
  public open fun outputs(vararg `value`: Any): Unit = outputs(`value`.toList())

  /**
   * Configuration for profile jobs.
   */
  public open fun profileConfiguration(): Any? = unwrap(this).getProfileConfiguration()

  /**
   * Configuration for profile jobs.
   */
  public open fun profileConfiguration(`value`: IResolvable) {
    unwrap(this).setProfileConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration for profile jobs.
   */
  public open fun profileConfiguration(`value`: ProfileConfigurationProperty) {
    unwrap(this).setProfileConfiguration(`value`.let(ProfileConfigurationProperty::unwrap))
  }

  /**
   * Configuration for profile jobs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("175d76250248180f790b5989458e28f973c3c3331211b21caf847e8137f5731f")
  public open fun profileConfiguration(`value`: ProfileConfigurationProperty.Builder.() -> Unit):
      Unit = profileConfiguration(ProfileConfigurationProperty(`value`))

  /**
   * The name of the project that the job is associated with.
   */
  public open fun projectName(): String? = unwrap(this).getProjectName()

  /**
   * The name of the project that the job is associated with.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * A series of data transformation steps that the job runs.
   */
  public open fun recipe(): Any? = unwrap(this).getRecipe()

  /**
   * A series of data transformation steps that the job runs.
   */
  public open fun recipe(`value`: IResolvable) {
    unwrap(this).setRecipe(`value`.let(IResolvable::unwrap))
  }

  /**
   * A series of data transformation steps that the job runs.
   */
  public open fun recipe(`value`: RecipeProperty) {
    unwrap(this).setRecipe(`value`.let(RecipeProperty::unwrap))
  }

  /**
   * A series of data transformation steps that the job runs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd95691edf1bf0043236ea1aec0e71c5f8b3174be378e43a37db3e4aefa20f37")
  public open fun recipe(`value`: RecipeProperty.Builder.() -> Unit): Unit =
      recipe(RecipeProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the role to be assumed for this job.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the role to be assumed for this job.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata tags that have been applied to the job.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata tags that have been applied to the job.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata tags that have been applied to the job.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The job's timeout in minutes.
   */
  public open fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The job's timeout in minutes.
   */
  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  /**
   * The job type of the job, which must be one of the following:.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The job type of the job, which must be one of the following:.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * List of validation configurations that are applied to the profile job.
   */
  public open fun validationConfigurations(): Any? = unwrap(this).getValidationConfigurations()

  /**
   * List of validation configurations that are applied to the profile job.
   */
  public open fun validationConfigurations(`value`: IResolvable) {
    unwrap(this).setValidationConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * List of validation configurations that are applied to the profile job.
   */
  public open fun validationConfigurations(`value`: List<Any>) {
    unwrap(this).setValidationConfigurations(`value`)
  }

  /**
   * List of validation configurations that are applied to the profile job.
   */
  public open fun validationConfigurations(vararg `value`: Any): Unit =
      validationConfigurations(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.databrew.CfnJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job. 
     */
    public fun dataCatalogOutputs(dataCatalogOutputs: IResolvable)

    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job. 
     */
    public fun dataCatalogOutputs(dataCatalogOutputs: List<Any>)

    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job. 
     */
    public fun dataCatalogOutputs(vararg dataCatalogOutputs: Any)

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into. 
     */
    public fun databaseOutputs(databaseOutputs: IResolvable)

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into. 
     */
    public fun databaseOutputs(databaseOutputs: List<Any>)

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into. 
     */
    public fun databaseOutputs(vararg databaseOutputs: Any)

    /**
     * A dataset that the job is to process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datasetname)
     * @param datasetName A dataset that the job is to process. 
     */
    public fun datasetName(datasetName: String)

    /**
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output.
     *
     * For more information, see [Encrypting data written by DataBrew
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionkeyarn)
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of an encryption key that is used to
     * protect the job output. 
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * The encryption mode for the job, which can be one of the following:.
     *
     * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
     * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionmode)
     * @param encryptionMode The encryption mode for the job, which can be one of the following:. 
     */
    public fun encryptionMode(encryptionMode: String)

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run. 
     */
    public fun jobSample(jobSample: IResolvable)

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run. 
     */
    public fun jobSample(jobSample: JobSampleProperty)

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b549f28bb0c6235cf13067784fe0d1308de17069cff35e16d9b73d0d78498494")
    public fun jobSample(jobSample: JobSampleProperty.Builder.() -> Unit)

    /**
     * The current status of Amazon CloudWatch logging for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-logsubscription)
     * @param logSubscription The current status of Amazon CloudWatch logging for the job. 
     */
    public fun logSubscription(logSubscription: String)

    /**
     * The maximum number of nodes that can be consumed when the job processes data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxcapacity)
     * @param maxCapacity The maximum number of nodes that can be consumed when the job processes
     * data. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The maximum number of times to retry the job after a job run fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxretries)
     * @param maxRetries The maximum number of times to retry the job after a job run fails. 
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * The unique name of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-name)
     * @param name The unique name of the job. 
     */
    public fun name(name: String)

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     * @param outputLocation The location in Amazon S3 where the job writes its output. 
     */
    public fun outputLocation(outputLocation: IResolvable)

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     * @param outputLocation The location in Amazon S3 where the job writes its output. 
     */
    public fun outputLocation(outputLocation: OutputLocationProperty)

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     * @param outputLocation The location in Amazon S3 where the job writes its output. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075009e7896fa2dac2cb2a0801bb0767f212db5c58846c9c3602666778667af")
    public fun outputLocation(outputLocation: OutputLocationProperty.Builder.() -> Unit)

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     * @param outputs One or more artifacts that represent output from running the job. 
     */
    public fun outputs(outputs: IResolvable)

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     * @param outputs One or more artifacts that represent output from running the job. 
     */
    public fun outputs(outputs: List<Any>)

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     * @param outputs One or more artifacts that represent output from running the job. 
     */
    public fun outputs(vararg outputs: Any)

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     * @param profileConfiguration Configuration for profile jobs. 
     */
    public fun profileConfiguration(profileConfiguration: IResolvable)

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     * @param profileConfiguration Configuration for profile jobs. 
     */
    public fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty)

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     * @param profileConfiguration Configuration for profile jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b51a4b5e47d6827520d89764cd2c50826dc27eb6c70d83a7c6ecd3719514a065")
    public
        fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the project that the job is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-projectname)
     * @param projectName The name of the project that the job is associated with. 
     */
    public fun projectName(projectName: String)

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     * @param recipe A series of data transformation steps that the job runs. 
     */
    public fun recipe(recipe: IResolvable)

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     * @param recipe A series of data transformation steps that the job runs. 
     */
    public fun recipe(recipe: RecipeProperty)

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     * @param recipe A series of data transformation steps that the job runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0be0d2ffef1642982d7e29c724383ad3e41980a32dd097444e1c1b7186e338fb")
    public fun recipe(recipe: RecipeProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the role to be assumed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role to be assumed for this job. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Metadata tags that have been applied to the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-tags)
     * @param tags Metadata tags that have been applied to the job. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata tags that have been applied to the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-tags)
     * @param tags Metadata tags that have been applied to the job. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The job's timeout in minutes.
     *
     * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-timeout)
     * @param timeout The job's timeout in minutes. 
     */
    public fun timeout(timeout: Number)

    /**
     * The job type of the job, which must be one of the following:.
     *
     * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data
     * distribution, and more.
     * * `RECIPE` - A job to apply one or more transformations to a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-type)
     * @param type The job type of the job, which must be one of the following:. 
     */
    public fun type(type: String)

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job. 
     */
    public fun validationConfigurations(validationConfigurations: IResolvable)

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job. 
     */
    public fun validationConfigurations(validationConfigurations: List<Any>)

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job. 
     */
    public fun validationConfigurations(vararg validationConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJob.Builder =
        software.amazon.awscdk.services.databrew.CfnJob.Builder.create(scope, id)

    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job. 
     */
    override fun dataCatalogOutputs(dataCatalogOutputs: IResolvable) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs.let(IResolvable::unwrap))
    }

    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job. 
     */
    override fun dataCatalogOutputs(dataCatalogOutputs: List<Any>) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs)
    }

    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job. 
     */
    override fun dataCatalogOutputs(vararg dataCatalogOutputs: Any): Unit =
        dataCatalogOutputs(dataCatalogOutputs.toList())

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into. 
     */
    override fun databaseOutputs(databaseOutputs: IResolvable) {
      cdkBuilder.databaseOutputs(databaseOutputs.let(IResolvable::unwrap))
    }

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into. 
     */
    override fun databaseOutputs(databaseOutputs: List<Any>) {
      cdkBuilder.databaseOutputs(databaseOutputs)
    }

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into. 
     */
    override fun databaseOutputs(vararg databaseOutputs: Any): Unit =
        databaseOutputs(databaseOutputs.toList())

    /**
     * A dataset that the job is to process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datasetname)
     * @param datasetName A dataset that the job is to process. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output.
     *
     * For more information, see [Encrypting data written by DataBrew
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionkeyarn)
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of an encryption key that is used to
     * protect the job output. 
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * The encryption mode for the job, which can be one of the following:.
     *
     * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
     * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionmode)
     * @param encryptionMode The encryption mode for the job, which can be one of the following:. 
     */
    override fun encryptionMode(encryptionMode: String) {
      cdkBuilder.encryptionMode(encryptionMode)
    }

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run. 
     */
    override fun jobSample(jobSample: IResolvable) {
      cdkBuilder.jobSample(jobSample.let(IResolvable::unwrap))
    }

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run. 
     */
    override fun jobSample(jobSample: JobSampleProperty) {
      cdkBuilder.jobSample(jobSample.let(JobSampleProperty::unwrap))
    }

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b549f28bb0c6235cf13067784fe0d1308de17069cff35e16d9b73d0d78498494")
    override fun jobSample(jobSample: JobSampleProperty.Builder.() -> Unit): Unit =
        jobSample(JobSampleProperty(jobSample))

    /**
     * The current status of Amazon CloudWatch logging for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-logsubscription)
     * @param logSubscription The current status of Amazon CloudWatch logging for the job. 
     */
    override fun logSubscription(logSubscription: String) {
      cdkBuilder.logSubscription(logSubscription)
    }

    /**
     * The maximum number of nodes that can be consumed when the job processes data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxcapacity)
     * @param maxCapacity The maximum number of nodes that can be consumed when the job processes
     * data. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The maximum number of times to retry the job after a job run fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxretries)
     * @param maxRetries The maximum number of times to retry the job after a job run fails. 
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * The unique name of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-name)
     * @param name The unique name of the job. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     * @param outputLocation The location in Amazon S3 where the job writes its output. 
     */
    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     * @param outputLocation The location in Amazon S3 where the job writes its output. 
     */
    override fun outputLocation(outputLocation: OutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(OutputLocationProperty::unwrap))
    }

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     * @param outputLocation The location in Amazon S3 where the job writes its output. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075009e7896fa2dac2cb2a0801bb0767f212db5c58846c9c3602666778667af")
    override fun outputLocation(outputLocation: OutputLocationProperty.Builder.() -> Unit): Unit =
        outputLocation(OutputLocationProperty(outputLocation))

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     * @param outputs One or more artifacts that represent output from running the job. 
     */
    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     * @param outputs One or more artifacts that represent output from running the job. 
     */
    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     * @param outputs One or more artifacts that represent output from running the job. 
     */
    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     * @param profileConfiguration Configuration for profile jobs. 
     */
    override fun profileConfiguration(profileConfiguration: IResolvable) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     * @param profileConfiguration Configuration for profile jobs. 
     */
    override fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(ProfileConfigurationProperty::unwrap))
    }

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     * @param profileConfiguration Configuration for profile jobs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b51a4b5e47d6827520d89764cd2c50826dc27eb6c70d83a7c6ecd3719514a065")
    override
        fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty.Builder.() -> Unit):
        Unit = profileConfiguration(ProfileConfigurationProperty(profileConfiguration))

    /**
     * The name of the project that the job is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-projectname)
     * @param projectName The name of the project that the job is associated with. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     * @param recipe A series of data transformation steps that the job runs. 
     */
    override fun recipe(recipe: IResolvable) {
      cdkBuilder.recipe(recipe.let(IResolvable::unwrap))
    }

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     * @param recipe A series of data transformation steps that the job runs. 
     */
    override fun recipe(recipe: RecipeProperty) {
      cdkBuilder.recipe(recipe.let(RecipeProperty::unwrap))
    }

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     * @param recipe A series of data transformation steps that the job runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0be0d2ffef1642982d7e29c724383ad3e41980a32dd097444e1c1b7186e338fb")
    override fun recipe(recipe: RecipeProperty.Builder.() -> Unit): Unit =
        recipe(RecipeProperty(recipe))

    /**
     * The Amazon Resource Name (ARN) of the role to be assumed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role to be assumed for this job. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Metadata tags that have been applied to the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-tags)
     * @param tags Metadata tags that have been applied to the job. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata tags that have been applied to the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-tags)
     * @param tags Metadata tags that have been applied to the job. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The job's timeout in minutes.
     *
     * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-timeout)
     * @param timeout The job's timeout in minutes. 
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * The job type of the job, which must be one of the following:.
     *
     * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data
     * distribution, and more.
     * * `RECIPE` - A job to apply one or more transformations to a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-type)
     * @param type The job type of the job, which must be one of the following:. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job. 
     */
    override fun validationConfigurations(validationConfigurations: IResolvable) {
      cdkBuilder.validationConfigurations(validationConfigurations.let(IResolvable::unwrap))
    }

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job. 
     */
    override fun validationConfigurations(validationConfigurations: List<Any>) {
      cdkBuilder.validationConfigurations(validationConfigurations)
    }

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job. 
     */
    override fun validationConfigurations(vararg validationConfigurations: Any): Unit =
        validationConfigurations(validationConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnJob = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.databrew.CfnJob.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob): CfnJob =
        CfnJob(cdkObject)

    internal fun unwrap(wrapped: CfnJob): software.amazon.awscdk.services.databrew.CfnJob =
        wrapped.cdkObject
  }

  /**
   * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew can
   * read input data, or write output from a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html#cfn-databrew-job-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The AWS account ID of the bucket owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html#cfn-databrew-job-s3location-bucketowner)
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * The unique name of the object in the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html#cfn-databrew-job-s3location-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      public fun bucket(bucket: String)

      /**
       * @param bucketOwner The AWS account ID of the bucket owner.
       */
      public fun bucketOwner(bucketOwner: String)

      /**
       * @param key The unique name of the object in the bucket.
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param bucketOwner The AWS account ID of the bucket owner.
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      /**
       * @param key The unique name of the object in the bucket.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html#cfn-databrew-job-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The AWS account ID of the bucket owner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html#cfn-databrew-job-s3location-bucketowner)
       */
      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      /**
       * The unique name of the object in the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html#cfn-databrew-job-s3location-key)
       */
      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as S3LocationProperty

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty
    }
  }

  /**
   * The location in Amazon S3 or AWS Glue Data Catalog where the job writes its output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * OutputLocationProperty outputLocationProperty = OutputLocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html)
   */
  public interface OutputLocationProperty {
    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html#cfn-databrew-job-outputlocation-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html#cfn-databrew-job-outputlocation-bucketowner)
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * The unique name of the object in the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html#cfn-databrew-job-outputlocation-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A builder for [OutputLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      public fun bucket(bucket: String)

      /**
       * @param bucketOwner the value to be set.
       */
      public fun bucketOwner(bucketOwner: String)

      /**
       * @param key The unique name of the object in the bucket.
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param bucketOwner the value to be set.
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      /**
       * @param key The unique name of the object in the bucket.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty,
    ) : CdkObject(cdkObject), OutputLocationProperty {
      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html#cfn-databrew-job-outputlocation-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html#cfn-databrew-job-outputlocation-bucketowner)
       */
      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      /**
       * The unique name of the object in the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html#cfn-databrew-job-outputlocation-key)
       */
      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty):
          OutputLocationProperty = CdkObjectWrappers.wrap(cdkObject) as OutputLocationProperty

      internal fun unwrap(wrapped: OutputLocationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty
    }
  }

  /**
   * Represents options that specify how and where in the AWS Glue Data Catalog DataBrew writes the
   * output generated by recipe jobs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DataCatalogOutputProperty dataCatalogOutputProperty = DataCatalogOutputProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * // the properties below are optional
   * .catalogId("catalogId")
   * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
   * .tableName("tableName")
   * // the properties below are optional
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build())
   * .overwrite(false)
   * .s3Options(S3TableOutputOptionsProperty.builder()
   * .location(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html)
   */
  public interface DataCatalogOutputProperty {
    /**
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of a database in the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-databasename)
     */
    public fun databaseName(): String

    /**
     * Represents options that specify how and where DataBrew writes the database output generated
     * by recipe jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-databaseoptions)
     */
    public fun databaseOptions(): Any? = unwrap(this).getDatabaseOptions()

    /**
     * A value that, if true, means that any data in the location specified for output is
     * overwritten with new output.
     *
     * Not supported with DatabaseOptions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-overwrite)
     */
    public fun overwrite(): Any? = unwrap(this).getOverwrite()

    /**
     * Represents options that specify how and where DataBrew writes the Amazon S3 output generated
     * by recipe jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-s3options)
     */
    public fun s3Options(): Any? = unwrap(this).getS3Options()

    /**
     * The name of a table in the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DataCatalogOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
       * stores the data.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The name of a database in the Data Catalog. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs.
       */
      public fun databaseOptions(databaseOptions: IResolvable)

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs.
       */
      public fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty)

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce4395f18fa301583c04a5e808f9abda747b3e0e7509e74a92caa05f01ac9e62")
      public
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit)

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       * Not supported with DatabaseOptions.
       */
      public fun overwrite(overwrite: Boolean)

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       * Not supported with DatabaseOptions.
       */
      public fun overwrite(overwrite: IResolvable)

      /**
       * @param s3Options Represents options that specify how and where DataBrew writes the Amazon
       * S3 output generated by recipe jobs.
       */
      public fun s3Options(s3Options: IResolvable)

      /**
       * @param s3Options Represents options that specify how and where DataBrew writes the Amazon
       * S3 output generated by recipe jobs.
       */
      public fun s3Options(s3Options: S3TableOutputOptionsProperty)

      /**
       * @param s3Options Represents options that specify how and where DataBrew writes the Amazon
       * S3 output generated by recipe jobs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d15bd4718f2f177d93f4a891e11f0dfe436114e63f06eaa7fbc97bab31dbc36")
      public fun s3Options(s3Options: S3TableOutputOptionsProperty.Builder.() -> Unit)

      /**
       * @param tableName The name of a table in the Data Catalog. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty.builder()

      /**
       * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
       * stores the data.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The name of a database in the Data Catalog. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs.
       */
      override fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions.let(IResolvable::unwrap))
      }

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs.
       */
      override fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions.let(DatabaseTableOutputOptionsProperty::unwrap))
      }

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce4395f18fa301583c04a5e808f9abda747b3e0e7509e74a92caa05f01ac9e62")
      override
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit):
          Unit = databaseOptions(DatabaseTableOutputOptionsProperty(databaseOptions))

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       * Not supported with DatabaseOptions.
       */
      override fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
      }

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       * Not supported with DatabaseOptions.
       */
      override fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite.let(IResolvable::unwrap))
      }

      /**
       * @param s3Options Represents options that specify how and where DataBrew writes the Amazon
       * S3 output generated by recipe jobs.
       */
      override fun s3Options(s3Options: IResolvable) {
        cdkBuilder.s3Options(s3Options.let(IResolvable::unwrap))
      }

      /**
       * @param s3Options Represents options that specify how and where DataBrew writes the Amazon
       * S3 output generated by recipe jobs.
       */
      override fun s3Options(s3Options: S3TableOutputOptionsProperty) {
        cdkBuilder.s3Options(s3Options.let(S3TableOutputOptionsProperty::unwrap))
      }

      /**
       * @param s3Options Represents options that specify how and where DataBrew writes the Amazon
       * S3 output generated by recipe jobs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d15bd4718f2f177d93f4a891e11f0dfe436114e63f06eaa7fbc97bab31dbc36")
      override fun s3Options(s3Options: S3TableOutputOptionsProperty.Builder.() -> Unit): Unit =
          s3Options(S3TableOutputOptionsProperty(s3Options))

      /**
       * @param tableName The name of a table in the Data Catalog. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty,
    ) : CdkObject(cdkObject), DataCatalogOutputProperty {
      /**
       * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of a database in the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * Represents options that specify how and where DataBrew writes the database output generated
       * by recipe jobs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-databaseoptions)
       */
      override fun databaseOptions(): Any? = unwrap(this).getDatabaseOptions()

      /**
       * A value that, if true, means that any data in the location specified for output is
       * overwritten with new output.
       *
       * Not supported with DatabaseOptions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-overwrite)
       */
      override fun overwrite(): Any? = unwrap(this).getOverwrite()

      /**
       * Represents options that specify how and where DataBrew writes the Amazon S3 output
       * generated by recipe jobs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-s3options)
       */
      override fun s3Options(): Any? = unwrap(this).getS3Options()

      /**
       * The name of a table in the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html#cfn-databrew-job-datacatalogoutput-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataCatalogOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty):
          DataCatalogOutputProperty = CdkObjectWrappers.wrap(cdkObject) as DataCatalogOutputProperty

      internal fun unwrap(wrapped: DataCatalogOutputProperty):
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty
    }
  }

  /**
   * Configuration of statistics that are allowed to be run on columns that contain detected
   * entities.
   *
   * When undefined, no statistics will be computed on columns that contain detected entities.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * AllowedStatisticsProperty allowedStatisticsProperty = AllowedStatisticsProperty.builder()
   * .statistics(List.of("statistics"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-allowedstatistics.html)
   */
  public interface AllowedStatisticsProperty {
    /**
     * One or more column statistics to allow for columns that contain detected entities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-allowedstatistics.html#cfn-databrew-job-allowedstatistics-statistics)
     */
    public fun statistics(): List<String>

    /**
     * A builder for [AllowedStatisticsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statistics One or more column statistics to allow for columns that contain detected
       * entities. 
       */
      public fun statistics(statistics: List<String>)

      /**
       * @param statistics One or more column statistics to allow for columns that contain detected
       * entities. 
       */
      public fun statistics(vararg statistics: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty.builder()

      /**
       * @param statistics One or more column statistics to allow for columns that contain detected
       * entities. 
       */
      override fun statistics(statistics: List<String>) {
        cdkBuilder.statistics(statistics)
      }

      /**
       * @param statistics One or more column statistics to allow for columns that contain detected
       * entities. 
       */
      override fun statistics(vararg statistics: String): Unit = statistics(statistics.toList())

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty,
    ) : CdkObject(cdkObject), AllowedStatisticsProperty {
      /**
       * One or more column statistics to allow for columns that contain detected entities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-allowedstatistics.html#cfn-databrew-job-allowedstatistics-statistics)
       */
      override fun statistics(): List<String> = unwrap(this).getStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AllowedStatisticsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty):
          AllowedStatisticsProperty = CdkObjectWrappers.wrap(cdkObject) as AllowedStatisticsProperty

      internal fun unwrap(wrapped: AllowedStatisticsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty
    }
  }

  /**
   * Override of a particular evaluation for a profile job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * StatisticOverrideProperty statisticOverrideProperty = StatisticOverrideProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .statistic("statistic")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html)
   */
  public interface StatisticOverrideProperty {
    /**
     * A map that includes overrides of an evaluation’s parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html#cfn-databrew-job-statisticoverride-parameters)
     */
    public fun parameters(): Any

    /**
     * The name of an evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html#cfn-databrew-job-statisticoverride-statistic)
     */
    public fun statistic(): String

    /**
     * A builder for [StatisticOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters A map that includes overrides of an evaluation’s parameters. 
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters A map that includes overrides of an evaluation’s parameters. 
       */
      public fun parameters(parameters: Map<String, String>)

      /**
       * @param statistic The name of an evaluation. 
       */
      public fun statistic(statistic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty.builder()

      /**
       * @param parameters A map that includes overrides of an evaluation’s parameters. 
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters A map that includes overrides of an evaluation’s parameters. 
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param statistic The name of an evaluation. 
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty,
    ) : CdkObject(cdkObject), StatisticOverrideProperty {
      /**
       * A map that includes overrides of an evaluation’s parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html#cfn-databrew-job-statisticoverride-parameters)
       */
      override fun parameters(): Any = unwrap(this).getParameters()

      /**
       * The name of an evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html#cfn-databrew-job-statisticoverride-statistic)
       */
      override fun statistic(): String = unwrap(this).getStatistic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty):
          StatisticOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as StatisticOverrideProperty

      internal fun unwrap(wrapped: StatisticOverrideProperty):
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty
    }
  }

  /**
   * Represents a set of options that define how DataBrew will write a comma-separated value (CSV)
   * file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * CsvOutputOptionsProperty csvOutputOptionsProperty = CsvOutputOptionsProperty.builder()
   * .delimiter("delimiter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-csvoutputoptions.html)
   */
  public interface CsvOutputOptionsProperty {
    /**
     * A single character that specifies the delimiter used to create CSV job output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-csvoutputoptions.html#cfn-databrew-job-csvoutputoptions-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * A builder for [CsvOutputOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delimiter A single character that specifies the delimiter used to create CSV job
       * output.
       */
      public fun delimiter(delimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty.builder()

      /**
       * @param delimiter A single character that specifies the delimiter used to create CSV job
       * output.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty,
    ) : CdkObject(cdkObject), CsvOutputOptionsProperty {
      /**
       * A single character that specifies the delimiter used to create CSV job output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-csvoutputoptions.html#cfn-databrew-job-csvoutputoptions-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvOutputOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty):
          CsvOutputOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as CsvOutputOptionsProperty

      internal fun unwrap(wrapped: CsvOutputOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty
    }
  }

  /**
   * Represents options that specify how and where in Amazon S3 DataBrew writes the output generated
   * by recipe jobs or profile jobs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * OutputProperty outputProperty = OutputProperty.builder()
   * .location(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * // the properties below are optional
   * .compressionFormat("compressionFormat")
   * .format("format")
   * .formatOptions(OutputFormatOptionsProperty.builder()
   * .csv(CsvOutputOptionsProperty.builder()
   * .delimiter("delimiter")
   * .build())
   * .build())
   * .maxOutputFiles(123)
   * .overwrite(false)
   * .partitionColumns(List.of("partitionColumns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html)
   */
  public interface OutputProperty {
    /**
     * The compression algorithm used to compress the output text of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-compressionformat)
     */
    public fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

    /**
     * The data format of the output of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * Represents options that define how DataBrew formats job output files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-formatoptions)
     */
    public fun formatOptions(): Any? = unwrap(this).getFormatOptions()

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-location)
     */
    public fun location(): Any

    /**
     * The maximum number of files to be generated by the job and written to the output folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-maxoutputfiles)
     */
    public fun maxOutputFiles(): Number? = unwrap(this).getMaxOutputFiles()

    /**
     * A value that, if true, means that any data in the location specified for output is
     * overwritten with new output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-overwrite)
     */
    public fun overwrite(): Any? = unwrap(this).getOverwrite()

    /**
     * The names of one or more partition columns for the output of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-partitioncolumns)
     */
    public fun partitionColumns(): List<String> = unwrap(this).getPartitionColumns() ?: emptyList()

    /**
     * A builder for [OutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compressionFormat The compression algorithm used to compress the output text of the
       * job.
       */
      public fun compressionFormat(compressionFormat: String)

      /**
       * @param format The data format of the output of the job.
       */
      public fun format(format: String)

      /**
       * @param formatOptions Represents options that define how DataBrew formats job output files.
       */
      public fun formatOptions(formatOptions: IResolvable)

      /**
       * @param formatOptions Represents options that define how DataBrew formats job output files.
       */
      public fun formatOptions(formatOptions: OutputFormatOptionsProperty)

      /**
       * @param formatOptions Represents options that define how DataBrew formats job output files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7839962fc021fba29606c84c0c1f2af7c3053d3d71d87a0eccef3a1d43d5a9d8")
      public fun formatOptions(formatOptions: OutputFormatOptionsProperty.Builder.() -> Unit)

      /**
       * @param location The location in Amazon S3 where the job writes its output. 
       */
      public fun location(location: IResolvable)

      /**
       * @param location The location in Amazon S3 where the job writes its output. 
       */
      public fun location(location: S3LocationProperty)

      /**
       * @param location The location in Amazon S3 where the job writes its output. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb3769ff3eb925e87f899d0da733430132d44280d763d281c79e8a9563fb072d")
      public fun location(location: S3LocationProperty.Builder.() -> Unit)

      /**
       * @param maxOutputFiles The maximum number of files to be generated by the job and written to
       * the output folder.
       */
      public fun maxOutputFiles(maxOutputFiles: Number)

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       */
      public fun overwrite(overwrite: Boolean)

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       */
      public fun overwrite(overwrite: IResolvable)

      /**
       * @param partitionColumns The names of one or more partition columns for the output of the
       * job.
       */
      public fun partitionColumns(partitionColumns: List<String>)

      /**
       * @param partitionColumns The names of one or more partition columns for the output of the
       * job.
       */
      public fun partitionColumns(vararg partitionColumns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJob.OutputProperty.Builder
          = software.amazon.awscdk.services.databrew.CfnJob.OutputProperty.builder()

      /**
       * @param compressionFormat The compression algorithm used to compress the output text of the
       * job.
       */
      override fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
      }

      /**
       * @param format The data format of the output of the job.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param formatOptions Represents options that define how DataBrew formats job output files.
       */
      override fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions.let(IResolvable::unwrap))
      }

      /**
       * @param formatOptions Represents options that define how DataBrew formats job output files.
       */
      override fun formatOptions(formatOptions: OutputFormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions.let(OutputFormatOptionsProperty::unwrap))
      }

      /**
       * @param formatOptions Represents options that define how DataBrew formats job output files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7839962fc021fba29606c84c0c1f2af7c3053d3d71d87a0eccef3a1d43d5a9d8")
      override fun formatOptions(formatOptions: OutputFormatOptionsProperty.Builder.() -> Unit):
          Unit = formatOptions(OutputFormatOptionsProperty(formatOptions))

      /**
       * @param location The location in Amazon S3 where the job writes its output. 
       */
      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      /**
       * @param location The location in Amazon S3 where the job writes its output. 
       */
      override fun location(location: S3LocationProperty) {
        cdkBuilder.location(location.let(S3LocationProperty::unwrap))
      }

      /**
       * @param location The location in Amazon S3 where the job writes its output. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb3769ff3eb925e87f899d0da733430132d44280d763d281c79e8a9563fb072d")
      override fun location(location: S3LocationProperty.Builder.() -> Unit): Unit =
          location(S3LocationProperty(location))

      /**
       * @param maxOutputFiles The maximum number of files to be generated by the job and written to
       * the output folder.
       */
      override fun maxOutputFiles(maxOutputFiles: Number) {
        cdkBuilder.maxOutputFiles(maxOutputFiles)
      }

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       */
      override fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
      }

      /**
       * @param overwrite A value that, if true, means that any data in the location specified for
       * output is overwritten with new output.
       */
      override fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite.let(IResolvable::unwrap))
      }

      /**
       * @param partitionColumns The names of one or more partition columns for the output of the
       * job.
       */
      override fun partitionColumns(partitionColumns: List<String>) {
        cdkBuilder.partitionColumns(partitionColumns)
      }

      /**
       * @param partitionColumns The names of one or more partition columns for the output of the
       * job.
       */
      override fun partitionColumns(vararg partitionColumns: String): Unit =
          partitionColumns(partitionColumns.toList())

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputProperty,
    ) : CdkObject(cdkObject), OutputProperty {
      /**
       * The compression algorithm used to compress the output text of the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-compressionformat)
       */
      override fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

      /**
       * The data format of the output of the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-format)
       */
      override fun format(): String? = unwrap(this).getFormat()

      /**
       * Represents options that define how DataBrew formats job output files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-formatoptions)
       */
      override fun formatOptions(): Any? = unwrap(this).getFormatOptions()

      /**
       * The location in Amazon S3 where the job writes its output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-location)
       */
      override fun location(): Any = unwrap(this).getLocation()

      /**
       * The maximum number of files to be generated by the job and written to the output folder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-maxoutputfiles)
       */
      override fun maxOutputFiles(): Number? = unwrap(this).getMaxOutputFiles()

      /**
       * A value that, if true, means that any data in the location specified for output is
       * overwritten with new output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-overwrite)
       */
      override fun overwrite(): Any? = unwrap(this).getOverwrite()

      /**
       * The names of one or more partition columns for the output of the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html#cfn-databrew-job-output-partitioncolumns)
       */
      override fun partitionColumns(): List<String> = unwrap(this).getPartitionColumns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputProperty):
          OutputProperty = CdkObjectWrappers.wrap(cdkObject) as OutputProperty

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.databrew.CfnJob.OutputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnJob.OutputProperty
    }
  }

  /**
   * Represents options that specify how and where DataBrew writes the database output generated by
   * recipe jobs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DatabaseTableOutputOptionsProperty databaseTableOutputOptionsProperty =
   * DatabaseTableOutputOptionsProperty.builder()
   * .tableName("tableName")
   * // the properties below are optional
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databasetableoutputoptions.html)
   */
  public interface DatabaseTableOutputOptionsProperty {
    /**
     * A prefix for the name of a table DataBrew will create in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databasetableoutputoptions.html#cfn-databrew-job-databasetableoutputoptions-tablename)
     */
    public fun tableName(): String

    /**
     * Represents an Amazon S3 location (bucket name and object key) where DataBrew can store
     * intermediate results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databasetableoutputoptions.html#cfn-databrew-job-databasetableoutputoptions-tempdirectory)
     */
    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    /**
     * A builder for [DatabaseTableOutputOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tableName A prefix for the name of a table DataBrew will create in the database. 
       */
      public fun tableName(tableName: String)

      /**
       * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can store intermediate results.
       */
      public fun tempDirectory(tempDirectory: IResolvable)

      /**
       * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can store intermediate results.
       */
      public fun tempDirectory(tempDirectory: S3LocationProperty)

      /**
       * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can store intermediate results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16da935a357eb6c65efef5f0570ae33313458f51bc5d3beef9127fdb6f79a5e0")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty.builder()

      /**
       * @param tableName A prefix for the name of a table DataBrew will create in the database. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can store intermediate results.
       */
      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable::unwrap))
      }

      /**
       * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can store intermediate results.
       */
      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty::unwrap))
      }

      /**
       * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can store intermediate results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16da935a357eb6c65efef5f0570ae33313458f51bc5d3beef9127fdb6f79a5e0")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty,
    ) : CdkObject(cdkObject), DatabaseTableOutputOptionsProperty {
      /**
       * A prefix for the name of a table DataBrew will create in the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databasetableoutputoptions.html#cfn-databrew-job-databasetableoutputoptions-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()

      /**
       * Represents an Amazon S3 location (bucket name and object key) where DataBrew can store
       * intermediate results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databasetableoutputoptions.html#cfn-databrew-job-databasetableoutputoptions-tempdirectory)
       */
      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatabaseTableOutputOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty):
          DatabaseTableOutputOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as
          DatabaseTableOutputOptionsProperty

      internal fun unwrap(wrapped: DatabaseTableOutputOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty
    }
  }

  /**
   * Selector of a column from a dataset for profile job configuration.
   *
   * One selector includes either a column name or a regular expression.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ColumnSelectorProperty columnSelectorProperty = ColumnSelectorProperty.builder()
   * .name("name")
   * .regex("regex")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html)
   */
  public interface ColumnSelectorProperty {
    /**
     * The name of a column from a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html#cfn-databrew-job-columnselector-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A regular expression for selecting a column from a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html#cfn-databrew-job-columnselector-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * A builder for [ColumnSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of a column from a dataset.
       */
      public fun name(name: String)

      /**
       * @param regex A regular expression for selecting a column from a dataset.
       */
      public fun regex(regex: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty.builder()

      /**
       * @param name The name of a column from a dataset.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param regex A regular expression for selecting a column from a dataset.
       */
      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty,
    ) : CdkObject(cdkObject), ColumnSelectorProperty {
      /**
       * The name of a column from a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html#cfn-databrew-job-columnselector-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A regular expression for selecting a column from a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html#cfn-databrew-job-columnselector-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty):
          ColumnSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as ColumnSelectorProperty

      internal fun unwrap(wrapped: ColumnSelectorProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty
    }
  }

  /**
   * Configuration of entity detection for a profile job.
   *
   * When undefined, entity detection is disabled.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * EntityDetectorConfigurationProperty entityDetectorConfigurationProperty =
   * EntityDetectorConfigurationProperty.builder()
   * .entityTypes(List.of("entityTypes"))
   * // the properties below are optional
   * .allowedStatistics(AllowedStatisticsProperty.builder()
   * .statistics(List.of("statistics"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html)
   */
  public interface EntityDetectorConfigurationProperty {
    /**
     * Configuration of statistics that are allowed to be run on columns that contain detected
     * entities.
     *
     * When undefined, no statistics will be computed on columns that contain detected entities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html#cfn-databrew-job-entitydetectorconfiguration-allowedstatistics)
     */
    public fun allowedStatistics(): Any? = unwrap(this).getAllowedStatistics()

    /**
     * Entity types to detect. Can be any of the following:.
     *
     * * USA_SSN
     * * EMAIL
     * * USA_ITIN
     * * USA_PASSPORT_NUMBER
     * * PHONE_NUMBER
     * * USA_DRIVING_LICENSE
     * * BANK_ACCOUNT
     * * CREDIT_CARD
     * * IP_ADDRESS
     * * MAC_ADDRESS
     * * USA_DEA_NUMBER
     * * USA_HCPCS_CODE
     * * USA_NATIONAL_PROVIDER_IDENTIFIER
     * * USA_NATIONAL_DRUG_CODE
     * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
     * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
     * * USA_CPT_CODE
     * * PERSON_NAME
     * * DATE
     *
     * The Entity type group USA_ALL is also supported, and includes all of the above entity types
     * except PERSON_NAME and DATE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html#cfn-databrew-job-entitydetectorconfiguration-entitytypes)
     */
    public fun entityTypes(): List<String>

    /**
     * A builder for [EntityDetectorConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedStatistics Configuration of statistics that are allowed to be run on columns
       * that contain detected entities.
       * When undefined, no statistics will be computed on columns that contain detected entities.
       */
      public fun allowedStatistics(allowedStatistics: IResolvable)

      /**
       * @param allowedStatistics Configuration of statistics that are allowed to be run on columns
       * that contain detected entities.
       * When undefined, no statistics will be computed on columns that contain detected entities.
       */
      public fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty)

      /**
       * @param allowedStatistics Configuration of statistics that are allowed to be run on columns
       * that contain detected entities.
       * When undefined, no statistics will be computed on columns that contain detected entities.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18a52ea22ca052defefa3edb2935f140eea9a62c96d99a18fa5a366cc9a75b9b")
      public fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty.Builder.() -> Unit)

      /**
       * @param entityTypes Entity types to detect. Can be any of the following:. 
       * * USA_SSN
       * * EMAIL
       * * USA_ITIN
       * * USA_PASSPORT_NUMBER
       * * PHONE_NUMBER
       * * USA_DRIVING_LICENSE
       * * BANK_ACCOUNT
       * * CREDIT_CARD
       * * IP_ADDRESS
       * * MAC_ADDRESS
       * * USA_DEA_NUMBER
       * * USA_HCPCS_CODE
       * * USA_NATIONAL_PROVIDER_IDENTIFIER
       * * USA_NATIONAL_DRUG_CODE
       * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
       * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
       * * USA_CPT_CODE
       * * PERSON_NAME
       * * DATE
       *
       * The Entity type group USA_ALL is also supported, and includes all of the above entity types
       * except PERSON_NAME and DATE.
       */
      public fun entityTypes(entityTypes: List<String>)

      /**
       * @param entityTypes Entity types to detect. Can be any of the following:. 
       * * USA_SSN
       * * EMAIL
       * * USA_ITIN
       * * USA_PASSPORT_NUMBER
       * * PHONE_NUMBER
       * * USA_DRIVING_LICENSE
       * * BANK_ACCOUNT
       * * CREDIT_CARD
       * * IP_ADDRESS
       * * MAC_ADDRESS
       * * USA_DEA_NUMBER
       * * USA_HCPCS_CODE
       * * USA_NATIONAL_PROVIDER_IDENTIFIER
       * * USA_NATIONAL_DRUG_CODE
       * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
       * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
       * * USA_CPT_CODE
       * * PERSON_NAME
       * * DATE
       *
       * The Entity type group USA_ALL is also supported, and includes all of the above entity types
       * except PERSON_NAME and DATE.
       */
      public fun entityTypes(vararg entityTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty.builder()

      /**
       * @param allowedStatistics Configuration of statistics that are allowed to be run on columns
       * that contain detected entities.
       * When undefined, no statistics will be computed on columns that contain detected entities.
       */
      override fun allowedStatistics(allowedStatistics: IResolvable) {
        cdkBuilder.allowedStatistics(allowedStatistics.let(IResolvable::unwrap))
      }

      /**
       * @param allowedStatistics Configuration of statistics that are allowed to be run on columns
       * that contain detected entities.
       * When undefined, no statistics will be computed on columns that contain detected entities.
       */
      override fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty) {
        cdkBuilder.allowedStatistics(allowedStatistics.let(AllowedStatisticsProperty::unwrap))
      }

      /**
       * @param allowedStatistics Configuration of statistics that are allowed to be run on columns
       * that contain detected entities.
       * When undefined, no statistics will be computed on columns that contain detected entities.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18a52ea22ca052defefa3edb2935f140eea9a62c96d99a18fa5a366cc9a75b9b")
      override
          fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty.Builder.() -> Unit):
          Unit = allowedStatistics(AllowedStatisticsProperty(allowedStatistics))

      /**
       * @param entityTypes Entity types to detect. Can be any of the following:. 
       * * USA_SSN
       * * EMAIL
       * * USA_ITIN
       * * USA_PASSPORT_NUMBER
       * * PHONE_NUMBER
       * * USA_DRIVING_LICENSE
       * * BANK_ACCOUNT
       * * CREDIT_CARD
       * * IP_ADDRESS
       * * MAC_ADDRESS
       * * USA_DEA_NUMBER
       * * USA_HCPCS_CODE
       * * USA_NATIONAL_PROVIDER_IDENTIFIER
       * * USA_NATIONAL_DRUG_CODE
       * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
       * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
       * * USA_CPT_CODE
       * * PERSON_NAME
       * * DATE
       *
       * The Entity type group USA_ALL is also supported, and includes all of the above entity types
       * except PERSON_NAME and DATE.
       */
      override fun entityTypes(entityTypes: List<String>) {
        cdkBuilder.entityTypes(entityTypes)
      }

      /**
       * @param entityTypes Entity types to detect. Can be any of the following:. 
       * * USA_SSN
       * * EMAIL
       * * USA_ITIN
       * * USA_PASSPORT_NUMBER
       * * PHONE_NUMBER
       * * USA_DRIVING_LICENSE
       * * BANK_ACCOUNT
       * * CREDIT_CARD
       * * IP_ADDRESS
       * * MAC_ADDRESS
       * * USA_DEA_NUMBER
       * * USA_HCPCS_CODE
       * * USA_NATIONAL_PROVIDER_IDENTIFIER
       * * USA_NATIONAL_DRUG_CODE
       * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
       * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
       * * USA_CPT_CODE
       * * PERSON_NAME
       * * DATE
       *
       * The Entity type group USA_ALL is also supported, and includes all of the above entity types
       * except PERSON_NAME and DATE.
       */
      override fun entityTypes(vararg entityTypes: String): Unit = entityTypes(entityTypes.toList())

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty,
    ) : CdkObject(cdkObject), EntityDetectorConfigurationProperty {
      /**
       * Configuration of statistics that are allowed to be run on columns that contain detected
       * entities.
       *
       * When undefined, no statistics will be computed on columns that contain detected entities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html#cfn-databrew-job-entitydetectorconfiguration-allowedstatistics)
       */
      override fun allowedStatistics(): Any? = unwrap(this).getAllowedStatistics()

      /**
       * Entity types to detect. Can be any of the following:.
       *
       * * USA_SSN
       * * EMAIL
       * * USA_ITIN
       * * USA_PASSPORT_NUMBER
       * * PHONE_NUMBER
       * * USA_DRIVING_LICENSE
       * * BANK_ACCOUNT
       * * CREDIT_CARD
       * * IP_ADDRESS
       * * MAC_ADDRESS
       * * USA_DEA_NUMBER
       * * USA_HCPCS_CODE
       * * USA_NATIONAL_PROVIDER_IDENTIFIER
       * * USA_NATIONAL_DRUG_CODE
       * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
       * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
       * * USA_CPT_CODE
       * * PERSON_NAME
       * * DATE
       *
       * The Entity type group USA_ALL is also supported, and includes all of the above entity types
       * except PERSON_NAME and DATE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html#cfn-databrew-job-entitydetectorconfiguration-entitytypes)
       */
      override fun entityTypes(): List<String> = unwrap(this).getEntityTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EntityDetectorConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty):
          EntityDetectorConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          EntityDetectorConfigurationProperty

      internal fun unwrap(wrapped: EntityDetectorConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty
    }
  }

  /**
   * Configuration for column evaluations for a profile job.
   *
   * ColumnStatisticsConfiguration can be used to select evaluations and override parameters of
   * evaluations for particular columns.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ColumnStatisticsConfigurationProperty columnStatisticsConfigurationProperty =
   * ColumnStatisticsConfigurationProperty.builder()
   * .statistics(StatisticsConfigurationProperty.builder()
   * .includedStatistics(List.of("includedStatistics"))
   * .overrides(List.of(StatisticOverrideProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .statistic("statistic")
   * .build()))
   * .build())
   * // the properties below are optional
   * .selectors(List.of(ColumnSelectorProperty.builder()
   * .name("name")
   * .regex("regex")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnstatisticsconfiguration.html)
   */
  public interface ColumnStatisticsConfigurationProperty {
    /**
     * List of column selectors.
     *
     * Selectors can be used to select columns from the dataset. When selectors are undefined,
     * configuration will be applied to all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnstatisticsconfiguration.html#cfn-databrew-job-columnstatisticsconfiguration-selectors)
     */
    public fun selectors(): Any? = unwrap(this).getSelectors()

    /**
     * Configuration for evaluations.
     *
     * Statistics can be used to select evaluations and override parameters of evaluations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnstatisticsconfiguration.html#cfn-databrew-job-columnstatisticsconfiguration-statistics)
     */
    public fun statistics(): Any

    /**
     * A builder for [ColumnStatisticsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param selectors List of column selectors.
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       */
      public fun selectors(selectors: IResolvable)

      /**
       * @param selectors List of column selectors.
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       */
      public fun selectors(selectors: List<Any>)

      /**
       * @param selectors List of column selectors.
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       */
      public fun selectors(vararg selectors: Any)

      /**
       * @param statistics Configuration for evaluations. 
       * Statistics can be used to select evaluations and override parameters of evaluations.
       */
      public fun statistics(statistics: IResolvable)

      /**
       * @param statistics Configuration for evaluations. 
       * Statistics can be used to select evaluations and override parameters of evaluations.
       */
      public fun statistics(statistics: StatisticsConfigurationProperty)

      /**
       * @param statistics Configuration for evaluations. 
       * Statistics can be used to select evaluations and override parameters of evaluations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3072c99b72c101cb44f2aa0c466c22019355c3795b79ee1a50ed0defa76fab")
      public fun statistics(statistics: StatisticsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty.builder()

      /**
       * @param selectors List of column selectors.
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       */
      override fun selectors(selectors: IResolvable) {
        cdkBuilder.selectors(selectors.let(IResolvable::unwrap))
      }

      /**
       * @param selectors List of column selectors.
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       */
      override fun selectors(selectors: List<Any>) {
        cdkBuilder.selectors(selectors)
      }

      /**
       * @param selectors List of column selectors.
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       */
      override fun selectors(vararg selectors: Any): Unit = selectors(selectors.toList())

      /**
       * @param statistics Configuration for evaluations. 
       * Statistics can be used to select evaluations and override parameters of evaluations.
       */
      override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable::unwrap))
      }

      /**
       * @param statistics Configuration for evaluations. 
       * Statistics can be used to select evaluations and override parameters of evaluations.
       */
      override fun statistics(statistics: StatisticsConfigurationProperty) {
        cdkBuilder.statistics(statistics.let(StatisticsConfigurationProperty::unwrap))
      }

      /**
       * @param statistics Configuration for evaluations. 
       * Statistics can be used to select evaluations and override parameters of evaluations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3072c99b72c101cb44f2aa0c466c22019355c3795b79ee1a50ed0defa76fab")
      override fun statistics(statistics: StatisticsConfigurationProperty.Builder.() -> Unit): Unit
          = statistics(StatisticsConfigurationProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty,
    ) : CdkObject(cdkObject), ColumnStatisticsConfigurationProperty {
      /**
       * List of column selectors.
       *
       * Selectors can be used to select columns from the dataset. When selectors are undefined,
       * configuration will be applied to all supported columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnstatisticsconfiguration.html#cfn-databrew-job-columnstatisticsconfiguration-selectors)
       */
      override fun selectors(): Any? = unwrap(this).getSelectors()

      /**
       * Configuration for evaluations.
       *
       * Statistics can be used to select evaluations and override parameters of evaluations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnstatisticsconfiguration.html#cfn-databrew-job-columnstatisticsconfiguration-statistics)
       */
      override fun statistics(): Any = unwrap(this).getStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ColumnStatisticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty):
          ColumnStatisticsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ColumnStatisticsConfigurationProperty

      internal fun unwrap(wrapped: ColumnStatisticsConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty
    }
  }

  /**
   * Configuration for data quality validation.
   *
   * Used to select the Rulesets and Validation Mode to be used in the profile job. When
   * ValidationConfiguration is null, the profile job will run without data quality validation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ValidationConfigurationProperty validationConfigurationProperty =
   * ValidationConfigurationProperty.builder()
   * .rulesetArn("rulesetArn")
   * // the properties below are optional
   * .validationMode("validationMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html)
   */
  public interface ValidationConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job.
     *
     * The TargetArn of the selected ruleset should be the same as the Amazon Resource Name (ARN) of
     * the dataset that is associated with the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html#cfn-databrew-job-validationconfiguration-rulesetarn)
     */
    public fun rulesetArn(): String

    /**
     * Mode of data quality validation.
     *
     * Default mode is “CHECK_ALL” which verifies all rules defined in the selected ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html#cfn-databrew-job-validationconfiguration-validationmode)
     */
    public fun validationMode(): String? = unwrap(this).getValidationMode()

    /**
     * A builder for [ValidationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rulesetArn The Amazon Resource Name (ARN) for the ruleset to be validated in the
       * profile job. 
       * The TargetArn of the selected ruleset should be the same as the Amazon Resource Name (ARN)
       * of the dataset that is associated with the profile job.
       */
      public fun rulesetArn(rulesetArn: String)

      /**
       * @param validationMode Mode of data quality validation.
       * Default mode is “CHECK_ALL” which verifies all rules defined in the selected ruleset.
       */
      public fun validationMode(validationMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty.builder()

      /**
       * @param rulesetArn The Amazon Resource Name (ARN) for the ruleset to be validated in the
       * profile job. 
       * The TargetArn of the selected ruleset should be the same as the Amazon Resource Name (ARN)
       * of the dataset that is associated with the profile job.
       */
      override fun rulesetArn(rulesetArn: String) {
        cdkBuilder.rulesetArn(rulesetArn)
      }

      /**
       * @param validationMode Mode of data quality validation.
       * Default mode is “CHECK_ALL” which verifies all rules defined in the selected ruleset.
       */
      override fun validationMode(validationMode: String) {
        cdkBuilder.validationMode(validationMode)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty,
    ) : CdkObject(cdkObject), ValidationConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job.
       *
       * The TargetArn of the selected ruleset should be the same as the Amazon Resource Name (ARN)
       * of the dataset that is associated with the profile job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html#cfn-databrew-job-validationconfiguration-rulesetarn)
       */
      override fun rulesetArn(): String = unwrap(this).getRulesetArn()

      /**
       * Mode of data quality validation.
       *
       * Default mode is “CHECK_ALL” which verifies all rules defined in the selected ruleset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html#cfn-databrew-job-validationconfiguration-validationmode)
       */
      override fun validationMode(): String? = unwrap(this).getValidationMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty):
          ValidationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ValidationConfigurationProperty

      internal fun unwrap(wrapped: ValidationConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty
    }
  }

  /**
   * Represents one or more actions to be performed on a DataBrew dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * RecipeProperty recipeProperty = RecipeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html)
   */
  public interface RecipeProperty {
    /**
     * The unique name for the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html#cfn-databrew-job-recipe-name)
     */
    public fun name(): String

    /**
     * The identifier for the version for the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html#cfn-databrew-job-recipe-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [RecipeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The unique name for the recipe. 
       */
      public fun name(name: String)

      /**
       * @param version The identifier for the version for the recipe.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty.Builder
          = software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty.builder()

      /**
       * @param name The unique name for the recipe. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The identifier for the version for the recipe.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty,
    ) : CdkObject(cdkObject), RecipeProperty {
      /**
       * The unique name for the recipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html#cfn-databrew-job-recipe-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The identifier for the version for the recipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html#cfn-databrew-job-recipe-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty):
          RecipeProperty = CdkObjectWrappers.wrap(cdkObject) as RecipeProperty

      internal fun unwrap(wrapped: RecipeProperty):
          software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty
    }
  }

  /**
   * Configuration of evaluations for a profile job.
   *
   * This configuration can be used to select evaluations and override the parameters of selected
   * evaluations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * StatisticsConfigurationProperty statisticsConfigurationProperty =
   * StatisticsConfigurationProperty.builder()
   * .includedStatistics(List.of("includedStatistics"))
   * .overrides(List.of(StatisticOverrideProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .statistic("statistic")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html)
   */
  public interface StatisticsConfigurationProperty {
    /**
     * List of included evaluations.
     *
     * When the list is undefined, all supported evaluations will be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html#cfn-databrew-job-statisticsconfiguration-includedstatistics)
     */
    public fun includedStatistics(): List<String> = unwrap(this).getIncludedStatistics() ?:
        emptyList()

    /**
     * List of overrides for evaluations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html#cfn-databrew-job-statisticsconfiguration-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * A builder for [StatisticsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param includedStatistics List of included evaluations.
       * When the list is undefined, all supported evaluations will be included.
       */
      public fun includedStatistics(includedStatistics: List<String>)

      /**
       * @param includedStatistics List of included evaluations.
       * When the list is undefined, all supported evaluations will be included.
       */
      public fun includedStatistics(vararg includedStatistics: String)

      /**
       * @param overrides List of overrides for evaluations.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides List of overrides for evaluations.
       */
      public fun overrides(overrides: List<Any>)

      /**
       * @param overrides List of overrides for evaluations.
       */
      public fun overrides(vararg overrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty.builder()

      /**
       * @param includedStatistics List of included evaluations.
       * When the list is undefined, all supported evaluations will be included.
       */
      override fun includedStatistics(includedStatistics: List<String>) {
        cdkBuilder.includedStatistics(includedStatistics)
      }

      /**
       * @param includedStatistics List of included evaluations.
       * When the list is undefined, all supported evaluations will be included.
       */
      override fun includedStatistics(vararg includedStatistics: String): Unit =
          includedStatistics(includedStatistics.toList())

      /**
       * @param overrides List of overrides for evaluations.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      /**
       * @param overrides List of overrides for evaluations.
       */
      override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      /**
       * @param overrides List of overrides for evaluations.
       */
      override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty,
    ) : CdkObject(cdkObject), StatisticsConfigurationProperty {
      /**
       * List of included evaluations.
       *
       * When the list is undefined, all supported evaluations will be included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html#cfn-databrew-job-statisticsconfiguration-includedstatistics)
       */
      override fun includedStatistics(): List<String> = unwrap(this).getIncludedStatistics() ?:
          emptyList()

      /**
       * List of overrides for evaluations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html#cfn-databrew-job-statisticsconfiguration-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty):
          StatisticsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          StatisticsConfigurationProperty

      internal fun unwrap(wrapped: StatisticsConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty
    }
  }

  /**
   * Configuration for profile jobs.
   *
   * Configuration can be used to select columns, do evaluations, and override default parameters of
   * evaluations. When configuration is undefined, the profile job will apply default settings to all
   * supported columns.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ProfileConfigurationProperty profileConfigurationProperty =
   * ProfileConfigurationProperty.builder()
   * .columnStatisticsConfigurations(List.of(ColumnStatisticsConfigurationProperty.builder()
   * .statistics(StatisticsConfigurationProperty.builder()
   * .includedStatistics(List.of("includedStatistics"))
   * .overrides(List.of(StatisticOverrideProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .statistic("statistic")
   * .build()))
   * .build())
   * // the properties below are optional
   * .selectors(List.of(ColumnSelectorProperty.builder()
   * .name("name")
   * .regex("regex")
   * .build()))
   * .build()))
   * .datasetStatisticsConfiguration(StatisticsConfigurationProperty.builder()
   * .includedStatistics(List.of("includedStatistics"))
   * .overrides(List.of(StatisticOverrideProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .statistic("statistic")
   * .build()))
   * .build())
   * .entityDetectorConfiguration(EntityDetectorConfigurationProperty.builder()
   * .entityTypes(List.of("entityTypes"))
   * // the properties below are optional
   * .allowedStatistics(AllowedStatisticsProperty.builder()
   * .statistics(List.of("statistics"))
   * .build())
   * .build())
   * .profileColumns(List.of(ColumnSelectorProperty.builder()
   * .name("name")
   * .regex("regex")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html)
   */
  public interface ProfileConfigurationProperty {
    /**
     * List of configurations for column evaluations.
     *
     * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
     * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     * profile job will profile all supported columns and run all supported evaluations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-columnstatisticsconfigurations)
     */
    public fun columnStatisticsConfigurations(): Any? =
        unwrap(this).getColumnStatisticsConfigurations()

    /**
     * Configuration for inter-column evaluations.
     *
     * Configuration can be used to select evaluations and override parameters of evaluations. When
     * configuration is undefined, the profile job will run all supported inter-column evaluations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-datasetstatisticsconfiguration)
     */
    public fun datasetStatisticsConfiguration(): Any? =
        unwrap(this).getDatasetStatisticsConfiguration()

    /**
     * Configuration of entity detection for a profile job.
     *
     * When undefined, entity detection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-entitydetectorconfiguration)
     */
    public fun entityDetectorConfiguration(): Any? = unwrap(this).getEntityDetectorConfiguration()

    /**
     * List of column selectors.
     *
     * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
     * undefined, the profile job will profile all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-profilecolumns)
     */
    public fun profileColumns(): Any? = unwrap(this).getProfileColumns()

    /**
     * A builder for [ProfileConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnStatisticsConfigurations List of configurations for column evaluations.
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       */
      public fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable)

      /**
       * @param columnStatisticsConfigurations List of configurations for column evaluations.
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       */
      public fun columnStatisticsConfigurations(columnStatisticsConfigurations: List<Any>)

      /**
       * @param columnStatisticsConfigurations List of configurations for column evaluations.
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       */
      public fun columnStatisticsConfigurations(vararg columnStatisticsConfigurations: Any)

      /**
       * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       */
      public fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable)

      /**
       * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       */
      public
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty)

      /**
       * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("061b787e24cb4e82818805cf79278644db54356267fc0bbd8a69fde1df2ef0b3")
      public
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
       * When undefined, entity detection is disabled.
       */
      public fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable)

      /**
       * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
       * When undefined, entity detection is disabled.
       */
      public
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty)

      /**
       * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
       * When undefined, entity detection is disabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c051fde2cc8b2e6f39eb2dfc10b577b234699d332c2cf2842df9692a0e5d01")
      public
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty.Builder.() -> Unit)

      /**
       * @param profileColumns List of column selectors.
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       */
      public fun profileColumns(profileColumns: IResolvable)

      /**
       * @param profileColumns List of column selectors.
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       */
      public fun profileColumns(profileColumns: List<Any>)

      /**
       * @param profileColumns List of column selectors.
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       */
      public fun profileColumns(vararg profileColumns: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty.builder()

      /**
       * @param columnStatisticsConfigurations List of configurations for column evaluations.
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       */
      override fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable) {
        cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param columnStatisticsConfigurations List of configurations for column evaluations.
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       */
      override fun columnStatisticsConfigurations(columnStatisticsConfigurations: List<Any>) {
        cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations)
      }

      /**
       * @param columnStatisticsConfigurations List of configurations for column evaluations.
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       */
      override fun columnStatisticsConfigurations(vararg columnStatisticsConfigurations: Any): Unit
          = columnStatisticsConfigurations(columnStatisticsConfigurations.toList())

      /**
       * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       */
      override fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       */
      override
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration.let(StatisticsConfigurationProperty::unwrap))
      }

      /**
       * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("061b787e24cb4e82818805cf79278644db54356267fc0bbd8a69fde1df2ef0b3")
      override
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty.Builder.() -> Unit):
          Unit =
          datasetStatisticsConfiguration(StatisticsConfigurationProperty(datasetStatisticsConfiguration))

      /**
       * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
       * When undefined, entity detection is disabled.
       */
      override fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
       * When undefined, entity detection is disabled.
       */
      override
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration.let(EntityDetectorConfigurationProperty::unwrap))
      }

      /**
       * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
       * When undefined, entity detection is disabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c051fde2cc8b2e6f39eb2dfc10b577b234699d332c2cf2842df9692a0e5d01")
      override
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty.Builder.() -> Unit):
          Unit =
          entityDetectorConfiguration(EntityDetectorConfigurationProperty(entityDetectorConfiguration))

      /**
       * @param profileColumns List of column selectors.
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       */
      override fun profileColumns(profileColumns: IResolvable) {
        cdkBuilder.profileColumns(profileColumns.let(IResolvable::unwrap))
      }

      /**
       * @param profileColumns List of column selectors.
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       */
      override fun profileColumns(profileColumns: List<Any>) {
        cdkBuilder.profileColumns(profileColumns)
      }

      /**
       * @param profileColumns List of column selectors.
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       */
      override fun profileColumns(vararg profileColumns: Any): Unit =
          profileColumns(profileColumns.toList())

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty,
    ) : CdkObject(cdkObject), ProfileConfigurationProperty {
      /**
       * List of configurations for column evaluations.
       *
       * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
       * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
       * profile job will profile all supported columns and run all supported evaluations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-columnstatisticsconfigurations)
       */
      override fun columnStatisticsConfigurations(): Any? =
          unwrap(this).getColumnStatisticsConfigurations()

      /**
       * Configuration for inter-column evaluations.
       *
       * Configuration can be used to select evaluations and override parameters of evaluations.
       * When configuration is undefined, the profile job will run all supported inter-column
       * evaluations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-datasetstatisticsconfiguration)
       */
      override fun datasetStatisticsConfiguration(): Any? =
          unwrap(this).getDatasetStatisticsConfiguration()

      /**
       * Configuration of entity detection for a profile job.
       *
       * When undefined, entity detection is disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-entitydetectorconfiguration)
       */
      override fun entityDetectorConfiguration(): Any? =
          unwrap(this).getEntityDetectorConfiguration()

      /**
       * List of column selectors.
       *
       * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
       * undefined, the profile job will profile all supported columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html#cfn-databrew-job-profileconfiguration-profilecolumns)
       */
      override fun profileColumns(): Any? = unwrap(this).getProfileColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProfileConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty):
          ProfileConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ProfileConfigurationProperty

      internal fun unwrap(wrapped: ProfileConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty
    }
  }

  /**
   * Represents a set of options that define the structure of comma-separated (CSV) job output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * OutputFormatOptionsProperty outputFormatOptionsProperty = OutputFormatOptionsProperty.builder()
   * .csv(CsvOutputOptionsProperty.builder()
   * .delimiter("delimiter")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputformatoptions.html)
   */
  public interface OutputFormatOptionsProperty {
    /**
     * Represents a set of options that define the structure of comma-separated value (CSV) job
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputformatoptions.html#cfn-databrew-job-outputformatoptions-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * A builder for [OutputFormatOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csv Represents a set of options that define the structure of comma-separated value
       * (CSV) job output.
       */
      public fun csv(csv: IResolvable)

      /**
       * @param csv Represents a set of options that define the structure of comma-separated value
       * (CSV) job output.
       */
      public fun csv(csv: CsvOutputOptionsProperty)

      /**
       * @param csv Represents a set of options that define the structure of comma-separated value
       * (CSV) job output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b05105eb14aeeb56d1114d1c8589bd24eed2eb4796c6cbab8243e92129ebabe")
      public fun csv(csv: CsvOutputOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty.builder()

      /**
       * @param csv Represents a set of options that define the structure of comma-separated value
       * (CSV) job output.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      /**
       * @param csv Represents a set of options that define the structure of comma-separated value
       * (CSV) job output.
       */
      override fun csv(csv: CsvOutputOptionsProperty) {
        cdkBuilder.csv(csv.let(CsvOutputOptionsProperty::unwrap))
      }

      /**
       * @param csv Represents a set of options that define the structure of comma-separated value
       * (CSV) job output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b05105eb14aeeb56d1114d1c8589bd24eed2eb4796c6cbab8243e92129ebabe")
      override fun csv(csv: CsvOutputOptionsProperty.Builder.() -> Unit): Unit =
          csv(CsvOutputOptionsProperty(csv))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty,
    ) : CdkObject(cdkObject), OutputFormatOptionsProperty {
      /**
       * Represents a set of options that define the structure of comma-separated value (CSV) job
       * output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputformatoptions.html#cfn-databrew-job-outputformatoptions-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputFormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty):
          OutputFormatOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as
          OutputFormatOptionsProperty

      internal fun unwrap(wrapped: OutputFormatOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty
    }
  }

  /**
   * Represents options that specify how and where DataBrew writes the Amazon S3 output generated by
   * recipe jobs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * S3TableOutputOptionsProperty s3TableOutputOptionsProperty =
   * S3TableOutputOptionsProperty.builder()
   * .location(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3tableoutputoptions.html)
   */
  public interface S3TableOutputOptionsProperty {
    /**
     * Represents an Amazon S3 location (bucket name and object key) where DataBrew can write output
     * from a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3tableoutputoptions.html#cfn-databrew-job-s3tableoutputoptions-location)
     */
    public fun location(): Any

    /**
     * A builder for [S3TableOutputOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param location Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can write output from a job. 
       */
      public fun location(location: IResolvable)

      /**
       * @param location Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can write output from a job. 
       */
      public fun location(location: S3LocationProperty)

      /**
       * @param location Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can write output from a job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d68267f60a07432aaee729323c11d3267babe697374b61028568ea043fcd158")
      public fun location(location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty.builder()

      /**
       * @param location Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can write output from a job. 
       */
      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      /**
       * @param location Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can write output from a job. 
       */
      override fun location(location: S3LocationProperty) {
        cdkBuilder.location(location.let(S3LocationProperty::unwrap))
      }

      /**
       * @param location Represents an Amazon S3 location (bucket name and object key) where
       * DataBrew can write output from a job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d68267f60a07432aaee729323c11d3267babe697374b61028568ea043fcd158")
      override fun location(location: S3LocationProperty.Builder.() -> Unit): Unit =
          location(S3LocationProperty(location))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty,
    ) : CdkObject(cdkObject), S3TableOutputOptionsProperty {
      /**
       * Represents an Amazon S3 location (bucket name and object key) where DataBrew can write
       * output from a job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3tableoutputoptions.html#cfn-databrew-job-s3tableoutputoptions-location)
       */
      override fun location(): Any = unwrap(this).getLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3TableOutputOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty):
          S3TableOutputOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as
          S3TableOutputOptionsProperty

      internal fun unwrap(wrapped: S3TableOutputOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty
    }
  }

  /**
   * Represents a JDBC database output object which defines the output destination for a DataBrew
   * recipe job to write into.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DatabaseOutputProperty databaseOutputProperty = DatabaseOutputProperty.builder()
   * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
   * .tableName("tableName")
   * // the properties below are optional
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build())
   * .glueConnectionName("glueConnectionName")
   * // the properties below are optional
   * .databaseOutputMode("databaseOutputMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html)
   */
  public interface DatabaseOutputProperty {
    /**
     * Represents options that specify how and where DataBrew writes the database output generated
     * by recipe jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html#cfn-databrew-job-databaseoutput-databaseoptions)
     */
    public fun databaseOptions(): Any

    /**
     * The output mode to write into the database.
     *
     * Currently supported option: NEW_TABLE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html#cfn-databrew-job-databaseoutput-databaseoutputmode)
     */
    public fun databaseOutputMode(): String? = unwrap(this).getDatabaseOutputMode()

    /**
     * The AWS Glue connection that stores the connection information for the target database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html#cfn-databrew-job-databaseoutput-glueconnectionname)
     */
    public fun glueConnectionName(): String

    /**
     * A builder for [DatabaseOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs. 
       */
      public fun databaseOptions(databaseOptions: IResolvable)

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs. 
       */
      public fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty)

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1196af73934d09b1eecaedbf7ed5c6b2c76ac68dbb90adcf21f73f65f421c7b5")
      public
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit)

      /**
       * @param databaseOutputMode The output mode to write into the database.
       * Currently supported option: NEW_TABLE.
       */
      public fun databaseOutputMode(databaseOutputMode: String)

      /**
       * @param glueConnectionName The AWS Glue connection that stores the connection information
       * for the target database. 
       */
      public fun glueConnectionName(glueConnectionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty.builder()

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs. 
       */
      override fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions.let(IResolvable::unwrap))
      }

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs. 
       */
      override fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions.let(DatabaseTableOutputOptionsProperty::unwrap))
      }

      /**
       * @param databaseOptions Represents options that specify how and where DataBrew writes the
       * database output generated by recipe jobs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1196af73934d09b1eecaedbf7ed5c6b2c76ac68dbb90adcf21f73f65f421c7b5")
      override
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit):
          Unit = databaseOptions(DatabaseTableOutputOptionsProperty(databaseOptions))

      /**
       * @param databaseOutputMode The output mode to write into the database.
       * Currently supported option: NEW_TABLE.
       */
      override fun databaseOutputMode(databaseOutputMode: String) {
        cdkBuilder.databaseOutputMode(databaseOutputMode)
      }

      /**
       * @param glueConnectionName The AWS Glue connection that stores the connection information
       * for the target database. 
       */
      override fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty,
    ) : CdkObject(cdkObject), DatabaseOutputProperty {
      /**
       * Represents options that specify how and where DataBrew writes the database output generated
       * by recipe jobs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html#cfn-databrew-job-databaseoutput-databaseoptions)
       */
      override fun databaseOptions(): Any = unwrap(this).getDatabaseOptions()

      /**
       * The output mode to write into the database.
       *
       * Currently supported option: NEW_TABLE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html#cfn-databrew-job-databaseoutput-databaseoutputmode)
       */
      override fun databaseOutputMode(): String? = unwrap(this).getDatabaseOutputMode()

      /**
       * The AWS Glue connection that stores the connection information for the target database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html#cfn-databrew-job-databaseoutput-glueconnectionname)
       */
      override fun glueConnectionName(): String = unwrap(this).getGlueConnectionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty):
          DatabaseOutputProperty = CdkObjectWrappers.wrap(cdkObject) as DatabaseOutputProperty

      internal fun unwrap(wrapped: DatabaseOutputProperty):
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty
    }
  }

  /**
   * A sample configuration for profile jobs only, which determines the number of rows on which the
   * profile job is run.
   *
   * If a `JobSample` value isn't provided, the default is used. The default value is CUSTOM_ROWS
   * for the mode parameter and 20,000 for the size parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * JobSampleProperty jobSampleProperty = JobSampleProperty.builder()
   * .mode("mode")
   * .size(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-jobsample.html)
   */
  public interface JobSampleProperty {
    /**
     * A value that determines whether the profile job is run on the entire dataset or a specified
     * number of rows.
     *
     * This value must be one of the following:
     *
     * * FULL_DATASET - The profile job is run on the entire dataset.
     * * CUSTOM_ROWS - The profile job is run on the number of rows specified in the `Size`
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-jobsample.html#cfn-databrew-job-jobsample-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * The `Size` parameter is only required when the mode is CUSTOM_ROWS.
     *
     * The profile job is run on the specified number of rows. The maximum value for size is
     * Long.MAX_VALUE.
     *
     * Long.MAX_VALUE = 9223372036854775807
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-jobsample.html#cfn-databrew-job-jobsample-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * A builder for [JobSampleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode A value that determines whether the profile job is run on the entire dataset or
       * a specified number of rows.
       * This value must be one of the following:
       *
       * * FULL_DATASET - The profile job is run on the entire dataset.
       * * CUSTOM_ROWS - The profile job is run on the number of rows specified in the `Size`
       * parameter.
       */
      public fun mode(mode: String)

      /**
       * @param size The `Size` parameter is only required when the mode is CUSTOM_ROWS.
       * The profile job is run on the specified number of rows. The maximum value for size is
       * Long.MAX_VALUE.
       *
       * Long.MAX_VALUE = 9223372036854775807
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty.builder()

      /**
       * @param mode A value that determines whether the profile job is run on the entire dataset or
       * a specified number of rows.
       * This value must be one of the following:
       *
       * * FULL_DATASET - The profile job is run on the entire dataset.
       * * CUSTOM_ROWS - The profile job is run on the number of rows specified in the `Size`
       * parameter.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param size The `Size` parameter is only required when the mode is CUSTOM_ROWS.
       * The profile job is run on the specified number of rows. The maximum value for size is
       * Long.MAX_VALUE.
       *
       * Long.MAX_VALUE = 9223372036854775807
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty,
    ) : CdkObject(cdkObject), JobSampleProperty {
      /**
       * A value that determines whether the profile job is run on the entire dataset or a specified
       * number of rows.
       *
       * This value must be one of the following:
       *
       * * FULL_DATASET - The profile job is run on the entire dataset.
       * * CUSTOM_ROWS - The profile job is run on the number of rows specified in the `Size`
       * parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-jobsample.html#cfn-databrew-job-jobsample-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()

      /**
       * The `Size` parameter is only required when the mode is CUSTOM_ROWS.
       *
       * The profile job is run on the specified number of rows. The maximum value for size is
       * Long.MAX_VALUE.
       *
       * Long.MAX_VALUE = 9223372036854775807
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-jobsample.html#cfn-databrew-job-jobsample-size)
       */
      override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobSampleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty):
          JobSampleProperty = CdkObjectWrappers.wrap(cdkObject) as JobSampleProperty

      internal fun unwrap(wrapped: JobSampleProperty):
          software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty
    }
  }
}
