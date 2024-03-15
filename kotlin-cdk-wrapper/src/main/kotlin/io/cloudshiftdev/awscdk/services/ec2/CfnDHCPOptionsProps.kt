@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDHCPOptionsProps {
  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun domainNameServers(): List<String> = unwrap(this).getDomainNameServers() ?: emptyList()

  public fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
      emptyList()

  public fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

  public fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun domainNameServers(domainNameServers: List<String>)

    public fun domainNameServers(vararg domainNameServers: String)

    public fun netbiosNameServers(netbiosNameServers: List<String>)

    public fun netbiosNameServers(vararg netbiosNameServers: String)

    public fun netbiosNodeType(netbiosNodeType: Number)

    public fun ntpServers(ntpServers: List<String>)

    public fun ntpServers(vararg ntpServers: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps.Builder =
        software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainNameServers(domainNameServers: List<String>) {
      cdkBuilder.domainNameServers(domainNameServers)
    }

    override fun domainNameServers(vararg domainNameServers: String): Unit =
        domainNameServers(domainNameServers.toList())

    override fun netbiosNameServers(netbiosNameServers: List<String>) {
      cdkBuilder.netbiosNameServers(netbiosNameServers)
    }

    override fun netbiosNameServers(vararg netbiosNameServers: String): Unit =
        netbiosNameServers(netbiosNameServers.toList())

    override fun netbiosNodeType(netbiosNodeType: Number) {
      cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    override fun ntpServers(ntpServers: List<String>) {
      cdkBuilder.ntpServers(ntpServers)
    }

    override fun ntpServers(vararg ntpServers: String): Unit = ntpServers(ntpServers.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps,
  ) : CdkObject(cdkObject), CfnDHCPOptionsProps {
    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun domainNameServers(): List<String> = unwrap(this).getDomainNameServers() ?:
        emptyList()

    override fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
        emptyList()

    override fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

    override fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDHCPOptionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps):
        CfnDHCPOptionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDHCPOptionsProps):
        software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
  }
}
