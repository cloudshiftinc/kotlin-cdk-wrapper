@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This request can be sent after CreateRestoreTestingPlan request returns successfully.
 *
 * This is the second part of creating a resource testing plan, and it must be completed
 * sequentially.
 *
 * This consists of `RestoreTestingSelectionName` , `ProtectedResourceType` , and one of the
 * following:
 *
 * * `ProtectedResourceArns`
 * * `ProtectedResourceConditions`
 *
 * Each protected resource type can have one single value.
 *
 * A restore testing selection can include a wildcard value ("*") for `ProtectedResourceArns` along
 * with `ProtectedResourceConditions` . Alternatively, you can include up to 30 specific protected
 * resource ARNs in `ProtectedResourceArns` .
 *
 * Cannot select by both protected resource types AND specific ARNs. Request will fail if both are
 * included.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * CfnRestoreTestingSelection cfnRestoreTestingSelection =
 * CfnRestoreTestingSelection.Builder.create(this, "MyCfnRestoreTestingSelection")
 * .iamRoleArn("iamRoleArn")
 * .protectedResourceType("protectedResourceType")
 * .restoreTestingPlanName("restoreTestingPlanName")
 * .restoreTestingSelectionName("restoreTestingSelectionName")
 * // the properties below are optional
 * .protectedResourceArns(List.of("protectedResourceArns"))
 * .protectedResourceConditions(ProtectedResourceConditionsProperty.builder()
 * .stringEquals(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .stringNotEquals(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .restoreMetadataOverrides(Map.of(
 * "restoreMetadataOverridesKey", "restoreMetadataOverrides"))
 * .validationWindowHours(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html)
 */
public open class CfnRestoreTestingSelection(
  cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRestoreTestingSelectionProps,
  ) :
      this(software.amazon.awscdk.services.backup.CfnRestoreTestingSelection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRestoreTestingSelectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRestoreTestingSelectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRestoreTestingSelectionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
   * resource;
   */
  public open fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
   * resource;
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]`
   * or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
   */
  public open fun protectedResourceArns(): List<String> = unwrap(this).getProtectedResourceArns() ?:
      emptyList()

  /**
   * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]`
   * or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
   */
  public open fun protectedResourceArns(`value`: List<String>) {
    unwrap(this).setProtectedResourceArns(`value`)
  }

  /**
   * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]`
   * or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
   */
  public open fun protectedResourceArns(vararg `value`: String): Unit =
      protectedResourceArns(`value`.toList())

  /**
   * In a resource testing selection, this parameter filters by specific conditions such as
   * `StringEquals` or `StringNotEquals` .
   */
  public open fun protectedResourceConditions(): Any? =
      unwrap(this).getProtectedResourceConditions()

  /**
   * In a resource testing selection, this parameter filters by specific conditions such as
   * `StringEquals` or `StringNotEquals` .
   */
  public open fun protectedResourceConditions(`value`: IResolvable) {
    unwrap(this).setProtectedResourceConditions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * In a resource testing selection, this parameter filters by specific conditions such as
   * `StringEquals` or `StringNotEquals` .
   */
  public open fun protectedResourceConditions(`value`: ProtectedResourceConditionsProperty) {
    unwrap(this).setProtectedResourceConditions(`value`.let(ProtectedResourceConditionsProperty.Companion::unwrap))
  }

  /**
   * In a resource testing selection, this parameter filters by specific conditions such as
   * `StringEquals` or `StringNotEquals` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f48a98c95edfb520ba1fa79815921a76584b3a5922039646d957b98efa6b9dc")
  public open
      fun protectedResourceConditions(`value`: ProtectedResourceConditionsProperty.Builder.() -> Unit):
      Unit = protectedResourceConditions(ProtectedResourceConditionsProperty(`value`))

  /**
   * The type of AWS resource included in a resource testing selection;
   */
  public open fun protectedResourceType(): String = unwrap(this).getProtectedResourceType()

  /**
   * The type of AWS resource included in a resource testing selection;
   */
  public open fun protectedResourceType(`value`: String) {
    unwrap(this).setProtectedResourceType(`value`)
  }

  /**
   * You can override certain restore metadata keys by including the parameter
   * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
   */
  public open fun restoreMetadataOverrides(): Any? = unwrap(this).getRestoreMetadataOverrides()

  /**
   * You can override certain restore metadata keys by including the parameter
   * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
   */
  public open fun restoreMetadataOverrides(`value`: IResolvable) {
    unwrap(this).setRestoreMetadataOverrides(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * You can override certain restore metadata keys by including the parameter
   * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
   */
  public open fun restoreMetadataOverrides(`value`: Map<String, String>) {
    unwrap(this).setRestoreMetadataOverrides(`value`)
  }

  /**
   * Unique string that is the name of the restore testing plan.
   */
  public open fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

  /**
   * Unique string that is the name of the restore testing plan.
   */
  public open fun restoreTestingPlanName(`value`: String) {
    unwrap(this).setRestoreTestingPlanName(`value`)
  }

  /**
   * The unique name of the restore testing selection that belongs to the related restore testing
   * plan.
   */
  public open fun restoreTestingSelectionName(): String =
      unwrap(this).getRestoreTestingSelectionName()

  /**
   * The unique name of the restore testing selection that belongs to the related restore testing
   * plan.
   */
  public open fun restoreTestingSelectionName(`value`: String) {
    unwrap(this).setRestoreTestingSelectionName(`value`)
  }

  /**
   * This is amount of hours (1 to 168) available to run a validation script on the data.
   */
  public open fun validationWindowHours(): Number? = unwrap(this).getValidationWindowHours()

  /**
   * This is amount of hours (1 to 168) available to run a validation script on the data.
   */
  public open fun validationWindowHours(`value`: Number) {
    unwrap(this).setValidationWindowHours(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnRestoreTestingSelection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
     * resource;
     *
     * for example: `arn:aws:iam::123456789012:role/S3Access` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-iamrolearn)
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to
     * create the target resource;. 
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...",
     * "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both. 
     */
    public fun protectedResourceArns(protectedResourceArns: List<String>)

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...",
     * "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both. 
     */
    public fun protectedResourceArns(vararg protectedResourceArns: String)

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` . 
     */
    public fun protectedResourceConditions(protectedResourceConditions: IResolvable)

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` . 
     */
    public
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty)

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6c9d9462c60730707d90823a6dea40bd58f689723ba4ec35c88dca6a2ad2fb")
    public
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty.Builder.() -> Unit)

    /**
     * The type of AWS resource included in a resource testing selection;
     *
     * for example, an Amazon EBS volume or an Amazon RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcetype)
     * @param protectedResourceType The type of AWS resource included in a resource testing
     * selection;. 
     */
    public fun protectedResourceType(protectedResourceType: String)

    /**
     * You can override certain restore metadata keys by including the parameter
     * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     *
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoremetadataoverrides)
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` . 
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable)

    /**
     * You can override certain restore metadata keys by including the parameter
     * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     *
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoremetadataoverrides)
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` . 
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>)

    /**
     * Unique string that is the name of the restore testing plan.
     *
     * The name cannot be changed after creation. The name must consist of only alphanumeric
     * characters and underscores. Maximum length is 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingplanname)
     * @param restoreTestingPlanName Unique string that is the name of the restore testing plan. 
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    /**
     * The unique name of the restore testing selection that belongs to the related restore testing
     * plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingselectionname)
     * @param restoreTestingSelectionName The unique name of the restore testing selection that
     * belongs to the related restore testing plan. 
     */
    public fun restoreTestingSelectionName(restoreTestingSelectionName: String)

    /**
     * This is amount of hours (1 to 168) available to run a validation script on the data.
     *
     * The data will be deleted upon the completion of the validation script or the end of the
     * specified retention period, whichever comes first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-validationwindowhours)
     * @param validationWindowHours This is amount of hours (1 to 168) available to run a validation
     * script on the data. 
     */
    public fun validationWindowHours(validationWindowHours: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
     * resource;
     *
     * for example: `arn:aws:iam::123456789012:role/S3Access` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-iamrolearn)
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to
     * create the target resource;. 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...",
     * "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both. 
     */
    override fun protectedResourceArns(protectedResourceArns: List<String>) {
      cdkBuilder.protectedResourceArns(protectedResourceArns)
    }

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...",
     * "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both. 
     */
    override fun protectedResourceArns(vararg protectedResourceArns: String): Unit =
        protectedResourceArns(protectedResourceArns.toList())

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` . 
     */
    override fun protectedResourceConditions(protectedResourceConditions: IResolvable) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` . 
     */
    override
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(ProtectedResourceConditionsProperty.Companion::unwrap))
    }

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6c9d9462c60730707d90823a6dea40bd58f689723ba4ec35c88dca6a2ad2fb")
    override
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty.Builder.() -> Unit):
        Unit =
        protectedResourceConditions(ProtectedResourceConditionsProperty(protectedResourceConditions))

    /**
     * The type of AWS resource included in a resource testing selection;
     *
     * for example, an Amazon EBS volume or an Amazon RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcetype)
     * @param protectedResourceType The type of AWS resource included in a resource testing
     * selection;. 
     */
    override fun protectedResourceType(protectedResourceType: String) {
      cdkBuilder.protectedResourceType(protectedResourceType)
    }

    /**
     * You can override certain restore metadata keys by including the parameter
     * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     *
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoremetadataoverrides)
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` . 
     */
    override fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable) {
      cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides.let(IResolvable.Companion::unwrap))
    }

    /**
     * You can override certain restore metadata keys by including the parameter
     * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     *
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoremetadataoverrides)
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` . 
     */
    override fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>) {
      cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    /**
     * Unique string that is the name of the restore testing plan.
     *
     * The name cannot be changed after creation. The name must consist of only alphanumeric
     * characters and underscores. Maximum length is 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingplanname)
     * @param restoreTestingPlanName Unique string that is the name of the restore testing plan. 
     */
    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * The unique name of the restore testing selection that belongs to the related restore testing
     * plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingselectionname)
     * @param restoreTestingSelectionName The unique name of the restore testing selection that
     * belongs to the related restore testing plan. 
     */
    override fun restoreTestingSelectionName(restoreTestingSelectionName: String) {
      cdkBuilder.restoreTestingSelectionName(restoreTestingSelectionName)
    }

    /**
     * This is amount of hours (1 to 168) available to run a validation script on the data.
     *
     * The data will be deleted upon the completion of the validation script or the end of the
     * specified retention period, whichever comes first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-validationwindowhours)
     * @param validationWindowHours This is amount of hours (1 to 168) available to run a validation
     * script on the data. 
     */
    override fun validationWindowHours(validationWindowHours: Number) {
      cdkBuilder.validationWindowHours(validationWindowHours)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingSelection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRestoreTestingSelection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRestoreTestingSelection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection):
        CfnRestoreTestingSelection = CfnRestoreTestingSelection(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingSelection):
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection = wrapped.cdkObject as
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection
  }

  /**
   * Pair of two related strings.
   *
   * Allowed characters are letters, white space, and numbers that can be represented in UTF-8 and
   * the following characters: `+ - = . _ : /`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-keyvalue.html)
   */
  public interface KeyValueProperty {
    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-keyvalue.html#cfn-backup-restoretestingselection-keyvalue-key)
     */
    public fun key(): String

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-keyvalue.html#cfn-backup-restoretestingselection-keyvalue-value)
     */
    public fun `value`(): String

    /**
     * A builder for [KeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key. 
       */
      public fun key(key: String)

      /**
       * @param value The tag value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty.builder()

      /**
       * @param key The tag key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The tag value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty,
    ) : CdkObject(cdkObject),
        KeyValueProperty {
      /**
       * The tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-keyvalue.html#cfn-backup-restoretestingselection-keyvalue-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-keyvalue.html#cfn-backup-restoretestingselection-keyvalue-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty):
          KeyValueProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty
    }
  }

  /**
   * The conditions that you define for resources in your restore testing plan using tags.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * ProtectedResourceConditionsProperty protectedResourceConditionsProperty =
   * ProtectedResourceConditionsProperty.builder()
   * .stringEquals(List.of(KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .stringNotEquals(List.of(KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-protectedresourceconditions.html)
   */
  public interface ProtectedResourceConditionsProperty {
    /**
     * Filters the values of your tagged resources for only those resources that you tagged with the
     * same value.
     *
     * Also called "exact matching."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-protectedresourceconditions.html#cfn-backup-restoretestingselection-protectedresourceconditions-stringequals)
     */
    public fun stringEquals(): Any? = unwrap(this).getStringEquals()

    /**
     * Filters the values of your tagged resources for only those resources that you tagged that do
     * not have the same value.
     *
     * Also called "negated matching."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-protectedresourceconditions.html#cfn-backup-restoretestingselection-protectedresourceconditions-stringnotequals)
     */
    public fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()

    /**
     * A builder for [ProtectedResourceConditionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      public fun stringEquals(stringEquals: IResolvable)

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      public fun stringEquals(stringEquals: List<Any>)

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      public fun stringEquals(vararg stringEquals: Any)

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      public fun stringNotEquals(stringNotEquals: IResolvable)

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      public fun stringNotEquals(stringNotEquals: List<Any>)

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      public fun stringNotEquals(vararg stringNotEquals: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.builder()

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      override fun stringEquals(stringEquals: IResolvable) {
        cdkBuilder.stringEquals(stringEquals.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      override fun stringEquals(stringEquals: List<Any>) {
        cdkBuilder.stringEquals(stringEquals.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      override fun stringEquals(vararg stringEquals: Any): Unit =
          stringEquals(stringEquals.toList())

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      override fun stringNotEquals(stringNotEquals: IResolvable) {
        cdkBuilder.stringNotEquals(stringNotEquals.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      override fun stringNotEquals(stringNotEquals: List<Any>) {
        cdkBuilder.stringNotEquals(stringNotEquals.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      override fun stringNotEquals(vararg stringNotEquals: Any): Unit =
          stringNotEquals(stringNotEquals.toList())

      public fun build():
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty,
    ) : CdkObject(cdkObject),
        ProtectedResourceConditionsProperty {
      /**
       * Filters the values of your tagged resources for only those resources that you tagged with
       * the same value.
       *
       * Also called "exact matching."
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-protectedresourceconditions.html#cfn-backup-restoretestingselection-protectedresourceconditions-stringequals)
       */
      override fun stringEquals(): Any? = unwrap(this).getStringEquals()

      /**
       * Filters the values of your tagged resources for only those resources that you tagged that
       * do not have the same value.
       *
       * Also called "negated matching."
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-protectedresourceconditions.html#cfn-backup-restoretestingselection-protectedresourceconditions-stringnotequals)
       */
      override fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProtectedResourceConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty):
          ProtectedResourceConditionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProtectedResourceConditionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtectedResourceConditionsProperty):
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
    }
  }
}
