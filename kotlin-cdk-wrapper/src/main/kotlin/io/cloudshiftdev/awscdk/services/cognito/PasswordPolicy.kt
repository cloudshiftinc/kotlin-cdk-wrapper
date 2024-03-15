@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface PasswordPolicy {
  public fun minLength(): Number? = unwrap(this).getMinLength()

  public fun requireDigits(): Boolean? = unwrap(this).getRequireDigits()

  public fun requireLowercase(): Boolean? = unwrap(this).getRequireLowercase()

  public fun requireSymbols(): Boolean? = unwrap(this).getRequireSymbols()

  public fun requireUppercase(): Boolean? = unwrap(this).getRequireUppercase()

  public fun tempPasswordValidity(): Duration? =
      unwrap(this).getTempPasswordValidity()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun minLength(minLength: Number)

    public fun requireDigits(requireDigits: Boolean)

    public fun requireLowercase(requireLowercase: Boolean)

    public fun requireSymbols(requireSymbols: Boolean)

    public fun requireUppercase(requireUppercase: Boolean)

    public fun tempPasswordValidity(tempPasswordValidity: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.PasswordPolicy.Builder =
        software.amazon.awscdk.services.cognito.PasswordPolicy.builder()

    override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    override fun requireDigits(requireDigits: Boolean) {
      cdkBuilder.requireDigits(requireDigits)
    }

    override fun requireLowercase(requireLowercase: Boolean) {
      cdkBuilder.requireLowercase(requireLowercase)
    }

    override fun requireSymbols(requireSymbols: Boolean) {
      cdkBuilder.requireSymbols(requireSymbols)
    }

    override fun requireUppercase(requireUppercase: Boolean) {
      cdkBuilder.requireUppercase(requireUppercase)
    }

    override fun tempPasswordValidity(tempPasswordValidity: Duration) {
      cdkBuilder.tempPasswordValidity(tempPasswordValidity.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.PasswordPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.PasswordPolicy,
  ) : CdkObject(cdkObject), PasswordPolicy {
    override fun minLength(): Number? = unwrap(this).getMinLength()

    override fun requireDigits(): Boolean? = unwrap(this).getRequireDigits()

    override fun requireLowercase(): Boolean? = unwrap(this).getRequireLowercase()

    override fun requireSymbols(): Boolean? = unwrap(this).getRequireSymbols()

    override fun requireUppercase(): Boolean? = unwrap(this).getRequireUppercase()

    override fun tempPasswordValidity(): Duration? =
        unwrap(this).getTempPasswordValidity()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PasswordPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.PasswordPolicy):
        PasswordPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PasswordPolicy):
        software.amazon.awscdk.services.cognito.PasswordPolicy = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.PasswordPolicy
  }
}
