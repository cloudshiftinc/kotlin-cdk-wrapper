@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

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
 * Specifies an inference profile as a resource in a top-level template.
 *
 * Use the `ModelSource` field to specify the inference profile to copy into the resource. For more
 * information about using inference profiles in Amazon Bedrock , see [Improve resilience with
 * cross-region
 * inference](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) .
 *
 * See the *Properties* section below for descriptions of both the required and optional properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnApplicationInferenceProfile cfnApplicationInferenceProfile =
 * CfnApplicationInferenceProfile.Builder.create(this, "MyCfnApplicationInferenceProfile")
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
public open class CfnApplicationInferenceProfile(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationInferenceProfileProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationInferenceProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationInferenceProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationInferenceProfileProps(props)
  )

  /**
   * The time at which the inference profile was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of the inference profile.
   */
  public open fun attrInferenceProfileArn(): String = unwrap(this).getAttrInferenceProfileArn()

  /**
   * The unique identifier of the inference profile.
   */
  public open fun attrInferenceProfileId(): String = unwrap(this).getAttrInferenceProfileId()

  /**
   * The ID or Amazon Resource Name (ARN) of the inference profile.
   */
  public open fun attrInferenceProfileIdentifier(): String =
      unwrap(this).getAttrInferenceProfileIdentifier()

  /**
   * A list of information about each model in the inference profile.
   */
  public open fun attrModels(): IResolvable = unwrap(this).getAttrModels().let(IResolvable::wrap)

  /**
   * The status of the inference profile.
   *
   * `ACTIVE` means that the inference profile is ready to be used.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The type of the inference profile. The following types are possible:.
   *
   * * `SYSTEM_DEFINED` – The inference profile is defined by Amazon Bedrock. You can route
   * inference requests across regions with these inference profiles.
   * * `APPLICATION` – The inference profile was created by a user. This type of inference profile
   * can track metrics and costs when invoking the model in it. The inference profile may route
   * requests to one or multiple regions.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The time at which the inference profile was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the inference profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the inference profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the inference profile.
   */
  public open fun inferenceProfileName(): String = unwrap(this).getInferenceProfileName()

  /**
   * The name of the inference profile.
   */
  public open fun inferenceProfileName(`value`: String) {
    unwrap(this).setInferenceProfileName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Contains configurations for the inference profile to copy as the resource.
   */
  public open fun modelSource(): Any? = unwrap(this).getModelSource()

  /**
   * Contains configurations for the inference profile to copy as the resource.
   */
  public open fun modelSource(`value`: IResolvable) {
    unwrap(this).setModelSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains configurations for the inference profile to copy as the resource.
   */
  public open fun modelSource(`value`: InferenceProfileModelSourceProperty) {
    unwrap(this).setModelSource(`value`.let(InferenceProfileModelSourceProperty.Companion::unwrap))
  }

  /**
   * Contains configurations for the inference profile to copy as the resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a847b68665db75b4322790a54388979fb233ceb5b78eac0268bc48eb6e6283d")
  public open fun modelSource(`value`: InferenceProfileModelSourceProperty.Builder.() -> Unit): Unit
      = modelSource(InferenceProfileModelSourceProperty(`value`))

  /**
   * A list of tags associated with the inference profile.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags associated with the inference profile.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags associated with the inference profile.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnApplicationInferenceProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-description)
     * @param description The description of the inference profile. 
     */
    public fun description(description: String)

    /**
     * The name of the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilename)
     * @param inferenceProfileName The name of the inference profile. 
     */
    public fun inferenceProfileName(inferenceProfileName: String)

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     * 
     */
    public fun modelSource(modelSource: IResolvable)

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     * 
     */
    public fun modelSource(modelSource: InferenceProfileModelSourceProperty)

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8acfe7676179494f0bcc3f211d543d39b63d580e03578a4f0ca0fb48d1780004")
    public fun modelSource(modelSource: InferenceProfileModelSourceProperty.Builder.() -> Unit)

    /**
     * A list of tags associated with the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-tags)
     * @param tags A list of tags associated with the inference profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags associated with the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-tags)
     * @param tags A list of tags associated with the inference profile. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.Builder =
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.Builder.create(scope,
        id)

    /**
     * The description of the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-description)
     * @param description The description of the inference profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilename)
     * @param inferenceProfileName The name of the inference profile. 
     */
    override fun inferenceProfileName(inferenceProfileName: String) {
      cdkBuilder.inferenceProfileName(inferenceProfileName)
    }

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     * 
     */
    override fun modelSource(modelSource: IResolvable) {
      cdkBuilder.modelSource(modelSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     * 
     */
    override fun modelSource(modelSource: InferenceProfileModelSourceProperty) {
      cdkBuilder.modelSource(modelSource.let(InferenceProfileModelSourceProperty.Companion::unwrap))
    }

    /**
     * Contains configurations for the inference profile to copy as the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-modelsource)
     * @param modelSource Contains configurations for the inference profile to copy as the resource.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8acfe7676179494f0bcc3f211d543d39b63d580e03578a4f0ca0fb48d1780004")
    override fun modelSource(modelSource: InferenceProfileModelSourceProperty.Builder.() -> Unit):
        Unit = modelSource(InferenceProfileModelSourceProperty(modelSource))

    /**
     * A list of tags associated with the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-tags)
     * @param tags A list of tags associated with the inference profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags associated with the inference profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-applicationinferenceprofile.html#cfn-bedrock-applicationinferenceprofile-tags)
     * @param tags A list of tags associated with the inference profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationInferenceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationInferenceProfile(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile):
        CfnApplicationInferenceProfile = CfnApplicationInferenceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationInferenceProfile):
        software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile = wrapped.cdkObject
        as software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile
  }

  /**
   * Contains information about a model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * InferenceProfileModelProperty inferenceProfileModelProperty =
   * InferenceProfileModelProperty.builder()
   * .modelArn("modelArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-applicationinferenceprofile-inferenceprofilemodel.html)
   */
  public interface InferenceProfileModelProperty {
    /**
     * The Amazon Resource Name (ARN) of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-applicationinferenceprofile-inferenceprofilemodel.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilemodel-modelarn)
     */
    public fun modelArn(): String? = unwrap(this).getModelArn()

    /**
     * A builder for [InferenceProfileModelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelArn The Amazon Resource Name (ARN) of the model.
       */
      public fun modelArn(modelArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty.builder()

      /**
       * @param modelArn The Amazon Resource Name (ARN) of the model.
       */
      override fun modelArn(modelArn: String) {
        cdkBuilder.modelArn(modelArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty,
    ) : CdkObject(cdkObject),
        InferenceProfileModelProperty {
      /**
       * The Amazon Resource Name (ARN) of the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-applicationinferenceprofile-inferenceprofilemodel.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilemodel-modelarn)
       */
      override fun modelArn(): String? = unwrap(this).getModelArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceProfileModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty):
          InferenceProfileModelProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceProfileModelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceProfileModelProperty):
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelProperty
    }
  }

  /**
   * Contains information about the model or system-defined inference profile that is the source for
   * an inference profile..
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * InferenceProfileModelSourceProperty inferenceProfileModelSourceProperty =
   * InferenceProfileModelSourceProperty.builder()
   * .copyFrom("copyFrom")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-applicationinferenceprofile-inferenceprofilemodelsource.html)
   */
  public interface InferenceProfileModelSourceProperty {
    /**
     * The ARN of the model or system-defined inference profile that is the source for the inference
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-applicationinferenceprofile-inferenceprofilemodelsource.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilemodelsource-copyfrom)
     */
    public fun copyFrom(): String

    /**
     * A builder for [InferenceProfileModelSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyFrom The ARN of the model or system-defined inference profile that is the source
       * for the inference profile. 
       */
      public fun copyFrom(copyFrom: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty.builder()

      /**
       * @param copyFrom The ARN of the model or system-defined inference profile that is the source
       * for the inference profile. 
       */
      override fun copyFrom(copyFrom: String) {
        cdkBuilder.copyFrom(copyFrom)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty,
    ) : CdkObject(cdkObject),
        InferenceProfileModelSourceProperty {
      /**
       * The ARN of the model or system-defined inference profile that is the source for the
       * inference profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-applicationinferenceprofile-inferenceprofilemodelsource.html#cfn-bedrock-applicationinferenceprofile-inferenceprofilemodelsource-copyfrom)
       */
      override fun copyFrom(): String = unwrap(this).getCopyFrom()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceProfileModelSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty):
          InferenceProfileModelSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceProfileModelSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceProfileModelSourceProperty):
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile.InferenceProfileModelSourceProperty
    }
  }
}
