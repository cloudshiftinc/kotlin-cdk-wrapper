@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

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
 * Properties for defining a `CfnStage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnStageProps cfnStageProps = CfnStageProps.builder()
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
public interface CfnStageProps {
  /**
   * Configuration object for individual participant recording, to attach to the new stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
   */
  public fun autoParticipantRecordingConfiguration(): Any? =
      unwrap(this).getAutoParticipantRecordingConfiguration()

  /**
   * Stage name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage.
     */
    public
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: IResolvable)

    /**
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage.
     */
    public
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: CfnStage.AutoParticipantRecordingConfigurationProperty)

    /**
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be7f8235f22b77c876b541213c0a87fe2aa5fb500224d091727be978f7ae51bf")
    public
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: CfnStage.AutoParticipantRecordingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name Stage name.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnStageProps.Builder =
        software.amazon.awscdk.services.ivs.CfnStageProps.builder()

    /**
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage.
     */
    override
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: IResolvable) {
      cdkBuilder.autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage.
     */
    override
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: CfnStage.AutoParticipantRecordingConfigurationProperty) {
      cdkBuilder.autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration.let(CfnStage.AutoParticipantRecordingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param autoParticipantRecordingConfiguration Configuration object for individual participant
     * recording, to attach to the new stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be7f8235f22b77c876b541213c0a87fe2aa5fb500224d091727be978f7ae51bf")
    override
        fun autoParticipantRecordingConfiguration(autoParticipantRecordingConfiguration: CfnStage.AutoParticipantRecordingConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoParticipantRecordingConfiguration(CfnStage.AutoParticipantRecordingConfigurationProperty(autoParticipantRecordingConfiguration))

    /**
     * @param name Stage name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnStageProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnStageProps,
  ) : CdkObject(cdkObject),
      CfnStageProps {
    /**
     * Configuration object for individual participant recording, to attach to the new stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-autoparticipantrecordingconfiguration)
     */
    override fun autoParticipantRecordingConfiguration(): Any? =
        unwrap(this).getAutoParticipantRecordingConfiguration()

    /**
     * Stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-stage-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-stage.html#cfn-ivs-stage-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStageProps): CfnStageProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnStageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStageProps): software.amazon.awscdk.services.ivs.CfnStageProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnStageProps
  }
}
