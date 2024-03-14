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

public interface CfnProjectProps {
  /**
   * The dataset that the project is to act upon.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-datasetname)
   */
  public fun datasetName(): String

  /**
   * The unique name of a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-name)
   */
  public fun name(): String

  /**
   * The name of a recipe that will be developed during a project session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-recipename)
   */
  public fun recipeName(): String

  /**
   * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-rolearn)
   */
  public fun roleArn(): String

  /**
   * The sample size and sampling type to apply to the data.
   *
   * If this parameter isn't specified, then the sample consists of the first 500 rows from the
   * dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
   */
  public fun sample(): Any? = unwrap(this).getSample()

  /**
   * Metadata tags that have been applied to the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datasetName The dataset that the project is to act upon. 
     */
    public fun datasetName(datasetName: String)

    /**
     * @param name The unique name of a project. 
     */
    public fun name(name: String)

    /**
     * @param recipeName The name of a recipe that will be developed during a project session. 
     */
    public fun recipeName(recipeName: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that will be assumed for this
     * project. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param sample The sample size and sampling type to apply to the data.
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     */
    public fun sample(sample: IResolvable)

    /**
     * @param sample The sample size and sampling type to apply to the data.
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     */
    public fun sample(sample: CfnProject.SampleProperty)

    /**
     * @param sample The sample size and sampling type to apply to the data.
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ddcbb306a3f411bd3d7f9e8e326b92b4003886f727115b5e262991874dd32a")
    public fun sample(sample: CfnProject.SampleProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata tags that have been applied to the project.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata tags that have been applied to the project.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnProjectProps.Builder =
        software.amazon.awscdk.services.databrew.CfnProjectProps.builder()

    /**
     * @param datasetName The dataset that the project is to act upon. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * @param name The unique name of a project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param recipeName The name of a recipe that will be developed during a project session. 
     */
    override fun recipeName(recipeName: String) {
      cdkBuilder.recipeName(recipeName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that will be assumed for this
     * project. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param sample The sample size and sampling type to apply to the data.
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     */
    override fun sample(sample: IResolvable) {
      cdkBuilder.sample(sample.let(IResolvable::unwrap))
    }

    /**
     * @param sample The sample size and sampling type to apply to the data.
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     */
    override fun sample(sample: CfnProject.SampleProperty) {
      cdkBuilder.sample(sample.let(CfnProject.SampleProperty::unwrap))
    }

    /**
     * @param sample The sample size and sampling type to apply to the data.
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ddcbb306a3f411bd3d7f9e8e326b92b4003886f727115b5e262991874dd32a")
    override fun sample(sample: CfnProject.SampleProperty.Builder.() -> Unit): Unit =
        sample(CfnProject.SampleProperty(sample))

    /**
     * @param tags Metadata tags that have been applied to the project.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata tags that have been applied to the project.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * The dataset that the project is to act upon.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-datasetname)
     */
    override fun datasetName(): String = unwrap(this).getDatasetName()

    /**
     * The unique name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The name of a recipe that will be developed during a project session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-recipename)
     */
    override fun recipeName(): String = unwrap(this).getRecipeName()

    /**
     * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The sample size and sampling type to apply to the data.
     *
     * If this parameter isn't specified, then the sample consists of the first 500 rows from the
     * dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
     */
    override fun sample(): Any? = unwrap(this).getSample()

    /**
     * Metadata tags that have been applied to the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.databrew.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnProjectProps
  }
}
