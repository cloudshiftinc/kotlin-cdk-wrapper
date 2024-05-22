@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnJob`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
 * CfnJobProps cfnJobProps = CfnJobProps.builder()
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
public interface CfnJobProps {
  /**
   * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
   */
  public fun dataCatalogOutputs(): Any? = unwrap(this).getDataCatalogOutputs()

  /**
   * Represents a list of JDBC database output objects which defines the output destination for a
   * DataBrew recipe job to write into.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
   */
  public fun databaseOutputs(): Any? = unwrap(this).getDatabaseOutputs()

  /**
   * A dataset that the job is to process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datasetname)
   */
  public fun datasetName(): String? = unwrap(this).getDatasetName()

  /**
   * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output.
   *
   * For more information, see [Encrypting data written by DataBrew
   * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionkeyarn)
   */
  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * The encryption mode for the job, which can be one of the following:.
   *
   * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
   * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionmode)
   */
  public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

  /**
   * A sample configuration for profile jobs only, which determines the number of rows on which the
   * profile job is run.
   *
   * If a `JobSample` value isn't provided, the default value is used. The default value is
   * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
   */
  public fun jobSample(): Any? = unwrap(this).getJobSample()

  /**
   * The current status of Amazon CloudWatch logging for the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-logsubscription)
   */
  public fun logSubscription(): String? = unwrap(this).getLogSubscription()

  /**
   * The maximum number of nodes that can be consumed when the job processes data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxcapacity)
   */
  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The maximum number of times to retry the job after a job run fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxretries)
   */
  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * The unique name of the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-name)
   */
  public fun name(): String

  /**
   * The location in Amazon S3 where the job writes its output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
   */
  public fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  /**
   * One or more artifacts that represent output from running the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
   */
  public fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * Configuration for profile jobs.
   *
   * Configuration can be used to select columns, do evaluations, and override default parameters of
   * evaluations. When configuration is undefined, the profile job will apply default settings to all
   * supported columns.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
   */
  public fun profileConfiguration(): Any? = unwrap(this).getProfileConfiguration()

  /**
   * The name of the project that the job is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-projectname)
   */
  public fun projectName(): String? = unwrap(this).getProjectName()

  /**
   * A series of data transformation steps that the job runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
   */
  public fun recipe(): Any? = unwrap(this).getRecipe()

  /**
   * The Amazon Resource Name (ARN) of the role to be assumed for this job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-rolearn)
   */
  public fun roleArn(): String

  /**
   * Metadata tags that have been applied to the job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The job's timeout in minutes.
   *
   * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-timeout)
   */
  public fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The job type of the job, which must be one of the following:.
   *
   * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data distribution,
   * and more.
   * * `RECIPE` - A job to apply one or more transformations to a dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-type)
   */
  public fun type(): String

  /**
   * List of validation configurations that are applied to the profile job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
   */
  public fun validationConfigurations(): Any? = unwrap(this).getValidationConfigurations()

  /**
   * A builder for [CfnJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job.
     */
    public fun dataCatalogOutputs(dataCatalogOutputs: IResolvable)

    /**
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job.
     */
    public fun dataCatalogOutputs(dataCatalogOutputs: List<Any>)

    /**
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job.
     */
    public fun dataCatalogOutputs(vararg dataCatalogOutputs: Any)

    /**
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into.
     */
    public fun databaseOutputs(databaseOutputs: IResolvable)

    /**
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into.
     */
    public fun databaseOutputs(databaseOutputs: List<Any>)

    /**
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into.
     */
    public fun databaseOutputs(vararg databaseOutputs: Any)

    /**
     * @param datasetName A dataset that the job is to process.
     */
    public fun datasetName(datasetName: String)

    /**
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of an encryption key that is used to
     * protect the job output.
     * For more information, see [Encrypting data written by DataBrew
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * @param encryptionMode The encryption mode for the job, which can be one of the following:.
     * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
     * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
     */
    public fun encryptionMode(encryptionMode: String)

    /**
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run.
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     */
    public fun jobSample(jobSample: IResolvable)

    /**
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run.
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     */
    public fun jobSample(jobSample: CfnJob.JobSampleProperty)

    /**
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run.
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb2dc01320ade4b6c74e4110f765b2f7580dead6c23cd512e358c81fa84cb30f")
    public fun jobSample(jobSample: CfnJob.JobSampleProperty.Builder.() -> Unit)

    /**
     * @param logSubscription The current status of Amazon CloudWatch logging for the job.
     */
    public fun logSubscription(logSubscription: String)

    /**
     * @param maxCapacity The maximum number of nodes that can be consumed when the job processes
     * data.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param maxRetries The maximum number of times to retry the job after a job run fails.
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * @param name The unique name of the job. 
     */
    public fun name(name: String)

    /**
     * @param outputLocation The location in Amazon S3 where the job writes its output.
     */
    public fun outputLocation(outputLocation: IResolvable)

    /**
     * @param outputLocation The location in Amazon S3 where the job writes its output.
     */
    public fun outputLocation(outputLocation: CfnJob.OutputLocationProperty)

    /**
     * @param outputLocation The location in Amazon S3 where the job writes its output.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df087322aa766b42aa701e0036bae9f7676f6889f2d8569f4285399c6547e537")
    public fun outputLocation(outputLocation: CfnJob.OutputLocationProperty.Builder.() -> Unit)

    /**
     * @param outputs One or more artifacts that represent output from running the job.
     */
    public fun outputs(outputs: IResolvable)

    /**
     * @param outputs One or more artifacts that represent output from running the job.
     */
    public fun outputs(outputs: List<Any>)

    /**
     * @param outputs One or more artifacts that represent output from running the job.
     */
    public fun outputs(vararg outputs: Any)

    /**
     * @param profileConfiguration Configuration for profile jobs.
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     */
    public fun profileConfiguration(profileConfiguration: IResolvable)

    /**
     * @param profileConfiguration Configuration for profile jobs.
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     */
    public fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty)

    /**
     * @param profileConfiguration Configuration for profile jobs.
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("335717258b03c27bd4865c484d038e2c5bda2ca4ca6a135fdca92216095e1e5e")
    public
        fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty.Builder.() -> Unit)

    /**
     * @param projectName The name of the project that the job is associated with.
     */
    public fun projectName(projectName: String)

    /**
     * @param recipe A series of data transformation steps that the job runs.
     */
    public fun recipe(recipe: IResolvable)

    /**
     * @param recipe A series of data transformation steps that the job runs.
     */
    public fun recipe(recipe: CfnJob.RecipeProperty)

    /**
     * @param recipe A series of data transformation steps that the job runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("137fa23d86816e19b72673bd9db975fdc5048b0a74c828cd2693f3c570049c95")
    public fun recipe(recipe: CfnJob.RecipeProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role to be assumed for this job. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags Metadata tags that have been applied to the job.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata tags that have been applied to the job.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeout The job's timeout in minutes.
     * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
     */
    public fun timeout(timeout: Number)

    /**
     * @param type The job type of the job, which must be one of the following:. 
     * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data
     * distribution, and more.
     * * `RECIPE` - A job to apply one or more transformations to a dataset.
     */
    public fun type(type: String)

    /**
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job.
     */
    public fun validationConfigurations(validationConfigurations: IResolvable)

    /**
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job.
     */
    public fun validationConfigurations(validationConfigurations: List<Any>)

    /**
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job.
     */
    public fun validationConfigurations(vararg validationConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJobProps.Builder =
        software.amazon.awscdk.services.databrew.CfnJobProps.builder()

    /**
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job.
     */
    override fun dataCatalogOutputs(dataCatalogOutputs: IResolvable) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job.
     */
    override fun dataCatalogOutputs(dataCatalogOutputs: List<Any>) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog
     * output from running the job.
     */
    override fun dataCatalogOutputs(vararg dataCatalogOutputs: Any): Unit =
        dataCatalogOutputs(dataCatalogOutputs.toList())

    /**
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into.
     */
    override fun databaseOutputs(databaseOutputs: IResolvable) {
      cdkBuilder.databaseOutputs(databaseOutputs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into.
     */
    override fun databaseOutputs(databaseOutputs: List<Any>) {
      cdkBuilder.databaseOutputs(databaseOutputs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param databaseOutputs Represents a list of JDBC database output objects which defines the
     * output destination for a DataBrew recipe job to write into.
     */
    override fun databaseOutputs(vararg databaseOutputs: Any): Unit =
        databaseOutputs(databaseOutputs.toList())

    /**
     * @param datasetName A dataset that the job is to process.
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * @param encryptionKeyArn The Amazon Resource Name (ARN) of an encryption key that is used to
     * protect the job output.
     * For more information, see [Encrypting data written by DataBrew
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param encryptionMode The encryption mode for the job, which can be one of the following:.
     * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
     * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
     */
    override fun encryptionMode(encryptionMode: String) {
      cdkBuilder.encryptionMode(encryptionMode)
    }

    /**
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run.
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     */
    override fun jobSample(jobSample: IResolvable) {
      cdkBuilder.jobSample(jobSample.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run.
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     */
    override fun jobSample(jobSample: CfnJob.JobSampleProperty) {
      cdkBuilder.jobSample(jobSample.let(CfnJob.JobSampleProperty.Companion::unwrap))
    }

    /**
     * @param jobSample A sample configuration for profile jobs only, which determines the number of
     * rows on which the profile job is run.
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb2dc01320ade4b6c74e4110f765b2f7580dead6c23cd512e358c81fa84cb30f")
    override fun jobSample(jobSample: CfnJob.JobSampleProperty.Builder.() -> Unit): Unit =
        jobSample(CfnJob.JobSampleProperty(jobSample))

    /**
     * @param logSubscription The current status of Amazon CloudWatch logging for the job.
     */
    override fun logSubscription(logSubscription: String) {
      cdkBuilder.logSubscription(logSubscription)
    }

    /**
     * @param maxCapacity The maximum number of nodes that can be consumed when the job processes
     * data.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param maxRetries The maximum number of times to retry the job after a job run fails.
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * @param name The unique name of the job. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputLocation The location in Amazon S3 where the job writes its output.
     */
    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputLocation The location in Amazon S3 where the job writes its output.
     */
    override fun outputLocation(outputLocation: CfnJob.OutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(CfnJob.OutputLocationProperty.Companion::unwrap))
    }

    /**
     * @param outputLocation The location in Amazon S3 where the job writes its output.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df087322aa766b42aa701e0036bae9f7676f6889f2d8569f4285399c6547e537")
    override fun outputLocation(outputLocation: CfnJob.OutputLocationProperty.Builder.() -> Unit):
        Unit = outputLocation(CfnJob.OutputLocationProperty(outputLocation))

    /**
     * @param outputs One or more artifacts that represent output from running the job.
     */
    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputs One or more artifacts that represent output from running the job.
     */
    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param outputs One or more artifacts that represent output from running the job.
     */
    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    /**
     * @param profileConfiguration Configuration for profile jobs.
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     */
    override fun profileConfiguration(profileConfiguration: IResolvable) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param profileConfiguration Configuration for profile jobs.
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     */
    override fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(CfnJob.ProfileConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param profileConfiguration Configuration for profile jobs.
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("335717258b03c27bd4865c484d038e2c5bda2ca4ca6a135fdca92216095e1e5e")
    override
        fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty.Builder.() -> Unit):
        Unit = profileConfiguration(CfnJob.ProfileConfigurationProperty(profileConfiguration))

    /**
     * @param projectName The name of the project that the job is associated with.
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param recipe A series of data transformation steps that the job runs.
     */
    override fun recipe(recipe: IResolvable) {
      cdkBuilder.recipe(recipe.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param recipe A series of data transformation steps that the job runs.
     */
    override fun recipe(recipe: CfnJob.RecipeProperty) {
      cdkBuilder.recipe(recipe.let(CfnJob.RecipeProperty.Companion::unwrap))
    }

    /**
     * @param recipe A series of data transformation steps that the job runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("137fa23d86816e19b72673bd9db975fdc5048b0a74c828cd2693f3c570049c95")
    override fun recipe(recipe: CfnJob.RecipeProperty.Builder.() -> Unit): Unit =
        recipe(CfnJob.RecipeProperty(recipe))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role to be assumed for this job. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags Metadata tags that have been applied to the job.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata tags that have been applied to the job.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeout The job's timeout in minutes.
     * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * @param type The job type of the job, which must be one of the following:. 
     * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data
     * distribution, and more.
     * * `RECIPE` - A job to apply one or more transformations to a dataset.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job.
     */
    override fun validationConfigurations(validationConfigurations: IResolvable) {
      cdkBuilder.validationConfigurations(validationConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job.
     */
    override fun validationConfigurations(validationConfigurations: List<Any>) {
      cdkBuilder.validationConfigurations(validationConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param validationConfigurations List of validation configurations that are applied to the
     * profile job.
     */
    override fun validationConfigurations(vararg validationConfigurations: Any): Unit =
        validationConfigurations(validationConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnJobProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.databrew.CfnJobProps,
  ) : CdkObject(cdkObject), CfnJobProps {
    /**
     * One or more artifacts that represent the AWS Glue Data Catalog output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datacatalogoutputs)
     */
    override fun dataCatalogOutputs(): Any? = unwrap(this).getDataCatalogOutputs()

    /**
     * Represents a list of JDBC database output objects which defines the output destination for a
     * DataBrew recipe job to write into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-databaseoutputs)
     */
    override fun databaseOutputs(): Any? = unwrap(this).getDatabaseOutputs()

    /**
     * A dataset that the job is to process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-datasetname)
     */
    override fun datasetName(): String? = unwrap(this).getDatasetName()

    /**
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output.
     *
     * For more information, see [Encrypting data written by DataBrew
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionkeyarn)
     */
    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * The encryption mode for the job, which can be one of the following:.
     *
     * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
     * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-encryptionmode)
     */
    override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default value is used. The default value is
     * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-jobsample)
     */
    override fun jobSample(): Any? = unwrap(this).getJobSample()

    /**
     * The current status of Amazon CloudWatch logging for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-logsubscription)
     */
    override fun logSubscription(): String? = unwrap(this).getLogSubscription()

    /**
     * The maximum number of nodes that can be consumed when the job processes data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxcapacity)
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The maximum number of times to retry the job after a job run fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-maxretries)
     */
    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    /**
     * The unique name of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The location in Amazon S3 where the job writes its output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputlocation)
     */
    override fun outputLocation(): Any? = unwrap(this).getOutputLocation()

    /**
     * One or more artifacts that represent output from running the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-outputs)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings to
     * all supported columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-profileconfiguration)
     */
    override fun profileConfiguration(): Any? = unwrap(this).getProfileConfiguration()

    /**
     * The name of the project that the job is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-projectname)
     */
    override fun projectName(): String? = unwrap(this).getProjectName()

    /**
     * A series of data transformation steps that the job runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-recipe)
     */
    override fun recipe(): Any? = unwrap(this).getRecipe()

    /**
     * The Amazon Resource Name (ARN) of the role to be assumed for this job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Metadata tags that have been applied to the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The job's timeout in minutes.
     *
     * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-timeout)
     */
    override fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * The job type of the job, which must be one of the following:.
     *
     * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data
     * distribution, and more.
     * * `RECIPE` - A job to apply one or more transformations to a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * List of validation configurations that are applied to the profile job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html#cfn-databrew-job-validationconfigurations)
     */
    override fun validationConfigurations(): Any? = unwrap(this).getValidationConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJobProps): CfnJobProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnJobProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobProps): software.amazon.awscdk.services.databrew.CfnJobProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnJobProps
  }
}
