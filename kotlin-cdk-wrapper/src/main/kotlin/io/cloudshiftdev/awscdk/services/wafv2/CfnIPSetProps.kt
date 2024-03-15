@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPSetProps {
  public fun addresses(): List<String>

  public fun description(): String? = unwrap(this).getDescription()

  public fun ipAddressVersion(): String

  public fun name(): String? = unwrap(this).getName()

  public fun scope(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun addresses(addresses: List<String>)

    public fun addresses(vararg addresses: String)

    public fun description(description: String)

    public fun ipAddressVersion(ipAddressVersion: String)

    public fun name(name: String)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnIPSetProps.builder()

    override fun addresses(addresses: List<String>) {
      cdkBuilder.addresses(addresses)
    }

    override fun addresses(vararg addresses: String): Unit = addresses(addresses.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipAddressVersion(ipAddressVersion: String) {
      cdkBuilder.ipAddressVersion(ipAddressVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wafv2.CfnIPSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    override fun addresses(): List<String> = unwrap(this).getAddresses()

    override fun description(): String? = unwrap(this).getDescription()

    override fun ipAddressVersion(): String = unwrap(this).getIpAddressVersion()

    override fun name(): String? = unwrap(this).getName()

    override fun scope(): String = unwrap(this).getScope()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSetProps): CfnIPSetProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPSetProps): software.amazon.awscdk.services.wafv2.CfnIPSetProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnIPSetProps
  }
}
