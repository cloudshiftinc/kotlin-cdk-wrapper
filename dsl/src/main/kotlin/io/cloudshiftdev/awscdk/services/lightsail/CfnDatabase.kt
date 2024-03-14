package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatabase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabase,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDatabaseArn(): String = unwrap(this).getAttrDatabaseArn()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun backupRetention(): Any? = unwrap(this).getBackupRetention()

  public open fun backupRetention(`value`: Boolean) {
    unwrap(this).setBackupRetention(`value`)
  }

  public open fun backupRetention(`value`: IResolvable) {
    unwrap(this).setBackupRetention(`value`.let(IResolvable::unwrap))
  }

  public open fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  public open fun caCertificateIdentifier(`value`: String) {
    unwrap(this).setCaCertificateIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun masterDatabaseName(): String = unwrap(this).getMasterDatabaseName()

  public open fun masterDatabaseName(`value`: String) {
    unwrap(this).setMasterDatabaseName(`value`)
  }

  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  public open fun masterUsername(): String = unwrap(this).getMasterUsername()

  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
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

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun relationalDatabaseBlueprintId(): String =
      unwrap(this).getRelationalDatabaseBlueprintId()

  public open fun relationalDatabaseBlueprintId(`value`: String) {
    unwrap(this).setRelationalDatabaseBlueprintId(`value`)
  }

  public open fun relationalDatabaseBundleId(): String =
      unwrap(this).getRelationalDatabaseBundleId()

  public open fun relationalDatabaseBundleId(`value`: String) {
    unwrap(this).setRelationalDatabaseBundleId(`value`)
  }

  public open fun relationalDatabaseName(): String = unwrap(this).getRelationalDatabaseName()

  public open fun relationalDatabaseName(`value`: String) {
    unwrap(this).setRelationalDatabaseName(`value`)
  }

  public open fun relationalDatabaseParameters(): Any? =
      unwrap(this).getRelationalDatabaseParameters()

  public open fun relationalDatabaseParameters(`value`: IResolvable) {
    unwrap(this).setRelationalDatabaseParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun relationalDatabaseParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setRelationalDatabaseParameters(__idx_ac66f0)
  }

  public open fun rotateMasterUserPassword(): Any? = unwrap(this).getRotateMasterUserPassword()

  public open fun rotateMasterUserPassword(`value`: Boolean) {
    unwrap(this).setRotateMasterUserPassword(`value`)
  }

  public open fun rotateMasterUserPassword(`value`: IResolvable) {
    unwrap(this).setRotateMasterUserPassword(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun backupRetention(backupRetention: Boolean)

    public fun backupRetention(backupRetention: IResolvable)

    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    public fun masterDatabaseName(masterDatabaseName: String)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUsername(masterUsername: String)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String)

    public fun relationalDatabaseBundleId(relationalDatabaseBundleId: String)

    public fun relationalDatabaseName(relationalDatabaseName: String)

    public fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable)

    public fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>)

    public fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean)

    public fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDatabase.Builder =
        software.amazon.awscdk.services.lightsail.CfnDatabase.Builder.create(scope, id)

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun backupRetention(backupRetention: Boolean) {
      cdkBuilder.backupRetention(backupRetention)
    }

    override fun backupRetention(backupRetention: IResolvable) {
      cdkBuilder.backupRetention(backupRetention.let(IResolvable::unwrap))
    }

    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    override fun masterDatabaseName(masterDatabaseName: String) {
      cdkBuilder.masterDatabaseName(masterDatabaseName)
    }

    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String) {
      cdkBuilder.relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
    }

    override fun relationalDatabaseBundleId(relationalDatabaseBundleId: String) {
      cdkBuilder.relationalDatabaseBundleId(relationalDatabaseBundleId)
    }

    override fun relationalDatabaseName(relationalDatabaseName: String) {
      cdkBuilder.relationalDatabaseName(relationalDatabaseName)
    }

    override fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters.let(IResolvable::unwrap))
    }

    override fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters)
    }

    override fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
    }

    override fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDatabase = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatabase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatabase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabase): CfnDatabase
        = CfnDatabase(cdkObject)

    internal fun unwrap(wrapped: CfnDatabase): software.amazon.awscdk.services.lightsail.CfnDatabase
        = wrapped.cdkObject
  }

  public interface RelationalDatabaseParameterProperty {
    public fun allowedValues(): String? = unwrap(this).getAllowedValues()

    public fun applyMethod(): String? = unwrap(this).getApplyMethod()

    public fun applyType(): String? = unwrap(this).getApplyType()

    public fun dataType(): String? = unwrap(this).getDataType()

    public fun description(): String? = unwrap(this).getDescription()

    public fun isModifiable(): Any? = unwrap(this).getIsModifiable()

    public fun parameterName(): String? = unwrap(this).getParameterName()

    public fun parameterValue(): String? = unwrap(this).getParameterValue()

    public interface Builder {
      public fun allowedValues(allowedValues: String)

      public fun applyMethod(applyMethod: String)

      public fun applyType(applyType: String)

      public fun dataType(dataType: String)

      public fun description(description: String)

      public fun isModifiable(isModifiable: Boolean)

      public fun isModifiable(isModifiable: IResolvable)

      public fun parameterName(parameterName: String)

      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty.builder()

      override fun allowedValues(allowedValues: String) {
        cdkBuilder.allowedValues(allowedValues)
      }

      override fun applyMethod(applyMethod: String) {
        cdkBuilder.applyMethod(applyMethod)
      }

      override fun applyType(applyType: String) {
        cdkBuilder.applyType(applyType)
      }

      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun isModifiable(isModifiable: Boolean) {
        cdkBuilder.isModifiable(isModifiable)
      }

      override fun isModifiable(isModifiable: IResolvable) {
        cdkBuilder.isModifiable(isModifiable.let(IResolvable::unwrap))
      }

      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty,
    ) : RelationalDatabaseParameterProperty {
      override fun allowedValues(): String? = unwrap(this).getAllowedValues()

      override fun applyMethod(): String? = unwrap(this).getApplyMethod()

      override fun applyType(): String? = unwrap(this).getApplyType()

      override fun dataType(): String? = unwrap(this).getDataType()

      override fun description(): String? = unwrap(this).getDescription()

      override fun isModifiable(): Any? = unwrap(this).getIsModifiable()

      override fun parameterName(): String? = unwrap(this).getParameterName()

      override fun parameterValue(): String? = unwrap(this).getParameterValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RelationalDatabaseParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty):
          RelationalDatabaseParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalDatabaseParameterProperty):
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
