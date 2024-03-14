package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataLakeSettings internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings,
) : CfnResource(cdkObject), IInspectable {
  public open fun admins(): Any? = unwrap(this).getAdmins()

  public open fun admins(`value`: IResolvable) {
    unwrap(this).setAdmins(`value`.let(IResolvable::unwrap))
  }

  public open fun admins(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdmins(__idx_ac66f0)
  }

  public open fun admins(vararg __idx_ac66f0: Any): Unit = admins(__idx_ac66f0.toList())

  public open fun allowExternalDataFiltering(): Any? = unwrap(this).getAllowExternalDataFiltering()

  public open fun allowExternalDataFiltering(`value`: Boolean) {
    unwrap(this).setAllowExternalDataFiltering(`value`)
  }

  public open fun allowExternalDataFiltering(`value`: IResolvable) {
    unwrap(this).setAllowExternalDataFiltering(`value`.let(IResolvable::unwrap))
  }

  public open fun allowFullTableExternalDataAccess(): Any? =
      unwrap(this).getAllowFullTableExternalDataAccess()

  public open fun allowFullTableExternalDataAccess(`value`: Boolean) {
    unwrap(this).setAllowFullTableExternalDataAccess(`value`)
  }

  public open fun allowFullTableExternalDataAccess(`value`: IResolvable) {
    unwrap(this).setAllowFullTableExternalDataAccess(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authorizedSessionTagValueList(): List<String> =
      unwrap(this).getAuthorizedSessionTagValueList() ?: emptyList()

  public open fun authorizedSessionTagValueList(`value`: List<String>) {
    unwrap(this).setAuthorizedSessionTagValueList(`value`)
  }

  public open fun authorizedSessionTagValueList(vararg `value`: String): Unit =
      authorizedSessionTagValueList(`value`.toList())

  public open fun createDatabaseDefaultPermissions(): Any? =
      unwrap(this).getCreateDatabaseDefaultPermissions()

  public open fun createDatabaseDefaultPermissions(`value`: IResolvable) {
    unwrap(this).setCreateDatabaseDefaultPermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun createDatabaseDefaultPermissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setCreateDatabaseDefaultPermissions(__idx_ac66f0)
  }

  public open fun createDatabaseDefaultPermissions(vararg __idx_ac66f0: Any): Unit =
      createDatabaseDefaultPermissions(__idx_ac66f0.toList())

  public open fun createTableDefaultPermissions(): Any? =
      unwrap(this).getCreateTableDefaultPermissions()

  public open fun createTableDefaultPermissions(`value`: IResolvable) {
    unwrap(this).setCreateTableDefaultPermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun createTableDefaultPermissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setCreateTableDefaultPermissions(__idx_ac66f0)
  }

  public open fun createTableDefaultPermissions(vararg __idx_ac66f0: Any): Unit =
      createTableDefaultPermissions(__idx_ac66f0.toList())

  public open fun externalDataFilteringAllowList(): Any? =
      unwrap(this).getExternalDataFilteringAllowList()

  public open fun externalDataFilteringAllowList(`value`: IResolvable) {
    unwrap(this).setExternalDataFilteringAllowList(`value`.let(IResolvable::unwrap))
  }

  public open fun externalDataFilteringAllowList(__idx_ac66f0: List<Any>) {
    unwrap(this).setExternalDataFilteringAllowList(__idx_ac66f0)
  }

  public open fun externalDataFilteringAllowList(vararg __idx_ac66f0: Any): Unit =
      externalDataFilteringAllowList(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mutationType(): String? = unwrap(this).getMutationType()

  public open fun mutationType(`value`: String) {
    unwrap(this).setMutationType(`value`)
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  public open fun trustedResourceOwners(): List<String> = unwrap(this).getTrustedResourceOwners() ?:
      emptyList()

  public open fun trustedResourceOwners(`value`: List<String>) {
    unwrap(this).setTrustedResourceOwners(`value`)
  }

  public open fun trustedResourceOwners(vararg `value`: String): Unit =
      trustedResourceOwners(`value`.toList())

  public interface Builder {
    public fun admins(admins: IResolvable)

    public fun admins(admins: List<Any>)

    public fun admins(vararg admins: Any)

    public fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean)

    public fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable)

    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean)

    public fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable)

    public fun authorizedSessionTagValueList(authorizedSessionTagValueList: List<String>)

    public fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String)

    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable)

    public fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: List<Any>)

    public fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any)

    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable)

    public fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>)

    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any)

    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable)

    public fun externalDataFilteringAllowList(externalDataFilteringAllowList: List<Any>)

    public fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any)

    public fun mutationType(mutationType: String)

    public fun parameters(parameters: Any)

    public fun trustedResourceOwners(trustedResourceOwners: List<String>)

    public fun trustedResourceOwners(vararg trustedResourceOwners: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.Builder =
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.Builder.create(scope, id)

    override fun admins(admins: IResolvable) {
      cdkBuilder.admins(admins.let(IResolvable::unwrap))
    }

    override fun admins(admins: List<Any>) {
      cdkBuilder.admins(admins)
    }

    override fun admins(vararg admins: Any): Unit = admins(admins.toList())

    override fun allowExternalDataFiltering(allowExternalDataFiltering: Boolean) {
      cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering)
    }

    override fun allowExternalDataFiltering(allowExternalDataFiltering: IResolvable) {
      cdkBuilder.allowExternalDataFiltering(allowExternalDataFiltering.let(IResolvable::unwrap))
    }

    override fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: Boolean) {
      cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess)
    }

    override fun allowFullTableExternalDataAccess(allowFullTableExternalDataAccess: IResolvable) {
      cdkBuilder.allowFullTableExternalDataAccess(allowFullTableExternalDataAccess.let(IResolvable::unwrap))
    }

    override fun authorizedSessionTagValueList(authorizedSessionTagValueList: List<String>) {
      cdkBuilder.authorizedSessionTagValueList(authorizedSessionTagValueList)
    }

    override fun authorizedSessionTagValueList(vararg authorizedSessionTagValueList: String): Unit =
        authorizedSessionTagValueList(authorizedSessionTagValueList.toList())

    override fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: IResolvable) {
      cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.let(IResolvable::unwrap))
    }

    override fun createDatabaseDefaultPermissions(createDatabaseDefaultPermissions: List<Any>) {
      cdkBuilder.createDatabaseDefaultPermissions(createDatabaseDefaultPermissions)
    }

    override fun createDatabaseDefaultPermissions(vararg createDatabaseDefaultPermissions: Any):
        Unit = createDatabaseDefaultPermissions(createDatabaseDefaultPermissions.toList())

    override fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
      cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.let(IResolvable::unwrap))
    }

    override fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
      cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
    }

    override fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any): Unit =
        createTableDefaultPermissions(createTableDefaultPermissions.toList())

    override fun externalDataFilteringAllowList(externalDataFilteringAllowList: IResolvable) {
      cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList.let(IResolvable::unwrap))
    }

    override fun externalDataFilteringAllowList(externalDataFilteringAllowList: List<Any>) {
      cdkBuilder.externalDataFilteringAllowList(externalDataFilteringAllowList)
    }

    override fun externalDataFilteringAllowList(vararg externalDataFilteringAllowList: Any): Unit =
        externalDataFilteringAllowList(externalDataFilteringAllowList.toList())

    override fun mutationType(mutationType: String) {
      cdkBuilder.mutationType(mutationType)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun trustedResourceOwners(trustedResourceOwners: List<String>) {
      cdkBuilder.trustedResourceOwners(trustedResourceOwners)
    }

    override fun trustedResourceOwners(vararg trustedResourceOwners: String): Unit =
        trustedResourceOwners(trustedResourceOwners.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataLakeSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataLakeSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings):
        CfnDataLakeSettings = CfnDataLakeSettings(cdkObject)

    internal fun unwrap(wrapped: CfnDataLakeSettings):
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings = wrapped.cdkObject
  }

  public interface PrincipalPermissionsProperty {
    public fun permissions(): List<String>

    public fun principal(): Any

    public interface Builder {
      public fun permissions(permissions: List<String>)

      public fun permissions(vararg permissions: String)

      public fun principal(principal: IResolvable)

      public fun principal(principal: DataLakePrincipalProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222db79a76a46d52f0df1a9d6b10094f0536f5fc5b6e298e00d0109b2bab14cf")
      public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty.builder()

      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      override fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal.let(IResolvable::unwrap))
      }

      override fun principal(principal: DataLakePrincipalProperty) {
        cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222db79a76a46d52f0df1a9d6b10094f0536f5fc5b6e298e00d0109b2bab14cf")
      override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
          principal(DataLakePrincipalProperty(principal))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty,
    ) : PrincipalPermissionsProperty {
      override fun permissions(): List<String> = unwrap(this).getPermissions()

      override fun principal(): Any = unwrap(this).getPrincipal()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrincipalPermissionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty):
          PrincipalPermissionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrincipalPermissionsProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.PrincipalPermissionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataLakePrincipalProperty {
    public fun dataLakePrincipalIdentifier(): String

    public interface Builder {
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty.builder()

      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty,
    ) : DataLakePrincipalProperty {
      override fun dataLakePrincipalIdentifier(): String =
          unwrap(this).getDataLakePrincipalIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataLakePrincipalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty):
          DataLakePrincipalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
