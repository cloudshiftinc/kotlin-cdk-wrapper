@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBackupPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object backupOptions;
 * CfnBackupPlanProps cfnBackupPlanProps = CfnBackupPlanProps.builder()
 * .backupPlan(BackupPlanResourceTypeProperty.builder()
 * .backupPlanName("backupPlanName")
 * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
 * .ruleName("ruleName")
 * .targetBackupVault("targetBackupVault")
 * // the properties below are optional
 * .completionWindowMinutes(123)
 * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
 * .destinationBackupVaultArn("destinationBackupVaultArn")
 * // the properties below are optional
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .optInToArchiveForSupportedResources(false)
 * .build())
 * .build()))
 * .enableContinuousBackup(false)
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .optInToArchiveForSupportedResources(false)
 * .build())
 * .recoveryPointTags(Map.of(
 * "recoveryPointTagsKey", "recoveryPointTags"))
 * .scheduleExpression("scheduleExpression")
 * .scheduleExpressionTimezone("scheduleExpressionTimezone")
 * .startWindowMinutes(123)
 * .build()))
 * // the properties below are optional
 * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
 * .backupOptions(backupOptions)
 * .resourceType("resourceType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .backupPlanTags(Map.of(
 * "backupPlanTagsKey", "backupPlanTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html)
 */
public interface CfnBackupPlanProps {
  /**
   * Uniquely identifies the backup plan to be associated with the selection of resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
   */
  public fun backupPlan(): Any

  /**
   * To help organize your resources, you can assign your own metadata to the resources that you
   * create.
   *
   * Each tag is a key-value pair. The specified tags are assigned to all backups created with this
   * plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
   */
  public fun backupPlanTags(): Map<String, String> = unwrap(this).getBackupPlanTags() ?: emptyMap()

  /**
   * A builder for [CfnBackupPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    public fun backupPlan(backupPlan: IResolvable)

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty)

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3821f99c61f0dddd7d9c960d5f919f9e56da9d555e0aca6256ed57d22a08ed4")
    public
        fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder.() -> Unit)

    /**
     * @param backupPlanTags To help organize your resources, you can assign your own metadata to
     * the resources that you create.
     * Each tag is a key-value pair. The specified tags are assigned to all backups created with
     * this plan.
     */
    public fun backupPlanTags(backupPlanTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupPlanProps.Builder =
        software.amazon.awscdk.services.backup.CfnBackupPlanProps.builder()

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    override fun backupPlan(backupPlan: IResolvable) {
      cdkBuilder.backupPlan(backupPlan.let(IResolvable::unwrap))
    }

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    override fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
      cdkBuilder.backupPlan(backupPlan.let(CfnBackupPlan.BackupPlanResourceTypeProperty::unwrap))
    }

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     * resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3821f99c61f0dddd7d9c960d5f919f9e56da9d555e0aca6256ed57d22a08ed4")
    override
        fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder.() -> Unit):
        Unit = backupPlan(CfnBackupPlan.BackupPlanResourceTypeProperty(backupPlan))

    /**
     * @param backupPlanTags To help organize your resources, you can assign your own metadata to
     * the resources that you create.
     * Each tag is a key-value pair. The specified tags are assigned to all backups created with
     * this plan.
     */
    override fun backupPlanTags(backupPlanTags: Map<String, String>) {
      cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlanProps,
  ) : CdkObject(cdkObject), CfnBackupPlanProps {
    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     */
    override fun backupPlan(): Any = unwrap(this).getBackupPlan()

    /**
     * To help organize your resources, you can assign your own metadata to the resources that you
     * create.
     *
     * Each tag is a key-value pair. The specified tags are assigned to all backups created with
     * this plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
     */
    override fun backupPlanTags(): Map<String, String> = unwrap(this).getBackupPlanTags() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBackupPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlanProps):
        CfnBackupPlanProps = CdkObjectWrappers.wrap(cdkObject) as CfnBackupPlanProps

    internal fun unwrap(wrapped: CfnBackupPlanProps):
        software.amazon.awscdk.services.backup.CfnBackupPlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.CfnBackupPlanProps
  }
}
