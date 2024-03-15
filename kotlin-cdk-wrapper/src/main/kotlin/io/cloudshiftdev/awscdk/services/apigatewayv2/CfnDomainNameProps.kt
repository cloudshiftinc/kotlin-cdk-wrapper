@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnDomainNameProps {
  public fun domainName(): String

  public fun domainNameConfigurations(): Any? = unwrap(this).getDomainNameConfigurations()

  public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun domainNameConfigurations(domainNameConfigurations: IResolvable)

    public fun domainNameConfigurations(domainNameConfigurations: List<Any>)

    public fun domainNameConfigurations(vararg domainNameConfigurations: Any)

    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9de18601ca103990b55c4ed58b3e33ace137b414a1c7353deead4a8b7c010bc0")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations.let(IResolvable::unwrap))
    }

    override fun domainNameConfigurations(domainNameConfigurations: List<Any>) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations)
    }

    override fun domainNameConfigurations(vararg domainNameConfigurations: Any): Unit =
        domainNameConfigurations(domainNameConfigurations.toList())

    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(CfnDomainName.MutualTlsAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9de18601ca103990b55c4ed58b3e33ace137b414a1c7353deead4a8b7c010bc0")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit =
        mutualTlsAuthentication(CfnDomainName.MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps,
  ) : CdkObject(cdkObject), CfnDomainNameProps {
    override fun domainName(): String = unwrap(this).getDomainName()

    override fun domainNameConfigurations(): Any? = unwrap(this).getDomainNameConfigurations()

    override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps):
        CfnDomainNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameProps):
        software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
  }
}
