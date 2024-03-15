@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCodeSigningConfigProps {
  public fun allowedPublishers(): Any

  public fun codeSigningPolicies(): Any? = unwrap(this).getCodeSigningPolicies()

  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun allowedPublishers(allowedPublishers: IResolvable)

    public fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7f1db813d05358885ef0302df434985d9ad461af6e278401a18997373901505")
    public
        fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty.Builder.() -> Unit)

    public fun codeSigningPolicies(codeSigningPolicies: IResolvable)

    public
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f3501c9047c847cd43d9f53eace8c4e59b90fd6fffd1b1a3912796a63d689ff")
    public
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder.() -> Unit)

    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps.Builder
        = software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps.builder()

    override fun allowedPublishers(allowedPublishers: IResolvable) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(IResolvable::unwrap))
    }

    override
        fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(CfnCodeSigningConfig.AllowedPublishersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7f1db813d05358885ef0302df434985d9ad461af6e278401a18997373901505")
    override
        fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty.Builder.() -> Unit):
        Unit = allowedPublishers(CfnCodeSigningConfig.AllowedPublishersProperty(allowedPublishers))

    override fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(IResolvable::unwrap))
    }

    override
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(CfnCodeSigningConfig.CodeSigningPoliciesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f3501c9047c847cd43d9f53eace8c4e59b90fd6fffd1b1a3912796a63d689ff")
    override
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder.() -> Unit):
        Unit =
        codeSigningPolicies(CfnCodeSigningConfig.CodeSigningPoliciesProperty(codeSigningPolicies))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps,
  ) : CdkObject(cdkObject), CfnCodeSigningConfigProps {
    override fun allowedPublishers(): Any = unwrap(this).getAllowedPublishers()

    override fun codeSigningPolicies(): Any? = unwrap(this).getCodeSigningPolicies()

    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeSigningConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps):
        CfnCodeSigningConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeSigningConfigProps):
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps
  }
}
