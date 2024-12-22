@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

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
 * Properties for defining a `CfnApplicationInferenceProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnApplicationInferenceProfileProps cfnApplicationInferenceProfileProps =
 * CfnApplicationInferenceProfileProps.builder()
 * .inferenceProfileName("inferenceProfileName")
 * // the properties below are optional
 * .description("description")
 * .modelSource(InferenceProfileModelSourceProperty.builder()
 * .copyFrom("copyFrom")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html)
 */
public interface CfnApplicationInferenceProfileProps {
  /**
   * The description of the inference profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the inference profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilename)
   */
  public fun inferenceProfileName(): String

  /**
   * Contains configurations for the inference profile to copy as the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
   */
  public fun modelSource(): Any? = unwrap(this).getModelSource()

  /**
   * A list of tags associated with the inference profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationInferenceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the inference profile.
     */
    public fun description(description: String)

    /**
     * @param inferenceProfileName The name of the inference profile. 
     */
    public fun inferenceProfileName(inferenceProfileName: String)

    /**
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     */
    public fun modelSource(modelSource: IResolvable)

    /**
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     */
    public
        fun modelSource(modelSource: CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty)

    /**
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30af3bdb22528dd852bef032a8226d4eda4e8de4b389dbd55d4c87573aecea3a")
    public
        fun modelSource(modelSource: CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty.Builder.() -> Unit)

    /**
     * @param tags A list of tags associated with the inference profile.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags associated with the inference profile.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps.builder()

    /**
     * @param description The description of the inference profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inferenceProfileName The name of the inference profile. 
     */
    override fun inferenceProfileName(inferenceProfileName: String) {
      cdkBuilder.inferenceProfileName(inferenceProfileName)
    }

    /**
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     */
    override fun modelSource(modelSource: IResolvable) {
      cdkBuilder.modelSource(modelSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     */
    override
        fun modelSource(modelSource: CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty) {
      cdkBuilder.modelSource(modelSource.let(CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty.Companion::unwrap))
    }

    /**
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30af3bdb22528dd852bef032a8226d4eda4e8de4b389dbd55d4c87573aecea3a")
    override
        fun modelSource(modelSource: CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty.Builder.() -> Unit):
        Unit =
        modelSource(CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty(modelSource))

    /**
     * @param tags A list of tags associated with the inference profile.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags associated with the inference profile.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps,
  ) : CdkObject(cdkObject),
      CfnApplicationInferenceProfileProps {
    /**
     * The description of the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilename)
     */
    override fun inferenceProfileName(): String = unwrap(this).getInferenceProfileName()

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     */
    override fun modelSource(): Any? = unwrap(this).getModelSource()

    /**
     * A list of tags associated with the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationInferenceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps):
        CfnApplicationInferenceProfileProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnApplicationInferenceProfileProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationInferenceProfileProps):
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps
  }
}
