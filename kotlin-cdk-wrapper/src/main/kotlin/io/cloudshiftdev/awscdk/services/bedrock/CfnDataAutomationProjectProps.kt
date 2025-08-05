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
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataAutomationProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnDataAutomationProjectProps cfnDataAutomationProjectProps =
 * CfnDataAutomationProjectProps.builder()
 * .projectName("projectName")
 * // the properties below are optional
 * .customOutputConfiguration(CustomOutputConfigurationProperty.builder()
 * .blueprints(List.of(BlueprintItemProperty.builder()
 * .blueprintArn("blueprintArn")
 * // the properties below are optional
 * .blueprintStage("blueprintStage")
 * .blueprintVersion("blueprintVersion")
 * .build()))
 * .build())
 * .kmsEncryptionContext(Map.of(
 * "kmsEncryptionContextKey", "kmsEncryptionContext"))
 * .kmsKeyId("kmsKeyId")
 * .overrideConfiguration(OverrideConfigurationProperty.builder()
 * .audio(AudioOverrideConfigurationProperty.builder()
 * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
 * .state("state")
 * .build())
 * .build())
 * .document(DocumentOverrideConfigurationProperty.builder()
 * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
 * .state("state")
 * .build())
 * .splitter(SplitterConfigurationProperty.builder()
 * .state("state")
 * .build())
 * .build())
 * .image(ImageOverrideConfigurationProperty.builder()
 * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
 * .state("state")
 * .build())
 * .build())
 * .modalityRouting(ModalityRoutingConfigurationProperty.builder()
 * .jpeg("jpeg")
 * .mov("mov")
 * .mp4("mp4")
 * .png("png")
 * .build())
 * .video(VideoOverrideConfigurationProperty.builder()
 * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
 * .state("state")
 * .build())
 * .build())
 * .build())
 * .projectDescription("projectDescription")
 * .standardOutputConfiguration(StandardOutputConfigurationProperty.builder()
 * .audio(AudioStandardOutputConfigurationProperty.builder()
 * .extraction(AudioStandardExtractionProperty.builder()
 * .category(AudioExtractionCategoryProperty.builder()
 * .state("state")
 * // the properties below are optional
 * .types(List.of("types"))
 * .build())
 * .build())
 * .generativeField(AudioStandardGenerativeFieldProperty.builder()
 * .state("state")
 * // the properties below are optional
 * .types(List.of("types"))
 * .build())
 * .build())
 * .document(DocumentStandardOutputConfigurationProperty.builder()
 * .extraction(DocumentStandardExtractionProperty.builder()
 * .boundingBox(DocumentBoundingBoxProperty.builder()
 * .state("state")
 * .build())
 * .granularity(DocumentExtractionGranularityProperty.builder()
 * .types(List.of("types"))
 * .build())
 * .build())
 * .generativeField(DocumentStandardGenerativeFieldProperty.builder()
 * .state("state")
 * .build())
 * .outputFormat(DocumentOutputFormatProperty.builder()
 * .additionalFileFormat(DocumentOutputAdditionalFileFormatProperty.builder()
 * .state("state")
 * .build())
 * .textFormat(DocumentOutputTextFormatProperty.builder()
 * .types(List.of("types"))
 * .build())
 * .build())
 * .build())
 * .image(ImageStandardOutputConfigurationProperty.builder()
 * .extraction(ImageStandardExtractionProperty.builder()
 * .boundingBox(ImageBoundingBoxProperty.builder()
 * .state("state")
 * .build())
 * .category(ImageExtractionCategoryProperty.builder()
 * .state("state")
 * // the properties below are optional
 * .types(List.of("types"))
 * .build())
 * .build())
 * .generativeField(ImageStandardGenerativeFieldProperty.builder()
 * .state("state")
 * // the properties below are optional
 * .types(List.of("types"))
 * .build())
 * .build())
 * .video(VideoStandardOutputConfigurationProperty.builder()
 * .extraction(VideoStandardExtractionProperty.builder()
 * .boundingBox(VideoBoundingBoxProperty.builder()
 * .state("state")
 * .build())
 * .category(VideoExtractionCategoryProperty.builder()
 * .state("state")
 * // the properties below are optional
 * .types(List.of("types"))
 * .build())
 * .build())
 * .generativeField(VideoStandardGenerativeFieldProperty.builder()
 * .state("state")
 * // the properties below are optional
 * .types(List.of("types"))
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html)
 */
public interface CfnDataAutomationProjectProps {
  /**
   * Blueprints to apply to objects processed by the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
   */
  public fun customOutputConfiguration(): Any? = unwrap(this).getCustomOutputConfiguration()

  /**
   * The AWS KMS encryption context to use for encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmsencryptioncontext)
   */
  public fun kmsEncryptionContext(): Any? = unwrap(this).getKmsEncryptionContext()

  /**
   * The AWS KMS key to use for encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Additional settings for the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
   */
  public fun overrideConfiguration(): Any? = unwrap(this).getOverrideConfiguration()

  /**
   * The project's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectdescription)
   */
  public fun projectDescription(): String? = unwrap(this).getProjectDescription()

  /**
   * The project's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectname)
   */
  public fun projectName(): String

  /**
   * The project's standard output configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
   */
  public fun standardOutputConfiguration(): Any? = unwrap(this).getStandardOutputConfiguration()

  /**
   * List of Tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataAutomationProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project.
     */
    public fun customOutputConfiguration(customOutputConfiguration: IResolvable)

    /**
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project.
     */
    public
        fun customOutputConfiguration(customOutputConfiguration: CfnDataAutomationProject.CustomOutputConfigurationProperty)

    /**
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb95429d9f08a911c0f9edca67c1dbabedd8fc58c6e1d7b90f64cd10dda5b181")
    public
        fun customOutputConfiguration(customOutputConfiguration: CfnDataAutomationProject.CustomOutputConfigurationProperty.Builder.() -> Unit)

    /**
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption.
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>)

    /**
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption.
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: IResolvable)

    /**
     * @param kmsKeyId The AWS KMS key to use for encryption.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param overrideConfiguration Additional settings for the project.
     */
    public fun overrideConfiguration(overrideConfiguration: IResolvable)

    /**
     * @param overrideConfiguration Additional settings for the project.
     */
    public
        fun overrideConfiguration(overrideConfiguration: CfnDataAutomationProject.OverrideConfigurationProperty)

    /**
     * @param overrideConfiguration Additional settings for the project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50cbe63c89236eeba2bc7c420c9460db50622741180bd900eb2a3641189dd51e")
    public
        fun overrideConfiguration(overrideConfiguration: CfnDataAutomationProject.OverrideConfigurationProperty.Builder.() -> Unit)

    /**
     * @param projectDescription The project's description.
     */
    public fun projectDescription(projectDescription: String)

    /**
     * @param projectName The project's name. 
     */
    public fun projectName(projectName: String)

    /**
     * @param standardOutputConfiguration The project's standard output configuration.
     */
    public fun standardOutputConfiguration(standardOutputConfiguration: IResolvable)

    /**
     * @param standardOutputConfiguration The project's standard output configuration.
     */
    public
        fun standardOutputConfiguration(standardOutputConfiguration: CfnDataAutomationProject.StandardOutputConfigurationProperty)

    /**
     * @param standardOutputConfiguration The project's standard output configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("565c4720be3cda52b32da8a1db93d9ddfe476b7b9e143821704fe3bd6f9c11aa")
    public
        fun standardOutputConfiguration(standardOutputConfiguration: CfnDataAutomationProject.StandardOutputConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags List of Tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags List of Tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps.builder()

    /**
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project.
     */
    override fun customOutputConfiguration(customOutputConfiguration: IResolvable) {
      cdkBuilder.customOutputConfiguration(customOutputConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project.
     */
    override
        fun customOutputConfiguration(customOutputConfiguration: CfnDataAutomationProject.CustomOutputConfigurationProperty) {
      cdkBuilder.customOutputConfiguration(customOutputConfiguration.let(CfnDataAutomationProject.CustomOutputConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb95429d9f08a911c0f9edca67c1dbabedd8fc58c6e1d7b90f64cd10dda5b181")
    override
        fun customOutputConfiguration(customOutputConfiguration: CfnDataAutomationProject.CustomOutputConfigurationProperty.Builder.() -> Unit):
        Unit =
        customOutputConfiguration(CfnDataAutomationProject.CustomOutputConfigurationProperty(customOutputConfiguration))

    /**
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption.
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext)
    }

    /**
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption.
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: IResolvable) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kmsKeyId The AWS KMS key to use for encryption.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param overrideConfiguration Additional settings for the project.
     */
    override fun overrideConfiguration(overrideConfiguration: IResolvable) {
      cdkBuilder.overrideConfiguration(overrideConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param overrideConfiguration Additional settings for the project.
     */
    override
        fun overrideConfiguration(overrideConfiguration: CfnDataAutomationProject.OverrideConfigurationProperty) {
      cdkBuilder.overrideConfiguration(overrideConfiguration.let(CfnDataAutomationProject.OverrideConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param overrideConfiguration Additional settings for the project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50cbe63c89236eeba2bc7c420c9460db50622741180bd900eb2a3641189dd51e")
    override
        fun overrideConfiguration(overrideConfiguration: CfnDataAutomationProject.OverrideConfigurationProperty.Builder.() -> Unit):
        Unit =
        overrideConfiguration(CfnDataAutomationProject.OverrideConfigurationProperty(overrideConfiguration))

    /**
     * @param projectDescription The project's description.
     */
    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * @param projectName The project's name. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param standardOutputConfiguration The project's standard output configuration.
     */
    override fun standardOutputConfiguration(standardOutputConfiguration: IResolvable) {
      cdkBuilder.standardOutputConfiguration(standardOutputConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param standardOutputConfiguration The project's standard output configuration.
     */
    override
        fun standardOutputConfiguration(standardOutputConfiguration: CfnDataAutomationProject.StandardOutputConfigurationProperty) {
      cdkBuilder.standardOutputConfiguration(standardOutputConfiguration.let(CfnDataAutomationProject.StandardOutputConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param standardOutputConfiguration The project's standard output configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("565c4720be3cda52b32da8a1db93d9ddfe476b7b9e143821704fe3bd6f9c11aa")
    override
        fun standardOutputConfiguration(standardOutputConfiguration: CfnDataAutomationProject.StandardOutputConfigurationProperty.Builder.() -> Unit):
        Unit =
        standardOutputConfiguration(CfnDataAutomationProject.StandardOutputConfigurationProperty(standardOutputConfiguration))

    /**
     * @param tags List of Tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags List of Tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps,
  ) : CdkObject(cdkObject),
      CfnDataAutomationProjectProps {
    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     */
    override fun customOutputConfiguration(): Any? = unwrap(this).getCustomOutputConfiguration()

    /**
     * The AWS KMS encryption context to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmsencryptioncontext)
     */
    override fun kmsEncryptionContext(): Any? = unwrap(this).getKmsEncryptionContext()

    /**
     * The AWS KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     */
    override fun overrideConfiguration(): Any? = unwrap(this).getOverrideConfiguration()

    /**
     * The project's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectdescription)
     */
    override fun projectDescription(): String? = unwrap(this).getProjectDescription()

    /**
     * The project's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectname)
     */
    override fun projectName(): String = unwrap(this).getProjectName()

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     */
    override fun standardOutputConfiguration(): Any? = unwrap(this).getStandardOutputConfiguration()

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataAutomationProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps):
        CfnDataAutomationProjectProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDataAutomationProjectProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataAutomationProjectProps):
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps
  }
}
