@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnJobProps

/**
 * Properties for defining a `CfnJob`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
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
@CdkDslMarker
public class CfnJobPropsDsl {
  private val cdkBuilder: CfnJobProps.Builder = CfnJobProps.builder()

  private val _dataCatalogOutputs: MutableList<Any> = mutableListOf()

  private val _databaseOutputs: MutableList<Any> = mutableListOf()

  private val _outputs: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _validationConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog output
   * from running the job.
   */
  public fun dataCatalogOutputs(vararg dataCatalogOutputs: Any) {
    _dataCatalogOutputs.addAll(listOf(*dataCatalogOutputs))
  }

  /**
   * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog output
   * from running the job.
   */
  public fun dataCatalogOutputs(dataCatalogOutputs: Collection<Any>) {
    _dataCatalogOutputs.addAll(dataCatalogOutputs)
  }

  /**
   * @param dataCatalogOutputs One or more artifacts that represent the AWS Glue Data Catalog output
   * from running the job.
   */
  public fun dataCatalogOutputs(dataCatalogOutputs: IResolvable) {
    cdkBuilder.dataCatalogOutputs(dataCatalogOutputs)
  }

  /**
   * @param databaseOutputs Represents a list of JDBC database output objects which defines the
   * output destination for a DataBrew recipe job to write into.
   */
  public fun databaseOutputs(vararg databaseOutputs: Any) {
    _databaseOutputs.addAll(listOf(*databaseOutputs))
  }

  /**
   * @param databaseOutputs Represents a list of JDBC database output objects which defines the
   * output destination for a DataBrew recipe job to write into.
   */
  public fun databaseOutputs(databaseOutputs: Collection<Any>) {
    _databaseOutputs.addAll(databaseOutputs)
  }

  /**
   * @param databaseOutputs Represents a list of JDBC database output objects which defines the
   * output destination for a DataBrew recipe job to write into.
   */
  public fun databaseOutputs(databaseOutputs: IResolvable) {
    cdkBuilder.databaseOutputs(databaseOutputs)
  }

  /**
   * @param datasetName A dataset that the job is to process.
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  /**
   * @param encryptionKeyArn The Amazon Resource Name (ARN) of an encryption key that is used to
   * protect the job output.
   * For more information, see [Encrypting data written by DataBrew
   * jobs](https://docs.aws.amazon.com/databrew/latest/dg/encryption-security-configuration.html)
   */
  public fun encryptionKeyArn(encryptionKeyArn: String) {
    cdkBuilder.encryptionKeyArn(encryptionKeyArn)
  }

  /**
   * @param encryptionMode The encryption mode for the job, which can be one of the following:.
   * * `SSE-KMS` - Server-side encryption with keys managed by AWS KMS .
   * * `SSE-S3` - Server-side encryption with keys managed by Amazon S3.
   */
  public fun encryptionMode(encryptionMode: String) {
    cdkBuilder.encryptionMode(encryptionMode)
  }

  /**
   * @param jobSample A sample configuration for profile jobs only, which determines the number of
   * rows on which the profile job is run.
   * If a `JobSample` value isn't provided, the default value is used. The default value is
   * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
   */
  public fun jobSample(jobSample: IResolvable) {
    cdkBuilder.jobSample(jobSample)
  }

  /**
   * @param jobSample A sample configuration for profile jobs only, which determines the number of
   * rows on which the profile job is run.
   * If a `JobSample` value isn't provided, the default value is used. The default value is
   * CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
   */
  public fun jobSample(jobSample: CfnJob.JobSampleProperty) {
    cdkBuilder.jobSample(jobSample)
  }

  /**
   * @param logSubscription The current status of Amazon CloudWatch logging for the job.
   */
  public fun logSubscription(logSubscription: String) {
    cdkBuilder.logSubscription(logSubscription)
  }

  /**
   * @param maxCapacity The maximum number of nodes that can be consumed when the job processes
   * data.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param maxRetries The maximum number of times to retry the job after a job run fails.
   */
  public fun maxRetries(maxRetries: Number) {
    cdkBuilder.maxRetries(maxRetries)
  }

  /**
   * @param name The unique name of the job. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param outputLocation Output location.
   */
  public fun outputLocation(outputLocation: IResolvable) {
    cdkBuilder.outputLocation(outputLocation)
  }

  /**
   * @param outputLocation Output location.
   */
  public fun outputLocation(outputLocation: CfnJob.OutputLocationProperty) {
    cdkBuilder.outputLocation(outputLocation)
  }

  /**
   * @param outputs One or more artifacts that represent output from running the job.
   */
  public fun outputs(vararg outputs: Any) {
    _outputs.addAll(listOf(*outputs))
  }

  /**
   * @param outputs One or more artifacts that represent output from running the job.
   */
  public fun outputs(outputs: Collection<Any>) {
    _outputs.addAll(outputs)
  }

  /**
   * @param outputs One or more artifacts that represent output from running the job.
   */
  public fun outputs(outputs: IResolvable) {
    cdkBuilder.outputs(outputs)
  }

  /**
   * @param profileConfiguration Configuration for profile jobs.
   * Configuration can be used to select columns, do evaluations, and override default parameters of
   * evaluations. When configuration is undefined, the profile job will apply default settings to all
   * supported columns.
   */
  public fun profileConfiguration(profileConfiguration: IResolvable) {
    cdkBuilder.profileConfiguration(profileConfiguration)
  }

  /**
   * @param profileConfiguration Configuration for profile jobs.
   * Configuration can be used to select columns, do evaluations, and override default parameters of
   * evaluations. When configuration is undefined, the profile job will apply default settings to all
   * supported columns.
   */
  public fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty) {
    cdkBuilder.profileConfiguration(profileConfiguration)
  }

  /**
   * @param projectName The name of the project that the job is associated with.
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  /**
   * @param recipe A series of data transformation steps that the job runs.
   */
  public fun recipe(recipe: IResolvable) {
    cdkBuilder.recipe(recipe)
  }

  /**
   * @param recipe A series of data transformation steps that the job runs.
   */
  public fun recipe(recipe: CfnJob.RecipeProperty) {
    cdkBuilder.recipe(recipe)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role to be assumed for this job. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tags Metadata tags that have been applied to the job.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata tags that have been applied to the job.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param timeout The job's timeout in minutes.
   * A job that attempts to run longer than this timeout period ends with a status of `TIMEOUT` .
   */
  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param type The job type of the job, which must be one of the following:. 
   * * `PROFILE` - A job to analyze a dataset, to determine its size, data types, data distribution,
   * and more.
   * * `RECIPE` - A job to apply one or more transformations to a dataset.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param validationConfigurations List of validation configurations that are applied to the
   * profile job.
   */
  public fun validationConfigurations(vararg validationConfigurations: Any) {
    _validationConfigurations.addAll(listOf(*validationConfigurations))
  }

  /**
   * @param validationConfigurations List of validation configurations that are applied to the
   * profile job.
   */
  public fun validationConfigurations(validationConfigurations: Collection<Any>) {
    _validationConfigurations.addAll(validationConfigurations)
  }

  /**
   * @param validationConfigurations List of validation configurations that are applied to the
   * profile job.
   */
  public fun validationConfigurations(validationConfigurations: IResolvable) {
    cdkBuilder.validationConfigurations(validationConfigurations)
  }

  public fun build(): CfnJobProps {
    if(_dataCatalogOutputs.isNotEmpty()) cdkBuilder.dataCatalogOutputs(_dataCatalogOutputs)
    if(_databaseOutputs.isNotEmpty()) cdkBuilder.databaseOutputs(_databaseOutputs)
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_validationConfigurations.isNotEmpty())
        cdkBuilder.validationConfigurations(_validationConfigurations)
    return cdkBuilder.build()
  }
}
