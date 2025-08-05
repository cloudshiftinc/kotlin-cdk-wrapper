@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource schema for AWS::IoTSiteWise::Dataset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
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
public open class CfnDataset(
  cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatasetProps,
  ) :
      this(software.amazon.awscdk.services.iotsitewise.CfnDataset(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDatasetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatasetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDatasetProps(props)
  )

  /**
   * The ARN of the dataset.
   */
  public open fun attrDatasetArn(): String = unwrap(this).getAttrDatasetArn()

  /**
   * The ID of the dataset.
   */
  public open fun attrDatasetId(): String = unwrap(this).getAttrDatasetId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description about the dataset, and its functionality.
   */
  public open fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

  /**
   * A description about the dataset, and its functionality.
   */
  public open fun datasetDescription(`value`: String) {
    unwrap(this).setDatasetDescription(`value`)
  }

  /**
   * The name of the dataset.
   */
  public open fun datasetName(): String = unwrap(this).getDatasetName()

  /**
   * The name of the dataset.
   */
  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  /**
   *
   */
  public open fun datasetSource(): Any = unwrap(this).getDatasetSource()

  /**
   *
   */
  public open fun datasetSource(`value`: IResolvable) {
    unwrap(this).setDatasetSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun datasetSource(`value`: DatasetSourceProperty) {
    unwrap(this).setDatasetSource(`value`.let(DatasetSourceProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("acbae35b99297f1730053d7c7afcb5e70fc2115aac9eca9893219484a11555ed")
  public open fun datasetSource(`value`: DatasetSourceProperty.Builder.() -> Unit): Unit =
      datasetSource(DatasetSourceProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnDataset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description about the dataset, and its functionality.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetdescription)
     * @param datasetDescription A description about the dataset, and its functionality. 
     */
    public fun datasetDescription(datasetDescription: String)

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetname)
     * @param datasetName The name of the dataset. 
     */
    public fun datasetName(datasetName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     * @param datasetSource 
     */
    public fun datasetSource(datasetSource: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     * @param datasetSource 
     */
    public fun datasetSource(datasetSource: DatasetSourceProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     * @param datasetSource 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5d0bf8ae77ac7a87482b916a01695b4875ca23e66a0225c7565e18bdce08bc8")
    public fun datasetSource(datasetSource: DatasetSourceProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnDataset.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnDataset.Builder.create(scope, id)

    /**
     * A description about the dataset, and its functionality.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetdescription)
     * @param datasetDescription A description about the dataset, and its functionality. 
     */
    override fun datasetDescription(datasetDescription: String) {
      cdkBuilder.datasetDescription(datasetDescription)
    }

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetname)
     * @param datasetName The name of the dataset. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     * @param datasetSource 
     */
    override fun datasetSource(datasetSource: IResolvable) {
      cdkBuilder.datasetSource(datasetSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     * @param datasetSource 
     */
    override fun datasetSource(datasetSource: DatasetSourceProperty) {
      cdkBuilder.datasetSource(datasetSource.let(DatasetSourceProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-datasetsource)
     * @param datasetSource 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5d0bf8ae77ac7a87482b916a01695b4875ca23e66a0225c7565e18bdce08bc8")
    override fun datasetSource(datasetSource: DatasetSourceProperty.Builder.() -> Unit): Unit =
        datasetSource(DatasetSourceProperty(datasetSource))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dataset.html#cfn-iotsitewise-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset): CfnDataset
        = CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.iotsitewise.CfnDataset
        = wrapped.cdkObject as software.amazon.awscdk.services.iotsitewise.CfnDataset
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * DatasetSourceProperty datasetSourceProperty = DatasetSourceProperty.builder()
   * .sourceFormat("sourceFormat")
   * .sourceType("sourceType")
   * // the properties below are optional
   * .sourceDetail(SourceDetailProperty.builder()
   * .kendra(KendraSourceDetailProperty.builder()
   * .knowledgeBaseArn("knowledgeBaseArn")
   * .roleArn("roleArn")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html)
   */
  public interface DatasetSourceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html#cfn-iotsitewise-dataset-datasetsource-sourcedetail)
     */
    public fun sourceDetail(): Any? = unwrap(this).getSourceDetail()

    /**
     * The format of the dataset source associated with the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html#cfn-iotsitewise-dataset-datasetsource-sourceformat)
     */
    public fun sourceFormat(): String

    /**
     * The type of data source for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html#cfn-iotsitewise-dataset-datasetsource-sourcetype)
     */
    public fun sourceType(): String

    /**
     * A builder for [DatasetSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceDetail the value to be set.
       */
      public fun sourceDetail(sourceDetail: IResolvable)

      /**
       * @param sourceDetail the value to be set.
       */
      public fun sourceDetail(sourceDetail: SourceDetailProperty)

      /**
       * @param sourceDetail the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebabc2507c6812825495db1a5413415d0dc6cb7f7def3f06ce757ca1779f5a56")
      public fun sourceDetail(sourceDetail: SourceDetailProperty.Builder.() -> Unit)

      /**
       * @param sourceFormat The format of the dataset source associated with the dataset. 
       */
      public fun sourceFormat(sourceFormat: String)

      /**
       * @param sourceType The type of data source for the dataset. 
       */
      public fun sourceType(sourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty.builder()

      /**
       * @param sourceDetail the value to be set.
       */
      override fun sourceDetail(sourceDetail: IResolvable) {
        cdkBuilder.sourceDetail(sourceDetail.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceDetail the value to be set.
       */
      override fun sourceDetail(sourceDetail: SourceDetailProperty) {
        cdkBuilder.sourceDetail(sourceDetail.let(SourceDetailProperty.Companion::unwrap))
      }

      /**
       * @param sourceDetail the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebabc2507c6812825495db1a5413415d0dc6cb7f7def3f06ce757ca1779f5a56")
      override fun sourceDetail(sourceDetail: SourceDetailProperty.Builder.() -> Unit): Unit =
          sourceDetail(SourceDetailProperty(sourceDetail))

      /**
       * @param sourceFormat The format of the dataset source associated with the dataset. 
       */
      override fun sourceFormat(sourceFormat: String) {
        cdkBuilder.sourceFormat(sourceFormat)
      }

      /**
       * @param sourceType The type of data source for the dataset. 
       */
      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty,
    ) : CdkObject(cdkObject),
        DatasetSourceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html#cfn-iotsitewise-dataset-datasetsource-sourcedetail)
       */
      override fun sourceDetail(): Any? = unwrap(this).getSourceDetail()

      /**
       * The format of the dataset source associated with the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html#cfn-iotsitewise-dataset-datasetsource-sourceformat)
       */
      override fun sourceFormat(): String = unwrap(this).getSourceFormat()

      /**
       * The type of data source for the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-datasetsource.html#cfn-iotsitewise-dataset-datasetsource-sourcetype)
       */
      override fun sourceType(): String = unwrap(this).getSourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty):
          DatasetSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DatasetSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetSourceProperty):
          software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnDataset.DatasetSourceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * KendraSourceDetailProperty kendraSourceDetailProperty = KendraSourceDetailProperty.builder()
   * .knowledgeBaseArn("knowledgeBaseArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-kendrasourcedetail.html)
   */
  public interface KendraSourceDetailProperty {
    /**
     * The knowledgeBaseArn details for the Kendra dataset source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-kendrasourcedetail.html#cfn-iotsitewise-dataset-kendrasourcedetail-knowledgebasearn)
     */
    public fun knowledgeBaseArn(): String

    /**
     * The roleARN details for the Kendra dataset source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-kendrasourcedetail.html#cfn-iotsitewise-dataset-kendrasourcedetail-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [KendraSourceDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param knowledgeBaseArn The knowledgeBaseArn details for the Kendra dataset source. 
       */
      public fun knowledgeBaseArn(knowledgeBaseArn: String)

      /**
       * @param roleArn The roleARN details for the Kendra dataset source. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty.builder()

      /**
       * @param knowledgeBaseArn The knowledgeBaseArn details for the Kendra dataset source. 
       */
      override fun knowledgeBaseArn(knowledgeBaseArn: String) {
        cdkBuilder.knowledgeBaseArn(knowledgeBaseArn)
      }

      /**
       * @param roleArn The roleARN details for the Kendra dataset source. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty,
    ) : CdkObject(cdkObject),
        KendraSourceDetailProperty {
      /**
       * The knowledgeBaseArn details for the Kendra dataset source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-kendrasourcedetail.html#cfn-iotsitewise-dataset-kendrasourcedetail-knowledgebasearn)
       */
      override fun knowledgeBaseArn(): String = unwrap(this).getKnowledgeBaseArn()

      /**
       * The roleARN details for the Kendra dataset source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-kendrasourcedetail.html#cfn-iotsitewise-dataset-kendrasourcedetail-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KendraSourceDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty):
          KendraSourceDetailProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KendraSourceDetailProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KendraSourceDetailProperty):
          software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnDataset.KendraSourceDetailProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * SourceDetailProperty sourceDetailProperty = SourceDetailProperty.builder()
   * .kendra(KendraSourceDetailProperty.builder()
   * .knowledgeBaseArn("knowledgeBaseArn")
   * .roleArn("roleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-sourcedetail.html)
   */
  public interface SourceDetailProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-sourcedetail.html#cfn-iotsitewise-dataset-sourcedetail-kendra)
     */
    public fun kendra(): Any? = unwrap(this).getKendra()

    /**
     * A builder for [SourceDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kendra the value to be set.
       */
      public fun kendra(kendra: IResolvable)

      /**
       * @param kendra the value to be set.
       */
      public fun kendra(kendra: KendraSourceDetailProperty)

      /**
       * @param kendra the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba48f73937fb9a551123d0295f4d722a5941513687042e96bf74e35648ca0794")
      public fun kendra(kendra: KendraSourceDetailProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty.builder()

      /**
       * @param kendra the value to be set.
       */
      override fun kendra(kendra: IResolvable) {
        cdkBuilder.kendra(kendra.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kendra the value to be set.
       */
      override fun kendra(kendra: KendraSourceDetailProperty) {
        cdkBuilder.kendra(kendra.let(KendraSourceDetailProperty.Companion::unwrap))
      }

      /**
       * @param kendra the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba48f73937fb9a551123d0295f4d722a5941513687042e96bf74e35648ca0794")
      override fun kendra(kendra: KendraSourceDetailProperty.Builder.() -> Unit): Unit =
          kendra(KendraSourceDetailProperty(kendra))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty,
    ) : CdkObject(cdkObject),
        SourceDetailProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-dataset-sourcedetail.html#cfn-iotsitewise-dataset-sourcedetail-kendra)
       */
      override fun kendra(): Any? = unwrap(this).getKendra()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty):
          SourceDetailProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceDetailProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDetailProperty):
          software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnDataset.SourceDetailProperty
    }
  }
}
