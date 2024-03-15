@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnCisScanConfigurationProps {
  public fun scanName(): String? = unwrap(this).getScanName()

  public fun schedule(): Any? = unwrap(this).getSchedule()

  public fun securityLevel(): String? = unwrap(this).getSecurityLevel()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun targets(): Any? = unwrap(this).getTargets()

  @CdkDslMarker
  public interface Builder {
    public fun scanName(scanName: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e5d89b1f14380c623267eb6d54a690ab5b9f2db13c45d7ac3539f5c5dac0052")
    public fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty.Builder.() -> Unit)

    public fun securityLevel(securityLevel: String)

    public fun tags(tags: Map<String, String>)

    public fun targets(targets: IResolvable)

    public fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d8ed6caf72d6da3ffd06074e11313246cd4fcd0567453d59b22ba1443286dff")
    public fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps.builder()

    override fun scanName(scanName: String) {
      cdkBuilder.scanName(scanName)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCisScanConfiguration.ScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e5d89b1f14380c623267eb6d54a690ab5b9f2db13c45d7ac3539f5c5dac0052")
    override fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty.Builder.() -> Unit):
        Unit = schedule(CfnCisScanConfiguration.ScheduleProperty(schedule))

    override fun securityLevel(securityLevel: String) {
      cdkBuilder.securityLevel(securityLevel)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty) {
      cdkBuilder.targets(targets.let(CfnCisScanConfiguration.CisTargetsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d8ed6caf72d6da3ffd06074e11313246cd4fcd0567453d59b22ba1443286dff")
    override fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty.Builder.() -> Unit):
        Unit = targets(CfnCisScanConfiguration.CisTargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps,
  ) : CdkObject(cdkObject), CfnCisScanConfigurationProps {
    override fun scanName(): String? = unwrap(this).getScanName()

    override fun schedule(): Any? = unwrap(this).getSchedule()

    override fun securityLevel(): String? = unwrap(this).getSecurityLevel()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun targets(): Any? = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCisScanConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps):
        CfnCisScanConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCisScanConfigurationProps):
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps
  }
}
