@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ram

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPermissionProps {
  public fun name(): String

  public fun policyTemplate(): Any

  public fun resourceType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun policyTemplate(policyTemplate: Any)

    public fun resourceType(resourceType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.ram.CfnPermissionProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policyTemplate(policyTemplate: Any) {
      cdkBuilder.policyTemplate(policyTemplate)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnPermissionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ram.CfnPermissionProps,
  ) : CdkObject(cdkObject), CfnPermissionProps {
    override fun name(): String = unwrap(this).getName()

    override fun policyTemplate(): Any = unwrap(this).getPolicyTemplate()

    override fun resourceType(): String = unwrap(this).getResourceType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnPermissionProps):
        CfnPermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.ram.CfnPermissionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ram.CfnPermissionProps
  }
}
