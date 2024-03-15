@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConnectionProps {
  public fun connectionName(): String

  public fun hostArn(): String? = unwrap(this).getHostArn()

  public fun providerType(): String? = unwrap(this).getProviderType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun connectionName(connectionName: String)

    public fun hostArn(hostArn: String)

    public fun providerType(providerType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps.builder()

    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    override fun hostArn(hostArn: String) {
      cdkBuilder.hostArn(hostArn)
    }

    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codestarconnections.CfnConnectionProps,
  ) : CdkObject(cdkObject), CfnConnectionProps {
    override fun connectionName(): String = unwrap(this).getConnectionName()

    override fun hostArn(): String? = unwrap(this).getHostArn()

    override fun providerType(): String? = unwrap(this).getProviderType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnConnectionProps):
        CfnConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
  }
}
