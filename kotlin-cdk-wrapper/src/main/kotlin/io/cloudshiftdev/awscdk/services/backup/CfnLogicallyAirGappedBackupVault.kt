@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a logical container to where backups may be copied.
 *
 * This request includes a name, the Region, the maximum number of retention days, the minimum
 * number of retention days, and optionally can include tags and a creator request ID.
 *
 *
 * Do not include sensitive data, such as passport numbers, in the name of a backup vault.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object accessPolicy;
 * CfnLogicallyAirGappedBackupVault cfnLogicallyAirGappedBackupVault =
 * CfnLogicallyAirGappedBackupVault.Builder.create(this, "MyCfnLogicallyAirGappedBackupVault")
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html)
 */
public open class CfnLogicallyAirGappedBackupVault(
  cdkObject: software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogicallyAirGappedBackupVaultProps,
  ) :
      this(software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLogicallyAirGappedBackupVaultProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogicallyAirGappedBackupVaultProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLogicallyAirGappedBackupVaultProps(props)
  )

  /**
   * The backup vault access policy document in JSON format.
   */
  public open fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

  /**
   * The backup vault access policy document in JSON format.
   */
  public open fun accessPolicy(`value`: Any) {
    unwrap(this).setAccessPolicy(`value`)
  }

  /**
   * The ARN of the backup vault.
   */
  public open fun attrBackupVaultArn(): String = unwrap(this).getAttrBackupVaultArn()

  /**
   * The ARN of the server-side encryption key.
   */
  public open fun attrEncryptionKeyArn(): String = unwrap(this).getAttrEncryptionKeyArn()

  /**
   * The vault state.
   *
   * The possible values are `CREATING` , `AVAILABLE` , and `FAILED` .
   */
  public open fun attrVaultState(): String = unwrap(this).getAttrVaultState()

  /**
   * The vault type.
   *
   * The possible values are `BACKUP_VAULT` and `LOGICALLY_AIR_GAPPED_BACKUP_VAULT` .
   */
  public open fun attrVaultType(): String = unwrap(this).getAttrVaultType()

  /**
   * The name of a logical container where backups are stored.
   */
  public open fun backupVaultName(): String = unwrap(this).getBackupVaultName()

  /**
   * The name of a logical container where backups are stored.
   */
  public open fun backupVaultName(`value`: String) {
    unwrap(this).setBackupVaultName(`value`)
  }

  /**
   * The tags to assign to the vault.
   */
  public open fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
      emptyMap()

  /**
   * The tags to assign to the vault.
   */
  public open fun backupVaultTags(`value`: Map<String, String>) {
    unwrap(this).setBackupVaultTags(`value`)
  }

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
   * The maximum retention period that the vault retains its recovery points.
   */
  public open fun maxRetentionDays(): Number = unwrap(this).getMaxRetentionDays()

  /**
   * The maximum retention period that the vault retains its recovery points.
   */
  public open fun maxRetentionDays(`value`: Number) {
    unwrap(this).setMaxRetentionDays(`value`)
  }

  /**
   * This setting specifies the minimum retention period that the vault retains its recovery points.
   */
  public open fun minRetentionDays(): Number = unwrap(this).getMinRetentionDays()

  /**
   * This setting specifies the minimum retention period that the vault retains its recovery points.
   */
  public open fun minRetentionDays(`value`: Number) {
    unwrap(this).setMinRetentionDays(`value`)
  }

  /**
   * Returns event notifications for the specified backup vault.
   */
  public open fun notifications(): Any? = unwrap(this).getNotifications()

  /**
   * Returns event notifications for the specified backup vault.
   */
  public open fun notifications(`value`: IResolvable) {
    unwrap(this).setNotifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Returns event notifications for the specified backup vault.
   */
  public open fun notifications(`value`: NotificationObjectTypeProperty) {
    unwrap(this).setNotifications(`value`.let(NotificationObjectTypeProperty.Companion::unwrap))
  }

  /**
   * Returns event notifications for the specified backup vault.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a66f24144dc1df6de363f7bafb212669a62e63d55650e418724ce917c7e29334")
  public open fun notifications(`value`: NotificationObjectTypeProperty.Builder.() -> Unit): Unit =
      notifications(NotificationObjectTypeProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.backup.CfnLogicallyAirGappedBackupVault].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The backup vault access policy document in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-accesspolicy)
     * @param accessPolicy The backup vault access policy document in JSON format. 
     */
    public fun accessPolicy(accessPolicy: Any)

    /**
     * The name of a logical container where backups are stored.
     *
     * Logically air-gapped backup vaults are identified by names that are unique to the account
     * used to create them and the Region where they are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaultname)
     * @param backupVaultName The name of a logical container where backups are stored. 
     */
    public fun backupVaultName(backupVaultName: String)

    /**
     * The tags to assign to the vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaulttags)
     * @param backupVaultTags The tags to assign to the vault. 
     */
    public fun backupVaultTags(backupVaultTags: Map<String, String>)

    /**
     * The maximum retention period that the vault retains its recovery points.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-maxretentiondays)
     * @param maxRetentionDays The maximum retention period that the vault retains its recovery
     * points. 
     */
    public fun maxRetentionDays(maxRetentionDays: Number)

    /**
     * This setting specifies the minimum retention period that the vault retains its recovery
     * points.
     *
     * The minimum value accepted is 7 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-minretentiondays)
     * @param minRetentionDays This setting specifies the minimum retention period that the vault
     * retains its recovery points. 
     */
    public fun minRetentionDays(minRetentionDays: Number)

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     * @param notifications Returns event notifications for the specified backup vault. 
     */
    public fun notifications(notifications: IResolvable)

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     * @param notifications Returns event notifications for the specified backup vault. 
     */
    public fun notifications(notifications: NotificationObjectTypeProperty)

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     * @param notifications Returns event notifications for the specified backup vault. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7033afc7ac7f416461e8402fce41222d4a754a22d94b705eb50fb442b98e52d1")
    public fun notifications(notifications: NotificationObjectTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.Builder =
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.Builder.create(scope,
        id)

    /**
     * The backup vault access policy document in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-accesspolicy)
     * @param accessPolicy The backup vault access policy document in JSON format. 
     */
    override fun accessPolicy(accessPolicy: Any) {
      cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * The name of a logical container where backups are stored.
     *
     * Logically air-gapped backup vaults are identified by names that are unique to the account
     * used to create them and the Region where they are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaultname)
     * @param backupVaultName The name of a logical container where backups are stored. 
     */
    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * The tags to assign to the vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-backupvaulttags)
     * @param backupVaultTags The tags to assign to the vault. 
     */
    override fun backupVaultTags(backupVaultTags: Map<String, String>) {
      cdkBuilder.backupVaultTags(backupVaultTags)
    }

    /**
     * The maximum retention period that the vault retains its recovery points.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-maxretentiondays)
     * @param maxRetentionDays The maximum retention period that the vault retains its recovery
     * points. 
     */
    override fun maxRetentionDays(maxRetentionDays: Number) {
      cdkBuilder.maxRetentionDays(maxRetentionDays)
    }

    /**
     * This setting specifies the minimum retention period that the vault retains its recovery
     * points.
     *
     * The minimum value accepted is 7 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-minretentiondays)
     * @param minRetentionDays This setting specifies the minimum retention period that the vault
     * retains its recovery points. 
     */
    override fun minRetentionDays(minRetentionDays: Number) {
      cdkBuilder.minRetentionDays(minRetentionDays)
    }

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     * @param notifications Returns event notifications for the specified backup vault. 
     */
    override fun notifications(notifications: IResolvable) {
      cdkBuilder.notifications(notifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     * @param notifications Returns event notifications for the specified backup vault. 
     */
    override fun notifications(notifications: NotificationObjectTypeProperty) {
      cdkBuilder.notifications(notifications.let(NotificationObjectTypeProperty.Companion::unwrap))
    }

    /**
     * Returns event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-logicallyairgappedbackupvault.html#cfn-backup-logicallyairgappedbackupvault-notifications)
     * @param notifications Returns event notifications for the specified backup vault. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7033afc7ac7f416461e8402fce41222d4a754a22d94b705eb50fb442b98e52d1")
    override fun notifications(notifications: NotificationObjectTypeProperty.Builder.() -> Unit):
        Unit = notifications(NotificationObjectTypeProperty(notifications))

    public fun build(): software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogicallyAirGappedBackupVault {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogicallyAirGappedBackupVault(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault):
        CfnLogicallyAirGappedBackupVault = CfnLogicallyAirGappedBackupVault(cdkObject)

    internal fun unwrap(wrapped: CfnLogicallyAirGappedBackupVault):
        software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault = wrapped.cdkObject
        as software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * NotificationObjectTypeProperty notificationObjectTypeProperty =
   * NotificationObjectTypeProperty.builder()
   * .backupVaultEvents(List.of("backupVaultEvents"))
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-logicallyairgappedbackupvault-notificationobjecttype.html)
   */
  public interface NotificationObjectTypeProperty {
    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-logicallyairgappedbackupvault-notificationobjecttype.html#cfn-backup-logicallyairgappedbackupvault-notificationobjecttype-backupvaultevents)
     */
    public fun backupVaultEvents(): List<String>

    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events;
     *
     * for example, `arn:aws:sns:us-west-2:111122223333:MyVaultTopic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-logicallyairgappedbackupvault-notificationobjecttype.html#cfn-backup-logicallyairgappedbackupvault-notificationobjecttype-snstopicarn)
     */
    public fun snsTopicArn(): String

    /**
     * A builder for [NotificationObjectTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       */
      public fun backupVaultEvents(backupVaultEvents: List<String>)

      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       */
      public fun backupVaultEvents(vararg backupVaultEvents: String)

      /**
       * @param snsTopicArn The Amazon Resource Name (ARN) that specifies the topic for a backup
       * vault’s events;. 
       * for example, `arn:aws:sns:us-west-2:111122223333:MyVaultTopic` .
       */
      public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty.builder()

      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       */
      override fun backupVaultEvents(backupVaultEvents: List<String>) {
        cdkBuilder.backupVaultEvents(backupVaultEvents)
      }

      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       */
      override fun backupVaultEvents(vararg backupVaultEvents: String): Unit =
          backupVaultEvents(backupVaultEvents.toList())

      /**
       * @param snsTopicArn The Amazon Resource Name (ARN) that specifies the topic for a backup
       * vault’s events;. 
       * for example, `arn:aws:sns:us-west-2:111122223333:MyVaultTopic` .
       */
      override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty,
    ) : CdkObject(cdkObject),
        NotificationObjectTypeProperty {
      /**
       * An array of events that indicate the status of jobs to back up resources to the backup
       * vault.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-logicallyairgappedbackupvault-notificationobjecttype.html#cfn-backup-logicallyairgappedbackupvault-notificationobjecttype-backupvaultevents)
       */
      override fun backupVaultEvents(): List<String> = unwrap(this).getBackupVaultEvents()

      /**
       * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events;
       *
       * for example, `arn:aws:sns:us-west-2:111122223333:MyVaultTopic` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-logicallyairgappedbackupvault-notificationobjecttype.html#cfn-backup-logicallyairgappedbackupvault-notificationobjecttype-snstopicarn)
       */
      override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationObjectTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty):
          NotificationObjectTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationObjectTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationObjectTypeProperty):
          software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnLogicallyAirGappedBackupVault.NotificationObjectTypeProperty
    }
  }
}
