@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnPlaybackConfigurationProps {
  public fun adDecisionServerUrl(): String

  public fun availSuppression(): Any? = unwrap(this).getAvailSuppression()

  public fun bumper(): Any? = unwrap(this).getBumper()

  public fun cdnConfiguration(): Any? = unwrap(this).getCdnConfiguration()

  public fun configurationAliases(): Any? = unwrap(this).getConfigurationAliases()

  public fun dashConfiguration(): Any? = unwrap(this).getDashConfiguration()

  public fun hlsConfiguration(): Any? = unwrap(this).getHlsConfiguration()

  public fun livePreRollConfiguration(): Any? = unwrap(this).getLivePreRollConfiguration()

  public fun manifestProcessingRules(): Any? = unwrap(this).getManifestProcessingRules()

  public fun name(): String

  public fun personalizationThresholdSeconds(): Number? =
      unwrap(this).getPersonalizationThresholdSeconds()

  public fun slateAdUrl(): String? = unwrap(this).getSlateAdUrl()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transcodeProfileName(): String? = unwrap(this).getTranscodeProfileName()

  public fun videoContentSourceUrl(): String

  @CdkDslMarker
  public interface Builder {
    public fun adDecisionServerUrl(adDecisionServerUrl: String)

    public fun availSuppression(availSuppression: IResolvable)

    public fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8026ba3922b4645fac3a368a451a35217382f8e0d2c964d176a220dfa0260c95")
    public
        fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty.Builder.() -> Unit)

    public fun bumper(bumper: IResolvable)

    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c571caa44879d74f4e957d8ecd927e94d804de9735a7afe3a651a86955d6ed")
    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty.Builder.() -> Unit)

    public fun cdnConfiguration(cdnConfiguration: IResolvable)

    public fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d72bd252ba0e72440ff25cd81da98020c3baf3822790d3a75479d98eafe026de")
    public
        fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder.() -> Unit)

    public fun configurationAliases(configurationAliases: IResolvable)

    public fun configurationAliases(configurationAliases: Map<String, Any>)

    public fun dashConfiguration(dashConfiguration: IResolvable)

    public
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab9a6790602423c0b91c25ed17f298b2ee9723fd955db2420e3786c66b4612bf")
    public
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty.Builder.() -> Unit)

    public fun hlsConfiguration(hlsConfiguration: IResolvable)

    public fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff87bacd09a477cc16ba0960b3b96e444632543798fcab3539fde920ef4596ce")
    public
        fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder.() -> Unit)

    public fun livePreRollConfiguration(livePreRollConfiguration: IResolvable)

    public
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("540b8a134d0608705410d3d40ab82f8883e15c1ecacfefe7c63c550ac5e4f6c5")
    public
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty.Builder.() -> Unit)

    public fun manifestProcessingRules(manifestProcessingRules: IResolvable)

    public
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669e7cb5e56087622f66455eb08ae0454596ea24e3c5a18c6f72b0cb18c5b406")
    public
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number)

    public fun slateAdUrl(slateAdUrl: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transcodeProfileName(transcodeProfileName: String)

    public fun videoContentSourceUrl(videoContentSourceUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps.builder()

    override fun adDecisionServerUrl(adDecisionServerUrl: String) {
      cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
    }

    override fun availSuppression(availSuppression: IResolvable) {
      cdkBuilder.availSuppression(availSuppression.let(IResolvable::unwrap))
    }

    override
        fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty) {
      cdkBuilder.availSuppression(availSuppression.let(CfnPlaybackConfiguration.AvailSuppressionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8026ba3922b4645fac3a368a451a35217382f8e0d2c964d176a220dfa0260c95")
    override
        fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty.Builder.() -> Unit):
        Unit = availSuppression(CfnPlaybackConfiguration.AvailSuppressionProperty(availSuppression))

    override fun bumper(bumper: IResolvable) {
      cdkBuilder.bumper(bumper.let(IResolvable::unwrap))
    }

    override fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty) {
      cdkBuilder.bumper(bumper.let(CfnPlaybackConfiguration.BumperProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c571caa44879d74f4e957d8ecd927e94d804de9735a7afe3a651a86955d6ed")
    override fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty.Builder.() -> Unit): Unit =
        bumper(CfnPlaybackConfiguration.BumperProperty(bumper))

    override fun cdnConfiguration(cdnConfiguration: IResolvable) {
      cdkBuilder.cdnConfiguration(cdnConfiguration.let(IResolvable::unwrap))
    }

    override
        fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty) {
      cdkBuilder.cdnConfiguration(cdnConfiguration.let(CfnPlaybackConfiguration.CdnConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d72bd252ba0e72440ff25cd81da98020c3baf3822790d3a75479d98eafe026de")
    override
        fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder.() -> Unit):
        Unit = cdnConfiguration(CfnPlaybackConfiguration.CdnConfigurationProperty(cdnConfiguration))

    override fun configurationAliases(configurationAliases: IResolvable) {
      cdkBuilder.configurationAliases(configurationAliases.let(IResolvable::unwrap))
    }

    override fun configurationAliases(configurationAliases: Map<String, Any>) {
      cdkBuilder.configurationAliases(configurationAliases)
    }

    override fun dashConfiguration(dashConfiguration: IResolvable) {
      cdkBuilder.dashConfiguration(dashConfiguration.let(IResolvable::unwrap))
    }

    override
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty) {
      cdkBuilder.dashConfiguration(dashConfiguration.let(CfnPlaybackConfiguration.DashConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab9a6790602423c0b91c25ed17f298b2ee9723fd955db2420e3786c66b4612bf")
    override
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty.Builder.() -> Unit):
        Unit =
        dashConfiguration(CfnPlaybackConfiguration.DashConfigurationProperty(dashConfiguration))

    override fun hlsConfiguration(hlsConfiguration: IResolvable) {
      cdkBuilder.hlsConfiguration(hlsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty) {
      cdkBuilder.hlsConfiguration(hlsConfiguration.let(CfnPlaybackConfiguration.HlsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff87bacd09a477cc16ba0960b3b96e444632543798fcab3539fde920ef4596ce")
    override
        fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder.() -> Unit):
        Unit = hlsConfiguration(CfnPlaybackConfiguration.HlsConfigurationProperty(hlsConfiguration))

    override fun livePreRollConfiguration(livePreRollConfiguration: IResolvable) {
      cdkBuilder.livePreRollConfiguration(livePreRollConfiguration.let(IResolvable::unwrap))
    }

    override
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty) {
      cdkBuilder.livePreRollConfiguration(livePreRollConfiguration.let(CfnPlaybackConfiguration.LivePreRollConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("540b8a134d0608705410d3d40ab82f8883e15c1ecacfefe7c63c550ac5e4f6c5")
    override
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty.Builder.() -> Unit):
        Unit =
        livePreRollConfiguration(CfnPlaybackConfiguration.LivePreRollConfigurationProperty(livePreRollConfiguration))

    override fun manifestProcessingRules(manifestProcessingRules: IResolvable) {
      cdkBuilder.manifestProcessingRules(manifestProcessingRules.let(IResolvable::unwrap))
    }

    override
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty) {
      cdkBuilder.manifestProcessingRules(manifestProcessingRules.let(CfnPlaybackConfiguration.ManifestProcessingRulesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669e7cb5e56087622f66455eb08ae0454596ea24e3c5a18c6f72b0cb18c5b406")
    override
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder.() -> Unit):
        Unit =
        manifestProcessingRules(CfnPlaybackConfiguration.ManifestProcessingRulesProperty(manifestProcessingRules))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number) {
      cdkBuilder.personalizationThresholdSeconds(personalizationThresholdSeconds)
    }

    override fun slateAdUrl(slateAdUrl: String) {
      cdkBuilder.slateAdUrl(slateAdUrl)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transcodeProfileName(transcodeProfileName: String) {
      cdkBuilder.transcodeProfileName(transcodeProfileName)
    }

    override fun videoContentSourceUrl(videoContentSourceUrl: String) {
      cdkBuilder.videoContentSourceUrl(videoContentSourceUrl)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps,
  ) : CdkObject(cdkObject), CfnPlaybackConfigurationProps {
    override fun adDecisionServerUrl(): String = unwrap(this).getAdDecisionServerUrl()

    override fun availSuppression(): Any? = unwrap(this).getAvailSuppression()

    override fun bumper(): Any? = unwrap(this).getBumper()

    override fun cdnConfiguration(): Any? = unwrap(this).getCdnConfiguration()

    override fun configurationAliases(): Any? = unwrap(this).getConfigurationAliases()

    override fun dashConfiguration(): Any? = unwrap(this).getDashConfiguration()

    override fun hlsConfiguration(): Any? = unwrap(this).getHlsConfiguration()

    override fun livePreRollConfiguration(): Any? = unwrap(this).getLivePreRollConfiguration()

    override fun manifestProcessingRules(): Any? = unwrap(this).getManifestProcessingRules()

    override fun name(): String = unwrap(this).getName()

    override fun personalizationThresholdSeconds(): Number? =
        unwrap(this).getPersonalizationThresholdSeconds()

    override fun slateAdUrl(): String? = unwrap(this).getSlateAdUrl()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transcodeProfileName(): String? = unwrap(this).getTranscodeProfileName()

    override fun videoContentSourceUrl(): String = unwrap(this).getVideoContentSourceUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaybackConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps):
        CfnPlaybackConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackConfigurationProps):
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
  }
}
