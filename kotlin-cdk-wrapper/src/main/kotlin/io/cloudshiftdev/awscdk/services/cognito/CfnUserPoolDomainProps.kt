@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnUserPoolDomainProps {
  public fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

  public fun domain(): String

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun customDomainConfig(customDomainConfig: IResolvable)

    public
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a20ddda83ad93e68e63ad9936a60c77549c4db60df9a6d4ad582a0ede4ad1d")
    public
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit)

    public fun domain(domain: String)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps.builder()

    override fun customDomainConfig(customDomainConfig: IResolvable) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(IResolvable::unwrap))
    }

    override
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty) {
      cdkBuilder.customDomainConfig(customDomainConfig.let(CfnUserPoolDomain.CustomDomainConfigTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a20ddda83ad93e68e63ad9936a60c77549c4db60df9a6d4ad582a0ede4ad1d")
    override
        fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder.() -> Unit):
        Unit =
        customDomainConfig(CfnUserPoolDomain.CustomDomainConfigTypeProperty(customDomainConfig))

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps,
  ) : CdkObject(cdkObject), CfnUserPoolDomainProps {
    override fun customDomainConfig(): Any? = unwrap(this).getCustomDomainConfig()

    override fun domain(): String = unwrap(this).getDomain()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps):
        CfnUserPoolDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolDomainProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
  }
}
