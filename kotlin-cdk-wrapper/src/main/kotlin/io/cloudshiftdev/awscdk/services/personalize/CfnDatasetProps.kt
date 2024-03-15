@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.personalize.*;
 * Object dataSource;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
 * .datasetGroupArn("datasetGroupArn")
 * .datasetType("datasetType")
 * .name("name")
 * .schemaArn("schemaArn")
 * // the properties below are optional
 * .datasetImportJob(DatasetImportJobProperty.builder()
 * .datasetArn("datasetArn")
 * .datasetImportJobArn("datasetImportJobArn")
 * .dataSource(dataSource)
 * .jobName("jobName")
 * .roleArn("roleArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html)
 */
public interface CfnDatasetProps {
  /**
   * The Amazon Resource Name (ARN) of the dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetgrouparn)
   */
  public fun datasetGroupArn(): String

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   *
   * If you specify a dataset import job as part of a dataset, all dataset import job fields are
   * required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
   */
  public fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

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
   */
  public fun datasetType(): String

  /**
   * The name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-name)
   */
  public fun name(): String

  /**
   * The ARN of the associated schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-schemaarn)
   */
  public fun schemaArn(): String

  /**
   * A builder for [CfnDatasetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group. 
     */
    public fun datasetGroupArn(datasetGroupArn: String)

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset.
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     */
    public fun datasetImportJob(datasetImportJob: IResolvable)

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset.
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     */
    public fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty)

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset.
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3997818a8fb3ba48d3370b7fa4764b9e963288673819859cba7b028bc9fd6625")
    public
        fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty.Builder.() -> Unit)

    /**
     * @param datasetType One of the following values:. 
     * * Interactions
     * * Items
     * * Users
     * * Actions
     * * Action_Interactions
     */
    public fun datasetType(datasetType: String)

    /**
     * @param name The name of the dataset. 
     */
    public fun name(name: String)

    /**
     * @param schemaArn The ARN of the associated schema. 
     */
    public fun schemaArn(schemaArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.personalize.CfnDatasetProps.builder()

    /**
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group. 
     */
    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset.
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     */
    override fun datasetImportJob(datasetImportJob: IResolvable) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(IResolvable::unwrap))
    }

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset.
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     */
    override fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(CfnDataset.DatasetImportJobProperty::unwrap))
    }

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     * S3 bucket) to an Amazon Personalize dataset.
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3997818a8fb3ba48d3370b7fa4764b9e963288673819859cba7b028bc9fd6625")
    override
        fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty.Builder.() -> Unit):
        Unit = datasetImportJob(CfnDataset.DatasetImportJobProperty(datasetImportJob))

    /**
     * @param datasetType One of the following values:. 
     * * Interactions
     * * Items
     * * Users
     * * Actions
     * * Action_Interactions
     */
    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    /**
     * @param name The name of the dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schemaArn The ARN of the associated schema. 
     */
    override fun schemaArn(schemaArn: String) {
      cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    /**
     * The Amazon Resource Name (ARN) of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetgrouparn)
     */
    override fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

    /**
     * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
     * Personalize dataset.
     *
     * If you specify a dataset import job as part of a dataset, all dataset import job fields are
     * required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
     */
    override fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

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
     */
    override fun datasetType(): String = unwrap(this).getDatasetType()

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN of the associated schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-schemaarn)
     */
    override fun schemaArn(): String = unwrap(this).getSchemaArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetProps):
        CfnDatasetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.personalize.CfnDatasetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnDatasetProps
  }
}
