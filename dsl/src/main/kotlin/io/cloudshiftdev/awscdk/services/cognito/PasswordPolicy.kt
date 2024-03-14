package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
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

  public interface Builder {
    public fun minLength(minLength: Number) {
    }

    public fun requireDigits(requireDigits: Boolean) {
    }

    public fun requireLowercase(requireLowercase: Boolean) {
    }

    public fun requireSymbols(requireSymbols: Boolean) {
    }

    public fun requireUppercase(requireUppercase: Boolean) {
    }

    public fun tempPasswordValidity(tempPasswordValidity: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.PasswordPolicy.Builder =
        software.amazon.awscdk.services.cognito.PasswordPolicy.builder()

    public override fun minLength(minLength: Number) {
      cdkBuilder.minLength(minLength)
    }

    public override fun requireDigits(requireDigits: Boolean) {
      cdkBuilder.requireDigits(requireDigits)
    }

    public override fun requireLowercase(requireLowercase: Boolean) {
      cdkBuilder.requireLowercase(requireLowercase)
    }

    public override fun requireSymbols(requireSymbols: Boolean) {
      cdkBuilder.requireSymbols(requireSymbols)
    }

    public override fun requireUppercase(requireUppercase: Boolean) {
      cdkBuilder.requireUppercase(requireUppercase)
    }

    public override fun tempPasswordValidity(tempPasswordValidity: Duration) {
      cdkBuilder.tempPasswordValidity(tempPasswordValidity.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.PasswordPolicy = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.PasswordPolicy,
  ) : PasswordPolicy {
    public override fun minLength(): Number? = unwrap(this).getMinLength()

    public override fun requireDigits(): Boolean? = unwrap(this).getRequireDigits()

    public override fun requireLowercase(): Boolean? = unwrap(this).getRequireLowercase()

    public override fun requireSymbols(): Boolean? = unwrap(this).getRequireSymbols()

    public override fun requireUppercase(): Boolean? = unwrap(this).getRequireUppercase()

    public override fun tempPasswordValidity(): Duration? =
        unwrap(this).getTempPasswordValidity()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PasswordPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.PasswordPolicy):
        PasswordPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PasswordPolicy):
        software.amazon.awscdk.services.cognito.PasswordPolicy = (wrapped as Wrapper).cdkObject
  }
}
