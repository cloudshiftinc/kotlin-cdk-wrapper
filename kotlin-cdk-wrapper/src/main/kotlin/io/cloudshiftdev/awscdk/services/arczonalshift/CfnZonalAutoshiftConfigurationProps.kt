@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.arczonalshift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnZonalAutoshiftConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.arczonalshift.*;
 * CfnZonalAutoshiftConfigurationProps cfnZonalAutoshiftConfigurationProps =
 * CfnZonalAutoshiftConfigurationProps.builder()
 * .resourceIdentifier("resourceIdentifier")
 * // the properties below are optional
 * .practiceRunConfiguration(PracticeRunConfigurationProperty.builder()
 * .outcomeAlarms(List.of(ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .blockedDates(List.of("blockedDates"))
 * .blockedWindows(List.of("blockedWindows"))
 * .blockingAlarms(List.of(ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build()))
 * .build())
 * .zonalAutoshiftStatus("zonalAutoshiftStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html)
 */
public interface CfnZonalAutoshiftConfigurationProps {
  /**
   * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
   * specified for a practice run, as well as any blocked dates or blocked windows for the practice
   * run.
   *
   * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
   * for practice runs.
   *
   * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
   * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
   * is safe for your application.
   *
   * You can update or delete a practice run configuration. Before you delete a practice run
   * configuration, you must disable zonal autoshift for the resource. A practice run configuration is
   * required when zonal autoshift is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
   */
  public fun practiceRunConfiguration(): Any? = unwrap(this).getPracticeRunConfiguration()

  /**
   * The identifier for the resource that AWS shifts traffic for.
   *
   * The identifier is the Amazon Resource Name (ARN) for the resource.
   *
   * At this time, supported resources are Network Load Balancers and Application Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-resourceidentifier)
   */
  public fun resourceIdentifier(): String

  /**
   * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
   * application from an Availability Zone during events, on your behalf, to help reduce time to
   * recovery.
   *
   * Traffic is also shifted away for the required weekly practice runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-zonalautoshiftstatus)
   */
  public fun zonalAutoshiftStatus(): String? = unwrap(this).getZonalAutoshiftStatus()

  /**
   * A builder for [CfnZonalAutoshiftConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run.
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     */
    public fun practiceRunConfiguration(practiceRunConfiguration: IResolvable)

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run.
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     */
    public
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty)

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run.
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d78d32780a518765b544f3967d14c8f2f047636439ee9805eaa1ec40078c914")
    public
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder.() -> Unit)

    /**
     * @param resourceIdentifier The identifier for the resource that AWS shifts traffic for. 
     * The identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers.
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param zonalAutoshiftStatus When zonal autoshift is `ENABLED` , you authorize AWS to shift
     * away resource traffic for an application from an Availability Zone during events, on your
     * behalf, to help reduce time to recovery.
     * Traffic is also shifted away for the required weekly practice runs.
     */
    public fun zonalAutoshiftStatus(zonalAutoshiftStatus: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps.Builder =
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps.builder()

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run.
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     */
    override fun practiceRunConfiguration(practiceRunConfiguration: IResolvable) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run.
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     */
    override
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run.
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d78d32780a518765b544f3967d14c8f2f047636439ee9805eaa1ec40078c914")
    override
        fun practiceRunConfiguration(practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder.() -> Unit):
        Unit =
        practiceRunConfiguration(CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty(practiceRunConfiguration))

    /**
     * @param resourceIdentifier The identifier for the resource that AWS shifts traffic for. 
     * The identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers.
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param zonalAutoshiftStatus When zonal autoshift is `ENABLED` , you authorize AWS to shift
     * away resource traffic for an application from an Availability Zone during events, on your
     * behalf, to help reduce time to recovery.
     * Traffic is also shifted away for the required weekly practice runs.
     */
    override fun zonalAutoshiftStatus(zonalAutoshiftStatus: String) {
      cdkBuilder.zonalAutoshiftStatus(zonalAutoshiftStatus)
    }

    public fun build():
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnZonalAutoshiftConfigurationProps {
    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, ARC shifts traffic for the resource weekly
     * for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that ARC starts for practice
     * runs help you to ensure that shifting away traffic from an Availability Zone during an autoshift
     * is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     */
    override fun practiceRunConfiguration(): Any? = unwrap(this).getPracticeRunConfiguration()

    /**
     * The identifier for the resource that AWS shifts traffic for.
     *
     * The identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-resourceidentifier)
     */
    override fun resourceIdentifier(): String = unwrap(this).getResourceIdentifier()

    /**
     * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
     * application from an Availability Zone during events, on your behalf, to help reduce time to
     * recovery.
     *
     * Traffic is also shifted away for the required weekly practice runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-zonalautoshiftstatus)
     */
    override fun zonalAutoshiftStatus(): String? = unwrap(this).getZonalAutoshiftStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnZonalAutoshiftConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps):
        CfnZonalAutoshiftConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnZonalAutoshiftConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnZonalAutoshiftConfigurationProps):
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps
  }
}
