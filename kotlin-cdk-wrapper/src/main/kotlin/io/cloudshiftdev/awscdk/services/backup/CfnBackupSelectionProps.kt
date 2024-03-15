@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBackupSelection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object conditions;
 * CfnBackupSelectionProps cfnBackupSelectionProps = CfnBackupSelectionProps.builder()
 * .backupPlanId("backupPlanId")
 * .backupSelection(BackupSelectionResourceTypeProperty.builder()
 * .iamRoleArn("iamRoleArn")
 * .selectionName("selectionName")
 * // the properties below are optional
 * .conditions(conditions)
 * .listOfTags(List.of(ConditionResourceTypeProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionType("conditionType")
 * .conditionValue("conditionValue")
 * .build()))
 * .notResources(List.of("notResources"))
 * .resources(List.of("resources"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html)
 */
public interface CfnBackupSelectionProps {
  /**
   * Uniquely identifies a backup plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid)
   */
  public fun backupPlanId(): String

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   *
   * It includes an array of resources, an optional array of patterns to exclude resources, an
   * optional role to provide access to the AWS service the resource belongs to, and an optional array
   * of tags used to identify a set of resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
   */
  public fun backupSelection(): Any

  /**
   * A builder for [CfnBackupSelectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupPlanId Uniquely identifies a backup plan. 
     */
    public fun backupPlanId(backupPlanId: String)

    /**
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     */
    public fun backupSelection(backupSelection: IResolvable)

    /**
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     */
    public
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty)

    /**
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a786542b7bad5971a5d30007a08e40068c8e2588dc6ea90915ec11a496d16fbb")
    public
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupSelectionProps.Builder =
        software.amazon.awscdk.services.backup.CfnBackupSelectionProps.builder()

    /**
     * @param backupPlanId Uniquely identifies a backup plan. 
     */
    override fun backupPlanId(backupPlanId: String) {
      cdkBuilder.backupPlanId(backupPlanId)
    }

    /**
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     */
    override fun backupSelection(backupSelection: IResolvable) {
      cdkBuilder.backupSelection(backupSelection.let(IResolvable::unwrap))
    }

    /**
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     */
    override
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty) {
      cdkBuilder.backupSelection(backupSelection.let(CfnBackupSelection.BackupSelectionResourceTypeProperty::unwrap))
    }

    /**
     * @param backupSelection Specifies the body of a request to assign a set of resources to a
     * backup plan. 
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a786542b7bad5971a5d30007a08e40068c8e2588dc6ea90915ec11a496d16fbb")
    override
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder.() -> Unit):
        Unit =
        backupSelection(CfnBackupSelection.BackupSelectionResourceTypeProperty(backupSelection))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupSelectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelectionProps,
  ) : CdkObject(cdkObject), CfnBackupSelectionProps {
    /**
     * Uniquely identifies a backup plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid)
     */
    override fun backupPlanId(): String = unwrap(this).getBackupPlanId()

    /**
     * Specifies the body of a request to assign a set of resources to a backup plan.
     *
     * It includes an array of resources, an optional array of patterns to exclude resources, an
     * optional role to provide access to the AWS service the resource belongs to, and an optional
     * array of tags used to identify a set of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
     */
    override fun backupSelection(): Any = unwrap(this).getBackupSelection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBackupSelectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelectionProps):
        CfnBackupSelectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBackupSelectionProps):
        software.amazon.awscdk.services.backup.CfnBackupSelectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.CfnBackupSelectionProps
  }
}
