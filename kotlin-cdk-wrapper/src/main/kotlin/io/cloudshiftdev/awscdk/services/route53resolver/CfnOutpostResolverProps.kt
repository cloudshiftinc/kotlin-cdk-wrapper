@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnOutpostResolverProps {
  public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

  public fun name(): String

  public fun outpostArn(): String

  public fun preferredInstanceType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun instanceCount(instanceCount: Number)

    public fun name(name: String)

    public fun outpostArn(outpostArn: String)

    public fun preferredInstanceType(preferredInstanceType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps.builder()

    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps,
  ) : CdkObject(cdkObject), CfnOutpostResolverProps {
    override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    override fun name(): String = unwrap(this).getName()

    override fun outpostArn(): String = unwrap(this).getOutpostArn()

    override fun preferredInstanceType(): String = unwrap(this).getPreferredInstanceType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOutpostResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps):
        CfnOutpostResolverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOutpostResolverProps):
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps
  }
}
