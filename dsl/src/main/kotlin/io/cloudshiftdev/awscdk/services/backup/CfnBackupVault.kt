package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBackupVault internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * A resource-based policy that is used to manage access permissions on the target backup vault.
   */
  public open fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

  /**
   * A resource-based policy that is used to manage access permissions on the target backup vault.
   */
  public open fun accessPolicy(`value`: Any) {
    unwrap(this).setAccessPolicy(`value`)
  }

  /**
   * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
   *
   * for example, `arn:aws:backup:us-east-1:123456789012:backup-vault:aBackupVault` .
   */
  public open fun attrBackupVaultArn(): String = unwrap(this).getAttrBackupVaultArn()

  /**
   * The name of a logical container where backups are stored.
   *
   * Backup vaults are identified by names that are unique to the account used to create them and
   * the Region where they are created. They consist of lowercase and uppercase letters, numbers, and
   * hyphens.
   */
  public open fun attrBackupVaultName(): String = unwrap(this).getAttrBackupVaultName()

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
   * Metadata that you can assign to help organize the resources that you create.
   */
  public open fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
      emptyMap()

  /**
   * Metadata that you can assign to help organize the resources that you create.
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
   * A server-side encryption key you can specify to encrypt your backups from services that support
   * full AWS Backup management;
   */
  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * A server-side encryption key you can specify to encrypt your backups from services that support
   * full AWS Backup management;
   */
  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   */
  public open fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   */
  public open fun lockConfiguration(`value`: IResolvable) {
    unwrap(this).setLockConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   */
  public open fun lockConfiguration(`value`: LockConfigurationTypeProperty) {
    unwrap(this).setLockConfiguration(`value`.let(LockConfigurationTypeProperty::unwrap))
  }

  /**
   * Configuration for [AWS Backup Vault
   * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("05313fa9bfcbef99b4c75cf8ba7394185eb2dd28876c23ab5645396874294bf7")
  public open fun lockConfiguration(`value`: LockConfigurationTypeProperty.Builder.() -> Unit): Unit
      = lockConfiguration(LockConfigurationTypeProperty(`value`))

  /**
   * The SNS event notifications for the specified backup vault.
   */
  public open fun notifications(): Any? = unwrap(this).getNotifications()

  /**
   * The SNS event notifications for the specified backup vault.
   */
  public open fun notifications(`value`: IResolvable) {
    unwrap(this).setNotifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The SNS event notifications for the specified backup vault.
   */
  public open fun notifications(`value`: NotificationObjectTypeProperty) {
    unwrap(this).setNotifications(`value`.let(NotificationObjectTypeProperty::unwrap))
  }

  /**
   * The SNS event notifications for the specified backup vault.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b591b9854082ae8d5642dcc6e2ff0ca0c3e315bd24a74bfb1c6fb47276351669")
  public open fun notifications(`value`: NotificationObjectTypeProperty.Builder.() -> Unit): Unit =
      notifications(NotificationObjectTypeProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnBackupVault].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy)
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * target backup vault. 
     */
    public fun accessPolicy(accessPolicy: Any)

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname)
     * @param backupVaultName The name of a logical container where backups are stored. 
     */
    public fun backupVaultName(backupVaultName: String)

    /**
     * Metadata that you can assign to help organize the resources that you create.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags)
     * @param backupVaultTags Metadata that you can assign to help organize the resources that you
     * create. 
     */
    public fun backupVaultTags(backupVaultTags: Map<String, String>)

    /**
     * A server-side encryption key you can specify to encrypt your backups from services that
     * support full AWS Backup management;
     *
     * for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * If you specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
     * Backup creates a KMS key for you by default.
     *
     * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
     * handles encryption for backups from services that do not yet support full AWS Backup , see
     * [Encryption for backups in AWS
     * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn)
     * @param encryptionKeyArn A server-side encryption key you can specify to encrypt your backups
     * from services that support full AWS Backup management;. 
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
     */
    public fun lockConfiguration(lockConfiguration: IResolvable)

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
     */
    public fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty)

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a71402da52619170c8b22fd24486cad861ae95c5fa738d771d76af2f598f4f1")
    public
        fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     * @param notifications The SNS event notifications for the specified backup vault. 
     */
    public fun notifications(notifications: IResolvable)

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     * @param notifications The SNS event notifications for the specified backup vault. 
     */
    public fun notifications(notifications: NotificationObjectTypeProperty)

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     * @param notifications The SNS event notifications for the specified backup vault. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf094274cd7b72dd9667bbc2fa72561eb35043b71063a300537d895068062283")
    public fun notifications(notifications: NotificationObjectTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupVault.Builder =
        software.amazon.awscdk.services.backup.CfnBackupVault.Builder.create(scope, id)

    /**
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy)
     * @param accessPolicy A resource-based policy that is used to manage access permissions on the
     * target backup vault. 
     */
    override fun accessPolicy(accessPolicy: Any) {
      cdkBuilder.accessPolicy(accessPolicy)
    }

    /**
     * The name of a logical container where backups are stored.
     *
     * Backup vaults are identified by names that are unique to the account used to create them and
     * the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname)
     * @param backupVaultName The name of a logical container where backups are stored. 
     */
    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    /**
     * Metadata that you can assign to help organize the resources that you create.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags)
     * @param backupVaultTags Metadata that you can assign to help organize the resources that you
     * create. 
     */
    override fun backupVaultTags(backupVaultTags: Map<String, String>) {
      cdkBuilder.backupVaultTags(backupVaultTags)
    }

    /**
     * A server-side encryption key you can specify to encrypt your backups from services that
     * support full AWS Backup management;
     *
     * for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * If you specify a key, you must specify its ARN, not its alias. If you do not specify a key, AWS
     * Backup creates a KMS key for you by default.
     *
     * To learn which AWS Backup services support full AWS Backup management and how AWS Backup
     * handles encryption for backups from services that do not yet support full AWS Backup , see
     * [Encryption for backups in AWS
     * Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/encryption.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn)
     * @param encryptionKeyArn A server-side encryption key you can specify to encrypt your backups
     * from services that support full AWS Backup management;. 
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
     */
    override fun lockConfiguration(lockConfiguration: IResolvable) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
     */
    override fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(LockConfigurationTypeProperty::unwrap))
    }

    /**
     * Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-lockconfiguration)
     * @param lockConfiguration Configuration for [AWS Backup Vault
     * Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html) . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a71402da52619170c8b22fd24486cad861ae95c5fa738d771d76af2f598f4f1")
    override
        fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty.Builder.() -> Unit):
        Unit = lockConfiguration(LockConfigurationTypeProperty(lockConfiguration))

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     * @param notifications The SNS event notifications for the specified backup vault. 
     */
    override fun notifications(notifications: IResolvable) {
      cdkBuilder.notifications(notifications.let(IResolvable::unwrap))
    }

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     * @param notifications The SNS event notifications for the specified backup vault. 
     */
    override fun notifications(notifications: NotificationObjectTypeProperty) {
      cdkBuilder.notifications(notifications.let(NotificationObjectTypeProperty::unwrap))
    }

    /**
     * The SNS event notifications for the specified backup vault.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-notifications)
     * @param notifications The SNS event notifications for the specified backup vault. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf094274cd7b72dd9667bbc2fa72561eb35043b71063a300537d895068062283")
    override fun notifications(notifications: NotificationObjectTypeProperty.Builder.() -> Unit):
        Unit = notifications(NotificationObjectTypeProperty(notifications))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupVault = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBackupVault {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBackupVault(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault):
        CfnBackupVault = CfnBackupVault(cdkObject)

    internal fun unwrap(wrapped: CfnBackupVault):
        software.amazon.awscdk.services.backup.CfnBackupVault = wrapped.cdkObject
  }

  public interface NotificationObjectTypeProperty {
    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     *
     * For valid events, see
     * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
     * in the *AWS Backup API Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-backupvaultevents)
     */
    public fun backupVaultEvents(): List<String>

    /**
     * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic;
     *
     * for example, `arn:aws:sns:us-west-2:111122223333:MyTopic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-snstopicarn)
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
       * For valid events, see
       * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
       * in the *AWS Backup API Guide* .
       */
      public fun backupVaultEvents(backupVaultEvents: List<String>)

      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       * For valid events, see
       * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
       * in the *AWS Backup API Guide* .
       */
      public fun backupVaultEvents(vararg backupVaultEvents: String)

      /**
       * @param snsTopicArn An ARN that uniquely identifies an Amazon Simple Notification Service
       * (Amazon SNS) topic;. 
       * for example, `arn:aws:sns:us-west-2:111122223333:MyTopic` .
       */
      public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty.builder()

      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       * For valid events, see
       * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
       * in the *AWS Backup API Guide* .
       */
      override fun backupVaultEvents(backupVaultEvents: List<String>) {
        cdkBuilder.backupVaultEvents(backupVaultEvents)
      }

      /**
       * @param backupVaultEvents An array of events that indicate the status of jobs to back up
       * resources to the backup vault. 
       * For valid events, see
       * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
       * in the *AWS Backup API Guide* .
       */
      override fun backupVaultEvents(vararg backupVaultEvents: String): Unit =
          backupVaultEvents(backupVaultEvents.toList())

      /**
       * @param snsTopicArn An ARN that uniquely identifies an Amazon Simple Notification Service
       * (Amazon SNS) topic;. 
       * for example, `arn:aws:sns:us-west-2:111122223333:MyTopic` .
       */
      override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty,
    ) : NotificationObjectTypeProperty {
      /**
       * An array of events that indicate the status of jobs to back up resources to the backup
       * vault.
       *
       * For valid events, see
       * [BackupVaultEvents](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_PutBackupVaultNotifications.html#API_PutBackupVaultNotifications_RequestSyntax)
       * in the *AWS Backup API Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-backupvaultevents)
       */
      override fun backupVaultEvents(): List<String> = unwrap(this).getBackupVaultEvents()

      /**
       * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic;
       *
       * for example, `arn:aws:sns:us-west-2:111122223333:MyTopic` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-snstopicarn)
       */
      override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationObjectTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty):
          NotificationObjectTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationObjectTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LockConfigurationTypeProperty {
    /**
     * The AWS Backup Vault Lock configuration that specifies the number of days before the lock
     * date.
     *
     * For example, setting `ChangeableForDays` to 30 on Jan. 1, 2022 at 8pm UTC will set the lock
     * date to Jan. 31, 2022 at 8pm UTC.
     *
     * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes
     * immutable. Therefore, you must set `ChangeableForDays` to 3 or greater.
     *
     * Before the lock date, you can delete Vault Lock from the vault using
     * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
     * `PutBackupVaultLockConfiguration` . On and after the lock date, the Vault Lock becomes immutable
     * and cannot be changed or deleted.
     *
     * If this parameter is not specified, you can delete Vault Lock from the vault using
     * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
     * `PutBackupVaultLockConfiguration` at any time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html#cfn-backup-backupvault-lockconfigurationtype-changeablefordays)
     */
    public fun changeableForDays(): Number? = unwrap(this).getChangeableForDays()

    /**
     * The AWS Backup Vault Lock configuration that specifies the maximum retention period that the
     * vault retains its recovery points.
     *
     * This setting can be useful if, for example, your organization's policies require you to
     * destroy certain data after retaining it for four years (1460 days).
     *
     * If this parameter is not included, Vault Lock does not enforce a maximum retention period on
     * the recovery points in the vault. If this parameter is included without a value, Vault Lock will
     * not enforce a maximum retention period.
     *
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
     * policy with a retention period equal to or shorter than the maximum retention period. If the
     * job's retention period is longer than that maximum retention period, then the vault fails the
     * backup or copy job, and you should either modify your lifecycle settings or use a different
     * vault. Recovery points already saved in the vault prior to Vault Lock are not affected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html#cfn-backup-backupvault-lockconfigurationtype-maxretentiondays)
     */
    public fun maxRetentionDays(): Number? = unwrap(this).getMaxRetentionDays()

    /**
     * The AWS Backup Vault Lock configuration that specifies the minimum retention period that the
     * vault retains its recovery points.
     *
     * This setting can be useful if, for example, your organization's policies require you to
     * retain certain data for at least seven years (2555 days).
     *
     * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     *
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
     * policy with a retention period equal to or longer than the minimum retention period. If the
     * job's retention period is shorter than that minimum retention period, then the vault fails that
     * backup or copy job, and you should either modify your lifecycle settings or use a different
     * vault. Recovery points already saved in the vault prior to Vault Lock are not affected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html#cfn-backup-backupvault-lockconfigurationtype-minretentiondays)
     */
    public fun minRetentionDays(): Number

    /**
     * A builder for [LockConfigurationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param changeableForDays The AWS Backup Vault Lock configuration that specifies the number
       * of days before the lock date.
       * For example, setting `ChangeableForDays` to 30 on Jan. 1, 2022 at 8pm UTC will set the lock
       * date to Jan. 31, 2022 at 8pm UTC.
       *
       * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes
       * immutable. Therefore, you must set `ChangeableForDays` to 3 or greater.
       *
       * Before the lock date, you can delete Vault Lock from the vault using
       * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
       * `PutBackupVaultLockConfiguration` . On and after the lock date, the Vault Lock becomes
       * immutable and cannot be changed or deleted.
       *
       * If this parameter is not specified, you can delete Vault Lock from the vault using
       * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
       * `PutBackupVaultLockConfiguration` at any time.
       */
      public fun changeableForDays(changeableForDays: Number)

      /**
       * @param maxRetentionDays The AWS Backup Vault Lock configuration that specifies the maximum
       * retention period that the vault retains its recovery points.
       * This setting can be useful if, for example, your organization's policies require you to
       * destroy certain data after retaining it for four years (1460 days).
       *
       * If this parameter is not included, Vault Lock does not enforce a maximum retention period
       * on the recovery points in the vault. If this parameter is included without a value, Vault Lock
       * will not enforce a maximum retention period.
       *
       * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
       * policy with a retention period equal to or shorter than the maximum retention period. If the
       * job's retention period is longer than that maximum retention period, then the vault fails the
       * backup or copy job, and you should either modify your lifecycle settings or use a different
       * vault. Recovery points already saved in the vault prior to Vault Lock are not affected.
       */
      public fun maxRetentionDays(maxRetentionDays: Number)

      /**
       * @param minRetentionDays The AWS Backup Vault Lock configuration that specifies the minimum
       * retention period that the vault retains its recovery points. 
       * This setting can be useful if, for example, your organization's policies require you to
       * retain certain data for at least seven years (2555 days).
       *
       * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
       *
       * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
       * policy with a retention period equal to or longer than the minimum retention period. If the
       * job's retention period is shorter than that minimum retention period, then the vault fails
       * that backup or copy job, and you should either modify your lifecycle settings or use a
       * different vault. Recovery points already saved in the vault prior to Vault Lock are not
       * affected.
       */
      public fun minRetentionDays(minRetentionDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty.builder()

      /**
       * @param changeableForDays The AWS Backup Vault Lock configuration that specifies the number
       * of days before the lock date.
       * For example, setting `ChangeableForDays` to 30 on Jan. 1, 2022 at 8pm UTC will set the lock
       * date to Jan. 31, 2022 at 8pm UTC.
       *
       * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes
       * immutable. Therefore, you must set `ChangeableForDays` to 3 or greater.
       *
       * Before the lock date, you can delete Vault Lock from the vault using
       * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
       * `PutBackupVaultLockConfiguration` . On and after the lock date, the Vault Lock becomes
       * immutable and cannot be changed or deleted.
       *
       * If this parameter is not specified, you can delete Vault Lock from the vault using
       * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
       * `PutBackupVaultLockConfiguration` at any time.
       */
      override fun changeableForDays(changeableForDays: Number) {
        cdkBuilder.changeableForDays(changeableForDays)
      }

      /**
       * @param maxRetentionDays The AWS Backup Vault Lock configuration that specifies the maximum
       * retention period that the vault retains its recovery points.
       * This setting can be useful if, for example, your organization's policies require you to
       * destroy certain data after retaining it for four years (1460 days).
       *
       * If this parameter is not included, Vault Lock does not enforce a maximum retention period
       * on the recovery points in the vault. If this parameter is included without a value, Vault Lock
       * will not enforce a maximum retention period.
       *
       * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
       * policy with a retention period equal to or shorter than the maximum retention period. If the
       * job's retention period is longer than that maximum retention period, then the vault fails the
       * backup or copy job, and you should either modify your lifecycle settings or use a different
       * vault. Recovery points already saved in the vault prior to Vault Lock are not affected.
       */
      override fun maxRetentionDays(maxRetentionDays: Number) {
        cdkBuilder.maxRetentionDays(maxRetentionDays)
      }

      /**
       * @param minRetentionDays The AWS Backup Vault Lock configuration that specifies the minimum
       * retention period that the vault retains its recovery points. 
       * This setting can be useful if, for example, your organization's policies require you to
       * retain certain data for at least seven years (2555 days).
       *
       * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
       *
       * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
       * policy with a retention period equal to or longer than the minimum retention period. If the
       * job's retention period is shorter than that minimum retention period, then the vault fails
       * that backup or copy job, and you should either modify your lifecycle settings or use a
       * different vault. Recovery points already saved in the vault prior to Vault Lock are not
       * affected.
       */
      override fun minRetentionDays(minRetentionDays: Number) {
        cdkBuilder.minRetentionDays(minRetentionDays)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty,
    ) : LockConfigurationTypeProperty {
      /**
       * The AWS Backup Vault Lock configuration that specifies the number of days before the lock
       * date.
       *
       * For example, setting `ChangeableForDays` to 30 on Jan. 1, 2022 at 8pm UTC will set the lock
       * date to Jan. 31, 2022 at 8pm UTC.
       *
       * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes
       * immutable. Therefore, you must set `ChangeableForDays` to 3 or greater.
       *
       * Before the lock date, you can delete Vault Lock from the vault using
       * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
       * `PutBackupVaultLockConfiguration` . On and after the lock date, the Vault Lock becomes
       * immutable and cannot be changed or deleted.
       *
       * If this parameter is not specified, you can delete Vault Lock from the vault using
       * `DeleteBackupVaultLockConfiguration` or change the Vault Lock configuration using
       * `PutBackupVaultLockConfiguration` at any time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html#cfn-backup-backupvault-lockconfigurationtype-changeablefordays)
       */
      override fun changeableForDays(): Number? = unwrap(this).getChangeableForDays()

      /**
       * The AWS Backup Vault Lock configuration that specifies the maximum retention period that
       * the vault retains its recovery points.
       *
       * This setting can be useful if, for example, your organization's policies require you to
       * destroy certain data after retaining it for four years (1460 days).
       *
       * If this parameter is not included, Vault Lock does not enforce a maximum retention period
       * on the recovery points in the vault. If this parameter is included without a value, Vault Lock
       * will not enforce a maximum retention period.
       *
       * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
       * policy with a retention period equal to or shorter than the maximum retention period. If the
       * job's retention period is longer than that maximum retention period, then the vault fails the
       * backup or copy job, and you should either modify your lifecycle settings or use a different
       * vault. Recovery points already saved in the vault prior to Vault Lock are not affected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html#cfn-backup-backupvault-lockconfigurationtype-maxretentiondays)
       */
      override fun maxRetentionDays(): Number? = unwrap(this).getMaxRetentionDays()

      /**
       * The AWS Backup Vault Lock configuration that specifies the minimum retention period that
       * the vault retains its recovery points.
       *
       * This setting can be useful if, for example, your organization's policies require you to
       * retain certain data for at least seven years (2555 days).
       *
       * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
       *
       * If this parameter is specified, any backup or copy job to the vault must have a lifecycle
       * policy with a retention period equal to or longer than the minimum retention period. If the
       * job's retention period is shorter than that minimum retention period, then the vault fails
       * that backup or copy job, and you should either modify your lifecycle settings or use a
       * different vault. Recovery points already saved in the vault prior to Vault Lock are not
       * affected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html#cfn-backup-backupvault-lockconfigurationtype-minretentiondays)
       */
      override fun minRetentionDays(): Number = unwrap(this).getMinRetentionDays()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LockConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty):
          LockConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LockConfigurationTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
