package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomActionType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The category of the custom action, such as a build action or a test action.
   */
  public open fun category(): String = unwrap(this).getCategory()

  /**
   * The category of the custom action, such as a build action or a test action.
   */
  public open fun category(`value`: String) {
    unwrap(this).setCategory(`value`)
  }

  /**
   * The configuration properties for the custom action.
   */
  public open fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

  /**
   * The configuration properties for the custom action.
   */
  public open fun configurationProperties(`value`: IResolvable) {
    unwrap(this).setConfigurationProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration properties for the custom action.
   */
  public open fun configurationProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfigurationProperties(__idx_ac66f0)
  }

  /**
   * The configuration properties for the custom action.
   */
  public open fun configurationProperties(vararg __idx_ac66f0: Any): Unit =
      configurationProperties(__idx_ac66f0.toList())

  /**
   * The details of the input artifact for the action, such as its commit ID.
   */
  public open fun inputArtifactDetails(): Any = unwrap(this).getInputArtifactDetails()

  /**
   * The details of the input artifact for the action, such as its commit ID.
   */
  public open fun inputArtifactDetails(`value`: IResolvable) {
    unwrap(this).setInputArtifactDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details of the input artifact for the action, such as its commit ID.
   */
  public open fun inputArtifactDetails(`value`: ArtifactDetailsProperty) {
    unwrap(this).setInputArtifactDetails(`value`.let(ArtifactDetailsProperty::unwrap))
  }

  /**
   * The details of the input artifact for the action, such as its commit ID.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23442e12682a5195b8f487ed3e10faf18ccdc1138fb828b16b1bbaaea43e6099")
  public open fun inputArtifactDetails(`value`: ArtifactDetailsProperty.Builder.() -> Unit): Unit =
      inputArtifactDetails(ArtifactDetailsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The details of the output artifact of the action, such as its commit ID.
   */
  public open fun outputArtifactDetails(): Any = unwrap(this).getOutputArtifactDetails()

  /**
   * The details of the output artifact of the action, such as its commit ID.
   */
  public open fun outputArtifactDetails(`value`: IResolvable) {
    unwrap(this).setOutputArtifactDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details of the output artifact of the action, such as its commit ID.
   */
  public open fun outputArtifactDetails(`value`: ArtifactDetailsProperty) {
    unwrap(this).setOutputArtifactDetails(`value`.let(ArtifactDetailsProperty::unwrap))
  }

  /**
   * The details of the output artifact of the action, such as its commit ID.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d44dba6ac497cc5e3e963ef3d4a5faa82594726bb413d1e5b179faf8e345f5f5")
  public open fun outputArtifactDetails(`value`: ArtifactDetailsProperty.Builder.() -> Unit): Unit =
      outputArtifactDetails(ArtifactDetailsProperty(`value`))

  /**
   * The provider of the service used in the custom action, such as CodeDeploy.
   */
  public open fun provider(): String = unwrap(this).getProvider()

  /**
   * The provider of the service used in the custom action, such as CodeDeploy.
   */
  public open fun provider(`value`: String) {
    unwrap(this).setProvider(`value`)
  }

  /**
   * URLs that provide users information about this custom action.
   */
  public open fun settings(): Any? = unwrap(this).getSettings()

  /**
   * URLs that provide users information about this custom action.
   */
  public open fun settings(`value`: IResolvable) {
    unwrap(this).setSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * URLs that provide users information about this custom action.
   */
  public open fun settings(`value`: SettingsProperty) {
    unwrap(this).setSettings(`value`.let(SettingsProperty::unwrap))
  }

  /**
   * URLs that provide users information about this custom action.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2e3a287a92244fb3614c3db474551401dc5c46fa1f5828085fde8fdb200021f4")
  public open fun settings(`value`: SettingsProperty.Builder.() -> Unit): Unit =
      settings(SettingsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the custom action.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the custom action.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the custom action.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The version identifier of the custom action.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * The version identifier of the custom action.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.CfnCustomActionType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The category of the custom action, such as a build action or a test action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
     * @param category The category of the custom action, such as a build action or a test action. 
     */
    public fun category(category: String)

    /**
     * The configuration properties for the custom action.
     *
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     * @param configurationProperties The configuration properties for the custom action. 
     */
    public fun configurationProperties(configurationProperties: IResolvable)

    /**
     * The configuration properties for the custom action.
     *
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     * @param configurationProperties The configuration properties for the custom action. 
     */
    public fun configurationProperties(configurationProperties: List<Any>)

    /**
     * The configuration properties for the custom action.
     *
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     * @param configurationProperties The configuration properties for the custom action. 
     */
    public fun configurationProperties(vararg configurationProperties: Any)

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    public fun inputArtifactDetails(inputArtifactDetails: IResolvable)

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    public fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty)

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c062bcef39dbf9342bf4841e882b91132ec40b94655336d24309de3bb0244")
    public
        fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit)

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    public fun outputArtifactDetails(outputArtifactDetails: IResolvable)

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    public fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty)

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a90a14ad5054c55a647d31790af6d09a9b2f40e2aae4353f23e4217cbf79a3fe")
    public
        fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit)

    /**
     * The provider of the service used in the custom action, such as CodeDeploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
     * @param provider The provider of the service used in the custom action, such as CodeDeploy. 
     */
    public fun provider(provider: String)

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     * @param tags The tags for the custom action. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     * @param tags The tags for the custom action. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     * @param settings URLs that provide users information about this custom action. 
     */
    public fun tings(settings: IResolvable)

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     * @param settings URLs that provide users information about this custom action. 
     */
    public fun tings(settings: SettingsProperty)

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     * @param settings URLs that provide users information about this custom action. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66dba7e677bf870a75b236ff0b004c0bc110a4c4b2e371228cd57f32a20a1f6b")
    public fun tings(settings: SettingsProperty.Builder.() -> Unit)

    /**
     * The version identifier of the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
     * @param version The version identifier of the custom action. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.Builder
        = software.amazon.awscdk.services.codepipeline.CfnCustomActionType.Builder.create(scope, id)

    /**
     * The category of the custom action, such as a build action or a test action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
     * @param category The category of the custom action, such as a build action or a test action. 
     */
    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    /**
     * The configuration properties for the custom action.
     *
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     * @param configurationProperties The configuration properties for the custom action. 
     */
    override fun configurationProperties(configurationProperties: IResolvable) {
      cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
    }

    /**
     * The configuration properties for the custom action.
     *
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     * @param configurationProperties The configuration properties for the custom action. 
     */
    override fun configurationProperties(configurationProperties: List<Any>) {
      cdkBuilder.configurationProperties(configurationProperties)
    }

    /**
     * The configuration properties for the custom action.
     *
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     * @param configurationProperties The configuration properties for the custom action. 
     */
    override fun configurationProperties(vararg configurationProperties: Any): Unit =
        configurationProperties(configurationProperties.toList())

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    override fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(IResolvable::unwrap))
    }

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    override fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(ArtifactDetailsProperty::unwrap))
    }

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c062bcef39dbf9342bf4841e882b91132ec40b94655336d24309de3bb0244")
    override
        fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit):
        Unit = inputArtifactDetails(ArtifactDetailsProperty(inputArtifactDetails))

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    override fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(IResolvable::unwrap))
    }

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    override fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(ArtifactDetailsProperty::unwrap))
    }

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a90a14ad5054c55a647d31790af6d09a9b2f40e2aae4353f23e4217cbf79a3fe")
    override
        fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit):
        Unit = outputArtifactDetails(ArtifactDetailsProperty(outputArtifactDetails))

    /**
     * The provider of the service used in the custom action, such as CodeDeploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
     * @param provider The provider of the service used in the custom action, such as CodeDeploy. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     * @param tags The tags for the custom action. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     * @param tags The tags for the custom action. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     * @param settings URLs that provide users information about this custom action. 
     */
    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     * @param settings URLs that provide users information about this custom action. 
     */
    override fun tings(settings: SettingsProperty) {
      cdkBuilder.settings(settings.let(SettingsProperty::unwrap))
    }

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     * @param settings URLs that provide users information about this custom action. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66dba7e677bf870a75b236ff0b004c0bc110a4c4b2e371228cd57f32a20a1f6b")
    override fun tings(settings: SettingsProperty.Builder.() -> Unit): Unit =
        tings(SettingsProperty(settings))

    /**
     * The version identifier of the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
     * @param version The version identifier of the custom action. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnCustomActionType =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codepipeline.CfnCustomActionType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomActionType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomActionType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType):
        CfnCustomActionType = CfnCustomActionType(cdkObject)

    internal fun unwrap(wrapped: CfnCustomActionType):
        software.amazon.awscdk.services.codepipeline.CfnCustomActionType = wrapped.cdkObject
  }

  public interface ArtifactDetailsProperty {
    /**
     * The maximum number of artifacts allowed for the action type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount)
     */
    public fun maximumCount(): Number

    /**
     * The minimum number of artifacts allowed for the action type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount)
     */
    public fun minimumCount(): Number

    /**
     * A builder for [ArtifactDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumCount The maximum number of artifacts allowed for the action type. 
       */
      public fun maximumCount(maximumCount: Number)

      /**
       * @param minimumCount The minimum number of artifacts allowed for the action type. 
       */
      public fun minimumCount(minimumCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.builder()

      /**
       * @param maximumCount The maximum number of artifacts allowed for the action type. 
       */
      override fun maximumCount(maximumCount: Number) {
        cdkBuilder.maximumCount(maximumCount)
      }

      /**
       * @param minimumCount The minimum number of artifacts allowed for the action type. 
       */
      override fun minimumCount(minimumCount: Number) {
        cdkBuilder.minimumCount(minimumCount)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty,
    ) : CdkObject(cdkObject), ArtifactDetailsProperty {
      /**
       * The maximum number of artifacts allowed for the action type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount)
       */
      override fun maximumCount(): Number = unwrap(this).getMaximumCount()

      /**
       * The minimum number of artifacts allowed for the action type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount)
       */
      override fun minimumCount(): Number = unwrap(this).getMinimumCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty):
          ArtifactDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactDetailsProperty):
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty
    }
  }

  public interface SettingsProperty {
    /**
     * The URL returned to the CodePipeline console that provides a deep link to the resources of
     * the external system, such as the configuration page for a CodeDeploy deployment group.
     *
     * This link is provided as part of the action display in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate)
     */
    public fun entityUrlTemplate(): String? = unwrap(this).getEntityUrlTemplate()

    /**
     * The URL returned to the CodePipeline console that contains a link to the top-level landing
     * page for the external system, such as the console page for CodeDeploy.
     *
     * This link is shown on the pipeline view page in the CodePipeline console and provides a link
     * to the execution entity of the external action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate)
     */
    public fun executionUrlTemplate(): String? = unwrap(this).getExecutionUrlTemplate()

    /**
     * The URL returned to the CodePipeline console that contains a link to the page where customers
     * can update or change the configuration of the external action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate)
     */
    public fun revisionUrlTemplate(): String? = unwrap(this).getRevisionUrlTemplate()

    /**
     * The URL of a sign-up page where users can sign up for an external service and perform initial
     * configuration of the action provided by that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl)
     */
    public fun thirdPartyConfigurationUrl(): String? = unwrap(this).getThirdPartyConfigurationUrl()

    /**
     * A builder for [SettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entityUrlTemplate The URL returned to the CodePipeline console that provides a deep
       * link to the resources of the external system, such as the configuration page for a CodeDeploy
       * deployment group.
       * This link is provided as part of the action display in the pipeline.
       */
      public fun entityUrlTemplate(entityUrlTemplate: String)

      /**
       * @param executionUrlTemplate The URL returned to the CodePipeline console that contains a
       * link to the top-level landing page for the external system, such as the console page for
       * CodeDeploy.
       * This link is shown on the pipeline view page in the CodePipeline console and provides a
       * link to the execution entity of the external action.
       */
      public fun executionUrlTemplate(executionUrlTemplate: String)

      /**
       * @param revisionUrlTemplate The URL returned to the CodePipeline console that contains a
       * link to the page where customers can update or change the configuration of the external
       * action.
       */
      public fun revisionUrlTemplate(revisionUrlTemplate: String)

      /**
       * @param thirdPartyConfigurationUrl The URL of a sign-up page where users can sign up for an
       * external service and perform initial configuration of the action provided by that service.
       */
      public fun thirdPartyConfigurationUrl(thirdPartyConfigurationUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.builder()

      /**
       * @param entityUrlTemplate The URL returned to the CodePipeline console that provides a deep
       * link to the resources of the external system, such as the configuration page for a CodeDeploy
       * deployment group.
       * This link is provided as part of the action display in the pipeline.
       */
      override fun entityUrlTemplate(entityUrlTemplate: String) {
        cdkBuilder.entityUrlTemplate(entityUrlTemplate)
      }

      /**
       * @param executionUrlTemplate The URL returned to the CodePipeline console that contains a
       * link to the top-level landing page for the external system, such as the console page for
       * CodeDeploy.
       * This link is shown on the pipeline view page in the CodePipeline console and provides a
       * link to the execution entity of the external action.
       */
      override fun executionUrlTemplate(executionUrlTemplate: String) {
        cdkBuilder.executionUrlTemplate(executionUrlTemplate)
      }

      /**
       * @param revisionUrlTemplate The URL returned to the CodePipeline console that contains a
       * link to the page where customers can update or change the configuration of the external
       * action.
       */
      override fun revisionUrlTemplate(revisionUrlTemplate: String) {
        cdkBuilder.revisionUrlTemplate(revisionUrlTemplate)
      }

      /**
       * @param thirdPartyConfigurationUrl The URL of a sign-up page where users can sign up for an
       * external service and perform initial configuration of the action provided by that service.
       */
      override fun thirdPartyConfigurationUrl(thirdPartyConfigurationUrl: String) {
        cdkBuilder.thirdPartyConfigurationUrl(thirdPartyConfigurationUrl)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty,
    ) : CdkObject(cdkObject), SettingsProperty {
      /**
       * The URL returned to the CodePipeline console that provides a deep link to the resources of
       * the external system, such as the configuration page for a CodeDeploy deployment group.
       *
       * This link is provided as part of the action display in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate)
       */
      override fun entityUrlTemplate(): String? = unwrap(this).getEntityUrlTemplate()

      /**
       * The URL returned to the CodePipeline console that contains a link to the top-level landing
       * page for the external system, such as the console page for CodeDeploy.
       *
       * This link is shown on the pipeline view page in the CodePipeline console and provides a
       * link to the execution entity of the external action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate)
       */
      override fun executionUrlTemplate(): String? = unwrap(this).getExecutionUrlTemplate()

      /**
       * The URL returned to the CodePipeline console that contains a link to the page where
       * customers can update or change the configuration of the external action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate)
       */
      override fun revisionUrlTemplate(): String? = unwrap(this).getRevisionUrlTemplate()

      /**
       * The URL of a sign-up page where users can sign up for an external service and perform
       * initial configuration of the action provided by that service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl)
       */
      override fun thirdPartyConfigurationUrl(): String? =
          unwrap(this).getThirdPartyConfigurationUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty):
          SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SettingsProperty):
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty
    }
  }

  public interface ConfigurationPropertiesProperty {
    /**
     * The description of the action configuration property that is displayed to users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Whether the configuration property is a key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
     */
    public fun key(): Any

    /**
     * The name of the action configuration property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name)
     */
    public fun name(): String

    /**
     * Indicates that the property is used with `PollForJobs` .
     *
     * When creating a custom action, an action can have up to one queryable property. If it has
     * one, that property must be both required and not secret.
     *
     * If you create a pipeline with a custom action type, and that custom action contains a
     * queryable property, the value for that configuration property is subject to other restrictions.
     * The value must be less than or equal to twenty (20) characters. The value can contain only
     * alphanumeric characters, underscores, and hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
     */
    public fun queryable(): Any? = unwrap(this).getQueryable()

    /**
     * Whether the configuration property is a required value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required)
     */
    public fun required(): Any

    /**
     * Whether the configuration property is secret.
     *
     * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
     * `PollForJobs` , and `PollForThirdPartyJobs` .
     *
     * When updating a pipeline, passing * * * * * without changing any other values of the action
     * preserves the previous value of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret)
     */
    public fun secret(): Any

    /**
     * The type of the configuration property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ConfigurationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the action configuration property that is displayed
       * to users.
       */
      public fun description(description: String)

      /**
       * @param key Whether the configuration property is a key. 
       */
      public fun key(key: Boolean)

      /**
       * @param key Whether the configuration property is a key. 
       */
      public fun key(key: IResolvable)

      /**
       * @param name The name of the action configuration property. 
       */
      public fun name(name: String)

      /**
       * @param queryable Indicates that the property is used with `PollForJobs` .
       * When creating a custom action, an action can have up to one queryable property. If it has
       * one, that property must be both required and not secret.
       *
       * If you create a pipeline with a custom action type, and that custom action contains a
       * queryable property, the value for that configuration property is subject to other
       * restrictions. The value must be less than or equal to twenty (20) characters. The value can
       * contain only alphanumeric characters, underscores, and hyphens.
       */
      public fun queryable(queryable: Boolean)

      /**
       * @param queryable Indicates that the property is used with `PollForJobs` .
       * When creating a custom action, an action can have up to one queryable property. If it has
       * one, that property must be both required and not secret.
       *
       * If you create a pipeline with a custom action type, and that custom action contains a
       * queryable property, the value for that configuration property is subject to other
       * restrictions. The value must be less than or equal to twenty (20) characters. The value can
       * contain only alphanumeric characters, underscores, and hyphens.
       */
      public fun queryable(queryable: IResolvable)

      /**
       * @param required Whether the configuration property is a required value. 
       */
      public fun required(required: Boolean)

      /**
       * @param required Whether the configuration property is a required value. 
       */
      public fun required(required: IResolvable)

      /**
       * @param secret Whether the configuration property is secret. 
       * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
       * `PollForJobs` , and `PollForThirdPartyJobs` .
       *
       * When updating a pipeline, passing * * * * * without changing any other values of the action
       * preserves the previous value of the secret.
       */
      public fun secret(secret: Boolean)

      /**
       * @param secret Whether the configuration property is secret. 
       * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
       * `PollForJobs` , and `PollForThirdPartyJobs` .
       *
       * When updating a pipeline, passing * * * * * without changing any other values of the action
       * preserves the previous value of the secret.
       */
      public fun secret(secret: IResolvable)

      /**
       * @param type The type of the configuration property.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.builder()

      /**
       * @param description The description of the action configuration property that is displayed
       * to users.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param key Whether the configuration property is a key. 
       */
      override fun key(key: Boolean) {
        cdkBuilder.key(key)
      }

      /**
       * @param key Whether the configuration property is a key. 
       */
      override fun key(key: IResolvable) {
        cdkBuilder.key(key.let(IResolvable::unwrap))
      }

      /**
       * @param name The name of the action configuration property. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param queryable Indicates that the property is used with `PollForJobs` .
       * When creating a custom action, an action can have up to one queryable property. If it has
       * one, that property must be both required and not secret.
       *
       * If you create a pipeline with a custom action type, and that custom action contains a
       * queryable property, the value for that configuration property is subject to other
       * restrictions. The value must be less than or equal to twenty (20) characters. The value can
       * contain only alphanumeric characters, underscores, and hyphens.
       */
      override fun queryable(queryable: Boolean) {
        cdkBuilder.queryable(queryable)
      }

      /**
       * @param queryable Indicates that the property is used with `PollForJobs` .
       * When creating a custom action, an action can have up to one queryable property. If it has
       * one, that property must be both required and not secret.
       *
       * If you create a pipeline with a custom action type, and that custom action contains a
       * queryable property, the value for that configuration property is subject to other
       * restrictions. The value must be less than or equal to twenty (20) characters. The value can
       * contain only alphanumeric characters, underscores, and hyphens.
       */
      override fun queryable(queryable: IResolvable) {
        cdkBuilder.queryable(queryable.let(IResolvable::unwrap))
      }

      /**
       * @param required Whether the configuration property is a required value. 
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required Whether the configuration property is a required value. 
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      /**
       * @param secret Whether the configuration property is secret. 
       * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
       * `PollForJobs` , and `PollForThirdPartyJobs` .
       *
       * When updating a pipeline, passing * * * * * without changing any other values of the action
       * preserves the previous value of the secret.
       */
      override fun secret(secret: Boolean) {
        cdkBuilder.secret(secret)
      }

      /**
       * @param secret Whether the configuration property is secret. 
       * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
       * `PollForJobs` , and `PollForThirdPartyJobs` .
       *
       * When updating a pipeline, passing * * * * * without changing any other values of the action
       * preserves the previous value of the secret.
       */
      override fun secret(secret: IResolvable) {
        cdkBuilder.secret(secret.let(IResolvable::unwrap))
      }

      /**
       * @param type The type of the configuration property.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty,
    ) : CdkObject(cdkObject), ConfigurationPropertiesProperty {
      /**
       * The description of the action configuration property that is displayed to users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Whether the configuration property is a key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
       */
      override fun key(): Any = unwrap(this).getKey()

      /**
       * The name of the action configuration property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Indicates that the property is used with `PollForJobs` .
       *
       * When creating a custom action, an action can have up to one queryable property. If it has
       * one, that property must be both required and not secret.
       *
       * If you create a pipeline with a custom action type, and that custom action contains a
       * queryable property, the value for that configuration property is subject to other
       * restrictions. The value must be less than or equal to twenty (20) characters. The value can
       * contain only alphanumeric characters, underscores, and hyphens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
       */
      override fun queryable(): Any? = unwrap(this).getQueryable()

      /**
       * Whether the configuration property is a required value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required)
       */
      override fun required(): Any = unwrap(this).getRequired()

      /**
       * Whether the configuration property is secret.
       *
       * Secrets are hidden from all calls except for `GetJobDetails` , `GetThirdPartyJobDetails` ,
       * `PollForJobs` , and `PollForThirdPartyJobs` .
       *
       * When updating a pipeline, passing * * * * * without changing any other values of the action
       * preserves the previous value of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret)
       */
      override fun secret(): Any = unwrap(this).getSecret()

      /**
       * The type of the configuration property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty):
          ConfigurationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationPropertiesProperty):
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty
    }
  }
}
