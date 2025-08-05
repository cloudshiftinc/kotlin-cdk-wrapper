@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new Amazon SageMaker AI Studio Lifecycle Configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnStudioLifecycleConfig cfnStudioLifecycleConfig = CfnStudioLifecycleConfig.Builder.create(this,
 * "MyCfnStudioLifecycleConfig")
 * .studioLifecycleConfigAppType("studioLifecycleConfigAppType")
 * .studioLifecycleConfigContent("studioLifecycleConfigContent")
 * .studioLifecycleConfigName("studioLifecycleConfigName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html)
 */
public open class CfnStudioLifecycleConfig(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioLifecycleConfigProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStudioLifecycleConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioLifecycleConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStudioLifecycleConfigProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the Lifecycle Configuration.
   */
  public open fun attrStudioLifecycleConfigArn(): String =
      unwrap(this).getAttrStudioLifecycleConfigArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The App type to which the Lifecycle Configuration is attached.
   */
  public open fun studioLifecycleConfigAppType(): String =
      unwrap(this).getStudioLifecycleConfigAppType()

  /**
   * The App type to which the Lifecycle Configuration is attached.
   */
  public open fun studioLifecycleConfigAppType(`value`: String) {
    unwrap(this).setStudioLifecycleConfigAppType(`value`)
  }

  /**
   * The content of your Amazon SageMaker Studio Lifecycle Configuration script.
   */
  public open fun studioLifecycleConfigContent(): String =
      unwrap(this).getStudioLifecycleConfigContent()

  /**
   * The content of your Amazon SageMaker Studio Lifecycle Configuration script.
   */
  public open fun studioLifecycleConfigContent(`value`: String) {
    unwrap(this).setStudioLifecycleConfigContent(`value`)
  }

  /**
   * The name of the Amazon SageMaker AI Studio Lifecycle Configuration.
   */
  public open fun studioLifecycleConfigName(): String = unwrap(this).getStudioLifecycleConfigName()

  /**
   * The name of the Amazon SageMaker AI Studio Lifecycle Configuration.
   */
  public open fun studioLifecycleConfigName(`value`: String) {
    unwrap(this).setStudioLifecycleConfigName(`value`)
  }

  /**
   * Tags to be associated with the Lifecycle Configuration.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to be associated with the Lifecycle Configuration.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to be associated with the Lifecycle Configuration.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnStudioLifecycleConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The App type to which the Lifecycle Configuration is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigapptype)
     * @param studioLifecycleConfigAppType The App type to which the Lifecycle Configuration is
     * attached. 
     */
    public fun studioLifecycleConfigAppType(studioLifecycleConfigAppType: String)

    /**
     * The content of your Amazon SageMaker Studio Lifecycle Configuration script.
     *
     * This content must be base64 encoded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigcontent)
     * @param studioLifecycleConfigContent The content of your Amazon SageMaker Studio Lifecycle
     * Configuration script. 
     */
    public fun studioLifecycleConfigContent(studioLifecycleConfigContent: String)

    /**
     * The name of the Amazon SageMaker AI Studio Lifecycle Configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigname)
     * @param studioLifecycleConfigName The name of the Amazon SageMaker AI Studio Lifecycle
     * Configuration. 
     */
    public fun studioLifecycleConfigName(studioLifecycleConfigName: String)

    /**
     * Tags to be associated with the Lifecycle Configuration.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-tags)
     * @param tags Tags to be associated with the Lifecycle Configuration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to be associated with the Lifecycle Configuration.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-tags)
     * @param tags Tags to be associated with the Lifecycle Configuration. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig.Builder.create(scope, id)

    /**
     * The App type to which the Lifecycle Configuration is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigapptype)
     * @param studioLifecycleConfigAppType The App type to which the Lifecycle Configuration is
     * attached. 
     */
    override fun studioLifecycleConfigAppType(studioLifecycleConfigAppType: String) {
      cdkBuilder.studioLifecycleConfigAppType(studioLifecycleConfigAppType)
    }

    /**
     * The content of your Amazon SageMaker Studio Lifecycle Configuration script.
     *
     * This content must be base64 encoded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigcontent)
     * @param studioLifecycleConfigContent The content of your Amazon SageMaker Studio Lifecycle
     * Configuration script. 
     */
    override fun studioLifecycleConfigContent(studioLifecycleConfigContent: String) {
      cdkBuilder.studioLifecycleConfigContent(studioLifecycleConfigContent)
    }

    /**
     * The name of the Amazon SageMaker AI Studio Lifecycle Configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigname)
     * @param studioLifecycleConfigName The name of the Amazon SageMaker AI Studio Lifecycle
     * Configuration. 
     */
    override fun studioLifecycleConfigName(studioLifecycleConfigName: String) {
      cdkBuilder.studioLifecycleConfigName(studioLifecycleConfigName)
    }

    /**
     * Tags to be associated with the Lifecycle Configuration.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-tags)
     * @param tags Tags to be associated with the Lifecycle Configuration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to be associated with the Lifecycle Configuration.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-tags)
     * @param tags Tags to be associated with the Lifecycle Configuration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudioLifecycleConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudioLifecycleConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig):
        CfnStudioLifecycleConfig = CfnStudioLifecycleConfig(cdkObject)

    internal fun unwrap(wrapped: CfnStudioLifecycleConfig):
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfig
  }
}
