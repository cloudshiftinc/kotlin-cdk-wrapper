@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

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
 * The `AWS::IVS::Stage` resource specifies an  stage.
 *
 * A stage is a virtual space where participants can exchange video in real time. For more
 * information, see
 * [CreateStage](https://docs.aws.amazon.com/ivs/latest/RealTimeAPIReference/API_CreateStage.html) in
 * the *Amazon IVS Real-Time Streaming API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnStage cfnStage = CfnStage.Builder.create(this, "MyCfnStage")
 * .autoParticipantRecordingConfiguration(AutoParticipantRecordingConfigurationProperty.builder()
 * .storageConfigurationArn("storageConfigurationArn")
 * // the properties below are optional
 * .mediaTypes(List.of("mediaTypes"))
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html)
 */
public open class CfnStage(
  cdkObject: software.amazon.awscdk.services.ivs.CfnStage,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ivs.CfnStage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStageProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnStage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStageProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStageProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStageProps(props)
  )

  /**
   * ID of the active session within the stage.
   *
   * For example: `st-a1b2c3d4e5f6g`
   */
  public open fun attrActiveSessionId(): String = unwrap(this).getAttrActiveSessionId()

  /**
   * The stage ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:stage/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Configuration object for individual participant recording, to attach to the new stage.
   */
  public open fun autoParticipantRecordingConfiguration(): Any? =
      unwrap(this).getAutoParticipantRecordingConfiguration()

  /**
   * Configuration object for individual participant recording, to attach to the new stage.
   */
  public open fun autoParticipantRecordingConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoParticipantRecordingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration object for individual participant recording, to attach to the new stage.
   */
  public open
      fun autoParticipantRecordingConfiguration(`value`: AutoParticipantRecordingConfigurationProperty) {
    unwrap(this).setAutoParticipantRecordingConfiguration(`value`.let(AutoParticipantRecordingConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration object for individual participant recording, to attach to the new stage.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c6977838905460d201c16f67c01f1a6dec88e203c5d7f8157810acc8c72ff94")
  public open
      fun autoParticipantRecordingConfiguration(`value`: AutoParticipantRecordingConfigurationProperty.Builder.() -> Unit):
      Unit =
      autoParticipantRecordingConfiguration(AutoParticipantRecordingConfigurationProperty(`value`))

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
   * Stage name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Stage name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnStage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage. 
     */
    public
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: IResolvable)

    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage. 
     */
    public
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: AutoParticipantRecordingConfigurationProperty)

    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fc225c9bc896f7b7c76d9706ca729391927525766b126166cab8944900cf241")
    public
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: AutoParticipantRecordingConfigurationProperty.Builder.() -> Unit)

    /**
     * Stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-name)
     * @param name Stage name. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnStage.Builder =
        software.amazon.awscdk.services.ivs.CfnStage.Builder.create(scope, id)

    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage. 
     */
    override
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: IResolvable) {
      cdkBuilder.autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage. 
     */
    override
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: AutoParticipantRecordingConfigurationProperty) {
      cdkBuilder.autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration.let(AutoParticipantRecordingConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fc225c9bc896f7b7c76d9706ca729391927525766b126166cab8944900cf241")
    override
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: AutoParticipantRecordingConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoParticipantRecordingConfiguration(AutoParticipantRecordingConfigurationProperty(autoParticipantRecordingConfiguration))

    /**
     * Stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-name)
     * @param name Stage name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnStage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnStage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStage): CfnStage =
        CfnStage(cdkObject)

    internal fun unwrap(wrapped: CfnStage): software.amazon.awscdk.services.ivs.CfnStage =
        wrapped.cdkObject as software.amazon.awscdk.services.ivs.CfnStage
  }

  /**
   * The `AWS::IVS::AutoParticipantRecordingConfiguration` property type describes a configuration
   * for individual participant recording.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * AutoParticipantRecordingConfigurationProperty autoParticipantRecordingConfigurationProperty =
   * AutoParticipantRecordingConfigurationProperty.builder()
   * .storageConfigurationArn("storageConfigurationArn")
   * // the properties below are optional
   * .mediaTypes(List.of("mediaTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-autoparticipantrecordingconfiguration.html)
   */
  public interface AutoParticipantRecordingConfigurationProperty {
    /**
     * Types of media to be recorded.
     *
     * Default: `AUDIO_VIDEO` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-autoparticipantrecordingconfiguration.html#cfn-ivs-stage-autoparticipantrecordingconfiguration-mediatypes)
     */
    public fun mediaTypes(): List<String> = unwrap(this).getMediaTypes() ?: emptyList()

    /**
     * ARN of the StorageConfiguration resource to use for individual participant recording.
     *
     * Default: "" (empty string, no storage configuration is specified). Individual participant
     * recording cannot be started unless a storage configuration is specified, when a Stage is created
     * or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-autoparticipantrecordingconfiguration.html#cfn-ivs-stage-autoparticipantrecordingconfiguration-storageconfigurationarn)
     */
    public fun storageConfigurationArn(): String

    /**
     * A builder for [AutoParticipantRecordingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mediaTypes Types of media to be recorded.
       * Default: `AUDIO_VIDEO` .
       */
      public fun mediaTypes(mediaTypes: List<String>)

      /**
       * @param mediaTypes Types of media to be recorded.
       * Default: `AUDIO_VIDEO` .
       */
      public fun mediaTypes(vararg mediaTypes: String)

      /**
       * @param storageConfigurationArn ARN of the StorageConfiguration resource to use for
       * individual participant recording. 
       * Default: "" (empty string, no storage configuration is specified). Individual participant
       * recording cannot be started unless a storage configuration is specified, when a Stage is
       * created or updated.
       */
      public fun storageConfigurationArn(storageConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty.builder()

      /**
       * @param mediaTypes Types of media to be recorded.
       * Default: `AUDIO_VIDEO` .
       */
      override fun mediaTypes(mediaTypes: List<String>) {
        cdkBuilder.mediaTypes(mediaTypes)
      }

      /**
       * @param mediaTypes Types of media to be recorded.
       * Default: `AUDIO_VIDEO` .
       */
      override fun mediaTypes(vararg mediaTypes: String): Unit = mediaTypes(mediaTypes.toList())

      /**
       * @param storageConfigurationArn ARN of the StorageConfiguration resource to use for
       * individual participant recording. 
       * Default: "" (empty string, no storage configuration is specified). Individual participant
       * recording cannot be started unless a storage configuration is specified, when a Stage is
       * created or updated.
       */
      override fun storageConfigurationArn(storageConfigurationArn: String) {
        cdkBuilder.storageConfigurationArn(storageConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty,
    ) : CdkObject(cdkObject),
        AutoParticipantRecordingConfigurationProperty {
      /**
       * Types of media to be recorded.
       *
       * Default: `AUDIO_VIDEO` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-autoparticipantrecordingconfiguration.html#cfn-ivs-stage-autoparticipantrecordingconfiguration-mediatypes)
       */
      override fun mediaTypes(): List<String> = unwrap(this).getMediaTypes() ?: emptyList()

      /**
       * ARN of the StorageConfiguration resource to use for individual participant recording.
       *
       * Default: "" (empty string, no storage configuration is specified). Individual participant
       * recording cannot be started unless a storage configuration is specified, when a Stage is
       * created or updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-autoparticipantrecordingconfiguration.html#cfn-ivs-stage-autoparticipantrecordingconfiguration-storageconfigurationarn)
       */
      override fun storageConfigurationArn(): String = unwrap(this).getStorageConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutoParticipantRecordingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty):
          AutoParticipantRecordingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoParticipantRecordingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoParticipantRecordingConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnStage.AutoParticipantRecordingConfigurationProperty
    }
  }
}
