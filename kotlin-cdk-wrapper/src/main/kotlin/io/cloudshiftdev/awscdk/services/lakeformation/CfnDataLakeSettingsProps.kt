@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDataLakeSettingsProps {
  public fun admins(): Any? = unwrap(this).getAdmins()

  public fun allowExternalDataFiltering(): Any? = unwrap(this).getAllowExternalDataFiltering()

  public fun allowFullTableExternalDataAccess(): Any? =
      unwrap(this).getAllowFullTableExternalDataAccess()

  public fun authorizedSessionTagValueList(): List<String> =
      unwrap(this).getAuthorizedSessionTagValueList() ?: emptyList()

  public fun createDatabaseDefaultPermissions(): Any? =
      unwrap(this).getCreateDatabaseDefaultPermissions()

  public fun createTableDefaultPermissions(): Any? = unwrap(this).getCreateTableDefaultPermissions()

  public fun externalDataFilteringAllowList(): Any? =
      unwrap(this).getExternalDataFilteringAllowList()

  public fun mutationType(): String? = unwrap(this).getMutationType()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun trustedResourceOwners(): List<String> = unwrap(this).getTrustedResourceOwners() ?:
      emptyList()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps.builder()

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

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps,
  ) : CdkObject(cdkObject), CfnDataLakeSettingsProps {
    override fun admins(): Any? = unwrap(this).getAdmins()

    override fun allowExternalDataFiltering(): Any? = unwrap(this).getAllowExternalDataFiltering()

    override fun allowFullTableExternalDataAccess(): Any? =
        unwrap(this).getAllowFullTableExternalDataAccess()

    override fun authorizedSessionTagValueList(): List<String> =
        unwrap(this).getAuthorizedSessionTagValueList() ?: emptyList()

    override fun createDatabaseDefaultPermissions(): Any? =
        unwrap(this).getCreateDatabaseDefaultPermissions()

    override fun createTableDefaultPermissions(): Any? =
        unwrap(this).getCreateTableDefaultPermissions()

    override fun externalDataFilteringAllowList(): Any? =
        unwrap(this).getExternalDataFilteringAllowList()

    override fun mutationType(): String? = unwrap(this).getMutationType()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun trustedResourceOwners(): List<String> = unwrap(this).getTrustedResourceOwners() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataLakeSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps):
        CfnDataLakeSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataLakeSettingsProps):
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
  }
}
