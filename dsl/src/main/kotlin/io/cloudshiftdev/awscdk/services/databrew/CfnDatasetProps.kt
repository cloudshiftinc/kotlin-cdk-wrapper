package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDatasetProps {
  /**
   * The file format of a dataset that is created from an Amazon S3 file or folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-format)
   */
  public fun format(): String? = unwrap(this).getFormat()

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
   */
  public fun formatOptions(): Any? = unwrap(this).getFormatOptions()

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
   */
  public fun input(): Any

  /**
   * The unique name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-name)
   */
  public fun name(): String

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
   */
  public fun pathOptions(): Any? = unwrap(this).getPathOptions()

  /**
   * Metadata tags that have been applied to the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatasetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param format The file format of a dataset that is created from an Amazon S3 file or folder.
     */
    public fun format(format: String)

    /**
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset.
     */
    public fun formatOptions(formatOptions: IResolvable)

    /**
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset.
     */
    public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty)

    /**
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4deaca63807d44b4c625ffd9c847ac5ca86181d42412bd3e9c47e0d97f735d0")
    public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty.Builder.() -> Unit)

    /**
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    public fun input(input: IResolvable)

    /**
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    public fun input(input: CfnDataset.InputProperty)

    /**
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f013cf1ecace500063a17f672e3caead05eaf780a680a2d87630a7ffaf3ce5ed")
    public fun input(input: CfnDataset.InputProperty.Builder.() -> Unit)

    /**
     * @param name The unique name of the dataset. 
     */
    public fun name(name: String)

    /**
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset.
     */
    public fun pathOptions(pathOptions: IResolvable)

    /**
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset.
     */
    public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty)

    /**
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5dd025b80104e8acc63e6144c3bdb40a4e3581dff482613280a7ee4078dea7")
    public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata tags that have been applied to the dataset.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata tags that have been applied to the dataset.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.databrew.CfnDatasetProps.builder()

    /**
     * @param format The file format of a dataset that is created from an Amazon S3 file or folder.
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset.
     */
    override fun formatOptions(formatOptions: IResolvable) {
      cdkBuilder.formatOptions(formatOptions.let(IResolvable::unwrap))
    }

    /**
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset.
     */
    override fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty) {
      cdkBuilder.formatOptions(formatOptions.let(CfnDataset.FormatOptionsProperty::unwrap))
    }

    /**
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4deaca63807d44b4c625ffd9c847ac5ca86181d42412bd3e9c47e0d97f735d0")
    override fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty.Builder.() -> Unit):
        Unit = formatOptions(CfnDataset.FormatOptionsProperty(formatOptions))

    /**
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    override fun input(input: IResolvable) {
      cdkBuilder.input(input.let(IResolvable::unwrap))
    }

    /**
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    override fun input(input: CfnDataset.InputProperty) {
      cdkBuilder.input(input.let(CfnDataset.InputProperty::unwrap))
    }

    /**
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f013cf1ecace500063a17f672e3caead05eaf780a680a2d87630a7ffaf3ce5ed")
    override fun input(input: CfnDataset.InputProperty.Builder.() -> Unit): Unit =
        input(CfnDataset.InputProperty(input))

    /**
     * @param name The unique name of the dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset.
     */
    override fun pathOptions(pathOptions: IResolvable) {
      cdkBuilder.pathOptions(pathOptions.let(IResolvable::unwrap))
    }

    /**
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset.
     */
    override fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty) {
      cdkBuilder.pathOptions(pathOptions.let(CfnDataset.PathOptionsProperty::unwrap))
    }

    /**
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5dd025b80104e8acc63e6144c3bdb40a4e3581dff482613280a7ee4078dea7")
    override fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty.Builder.() -> Unit): Unit =
        pathOptions(CfnDataset.PathOptionsProperty(pathOptions))

    /**
     * @param tags Metadata tags that have been applied to the dataset.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata tags that have been applied to the dataset.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    /**
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-format)
     */
    override fun format(): String? = unwrap(this).getFormat()

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     */
    override fun formatOptions(): Any? = unwrap(this).getFormatOptions()

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     */
    override fun input(): Any = unwrap(this).getInput()

    /**
     * The unique name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     */
    override fun pathOptions(): Any? = unwrap(this).getPathOptions()

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDatasetProps):
        CfnDatasetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.databrew.CfnDatasetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnDatasetProps
  }
}
