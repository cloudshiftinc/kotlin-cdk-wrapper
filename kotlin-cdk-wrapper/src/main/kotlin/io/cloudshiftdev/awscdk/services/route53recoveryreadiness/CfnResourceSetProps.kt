@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceSetProps {
  public fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  public fun resourceSetType(): String

  public fun resources(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun resourceSetName(resourceSetName: String)

    public fun resourceSetType(resourceSetType: String)

    public fun resources(resources: IResolvable)

    public fun resources(resources: List<Any>)

    public fun resources(vararg resources: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps.builder()

    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    override fun resourceSetType(resourceSetType: String) {
      cdkBuilder.resourceSetType(resourceSetType)
    }

    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps,
  ) : CdkObject(cdkObject), CfnResourceSetProps {
    override fun resourceSetName(): String? = unwrap(this).getResourceSetName()

    override fun resourceSetType(): String = unwrap(this).getResourceSetType()

    override fun resources(): Any = unwrap(this).getResources()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps):
        CfnResourceSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSetProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
  }
}
