@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrafficDistributionGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceArn(): String

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps.Builder =
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps,
  ) : CdkObject(cdkObject), CfnTrafficDistributionGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficDistributionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps):
        CfnTrafficDistributionGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficDistributionGroupProps):
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps
  }
}
