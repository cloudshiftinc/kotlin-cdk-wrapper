@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface UserPoolDomainProps : UserPoolDomainOptions {
  public fun userPool(): IUserPool

  @CdkDslMarker
  public interface Builder {
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e7891c358bdcd153323443516ebc1ce5c93e417d97bdc86e306547a7308e24")
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit)

    public fun customDomain(customDomain: CustomDomainOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dea3e603365ec92e799e55d9c0c7220dc06e3cf4f9e6ccfdf2fcb5c27805d7dc")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomainProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomainProps.builder()

    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
      cdkBuilder.cognitoDomain(cognitoDomain.let(CognitoDomainOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e7891c358bdcd153323443516ebc1ce5c93e417d97bdc86e306547a7308e24")
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit): Unit =
        cognitoDomain(CognitoDomainOptions(cognitoDomain))

    override fun customDomain(customDomain: CustomDomainOptions) {
      cdkBuilder.customDomain(customDomain.let(CustomDomainOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dea3e603365ec92e799e55d9c0c7220dc06e3cf4f9e6ccfdf2fcb5c27805d7dc")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainProps,
  ) : CdkObject(cdkObject), UserPoolDomainProps {
    override fun cognitoDomain(): CognitoDomainOptions? =
        unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

    override fun customDomain(): CustomDomainOptions? =
        unwrap(this).getCustomDomain()?.let(CustomDomainOptions::wrap)

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainProps):
        UserPoolDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolDomainProps):
        software.amazon.awscdk.services.cognito.UserPoolDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolDomainProps
  }
}
