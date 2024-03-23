@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This is the first of two steps to create a restore testing plan;
 *
 * once this request is successful, finish the procedure with request CreateRestoreTestingSelection.
 *
 * You must include the parameter RestoreTestingPlan. You may optionally include CreatorRequestId
 * and Tags.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * CfnRestoreTestingPlan cfnRestoreTestingPlan = CfnRestoreTestingPlan.Builder.create(this,
 * "MyCfnRestoreTestingPlan")
 * .recoveryPointSelection(RestoreTestingRecoveryPointSelectionProperty.builder()
 * .algorithm("algorithm")
 * .includeVaults(List.of("includeVaults"))
 * .recoveryPointTypes(List.of("recoveryPointTypes"))
 * // the properties below are optional
 * .excludeVaults(List.of("excludeVaults"))
 * .selectionWindowDays(123)
 * .build())
 * .restoreTestingPlanName("restoreTestingPlanName")
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .scheduleExpressionTimezone("scheduleExpressionTimezone")
 * .startWindowHours(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html)
 */
public open class CfnRestoreTestingPlan(
  cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRestoreTestingPlanProps,
  ) :
      this(software.amazon.awscdk.services.backup.CfnRestoreTestingPlan(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRestoreTestingPlanProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRestoreTestingPlanProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRestoreTestingPlanProps(props)
  )

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
   */
  public open fun attrRestoreTestingPlanArn(): String = unwrap(this).getAttrRestoreTestingPlanArn()

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The specified criteria to assign a set of resources, such as recovery point types or backup
   * vaults.
   */
  public open fun recoveryPointSelection(): Any = unwrap(this).getRecoveryPointSelection()

  /**
   * The specified criteria to assign a set of resources, such as recovery point types or backup
   * vaults.
   */
  public open fun recoveryPointSelection(`value`: IResolvable) {
    unwrap(this).setRecoveryPointSelection(`value`.let(IResolvable::unwrap))
  }

  /**
   * The specified criteria to assign a set of resources, such as recovery point types or backup
   * vaults.
   */
  public open fun recoveryPointSelection(`value`: RestoreTestingRecoveryPointSelectionProperty) {
    unwrap(this).setRecoveryPointSelection(`value`.let(RestoreTestingRecoveryPointSelectionProperty::unwrap))
  }

  /**
   * The specified criteria to assign a set of resources, such as recovery point types or backup
   * vaults.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54cc7c1d51762618c7a49bc3d904fc89b72191615c3cb0991540c80b9d6d579e")
  public open
      fun recoveryPointSelection(`value`: RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit):
      Unit = recoveryPointSelection(RestoreTestingRecoveryPointSelectionProperty(`value`))

  /**
   * This is the restore testing plan name.
   */
  public open fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

  /**
   * This is the restore testing plan name.
   */
  public open fun restoreTestingPlanName(`value`: String) {
    unwrap(this).setRestoreTestingPlanName(`value`)
  }

  /**
   * A CRON expression in specified timezone when a restore testing plan is executed.
   */
  public open fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

  /**
   * A CRON expression in specified timezone when a restore testing plan is executed.
   */
  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  /**
   * Optional.
   */
  public open fun scheduleExpressionTimezone(): String? =
      unwrap(this).getScheduleExpressionTimezone()

  /**
   * Optional.
   */
  public open fun scheduleExpressionTimezone(`value`: String) {
    unwrap(this).setScheduleExpressionTimezone(`value`)
  }

  /**
   * Defaults to 24 hours.
   */
  public open fun startWindowHours(): Number? = unwrap(this).getStartWindowHours()

  /**
   * Defaults to 24 hours.
   */
  public open fun startWindowHours(`value`: Number) {
    unwrap(this).setStartWindowHours(`value`)
  }

  /**
   * Optional tags to include.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Optional tags to include.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional tags to include.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnRestoreTestingPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    public fun recoveryPointSelection(recoveryPointSelection: IResolvable)

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    public
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty)

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b3a9ca86c017a53bbee13ce70f37f2e2547d5a9fb6145fbf9c282648c52d32")
    public
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit)

    /**
     * This is the restore testing plan name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-restoretestingplanname)
     * @param restoreTestingPlanName This is the restore testing plan name. 
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    /**
     * A CRON expression in specified timezone when a restore testing plan is executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpression)
     * @param scheduleExpression A CRON expression in specified timezone when a restore testing plan
     * is executed. 
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * Optional.
     *
     * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     * are in UTC. You can modify this to a specified timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpressiontimezone)
     * @param scheduleExpressionTimezone Optional. 
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    /**
     * Defaults to 24 hours.
     *
     * A value in hours after a restore test is scheduled before a job will be canceled if it
     * doesn't start successfully. This value is optional. If this value is included, this parameter
     * has a maximum value of 168 hours (one week).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-startwindowhours)
     * @param startWindowHours Defaults to 24 hours. 
     */
    public fun startWindowHours(startWindowHours: Number)

    /**
     * Optional tags to include.
     *
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     * @param tags Optional tags to include. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional tags to include.
     *
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     * @param tags Optional tags to include. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.Builder.create(scope, id)

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    override fun recoveryPointSelection(recoveryPointSelection: IResolvable) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(IResolvable::unwrap))
    }

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    override
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(RestoreTestingRecoveryPointSelectionProperty::unwrap))
    }

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b3a9ca86c017a53bbee13ce70f37f2e2547d5a9fb6145fbf9c282648c52d32")
    override
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit):
        Unit =
        recoveryPointSelection(RestoreTestingRecoveryPointSelectionProperty(recoveryPointSelection))

    /**
     * This is the restore testing plan name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-restoretestingplanname)
     * @param restoreTestingPlanName This is the restore testing plan name. 
     */
    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * A CRON expression in specified timezone when a restore testing plan is executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpression)
     * @param scheduleExpression A CRON expression in specified timezone when a restore testing plan
     * is executed. 
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * Optional.
     *
     * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     * are in UTC. You can modify this to a specified timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpressiontimezone)
     * @param scheduleExpressionTimezone Optional. 
     */
    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    /**
     * Defaults to 24 hours.
     *
     * A value in hours after a restore test is scheduled before a job will be canceled if it
     * doesn't start successfully. This value is optional. If this value is included, this parameter
     * has a maximum value of 168 hours (one week).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-startwindowhours)
     * @param startWindowHours Defaults to 24 hours. 
     */
    override fun startWindowHours(startWindowHours: Number) {
      cdkBuilder.startWindowHours(startWindowHours)
    }

    /**
     * Optional tags to include.
     *
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     * @param tags Optional tags to include. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional tags to include.
     *
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     * @param tags Optional tags to include. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingPlan =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRestoreTestingPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRestoreTestingPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan):
        CfnRestoreTestingPlan = CfnRestoreTestingPlan(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingPlan):
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan = wrapped.cdkObject as
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan
  }

  /**
   * Required: Algorithm;
   *
   * Required: Recovery point types; IncludeVaults(one or more). Optional: SelectionWindowDays ('30'
   * if not specified);ExcludeVaults (list of selectors), defaults to empty list if not listed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * RestoreTestingRecoveryPointSelectionProperty restoreTestingRecoveryPointSelectionProperty =
   * RestoreTestingRecoveryPointSelectionProperty.builder()
   * .algorithm("algorithm")
   * .includeVaults(List.of("includeVaults"))
   * .recoveryPointTypes(List.of("recoveryPointTypes"))
   * // the properties below are optional
   * .excludeVaults(List.of("excludeVaults"))
   * .selectionWindowDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html)
   */
  public interface RestoreTestingRecoveryPointSelectionProperty {
    /**
     * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-algorithm)
     */
    public fun algorithm(): String

    /**
     * Accepted values include specific ARNs or list of selectors.
     *
     * Defaults to empty list if not listed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-excludevaults)
     */
    public fun excludeVaults(): List<String> = unwrap(this).getExcludeVaults() ?: emptyList()

    /**
     * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     * ["arn:aws:backup:*:*:backup-vault:asdf-*", ...].
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-includevaults)
     */
    public fun includeVaults(): List<String>

    /**
     * These are the types of recovery points.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-recoverypointtypes)
     */
    public fun recoveryPointTypes(): List<String>

    /**
     * Accepted values are integers from 1 to 365.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-selectionwindowdays)
     */
    public fun selectionWindowDays(): Number? = unwrap(this).getSelectionWindowDays()

    /**
     * A builder for [RestoreTestingRecoveryPointSelectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm Acceptable values include "LATEST_WITHIN_WINDOW" or
       * "RANDOM_WITHIN_WINDOW". 
       */
      public fun algorithm(algorithm: String)

      /**
       * @param excludeVaults Accepted values include specific ARNs or list of selectors.
       * Defaults to empty list if not listed.
       */
      public fun excludeVaults(excludeVaults: List<String>)

      /**
       * @param excludeVaults Accepted values include specific ARNs or list of selectors.
       * Defaults to empty list if not listed.
       */
      public fun excludeVaults(vararg excludeVaults: String)

      /**
       * @param includeVaults Accepted values include wildcard ["*"] or by specific ARNs or ARN
       * wilcard replacement ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
       * ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]. 
       */
      public fun includeVaults(includeVaults: List<String>)

      /**
       * @param includeVaults Accepted values include wildcard ["*"] or by specific ARNs or ARN
       * wilcard replacement ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
       * ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]. 
       */
      public fun includeVaults(vararg includeVaults: String)

      /**
       * @param recoveryPointTypes These are the types of recovery points. 
       */
      public fun recoveryPointTypes(recoveryPointTypes: List<String>)

      /**
       * @param recoveryPointTypes These are the types of recovery points. 
       */
      public fun recoveryPointTypes(vararg recoveryPointTypes: String)

      /**
       * @param selectionWindowDays Accepted values are integers from 1 to 365.
       */
      public fun selectionWindowDays(selectionWindowDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.builder()

      /**
       * @param algorithm Acceptable values include "LATEST_WITHIN_WINDOW" or
       * "RANDOM_WITHIN_WINDOW". 
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param excludeVaults Accepted values include specific ARNs or list of selectors.
       * Defaults to empty list if not listed.
       */
      override fun excludeVaults(excludeVaults: List<String>) {
        cdkBuilder.excludeVaults(excludeVaults)
      }

      /**
       * @param excludeVaults Accepted values include specific ARNs or list of selectors.
       * Defaults to empty list if not listed.
       */
      override fun excludeVaults(vararg excludeVaults: String): Unit =
          excludeVaults(excludeVaults.toList())

      /**
       * @param includeVaults Accepted values include wildcard ["*"] or by specific ARNs or ARN
       * wilcard replacement ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
       * ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]. 
       */
      override fun includeVaults(includeVaults: List<String>) {
        cdkBuilder.includeVaults(includeVaults)
      }

      /**
       * @param includeVaults Accepted values include wildcard ["*"] or by specific ARNs or ARN
       * wilcard replacement ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
       * ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]. 
       */
      override fun includeVaults(vararg includeVaults: String): Unit =
          includeVaults(includeVaults.toList())

      /**
       * @param recoveryPointTypes These are the types of recovery points. 
       */
      override fun recoveryPointTypes(recoveryPointTypes: List<String>) {
        cdkBuilder.recoveryPointTypes(recoveryPointTypes)
      }

      /**
       * @param recoveryPointTypes These are the types of recovery points. 
       */
      override fun recoveryPointTypes(vararg recoveryPointTypes: String): Unit =
          recoveryPointTypes(recoveryPointTypes.toList())

      /**
       * @param selectionWindowDays Accepted values are integers from 1 to 365.
       */
      override fun selectionWindowDays(selectionWindowDays: Number) {
        cdkBuilder.selectionWindowDays(selectionWindowDays)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty,
    ) : CdkObject(cdkObject), RestoreTestingRecoveryPointSelectionProperty {
      /**
       * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-algorithm)
       */
      override fun algorithm(): String = unwrap(this).getAlgorithm()

      /**
       * Accepted values include specific ARNs or list of selectors.
       *
       * Defaults to empty list if not listed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-excludevaults)
       */
      override fun excludeVaults(): List<String> = unwrap(this).getExcludeVaults() ?: emptyList()

      /**
       * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
       * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
       * ["arn:aws:backup:*:*:backup-vault:asdf-*", ...].
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-includevaults)
       */
      override fun includeVaults(): List<String> = unwrap(this).getIncludeVaults()

      /**
       * These are the types of recovery points.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-recoverypointtypes)
       */
      override fun recoveryPointTypes(): List<String> = unwrap(this).getRecoveryPointTypes()

      /**
       * Accepted values are integers from 1 to 365.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html#cfn-backup-restoretestingplan-restoretestingrecoverypointselection-selectionwindowdays)
       */
      override fun selectionWindowDays(): Number? = unwrap(this).getSelectionWindowDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RestoreTestingRecoveryPointSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty):
          RestoreTestingRecoveryPointSelectionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RestoreTestingRecoveryPointSelectionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestoreTestingRecoveryPointSelectionProperty):
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
    }
  }
}
