@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPrincipalPermissionsProps {
  public fun catalog(): String? = unwrap(this).getCatalog()

  public fun permissions(): List<String>

  public fun permissionsWithGrantOption(): List<String>

  public fun principal(): Any

  public fun resource(): Any

  @CdkDslMarker
  public interface Builder {
    public fun catalog(catalog: String)

    public fun permissions(permissions: List<String>)

    public fun permissions(vararg permissions: String)

    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>)

    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String)

    public fun principal(principal: IResolvable)

    public fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de0007850ae99f716679bc6b480df1bbc86f3dfdd41ef634cd4d93d29bfad61")
    public
        fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder.() -> Unit)

    public fun resource(resource: IResolvable)

    public fun resource(resource: CfnPrincipalPermissions.ResourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("208e6895ae69550da7d3de0401c3035667c7aaeeb3feaff03ac7e60b0ddc162a")
    public fun resource(resource: CfnPrincipalPermissions.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps.builder()

    override fun catalog(catalog: String) {
      cdkBuilder.catalog(catalog)
    }

    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    override fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String): Unit =
        permissionsWithGrantOption(permissionsWithGrantOption.toList())

    override fun principal(principal: IResolvable) {
      cdkBuilder.principal(principal.let(IResolvable::unwrap))
    }

    override fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty) {
      cdkBuilder.principal(principal.let(CfnPrincipalPermissions.DataLakePrincipalProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de0007850ae99f716679bc6b480df1bbc86f3dfdd41ef634cd4d93d29bfad61")
    override
        fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder.() -> Unit):
        Unit = principal(CfnPrincipalPermissions.DataLakePrincipalProperty(principal))

    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    override fun resource(resource: CfnPrincipalPermissions.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnPrincipalPermissions.ResourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("208e6895ae69550da7d3de0401c3035667c7aaeeb3feaff03ac7e60b0ddc162a")
    override fun resource(resource: CfnPrincipalPermissions.ResourceProperty.Builder.() -> Unit):
        Unit = resource(CfnPrincipalPermissions.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps,
  ) : CdkObject(cdkObject), CfnPrincipalPermissionsProps {
    override fun catalog(): String? = unwrap(this).getCatalog()

    override fun permissions(): List<String> = unwrap(this).getPermissions()

    override fun permissionsWithGrantOption(): List<String> =
        unwrap(this).getPermissionsWithGrantOption()

    override fun principal(): Any = unwrap(this).getPrincipal()

    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrincipalPermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps):
        CfnPrincipalPermissionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrincipalPermissionsProps):
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps
  }
}
