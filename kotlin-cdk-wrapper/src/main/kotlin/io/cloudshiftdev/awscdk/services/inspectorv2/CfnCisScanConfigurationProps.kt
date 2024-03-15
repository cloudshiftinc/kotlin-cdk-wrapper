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

/**
 * Properties for defining a `CfnCisScanConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
 * Object oneTime;
 * CfnCisScanConfigurationProps cfnCisScanConfigurationProps =
 * CfnCisScanConfigurationProps.builder()
 * .scanName("scanName")
 * .schedule(ScheduleProperty.builder()
 * .daily(DailyScheduleProperty.builder()
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .monthly(MonthlyScheduleProperty.builder()
 * .day("day")
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .oneTime(oneTime)
 * .weekly(WeeklyScheduleProperty.builder()
 * .days(List.of("days"))
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .build())
 * .securityLevel("securityLevel")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .targets(CisTargetsProperty.builder()
 * .accountIds(List.of("accountIds"))
 * // the properties below are optional
 * .targetResourceTags(Map.of(
 * "targetResourceTagsKey", List.of("targetResourceTags")))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html)
 */
public interface CfnCisScanConfigurationProps {
  /**
   * The name of the CIS scan configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-scanname)
   */
  public fun scanName(): String? = unwrap(this).getScanName()

  /**
   * The CIS scan configuration's schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The CIS scan configuration's CIS Benchmark level.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-securitylevel)
   */
  public fun securityLevel(): String? = unwrap(this).getSecurityLevel()

  /**
   * The CIS scan configuration's tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The CIS scan configuration's targets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
   */
  public fun targets(): Any? = unwrap(this).getTargets()

  /**
   * A builder for [CfnCisScanConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param scanName The name of the CIS scan configuration.
     */
    public fun scanName(scanName: String)

    /**
     * @param schedule The CIS scan configuration's schedule.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule The CIS scan configuration's schedule.
     */
    public fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty)

    /**
     * @param schedule The CIS scan configuration's schedule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e5d89b1f14380c623267eb6d54a690ab5b9f2db13c45d7ac3539f5c5dac0052")
    public fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty.Builder.() -> Unit)

    /**
     * @param securityLevel The CIS scan configuration's CIS Benchmark level.
     */
    public fun securityLevel(securityLevel: String)

    /**
     * @param tags The CIS scan configuration's tags.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targets The CIS scan configuration's targets.
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets The CIS scan configuration's targets.
     */
    public fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty)

    /**
     * @param targets The CIS scan configuration's targets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d8ed6caf72d6da3ffd06074e11313246cd4fcd0567453d59b22ba1443286dff")
    public fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps.builder()

    /**
     * @param scanName The name of the CIS scan configuration.
     */
    override fun scanName(scanName: String) {
      cdkBuilder.scanName(scanName)
    }

    /**
     * @param schedule The CIS scan configuration's schedule.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule The CIS scan configuration's schedule.
     */
    override fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCisScanConfiguration.ScheduleProperty::unwrap))
    }

    /**
     * @param schedule The CIS scan configuration's schedule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e5d89b1f14380c623267eb6d54a690ab5b9f2db13c45d7ac3539f5c5dac0052")
    override fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty.Builder.() -> Unit):
        Unit = schedule(CfnCisScanConfiguration.ScheduleProperty(schedule))

    /**
     * @param securityLevel The CIS scan configuration's CIS Benchmark level.
     */
    override fun securityLevel(securityLevel: String) {
      cdkBuilder.securityLevel(securityLevel)
    }

    /**
     * @param tags The CIS scan configuration's tags.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targets The CIS scan configuration's targets.
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets The CIS scan configuration's targets.
     */
    override fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty) {
      cdkBuilder.targets(targets.let(CfnCisScanConfiguration.CisTargetsProperty::unwrap))
    }

    /**
     * @param targets The CIS scan configuration's targets.
     */
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
    /**
     * The name of the CIS scan configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-scanname)
     */
    override fun scanName(): String? = unwrap(this).getScanName()

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The CIS scan configuration's CIS Benchmark level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-securitylevel)
     */
    override fun securityLevel(): String? = unwrap(this).getSecurityLevel()

    /**
     * The CIS scan configuration's tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     */
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
