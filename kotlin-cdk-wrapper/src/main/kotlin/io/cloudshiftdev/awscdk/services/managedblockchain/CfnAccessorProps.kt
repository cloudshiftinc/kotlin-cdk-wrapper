@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAccessorProps {
  public fun accessorType(): String

  public fun networkType(): String? = unwrap(this).getNetworkType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessorType(accessorType: String)

    public fun networkType(networkType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.managedblockchain.CfnAccessorProps.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnAccessorProps.builder()

    override fun accessorType(accessorType: String) {
      cdkBuilder.accessorType(accessorType)
    }

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnAccessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessorProps,
  ) : CdkObject(cdkObject), CfnAccessorProps {
    override fun accessorType(): String = unwrap(this).getAccessorType()

    override fun networkType(): String? = unwrap(this).getNetworkType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessorProps):
        CfnAccessorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessorProps):
        software.amazon.awscdk.services.managedblockchain.CfnAccessorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.managedblockchain.CfnAccessorProps
  }
}
