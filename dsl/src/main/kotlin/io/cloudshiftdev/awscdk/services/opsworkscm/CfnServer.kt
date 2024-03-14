package io.cloudshiftdev.awscdk.services.opsworkscm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  public open fun associatePublicIpAddress(`value`: Boolean) {
    unwrap(this).setAssociatePublicIpAddress(`value`)
  }

  public open fun associatePublicIpAddress(`value`: IResolvable) {
    unwrap(this).setAssociatePublicIpAddress(`value`.let(IResolvable::unwrap))
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrServerName(): String = unwrap(this).getAttrServerName()

  public open fun backupId(): String? = unwrap(this).getBackupId()

  public open fun backupId(`value`: String) {
    unwrap(this).setBackupId(`value`)
  }

  public open fun backupRetentionCount(): Number? = unwrap(this).getBackupRetentionCount()

  public open fun backupRetentionCount(`value`: Number) {
    unwrap(this).setBackupRetentionCount(`value`)
  }

  public open fun customCertificate(): String? = unwrap(this).getCustomCertificate()

  public open fun customCertificate(`value`: String) {
    unwrap(this).setCustomCertificate(`value`)
  }

  public open fun customDomain(): String? = unwrap(this).getCustomDomain()

  public open fun customDomain(`value`: String) {
    unwrap(this).setCustomDomain(`value`)
  }

  public open fun customPrivateKey(): String? = unwrap(this).getCustomPrivateKey()

  public open fun customPrivateKey(`value`: String) {
    unwrap(this).setCustomPrivateKey(`value`)
  }

  public open fun disableAutomatedBackup(): Any? = unwrap(this).getDisableAutomatedBackup()

  public open fun disableAutomatedBackup(`value`: Boolean) {
    unwrap(this).setDisableAutomatedBackup(`value`)
  }

  public open fun disableAutomatedBackup(`value`: IResolvable) {
    unwrap(this).setDisableAutomatedBackup(`value`.let(IResolvable::unwrap))
  }

  public open fun engine(): String? = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun engineAttributes(): Any? = unwrap(this).getEngineAttributes()

  public open fun engineAttributes(`value`: IResolvable) {
    unwrap(this).setEngineAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun engineAttributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setEngineAttributes(__idx_ac66f0)
  }

  public open fun engineModel(): String? = unwrap(this).getEngineModel()

  public open fun engineModel(`value`: String) {
    unwrap(this).setEngineModel(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

  public open fun instanceProfileArn(`value`: String) {
    unwrap(this).setInstanceProfileArn(`value`)
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun keyPair(): String? = unwrap(this).getKeyPair()

  public open fun keyPair(`value`: String) {
    unwrap(this).setKeyPair(`value`)
  }

  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun serverName(): String? = unwrap(this).getServerName()

  public open fun serverName(`value`: String) {
    unwrap(this).setServerName(`value`)
  }

  public open fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    }

    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
    }

    public fun backupId(backupId: String) {
    }

    public fun backupRetentionCount(backupRetentionCount: Number) {
    }

    public fun customCertificate(customCertificate: String) {
    }

    public fun customDomain(customDomain: String) {
    }

    public fun customPrivateKey(customPrivateKey: String) {
    }

    public fun disableAutomatedBackup(disableAutomatedBackup: Boolean) {
    }

    public fun disableAutomatedBackup(disableAutomatedBackup: IResolvable) {
    }

    public fun engine(engine: String) {
    }

    public fun engineAttributes(engineAttributes: IResolvable) {
    }

    public fun engineAttributes(engineAttributes: List<Any>) {
    }

    public fun engineModel(engineModel: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun instanceProfileArn(instanceProfileArn: String) {
    }

    public fun instanceType(instanceType: String) {
    }

    public fun keyPair(keyPair: String) {
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun serverName(serverName: String) {
    }

    public fun serviceRoleArn(serviceRoleArn: String) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworkscm.CfnServer.Builder =
        software.amazon.awscdk.services.opsworkscm.CfnServer.Builder.create(scope, id)

    public override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

    public override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    public override fun backupRetentionCount(backupRetentionCount: Number) {
      cdkBuilder.backupRetentionCount(backupRetentionCount)
    }

    public override fun customCertificate(customCertificate: String) {
      cdkBuilder.customCertificate(customCertificate)
    }

    public override fun customDomain(customDomain: String) {
      cdkBuilder.customDomain(customDomain)
    }

    public override fun customPrivateKey(customPrivateKey: String) {
      cdkBuilder.customPrivateKey(customPrivateKey)
    }

    public override fun disableAutomatedBackup(disableAutomatedBackup: Boolean) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup)
    }

    public override fun disableAutomatedBackup(disableAutomatedBackup: IResolvable) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup.let(IResolvable::unwrap))
    }

    public override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    public override fun engineAttributes(engineAttributes: IResolvable) {
      cdkBuilder.engineAttributes(engineAttributes.let(IResolvable::unwrap))
    }

    public override fun engineAttributes(engineAttributes: List<Any>) {
      cdkBuilder.engineAttributes(engineAttributes)
    }

    public override fun engineModel(engineModel: String) {
      cdkBuilder.engineModel(engineModel)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    public override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    public override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    public override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    public override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opsworkscm.CfnServer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServer): CfnServer =
        CfnServer(cdkObject)

    internal fun unwrap(wrapped: CfnServer): software.amazon.awscdk.services.opsworkscm.CfnServer =
        wrapped.cdkObject
  }

  public interface EngineAttributeProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder =
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty,
    ) : EngineAttributeProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EngineAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty):
          EngineAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EngineAttributeProperty):
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
