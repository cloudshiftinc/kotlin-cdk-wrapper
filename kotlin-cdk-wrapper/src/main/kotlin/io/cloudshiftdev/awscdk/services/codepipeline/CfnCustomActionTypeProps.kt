@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

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
 * Properties for defining a `CfnCustomActionType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * CfnCustomActionTypeProps cfnCustomActionTypeProps = CfnCustomActionTypeProps.builder()
 * .category("category")
 * .inputArtifactDetails(ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build())
 * .outputArtifactDetails(ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build())
 * .provider("provider")
 * .version("version")
 * // the properties below are optional
 * .configurationProperties(List.of(ConfigurationPropertiesProperty.builder()
 * .key(false)
 * .name("name")
 * .required(false)
 * .secret(false)
 * // the properties below are optional
 * .description("description")
 * .queryable(false)
 * .type("type")
 * .build()))
 * .settings(SettingsProperty.builder()
 * .entityUrlTemplate("entityUrlTemplate")
 * .executionUrlTemplate("executionUrlTemplate")
 * .revisionUrlTemplate("revisionUrlTemplate")
 * .thirdPartyConfigurationUrl("thirdPartyConfigurationUrl")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
 */
public interface CfnCustomActionTypeProps {
  /**
   * The category of the custom action, such as a build action or a test action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
   */
  public fun category(): String

  /**
   * The configuration properties for the custom action.
   *
   *
   * You can refer to a name in the configuration properties of the custom action within the URL
   * templates by following the format of {Config:name}, as long as the configuration property is both
   * required and not secret. For more information, see [Create a Custom Action for a
   * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
   */
  public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

  /**
   * The details of the input artifact for the action, such as its commit ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
   */
  public fun inputArtifactDetails(): Any

  /**
   * The details of the output artifact of the action, such as its commit ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
   */
  public fun outputArtifactDetails(): Any

  /**
   * The provider of the service used in the custom action, such as CodeDeploy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
   */
  public fun provider(): String

  /**
   * URLs that provide users information about this custom action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
   */
  public fun settings(): Any? = unwrap(this).getSettings()

  /**
   * The tags for the custom action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The version identifier of the custom action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
   */
  public fun version(): String

  /**
   * A builder for [CfnCustomActionTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param category The category of the custom action, such as a build action or a test action. 
     */
    public fun category(category: String)

    /**
     * @param configurationProperties The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     */
    public fun configurationProperties(configurationProperties: IResolvable)

    /**
     * @param configurationProperties The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     */
    public fun configurationProperties(configurationProperties: List<Any>)

    /**
     * @param configurationProperties The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     */
    public fun configurationProperties(vararg configurationProperties: Any)

    /**
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    public fun inputArtifactDetails(inputArtifactDetails: IResolvable)

    /**
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    public
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty)

    /**
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f84e8cf236d8310af7ea8f4b3b2b68a9416a764f898131998f1424385f6219")
    public
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit)

    /**
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    public fun outputArtifactDetails(outputArtifactDetails: IResolvable)

    /**
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    public
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty)

    /**
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1b8dd7bd6bf87a1c00cb7572423f40f49007c3e3fdb96fc02bd89462e1844c")
    public
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit)

    /**
     * @param provider The provider of the service used in the custom action, such as CodeDeploy. 
     */
    public fun provider(provider: String)

    /**
     * @param tags The tags for the custom action.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the custom action.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param settings URLs that provide users information about this custom action.
     */
    public fun tings(settings: IResolvable)

    /**
     * @param settings URLs that provide users information about this custom action.
     */
    public fun tings(settings: CfnCustomActionType.SettingsProperty)

    /**
     * @param settings URLs that provide users information about this custom action.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5dad734a778bd8f7c0451e773d7159ec6f4e3d028fe71958bfd43ec648fb9d3")
    public fun tings(settings: CfnCustomActionType.SettingsProperty.Builder.() -> Unit)

    /**
     * @param version The version identifier of the custom action. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder =
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.builder()

    /**
     * @param category The category of the custom action, such as a build action or a test action. 
     */
    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    /**
     * @param configurationProperties The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     */
    override fun configurationProperties(configurationProperties: IResolvable) {
      cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
    }

    /**
     * @param configurationProperties The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     */
    override fun configurationProperties(configurationProperties: List<Any>) {
      cdkBuilder.configurationProperties(configurationProperties)
    }

    /**
     * @param configurationProperties The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see [Create a Custom Action for a
     * Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     */
    override fun configurationProperties(vararg configurationProperties: Any): Unit =
        configurationProperties(configurationProperties.toList())

    /**
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    override fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(IResolvable::unwrap))
    }

    /**
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    override
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(CfnCustomActionType.ArtifactDetailsProperty::unwrap))
    }

    /**
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     * commit ID. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f84e8cf236d8310af7ea8f4b3b2b68a9416a764f898131998f1424385f6219")
    override
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit):
        Unit =
        inputArtifactDetails(CfnCustomActionType.ArtifactDetailsProperty(inputArtifactDetails))

    /**
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    override fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(IResolvable::unwrap))
    }

    /**
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    override
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(CfnCustomActionType.ArtifactDetailsProperty::unwrap))
    }

    /**
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     * commit ID. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1b8dd7bd6bf87a1c00cb7572423f40f49007c3e3fdb96fc02bd89462e1844c")
    override
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit):
        Unit =
        outputArtifactDetails(CfnCustomActionType.ArtifactDetailsProperty(outputArtifactDetails))

    /**
     * @param provider The provider of the service used in the custom action, such as CodeDeploy. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * @param tags The tags for the custom action.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the custom action.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param settings URLs that provide users information about this custom action.
     */
    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    /**
     * @param settings URLs that provide users information about this custom action.
     */
    override fun tings(settings: CfnCustomActionType.SettingsProperty) {
      cdkBuilder.settings(settings.let(CfnCustomActionType.SettingsProperty::unwrap))
    }

    /**
     * @param settings URLs that provide users information about this custom action.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5dad734a778bd8f7c0451e773d7159ec6f4e3d028fe71958bfd43ec648fb9d3")
    override fun tings(settings: CfnCustomActionType.SettingsProperty.Builder.() -> Unit): Unit =
        tings(CfnCustomActionType.SettingsProperty(settings))

    /**
     * @param version The version identifier of the custom action. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps,
  ) : CdkObject(cdkObject), CfnCustomActionTypeProps {
    /**
     * The category of the custom action, such as a build action or a test action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
     */
    override fun category(): String = unwrap(this).getCategory()

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
     */
    override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     */
    override fun inputArtifactDetails(): Any = unwrap(this).getInputArtifactDetails()

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     */
    override fun outputArtifactDetails(): Any = unwrap(this).getOutputArtifactDetails()

    /**
     * The provider of the service used in the custom action, such as CodeDeploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
     */
    override fun provider(): String = unwrap(this).getProvider()

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     */
    override fun settings(): Any? = unwrap(this).getSettings()

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The version identifier of the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomActionTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps):
        CfnCustomActionTypeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomActionTypeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomActionTypeProps):
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
  }
}
