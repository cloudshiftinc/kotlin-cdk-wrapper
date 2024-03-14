package io.cloudshiftdev.awscdk.services.arczonalshift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnZonalAutoshiftConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
   * specified for a practice run, as well as any blocked dates or blocked windows for the practice
   * run.
   */
  public open fun practiceRunConfiguration(): Any? = unwrap(this).getPracticeRunConfiguration()

  /**
   * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
   * specified for a practice run, as well as any blocked dates or blocked windows for the practice
   * run.
   */
  public open fun practiceRunConfiguration(`value`: IResolvable) {
    unwrap(this).setPracticeRunConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
   * specified for a practice run, as well as any blocked dates or blocked windows for the practice
   * run.
   */
  public open fun practiceRunConfiguration(`value`: PracticeRunConfigurationProperty) {
    unwrap(this).setPracticeRunConfiguration(`value`.let(PracticeRunConfigurationProperty::unwrap))
  }

  /**
   * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
   * specified for a practice run, as well as any blocked dates or blocked windows for the practice
   * run.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("17281cf35a06f4949d3135c29e87bad5eb2456f109c2d9ec865147db883ab099")
  public open
      fun practiceRunConfiguration(`value`: PracticeRunConfigurationProperty.Builder.() -> Unit):
      Unit = practiceRunConfiguration(PracticeRunConfigurationProperty(`value`))

  /**
   * The identifier for the resource that AWS shifts traffic for.
   */
  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * The identifier for the resource that AWS shifts traffic for.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
   * application from an Availability Zone during events, on your behalf, to help reduce time to
   * recovery.
   */
  public open fun zonalAutoshiftStatus(): String? = unwrap(this).getZonalAutoshiftStatus()

  /**
   * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
   * application from an Availability Zone during events, on your behalf, to help reduce time to
   * recovery.
   */
  public open fun zonalAutoshiftStatus(`value`: String) {
    unwrap(this).setZonalAutoshiftStatus(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during an
     * autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run. 
     */
    public fun practiceRunConfiguration(practiceRunConfiguration: IResolvable)

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during an
     * autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run. 
     */
    public fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty)

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during an
     * autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44e23cd0c76947b4a98fd46ae201caf0ff99e65f2768fdc876aade01a8be9e92")
    public
        fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty.Builder.() -> Unit)

    /**
     * The identifier for the resource that AWS shifts traffic for.
     *
     * The identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers
     * with cross-zone load balancing turned off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-resourceidentifier)
     * @param resourceIdentifier The identifier for the resource that AWS shifts traffic for. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
     * application from an Availability Zone during events, on your behalf, to help reduce time to
     * recovery.
     *
     * Traffic is also shifted away for the required weekly practice runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-zonalautoshiftstatus)
     * @param zonalAutoshiftStatus When zonal autoshift is `ENABLED` , you authorize AWS to shift
     * away resource traffic for an application from an Availability Zone during events, on your
     * behalf, to help reduce time to recovery. 
     */
    public fun zonalAutoshiftStatus(zonalAutoshiftStatus: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.Builder =
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.Builder.create(scope,
        id)

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during an
     * autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run. 
     */
    override fun practiceRunConfiguration(practiceRunConfiguration: IResolvable) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during an
     * autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run. 
     */
    override
        fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty) {
      cdkBuilder.practiceRunConfiguration(practiceRunConfiguration.let(PracticeRunConfigurationProperty::unwrap))
    }

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the practice
     * run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during an
     * autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run configuration
     * is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     * Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked dates
     * or blocked windows for the practice run. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44e23cd0c76947b4a98fd46ae201caf0ff99e65f2768fdc876aade01a8be9e92")
    override
        fun practiceRunConfiguration(practiceRunConfiguration: PracticeRunConfigurationProperty.Builder.() -> Unit):
        Unit = practiceRunConfiguration(PracticeRunConfigurationProperty(practiceRunConfiguration))

    /**
     * The identifier for the resource that AWS shifts traffic for.
     *
     * The identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers
     * with cross-zone load balancing turned off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-resourceidentifier)
     * @param resourceIdentifier The identifier for the resource that AWS shifts traffic for. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
     * application from an Availability Zone during events, on your behalf, to help reduce time to
     * recovery.
     *
     * Traffic is also shifted away for the required weekly practice runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-zonalautoshiftstatus)
     * @param zonalAutoshiftStatus When zonal autoshift is `ENABLED` , you authorize AWS to shift
     * away resource traffic for an application from an Availability Zone during events, on your
     * behalf, to help reduce time to recovery. 
     */
    override fun zonalAutoshiftStatus(zonalAutoshiftStatus: String) {
      cdkBuilder.zonalAutoshiftStatus(zonalAutoshiftStatus)
    }

    public fun build(): software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnZonalAutoshiftConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnZonalAutoshiftConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration):
        CfnZonalAutoshiftConfiguration = CfnZonalAutoshiftConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnZonalAutoshiftConfiguration):
        software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration =
        wrapped.cdkObject
  }

  public interface PracticeRunConfigurationProperty {
    /**
     * An array of one or more dates that you can specify when AWS does not start practice runs for
     * a resource.
     *
     * Dates are in UTC.
     *
     * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-blockeddates)
     */
    public fun blockedDates(): List<String> = unwrap(this).getBlockedDates() ?: emptyList()

    /**
     * An array of one or more days and times that you can specify when Route 53 ARC does not start
     * practice runs for a resource.
     *
     * Days and times are in UTC.
     *
     * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
     * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-blockedwindows)
     */
    public fun blockedWindows(): List<String> = unwrap(this).getBlockedWindows() ?: emptyList()

    /**
     * An optional alarm that you can specify that blocks practice runs when the alarm is in an
     * `ALARM` state.
     *
     * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
     * started, and ends practice runs that are in progress.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-blockingalarms)
     */
    public fun blockingAlarms(): Any? = unwrap(this).getBlockingAlarms()

    /**
     * The alarm that you specify to monitor the health of your application during practice runs.
     *
     * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the outcome
     * is set to `FAILED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-outcomealarms)
     */
    public fun outcomeAlarms(): Any

    /**
     * A builder for [PracticeRunConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockedDates An array of one or more dates that you can specify when AWS does not
       * start practice runs for a resource.
       * Dates are in UTC.
       *
       * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
       */
      public fun blockedDates(blockedDates: List<String>)

      /**
       * @param blockedDates An array of one or more dates that you can specify when AWS does not
       * start practice runs for a resource.
       * Dates are in UTC.
       *
       * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
       */
      public fun blockedDates(vararg blockedDates: String)

      /**
       * @param blockedWindows An array of one or more days and times that you can specify when
       * Route 53 ARC does not start practice runs for a resource.
       * Days and times are in UTC.
       *
       * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
       * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
       */
      public fun blockedWindows(blockedWindows: List<String>)

      /**
       * @param blockedWindows An array of one or more days and times that you can specify when
       * Route 53 ARC does not start practice runs for a resource.
       * Days and times are in UTC.
       *
       * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
       * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
       */
      public fun blockedWindows(vararg blockedWindows: String)

      /**
       * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
       * the alarm is in an `ALARM` state.
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       */
      public fun blockingAlarms(blockingAlarms: IResolvable)

      /**
       * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
       * the alarm is in an `ALARM` state.
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       */
      public fun blockingAlarms(blockingAlarms: List<Any>)

      /**
       * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
       * the alarm is in an `ALARM` state.
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       */
      public fun blockingAlarms(vararg blockingAlarms: Any)

      /**
       * @param outcomeAlarms The alarm that you specify to monitor the health of your application
       * during practice runs. 
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       */
      public fun outcomeAlarms(outcomeAlarms: IResolvable)

      /**
       * @param outcomeAlarms The alarm that you specify to monitor the health of your application
       * during practice runs. 
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       */
      public fun outcomeAlarms(outcomeAlarms: List<Any>)

      /**
       * @param outcomeAlarms The alarm that you specify to monitor the health of your application
       * during practice runs. 
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       */
      public fun outcomeAlarms(vararg outcomeAlarms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.builder()

      /**
       * @param blockedDates An array of one or more dates that you can specify when AWS does not
       * start practice runs for a resource.
       * Dates are in UTC.
       *
       * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
       */
      override fun blockedDates(blockedDates: List<String>) {
        cdkBuilder.blockedDates(blockedDates)
      }

      /**
       * @param blockedDates An array of one or more dates that you can specify when AWS does not
       * start practice runs for a resource.
       * Dates are in UTC.
       *
       * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
       */
      override fun blockedDates(vararg blockedDates: String): Unit =
          blockedDates(blockedDates.toList())

      /**
       * @param blockedWindows An array of one or more days and times that you can specify when
       * Route 53 ARC does not start practice runs for a resource.
       * Days and times are in UTC.
       *
       * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
       * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
       */
      override fun blockedWindows(blockedWindows: List<String>) {
        cdkBuilder.blockedWindows(blockedWindows)
      }

      /**
       * @param blockedWindows An array of one or more days and times that you can specify when
       * Route 53 ARC does not start practice runs for a resource.
       * Days and times are in UTC.
       *
       * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
       * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
       */
      override fun blockedWindows(vararg blockedWindows: String): Unit =
          blockedWindows(blockedWindows.toList())

      /**
       * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
       * the alarm is in an `ALARM` state.
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       */
      override fun blockingAlarms(blockingAlarms: IResolvable) {
        cdkBuilder.blockingAlarms(blockingAlarms.let(IResolvable::unwrap))
      }

      /**
       * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
       * the alarm is in an `ALARM` state.
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       */
      override fun blockingAlarms(blockingAlarms: List<Any>) {
        cdkBuilder.blockingAlarms(blockingAlarms)
      }

      /**
       * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
       * the alarm is in an `ALARM` state.
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       */
      override fun blockingAlarms(vararg blockingAlarms: Any): Unit =
          blockingAlarms(blockingAlarms.toList())

      /**
       * @param outcomeAlarms The alarm that you specify to monitor the health of your application
       * during practice runs. 
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       */
      override fun outcomeAlarms(outcomeAlarms: IResolvable) {
        cdkBuilder.outcomeAlarms(outcomeAlarms.let(IResolvable::unwrap))
      }

      /**
       * @param outcomeAlarms The alarm that you specify to monitor the health of your application
       * during practice runs. 
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       */
      override fun outcomeAlarms(outcomeAlarms: List<Any>) {
        cdkBuilder.outcomeAlarms(outcomeAlarms)
      }

      /**
       * @param outcomeAlarms The alarm that you specify to monitor the health of your application
       * during practice runs. 
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       */
      override fun outcomeAlarms(vararg outcomeAlarms: Any): Unit =
          outcomeAlarms(outcomeAlarms.toList())

      public fun build():
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty,
    ) : CdkObject(cdkObject), PracticeRunConfigurationProperty {
      /**
       * An array of one or more dates that you can specify when AWS does not start practice runs
       * for a resource.
       *
       * Dates are in UTC.
       *
       * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-blockeddates)
       */
      override fun blockedDates(): List<String> = unwrap(this).getBlockedDates() ?: emptyList()

      /**
       * An array of one or more days and times that you can specify when Route 53 ARC does not
       * start practice runs for a resource.
       *
       * Days and times are in UTC.
       *
       * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
       * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-blockedwindows)
       */
      override fun blockedWindows(): List<String> = unwrap(this).getBlockedWindows() ?: emptyList()

      /**
       * An optional alarm that you can specify that blocks practice runs when the alarm is in an
       * `ALARM` state.
       *
       * When a blocking alarm goes into an `ALARM` state, it prevents practice runs from being
       * started, and ends practice runs that are in progress.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-blockingalarms)
       */
      override fun blockingAlarms(): Any? = unwrap(this).getBlockingAlarms()

      /**
       * The alarm that you specify to monitor the health of your application during practice runs.
       *
       * When the outcome alarm goes into an `ALARM` state, the practice run is ended and the
       * outcome is set to `FAILED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration-outcomealarms)
       */
      override fun outcomeAlarms(): Any = unwrap(this).getOutcomeAlarms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PracticeRunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty):
          PracticeRunConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PracticeRunConfigurationProperty):
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
    }
  }

  public interface ControlConditionProperty {
    /**
     * The Amazon Resource Name (ARN) for an Amazon CloudWatch alarm that you specify as a control
     * condition for a practice run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-controlcondition.html#cfn-arczonalshift-zonalautoshiftconfiguration-controlcondition-alarmidentifier)
     */
    public fun alarmIdentifier(): String

    /**
     * The type of alarm specified for a practice run.
     *
     * You can only specify Amazon CloudWatch alarms for practice runs, so the only valid value is
     * `CLOUDWATCH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-controlcondition.html#cfn-arczonalshift-zonalautoshiftconfiguration-controlcondition-type)
     */
    public fun type(): String

    /**
     * A builder for [ControlConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmIdentifier The Amazon Resource Name (ARN) for an Amazon CloudWatch alarm that
       * you specify as a control condition for a practice run. 
       */
      public fun alarmIdentifier(alarmIdentifier: String)

      /**
       * @param type The type of alarm specified for a practice run. 
       * You can only specify Amazon CloudWatch alarms for practice runs, so the only valid value is
       * `CLOUDWATCH` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty.Builder
          =
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty.builder()

      /**
       * @param alarmIdentifier The Amazon Resource Name (ARN) for an Amazon CloudWatch alarm that
       * you specify as a control condition for a practice run. 
       */
      override fun alarmIdentifier(alarmIdentifier: String) {
        cdkBuilder.alarmIdentifier(alarmIdentifier)
      }

      /**
       * @param type The type of alarm specified for a practice run. 
       * You can only specify Amazon CloudWatch alarms for practice runs, so the only valid value is
       * `CLOUDWATCH` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty,
    ) : CdkObject(cdkObject), ControlConditionProperty {
      /**
       * The Amazon Resource Name (ARN) for an Amazon CloudWatch alarm that you specify as a control
       * condition for a practice run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-controlcondition.html#cfn-arczonalshift-zonalautoshiftconfiguration-controlcondition-alarmidentifier)
       */
      override fun alarmIdentifier(): String = unwrap(this).getAlarmIdentifier()

      /**
       * The type of alarm specified for a practice run.
       *
       * You can only specify Amazon CloudWatch alarms for practice runs, so the only valid value is
       * `CLOUDWATCH` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-controlcondition.html#cfn-arczonalshift-zonalautoshiftconfiguration-controlcondition-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ControlConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty):
          ControlConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlConditionProperty):
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration.ControlConditionProperty
    }
  }
}
