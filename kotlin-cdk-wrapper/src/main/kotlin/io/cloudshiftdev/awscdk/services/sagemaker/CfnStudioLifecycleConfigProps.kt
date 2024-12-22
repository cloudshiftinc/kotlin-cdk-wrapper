@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStudioLifecycleConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnStudioLifecycleConfigProps cfnStudioLifecycleConfigProps =
 * CfnStudioLifecycleConfigProps.builder()
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
public interface CfnStudioLifecycleConfigProps {
  /**
   * The App type to which the Lifecycle Configuration is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigapptype)
   */
  public fun studioLifecycleConfigAppType(): String

  /**
   * The content of your Amazon SageMaker Studio Lifecycle Configuration script.
   *
   * This content must be base64 encoded.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigcontent)
   */
  public fun studioLifecycleConfigContent(): String

  /**
   * The name of the Amazon SageMaker Studio Lifecycle Configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigname)
   */
  public fun studioLifecycleConfigName(): String

  /**
   * Tags to be associated with the Lifecycle Configuration.
   *
   * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
   * are searchable using the Search API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStudioLifecycleConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param studioLifecycleConfigAppType The App type to which the Lifecycle Configuration is
     * attached. 
     */
    public fun studioLifecycleConfigAppType(studioLifecycleConfigAppType: String)

    /**
     * @param studioLifecycleConfigContent The content of your Amazon SageMaker Studio Lifecycle
     * Configuration script. 
     * This content must be base64 encoded.
     */
    public fun studioLifecycleConfigContent(studioLifecycleConfigContent: String)

    /**
     * @param studioLifecycleConfigName The name of the Amazon SageMaker Studio Lifecycle
     * Configuration. 
     */
    public fun studioLifecycleConfigName(studioLifecycleConfigName: String)

    /**
     * @param tags Tags to be associated with the Lifecycle Configuration.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to be associated with the Lifecycle Configuration.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps.builder()

    /**
     * @param studioLifecycleConfigAppType The App type to which the Lifecycle Configuration is
     * attached. 
     */
    override fun studioLifecycleConfigAppType(studioLifecycleConfigAppType: String) {
      cdkBuilder.studioLifecycleConfigAppType(studioLifecycleConfigAppType)
    }

    /**
     * @param studioLifecycleConfigContent The content of your Amazon SageMaker Studio Lifecycle
     * Configuration script. 
     * This content must be base64 encoded.
     */
    override fun studioLifecycleConfigContent(studioLifecycleConfigContent: String) {
      cdkBuilder.studioLifecycleConfigContent(studioLifecycleConfigContent)
    }

    /**
     * @param studioLifecycleConfigName The name of the Amazon SageMaker Studio Lifecycle
     * Configuration. 
     */
    override fun studioLifecycleConfigName(studioLifecycleConfigName: String) {
      cdkBuilder.studioLifecycleConfigName(studioLifecycleConfigName)
    }

    /**
     * @param tags Tags to be associated with the Lifecycle Configuration.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to be associated with the Lifecycle Configuration.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps,
  ) : CdkObject(cdkObject),
      CfnStudioLifecycleConfigProps {
    /**
     * The App type to which the Lifecycle Configuration is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigapptype)
     */
    override fun studioLifecycleConfigAppType(): String =
        unwrap(this).getStudioLifecycleConfigAppType()

    /**
     * The content of your Amazon SageMaker Studio Lifecycle Configuration script.
     *
     * This content must be base64 encoded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigcontent)
     */
    override fun studioLifecycleConfigContent(): String =
        unwrap(this).getStudioLifecycleConfigContent()

    /**
     * The name of the Amazon SageMaker Studio Lifecycle Configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-studiolifecycleconfigname)
     */
    override fun studioLifecycleConfigName(): String = unwrap(this).getStudioLifecycleConfigName()

    /**
     * Tags to be associated with the Lifecycle Configuration.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-studiolifecycleconfig.html#cfn-sagemaker-studiolifecycleconfig-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioLifecycleConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps):
        CfnStudioLifecycleConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStudioLifecycleConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioLifecycleConfigProps):
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnStudioLifecycleConfigProps
  }
}
