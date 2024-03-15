@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ram

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceShareProps {
  public fun allowExternalPrincipals(): Any? = unwrap(this).getAllowExternalPrincipals()

  public fun name(): String

  public fun permissionArns(): List<String> = unwrap(this).getPermissionArns() ?: emptyList()

  public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  public fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  public fun sources(): List<String> = unwrap(this).getSources() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allowExternalPrincipals(allowExternalPrincipals: Boolean)

    public fun allowExternalPrincipals(allowExternalPrincipals: IResolvable)

    public fun name(name: String)

    public fun permissionArns(permissionArns: List<String>)

    public fun permissionArns(vararg permissionArns: String)

    public fun principals(principals: List<String>)

    public fun principals(vararg principals: String)

    public fun resourceArns(resourceArns: List<String>)

    public fun resourceArns(vararg resourceArns: String)

    public fun sources(sources: List<String>)

    public fun sources(vararg sources: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder =
        software.amazon.awscdk.services.ram.CfnResourceShareProps.builder()

    override fun allowExternalPrincipals(allowExternalPrincipals: Boolean) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    override fun allowExternalPrincipals(allowExternalPrincipals: IResolvable) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionArns(permissionArns: List<String>) {
      cdkBuilder.permissionArns(permissionArns)
    }

    override fun permissionArns(vararg permissionArns: String): Unit =
        permissionArns(permissionArns.toList())

    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    override fun sources(sources: List<String>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: String): Unit = sources(sources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnResourceShareProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ram.CfnResourceShareProps,
  ) : CdkObject(cdkObject), CfnResourceShareProps {
    override fun allowExternalPrincipals(): Any? = unwrap(this).getAllowExternalPrincipals()

    override fun name(): String = unwrap(this).getName()

    override fun permissionArns(): List<String> = unwrap(this).getPermissionArns() ?: emptyList()

    override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    override fun sources(): List<String> = unwrap(this).getSources() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceShareProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnResourceShareProps):
        CfnResourceShareProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceShareProps):
        software.amazon.awscdk.services.ram.CfnResourceShareProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ram.CfnResourceShareProps
  }
}
