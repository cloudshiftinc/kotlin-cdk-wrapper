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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A data automation project.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnDataAutomationProject cfnDataAutomationProject = CfnDataAutomationProject.Builder.create(this,
 * "MyCfnDataAutomationProject")
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
public open class CfnDataAutomationProject(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataAutomationProjectProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnDataAutomationProject(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataAutomationProjectProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataAutomationProjectProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataAutomationProjectProps(props)
  )

  /**
   * When the project was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * When the project was last updated.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The project's ARN.
   */
  public open fun attrProjectArn(): String = unwrap(this).getAttrProjectArn()

  /**
   * The project's stage.
   */
  public open fun attrProjectStage(): String = unwrap(this).getAttrProjectStage()

  /**
   * The project's status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Blueprints to apply to objects processed by the project.
   */
  public open fun customOutputConfiguration(): Any? = unwrap(this).getCustomOutputConfiguration()

  /**
   * Blueprints to apply to objects processed by the project.
   */
  public open fun customOutputConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomOutputConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Blueprints to apply to objects processed by the project.
   */
  public open fun customOutputConfiguration(`value`: CustomOutputConfigurationProperty) {
    unwrap(this).setCustomOutputConfiguration(`value`.let(CustomOutputConfigurationProperty.Companion::unwrap))
  }

  /**
   * Blueprints to apply to objects processed by the project.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46cb74af72b26634887fb2d59f76fcde15b1f4ec2bd456420a8f6afd00c85f5f")
  public open
      fun customOutputConfiguration(`value`: CustomOutputConfigurationProperty.Builder.() -> Unit):
      Unit = customOutputConfiguration(CustomOutputConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The AWS KMS encryption context to use for encryption.
   */
  public open fun kmsEncryptionContext(): Any? = unwrap(this).getKmsEncryptionContext()

  /**
   * The AWS KMS encryption context to use for encryption.
   */
  public open fun kmsEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setKmsEncryptionContext(`value`)
  }

  /**
   * The AWS KMS encryption context to use for encryption.
   */
  public open fun kmsEncryptionContext(`value`: IResolvable) {
    unwrap(this).setKmsEncryptionContext(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The AWS KMS key to use for encryption.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS KMS key to use for encryption.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Additional settings for the project.
   */
  public open fun overrideConfiguration(): Any? = unwrap(this).getOverrideConfiguration()

  /**
   * Additional settings for the project.
   */
  public open fun overrideConfiguration(`value`: IResolvable) {
    unwrap(this).setOverrideConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Additional settings for the project.
   */
  public open fun overrideConfiguration(`value`: OverrideConfigurationProperty) {
    unwrap(this).setOverrideConfiguration(`value`.let(OverrideConfigurationProperty.Companion::unwrap))
  }

  /**
   * Additional settings for the project.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e9c661d8be2c2231a8cea287d9af914104f2caf369c835bf56f230ebe877673")
  public open fun overrideConfiguration(`value`: OverrideConfigurationProperty.Builder.() -> Unit):
      Unit = overrideConfiguration(OverrideConfigurationProperty(`value`))

  /**
   * The project's description.
   */
  public open fun projectDescription(): String? = unwrap(this).getProjectDescription()

  /**
   * The project's description.
   */
  public open fun projectDescription(`value`: String) {
    unwrap(this).setProjectDescription(`value`)
  }

  /**
   * The project's name.
   */
  public open fun projectName(): String = unwrap(this).getProjectName()

  /**
   * The project's name.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * The project's standard output configuration.
   */
  public open fun standardOutputConfiguration(): Any? =
      unwrap(this).getStandardOutputConfiguration()

  /**
   * The project's standard output configuration.
   */
  public open fun standardOutputConfiguration(`value`: IResolvable) {
    unwrap(this).setStandardOutputConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The project's standard output configuration.
   */
  public open fun standardOutputConfiguration(`value`: StandardOutputConfigurationProperty) {
    unwrap(this).setStandardOutputConfiguration(`value`.let(StandardOutputConfigurationProperty.Companion::unwrap))
  }

  /**
   * The project's standard output configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7e4495e2229bda8ebd8269ffa96cb18efed49cf712c3256893c19e40c89eb9f")
  public open
      fun standardOutputConfiguration(`value`: StandardOutputConfigurationProperty.Builder.() -> Unit):
      Unit = standardOutputConfiguration(StandardOutputConfigurationProperty(`value`))

  /**
   * List of Tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * List of Tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * List of Tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnDataAutomationProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project. 
     */
    public fun customOutputConfiguration(customOutputConfiguration: IResolvable)

    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project. 
     */
    public
        fun customOutputConfiguration(customOutputConfiguration: CustomOutputConfigurationProperty)

    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e89ec9f5b62583e13fa69d0b0e4bbe0de8624a9d5e8272fcba9db1c4b24f789c")
    public
        fun customOutputConfiguration(customOutputConfiguration: CustomOutputConfigurationProperty.Builder.() -> Unit)

    /**
     * The AWS KMS encryption context to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmsencryptioncontext)
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption. 
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>)

    /**
     * The AWS KMS encryption context to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmsencryptioncontext)
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption. 
     */
    public fun kmsEncryptionContext(kmsEncryptionContext: IResolvable)

    /**
     * The AWS KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmskeyid)
     * @param kmsKeyId The AWS KMS key to use for encryption. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     * @param overrideConfiguration Additional settings for the project. 
     */
    public fun overrideConfiguration(overrideConfiguration: IResolvable)

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     * @param overrideConfiguration Additional settings for the project. 
     */
    public fun overrideConfiguration(overrideConfiguration: OverrideConfigurationProperty)

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     * @param overrideConfiguration Additional settings for the project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8845afe6941cc1b6d7d5347b690d9b3db3fe5ef71954f6959ba93a1329582aa5")
    public
        fun overrideConfiguration(overrideConfiguration: OverrideConfigurationProperty.Builder.() -> Unit)

    /**
     * The project's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectdescription)
     * @param projectDescription The project's description. 
     */
    public fun projectDescription(projectDescription: String)

    /**
     * The project's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectname)
     * @param projectName The project's name. 
     */
    public fun projectName(projectName: String)

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     * @param standardOutputConfiguration The project's standard output configuration. 
     */
    public fun standardOutputConfiguration(standardOutputConfiguration: IResolvable)

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     * @param standardOutputConfiguration The project's standard output configuration. 
     */
    public
        fun standardOutputConfiguration(standardOutputConfiguration: StandardOutputConfigurationProperty)

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     * @param standardOutputConfiguration The project's standard output configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c168380d3614f6e943343bda0d3db76dc2acae4334a13560caec8c043b489ae0")
    public
        fun standardOutputConfiguration(standardOutputConfiguration: StandardOutputConfigurationProperty.Builder.() -> Unit)

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-tags)
     * @param tags List of Tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-tags)
     * @param tags List of Tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.Builder
        = software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.Builder.create(scope, id)

    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project. 
     */
    override fun customOutputConfiguration(customOutputConfiguration: IResolvable) {
      cdkBuilder.customOutputConfiguration(customOutputConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project. 
     */
    override
        fun customOutputConfiguration(customOutputConfiguration: CustomOutputConfigurationProperty) {
      cdkBuilder.customOutputConfiguration(customOutputConfiguration.let(CustomOutputConfigurationProperty.Companion::unwrap))
    }

    /**
     * Blueprints to apply to objects processed by the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-customoutputconfiguration)
     * @param customOutputConfiguration Blueprints to apply to objects processed by the project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e89ec9f5b62583e13fa69d0b0e4bbe0de8624a9d5e8272fcba9db1c4b24f789c")
    override
        fun customOutputConfiguration(customOutputConfiguration: CustomOutputConfigurationProperty.Builder.() -> Unit):
        Unit =
        customOutputConfiguration(CustomOutputConfigurationProperty(customOutputConfiguration))

    /**
     * The AWS KMS encryption context to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmsencryptioncontext)
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption. 
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: Map<String, String>) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext)
    }

    /**
     * The AWS KMS encryption context to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmsencryptioncontext)
     * @param kmsEncryptionContext The AWS KMS encryption context to use for encryption. 
     */
    override fun kmsEncryptionContext(kmsEncryptionContext: IResolvable) {
      cdkBuilder.kmsEncryptionContext(kmsEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * The AWS KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-kmskeyid)
     * @param kmsKeyId The AWS KMS key to use for encryption. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     * @param overrideConfiguration Additional settings for the project. 
     */
    override fun overrideConfiguration(overrideConfiguration: IResolvable) {
      cdkBuilder.overrideConfiguration(overrideConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     * @param overrideConfiguration Additional settings for the project. 
     */
    override fun overrideConfiguration(overrideConfiguration: OverrideConfigurationProperty) {
      cdkBuilder.overrideConfiguration(overrideConfiguration.let(OverrideConfigurationProperty.Companion::unwrap))
    }

    /**
     * Additional settings for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-overrideconfiguration)
     * @param overrideConfiguration Additional settings for the project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8845afe6941cc1b6d7d5347b690d9b3db3fe5ef71954f6959ba93a1329582aa5")
    override
        fun overrideConfiguration(overrideConfiguration: OverrideConfigurationProperty.Builder.() -> Unit):
        Unit = overrideConfiguration(OverrideConfigurationProperty(overrideConfiguration))

    /**
     * The project's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectdescription)
     * @param projectDescription The project's description. 
     */
    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * The project's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-projectname)
     * @param projectName The project's name. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     * @param standardOutputConfiguration The project's standard output configuration. 
     */
    override fun standardOutputConfiguration(standardOutputConfiguration: IResolvable) {
      cdkBuilder.standardOutputConfiguration(standardOutputConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     * @param standardOutputConfiguration The project's standard output configuration. 
     */
    override
        fun standardOutputConfiguration(standardOutputConfiguration: StandardOutputConfigurationProperty) {
      cdkBuilder.standardOutputConfiguration(standardOutputConfiguration.let(StandardOutputConfigurationProperty.Companion::unwrap))
    }

    /**
     * The project's standard output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration)
     * @param standardOutputConfiguration The project's standard output configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c168380d3614f6e943343bda0d3db76dc2acae4334a13560caec8c043b489ae0")
    override
        fun standardOutputConfiguration(standardOutputConfiguration: StandardOutputConfigurationProperty.Builder.() -> Unit):
        Unit =
        standardOutputConfiguration(StandardOutputConfigurationProperty(standardOutputConfiguration))

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-tags)
     * @param tags List of Tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * List of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-dataautomationproject.html#cfn-bedrock-dataautomationproject-tags)
     * @param tags List of Tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnDataAutomationProject =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataAutomationProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataAutomationProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject):
        CfnDataAutomationProject = CfnDataAutomationProject(cdkObject)

    internal fun unwrap(wrapped: CfnDataAutomationProject):
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProject = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnDataAutomationProject
  }

  /**
   * Settings for generating data from audio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AudioExtractionCategoryProperty audioExtractionCategoryProperty =
   * AudioExtractionCategoryProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audioextractioncategory.html)
   */
  public interface AudioExtractionCategoryProperty {
    /**
     * Whether generating categorical data from audio is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audioextractioncategory.html#cfn-bedrock-dataautomationproject-audioextractioncategory-state)
     */
    public fun state(): String

    /**
     * The types of data to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audioextractioncategory.html#cfn-bedrock-dataautomationproject-audioextractioncategory-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [AudioExtractionCategoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating categorical data from audio is enabled. 
       */
      public fun state(state: String)

      /**
       * @param types The types of data to generate.
       */
      public fun types(types: List<String>)

      /**
       * @param types The types of data to generate.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty.builder()

      /**
       * @param state Whether generating categorical data from audio is enabled. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param types The types of data to generate.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The types of data to generate.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty,
    ) : CdkObject(cdkObject),
        AudioExtractionCategoryProperty {
      /**
       * Whether generating categorical data from audio is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audioextractioncategory.html#cfn-bedrock-dataautomationproject-audioextractioncategory-state)
       */
      override fun state(): String = unwrap(this).getState()

      /**
       * The types of data to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audioextractioncategory.html#cfn-bedrock-dataautomationproject-audioextractioncategory-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioExtractionCategoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty):
          AudioExtractionCategoryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioExtractionCategoryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioExtractionCategoryProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioExtractionCategoryProperty
    }
  }

  /**
   * Sets whether your project will process audio or not.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AudioOverrideConfigurationProperty audioOverrideConfigurationProperty =
   * AudioOverrideConfigurationProperty.builder()
   * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
   * .state("state")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiooverrideconfiguration.html)
   */
  public interface AudioOverrideConfigurationProperty {
    /**
     * Sets modality processing for audio files.
     *
     * All modalities are enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiooverrideconfiguration.html#cfn-bedrock-dataautomationproject-audiooverrideconfiguration-modalityprocessing)
     */
    public fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()

    /**
     * A builder for [AudioOverrideConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modalityProcessing Sets modality processing for audio files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: IResolvable)

      /**
       * @param modalityProcessing Sets modality processing for audio files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty)

      /**
       * @param modalityProcessing Sets modality processing for audio files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab5a0ab667975b4538b0c5c398f54f9764252b8102b45ef0901b5831dd8ea0c5")
      public
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty.builder()

      /**
       * @param modalityProcessing Sets modality processing for audio files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: IResolvable) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for audio files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(ModalityProcessingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for audio files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab5a0ab667975b4538b0c5c398f54f9764252b8102b45ef0901b5831dd8ea0c5")
      override
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = modalityProcessing(ModalityProcessingConfigurationProperty(modalityProcessing))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty,
    ) : CdkObject(cdkObject),
        AudioOverrideConfigurationProperty {
      /**
       * Sets modality processing for audio files.
       *
       * All modalities are enabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiooverrideconfiguration.html#cfn-bedrock-dataautomationproject-audiooverrideconfiguration-modalityprocessing)
       */
      override fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioOverrideConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty):
          AudioOverrideConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioOverrideConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioOverrideConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioOverrideConfigurationProperty
    }
  }

  /**
   * Settings for generating data from audio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AudioStandardExtractionProperty audioStandardExtractionProperty =
   * AudioStandardExtractionProperty.builder()
   * .category(AudioExtractionCategoryProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardextraction.html)
   */
  public interface AudioStandardExtractionProperty {
    /**
     * Settings for generating data from audio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardextraction.html#cfn-bedrock-dataautomationproject-audiostandardextraction-category)
     */
    public fun category(): Any

    /**
     * A builder for [AudioStandardExtractionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param category Settings for generating data from audio. 
       */
      public fun category(category: IResolvable)

      /**
       * @param category Settings for generating data from audio. 
       */
      public fun category(category: AudioExtractionCategoryProperty)

      /**
       * @param category Settings for generating data from audio. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81e96d5fd48917726ae343c5ad3724e0409c451d76cf06fdff7594d9083f4f30")
      public fun category(category: AudioExtractionCategoryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty.builder()

      /**
       * @param category Settings for generating data from audio. 
       */
      override fun category(category: IResolvable) {
        cdkBuilder.category(category.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param category Settings for generating data from audio. 
       */
      override fun category(category: AudioExtractionCategoryProperty) {
        cdkBuilder.category(category.let(AudioExtractionCategoryProperty.Companion::unwrap))
      }

      /**
       * @param category Settings for generating data from audio. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81e96d5fd48917726ae343c5ad3724e0409c451d76cf06fdff7594d9083f4f30")
      override fun category(category: AudioExtractionCategoryProperty.Builder.() -> Unit): Unit =
          category(AudioExtractionCategoryProperty(category))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty,
    ) : CdkObject(cdkObject),
        AudioStandardExtractionProperty {
      /**
       * Settings for generating data from audio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardextraction.html#cfn-bedrock-dataautomationproject-audiostandardextraction-category)
       */
      override fun category(): Any = unwrap(this).getCategory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioStandardExtractionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty):
          AudioStandardExtractionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioStandardExtractionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioStandardExtractionProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardExtractionProperty
    }
  }

  /**
   * Settings for generating descriptions of audio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AudioStandardGenerativeFieldProperty audioStandardGenerativeFieldProperty =
   * AudioStandardGenerativeFieldProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardgenerativefield.html)
   */
  public interface AudioStandardGenerativeFieldProperty {
    /**
     * Whether generating descriptions is enabled for audio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardgenerativefield.html#cfn-bedrock-dataautomationproject-audiostandardgenerativefield-state)
     */
    public fun state(): String

    /**
     * The types of description to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardgenerativefield.html#cfn-bedrock-dataautomationproject-audiostandardgenerativefield-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [AudioStandardGenerativeFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating descriptions is enabled for audio. 
       */
      public fun state(state: String)

      /**
       * @param types The types of description to generate.
       */
      public fun types(types: List<String>)

      /**
       * @param types The types of description to generate.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty.builder()

      /**
       * @param state Whether generating descriptions is enabled for audio. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param types The types of description to generate.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The types of description to generate.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty,
    ) : CdkObject(cdkObject),
        AudioStandardGenerativeFieldProperty {
      /**
       * Whether generating descriptions is enabled for audio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardgenerativefield.html#cfn-bedrock-dataautomationproject-audiostandardgenerativefield-state)
       */
      override fun state(): String = unwrap(this).getState()

      /**
       * The types of description to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardgenerativefield.html#cfn-bedrock-dataautomationproject-audiostandardgenerativefield-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioStandardGenerativeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty):
          AudioStandardGenerativeFieldProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioStandardGenerativeFieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioStandardGenerativeFieldProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardGenerativeFieldProperty
    }
  }

  /**
   * Output settings for processing audio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AudioStandardOutputConfigurationProperty audioStandardOutputConfigurationProperty =
   * AudioStandardOutputConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardoutputconfiguration.html)
   */
  public interface AudioStandardOutputConfigurationProperty {
    /**
     * Settings for populating data fields that describe the audio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-audiostandardoutputconfiguration-extraction)
     */
    public fun extraction(): Any? = unwrap(this).getExtraction()

    /**
     * Whether to generate descriptions of the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-audiostandardoutputconfiguration-generativefield)
     */
    public fun generativeField(): Any? = unwrap(this).getGenerativeField()

    /**
     * A builder for [AudioStandardOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extraction Settings for populating data fields that describe the audio.
       */
      public fun extraction(extraction: IResolvable)

      /**
       * @param extraction Settings for populating data fields that describe the audio.
       */
      public fun extraction(extraction: AudioStandardExtractionProperty)

      /**
       * @param extraction Settings for populating data fields that describe the audio.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deba3dfb7ced64f13b98326942edf77bf720f6c1193fb21d54e2053e35fdd848")
      public fun extraction(extraction: AudioStandardExtractionProperty.Builder.() -> Unit)

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      public fun generativeField(generativeField: IResolvable)

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      public fun generativeField(generativeField: AudioStandardGenerativeFieldProperty)

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b41a2c79c595d6763ea910145aa8e9a4d5f094a538103e5c691b046be095b6d")
      public
          fun generativeField(generativeField: AudioStandardGenerativeFieldProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty.builder()

      /**
       * @param extraction Settings for populating data fields that describe the audio.
       */
      override fun extraction(extraction: IResolvable) {
        cdkBuilder.extraction(extraction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the audio.
       */
      override fun extraction(extraction: AudioStandardExtractionProperty) {
        cdkBuilder.extraction(extraction.let(AudioStandardExtractionProperty.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the audio.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deba3dfb7ced64f13b98326942edf77bf720f6c1193fb21d54e2053e35fdd848")
      override fun extraction(extraction: AudioStandardExtractionProperty.Builder.() -> Unit): Unit
          = extraction(AudioStandardExtractionProperty(extraction))

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      override fun generativeField(generativeField: IResolvable) {
        cdkBuilder.generativeField(generativeField.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      override fun generativeField(generativeField: AudioStandardGenerativeFieldProperty) {
        cdkBuilder.generativeField(generativeField.let(AudioStandardGenerativeFieldProperty.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b41a2c79c595d6763ea910145aa8e9a4d5f094a538103e5c691b046be095b6d")
      override
          fun generativeField(generativeField: AudioStandardGenerativeFieldProperty.Builder.() -> Unit):
          Unit = generativeField(AudioStandardGenerativeFieldProperty(generativeField))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        AudioStandardOutputConfigurationProperty {
      /**
       * Settings for populating data fields that describe the audio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-audiostandardoutputconfiguration-extraction)
       */
      override fun extraction(): Any? = unwrap(this).getExtraction()

      /**
       * Whether to generate descriptions of the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-audiostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-audiostandardoutputconfiguration-generativefield)
       */
      override fun generativeField(): Any? = unwrap(this).getGenerativeField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioStandardOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty):
          AudioStandardOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioStandardOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioStandardOutputConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.AudioStandardOutputConfigurationProperty
    }
  }

  /**
   * An abbreviated summary of a blueprint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * BlueprintItemProperty blueprintItemProperty = BlueprintItemProperty.builder()
   * .blueprintArn("blueprintArn")
   * // the properties below are optional
   * .blueprintStage("blueprintStage")
   * .blueprintVersion("blueprintVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html)
   */
  public interface BlueprintItemProperty {
    /**
     * The blueprint's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html#cfn-bedrock-dataautomationproject-blueprintitem-blueprintarn)
     */
    public fun blueprintArn(): String

    /**
     * The blueprint's stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html#cfn-bedrock-dataautomationproject-blueprintitem-blueprintstage)
     */
    public fun blueprintStage(): String? = unwrap(this).getBlueprintStage()

    /**
     * The blueprint's version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html#cfn-bedrock-dataautomationproject-blueprintitem-blueprintversion)
     */
    public fun blueprintVersion(): String? = unwrap(this).getBlueprintVersion()

    /**
     * A builder for [BlueprintItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blueprintArn The blueprint's ARN. 
       */
      public fun blueprintArn(blueprintArn: String)

      /**
       * @param blueprintStage The blueprint's stage.
       */
      public fun blueprintStage(blueprintStage: String)

      /**
       * @param blueprintVersion The blueprint's version.
       */
      public fun blueprintVersion(blueprintVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty.builder()

      /**
       * @param blueprintArn The blueprint's ARN. 
       */
      override fun blueprintArn(blueprintArn: String) {
        cdkBuilder.blueprintArn(blueprintArn)
      }

      /**
       * @param blueprintStage The blueprint's stage.
       */
      override fun blueprintStage(blueprintStage: String) {
        cdkBuilder.blueprintStage(blueprintStage)
      }

      /**
       * @param blueprintVersion The blueprint's version.
       */
      override fun blueprintVersion(blueprintVersion: String) {
        cdkBuilder.blueprintVersion(blueprintVersion)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty,
    ) : CdkObject(cdkObject),
        BlueprintItemProperty {
      /**
       * The blueprint's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html#cfn-bedrock-dataautomationproject-blueprintitem-blueprintarn)
       */
      override fun blueprintArn(): String = unwrap(this).getBlueprintArn()

      /**
       * The blueprint's stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html#cfn-bedrock-dataautomationproject-blueprintitem-blueprintstage)
       */
      override fun blueprintStage(): String? = unwrap(this).getBlueprintStage()

      /**
       * The blueprint's version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-blueprintitem.html#cfn-bedrock-dataautomationproject-blueprintitem-blueprintversion)
       */
      override fun blueprintVersion(): String? = unwrap(this).getBlueprintVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlueprintItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty):
          BlueprintItemProperty = CdkObjectWrappers.wrap(cdkObject) as? BlueprintItemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueprintItemProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.BlueprintItemProperty
    }
  }

  /**
   * Blueprints to apply to objects processed by the project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * CustomOutputConfigurationProperty customOutputConfigurationProperty =
   * CustomOutputConfigurationProperty.builder()
   * .blueprints(List.of(BlueprintItemProperty.builder()
   * .blueprintArn("blueprintArn")
   * // the properties below are optional
   * .blueprintStage("blueprintStage")
   * .blueprintVersion("blueprintVersion")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-customoutputconfiguration.html)
   */
  public interface CustomOutputConfigurationProperty {
    /**
     * A list of blueprints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-customoutputconfiguration.html#cfn-bedrock-dataautomationproject-customoutputconfiguration-blueprints)
     */
    public fun blueprints(): Any? = unwrap(this).getBlueprints()

    /**
     * A builder for [CustomOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blueprints A list of blueprints.
       */
      public fun blueprints(blueprints: IResolvable)

      /**
       * @param blueprints A list of blueprints.
       */
      public fun blueprints(blueprints: List<Any>)

      /**
       * @param blueprints A list of blueprints.
       */
      public fun blueprints(vararg blueprints: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty.builder()

      /**
       * @param blueprints A list of blueprints.
       */
      override fun blueprints(blueprints: IResolvable) {
        cdkBuilder.blueprints(blueprints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blueprints A list of blueprints.
       */
      override fun blueprints(blueprints: List<Any>) {
        cdkBuilder.blueprints(blueprints.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param blueprints A list of blueprints.
       */
      override fun blueprints(vararg blueprints: Any): Unit = blueprints(blueprints.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        CustomOutputConfigurationProperty {
      /**
       * A list of blueprints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-customoutputconfiguration.html#cfn-bedrock-dataautomationproject-customoutputconfiguration-blueprints)
       */
      override fun blueprints(): Any? = unwrap(this).getBlueprints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty):
          CustomOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomOutputConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.CustomOutputConfigurationProperty
    }
  }

  /**
   * Bounding box settings for documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentBoundingBoxProperty documentBoundingBoxProperty = DocumentBoundingBoxProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentboundingbox.html)
   */
  public interface DocumentBoundingBoxProperty {
    /**
     * Whether bounding boxes are enabled for documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentboundingbox.html#cfn-bedrock-dataautomationproject-documentboundingbox-state)
     */
    public fun state(): String

    /**
     * A builder for [DocumentBoundingBoxProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether bounding boxes are enabled for documents. 
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty.builder()

      /**
       * @param state Whether bounding boxes are enabled for documents. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty,
    ) : CdkObject(cdkObject),
        DocumentBoundingBoxProperty {
      /**
       * Whether bounding boxes are enabled for documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentboundingbox.html#cfn-bedrock-dataautomationproject-documentboundingbox-state)
       */
      override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentBoundingBoxProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty):
          DocumentBoundingBoxProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentBoundingBoxProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentBoundingBoxProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentBoundingBoxProperty
    }
  }

  /**
   * Granularity settings for documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentExtractionGranularityProperty documentExtractionGranularityProperty =
   * DocumentExtractionGranularityProperty.builder()
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentextractiongranularity.html)
   */
  public interface DocumentExtractionGranularityProperty {
    /**
     * Granularity settings for documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentextractiongranularity.html#cfn-bedrock-dataautomationproject-documentextractiongranularity-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [DocumentExtractionGranularityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param types Granularity settings for documents.
       */
      public fun types(types: List<String>)

      /**
       * @param types Granularity settings for documents.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty.builder()

      /**
       * @param types Granularity settings for documents.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types Granularity settings for documents.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty,
    ) : CdkObject(cdkObject),
        DocumentExtractionGranularityProperty {
      /**
       * Granularity settings for documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentextractiongranularity.html#cfn-bedrock-dataautomationproject-documentextractiongranularity-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentExtractionGranularityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty):
          DocumentExtractionGranularityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentExtractionGranularityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentExtractionGranularityProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentExtractionGranularityProperty
    }
  }

  /**
   * Output settings for additional file formats.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentOutputAdditionalFileFormatProperty documentOutputAdditionalFileFormatProperty =
   * DocumentOutputAdditionalFileFormatProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputadditionalfileformat.html)
   */
  public interface DocumentOutputAdditionalFileFormatProperty {
    /**
     * Whether additional file formats are enabled for a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputadditionalfileformat.html#cfn-bedrock-dataautomationproject-documentoutputadditionalfileformat-state)
     */
    public fun state(): String

    /**
     * A builder for [DocumentOutputAdditionalFileFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether additional file formats are enabled for a project. 
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty.builder()

      /**
       * @param state Whether additional file formats are enabled for a project. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty,
    ) : CdkObject(cdkObject),
        DocumentOutputAdditionalFileFormatProperty {
      /**
       * Whether additional file formats are enabled for a project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputadditionalfileformat.html#cfn-bedrock-dataautomationproject-documentoutputadditionalfileformat-state)
       */
      override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentOutputAdditionalFileFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty):
          DocumentOutputAdditionalFileFormatProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentOutputAdditionalFileFormatProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentOutputAdditionalFileFormatProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputAdditionalFileFormatProperty
    }
  }

  /**
   * A document output format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentOutputFormatProperty documentOutputFormatProperty =
   * DocumentOutputFormatProperty.builder()
   * .additionalFileFormat(DocumentOutputAdditionalFileFormatProperty.builder()
   * .state("state")
   * .build())
   * .textFormat(DocumentOutputTextFormatProperty.builder()
   * .types(List.of("types"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputformat.html)
   */
  public interface DocumentOutputFormatProperty {
    /**
     * Output settings for additional file formats.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputformat.html#cfn-bedrock-dataautomationproject-documentoutputformat-additionalfileformat)
     */
    public fun additionalFileFormat(): Any

    /**
     * An output text format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputformat.html#cfn-bedrock-dataautomationproject-documentoutputformat-textformat)
     */
    public fun textFormat(): Any

    /**
     * A builder for [DocumentOutputFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalFileFormat Output settings for additional file formats. 
       */
      public fun additionalFileFormat(additionalFileFormat: IResolvable)

      /**
       * @param additionalFileFormat Output settings for additional file formats. 
       */
      public
          fun additionalFileFormat(additionalFileFormat: DocumentOutputAdditionalFileFormatProperty)

      /**
       * @param additionalFileFormat Output settings for additional file formats. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("849c33dc356189b00eb7a8caaee84ac364244cc1d3ce369c175881b28f890e31")
      public
          fun additionalFileFormat(additionalFileFormat: DocumentOutputAdditionalFileFormatProperty.Builder.() -> Unit)

      /**
       * @param textFormat An output text format. 
       */
      public fun textFormat(textFormat: IResolvable)

      /**
       * @param textFormat An output text format. 
       */
      public fun textFormat(textFormat: DocumentOutputTextFormatProperty)

      /**
       * @param textFormat An output text format. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8daa99d301978651b6082cfaea61eb5a97c8dc6e83656512211527f0649dae3a")
      public fun textFormat(textFormat: DocumentOutputTextFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty.builder()

      /**
       * @param additionalFileFormat Output settings for additional file formats. 
       */
      override fun additionalFileFormat(additionalFileFormat: IResolvable) {
        cdkBuilder.additionalFileFormat(additionalFileFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param additionalFileFormat Output settings for additional file formats. 
       */
      override
          fun additionalFileFormat(additionalFileFormat: DocumentOutputAdditionalFileFormatProperty) {
        cdkBuilder.additionalFileFormat(additionalFileFormat.let(DocumentOutputAdditionalFileFormatProperty.Companion::unwrap))
      }

      /**
       * @param additionalFileFormat Output settings for additional file formats. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("849c33dc356189b00eb7a8caaee84ac364244cc1d3ce369c175881b28f890e31")
      override
          fun additionalFileFormat(additionalFileFormat: DocumentOutputAdditionalFileFormatProperty.Builder.() -> Unit):
          Unit =
          additionalFileFormat(DocumentOutputAdditionalFileFormatProperty(additionalFileFormat))

      /**
       * @param textFormat An output text format. 
       */
      override fun textFormat(textFormat: IResolvable) {
        cdkBuilder.textFormat(textFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textFormat An output text format. 
       */
      override fun textFormat(textFormat: DocumentOutputTextFormatProperty) {
        cdkBuilder.textFormat(textFormat.let(DocumentOutputTextFormatProperty.Companion::unwrap))
      }

      /**
       * @param textFormat An output text format. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8daa99d301978651b6082cfaea61eb5a97c8dc6e83656512211527f0649dae3a")
      override fun textFormat(textFormat: DocumentOutputTextFormatProperty.Builder.() -> Unit): Unit
          = textFormat(DocumentOutputTextFormatProperty(textFormat))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty,
    ) : CdkObject(cdkObject),
        DocumentOutputFormatProperty {
      /**
       * Output settings for additional file formats.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputformat.html#cfn-bedrock-dataautomationproject-documentoutputformat-additionalfileformat)
       */
      override fun additionalFileFormat(): Any = unwrap(this).getAdditionalFileFormat()

      /**
       * An output text format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputformat.html#cfn-bedrock-dataautomationproject-documentoutputformat-textformat)
       */
      override fun textFormat(): Any = unwrap(this).getTextFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentOutputFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty):
          DocumentOutputFormatProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentOutputFormatProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentOutputFormatProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputFormatProperty
    }
  }

  /**
   * An output text format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentOutputTextFormatProperty documentOutputTextFormatProperty =
   * DocumentOutputTextFormatProperty.builder()
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputtextformat.html)
   */
  public interface DocumentOutputTextFormatProperty {
    /**
     * The types of output text to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputtextformat.html#cfn-bedrock-dataautomationproject-documentoutputtextformat-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [DocumentOutputTextFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param types The types of output text to generate.
       */
      public fun types(types: List<String>)

      /**
       * @param types The types of output text to generate.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty.builder()

      /**
       * @param types The types of output text to generate.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The types of output text to generate.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty,
    ) : CdkObject(cdkObject),
        DocumentOutputTextFormatProperty {
      /**
       * The types of output text to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoutputtextformat.html#cfn-bedrock-dataautomationproject-documentoutputtextformat-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentOutputTextFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty):
          DocumentOutputTextFormatProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentOutputTextFormatProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentOutputTextFormatProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOutputTextFormatProperty
    }
  }

  /**
   * Additional settings for a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentOverrideConfigurationProperty documentOverrideConfigurationProperty =
   * DocumentOverrideConfigurationProperty.builder()
   * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
   * .state("state")
   * .build())
   * .splitter(SplitterConfigurationProperty.builder()
   * .state("state")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoverrideconfiguration.html)
   */
  public interface DocumentOverrideConfigurationProperty {
    /**
     * Sets modality processing for document files.
     *
     * All modalities are enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoverrideconfiguration.html#cfn-bedrock-dataautomationproject-documentoverrideconfiguration-modalityprocessing)
     */
    public fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()

    /**
     * Whether document splitter is enabled for a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoverrideconfiguration.html#cfn-bedrock-dataautomationproject-documentoverrideconfiguration-splitter)
     */
    public fun splitter(): Any? = unwrap(this).getSplitter()

    /**
     * A builder for [DocumentOverrideConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modalityProcessing Sets modality processing for document files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: IResolvable)

      /**
       * @param modalityProcessing Sets modality processing for document files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty)

      /**
       * @param modalityProcessing Sets modality processing for document files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c52ab02341611cb8158d3e4ad656e20c20530c456aca9bc16b610007b7167dbb")
      public
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param splitter Whether document splitter is enabled for a project.
       */
      public fun splitter(splitter: IResolvable)

      /**
       * @param splitter Whether document splitter is enabled for a project.
       */
      public fun splitter(splitter: SplitterConfigurationProperty)

      /**
       * @param splitter Whether document splitter is enabled for a project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdd440a750a8f7cdceaed9c4be7c1937e4c540481601298ddd29764921a138b")
      public fun splitter(splitter: SplitterConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty.builder()

      /**
       * @param modalityProcessing Sets modality processing for document files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: IResolvable) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for document files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(ModalityProcessingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for document files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c52ab02341611cb8158d3e4ad656e20c20530c456aca9bc16b610007b7167dbb")
      override
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = modalityProcessing(ModalityProcessingConfigurationProperty(modalityProcessing))

      /**
       * @param splitter Whether document splitter is enabled for a project.
       */
      override fun splitter(splitter: IResolvable) {
        cdkBuilder.splitter(splitter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param splitter Whether document splitter is enabled for a project.
       */
      override fun splitter(splitter: SplitterConfigurationProperty) {
        cdkBuilder.splitter(splitter.let(SplitterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param splitter Whether document splitter is enabled for a project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdd440a750a8f7cdceaed9c4be7c1937e4c540481601298ddd29764921a138b")
      override fun splitter(splitter: SplitterConfigurationProperty.Builder.() -> Unit): Unit =
          splitter(SplitterConfigurationProperty(splitter))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty,
    ) : CdkObject(cdkObject),
        DocumentOverrideConfigurationProperty {
      /**
       * Sets modality processing for document files.
       *
       * All modalities are enabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoverrideconfiguration.html#cfn-bedrock-dataautomationproject-documentoverrideconfiguration-modalityprocessing)
       */
      override fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()

      /**
       * Whether document splitter is enabled for a project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentoverrideconfiguration.html#cfn-bedrock-dataautomationproject-documentoverrideconfiguration-splitter)
       */
      override fun splitter(): Any? = unwrap(this).getSplitter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentOverrideConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty):
          DocumentOverrideConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentOverrideConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentOverrideConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentOverrideConfigurationProperty
    }
  }

  /**
   * Settings for generating data from documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentStandardExtractionProperty documentStandardExtractionProperty =
   * DocumentStandardExtractionProperty.builder()
   * .boundingBox(DocumentBoundingBoxProperty.builder()
   * .state("state")
   * .build())
   * .granularity(DocumentExtractionGranularityProperty.builder()
   * .types(List.of("types"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardextraction.html)
   */
  public interface DocumentStandardExtractionProperty {
    /**
     * Whether to generate bounding boxes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardextraction.html#cfn-bedrock-dataautomationproject-documentstandardextraction-boundingbox)
     */
    public fun boundingBox(): Any

    /**
     * Which granularities to generate data for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardextraction.html#cfn-bedrock-dataautomationproject-documentstandardextraction-granularity)
     */
    public fun granularity(): Any

    /**
     * A builder for [DocumentStandardExtractionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param boundingBox Whether to generate bounding boxes. 
       */
      public fun boundingBox(boundingBox: IResolvable)

      /**
       * @param boundingBox Whether to generate bounding boxes. 
       */
      public fun boundingBox(boundingBox: DocumentBoundingBoxProperty)

      /**
       * @param boundingBox Whether to generate bounding boxes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81a539b40a4cbe85725605bcedd56561c5ea401215354c54b53a763ca4c19851")
      public fun boundingBox(boundingBox: DocumentBoundingBoxProperty.Builder.() -> Unit)

      /**
       * @param granularity Which granularities to generate data for. 
       */
      public fun granularity(granularity: IResolvable)

      /**
       * @param granularity Which granularities to generate data for. 
       */
      public fun granularity(granularity: DocumentExtractionGranularityProperty)

      /**
       * @param granularity Which granularities to generate data for. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7cccb1666dc5a99eedf89b9aba96573a704b1eb384f4e69493c4627c3a6f0645")
      public fun granularity(granularity: DocumentExtractionGranularityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty.builder()

      /**
       * @param boundingBox Whether to generate bounding boxes. 
       */
      override fun boundingBox(boundingBox: IResolvable) {
        cdkBuilder.boundingBox(boundingBox.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param boundingBox Whether to generate bounding boxes. 
       */
      override fun boundingBox(boundingBox: DocumentBoundingBoxProperty) {
        cdkBuilder.boundingBox(boundingBox.let(DocumentBoundingBoxProperty.Companion::unwrap))
      }

      /**
       * @param boundingBox Whether to generate bounding boxes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81a539b40a4cbe85725605bcedd56561c5ea401215354c54b53a763ca4c19851")
      override fun boundingBox(boundingBox: DocumentBoundingBoxProperty.Builder.() -> Unit): Unit =
          boundingBox(DocumentBoundingBoxProperty(boundingBox))

      /**
       * @param granularity Which granularities to generate data for. 
       */
      override fun granularity(granularity: IResolvable) {
        cdkBuilder.granularity(granularity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param granularity Which granularities to generate data for. 
       */
      override fun granularity(granularity: DocumentExtractionGranularityProperty) {
        cdkBuilder.granularity(granularity.let(DocumentExtractionGranularityProperty.Companion::unwrap))
      }

      /**
       * @param granularity Which granularities to generate data for. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7cccb1666dc5a99eedf89b9aba96573a704b1eb384f4e69493c4627c3a6f0645")
      override
          fun granularity(granularity: DocumentExtractionGranularityProperty.Builder.() -> Unit):
          Unit = granularity(DocumentExtractionGranularityProperty(granularity))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty,
    ) : CdkObject(cdkObject),
        DocumentStandardExtractionProperty {
      /**
       * Whether to generate bounding boxes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardextraction.html#cfn-bedrock-dataautomationproject-documentstandardextraction-boundingbox)
       */
      override fun boundingBox(): Any = unwrap(this).getBoundingBox()

      /**
       * Which granularities to generate data for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardextraction.html#cfn-bedrock-dataautomationproject-documentstandardextraction-granularity)
       */
      override fun granularity(): Any = unwrap(this).getGranularity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentStandardExtractionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty):
          DocumentStandardExtractionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentStandardExtractionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentStandardExtractionProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardExtractionProperty
    }
  }

  /**
   * Settings for generating descriptions of documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentStandardGenerativeFieldProperty documentStandardGenerativeFieldProperty =
   * DocumentStandardGenerativeFieldProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardgenerativefield.html)
   */
  public interface DocumentStandardGenerativeFieldProperty {
    /**
     * Whether generating descriptions is enabled for documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardgenerativefield.html#cfn-bedrock-dataautomationproject-documentstandardgenerativefield-state)
     */
    public fun state(): String

    /**
     * A builder for [DocumentStandardGenerativeFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating descriptions is enabled for documents. 
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty.builder()

      /**
       * @param state Whether generating descriptions is enabled for documents. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty,
    ) : CdkObject(cdkObject),
        DocumentStandardGenerativeFieldProperty {
      /**
       * Whether generating descriptions is enabled for documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardgenerativefield.html#cfn-bedrock-dataautomationproject-documentstandardgenerativefield-state)
       */
      override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentStandardGenerativeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty):
          DocumentStandardGenerativeFieldProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentStandardGenerativeFieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentStandardGenerativeFieldProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardGenerativeFieldProperty
    }
  }

  /**
   * Output settings for processing documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DocumentStandardOutputConfigurationProperty documentStandardOutputConfigurationProperty =
   * DocumentStandardOutputConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html)
   */
  public interface DocumentStandardOutputConfigurationProperty {
    /**
     * Settings for populating data fields that describe the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-documentstandardoutputconfiguration-extraction)
     */
    public fun extraction(): Any? = unwrap(this).getExtraction()

    /**
     * Whether to generate descriptions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-documentstandardoutputconfiguration-generativefield)
     */
    public fun generativeField(): Any? = unwrap(this).getGenerativeField()

    /**
     * The output format to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-documentstandardoutputconfiguration-outputformat)
     */
    public fun outputFormat(): Any? = unwrap(this).getOutputFormat()

    /**
     * A builder for [DocumentStandardOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extraction Settings for populating data fields that describe the document.
       */
      public fun extraction(extraction: IResolvable)

      /**
       * @param extraction Settings for populating data fields that describe the document.
       */
      public fun extraction(extraction: DocumentStandardExtractionProperty)

      /**
       * @param extraction Settings for populating data fields that describe the document.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f717c3e7e8bc4889a8f331f8c5b69c85da4bf316042e6148fdac41f2bdbf4880")
      public fun extraction(extraction: DocumentStandardExtractionProperty.Builder.() -> Unit)

      /**
       * @param generativeField Whether to generate descriptions.
       */
      public fun generativeField(generativeField: IResolvable)

      /**
       * @param generativeField Whether to generate descriptions.
       */
      public fun generativeField(generativeField: DocumentStandardGenerativeFieldProperty)

      /**
       * @param generativeField Whether to generate descriptions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45051c553c8a7f9bd36da523ba43c72b630d5a851d11ac4942060d5609340500")
      public
          fun generativeField(generativeField: DocumentStandardGenerativeFieldProperty.Builder.() -> Unit)

      /**
       * @param outputFormat The output format to generate.
       */
      public fun outputFormat(outputFormat: IResolvable)

      /**
       * @param outputFormat The output format to generate.
       */
      public fun outputFormat(outputFormat: DocumentOutputFormatProperty)

      /**
       * @param outputFormat The output format to generate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d9f4198fdde11706808f4d3143f6ed6f75d8bf68bf048432c757fc3b312cbe")
      public fun outputFormat(outputFormat: DocumentOutputFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty.builder()

      /**
       * @param extraction Settings for populating data fields that describe the document.
       */
      override fun extraction(extraction: IResolvable) {
        cdkBuilder.extraction(extraction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the document.
       */
      override fun extraction(extraction: DocumentStandardExtractionProperty) {
        cdkBuilder.extraction(extraction.let(DocumentStandardExtractionProperty.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the document.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f717c3e7e8bc4889a8f331f8c5b69c85da4bf316042e6148fdac41f2bdbf4880")
      override fun extraction(extraction: DocumentStandardExtractionProperty.Builder.() -> Unit):
          Unit = extraction(DocumentStandardExtractionProperty(extraction))

      /**
       * @param generativeField Whether to generate descriptions.
       */
      override fun generativeField(generativeField: IResolvable) {
        cdkBuilder.generativeField(generativeField.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions.
       */
      override fun generativeField(generativeField: DocumentStandardGenerativeFieldProperty) {
        cdkBuilder.generativeField(generativeField.let(DocumentStandardGenerativeFieldProperty.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45051c553c8a7f9bd36da523ba43c72b630d5a851d11ac4942060d5609340500")
      override
          fun generativeField(generativeField: DocumentStandardGenerativeFieldProperty.Builder.() -> Unit):
          Unit = generativeField(DocumentStandardGenerativeFieldProperty(generativeField))

      /**
       * @param outputFormat The output format to generate.
       */
      override fun outputFormat(outputFormat: IResolvable) {
        cdkBuilder.outputFormat(outputFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outputFormat The output format to generate.
       */
      override fun outputFormat(outputFormat: DocumentOutputFormatProperty) {
        cdkBuilder.outputFormat(outputFormat.let(DocumentOutputFormatProperty.Companion::unwrap))
      }

      /**
       * @param outputFormat The output format to generate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d9f4198fdde11706808f4d3143f6ed6f75d8bf68bf048432c757fc3b312cbe")
      override fun outputFormat(outputFormat: DocumentOutputFormatProperty.Builder.() -> Unit): Unit
          = outputFormat(DocumentOutputFormatProperty(outputFormat))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        DocumentStandardOutputConfigurationProperty {
      /**
       * Settings for populating data fields that describe the document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-documentstandardoutputconfiguration-extraction)
       */
      override fun extraction(): Any? = unwrap(this).getExtraction()

      /**
       * Whether to generate descriptions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-documentstandardoutputconfiguration-generativefield)
       */
      override fun generativeField(): Any? = unwrap(this).getGenerativeField()

      /**
       * The output format to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-documentstandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-documentstandardoutputconfiguration-outputformat)
       */
      override fun outputFormat(): Any? = unwrap(this).getOutputFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentStandardOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty):
          DocumentStandardOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentStandardOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentStandardOutputConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.DocumentStandardOutputConfigurationProperty
    }
  }

  /**
   * Bounding box settings for a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ImageBoundingBoxProperty imageBoundingBoxProperty = ImageBoundingBoxProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageboundingbox.html)
   */
  public interface ImageBoundingBoxProperty {
    /**
     * Bounding box settings for a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageboundingbox.html#cfn-bedrock-dataautomationproject-imageboundingbox-state)
     */
    public fun state(): String

    /**
     * A builder for [ImageBoundingBoxProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Bounding box settings for a project. 
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty.builder()

      /**
       * @param state Bounding box settings for a project. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty,
    ) : CdkObject(cdkObject),
        ImageBoundingBoxProperty {
      /**
       * Bounding box settings for a project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageboundingbox.html#cfn-bedrock-dataautomationproject-imageboundingbox-state)
       */
      override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageBoundingBoxProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty):
          ImageBoundingBoxProperty = CdkObjectWrappers.wrap(cdkObject) as? ImageBoundingBoxProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageBoundingBoxProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageBoundingBoxProperty
    }
  }

  /**
   * Settings for generating categorical data from images.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ImageExtractionCategoryProperty imageExtractionCategoryProperty =
   * ImageExtractionCategoryProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageextractioncategory.html)
   */
  public interface ImageExtractionCategoryProperty {
    /**
     * Whether generating categorical data from images is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageextractioncategory.html#cfn-bedrock-dataautomationproject-imageextractioncategory-state)
     */
    public fun state(): String

    /**
     * The types of data to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageextractioncategory.html#cfn-bedrock-dataautomationproject-imageextractioncategory-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [ImageExtractionCategoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating categorical data from images is enabled. 
       */
      public fun state(state: String)

      /**
       * @param types The types of data to generate.
       */
      public fun types(types: List<String>)

      /**
       * @param types The types of data to generate.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty.builder()

      /**
       * @param state Whether generating categorical data from images is enabled. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param types The types of data to generate.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The types of data to generate.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty,
    ) : CdkObject(cdkObject),
        ImageExtractionCategoryProperty {
      /**
       * Whether generating categorical data from images is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageextractioncategory.html#cfn-bedrock-dataautomationproject-imageextractioncategory-state)
       */
      override fun state(): String = unwrap(this).getState()

      /**
       * The types of data to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageextractioncategory.html#cfn-bedrock-dataautomationproject-imageextractioncategory-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageExtractionCategoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty):
          ImageExtractionCategoryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageExtractionCategoryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageExtractionCategoryProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageExtractionCategoryProperty
    }
  }

  /**
   * Sets whether your project will process images or not.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ImageOverrideConfigurationProperty imageOverrideConfigurationProperty =
   * ImageOverrideConfigurationProperty.builder()
   * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
   * .state("state")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageoverrideconfiguration.html)
   */
  public interface ImageOverrideConfigurationProperty {
    /**
     * Sets modality processing for image files.
     *
     * All modalities are enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageoverrideconfiguration.html#cfn-bedrock-dataautomationproject-imageoverrideconfiguration-modalityprocessing)
     */
    public fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()

    /**
     * A builder for [ImageOverrideConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modalityProcessing Sets modality processing for image files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: IResolvable)

      /**
       * @param modalityProcessing Sets modality processing for image files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty)

      /**
       * @param modalityProcessing Sets modality processing for image files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ee8c051fbf0326b67866b5a7f46f2b89193c40bef7981f3303ec19efe51aa56")
      public
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty.builder()

      /**
       * @param modalityProcessing Sets modality processing for image files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: IResolvable) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for image files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(ModalityProcessingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for image files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ee8c051fbf0326b67866b5a7f46f2b89193c40bef7981f3303ec19efe51aa56")
      override
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = modalityProcessing(ModalityProcessingConfigurationProperty(modalityProcessing))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty,
    ) : CdkObject(cdkObject),
        ImageOverrideConfigurationProperty {
      /**
       * Sets modality processing for image files.
       *
       * All modalities are enabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imageoverrideconfiguration.html#cfn-bedrock-dataautomationproject-imageoverrideconfiguration-modalityprocessing)
       */
      override fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageOverrideConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty):
          ImageOverrideConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageOverrideConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageOverrideConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageOverrideConfigurationProperty
    }
  }

  /**
   * Settings for generating data from images.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ImageStandardExtractionProperty imageStandardExtractionProperty =
   * ImageStandardExtractionProperty.builder()
   * .boundingBox(ImageBoundingBoxProperty.builder()
   * .state("state")
   * .build())
   * .category(ImageExtractionCategoryProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardextraction.html)
   */
  public interface ImageStandardExtractionProperty {
    /**
     * Settings for generating bounding boxes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardextraction.html#cfn-bedrock-dataautomationproject-imagestandardextraction-boundingbox)
     */
    public fun boundingBox(): Any

    /**
     * Settings for generating categorical data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardextraction.html#cfn-bedrock-dataautomationproject-imagestandardextraction-category)
     */
    public fun category(): Any

    /**
     * A builder for [ImageStandardExtractionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      public fun boundingBox(boundingBox: IResolvable)

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      public fun boundingBox(boundingBox: ImageBoundingBoxProperty)

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aac32ae0603ca211d0a7ea5892bccd0ae1625f4a34e3a6171f7a9eb0cafa643c")
      public fun boundingBox(boundingBox: ImageBoundingBoxProperty.Builder.() -> Unit)

      /**
       * @param category Settings for generating categorical data. 
       */
      public fun category(category: IResolvable)

      /**
       * @param category Settings for generating categorical data. 
       */
      public fun category(category: ImageExtractionCategoryProperty)

      /**
       * @param category Settings for generating categorical data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("548e6e8482eb4d04f813320a43810c4f75c5b4d34eb28dfb3a511295b8b523dd")
      public fun category(category: ImageExtractionCategoryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty.builder()

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      override fun boundingBox(boundingBox: IResolvable) {
        cdkBuilder.boundingBox(boundingBox.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      override fun boundingBox(boundingBox: ImageBoundingBoxProperty) {
        cdkBuilder.boundingBox(boundingBox.let(ImageBoundingBoxProperty.Companion::unwrap))
      }

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aac32ae0603ca211d0a7ea5892bccd0ae1625f4a34e3a6171f7a9eb0cafa643c")
      override fun boundingBox(boundingBox: ImageBoundingBoxProperty.Builder.() -> Unit): Unit =
          boundingBox(ImageBoundingBoxProperty(boundingBox))

      /**
       * @param category Settings for generating categorical data. 
       */
      override fun category(category: IResolvable) {
        cdkBuilder.category(category.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param category Settings for generating categorical data. 
       */
      override fun category(category: ImageExtractionCategoryProperty) {
        cdkBuilder.category(category.let(ImageExtractionCategoryProperty.Companion::unwrap))
      }

      /**
       * @param category Settings for generating categorical data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("548e6e8482eb4d04f813320a43810c4f75c5b4d34eb28dfb3a511295b8b523dd")
      override fun category(category: ImageExtractionCategoryProperty.Builder.() -> Unit): Unit =
          category(ImageExtractionCategoryProperty(category))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty,
    ) : CdkObject(cdkObject),
        ImageStandardExtractionProperty {
      /**
       * Settings for generating bounding boxes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardextraction.html#cfn-bedrock-dataautomationproject-imagestandardextraction-boundingbox)
       */
      override fun boundingBox(): Any = unwrap(this).getBoundingBox()

      /**
       * Settings for generating categorical data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardextraction.html#cfn-bedrock-dataautomationproject-imagestandardextraction-category)
       */
      override fun category(): Any = unwrap(this).getCategory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageStandardExtractionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty):
          ImageStandardExtractionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageStandardExtractionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageStandardExtractionProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardExtractionProperty
    }
  }

  /**
   * Settings for generating descriptions of images.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ImageStandardGenerativeFieldProperty imageStandardGenerativeFieldProperty =
   * ImageStandardGenerativeFieldProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardgenerativefield.html)
   */
  public interface ImageStandardGenerativeFieldProperty {
    /**
     * Whether generating descriptions is enabled for images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardgenerativefield.html#cfn-bedrock-dataautomationproject-imagestandardgenerativefield-state)
     */
    public fun state(): String

    /**
     * Settings for generating descriptions of images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardgenerativefield.html#cfn-bedrock-dataautomationproject-imagestandardgenerativefield-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [ImageStandardGenerativeFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating descriptions is enabled for images. 
       */
      public fun state(state: String)

      /**
       * @param types Settings for generating descriptions of images.
       */
      public fun types(types: List<String>)

      /**
       * @param types Settings for generating descriptions of images.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty.builder()

      /**
       * @param state Whether generating descriptions is enabled for images. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param types Settings for generating descriptions of images.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types Settings for generating descriptions of images.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty,
    ) : CdkObject(cdkObject),
        ImageStandardGenerativeFieldProperty {
      /**
       * Whether generating descriptions is enabled for images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardgenerativefield.html#cfn-bedrock-dataautomationproject-imagestandardgenerativefield-state)
       */
      override fun state(): String = unwrap(this).getState()

      /**
       * Settings for generating descriptions of images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardgenerativefield.html#cfn-bedrock-dataautomationproject-imagestandardgenerativefield-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageStandardGenerativeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty):
          ImageStandardGenerativeFieldProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageStandardGenerativeFieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageStandardGenerativeFieldProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardGenerativeFieldProperty
    }
  }

  /**
   * Output settings for processing images.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ImageStandardOutputConfigurationProperty imageStandardOutputConfigurationProperty =
   * ImageStandardOutputConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardoutputconfiguration.html)
   */
  public interface ImageStandardOutputConfigurationProperty {
    /**
     * Settings for populating data fields that describe the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-imagestandardoutputconfiguration-extraction)
     */
    public fun extraction(): Any? = unwrap(this).getExtraction()

    /**
     * Whether to generate descriptions of the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-imagestandardoutputconfiguration-generativefield)
     */
    public fun generativeField(): Any? = unwrap(this).getGenerativeField()

    /**
     * A builder for [ImageStandardOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extraction Settings for populating data fields that describe the image.
       */
      public fun extraction(extraction: IResolvable)

      /**
       * @param extraction Settings for populating data fields that describe the image.
       */
      public fun extraction(extraction: ImageStandardExtractionProperty)

      /**
       * @param extraction Settings for populating data fields that describe the image.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f734676814bf8d70e483f978514aede166f440cf3a4c1c843aa3dc5322fe658c")
      public fun extraction(extraction: ImageStandardExtractionProperty.Builder.() -> Unit)

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      public fun generativeField(generativeField: IResolvable)

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      public fun generativeField(generativeField: ImageStandardGenerativeFieldProperty)

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cdec6e0ba659ac77dc0cdb1aaeb0ea45196435ce7512a7cc06e2269ae18d0d0")
      public
          fun generativeField(generativeField: ImageStandardGenerativeFieldProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty.builder()

      /**
       * @param extraction Settings for populating data fields that describe the image.
       */
      override fun extraction(extraction: IResolvable) {
        cdkBuilder.extraction(extraction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the image.
       */
      override fun extraction(extraction: ImageStandardExtractionProperty) {
        cdkBuilder.extraction(extraction.let(ImageStandardExtractionProperty.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the image.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f734676814bf8d70e483f978514aede166f440cf3a4c1c843aa3dc5322fe658c")
      override fun extraction(extraction: ImageStandardExtractionProperty.Builder.() -> Unit): Unit
          = extraction(ImageStandardExtractionProperty(extraction))

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      override fun generativeField(generativeField: IResolvable) {
        cdkBuilder.generativeField(generativeField.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      override fun generativeField(generativeField: ImageStandardGenerativeFieldProperty) {
        cdkBuilder.generativeField(generativeField.let(ImageStandardGenerativeFieldProperty.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions of the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cdec6e0ba659ac77dc0cdb1aaeb0ea45196435ce7512a7cc06e2269ae18d0d0")
      override
          fun generativeField(generativeField: ImageStandardGenerativeFieldProperty.Builder.() -> Unit):
          Unit = generativeField(ImageStandardGenerativeFieldProperty(generativeField))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        ImageStandardOutputConfigurationProperty {
      /**
       * Settings for populating data fields that describe the image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-imagestandardoutputconfiguration-extraction)
       */
      override fun extraction(): Any? = unwrap(this).getExtraction()

      /**
       * Whether to generate descriptions of the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-imagestandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-imagestandardoutputconfiguration-generativefield)
       */
      override fun generativeField(): Any? = unwrap(this).getGenerativeField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageStandardOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty):
          ImageStandardOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageStandardOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageStandardOutputConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ImageStandardOutputConfigurationProperty
    }
  }

  /**
   * This element is used to determine if the modality it is associated with is enabled or disabled.
   *
   * All modalities are enabled by default.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ModalityProcessingConfigurationProperty modalityProcessingConfigurationProperty =
   * ModalityProcessingConfigurationProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityprocessingconfiguration.html)
   */
  public interface ModalityProcessingConfigurationProperty {
    /**
     * Stores the state of the modality for your project, set to either enabled or disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityprocessingconfiguration.html#cfn-bedrock-dataautomationproject-modalityprocessingconfiguration-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [ModalityProcessingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Stores the state of the modality for your project, set to either enabled or
       * disabled.
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty.builder()

      /**
       * @param state Stores the state of the modality for your project, set to either enabled or
       * disabled.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ModalityProcessingConfigurationProperty {
      /**
       * Stores the state of the modality for your project, set to either enabled or disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityprocessingconfiguration.html#cfn-bedrock-dataautomationproject-modalityprocessingconfiguration-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModalityProcessingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty):
          ModalityProcessingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModalityProcessingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModalityProcessingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityProcessingConfigurationProperty
    }
  }

  /**
   * This element allows you to set up where JPEG, PNG, MOV, and MP4 files get routed to for
   * processing.
   *
   * JPEG routing applies to both "JPEG" and "JPG" file extensions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ModalityRoutingConfigurationProperty modalityRoutingConfigurationProperty =
   * ModalityRoutingConfigurationProperty.builder()
   * .jpeg("jpeg")
   * .mov("mov")
   * .mp4("mp4")
   * .png("png")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html)
   */
  public interface ModalityRoutingConfigurationProperty {
    /**
     * Sets whether JPEG files are routed to document or image processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-jpeg)
     */
    public fun jpeg(): String? = unwrap(this).getJpeg()

    /**
     * Sets whether MOV files are routed to audio or video processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-mov)
     */
    public fun mov(): String? = unwrap(this).getMov()

    /**
     * Sets whether MP4 files are routed to audio or video processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-mp4)
     */
    public fun mp4(): String? = unwrap(this).getMp4()

    /**
     * Sets whether PNG files are routed to document or image processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-png)
     */
    public fun png(): String? = unwrap(this).getPng()

    /**
     * A builder for [ModalityRoutingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jpeg Sets whether JPEG files are routed to document or image processing.
       */
      public fun jpeg(jpeg: String)

      /**
       * @param mov Sets whether MOV files are routed to audio or video processing.
       */
      public fun mov(mov: String)

      /**
       * @param mp4 Sets whether MP4 files are routed to audio or video processing.
       */
      public fun mp4(mp4: String)

      /**
       * @param png Sets whether PNG files are routed to document or image processing.
       */
      public fun png(png: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty.builder()

      /**
       * @param jpeg Sets whether JPEG files are routed to document or image processing.
       */
      override fun jpeg(jpeg: String) {
        cdkBuilder.jpeg(jpeg)
      }

      /**
       * @param mov Sets whether MOV files are routed to audio or video processing.
       */
      override fun mov(mov: String) {
        cdkBuilder.mov(mov)
      }

      /**
       * @param mp4 Sets whether MP4 files are routed to audio or video processing.
       */
      override fun mp4(mp4: String) {
        cdkBuilder.mp4(mp4)
      }

      /**
       * @param png Sets whether PNG files are routed to document or image processing.
       */
      override fun png(png: String) {
        cdkBuilder.png(png)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ModalityRoutingConfigurationProperty {
      /**
       * Sets whether JPEG files are routed to document or image processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-jpeg)
       */
      override fun jpeg(): String? = unwrap(this).getJpeg()

      /**
       * Sets whether MOV files are routed to audio or video processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-mov)
       */
      override fun mov(): String? = unwrap(this).getMov()

      /**
       * Sets whether MP4 files are routed to audio or video processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-mp4)
       */
      override fun mp4(): String? = unwrap(this).getMp4()

      /**
       * Sets whether PNG files are routed to document or image processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-modalityroutingconfiguration.html#cfn-bedrock-dataautomationproject-modalityroutingconfiguration-png)
       */
      override fun png(): String? = unwrap(this).getPng()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModalityRoutingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty):
          ModalityRoutingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ModalityRoutingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModalityRoutingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.ModalityRoutingConfigurationProperty
    }
  }

  /**
   * Additional settings for a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * OverrideConfigurationProperty overrideConfigurationProperty =
   * OverrideConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html)
   */
  public interface OverrideConfigurationProperty {
    /**
     * This element declares whether your project will process audio files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-audio)
     */
    public fun audio(): Any? = unwrap(this).getAudio()

    /**
     * Additional settings for a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-document)
     */
    public fun document(): Any? = unwrap(this).getDocument()

    /**
     * This element declares whether your project will process image files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-image)
     */
    public fun image(): Any? = unwrap(this).getImage()

    /**
     * Lets you set which modalities certain file types are processed as.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-modalityrouting)
     */
    public fun modalityRouting(): Any? = unwrap(this).getModalityRouting()

    /**
     * This element declares whether your project will process video files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-video)
     */
    public fun video(): Any? = unwrap(this).getVideo()

    /**
     * A builder for [OverrideConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audio This element declares whether your project will process audio files.
       */
      public fun audio(audio: IResolvable)

      /**
       * @param audio This element declares whether your project will process audio files.
       */
      public fun audio(audio: AudioOverrideConfigurationProperty)

      /**
       * @param audio This element declares whether your project will process audio files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("770b56725333fc623834a92c4fa393e67732fcb87ff72efede5d7b74f4f927e3")
      public fun audio(audio: AudioOverrideConfigurationProperty.Builder.() -> Unit)

      /**
       * @param document Additional settings for a project.
       */
      public fun document(document: IResolvable)

      /**
       * @param document Additional settings for a project.
       */
      public fun document(document: DocumentOverrideConfigurationProperty)

      /**
       * @param document Additional settings for a project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e0c24f17ec4c8709bd1b1f784ee51be923a5eeb4ed791767da519de6f84a87e")
      public fun document(document: DocumentOverrideConfigurationProperty.Builder.() -> Unit)

      /**
       * @param image This element declares whether your project will process image files.
       */
      public fun image(image: IResolvable)

      /**
       * @param image This element declares whether your project will process image files.
       */
      public fun image(image: ImageOverrideConfigurationProperty)

      /**
       * @param image This element declares whether your project will process image files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd6ffd47dc546a1d2aab08559036b05f29a80e8c3aee8beea63dac784b6ba156")
      public fun image(image: ImageOverrideConfigurationProperty.Builder.() -> Unit)

      /**
       * @param modalityRouting Lets you set which modalities certain file types are processed as.
       */
      public fun modalityRouting(modalityRouting: IResolvable)

      /**
       * @param modalityRouting Lets you set which modalities certain file types are processed as.
       */
      public fun modalityRouting(modalityRouting: ModalityRoutingConfigurationProperty)

      /**
       * @param modalityRouting Lets you set which modalities certain file types are processed as.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6537cac62e7d509aeb85cc608ce9c52f2c1ef56a04100588b8ec49937316dcb5")
      public
          fun modalityRouting(modalityRouting: ModalityRoutingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param video This element declares whether your project will process video files.
       */
      public fun video(video: IResolvable)

      /**
       * @param video This element declares whether your project will process video files.
       */
      public fun video(video: VideoOverrideConfigurationProperty)

      /**
       * @param video This element declares whether your project will process video files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff7ef962a3ad3a4dd6e2fdcd806dd9884de83d883ec5dc3ad2ed36bc1ead0101")
      public fun video(video: VideoOverrideConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty.builder()

      /**
       * @param audio This element declares whether your project will process audio files.
       */
      override fun audio(audio: IResolvable) {
        cdkBuilder.audio(audio.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audio This element declares whether your project will process audio files.
       */
      override fun audio(audio: AudioOverrideConfigurationProperty) {
        cdkBuilder.audio(audio.let(AudioOverrideConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param audio This element declares whether your project will process audio files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("770b56725333fc623834a92c4fa393e67732fcb87ff72efede5d7b74f4f927e3")
      override fun audio(audio: AudioOverrideConfigurationProperty.Builder.() -> Unit): Unit =
          audio(AudioOverrideConfigurationProperty(audio))

      /**
       * @param document Additional settings for a project.
       */
      override fun document(document: IResolvable) {
        cdkBuilder.document(document.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param document Additional settings for a project.
       */
      override fun document(document: DocumentOverrideConfigurationProperty) {
        cdkBuilder.document(document.let(DocumentOverrideConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param document Additional settings for a project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e0c24f17ec4c8709bd1b1f784ee51be923a5eeb4ed791767da519de6f84a87e")
      override fun document(document: DocumentOverrideConfigurationProperty.Builder.() -> Unit):
          Unit = document(DocumentOverrideConfigurationProperty(document))

      /**
       * @param image This element declares whether your project will process image files.
       */
      override fun image(image: IResolvable) {
        cdkBuilder.image(image.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param image This element declares whether your project will process image files.
       */
      override fun image(image: ImageOverrideConfigurationProperty) {
        cdkBuilder.image(image.let(ImageOverrideConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param image This element declares whether your project will process image files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd6ffd47dc546a1d2aab08559036b05f29a80e8c3aee8beea63dac784b6ba156")
      override fun image(image: ImageOverrideConfigurationProperty.Builder.() -> Unit): Unit =
          image(ImageOverrideConfigurationProperty(image))

      /**
       * @param modalityRouting Lets you set which modalities certain file types are processed as.
       */
      override fun modalityRouting(modalityRouting: IResolvable) {
        cdkBuilder.modalityRouting(modalityRouting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modalityRouting Lets you set which modalities certain file types are processed as.
       */
      override fun modalityRouting(modalityRouting: ModalityRoutingConfigurationProperty) {
        cdkBuilder.modalityRouting(modalityRouting.let(ModalityRoutingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param modalityRouting Lets you set which modalities certain file types are processed as.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6537cac62e7d509aeb85cc608ce9c52f2c1ef56a04100588b8ec49937316dcb5")
      override
          fun modalityRouting(modalityRouting: ModalityRoutingConfigurationProperty.Builder.() -> Unit):
          Unit = modalityRouting(ModalityRoutingConfigurationProperty(modalityRouting))

      /**
       * @param video This element declares whether your project will process video files.
       */
      override fun video(video: IResolvable) {
        cdkBuilder.video(video.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param video This element declares whether your project will process video files.
       */
      override fun video(video: VideoOverrideConfigurationProperty) {
        cdkBuilder.video(video.let(VideoOverrideConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param video This element declares whether your project will process video files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff7ef962a3ad3a4dd6e2fdcd806dd9884de83d883ec5dc3ad2ed36bc1ead0101")
      override fun video(video: VideoOverrideConfigurationProperty.Builder.() -> Unit): Unit =
          video(VideoOverrideConfigurationProperty(video))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty,
    ) : CdkObject(cdkObject),
        OverrideConfigurationProperty {
      /**
       * This element declares whether your project will process audio files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-audio)
       */
      override fun audio(): Any? = unwrap(this).getAudio()

      /**
       * Additional settings for a project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-document)
       */
      override fun document(): Any? = unwrap(this).getDocument()

      /**
       * This element declares whether your project will process image files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-image)
       */
      override fun image(): Any? = unwrap(this).getImage()

      /**
       * Lets you set which modalities certain file types are processed as.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-modalityrouting)
       */
      override fun modalityRouting(): Any? = unwrap(this).getModalityRouting()

      /**
       * This element declares whether your project will process video files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-overrideconfiguration.html#cfn-bedrock-dataautomationproject-overrideconfiguration-video)
       */
      override fun video(): Any? = unwrap(this).getVideo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverrideConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty):
          OverrideConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OverrideConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.OverrideConfigurationProperty
    }
  }

  /**
   * Document splitter settings.
   *
   * If a document is too large to be processed in one pass, the document splitter splits it into
   * smaller documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SplitterConfigurationProperty splitterConfigurationProperty =
   * SplitterConfigurationProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-splitterconfiguration.html)
   */
  public interface SplitterConfigurationProperty {
    /**
     * Whether document splitter is enabled for a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-splitterconfiguration.html#cfn-bedrock-dataautomationproject-splitterconfiguration-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [SplitterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether document splitter is enabled for a project.
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty.builder()

      /**
       * @param state Whether document splitter is enabled for a project.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty,
    ) : CdkObject(cdkObject),
        SplitterConfigurationProperty {
      /**
       * Whether document splitter is enabled for a project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-splitterconfiguration.html#cfn-bedrock-dataautomationproject-splitterconfiguration-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SplitterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty):
          SplitterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SplitterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplitterConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.SplitterConfigurationProperty
    }
  }

  /**
   * The project's standard output configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StandardOutputConfigurationProperty standardOutputConfigurationProperty =
   * StandardOutputConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html)
   */
  public interface StandardOutputConfigurationProperty {
    /**
     * Settings for processing audio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-audio)
     */
    public fun audio(): Any? = unwrap(this).getAudio()

    /**
     * Settings for processing documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-document)
     */
    public fun document(): Any? = unwrap(this).getDocument()

    /**
     * Settings for processing images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-image)
     */
    public fun image(): Any? = unwrap(this).getImage()

    /**
     * Settings for processing video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-video)
     */
    public fun video(): Any? = unwrap(this).getVideo()

    /**
     * A builder for [StandardOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audio Settings for processing audio.
       */
      public fun audio(audio: IResolvable)

      /**
       * @param audio Settings for processing audio.
       */
      public fun audio(audio: AudioStandardOutputConfigurationProperty)

      /**
       * @param audio Settings for processing audio.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9114c01638e1a88d7b9a657919d4d4fb543636905e7ff20892b1adbd693fef04")
      public fun audio(audio: AudioStandardOutputConfigurationProperty.Builder.() -> Unit)

      /**
       * @param document Settings for processing documents.
       */
      public fun document(document: IResolvable)

      /**
       * @param document Settings for processing documents.
       */
      public fun document(document: DocumentStandardOutputConfigurationProperty)

      /**
       * @param document Settings for processing documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5520ab3dcb45110f810705a9571980eb9564af8241d07822f2b94cd5e8d1069")
      public fun document(document: DocumentStandardOutputConfigurationProperty.Builder.() -> Unit)

      /**
       * @param image Settings for processing images.
       */
      public fun image(image: IResolvable)

      /**
       * @param image Settings for processing images.
       */
      public fun image(image: ImageStandardOutputConfigurationProperty)

      /**
       * @param image Settings for processing images.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bddbbb8c402f1c93e965ad6035bae5c3e271c9d9512c01bd18e68dd2e5207b3")
      public fun image(image: ImageStandardOutputConfigurationProperty.Builder.() -> Unit)

      /**
       * @param video Settings for processing video.
       */
      public fun video(video: IResolvable)

      /**
       * @param video Settings for processing video.
       */
      public fun video(video: VideoStandardOutputConfigurationProperty)

      /**
       * @param video Settings for processing video.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30702be46798ef6b15cb49d445804b3c5eda9ce2e65260129d8d29c7ce9a3473")
      public fun video(video: VideoStandardOutputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty.builder()

      /**
       * @param audio Settings for processing audio.
       */
      override fun audio(audio: IResolvable) {
        cdkBuilder.audio(audio.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audio Settings for processing audio.
       */
      override fun audio(audio: AudioStandardOutputConfigurationProperty) {
        cdkBuilder.audio(audio.let(AudioStandardOutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param audio Settings for processing audio.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9114c01638e1a88d7b9a657919d4d4fb543636905e7ff20892b1adbd693fef04")
      override fun audio(audio: AudioStandardOutputConfigurationProperty.Builder.() -> Unit): Unit =
          audio(AudioStandardOutputConfigurationProperty(audio))

      /**
       * @param document Settings for processing documents.
       */
      override fun document(document: IResolvable) {
        cdkBuilder.document(document.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param document Settings for processing documents.
       */
      override fun document(document: DocumentStandardOutputConfigurationProperty) {
        cdkBuilder.document(document.let(DocumentStandardOutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param document Settings for processing documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5520ab3dcb45110f810705a9571980eb9564af8241d07822f2b94cd5e8d1069")
      override
          fun document(document: DocumentStandardOutputConfigurationProperty.Builder.() -> Unit):
          Unit = document(DocumentStandardOutputConfigurationProperty(document))

      /**
       * @param image Settings for processing images.
       */
      override fun image(image: IResolvable) {
        cdkBuilder.image(image.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param image Settings for processing images.
       */
      override fun image(image: ImageStandardOutputConfigurationProperty) {
        cdkBuilder.image(image.let(ImageStandardOutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param image Settings for processing images.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bddbbb8c402f1c93e965ad6035bae5c3e271c9d9512c01bd18e68dd2e5207b3")
      override fun image(image: ImageStandardOutputConfigurationProperty.Builder.() -> Unit): Unit =
          image(ImageStandardOutputConfigurationProperty(image))

      /**
       * @param video Settings for processing video.
       */
      override fun video(video: IResolvable) {
        cdkBuilder.video(video.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param video Settings for processing video.
       */
      override fun video(video: VideoStandardOutputConfigurationProperty) {
        cdkBuilder.video(video.let(VideoStandardOutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param video Settings for processing video.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30702be46798ef6b15cb49d445804b3c5eda9ce2e65260129d8d29c7ce9a3473")
      override fun video(video: VideoStandardOutputConfigurationProperty.Builder.() -> Unit): Unit =
          video(VideoStandardOutputConfigurationProperty(video))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        StandardOutputConfigurationProperty {
      /**
       * Settings for processing audio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-audio)
       */
      override fun audio(): Any? = unwrap(this).getAudio()

      /**
       * Settings for processing documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-document)
       */
      override fun document(): Any? = unwrap(this).getDocument()

      /**
       * Settings for processing images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-image)
       */
      override fun image(): Any? = unwrap(this).getImage()

      /**
       * Settings for processing video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-standardoutputconfiguration.html#cfn-bedrock-dataautomationproject-standardoutputconfiguration-video)
       */
      override fun video(): Any? = unwrap(this).getVideo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StandardOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty):
          StandardOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StandardOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StandardOutputConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.StandardOutputConfigurationProperty
    }
  }

  /**
   * Bounding box settings for video.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VideoBoundingBoxProperty videoBoundingBoxProperty = VideoBoundingBoxProperty.builder()
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoboundingbox.html)
   */
  public interface VideoBoundingBoxProperty {
    /**
     * Whether bounding boxes are enabled for video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoboundingbox.html#cfn-bedrock-dataautomationproject-videoboundingbox-state)
     */
    public fun state(): String

    /**
     * A builder for [VideoBoundingBoxProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether bounding boxes are enabled for video. 
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty.builder()

      /**
       * @param state Whether bounding boxes are enabled for video. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty,
    ) : CdkObject(cdkObject),
        VideoBoundingBoxProperty {
      /**
       * Whether bounding boxes are enabled for video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoboundingbox.html#cfn-bedrock-dataautomationproject-videoboundingbox-state)
       */
      override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoBoundingBoxProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty):
          VideoBoundingBoxProperty = CdkObjectWrappers.wrap(cdkObject) as? VideoBoundingBoxProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoBoundingBoxProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoBoundingBoxProperty
    }
  }

  /**
   * Settings for generating categorical data from video.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VideoExtractionCategoryProperty videoExtractionCategoryProperty =
   * VideoExtractionCategoryProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoextractioncategory.html)
   */
  public interface VideoExtractionCategoryProperty {
    /**
     * Whether generating categorical data from video is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoextractioncategory.html#cfn-bedrock-dataautomationproject-videoextractioncategory-state)
     */
    public fun state(): String

    /**
     * The types of data to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoextractioncategory.html#cfn-bedrock-dataautomationproject-videoextractioncategory-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [VideoExtractionCategoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating categorical data from video is enabled. 
       */
      public fun state(state: String)

      /**
       * @param types The types of data to generate.
       */
      public fun types(types: List<String>)

      /**
       * @param types The types of data to generate.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty.builder()

      /**
       * @param state Whether generating categorical data from video is enabled. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param types The types of data to generate.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The types of data to generate.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty,
    ) : CdkObject(cdkObject),
        VideoExtractionCategoryProperty {
      /**
       * Whether generating categorical data from video is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoextractioncategory.html#cfn-bedrock-dataautomationproject-videoextractioncategory-state)
       */
      override fun state(): String = unwrap(this).getState()

      /**
       * The types of data to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videoextractioncategory.html#cfn-bedrock-dataautomationproject-videoextractioncategory-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoExtractionCategoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty):
          VideoExtractionCategoryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoExtractionCategoryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoExtractionCategoryProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoExtractionCategoryProperty
    }
  }

  /**
   * Sets whether your project will process videos or not.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VideoOverrideConfigurationProperty videoOverrideConfigurationProperty =
   * VideoOverrideConfigurationProperty.builder()
   * .modalityProcessing(ModalityProcessingConfigurationProperty.builder()
   * .state("state")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videooverrideconfiguration.html)
   */
  public interface VideoOverrideConfigurationProperty {
    /**
     * Sets modality processing for video files.
     *
     * All modalities are enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videooverrideconfiguration.html#cfn-bedrock-dataautomationproject-videooverrideconfiguration-modalityprocessing)
     */
    public fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()

    /**
     * A builder for [VideoOverrideConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modalityProcessing Sets modality processing for video files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: IResolvable)

      /**
       * @param modalityProcessing Sets modality processing for video files.
       * All modalities are enabled by default.
       */
      public fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty)

      /**
       * @param modalityProcessing Sets modality processing for video files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db29be30872813e3584bf6bb3c0f9a7fa97ca2d2265366fe6bb596cc393b4bd9")
      public
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty.builder()

      /**
       * @param modalityProcessing Sets modality processing for video files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: IResolvable) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for video files.
       * All modalities are enabled by default.
       */
      override fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty) {
        cdkBuilder.modalityProcessing(modalityProcessing.let(ModalityProcessingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param modalityProcessing Sets modality processing for video files.
       * All modalities are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db29be30872813e3584bf6bb3c0f9a7fa97ca2d2265366fe6bb596cc393b4bd9")
      override
          fun modalityProcessing(modalityProcessing: ModalityProcessingConfigurationProperty.Builder.() -> Unit):
          Unit = modalityProcessing(ModalityProcessingConfigurationProperty(modalityProcessing))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty,
    ) : CdkObject(cdkObject),
        VideoOverrideConfigurationProperty {
      /**
       * Sets modality processing for video files.
       *
       * All modalities are enabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videooverrideconfiguration.html#cfn-bedrock-dataautomationproject-videooverrideconfiguration-modalityprocessing)
       */
      override fun modalityProcessing(): Any? = unwrap(this).getModalityProcessing()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VideoOverrideConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty):
          VideoOverrideConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoOverrideConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoOverrideConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoOverrideConfigurationProperty
    }
  }

  /**
   * Settings for generating data from video.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VideoStandardExtractionProperty videoStandardExtractionProperty =
   * VideoStandardExtractionProperty.builder()
   * .boundingBox(VideoBoundingBoxProperty.builder()
   * .state("state")
   * .build())
   * .category(VideoExtractionCategoryProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardextraction.html)
   */
  public interface VideoStandardExtractionProperty {
    /**
     * Settings for generating bounding boxes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardextraction.html#cfn-bedrock-dataautomationproject-videostandardextraction-boundingbox)
     */
    public fun boundingBox(): Any

    /**
     * Settings for generating categorical data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardextraction.html#cfn-bedrock-dataautomationproject-videostandardextraction-category)
     */
    public fun category(): Any

    /**
     * A builder for [VideoStandardExtractionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      public fun boundingBox(boundingBox: IResolvable)

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      public fun boundingBox(boundingBox: VideoBoundingBoxProperty)

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7edd3208a46a864ac32d2bccc62aaee7732e362548362f6f6d2e8f98aaeb945")
      public fun boundingBox(boundingBox: VideoBoundingBoxProperty.Builder.() -> Unit)

      /**
       * @param category Settings for generating categorical data. 
       */
      public fun category(category: IResolvable)

      /**
       * @param category Settings for generating categorical data. 
       */
      public fun category(category: VideoExtractionCategoryProperty)

      /**
       * @param category Settings for generating categorical data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d3f2c49398667635bc3bd46d9b67e2246f2196989e7e1bd9bf900bf4da6bbee")
      public fun category(category: VideoExtractionCategoryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty.builder()

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      override fun boundingBox(boundingBox: IResolvable) {
        cdkBuilder.boundingBox(boundingBox.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      override fun boundingBox(boundingBox: VideoBoundingBoxProperty) {
        cdkBuilder.boundingBox(boundingBox.let(VideoBoundingBoxProperty.Companion::unwrap))
      }

      /**
       * @param boundingBox Settings for generating bounding boxes. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7edd3208a46a864ac32d2bccc62aaee7732e362548362f6f6d2e8f98aaeb945")
      override fun boundingBox(boundingBox: VideoBoundingBoxProperty.Builder.() -> Unit): Unit =
          boundingBox(VideoBoundingBoxProperty(boundingBox))

      /**
       * @param category Settings for generating categorical data. 
       */
      override fun category(category: IResolvable) {
        cdkBuilder.category(category.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param category Settings for generating categorical data. 
       */
      override fun category(category: VideoExtractionCategoryProperty) {
        cdkBuilder.category(category.let(VideoExtractionCategoryProperty.Companion::unwrap))
      }

      /**
       * @param category Settings for generating categorical data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d3f2c49398667635bc3bd46d9b67e2246f2196989e7e1bd9bf900bf4da6bbee")
      override fun category(category: VideoExtractionCategoryProperty.Builder.() -> Unit): Unit =
          category(VideoExtractionCategoryProperty(category))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty,
    ) : CdkObject(cdkObject),
        VideoStandardExtractionProperty {
      /**
       * Settings for generating bounding boxes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardextraction.html#cfn-bedrock-dataautomationproject-videostandardextraction-boundingbox)
       */
      override fun boundingBox(): Any = unwrap(this).getBoundingBox()

      /**
       * Settings for generating categorical data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardextraction.html#cfn-bedrock-dataautomationproject-videostandardextraction-category)
       */
      override fun category(): Any = unwrap(this).getCategory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoStandardExtractionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty):
          VideoStandardExtractionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoStandardExtractionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoStandardExtractionProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardExtractionProperty
    }
  }

  /**
   * Settings for generating descriptions of video.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VideoStandardGenerativeFieldProperty videoStandardGenerativeFieldProperty =
   * VideoStandardGenerativeFieldProperty.builder()
   * .state("state")
   * // the properties below are optional
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardgenerativefield.html)
   */
  public interface VideoStandardGenerativeFieldProperty {
    /**
     * Whether generating descriptions is enabled for video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardgenerativefield.html#cfn-bedrock-dataautomationproject-videostandardgenerativefield-state)
     */
    public fun state(): String

    /**
     * The types of description to generate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardgenerativefield.html#cfn-bedrock-dataautomationproject-videostandardgenerativefield-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [VideoStandardGenerativeFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Whether generating descriptions is enabled for video. 
       */
      public fun state(state: String)

      /**
       * @param types The types of description to generate.
       */
      public fun types(types: List<String>)

      /**
       * @param types The types of description to generate.
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty.builder()

      /**
       * @param state Whether generating descriptions is enabled for video. 
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param types The types of description to generate.
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types The types of description to generate.
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty,
    ) : CdkObject(cdkObject),
        VideoStandardGenerativeFieldProperty {
      /**
       * Whether generating descriptions is enabled for video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardgenerativefield.html#cfn-bedrock-dataautomationproject-videostandardgenerativefield-state)
       */
      override fun state(): String = unwrap(this).getState()

      /**
       * The types of description to generate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardgenerativefield.html#cfn-bedrock-dataautomationproject-videostandardgenerativefield-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VideoStandardGenerativeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty):
          VideoStandardGenerativeFieldProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoStandardGenerativeFieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoStandardGenerativeFieldProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardGenerativeFieldProperty
    }
  }

  /**
   * Output settings for processing video.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VideoStandardOutputConfigurationProperty videoStandardOutputConfigurationProperty =
   * VideoStandardOutputConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardoutputconfiguration.html)
   */
  public interface VideoStandardOutputConfigurationProperty {
    /**
     * Settings for populating data fields that describe the video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-videostandardoutputconfiguration-extraction)
     */
    public fun extraction(): Any? = unwrap(this).getExtraction()

    /**
     * Whether to generate descriptions of the video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-videostandardoutputconfiguration-generativefield)
     */
    public fun generativeField(): Any? = unwrap(this).getGenerativeField()

    /**
     * A builder for [VideoStandardOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extraction Settings for populating data fields that describe the video.
       */
      public fun extraction(extraction: IResolvable)

      /**
       * @param extraction Settings for populating data fields that describe the video.
       */
      public fun extraction(extraction: VideoStandardExtractionProperty)

      /**
       * @param extraction Settings for populating data fields that describe the video.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf09ffcd537b827cf033719829c2a962f8b85413ebc6d8f9076e6d84cd6528ce")
      public fun extraction(extraction: VideoStandardExtractionProperty.Builder.() -> Unit)

      /**
       * @param generativeField Whether to generate descriptions of the video.
       */
      public fun generativeField(generativeField: IResolvable)

      /**
       * @param generativeField Whether to generate descriptions of the video.
       */
      public fun generativeField(generativeField: VideoStandardGenerativeFieldProperty)

      /**
       * @param generativeField Whether to generate descriptions of the video.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20d6381b0bfdc5f3d52bd72e50867bed8879f03ae2fd36b39ed48a8ce1ba0a0c")
      public
          fun generativeField(generativeField: VideoStandardGenerativeFieldProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty.builder()

      /**
       * @param extraction Settings for populating data fields that describe the video.
       */
      override fun extraction(extraction: IResolvable) {
        cdkBuilder.extraction(extraction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the video.
       */
      override fun extraction(extraction: VideoStandardExtractionProperty) {
        cdkBuilder.extraction(extraction.let(VideoStandardExtractionProperty.Companion::unwrap))
      }

      /**
       * @param extraction Settings for populating data fields that describe the video.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf09ffcd537b827cf033719829c2a962f8b85413ebc6d8f9076e6d84cd6528ce")
      override fun extraction(extraction: VideoStandardExtractionProperty.Builder.() -> Unit): Unit
          = extraction(VideoStandardExtractionProperty(extraction))

      /**
       * @param generativeField Whether to generate descriptions of the video.
       */
      override fun generativeField(generativeField: IResolvable) {
        cdkBuilder.generativeField(generativeField.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions of the video.
       */
      override fun generativeField(generativeField: VideoStandardGenerativeFieldProperty) {
        cdkBuilder.generativeField(generativeField.let(VideoStandardGenerativeFieldProperty.Companion::unwrap))
      }

      /**
       * @param generativeField Whether to generate descriptions of the video.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20d6381b0bfdc5f3d52bd72e50867bed8879f03ae2fd36b39ed48a8ce1ba0a0c")
      override
          fun generativeField(generativeField: VideoStandardGenerativeFieldProperty.Builder.() -> Unit):
          Unit = generativeField(VideoStandardGenerativeFieldProperty(generativeField))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        VideoStandardOutputConfigurationProperty {
      /**
       * Settings for populating data fields that describe the video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-videostandardoutputconfiguration-extraction)
       */
      override fun extraction(): Any? = unwrap(this).getExtraction()

      /**
       * Whether to generate descriptions of the video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-dataautomationproject-videostandardoutputconfiguration.html#cfn-bedrock-dataautomationproject-videostandardoutputconfiguration-generativefield)
       */
      override fun generativeField(): Any? = unwrap(this).getGenerativeField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VideoStandardOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty):
          VideoStandardOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoStandardOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoStandardOutputConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataAutomationProject.VideoStandardOutputConfigurationProperty
    }
  }
}
