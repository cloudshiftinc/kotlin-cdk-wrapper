@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSecurityProfileProps {
  public fun additionalMetricsToRetainV2(): Any? = unwrap(this).getAdditionalMetricsToRetainV2()

  public fun alertTargets(): Any? = unwrap(this).getAlertTargets()

  public fun behaviors(): Any? = unwrap(this).getBehaviors()

  public fun metricsExportConfig(): Any? = unwrap(this).getMetricsExportConfig()

  public fun securityProfileDescription(): String? = unwrap(this).getSecurityProfileDescription()

  public fun securityProfileName(): String? = unwrap(this).getSecurityProfileName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetArns(): List<String> = unwrap(this).getTargetArns() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable)

    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>)

    public fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any)

    public fun alertTargets(alertTargets: IResolvable)

    public fun alertTargets(alertTargets: Map<String, Any>)

    public fun behaviors(behaviors: IResolvable)

    public fun behaviors(behaviors: List<Any>)

    public fun behaviors(vararg behaviors: Any)

    public fun metricsExportConfig(metricsExportConfig: IResolvable)

    public
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0cb1b8775cdde8c710743dfc462f63545ea39c87190a767cbb57a1799cf19c")
    public
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty.Builder.() -> Unit)

    public fun securityProfileDescription(securityProfileDescription: String)

    public fun securityProfileName(securityProfileName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArns(targetArns: List<String>)

    public fun targetArns(vararg targetArns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSecurityProfileProps.Builder =
        software.amazon.awscdk.services.iot.CfnSecurityProfileProps.builder()

    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2.let(IResolvable::unwrap))
    }

    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2)
    }

    override fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any): Unit =
        additionalMetricsToRetainV2(additionalMetricsToRetainV2.toList())

    override fun alertTargets(alertTargets: IResolvable) {
      cdkBuilder.alertTargets(alertTargets.let(IResolvable::unwrap))
    }

    override fun alertTargets(alertTargets: Map<String, Any>) {
      cdkBuilder.alertTargets(alertTargets)
    }

    override fun behaviors(behaviors: IResolvable) {
      cdkBuilder.behaviors(behaviors.let(IResolvable::unwrap))
    }

    override fun behaviors(behaviors: List<Any>) {
      cdkBuilder.behaviors(behaviors)
    }

    override fun behaviors(vararg behaviors: Any): Unit = behaviors(behaviors.toList())

    override fun metricsExportConfig(metricsExportConfig: IResolvable) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(IResolvable::unwrap))
    }

    override
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(CfnSecurityProfile.MetricsExportConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0cb1b8775cdde8c710743dfc462f63545ea39c87190a767cbb57a1799cf19c")
    override
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty.Builder.() -> Unit):
        Unit =
        metricsExportConfig(CfnSecurityProfile.MetricsExportConfigProperty(metricsExportConfig))

    override fun securityProfileDescription(securityProfileDescription: String) {
      cdkBuilder.securityProfileDescription(securityProfileDescription)
    }

    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArns(targetArns: List<String>) {
      cdkBuilder.targetArns(targetArns)
    }

    override fun targetArns(vararg targetArns: String): Unit = targetArns(targetArns.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfileProps,
  ) : CdkObject(cdkObject), CfnSecurityProfileProps {
    override fun additionalMetricsToRetainV2(): Any? = unwrap(this).getAdditionalMetricsToRetainV2()

    override fun alertTargets(): Any? = unwrap(this).getAlertTargets()

    override fun behaviors(): Any? = unwrap(this).getBehaviors()

    override fun metricsExportConfig(): Any? = unwrap(this).getMetricsExportConfig()

    override fun securityProfileDescription(): String? =
        unwrap(this).getSecurityProfileDescription()

    override fun securityProfileName(): String? = unwrap(this).getSecurityProfileName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetArns(): List<String> = unwrap(this).getTargetArns() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfileProps):
        CfnSecurityProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfileProps):
        software.amazon.awscdk.services.iot.CfnSecurityProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSecurityProfileProps
  }
}
