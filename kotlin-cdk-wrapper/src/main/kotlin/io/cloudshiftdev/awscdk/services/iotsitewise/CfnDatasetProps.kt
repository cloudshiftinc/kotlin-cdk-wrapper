@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
 * .datasetName("datasetName")
 * .datasetSource(DatasetSourceProperty.builder()
 * .sourceFormat("sourceFormat")
 * .sourceType("sourceType")
 * // the properties below are optional
 * .sourceDetail(SourceDetailProperty.builder()
 * .kendra(KendraSourceDetailProperty.builder()
 * .knowledgeBaseArn("knowledgeBaseArn")
 * .roleArn("roleArn")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .datasetDescription("datasetDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html)
 */
public interface CfnDatasetProps {
  /**
   * A description about the dataset, and its functionality.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetdescription)
   */
  public fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

  /**
   * The name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetname)
   */
  public fun datasetName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
   */
  public fun datasetSource(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatasetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datasetDescription A description about the dataset, and its functionality.
     */
    public fun datasetDescription(datasetDescription: String)

    /**
     * @param datasetName The name of the dataset. 
     */
    public fun datasetName(datasetName: String)

    /**
     * @param datasetSource the value to be set. 
     */
    public fun datasetSource(datasetSource: IResolvable)

    /**
     * @param datasetSource the value to be set. 
     */
    public fun datasetSource(datasetSource: CfnDataset.DatasetSourceProperty)

    /**
     * @param datasetSource the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b380a8b9f325da7d560381d743a6601ce411bcb61e51fb3a10188ac35e58d1b2")
    public fun datasetSource(datasetSource: CfnDataset.DatasetSourceProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnDatasetProps.builder()

    /**
     * @param datasetDescription A description about the dataset, and its functionality.
     */
    override fun datasetDescription(datasetDescription: String) {
      cdkBuilder.datasetDescription(datasetDescription)
    }

    /**
     * @param datasetName The name of the dataset. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * @param datasetSource the value to be set. 
     */
    override fun datasetSource(datasetSource: IResolvable) {
      cdkBuilder.datasetSource(datasetSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param datasetSource the value to be set. 
     */
    override fun datasetSource(datasetSource: CfnDataset.DatasetSourceProperty) {
      cdkBuilder.datasetSource(datasetSource.let(CfnDataset.DatasetSourceProperty.Companion::unwrap))
    }

    /**
     * @param datasetSource the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b380a8b9f325da7d560381d743a6601ce411bcb61e51fb3a10188ac35e58d1b2")
    override fun datasetSource(datasetSource: CfnDataset.DatasetSourceProperty.Builder.() -> Unit):
        Unit = datasetSource(CfnDataset.DatasetSourceProperty(datasetSource))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDatasetProps,
  ) : CdkObject(cdkObject),
      CfnDatasetProps {
    /**
     * A description about the dataset, and its functionality.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetdescription)
     */
    override fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetname)
     */
    override fun datasetName(): String = unwrap(this).getDatasetName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     */
    override fun datasetSource(): Any = unwrap(this).getDatasetSource()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDatasetProps):
        CfnDatasetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDatasetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.iotsitewise.CfnDatasetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnDatasetProps
  }
}
