@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPlacementGroupProps {
  public fun partitionCount(): Number? = unwrap(this).getPartitionCount()

  public fun spreadLevel(): String? = unwrap(this).getSpreadLevel()

  public fun strategy(): String? = unwrap(this).getStrategy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun partitionCount(partitionCount: Number)

    public fun spreadLevel(spreadLevel: String)

    public fun strategy(strategy: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPlacementGroupProps.Builder =
        software.amazon.awscdk.services.ec2.CfnPlacementGroupProps.builder()

    override fun partitionCount(partitionCount: Number) {
      cdkBuilder.partitionCount(partitionCount)
    }

    override fun spreadLevel(spreadLevel: String) {
      cdkBuilder.spreadLevel(spreadLevel)
    }

    override fun strategy(strategy: String) {
      cdkBuilder.strategy(strategy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPlacementGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroupProps,
  ) : CdkObject(cdkObject), CfnPlacementGroupProps {
    override fun partitionCount(): Number? = unwrap(this).getPartitionCount()

    override fun spreadLevel(): String? = unwrap(this).getSpreadLevel()

    override fun strategy(): String? = unwrap(this).getStrategy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlacementGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroupProps):
        CfnPlacementGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlacementGroupProps):
        software.amazon.awscdk.services.ec2.CfnPlacementGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnPlacementGroupProps
  }
}
