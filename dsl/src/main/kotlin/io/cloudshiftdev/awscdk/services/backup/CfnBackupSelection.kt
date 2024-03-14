package io.cloudshiftdev.awscdk.services.backup

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

public open class CfnBackupSelection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Uniquely identifies a backup plan.
   */
  public open fun attrBackupPlanId(): String = unwrap(this).getAttrBackupPlanId()

  /**
   * Uniquely identifies the backup selection.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Uniquely identifies a request to assign a set of resources to a backup plan.
   */
  public open fun attrSelectionId(): String = unwrap(this).getAttrSelectionId()

  /**
   * Uniquely identifies a backup plan.
   */
  public open fun backupPlanId(): String = unwrap(this).getBackupPlanId()

  /**
   * Uniquely identifies a backup plan.
   */
  public open fun backupPlanId(`value`: String) {
    unwrap(this).setBackupPlanId(`value`)
  }

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   */
  public open fun backupSelection(): Any = unwrap(this).getBackupSelection()

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   */
  public open fun backupSelection(`value`: IResolvable) {
    unwrap(this).setBackupSelection(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   */
  public open fun backupSelection(`value`: BackupSelectionResourceTypeProperty) {
    unwrap(this).setBackupSelection(`value`.let(BackupSelectionResourceTypeProperty::unwrap))
  }

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0eba15aadf42c827b1d426dec36c8662fca75202cce8d2cb88ee45b5f4c58602")
  public open fun backupSelection(`value`: BackupSelectionResourceTypeProperty.Builder.() -> Unit):
      Unit = backupSelection(BackupSelectionResourceTypeProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnBackupSelection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Uniquely identifies a backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid)
     * @param backupPlanId Uniquely identifies a backup plan. 
     */
    public fun backupPlanId(backupPlanId: String)

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     */
    public fun backupSelection(backupSelection: IResolvable)

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     */
    public fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty)

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f95bef2eeb59814b6a3c419d1cdcd6d56ec8116ab4586441942419bbd4e9612b")
    public
        fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupSelection.Builder =
        software.amazon.awscdk.services.backup.CfnBackupSelection.Builder.create(scope, id)

    /**
     * Uniquely identifies a backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid)
     * @param backupPlanId Uniquely identifies a backup plan. 
     */
    override fun backupPlanId(backupPlanId: String) {
      cdkBuilder.backupPlanId(backupPlanId)
    }

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     */
    override fun backupSelection(backupSelection: IResolvable) {
      cdkBuilder.backupSelection(backupSelection.let(IResolvable::unwrap))
    }

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     */
    override fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty) {
      cdkBuilder.backupSelection(backupSelection.let(BackupSelectionResourceTypeProperty::unwrap))
    }

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f95bef2eeb59814b6a3c419d1cdcd6d56ec8116ab4586441942419bbd4e9612b")
    override
        fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty.Builder.() -> Unit):
        Unit = backupSelection(BackupSelectionResourceTypeProperty(backupSelection))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupSelection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnBackupSelection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBackupSelection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBackupSelection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection):
        CfnBackupSelection = CfnBackupSelection(cdkObject)

    internal fun unwrap(wrapped: CfnBackupSelection):
        software.amazon.awscdk.services.backup.CfnBackupSelection = wrapped.cdkObject
  }

  public interface ConditionParameterProperty {
    /**
     * The key in a key-value pair.
     *
     * For example, in the tag `Department: Accounting` , `Department` is the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionparameter.html#cfn-backup-backupselection-conditionparameter-conditionkey)
     */
    public fun conditionKey(): String? = unwrap(this).getConditionKey()

    /**
     * The value in a key-value pair.
     *
     * For example, in the tag `Department: Accounting` , `Accounting` is the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionparameter.html#cfn-backup-backupselection-conditionparameter-conditionvalue)
     */
    public fun conditionValue(): String? = unwrap(this).getConditionValue()

    /**
     * A builder for [ConditionParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionKey The key in a key-value pair.
       * For example, in the tag `Department: Accounting` , `Department` is the key.
       */
      public fun conditionKey(conditionKey: String)

      /**
       * @param conditionValue The value in a key-value pair.
       * For example, in the tag `Department: Accounting` , `Accounting` is the value.
       */
      public fun conditionValue(conditionValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty.builder()

      /**
       * @param conditionKey The key in a key-value pair.
       * For example, in the tag `Department: Accounting` , `Department` is the key.
       */
      override fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
      }

      /**
       * @param conditionValue The value in a key-value pair.
       * For example, in the tag `Department: Accounting` , `Accounting` is the value.
       */
      override fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty,
    ) : CdkObject(cdkObject), ConditionParameterProperty {
      /**
       * The key in a key-value pair.
       *
       * For example, in the tag `Department: Accounting` , `Department` is the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionparameter.html#cfn-backup-backupselection-conditionparameter-conditionkey)
       */
      override fun conditionKey(): String? = unwrap(this).getConditionKey()

      /**
       * The value in a key-value pair.
       *
       * For example, in the tag `Department: Accounting` , `Accounting` is the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionparameter.html#cfn-backup-backupselection-conditionparameter-conditionvalue)
       */
      override fun conditionValue(): String? = unwrap(this).getConditionValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty):
          ConditionParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionParameterProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty
    }
  }

  public interface BackupSelectionResourceTypeProperty {
    /**
     * A list of conditions that you define to assign resources to your backup plans using tags.
     *
     * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
     * "ConditionValue": "true" },` . Condition operators are case sensitive.
     *
     * `Conditions` differs from `ListOfTags` as follows:
     *
     * * When you specify more than one condition, you only assign the resources that match ALL
     * conditions (using AND logic).
     * * `Conditions` supports `StringEquals` , `StringLike` , `StringNotEquals` , and
     * `StringNotLike` . `ListOfTags` only supports `StringEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-conditions)
     */
    public fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * The ARN of the IAM role that AWS Backup uses to authenticate when backing up the target
     * resource;
     *
     * for example, `arn:aws:iam::123456789012:role/S3Access` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-iamrolearn)
     */
    public fun iamRoleArn(): String

    /**
     * A list of conditions that you define to assign resources to your backup plans using tags.
     *
     * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
     * "ConditionValue": "true" },` . Condition operators are case sensitive.
     *
     * `ListOfTags` differs from `Conditions` as follows:
     *
     * * When you specify more than one condition, you assign all resources that match AT LEAST ONE
     * condition (using OR logic).
     * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
     * `StringLike` , `StringNotEquals` , and `StringNotLike` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-listoftags)
     */
    public fun listOfTags(): Any? = unwrap(this).getListOfTags()

    /**
     * A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
     *
     * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
     *
     * If you need to exclude many resources from a backup plan, consider a different resource
     * selection strategy, such as assigning only one or a few resource types or refining your resource
     * selection using tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-notresources)
     */
    public fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

    /**
     * An array of strings that contain Amazon Resource Names (ARNs) of resources to assign to a
     * backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-resources)
     */
    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * The display name of a resource selection document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-selectionname)
     */
    public fun selectionName(): String

    /**
     * A builder for [BackupSelectionResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `Conditions` differs from `ListOfTags` as follows:
       *
       * * When you specify more than one condition, you only assign the resources that match ALL
       * conditions (using AND logic).
       * * `Conditions` supports `StringEquals` , `StringLike` , `StringNotEquals` , and
       * `StringNotLike` . `ListOfTags` only supports `StringEquals` .
       */
      public fun conditions(conditions: Any)

      /**
       * @param iamRoleArn The ARN of the IAM role that AWS Backup uses to authenticate when backing
       * up the target resource;. 
       * for example, `arn:aws:iam::123456789012:role/S3Access` .
       */
      public fun iamRoleArn(iamRoleArn: String)

      /**
       * @param listOfTags A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       */
      public fun listOfTags(listOfTags: IResolvable)

      /**
       * @param listOfTags A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       */
      public fun listOfTags(listOfTags: List<Any>)

      /**
       * @param listOfTags A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       */
      public fun listOfTags(vararg listOfTags: Any)

      /**
       * @param notResources A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
       * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
       *
       * If you need to exclude many resources from a backup plan, consider a different resource
       * selection strategy, such as assigning only one or a few resource types or refining your
       * resource selection using tags.
       */
      public fun notResources(notResources: List<String>)

      /**
       * @param notResources A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
       * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
       *
       * If you need to exclude many resources from a backup plan, consider a different resource
       * selection strategy, such as assigning only one or a few resource types or refining your
       * resource selection using tags.
       */
      public fun notResources(vararg notResources: String)

      /**
       * @param resources An array of strings that contain Amazon Resource Names (ARNs) of resources
       * to assign to a backup plan.
       */
      public fun resources(resources: List<String>)

      /**
       * @param resources An array of strings that contain Amazon Resource Names (ARNs) of resources
       * to assign to a backup plan.
       */
      public fun resources(vararg resources: String)

      /**
       * @param selectionName The display name of a resource selection document. 
       */
      public fun selectionName(selectionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty.builder()

      /**
       * @param conditions A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `Conditions` differs from `ListOfTags` as follows:
       *
       * * When you specify more than one condition, you only assign the resources that match ALL
       * conditions (using AND logic).
       * * `Conditions` supports `StringEquals` , `StringLike` , `StringNotEquals` , and
       * `StringNotLike` . `ListOfTags` only supports `StringEquals` .
       */
      override fun conditions(conditions: Any) {
        cdkBuilder.conditions(conditions)
      }

      /**
       * @param iamRoleArn The ARN of the IAM role that AWS Backup uses to authenticate when backing
       * up the target resource;. 
       * for example, `arn:aws:iam::123456789012:role/S3Access` .
       */
      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      /**
       * @param listOfTags A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       */
      override fun listOfTags(listOfTags: IResolvable) {
        cdkBuilder.listOfTags(listOfTags.let(IResolvable::unwrap))
      }

      /**
       * @param listOfTags A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       */
      override fun listOfTags(listOfTags: List<Any>) {
        cdkBuilder.listOfTags(listOfTags)
      }

      /**
       * @param listOfTags A list of conditions that you define to assign resources to your backup
       * plans using tags.
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       */
      override fun listOfTags(vararg listOfTags: Any): Unit = listOfTags(listOfTags.toList())

      /**
       * @param notResources A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
       * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
       *
       * If you need to exclude many resources from a backup plan, consider a different resource
       * selection strategy, such as assigning only one or a few resource types or refining your
       * resource selection using tags.
       */
      override fun notResources(notResources: List<String>) {
        cdkBuilder.notResources(notResources)
      }

      /**
       * @param notResources A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
       * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
       *
       * If you need to exclude many resources from a backup plan, consider a different resource
       * selection strategy, such as assigning only one or a few resource types or refining your
       * resource selection using tags.
       */
      override fun notResources(vararg notResources: String): Unit =
          notResources(notResources.toList())

      /**
       * @param resources An array of strings that contain Amazon Resource Names (ARNs) of resources
       * to assign to a backup plan.
       */
      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      /**
       * @param resources An array of strings that contain Amazon Resource Names (ARNs) of resources
       * to assign to a backup plan.
       */
      override fun resources(vararg resources: String): Unit = resources(resources.toList())

      /**
       * @param selectionName The display name of a resource selection document. 
       */
      override fun selectionName(selectionName: String) {
        cdkBuilder.selectionName(selectionName)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty,
    ) : CdkObject(cdkObject), BackupSelectionResourceTypeProperty {
      /**
       * A list of conditions that you define to assign resources to your backup plans using tags.
       *
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `Conditions` differs from `ListOfTags` as follows:
       *
       * * When you specify more than one condition, you only assign the resources that match ALL
       * conditions (using AND logic).
       * * `Conditions` supports `StringEquals` , `StringLike` , `StringNotEquals` , and
       * `StringNotLike` . `ListOfTags` only supports `StringEquals` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-conditions)
       */
      override fun conditions(): Any? = unwrap(this).getConditions()

      /**
       * The ARN of the IAM role that AWS Backup uses to authenticate when backing up the target
       * resource;
       *
       * for example, `arn:aws:iam::123456789012:role/S3Access` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-iamrolearn)
       */
      override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

      /**
       * A list of conditions that you define to assign resources to your backup plans using tags.
       *
       * For example, `"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo",
       * "ConditionValue": "true" },` . Condition operators are case sensitive.
       *
       * `ListOfTags` differs from `Conditions` as follows:
       *
       * * When you specify more than one condition, you assign all resources that match AT LEAST
       * ONE condition (using OR logic).
       * * `ListOfTags` only supports `StringEquals` . `Conditions` supports `StringEquals` ,
       * `StringLike` , `StringNotEquals` , and `StringNotLike` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-listoftags)
       */
      override fun listOfTags(): Any? = unwrap(this).getListOfTags()

      /**
       * A list of Amazon Resource Names (ARNs) to exclude from a backup plan.
       *
       * The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards.
       *
       * If you need to exclude many resources from a backup plan, consider a different resource
       * selection strategy, such as assigning only one or a few resource types or refining your
       * resource selection using tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-notresources)
       */
      override fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

      /**
       * An array of strings that contain Amazon Resource Names (ARNs) of resources to assign to a
       * backup plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-resources)
       */
      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

      /**
       * The display name of a resource selection document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html#cfn-backup-backupselection-backupselectionresourcetype-selectionname)
       */
      override fun selectionName(): String = unwrap(this).getSelectionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BackupSelectionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty):
          BackupSelectionResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupSelectionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
    }
  }

  public interface ConditionResourceTypeProperty {
    /**
     * The key in a key-value pair.
     *
     * For example, in `"Department": "accounting"` , `"Department"` is the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionkey)
     */
    public fun conditionKey(): String

    /**
     * An operation, such as `STRINGEQUALS` , that is applied to a key-value pair used to filter
     * resources in a selection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditiontype)
     */
    public fun conditionType(): String

    /**
     * The value in a key-value pair.
     *
     * For example, in `"Department": "accounting"` , `"accounting"` is the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionvalue)
     */
    public fun conditionValue(): String

    /**
     * A builder for [ConditionResourceTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionKey The key in a key-value pair. 
       * For example, in `"Department": "accounting"` , `"Department"` is the key.
       */
      public fun conditionKey(conditionKey: String)

      /**
       * @param conditionType An operation, such as `STRINGEQUALS` , that is applied to a key-value
       * pair used to filter resources in a selection. 
       */
      public fun conditionType(conditionType: String)

      /**
       * @param conditionValue The value in a key-value pair. 
       * For example, in `"Department": "accounting"` , `"accounting"` is the value.
       */
      public fun conditionValue(conditionValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty.builder()

      /**
       * @param conditionKey The key in a key-value pair. 
       * For example, in `"Department": "accounting"` , `"Department"` is the key.
       */
      override fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
      }

      /**
       * @param conditionType An operation, such as `STRINGEQUALS` , that is applied to a key-value
       * pair used to filter resources in a selection. 
       */
      override fun conditionType(conditionType: String) {
        cdkBuilder.conditionType(conditionType)
      }

      /**
       * @param conditionValue The value in a key-value pair. 
       * For example, in `"Department": "accounting"` , `"accounting"` is the value.
       */
      override fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty,
    ) : CdkObject(cdkObject), ConditionResourceTypeProperty {
      /**
       * The key in a key-value pair.
       *
       * For example, in `"Department": "accounting"` , `"Department"` is the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionkey)
       */
      override fun conditionKey(): String = unwrap(this).getConditionKey()

      /**
       * An operation, such as `STRINGEQUALS` , that is applied to a key-value pair used to filter
       * resources in a selection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditiontype)
       */
      override fun conditionType(): String = unwrap(this).getConditionType()

      /**
       * The value in a key-value pair.
       *
       * For example, in `"Department": "accounting"` , `"accounting"` is the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html#cfn-backup-backupselection-conditionresourcetype-conditionvalue)
       */
      override fun conditionValue(): String = unwrap(this).getConditionValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty):
          ConditionResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty
    }
  }

  public interface ConditionsProperty {
    /**
     * Filters the values of your tagged resources for only those resources that you tagged with the
     * same value.
     *
     * Also called "exact matching."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringequals)
     */
    public fun stringEquals(): Any? = unwrap(this).getStringEquals()

    /**
     * Filters the values of your tagged resources for matching tag values with the use of a
     * wildcard character (*) anywhere in the string.
     *
     * For example, "prod*" or "*rod*" matches the tag value "production".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringlike)
     */
    public fun stringLike(): Any? = unwrap(this).getStringLike()

    /**
     * Filters the values of your tagged resources for only those resources that you tagged that do
     * not have the same value.
     *
     * Also called "negated matching."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringnotequals)
     */
    public fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()

    /**
     * Filters the values of your tagged resources for non-matching tag values with the use of a
     * wildcard character (*) anywhere in the string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringnotlike)
     */
    public fun stringNotLike(): Any? = unwrap(this).getStringNotLike()

    /**
     * A builder for [ConditionsProperty]
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
       * @param stringLike Filters the values of your tagged resources for matching tag values with
       * the use of a wildcard character (*) anywhere in the string.
       * For example, "prod*" or "*rod*" matches the tag value "production".
       */
      public fun stringLike(stringLike: IResolvable)

      /**
       * @param stringLike Filters the values of your tagged resources for matching tag values with
       * the use of a wildcard character (*) anywhere in the string.
       * For example, "prod*" or "*rod*" matches the tag value "production".
       */
      public fun stringLike(stringLike: List<Any>)

      /**
       * @param stringLike Filters the values of your tagged resources for matching tag values with
       * the use of a wildcard character (*) anywhere in the string.
       * For example, "prod*" or "*rod*" matches the tag value "production".
       */
      public fun stringLike(vararg stringLike: Any)

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

      /**
       * @param stringNotLike Filters the values of your tagged resources for non-matching tag
       * values with the use of a wildcard character (*) anywhere in the string.
       */
      public fun stringNotLike(stringNotLike: IResolvable)

      /**
       * @param stringNotLike Filters the values of your tagged resources for non-matching tag
       * values with the use of a wildcard character (*) anywhere in the string.
       */
      public fun stringNotLike(stringNotLike: List<Any>)

      /**
       * @param stringNotLike Filters the values of your tagged resources for non-matching tag
       * values with the use of a wildcard character (*) anywhere in the string.
       */
      public fun stringNotLike(vararg stringNotLike: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty.Builder =
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty.builder()

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      override fun stringEquals(stringEquals: IResolvable) {
        cdkBuilder.stringEquals(stringEquals.let(IResolvable::unwrap))
      }

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      override fun stringEquals(stringEquals: List<Any>) {
        cdkBuilder.stringEquals(stringEquals)
      }

      /**
       * @param stringEquals Filters the values of your tagged resources for only those resources
       * that you tagged with the same value.
       * Also called "exact matching."
       */
      override fun stringEquals(vararg stringEquals: Any): Unit =
          stringEquals(stringEquals.toList())

      /**
       * @param stringLike Filters the values of your tagged resources for matching tag values with
       * the use of a wildcard character (*) anywhere in the string.
       * For example, "prod*" or "*rod*" matches the tag value "production".
       */
      override fun stringLike(stringLike: IResolvable) {
        cdkBuilder.stringLike(stringLike.let(IResolvable::unwrap))
      }

      /**
       * @param stringLike Filters the values of your tagged resources for matching tag values with
       * the use of a wildcard character (*) anywhere in the string.
       * For example, "prod*" or "*rod*" matches the tag value "production".
       */
      override fun stringLike(stringLike: List<Any>) {
        cdkBuilder.stringLike(stringLike)
      }

      /**
       * @param stringLike Filters the values of your tagged resources for matching tag values with
       * the use of a wildcard character (*) anywhere in the string.
       * For example, "prod*" or "*rod*" matches the tag value "production".
       */
      override fun stringLike(vararg stringLike: Any): Unit = stringLike(stringLike.toList())

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      override fun stringNotEquals(stringNotEquals: IResolvable) {
        cdkBuilder.stringNotEquals(stringNotEquals.let(IResolvable::unwrap))
      }

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      override fun stringNotEquals(stringNotEquals: List<Any>) {
        cdkBuilder.stringNotEquals(stringNotEquals)
      }

      /**
       * @param stringNotEquals Filters the values of your tagged resources for only those resources
       * that you tagged that do not have the same value.
       * Also called "negated matching."
       */
      override fun stringNotEquals(vararg stringNotEquals: Any): Unit =
          stringNotEquals(stringNotEquals.toList())

      /**
       * @param stringNotLike Filters the values of your tagged resources for non-matching tag
       * values with the use of a wildcard character (*) anywhere in the string.
       */
      override fun stringNotLike(stringNotLike: IResolvable) {
        cdkBuilder.stringNotLike(stringNotLike.let(IResolvable::unwrap))
      }

      /**
       * @param stringNotLike Filters the values of your tagged resources for non-matching tag
       * values with the use of a wildcard character (*) anywhere in the string.
       */
      override fun stringNotLike(stringNotLike: List<Any>) {
        cdkBuilder.stringNotLike(stringNotLike)
      }

      /**
       * @param stringNotLike Filters the values of your tagged resources for non-matching tag
       * values with the use of a wildcard character (*) anywhere in the string.
       */
      override fun stringNotLike(vararg stringNotLike: Any): Unit =
          stringNotLike(stringNotLike.toList())

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty,
    ) : CdkObject(cdkObject), ConditionsProperty {
      /**
       * Filters the values of your tagged resources for only those resources that you tagged with
       * the same value.
       *
       * Also called "exact matching."
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringequals)
       */
      override fun stringEquals(): Any? = unwrap(this).getStringEquals()

      /**
       * Filters the values of your tagged resources for matching tag values with the use of a
       * wildcard character (*) anywhere in the string.
       *
       * For example, "prod*" or "*rod*" matches the tag value "production".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringlike)
       */
      override fun stringLike(): Any? = unwrap(this).getStringLike()

      /**
       * Filters the values of your tagged resources for only those resources that you tagged that
       * do not have the same value.
       *
       * Also called "negated matching."
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringnotequals)
       */
      override fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()

      /**
       * Filters the values of your tagged resources for non-matching tag values with the use of a
       * wildcard character (*) anywhere in the string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html#cfn-backup-backupselection-conditions-stringnotlike)
       */
      override fun stringNotLike(): Any? = unwrap(this).getStringNotLike()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty):
          ConditionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionsProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty
    }
  }
}
