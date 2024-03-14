package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnRestoreTestingSelectionProps {
  /**
   * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
   * resource;
   *
   * for example: `arn:aws:iam::123456789012:role/S3Access` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-iamrolearn)
   */
  public fun iamRoleArn(): String

  /**
   * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]`
   * or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
   */
  public fun protectedResourceArns(): List<String> = unwrap(this).getProtectedResourceArns() ?:
      emptyList()

  /**
   * In a resource testing selection, this parameter filters by specific conditions such as
   * `StringEquals` or `StringNotEquals` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
   */
  public fun protectedResourceConditions(): Any? = unwrap(this).getProtectedResourceConditions()

  /**
   * The type of AWS resource included in a resource testing selection;
   *
   * for example, an Amazon EBS volume or an Amazon RDS database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcetype)
   */
  public fun protectedResourceType(): String

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
   */
  public fun restoreMetadataOverrides(): Any? = unwrap(this).getRestoreMetadataOverrides()

  /**
   * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingplanname)
   */
  public fun restoreTestingPlanName(): String

  /**
   * This is the unique name of the restore testing selection that belongs to the related restore
   * testing plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingselectionname)
   */
  public fun restoreTestingSelectionName(): String

  /**
   * This is amount of hours (1 to 168) available to run a validation script on the data.
   *
   * The data will be deleted upon the completion of the validation script or the end of the
   * specified retention period, whichever comes first.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-validationwindowhours)
   */
  public fun validationWindowHours(): Number? = unwrap(this).getValidationWindowHours()

  /**
   * A builder for [CfnRestoreTestingSelectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to
     * create the target resource;. 
     * for example: `arn:aws:iam::123456789012:role/S3Access` .
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both.
     */
    public fun protectedResourceArns(protectedResourceArns: List<String>)

    /**
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both.
     */
    public fun protectedResourceArns(vararg protectedResourceArns: String)

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    public fun protectedResourceConditions(protectedResourceConditions: IResolvable)

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    public
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty)

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d59a266765ade5e8b02e6f4780c0f17cd749e650759532529ebc0f1bbe0dea6c")
    public
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder.() -> Unit)

    /**
     * @param protectedResourceType The type of AWS resource included in a resource testing
     * selection;. 
     * for example, an Amazon EBS volume or an Amazon RDS database.
     */
    public fun protectedResourceType(protectedResourceType: String)

    /**
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable)

    /**
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>)

    /**
     * @param restoreTestingPlanName The RestoreTestingPlanName is a unique string that is the name
     * of the restore testing plan. 
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    /**
     * @param restoreTestingSelectionName This is the unique name of the restore testing selection
     * that belongs to the related restore testing plan. 
     */
    public fun restoreTestingSelectionName(restoreTestingSelectionName: String)

    /**
     * @param validationWindowHours This is amount of hours (1 to 168) available to run a validation
     * script on the data.
     * The data will be deleted upon the completion of the validation script or the end of the
     * specified retention period, whichever comes first.
     */
    public fun validationWindowHours(validationWindowHours: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps.builder()

    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to
     * create the target resource;. 
     * for example: `arn:aws:iam::123456789012:role/S3Access` .
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both.
     */
    override fun protectedResourceArns(protectedResourceArns: List<String>) {
      cdkBuilder.protectedResourceArns(protectedResourceArns)
    }

    /**
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` ,
     * but not both.
     */
    override fun protectedResourceArns(vararg protectedResourceArns: String): Unit =
        protectedResourceArns(protectedResourceArns.toList())

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    override fun protectedResourceConditions(protectedResourceConditions: IResolvable) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(IResolvable::unwrap))
    }

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    override
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(CfnRestoreTestingSelection.ProtectedResourceConditionsProperty::unwrap))
    }

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     * specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d59a266765ade5e8b02e6f4780c0f17cd749e650759532529ebc0f1bbe0dea6c")
    override
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder.() -> Unit):
        Unit =
        protectedResourceConditions(CfnRestoreTestingSelection.ProtectedResourceConditionsProperty(protectedResourceConditions))

    /**
     * @param protectedResourceType The type of AWS resource included in a resource testing
     * selection;. 
     * for example, an Amazon EBS volume or an Amazon RDS database.
     */
    override fun protectedResourceType(protectedResourceType: String) {
      cdkBuilder.protectedResourceType(protectedResourceType)
    }

    /**
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     */
    override fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable) {
      cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides.let(IResolvable::unwrap))
    }

    /**
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     * the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     * Key values are not case sensitive.
     *
     * See the complete list of [restore testing inferred
     * metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     */
    override fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>) {
      cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    /**
     * @param restoreTestingPlanName The RestoreTestingPlanName is a unique string that is the name
     * of the restore testing plan. 
     */
    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * @param restoreTestingSelectionName This is the unique name of the restore testing selection
     * that belongs to the related restore testing plan. 
     */
    override fun restoreTestingSelectionName(restoreTestingSelectionName: String) {
      cdkBuilder.restoreTestingSelectionName(restoreTestingSelectionName)
    }

    /**
     * @param validationWindowHours This is amount of hours (1 to 168) available to run a validation
     * script on the data.
     * The data will be deleted upon the completion of the validation script or the end of the
     * specified retention period, whichever comes first.
     */
    override fun validationWindowHours(validationWindowHours: Number) {
      cdkBuilder.validationWindowHours(validationWindowHours)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps,
  ) : CdkObject(cdkObject), CfnRestoreTestingSelectionProps {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
     * resource;
     *
     * for example: `arn:aws:iam::123456789012:role/S3Access` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-iamrolearn)
     */
    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns: ["arn:aws:...",
     * "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     */
    override fun protectedResourceArns(): List<String> = unwrap(this).getProtectedResourceArns() ?:
        emptyList()

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     */
    override fun protectedResourceConditions(): Any? = unwrap(this).getProtectedResourceConditions()

    /**
     * The type of AWS resource included in a resource testing selection;
     *
     * for example, an Amazon EBS volume or an Amazon RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcetype)
     */
    override fun protectedResourceType(): String = unwrap(this).getProtectedResourceType()

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
     */
    override fun restoreMetadataOverrides(): Any? = unwrap(this).getRestoreMetadataOverrides()

    /**
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingplanname)
     */
    override fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

    /**
     * This is the unique name of the restore testing selection that belongs to the related restore
     * testing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingselectionname)
     */
    override fun restoreTestingSelectionName(): String =
        unwrap(this).getRestoreTestingSelectionName()

    /**
     * This is amount of hours (1 to 168) available to run a validation script on the data.
     *
     * The data will be deleted upon the completion of the validation script or the end of the
     * specified retention period, whichever comes first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-validationwindowhours)
     */
    override fun validationWindowHours(): Number? = unwrap(this).getValidationWindowHours()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRestoreTestingSelectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps):
        CfnRestoreTestingSelectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingSelectionProps):
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps
  }
}
