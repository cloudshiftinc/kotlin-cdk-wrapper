package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.personalize.CfnDataset,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the dataset.
   */
  public open fun attrDatasetArn(): String = unwrap(this).getAttrDatasetArn()

  /**
   * The Amazon Resource Name (ARN) of the dataset group.
   */
  public open fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

  /**
   * The Amazon Resource Name (ARN) of the dataset group.
   */
  public open fun datasetGroupArn(`value`: String) {
    unwrap(this).setDatasetGroupArn(`value`)
  }

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   */
  public open fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   */
  public open fun datasetImportJob(`value`: IResolvable) {
    unwrap(this).setDatasetImportJob(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   */
  public open fun datasetImportJob(`value`: DatasetImportJobProperty) {
    unwrap(this).setDatasetImportJob(`value`.let(DatasetImportJobProperty::unwrap))
  }

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f15d07ac00955cce01882cc4201ca99e654195c75998b1ea270ffb9363fcfd8")
  public open fun datasetImportJob(`value`: DatasetImportJobProperty.Builder.() -> Unit): Unit =
      datasetImportJob(DatasetImportJobProperty(`value`))

  /**
   * One of the following values:.
   */
  public open fun datasetType(): String = unwrap(this).getDatasetType()

  /**
   * One of the following values:.
   */
  public open fun datasetType(`value`: String) {
    unwrap(this).setDatasetType(`value`)
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
   * The name of the dataset.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the dataset.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the associated schema.
   */
  public open fun schemaArn(): String = unwrap(this).getSchemaArn()

  /**
   * The ARN of the associated schema.
   */
  public open fun schemaArn(`value`: String) {
    unwrap(this).setSchemaArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.personalize.CfnDataset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetgrouparn)
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group. 
     */
    public fun datasetGroupArn(datasetGroupArn: String)

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset. 
     */
    public fun datasetImportJob(datasetImportJob: IResolvable)

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset. 
     */
    public fun datasetImportJob(datasetImportJob: DatasetImportJobProperty)

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00047c50505b44a350b3b5aa2091fd9d26178e854fdd5befa5ed5863515933a6")
    public fun datasetImportJob(datasetImportJob: DatasetImportJobProperty.Builder.() -> Unit)

    /**
     * One of the following values:.
     *
     * * Interactions
     * * Items
     * * Users
     * * Actions
     * * Action_Interactions
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasettype)
     * @param datasetType One of the following values:. 
     */
    public fun datasetType(datasetType: String)

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-name)
     * @param name The name of the dataset. 
     */
    public fun name(name: String)

    /**
     * The ARN of the associated schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-schemaarn)
     * @param schemaArn The ARN of the associated schema. 
     */
    public fun schemaArn(schemaArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDataset.Builder =
        software.amazon.awscdk.services.personalize.CfnDataset.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetgrouparn)
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group. 
     */
    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset. 
     */
    override fun datasetImportJob(datasetImportJob: IResolvable) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(IResolvable::unwrap))
    }

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset. 
     */
    override fun datasetImportJob(datasetImportJob: DatasetImportJobProperty) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(DatasetImportJobProperty::unwrap))
    }

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00047c50505b44a350b3b5aa2091fd9d26178e854fdd5befa5ed5863515933a6")
    override fun datasetImportJob(datasetImportJob: DatasetImportJobProperty.Builder.() -> Unit):
        Unit = datasetImportJob(DatasetImportJobProperty(datasetImportJob))

    /**
     * One of the following values:.
     *
     * * Interactions
     * * Items
     * * Users
     * * Actions
     * * Action_Interactions
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasettype)
     * @param datasetType One of the following values:. 
     */
    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-name)
     * @param name The name of the dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the associated schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-schemaarn)
     * @param schemaArn The ARN of the associated schema. 
     */
    override fun schemaArn(schemaArn: String) {
      cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.personalize.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset): CfnDataset
        = CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.personalize.CfnDataset
        = wrapped.cdkObject
  }

  public interface DataSourceProperty {
    /**
     * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is
     * stored.
     *
     * For example:
     *
     * `s3://bucket-name/folder-name/`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasource.html#cfn-personalize-dataset-datasource-datalocation)
     */
    public fun dataLocation(): String? = unwrap(this).getDataLocation()

    /**
     * A builder for [DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataLocation The path to the Amazon S3 bucket where the data that you want to upload
       * to your dataset is stored.
       * For example:
       *
       * `s3://bucket-name/folder-name/`
       */
      public fun dataLocation(dataLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty.builder()

      /**
       * @param dataLocation The path to the Amazon S3 bucket where the data that you want to upload
       * to your dataset is stored.
       * For example:
       *
       * `s3://bucket-name/folder-name/`
       */
      override fun dataLocation(dataLocation: String) {
        cdkBuilder.dataLocation(dataLocation)
      }

      public fun build(): software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty,
    ) : CdkObject(cdkObject), DataSourceProperty {
      /**
       * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is
       * stored.
       *
       * For example:
       *
       * `s3://bucket-name/folder-name/`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasource.html#cfn-personalize-dataset-datasource-datalocation)
       */
      override fun dataLocation(): String? = unwrap(this).getDataLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty):
          DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty
    }
  }

  public interface DatasetImportJobProperty {
    /**
     * The Amazon S3 bucket that contains the training data to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-datasource)
     */
    public fun dataSource(): Any? = unwrap(this).getDataSource()

    /**
     * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-datasetarn)
     */
    public fun datasetArn(): String? = unwrap(this).getDatasetArn()

    /**
     * The ARN of the dataset import job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-datasetimportjobarn)
     */
    public fun datasetImportJobArn(): String? = unwrap(this).getDatasetImportJobArn()

    /**
     * The name of the import job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-jobname)
     */
    public fun jobName(): String? = unwrap(this).getJobName()

    /**
     * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [DatasetImportJobProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSource The Amazon S3 bucket that contains the training data to import.
       */
      public fun dataSource(dataSource: Any)

      /**
       * @param datasetArn The Amazon Resource Name (ARN) of the dataset that receives the imported
       * data.
       */
      public fun datasetArn(datasetArn: String)

      /**
       * @param datasetImportJobArn The ARN of the dataset import job.
       */
      public fun datasetImportJobArn(datasetImportJobArn: String)

      /**
       * @param jobName The name of the import job.
       */
      public fun jobName(jobName: String)

      /**
       * @param roleArn The ARN of the IAM role that has permissions to read from the Amazon S3 data
       * source.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty.builder()

      /**
       * @param dataSource The Amazon S3 bucket that contains the training data to import.
       */
      override fun dataSource(dataSource: Any) {
        cdkBuilder.dataSource(dataSource)
      }

      /**
       * @param datasetArn The Amazon Resource Name (ARN) of the dataset that receives the imported
       * data.
       */
      override fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
      }

      /**
       * @param datasetImportJobArn The ARN of the dataset import job.
       */
      override fun datasetImportJobArn(datasetImportJobArn: String) {
        cdkBuilder.datasetImportJobArn(datasetImportJobArn)
      }

      /**
       * @param jobName The name of the import job.
       */
      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      /**
       * @param roleArn The ARN of the IAM role that has permissions to read from the Amazon S3 data
       * source.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty,
    ) : CdkObject(cdkObject), DatasetImportJobProperty {
      /**
       * The Amazon S3 bucket that contains the training data to import.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-datasource)
       */
      override fun dataSource(): Any? = unwrap(this).getDataSource()

      /**
       * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-datasetarn)
       */
      override fun datasetArn(): String? = unwrap(this).getDatasetArn()

      /**
       * The ARN of the dataset import job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-datasetimportjobarn)
       */
      override fun datasetImportJobArn(): String? = unwrap(this).getDatasetImportJobArn()

      /**
       * The name of the import job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-jobname)
       */
      override fun jobName(): String? = unwrap(this).getJobName()

      /**
       * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html#cfn-personalize-dataset-datasetimportjob-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetImportJobProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty):
          DatasetImportJobProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetImportJobProperty):
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty
    }
  }
}
