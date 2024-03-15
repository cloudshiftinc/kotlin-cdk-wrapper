@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationinsights

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnApplicationProps {
  public fun attachMissingPermission(): Any? = unwrap(this).getAttachMissingPermission()

  public fun autoConfigurationEnabled(): Any? = unwrap(this).getAutoConfigurationEnabled()

  public fun componentMonitoringSettings(): Any? = unwrap(this).getComponentMonitoringSettings()

  public fun customComponents(): Any? = unwrap(this).getCustomComponents()

  public fun cweMonitorEnabled(): Any? = unwrap(this).getCweMonitorEnabled()

  public fun groupingType(): String? = unwrap(this).getGroupingType()

  public fun logPatternSets(): Any? = unwrap(this).getLogPatternSets()

  public fun opsCenterEnabled(): Any? = unwrap(this).getOpsCenterEnabled()

  public fun opsItemSnsTopicArn(): String? = unwrap(this).getOpsItemSnsTopicArn()

  public fun resourceGroupName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun attachMissingPermission(attachMissingPermission: Boolean)

    public fun attachMissingPermission(attachMissingPermission: IResolvable)

    public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean)

    public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable)

    public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable)

    public fun componentMonitoringSettings(componentMonitoringSettings: List<Any>)

    public fun componentMonitoringSettings(vararg componentMonitoringSettings: Any)

    public fun customComponents(customComponents: IResolvable)

    public fun customComponents(customComponents: List<Any>)

    public fun customComponents(vararg customComponents: Any)

    public fun cweMonitorEnabled(cweMonitorEnabled: Boolean)

    public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable)

    public fun groupingType(groupingType: String)

    public fun logPatternSets(logPatternSets: IResolvable)

    public fun logPatternSets(logPatternSets: List<Any>)

    public fun logPatternSets(vararg logPatternSets: Any)

    public fun opsCenterEnabled(opsCenterEnabled: Boolean)

    public fun opsCenterEnabled(opsCenterEnabled: IResolvable)

    public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String)

    public fun resourceGroupName(resourceGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps.builder()

    override fun attachMissingPermission(attachMissingPermission: Boolean) {
      cdkBuilder.attachMissingPermission(attachMissingPermission)
    }

    override fun attachMissingPermission(attachMissingPermission: IResolvable) {
      cdkBuilder.attachMissingPermission(attachMissingPermission.let(IResolvable::unwrap))
    }

    override fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    override fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled.let(IResolvable::unwrap))
    }

    override fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings.let(IResolvable::unwrap))
    }

    override fun componentMonitoringSettings(componentMonitoringSettings: List<Any>) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
    }

    override fun componentMonitoringSettings(vararg componentMonitoringSettings: Any): Unit =
        componentMonitoringSettings(componentMonitoringSettings.toList())

    override fun customComponents(customComponents: IResolvable) {
      cdkBuilder.customComponents(customComponents.let(IResolvable::unwrap))
    }

    override fun customComponents(customComponents: List<Any>) {
      cdkBuilder.customComponents(customComponents)
    }

    override fun customComponents(vararg customComponents: Any): Unit =
        customComponents(customComponents.toList())

    override fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    override fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled.let(IResolvable::unwrap))
    }

    override fun groupingType(groupingType: String) {
      cdkBuilder.groupingType(groupingType)
    }

    override fun logPatternSets(logPatternSets: IResolvable) {
      cdkBuilder.logPatternSets(logPatternSets.let(IResolvable::unwrap))
    }

    override fun logPatternSets(logPatternSets: List<Any>) {
      cdkBuilder.logPatternSets(logPatternSets)
    }

    override fun logPatternSets(vararg logPatternSets: Any): Unit =
        logPatternSets(logPatternSets.toList())

    override fun opsCenterEnabled(opsCenterEnabled: Boolean) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    override fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled.let(IResolvable::unwrap))
    }

    override fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
      cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
    }

    override fun resourceGroupName(resourceGroupName: String) {
      cdkBuilder.resourceGroupName(resourceGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.applicationinsights.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun attachMissingPermission(): Any? = unwrap(this).getAttachMissingPermission()

    override fun autoConfigurationEnabled(): Any? = unwrap(this).getAutoConfigurationEnabled()

    override fun componentMonitoringSettings(): Any? = unwrap(this).getComponentMonitoringSettings()

    override fun customComponents(): Any? = unwrap(this).getCustomComponents()

    override fun cweMonitorEnabled(): Any? = unwrap(this).getCweMonitorEnabled()

    override fun groupingType(): String? = unwrap(this).getGroupingType()

    override fun logPatternSets(): Any? = unwrap(this).getLogPatternSets()

    override fun opsCenterEnabled(): Any? = unwrap(this).getOpsCenterEnabled()

    override fun opsItemSnsTopicArn(): String? = unwrap(this).getOpsItemSnsTopicArn()

    override fun resourceGroupName(): String = unwrap(this).getResourceGroupName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps
  }
}
