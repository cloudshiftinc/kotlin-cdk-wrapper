@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLogicallyAirGappedBackupVault`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object accessPolicy;
 * CfnLogicallyAirGappedBackupVaultProps cfnLogicallyAirGappedBackupVaultProps =
 * CfnLogicallyAirGappedBackupVaultProps.builder()
 * .backupVaultName("backupVaultName")
 * .maxRetentionDays(123)
 * .minRetentionDays(123)
 * // the properties below are optional
 * .accessPolicy(accessPolicy)
 * .backupVaultTags(Map.of(
 * "backupVaultTagsKey", "backupVaultTags"))
 * .notifications(NotificationObjectTypeProperty.builder()
 * .backupVaultEvents(List.of("backupVaultEvents"))
 * .snsTopicArn("snsTopicArn")
 * .build())
 * .vaultState("vaultState")
 * .vaultType("vaultType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html)
 */
public interface CfnLogicallyAirGappedBackupVaultProps {
  /**
   * The backup vault access policy document in JSON format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-accesspolicy)
   */
  public fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

  /**
   * The name of a logical container where backups are stored.
   *
   * Logically air-gapped backup vaults are identified by names that are unique to the account used
   * to create them and the Region where they are created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaultname)
   */
  public fun backupVaultName(): String

  /**
   * The tags to assign to the vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaulttags)
   */
  public fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
      emptyMap()

  /**
   * The maximum retention period that the vault retains its recovery points.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-maxretentiondays)
   */
  public fun maxRetentionDays(): Number

  /**
   * This setting specifies the minimum retention period that the vault retains its recovery points.
   *
   * The minimum value accepted is 7 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-minretentiondays)
   */
  public fun minRetentionDays(): Number

  /**
   * Returns event notifications for the specified backup vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
   */
  public fun notifications(): Any? = unwrap(this).getNotifications()

  /**
   * The current state of the vault.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-vaultstate)
   */
  public fun vaultState(): String? = unwrap(this).getVaultState()

  /**
   * The type of vault described.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-vaulttype)
   */
  public fun vaultType(): String? = unwrap(this).getVaultType()

  /**
   * A builder for [CfnLogicallyAirGappedBackupVaultProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicy The backup vault access policy document in JSON format.
     */
    public fun accessPolicy(accessPolicy: Any)

    /**
     * @param backupVaultName The name of a logical container where backups are stored. 
     * Logically air-gapped backup vaults are identified by names that are unique to the account
     * used to create them and the Region where they are created.
     */
    public fun backupVaultName(backupVaultName: String)

    /**
     * @param backupVaultTags The tags to assign to the vault.
     */
    public fun backupVaultTags(backupVaultTags: Map<String, String>)

    /**
     * @param maxRetentionDays The maximum retention period that the vault retains its recovery
     * points. 
     */
    public fun maxRetentionDays(maxRetentionDays: Number)

    /**
     * @param minRetentionDays This setting specifies the minimum retention period that the vault
     * retains its recovery points. 
     * The minimum value accepted is 7 days.
     */
    public fun minRetentionDays(minRetentionDays: Number)

    /**
     * @param notifications Returns event notifications for the specified backup vault.
     */
    public fun notifications(notifications: IResolvable)

    /**
     * @param notifications Returns event notifications for the specified backup vault.
     */
    public
        fun notifications(notifications: CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty)

    /**
     * @param notifications Returns event notifications for the specified backup vault.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0653c06aaf1efddb8a5e4699a8eeac3d8c13b4afb24efb2f53e36fdccf742745")
    public
        fun notifications(notifications: CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit)

    /**
     * @param vaultState The current state of the vault.
     */
    public fun vaultState(vaultState: String)

    /**
     * @param vaultType The type of vault described.
     */
    public fun vaultType(vaultType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps.Builder =
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps.builder()

    /**
     * @param accessPolicy The backup vault access policy document in JSON format.
     */
    override fun accessPolicy(accessPolicy: Any) {
      cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * @param backupVaultName The name of a logical container where backups are stored. 
     * Logically air-gapped backup vaults are identified by names that are unique to the account
     * used to create them and the Region where they are created.
     */
    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * @param backupVaultTags The tags to assign to the vault.
     */
    override fun backupVaultTags(backupVaultTags: Map<String, String>) {
      cdkBuilder.backupVaultTags(backupVaultTags)
    }

    /**
     * @param maxRetentionDays The maximum retention period that the vault retains its recovery
     * points. 
     */
    override fun maxRetentionDays(maxRetentionDays: Number) {
      cdkBuilder.maxRetentionDays(maxRetentionDays)
    }

    /**
     * @param minRetentionDays This setting specifies the minimum retention period that the vault
     * retains its recovery points. 
     * The minimum value accepted is 7 days.
     */
    override fun minRetentionDays(minRetentionDays: Number) {
      cdkBuilder.minRetentionDays(minRetentionDays)
    }

    /**
     * @param notifications Returns event notifications for the specified backup vault.
     */
    override fun notifications(notifications: IResolvable) {
      cdkBuilder.notifications(notifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notifications Returns event notifications for the specified backup vault.
     */
    override
        fun notifications(notifications: CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty) {
      cdkBuilder.notifications(notifications.let(CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty.Companion::unwrap))
    }

    /**
     * @param notifications Returns event notifications for the specified backup vault.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0653c06aaf1efddb8a5e4699a8eeac3d8c13b4afb24efb2f53e36fdccf742745")
    override
        fun notifications(notifications: CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit):
        Unit =
        notifications(CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty(notifications))

    /**
     * @param vaultState The current state of the vault.
     */
    override fun vaultState(vaultState: String) {
      cdkBuilder.vaultState(vaultState)
    }

    /**
     * @param vaultType The type of vault described.
     */
    override fun vaultType(vaultType: String) {
      cdkBuilder.vaultType(vaultType)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps,
  ) : CdkObject(cdkObject),
      CfnLogicallyAirGappedBackupVaultProps {
    /**
     * The backup vault access policy document in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-accesspolicy)
     */
    override fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

    /**
     * The name of a logical container where backups are stored.
     *
     * Logically air-gapped backup vaults are identified by names that are unique to the account
     * used to create them and the Region where they are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaultname)
     */
    override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

    /**
     * The tags to assign to the vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaulttags)
     */
    override fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
        emptyMap()

    /**
     * The maximum retention period that the vault retains its recovery points.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-maxretentiondays)
     */
    override fun maxRetentionDays(): Number = unwrap(this).getMaxRetentionDays()

    /**
     * This setting specifies the minimum retention period that the vault retains its recovery
     * points.
     *
     * The minimum value accepted is 7 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-minretentiondays)
     */
    override fun minRetentionDays(): Number = unwrap(this).getMinRetentionDays()

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     */
    override fun notifications(): Any? = unwrap(this).getNotifications()

    /**
     * The current state of the vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-vaultstate)
     */
    override fun vaultState(): String? = unwrap(this).getVaultState()

    /**
     * The type of vault described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-vaulttype)
     */
    override fun vaultType(): String? = unwrap(this).getVaultType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnLogicallyAirGappedBackupVaultProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps):
        CfnLogicallyAirGappedBackupVaultProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLogicallyAirGappedBackupVaultProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogicallyAirGappedBackupVaultProps):
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVaultProps
  }
}
