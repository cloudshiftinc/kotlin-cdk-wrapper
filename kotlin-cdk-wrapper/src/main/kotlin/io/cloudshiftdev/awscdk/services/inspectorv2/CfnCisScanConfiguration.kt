@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.CfnResource
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
 * The CIS scan configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
 * Object oneTime;
 * CfnCisScanConfiguration cfnCisScanConfiguration = CfnCisScanConfiguration.Builder.create(this,
 * "MyCfnCisScanConfiguration")
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
 * .targets(CisTargetsProperty.builder()
 * .accountIds(List.of("accountIds"))
 * .targetResourceTags(Map.of(
 * "targetResourceTagsKey", List.of("targetResourceTags")))
 * .build())
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html)
 */
public open class CfnCisScanConfiguration(
  cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCisScanConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCisScanConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCisScanConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCisScanConfigurationProps(props)
  )

  /**
   * The CIS scan configuration's scan configuration ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

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
   * The name of the CIS scan configuration.
   */
  public open fun scanName(): String = unwrap(this).getScanName()

  /**
   * The name of the CIS scan configuration.
   */
  public open fun scanName(`value`: String) {
    unwrap(this).setScanName(`value`)
  }

  /**
   * The CIS scan configuration's schedule.
   */
  public open fun schedule(): Any = unwrap(this).getSchedule()

  /**
   * The CIS scan configuration's schedule.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The CIS scan configuration's schedule.
   */
  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty.Companion::unwrap))
  }

  /**
   * The CIS scan configuration's schedule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f4cb37b509e18b9f8f071d4885d2b7ab5f21b36cfcfed84e222bb3bc8a42251")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  /**
   * The CIS scan configuration's CIS Benchmark level.
   */
  public open fun securityLevel(): String = unwrap(this).getSecurityLevel()

  /**
   * The CIS scan configuration's CIS Benchmark level.
   */
  public open fun securityLevel(`value`: String) {
    unwrap(this).setSecurityLevel(`value`)
  }

  /**
   * The CIS scan configuration's tags.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The CIS scan configuration's tags.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The CIS scan configuration's targets.
   */
  public open fun targets(): Any = unwrap(this).getTargets()

  /**
   * The CIS scan configuration's targets.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The CIS scan configuration's targets.
   */
  public open fun targets(`value`: CisTargetsProperty) {
    unwrap(this).setTargets(`value`.let(CisTargetsProperty.Companion::unwrap))
  }

  /**
   * The CIS scan configuration's targets.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1738ad6f34319272993c32033b26e4829b2955e31d2fb4bfeb3f9b34ec45fee5")
  public open fun targets(`value`: CisTargetsProperty.Builder.() -> Unit): Unit =
      targets(CisTargetsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.inspectorv2.CfnCisScanConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the CIS scan configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-scanname)
     * @param scanName The name of the CIS scan configuration. 
     */
    public fun scanName(scanName: String)

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     * @param schedule The CIS scan configuration's schedule. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     * @param schedule The CIS scan configuration's schedule. 
     */
    public fun schedule(schedule: ScheduleProperty)

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     * @param schedule The CIS scan configuration's schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("087890ce049c3c54ba2a05cc12f6345cf444a0b3a6db8abfeb68dba1e3a48026")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    /**
     * The CIS scan configuration's CIS Benchmark level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-securitylevel)
     * @param securityLevel The CIS scan configuration's CIS Benchmark level. 
     */
    public fun securityLevel(securityLevel: String)

    /**
     * The CIS scan configuration's tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-tags)
     * @param tags The CIS scan configuration's tags. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     * @param targets The CIS scan configuration's targets. 
     */
    public fun targets(targets: IResolvable)

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     * @param targets The CIS scan configuration's targets. 
     */
    public fun targets(targets: CisTargetsProperty)

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     * @param targets The CIS scan configuration's targets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("429b28facd46c566f4bbc99bc7960628d2f124321a27058539f46067105ca654")
    public fun targets(targets: CisTargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.Builder.create(scope,
        id)

    /**
     * The name of the CIS scan configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-scanname)
     * @param scanName The name of the CIS scan configuration. 
     */
    override fun scanName(scanName: String) {
      cdkBuilder.scanName(scanName)
    }

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     * @param schedule The CIS scan configuration's schedule. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     * @param schedule The CIS scan configuration's schedule. 
     */
    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty.Companion::unwrap))
    }

    /**
     * The CIS scan configuration's schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-schedule)
     * @param schedule The CIS scan configuration's schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("087890ce049c3c54ba2a05cc12f6345cf444a0b3a6db8abfeb68dba1e3a48026")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    /**
     * The CIS scan configuration's CIS Benchmark level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-securitylevel)
     * @param securityLevel The CIS scan configuration's CIS Benchmark level. 
     */
    override fun securityLevel(securityLevel: String) {
      cdkBuilder.securityLevel(securityLevel)
    }

    /**
     * The CIS scan configuration's tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-tags)
     * @param tags The CIS scan configuration's tags. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     * @param targets The CIS scan configuration's targets. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable.Companion::unwrap))
    }

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     * @param targets The CIS scan configuration's targets. 
     */
    override fun targets(targets: CisTargetsProperty) {
      cdkBuilder.targets(targets.let(CisTargetsProperty.Companion::unwrap))
    }

    /**
     * The CIS scan configuration's targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html#cfn-inspectorv2-cisscanconfiguration-targets)
     * @param targets The CIS scan configuration's targets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("429b28facd46c566f4bbc99bc7960628d2f124321a27058539f46067105ca654")
    override fun targets(targets: CisTargetsProperty.Builder.() -> Unit): Unit =
        targets(CisTargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCisScanConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCisScanConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration):
        CfnCisScanConfiguration = CfnCisScanConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnCisScanConfiguration):
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration
  }

  /**
   * The CIS targets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * CisTargetsProperty cisTargetsProperty = CisTargetsProperty.builder()
   * .accountIds(List.of("accountIds"))
   * .targetResourceTags(Map.of(
   * "targetResourceTagsKey", List.of("targetResourceTags")))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-cistargets.html)
   */
  public interface CisTargetsProperty {
    /**
     * The CIS target account ids.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-cistargets.html#cfn-inspectorv2-cisscanconfiguration-cistargets-accountids)
     */
    public fun accountIds(): List<String>

    /**
     * The CIS target resource tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-cistargets.html#cfn-inspectorv2-cisscanconfiguration-cistargets-targetresourcetags)
     */
    public fun targetResourceTags(): Any

    /**
     * A builder for [CisTargetsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountIds The CIS target account ids. 
       */
      public fun accountIds(accountIds: List<String>)

      /**
       * @param accountIds The CIS target account ids. 
       */
      public fun accountIds(vararg accountIds: String)

      /**
       * @param targetResourceTags The CIS target resource tags. 
       */
      public fun targetResourceTags(targetResourceTags: IResolvable)

      /**
       * @param targetResourceTags The CIS target resource tags. 
       */
      public fun targetResourceTags(targetResourceTags: Map<String, List<String>>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty.builder()

      /**
       * @param accountIds The CIS target account ids. 
       */
      override fun accountIds(accountIds: List<String>) {
        cdkBuilder.accountIds(accountIds)
      }

      /**
       * @param accountIds The CIS target account ids. 
       */
      override fun accountIds(vararg accountIds: String): Unit = accountIds(accountIds.toList())

      /**
       * @param targetResourceTags The CIS target resource tags. 
       */
      override fun targetResourceTags(targetResourceTags: IResolvable) {
        cdkBuilder.targetResourceTags(targetResourceTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetResourceTags The CIS target resource tags. 
       */
      override fun targetResourceTags(targetResourceTags: Map<String, List<String>>) {
        cdkBuilder.targetResourceTags(targetResourceTags)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty,
    ) : CdkObject(cdkObject),
        CisTargetsProperty {
      /**
       * The CIS target account ids.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-cistargets.html#cfn-inspectorv2-cisscanconfiguration-cistargets-accountids)
       */
      override fun accountIds(): List<String> = unwrap(this).getAccountIds()

      /**
       * The CIS target resource tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-cistargets.html#cfn-inspectorv2-cisscanconfiguration-cistargets-targetresourcetags)
       */
      override fun targetResourceTags(): Any = unwrap(this).getTargetResourceTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CisTargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty):
          CisTargetsProperty = CdkObjectWrappers.wrap(cdkObject) as? CisTargetsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CisTargetsProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.CisTargetsProperty
    }
  }

  /**
   * A daily schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * DailyScheduleProperty dailyScheduleProperty = DailyScheduleProperty.builder()
   * .startTime(TimeProperty.builder()
   * .timeOfDay("timeOfDay")
   * .timeZone("timeZone")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-dailyschedule.html)
   */
  public interface DailyScheduleProperty {
    /**
     * The schedule start time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-dailyschedule.html#cfn-inspectorv2-cisscanconfiguration-dailyschedule-starttime)
     */
    public fun startTime(): Any

    /**
     * A builder for [DailyScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param startTime The schedule start time. 
       */
      public fun startTime(startTime: IResolvable)

      /**
       * @param startTime The schedule start time. 
       */
      public fun startTime(startTime: TimeProperty)

      /**
       * @param startTime The schedule start time. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb09ecf9eef1da4425c5f6eca151395af85b7ba72e73f27c8eba0e8630743065")
      public fun startTime(startTime: TimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty.builder()

      /**
       * @param startTime The schedule start time. 
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTime The schedule start time. 
       */
      override fun startTime(startTime: TimeProperty) {
        cdkBuilder.startTime(startTime.let(TimeProperty.Companion::unwrap))
      }

      /**
       * @param startTime The schedule start time. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb09ecf9eef1da4425c5f6eca151395af85b7ba72e73f27c8eba0e8630743065")
      override fun startTime(startTime: TimeProperty.Builder.() -> Unit): Unit =
          startTime(TimeProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty,
    ) : CdkObject(cdkObject),
        DailyScheduleProperty {
      /**
       * The schedule start time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-dailyschedule.html#cfn-inspectorv2-cisscanconfiguration-dailyschedule-starttime)
       */
      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DailyScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty):
          DailyScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? DailyScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DailyScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.DailyScheduleProperty
    }
  }

  /**
   * A monthly schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * MonthlyScheduleProperty monthlyScheduleProperty = MonthlyScheduleProperty.builder()
   * .day("day")
   * .startTime(TimeProperty.builder()
   * .timeOfDay("timeOfDay")
   * .timeZone("timeZone")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-monthlyschedule.html)
   */
  public interface MonthlyScheduleProperty {
    /**
     * The monthly schedule's day.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-monthlyschedule.html#cfn-inspectorv2-cisscanconfiguration-monthlyschedule-day)
     */
    public fun day(): String

    /**
     * The monthly schedule's start time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-monthlyschedule.html#cfn-inspectorv2-cisscanconfiguration-monthlyschedule-starttime)
     */
    public fun startTime(): Any

    /**
     * A builder for [MonthlyScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param day The monthly schedule's day. 
       */
      public fun day(day: String)

      /**
       * @param startTime The monthly schedule's start time. 
       */
      public fun startTime(startTime: IResolvable)

      /**
       * @param startTime The monthly schedule's start time. 
       */
      public fun startTime(startTime: TimeProperty)

      /**
       * @param startTime The monthly schedule's start time. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02a94c74313d25d651b578e331fa7369d1eccc96782f339006dde9639857382a")
      public fun startTime(startTime: TimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty.builder()

      /**
       * @param day The monthly schedule's day. 
       */
      override fun day(day: String) {
        cdkBuilder.day(day)
      }

      /**
       * @param startTime The monthly schedule's start time. 
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTime The monthly schedule's start time. 
       */
      override fun startTime(startTime: TimeProperty) {
        cdkBuilder.startTime(startTime.let(TimeProperty.Companion::unwrap))
      }

      /**
       * @param startTime The monthly schedule's start time. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02a94c74313d25d651b578e331fa7369d1eccc96782f339006dde9639857382a")
      override fun startTime(startTime: TimeProperty.Builder.() -> Unit): Unit =
          startTime(TimeProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty,
    ) : CdkObject(cdkObject),
        MonthlyScheduleProperty {
      /**
       * The monthly schedule's day.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-monthlyschedule.html#cfn-inspectorv2-cisscanconfiguration-monthlyschedule-day)
       */
      override fun day(): String = unwrap(this).getDay()

      /**
       * The monthly schedule's start time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-monthlyschedule.html#cfn-inspectorv2-cisscanconfiguration-monthlyschedule-starttime)
       */
      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonthlyScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty):
          MonthlyScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? MonthlyScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonthlyScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.MonthlyScheduleProperty
    }
  }

  /**
   * The schedule the CIS scan configuration runs on.
   *
   * Each CIS scan configuration has exactly one type of schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * Object oneTime;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * A daily schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-daily)
     */
    public fun daily(): Any? = unwrap(this).getDaily()

    /**
     * A monthly schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-monthly)
     */
    public fun monthly(): Any? = unwrap(this).getMonthly()

    /**
     * A one time schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-onetime)
     */
    public fun oneTime(): Any? = unwrap(this).getOneTime()

    /**
     * A weekly schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-weekly)
     */
    public fun weekly(): Any? = unwrap(this).getWeekly()

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daily A daily schedule.
       */
      public fun daily(daily: IResolvable)

      /**
       * @param daily A daily schedule.
       */
      public fun daily(daily: DailyScheduleProperty)

      /**
       * @param daily A daily schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a793aa2bb18b17772304b6daaa4b7513a0e99e5257ea2be2acf1b1aa9ae4ee7")
      public fun daily(daily: DailyScheduleProperty.Builder.() -> Unit)

      /**
       * @param monthly A monthly schedule.
       */
      public fun monthly(monthly: IResolvable)

      /**
       * @param monthly A monthly schedule.
       */
      public fun monthly(monthly: MonthlyScheduleProperty)

      /**
       * @param monthly A monthly schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f22f866af9e8b921eeaa34e2e060a32bcb0bb634a972233bfda7dfc2b9bfa58")
      public fun monthly(monthly: MonthlyScheduleProperty.Builder.() -> Unit)

      /**
       * @param oneTime A one time schedule.
       */
      public fun oneTime(oneTime: Any)

      /**
       * @param weekly A weekly schedule.
       */
      public fun weekly(weekly: IResolvable)

      /**
       * @param weekly A weekly schedule.
       */
      public fun weekly(weekly: WeeklyScheduleProperty)

      /**
       * @param weekly A weekly schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfc2208bc417831b944346733777cf29fde0f8583c5a4c0b66486a503067b3ea")
      public fun weekly(weekly: WeeklyScheduleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty.builder()

      /**
       * @param daily A daily schedule.
       */
      override fun daily(daily: IResolvable) {
        cdkBuilder.daily(daily.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param daily A daily schedule.
       */
      override fun daily(daily: DailyScheduleProperty) {
        cdkBuilder.daily(daily.let(DailyScheduleProperty.Companion::unwrap))
      }

      /**
       * @param daily A daily schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a793aa2bb18b17772304b6daaa4b7513a0e99e5257ea2be2acf1b1aa9ae4ee7")
      override fun daily(daily: DailyScheduleProperty.Builder.() -> Unit): Unit =
          daily(DailyScheduleProperty(daily))

      /**
       * @param monthly A monthly schedule.
       */
      override fun monthly(monthly: IResolvable) {
        cdkBuilder.monthly(monthly.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monthly A monthly schedule.
       */
      override fun monthly(monthly: MonthlyScheduleProperty) {
        cdkBuilder.monthly(monthly.let(MonthlyScheduleProperty.Companion::unwrap))
      }

      /**
       * @param monthly A monthly schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f22f866af9e8b921eeaa34e2e060a32bcb0bb634a972233bfda7dfc2b9bfa58")
      override fun monthly(monthly: MonthlyScheduleProperty.Builder.() -> Unit): Unit =
          monthly(MonthlyScheduleProperty(monthly))

      /**
       * @param oneTime A one time schedule.
       */
      override fun oneTime(oneTime: Any) {
        cdkBuilder.oneTime(oneTime)
      }

      /**
       * @param weekly A weekly schedule.
       */
      override fun weekly(weekly: IResolvable) {
        cdkBuilder.weekly(weekly.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param weekly A weekly schedule.
       */
      override fun weekly(weekly: WeeklyScheduleProperty) {
        cdkBuilder.weekly(weekly.let(WeeklyScheduleProperty.Companion::unwrap))
      }

      /**
       * @param weekly A weekly schedule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfc2208bc417831b944346733777cf29fde0f8583c5a4c0b66486a503067b3ea")
      override fun weekly(weekly: WeeklyScheduleProperty.Builder.() -> Unit): Unit =
          weekly(WeeklyScheduleProperty(weekly))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty,
    ) : CdkObject(cdkObject),
        ScheduleProperty {
      /**
       * A daily schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-daily)
       */
      override fun daily(): Any? = unwrap(this).getDaily()

      /**
       * A monthly schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-monthly)
       */
      override fun monthly(): Any? = unwrap(this).getMonthly()

      /**
       * A one time schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-onetime)
       */
      override fun oneTime(): Any? = unwrap(this).getOneTime()

      /**
       * A weekly schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html#cfn-inspectorv2-cisscanconfiguration-schedule-weekly)
       */
      override fun weekly(): Any? = unwrap(this).getWeekly()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty):
          ScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.ScheduleProperty
    }
  }

  /**
   * The time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * TimeProperty timeProperty = TimeProperty.builder()
   * .timeOfDay("timeOfDay")
   * .timeZone("timeZone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-time.html)
   */
  public interface TimeProperty {
    /**
     * The time of day in 24-hour format (00:00).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-time.html#cfn-inspectorv2-cisscanconfiguration-time-timeofday)
     */
    public fun timeOfDay(): String

    /**
     * The timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-time.html#cfn-inspectorv2-cisscanconfiguration-time-timezone)
     */
    public fun timeZone(): String

    /**
     * A builder for [TimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timeOfDay The time of day in 24-hour format (00:00). 
       */
      public fun timeOfDay(timeOfDay: String)

      /**
       * @param timeZone The timezone. 
       */
      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty.builder()

      /**
       * @param timeOfDay The time of day in 24-hour format (00:00). 
       */
      override fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
      }

      /**
       * @param timeZone The timezone. 
       */
      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty,
    ) : CdkObject(cdkObject),
        TimeProperty {
      /**
       * The time of day in 24-hour format (00:00).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-time.html#cfn-inspectorv2-cisscanconfiguration-time-timeofday)
       */
      override fun timeOfDay(): String = unwrap(this).getTimeOfDay()

      /**
       * The timezone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-time.html#cfn-inspectorv2-cisscanconfiguration-time-timezone)
       */
      override fun timeZone(): String = unwrap(this).getTimeZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty):
          TimeProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.TimeProperty
    }
  }

  /**
   * A weekly schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.inspectorv2.*;
   * WeeklyScheduleProperty weeklyScheduleProperty = WeeklyScheduleProperty.builder()
   * .days(List.of("days"))
   * .startTime(TimeProperty.builder()
   * .timeOfDay("timeOfDay")
   * .timeZone("timeZone")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-weeklyschedule.html)
   */
  public interface WeeklyScheduleProperty {
    /**
     * The weekly schedule's days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-weeklyschedule.html#cfn-inspectorv2-cisscanconfiguration-weeklyschedule-days)
     */
    public fun days(): List<String>

    /**
     * The weekly schedule's start time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-weeklyschedule.html#cfn-inspectorv2-cisscanconfiguration-weeklyschedule-starttime)
     */
    public fun startTime(): Any

    /**
     * A builder for [WeeklyScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param days The weekly schedule's days. 
       */
      public fun days(days: List<String>)

      /**
       * @param days The weekly schedule's days. 
       */
      public fun days(vararg days: String)

      /**
       * @param startTime The weekly schedule's start time. 
       */
      public fun startTime(startTime: IResolvable)

      /**
       * @param startTime The weekly schedule's start time. 
       */
      public fun startTime(startTime: TimeProperty)

      /**
       * @param startTime The weekly schedule's start time. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5839391f6d62e041410bbc3948120e80475604f77c8619dc36f9491ea588fc32")
      public fun startTime(startTime: TimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty.Builder
          =
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty.builder()

      /**
       * @param days The weekly schedule's days. 
       */
      override fun days(days: List<String>) {
        cdkBuilder.days(days)
      }

      /**
       * @param days The weekly schedule's days. 
       */
      override fun days(vararg days: String): Unit = days(days.toList())

      /**
       * @param startTime The weekly schedule's start time. 
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTime The weekly schedule's start time. 
       */
      override fun startTime(startTime: TimeProperty) {
        cdkBuilder.startTime(startTime.let(TimeProperty.Companion::unwrap))
      }

      /**
       * @param startTime The weekly schedule's start time. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5839391f6d62e041410bbc3948120e80475604f77c8619dc36f9491ea588fc32")
      override fun startTime(startTime: TimeProperty.Builder.() -> Unit): Unit =
          startTime(TimeProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty,
    ) : CdkObject(cdkObject),
        WeeklyScheduleProperty {
      /**
       * The weekly schedule's days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-weeklyschedule.html#cfn-inspectorv2-cisscanconfiguration-weeklyschedule-days)
       */
      override fun days(): List<String> = unwrap(this).getDays()

      /**
       * The weekly schedule's start time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-weeklyschedule.html#cfn-inspectorv2-cisscanconfiguration-weeklyschedule-starttime)
       */
      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeeklyScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty):
          WeeklyScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? WeeklyScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeeklyScheduleProperty):
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration.WeeklyScheduleProperty
    }
  }
}
