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

public interface CfnPermissionsProps {
  public fun dataLakePrincipal(): Any

  public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  public fun permissionsWithGrantOption(): List<String> =
      unwrap(this).getPermissionsWithGrantOption() ?: emptyList()

  public fun resource(): Any

  @CdkDslMarker
  public interface Builder {
    public fun dataLakePrincipal(dataLakePrincipal: IResolvable)

    public fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f8856ba34bd002f5d6dccea2e5741252ca023dad6e6bb1527a99948a5d7ea9")
    public
        fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty.Builder.() -> Unit)

    public fun permissions(permissions: List<String>)

    public fun permissions(vararg permissions: String)

    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>)

    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String)

    public fun resource(resource: IResolvable)

    public fun resource(resource: CfnPermissions.ResourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7081d32c97e383618c1b8abd8c4109155007e47ca72a313141859e4b37ee870f")
    public fun resource(resource: CfnPermissions.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnPermissionsProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPermissionsProps.builder()

    override fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(IResolvable::unwrap))
    }

    override fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(CfnPermissions.DataLakePrincipalProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f8856ba34bd002f5d6dccea2e5741252ca023dad6e6bb1527a99948a5d7ea9")
    override
        fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty.Builder.() -> Unit):
        Unit = dataLakePrincipal(CfnPermissions.DataLakePrincipalProperty(dataLakePrincipal))

    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    override fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String): Unit =
        permissionsWithGrantOption(permissionsWithGrantOption.toList())

    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    override fun resource(resource: CfnPermissions.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnPermissions.ResourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7081d32c97e383618c1b8abd8c4109155007e47ca72a313141859e4b37ee870f")
    override fun resource(resource: CfnPermissions.ResourceProperty.Builder.() -> Unit): Unit =
        resource(CfnPermissions.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissionsProps,
  ) : CdkObject(cdkObject), CfnPermissionsProps {
    override fun dataLakePrincipal(): Any = unwrap(this).getDataLakePrincipal()

    override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    override fun permissionsWithGrantOption(): List<String> =
        unwrap(this).getPermissionsWithGrantOption() ?: emptyList()

    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissionsProps):
        CfnPermissionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionsProps):
        software.amazon.awscdk.services.lakeformation.CfnPermissionsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnPermissionsProps
  }
}
