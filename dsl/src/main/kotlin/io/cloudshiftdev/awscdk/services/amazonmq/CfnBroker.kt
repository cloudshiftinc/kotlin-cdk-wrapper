package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBroker internal constructor(
  private val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAmqpEndpoints(): List<String> = unwrap(this).getAttrAmqpEndpoints() ?:
      emptyList()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrConfigurationId(): String = unwrap(this).getAttrConfigurationId()

  public open fun attrConfigurationRevision(): Number = unwrap(this).getAttrConfigurationRevision()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrIpAddresses(): List<String> = unwrap(this).getAttrIpAddresses() ?: emptyList()

  public open fun attrMqttEndpoints(): List<String> = unwrap(this).getAttrMqttEndpoints() ?:
      emptyList()

  public open fun attrOpenWireEndpoints(): List<String> = unwrap(this).getAttrOpenWireEndpoints() ?:
      emptyList()

  public open fun attrStompEndpoints(): List<String> = unwrap(this).getAttrStompEndpoints() ?:
      emptyList()

  public open fun attrWssEndpoints(): List<String> = unwrap(this).getAttrWssEndpoints() ?:
      emptyList()

  public open fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  public open fun authenticationStrategy(`value`: String) {
    unwrap(this).setAuthenticationStrategy(`value`)
  }

  public open fun autoMinorVersionUpgrade(): Any = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun brokerName(): String = unwrap(this).getBrokerName()

  public open fun brokerName(`value`: String) {
    unwrap(this).setBrokerName(`value`)
  }

  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: ConfigurationIdProperty) {
    unwrap(this).setConfiguration(`value`.let(ConfigurationIdProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95ab61e63aa788252f5ea1259bd75515dc74f2818b183efaeafb6a340be9374b")
  public open fun configuration(`value`: ConfigurationIdProperty.Builder.() -> Unit): Unit =
      configuration(ConfigurationIdProperty(`value`))

  public open fun dataReplicationMode(): String? = unwrap(this).getDataReplicationMode()

  public open fun dataReplicationMode(`value`: String) {
    unwrap(this).setDataReplicationMode(`value`)
  }

  public open fun dataReplicationPrimaryBrokerArn(): String? =
      unwrap(this).getDataReplicationPrimaryBrokerArn()

  public open fun dataReplicationPrimaryBrokerArn(`value`: String) {
    unwrap(this).setDataReplicationPrimaryBrokerArn(`value`)
  }

  public open fun deploymentMode(): String = unwrap(this).getDeploymentMode()

  public open fun deploymentMode(`value`: String) {
    unwrap(this).setDeploymentMode(`value`)
  }

  public open fun encryptionOptions(): Any? = unwrap(this).getEncryptionOptions()

  public open fun encryptionOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionOptions(`value`: EncryptionOptionsProperty) {
    unwrap(this).setEncryptionOptions(`value`.let(EncryptionOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0f4f3c6e10f215be5303a65c912a5dddbac0af898de03b9257293dc357452c14")
  public open fun encryptionOptions(`value`: EncryptionOptionsProperty.Builder.() -> Unit): Unit =
      encryptionOptions(EncryptionOptionsProperty(`value`))

  public open fun engineType(): String = unwrap(this).getEngineType()

  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  public open fun engineVersion(): String = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun hostInstanceType(): String = unwrap(this).getHostInstanceType()

  public open fun hostInstanceType(`value`: String) {
    unwrap(this).setHostInstanceType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ldapServerMetadata(): Any? = unwrap(this).getLdapServerMetadata()

  public open fun ldapServerMetadata(`value`: IResolvable) {
    unwrap(this).setLdapServerMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun ldapServerMetadata(`value`: LdapServerMetadataProperty) {
    unwrap(this).setLdapServerMetadata(`value`.let(LdapServerMetadataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b90d1a5e7e8c67854a133d01185cf2729b0ccb1bc750960f2c39769256560f4c")
  public open fun ldapServerMetadata(`value`: LdapServerMetadataProperty.Builder.() -> Unit): Unit =
      ldapServerMetadata(LdapServerMetadataProperty(`value`))

  public open fun logs(): Any? = unwrap(this).getLogs()

  public open fun logs(`value`: IResolvable) {
    unwrap(this).setLogs(`value`.let(IResolvable::unwrap))
  }

  public open fun logs(`value`: LogListProperty) {
    unwrap(this).setLogs(`value`.let(LogListProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbc9ee5548c2cae1e112fbfef91291ede2c30687d82637d71e8e6ea4ebe67c0f")
  public open fun logs(`value`: LogListProperty.Builder.() -> Unit): Unit =
      logs(LogListProperty(`value`))

  public open fun maintenanceWindowStartTime(): Any? = unwrap(this).getMaintenanceWindowStartTime()

  public open fun maintenanceWindowStartTime(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindowStartTime(`value`.let(IResolvable::unwrap))
  }

  public open fun maintenanceWindowStartTime(`value`: MaintenanceWindowProperty) {
    unwrap(this).setMaintenanceWindowStartTime(`value`.let(MaintenanceWindowProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10082861b49fcb46b80da6dbfe49cf8ce46398ab8cbc5bc3f6bd2a15b75c5a6f")
  public open fun maintenanceWindowStartTime(`value`: MaintenanceWindowProperty.Builder.() -> Unit):
      Unit = maintenanceWindowStartTime(MaintenanceWindowProperty(`value`))

  public open fun publiclyAccessible(): Any = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun storageType(): String? = unwrap(this).getStorageType()

  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  public open fun users(): Any = unwrap(this).getUsers()

  public open fun users(`value`: IResolvable) {
    unwrap(this).setUsers(`value`.let(IResolvable::unwrap))
  }

  public open fun users(__idx_ac66f0: List<Any>) {
    unwrap(this).setUsers(__idx_ac66f0)
  }

  public interface Builder {
    public fun authenticationStrategy(authenticationStrategy: String) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    }

    public fun brokerName(brokerName: String) {
    }

    public fun configuration(configuration: IResolvable) {
    }

    public fun configuration(configuration: ConfigurationIdProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9934c043a276b6709f5df61ad8956b4a997d673a5084d85433779600a5e4360")
    public fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit) {
    }

    public fun dataReplicationMode(dataReplicationMode: String) {
    }

    public fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String) {
    }

    public fun deploymentMode(deploymentMode: String) {
    }

    public fun encryptionOptions(encryptionOptions: IResolvable) {
    }

    public fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fe168ca245b68292bfdf48ec00a367af07255b6f406ed3296fa43c1a3547da")
    public fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty.Builder.() -> Unit) {
    }

    public fun engineType(engineType: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun hostInstanceType(hostInstanceType: String) {
    }

    public fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
    }

    public fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d49dc3540c98e0160a80f08fb28165514a9e96f98b851cadb657f7d784c7ecfd")
    public
        fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty.Builder.() -> Unit) {
    }

    public fun logs(logs: IResolvable) {
    }

    public fun logs(logs: LogListProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c46ecfc3b2482edc22ff6cd2af903a75fe8815c2089bb6ed4e59dd3de838727")
    public fun logs(logs: LogListProperty.Builder.() -> Unit) {
    }

    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
    }

    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e364ba9d656fb70437fef551cc2a021ac7724c333fae215ce78db727d7215")
    public
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty.Builder.() -> Unit) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    }

    public fun securityGroups(securityGroups: List<String>) {
    }

    public fun storageType(storageType: String) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun tags(tags: List<TagsEntryProperty>) {
    }

    public fun users(users: IResolvable) {
    }

    public fun users(users: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnBroker.Builder =
        software.amazon.awscdk.services.amazonmq.CfnBroker.Builder.create(scope, id)

    public override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    public override fun brokerName(brokerName: String) {
      cdkBuilder.brokerName(brokerName)
    }

    public override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    public override fun configuration(configuration: ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(ConfigurationIdProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9934c043a276b6709f5df61ad8956b4a997d673a5084d85433779600a5e4360")
    public override fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit):
        Unit = configuration(ConfigurationIdProperty(configuration))

    public override fun dataReplicationMode(dataReplicationMode: String) {
      cdkBuilder.dataReplicationMode(dataReplicationMode)
    }

    public override fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String) {
      cdkBuilder.dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn)
    }

    public override fun deploymentMode(deploymentMode: String) {
      cdkBuilder.deploymentMode(deploymentMode)
    }

    public override fun encryptionOptions(encryptionOptions: IResolvable) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(IResolvable::unwrap))
    }

    public override fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(EncryptionOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fe168ca245b68292bfdf48ec00a367af07255b6f406ed3296fa43c1a3547da")
    public override
        fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty.Builder.() -> Unit): Unit
        = encryptionOptions(EncryptionOptionsProperty(encryptionOptions))

    public override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun hostInstanceType(hostInstanceType: String) {
      cdkBuilder.hostInstanceType(hostInstanceType)
    }

    public override fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(IResolvable::unwrap))
    }

    public override fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(LdapServerMetadataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d49dc3540c98e0160a80f08fb28165514a9e96f98b851cadb657f7d784c7ecfd")
    public override
        fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty.Builder.() -> Unit):
        Unit = ldapServerMetadata(LdapServerMetadataProperty(ldapServerMetadata))

    public override fun logs(logs: IResolvable) {
      cdkBuilder.logs(logs.let(IResolvable::unwrap))
    }

    public override fun logs(logs: LogListProperty) {
      cdkBuilder.logs(logs.let(LogListProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c46ecfc3b2482edc22ff6cd2af903a75fe8815c2089bb6ed4e59dd3de838727")
    public override fun logs(logs: LogListProperty.Builder.() -> Unit): Unit =
        logs(LogListProperty(logs))

    public override fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(IResolvable::unwrap))
    }

    public override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(MaintenanceWindowProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e364ba9d656fb70437fef551cc2a021ac7724c333fae215ce78db727d7215")
    public override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindowStartTime(MaintenanceWindowProperty(maintenanceWindowStartTime))

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    public override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    public override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public override fun users(users: IResolvable) {
      cdkBuilder.users(users.let(IResolvable::unwrap))
    }

    public override fun users(users: List<Any>) {
      cdkBuilder.users(users)
    }

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBroker {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBroker(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker): CfnBroker =
        CfnBroker(cdkObject)

    internal fun unwrap(wrapped: CfnBroker): software.amazon.awscdk.services.amazonmq.CfnBroker =
        wrapped.cdkObject
  }

  public interface LdapServerMetadataProperty {
    public fun hosts(): List<String>

    public fun roleBase(): String

    public fun roleName(): String? = unwrap(this).getRoleName()

    public fun roleSearchMatching(): String

    public fun roleSearchSubtree(): Any? = unwrap(this).getRoleSearchSubtree()

    public fun serviceAccountPassword(): String

    public fun serviceAccountUsername(): String

    public fun userBase(): String

    public fun userRoleName(): String? = unwrap(this).getUserRoleName()

    public fun userSearchMatching(): String

    public fun userSearchSubtree(): Any? = unwrap(this).getUserSearchSubtree()

    public interface Builder {
      public fun hosts(hosts: List<String>) {
      }

      public fun roleBase(roleBase: String) {
      }

      public fun roleName(roleName: String) {
      }

      public fun roleSearchMatching(roleSearchMatching: String) {
      }

      public fun roleSearchSubtree(roleSearchSubtree: Boolean) {
      }

      public fun roleSearchSubtree(roleSearchSubtree: IResolvable) {
      }

      public fun serviceAccountPassword(serviceAccountPassword: String) {
      }

      public fun serviceAccountUsername(serviceAccountUsername: String) {
      }

      public fun userBase(userBase: String) {
      }

      public fun userRoleName(userRoleName: String) {
      }

      public fun userSearchMatching(userSearchMatching: String) {
      }

      public fun userSearchSubtree(userSearchSubtree: Boolean) {
      }

      public fun userSearchSubtree(userSearchSubtree: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty.builder()

      public override fun hosts(hosts: List<String>) {
        cdkBuilder.hosts(hosts)
      }

      public override fun roleBase(roleBase: String) {
        cdkBuilder.roleBase(roleBase)
      }

      public override fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
      }

      public override fun roleSearchMatching(roleSearchMatching: String) {
        cdkBuilder.roleSearchMatching(roleSearchMatching)
      }

      public override fun roleSearchSubtree(roleSearchSubtree: Boolean) {
        cdkBuilder.roleSearchSubtree(roleSearchSubtree)
      }

      public override fun roleSearchSubtree(roleSearchSubtree: IResolvable) {
        cdkBuilder.roleSearchSubtree(roleSearchSubtree.let(IResolvable::unwrap))
      }

      public override fun serviceAccountPassword(serviceAccountPassword: String) {
        cdkBuilder.serviceAccountPassword(serviceAccountPassword)
      }

      public override fun serviceAccountUsername(serviceAccountUsername: String) {
        cdkBuilder.serviceAccountUsername(serviceAccountUsername)
      }

      public override fun userBase(userBase: String) {
        cdkBuilder.userBase(userBase)
      }

      public override fun userRoleName(userRoleName: String) {
        cdkBuilder.userRoleName(userRoleName)
      }

      public override fun userSearchMatching(userSearchMatching: String) {
        cdkBuilder.userSearchMatching(userSearchMatching)
      }

      public override fun userSearchSubtree(userSearchSubtree: Boolean) {
        cdkBuilder.userSearchSubtree(userSearchSubtree)
      }

      public override fun userSearchSubtree(userSearchSubtree: IResolvable) {
        cdkBuilder.userSearchSubtree(userSearchSubtree.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty,
    ) : LdapServerMetadataProperty {
      public override fun hosts(): List<String> = unwrap(this).getHosts() ?: emptyList()

      public override fun roleBase(): String = unwrap(this).getRoleBase()

      public override fun roleName(): String? = unwrap(this).getRoleName()

      public override fun roleSearchMatching(): String = unwrap(this).getRoleSearchMatching()

      public override fun roleSearchSubtree(): Any? = unwrap(this).getRoleSearchSubtree()

      public override fun serviceAccountPassword(): String =
          unwrap(this).getServiceAccountPassword()

      public override fun serviceAccountUsername(): String =
          unwrap(this).getServiceAccountUsername()

      public override fun userBase(): String = unwrap(this).getUserBase()

      public override fun userRoleName(): String? = unwrap(this).getUserRoleName()

      public override fun userSearchMatching(): String = unwrap(this).getUserSearchMatching()

      public override fun userSearchSubtree(): Any? = unwrap(this).getUserSearchSubtree()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LdapServerMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty):
          LdapServerMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LdapServerMetadataProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TagsEntryProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty,
    ) : TagsEntryProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UserProperty {
    public fun consoleAccess(): Any? = unwrap(this).getConsoleAccess()

    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    public fun password(): String

    public fun replicationUser(): Any? = unwrap(this).getReplicationUser()

    public fun username(): String

    public interface Builder {
      public fun consoleAccess(consoleAccess: Boolean) {
      }

      public fun consoleAccess(consoleAccess: IResolvable) {
      }

      public fun groups(groups: List<String>) {
      }

      public fun password(password: String) {
      }

      public fun replicationUser(replicationUser: Boolean) {
      }

      public fun replicationUser(replicationUser: IResolvable) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.builder()

      public override fun consoleAccess(consoleAccess: Boolean) {
        cdkBuilder.consoleAccess(consoleAccess)
      }

      public override fun consoleAccess(consoleAccess: IResolvable) {
        cdkBuilder.consoleAccess(consoleAccess.let(IResolvable::unwrap))
      }

      public override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun replicationUser(replicationUser: Boolean) {
        cdkBuilder.replicationUser(replicationUser)
      }

      public override fun replicationUser(replicationUser: IResolvable) {
        cdkBuilder.replicationUser(replicationUser.let(IResolvable::unwrap))
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty,
    ) : UserProperty {
      public override fun consoleAccess(): Any? = unwrap(this).getConsoleAccess()

      public override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      public override fun password(): String = unwrap(this).getPassword()

      public override fun replicationUser(): Any? = unwrap(this).getReplicationUser()

      public override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty):
          UserProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionOptionsProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun useAwsOwnedKey(): Any

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun useAwsOwnedKey(useAwsOwnedKey: Boolean) {
      }

      public fun useAwsOwnedKey(useAwsOwnedKey: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun useAwsOwnedKey(useAwsOwnedKey: Boolean) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey)
      }

      public override fun useAwsOwnedKey(useAwsOwnedKey: IResolvable) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty,
    ) : EncryptionOptionsProperty {
      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun useAwsOwnedKey(): Any = unwrap(this).getUseAwsOwnedKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty):
          EncryptionOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionOptionsProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogListProperty {
    public fun audit(): Any? = unwrap(this).getAudit()

    public fun general(): Any? = unwrap(this).getGeneral()

    public interface Builder {
      public fun audit(audit: Boolean) {
      }

      public fun audit(audit: IResolvable) {
      }

      public fun general(general: Boolean) {
      }

      public fun general(general: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.builder()

      public override fun audit(audit: Boolean) {
        cdkBuilder.audit(audit)
      }

      public override fun audit(audit: IResolvable) {
        cdkBuilder.audit(audit.let(IResolvable::unwrap))
      }

      public override fun general(general: Boolean) {
        cdkBuilder.general(general)
      }

      public override fun general(general: IResolvable) {
        cdkBuilder.general(general.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty,
    ) : LogListProperty {
      public override fun audit(): Any? = unwrap(this).getAudit()

      public override fun general(): Any? = unwrap(this).getGeneral()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty):
          LogListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogListProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MaintenanceWindowProperty {
    public fun dayOfWeek(): String

    public fun timeOfDay(): String

    public fun timeZone(): String

    public interface Builder {
      public fun dayOfWeek(dayOfWeek: String) {
      }

      public fun timeOfDay(timeOfDay: String) {
      }

      public fun timeZone(timeZone: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.builder()

      public override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public override fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
      }

      public override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty,
    ) : MaintenanceWindowProperty {
      public override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()

      public override fun timeOfDay(): String = unwrap(this).getTimeOfDay()

      public override fun timeZone(): String = unwrap(this).getTimeZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty):
          MaintenanceWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConfigurationIdProperty {
    public fun id(): String

    public fun revision(): Number

    public interface Builder {
      public fun id(id: String) {
      }

      public fun revision(revision: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.builder()

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty,
    ) : ConfigurationIdProperty {
      public override fun id(): String = unwrap(this).getId()

      public override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty):
          ConfigurationIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationIdProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
