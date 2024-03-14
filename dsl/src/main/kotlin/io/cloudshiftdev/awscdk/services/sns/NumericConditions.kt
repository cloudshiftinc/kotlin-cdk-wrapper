package io.cloudshiftdev.awscdk.services.sns

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface NumericConditions {
  public fun allowlist(): List<Number> = unwrap(this).getAllowlist() ?: emptyList()

  public fun between(): BetweenCondition? = unwrap(this).getBetween()?.let(BetweenCondition::wrap)

  public fun betweenStrict(): BetweenCondition? =
      unwrap(this).getBetweenStrict()?.let(BetweenCondition::wrap)

  public fun greaterThan(): Number? = unwrap(this).getGreaterThan()

  public fun greaterThanOrEqualTo(): Number? = unwrap(this).getGreaterThanOrEqualTo()

  public fun lessThan(): Number? = unwrap(this).getLessThan()

  public fun lessThanOrEqualTo(): Number? = unwrap(this).getLessThanOrEqualTo()

  public interface Builder {
    public fun allowlist(allowlist: List<Number>)

    public fun allowlist(vararg allowlist: Number)

    public fun between(between: BetweenCondition)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe0d739ad4be376b353187031412a8eaba232c7b7eefa4e0ee5659afdefbbe9e")
    public fun between(between: BetweenCondition.Builder.() -> Unit)

    public fun betweenStrict(betweenStrict: BetweenCondition)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5471faa44ced93d9d25314ee7aa32f5c18a1df22b120a213ecc2e842f875f214")
    public fun betweenStrict(betweenStrict: BetweenCondition.Builder.() -> Unit)

    public fun greaterThan(greaterThan: Number)

    public fun greaterThanOrEqualTo(greaterThanOrEqualTo: Number)

    public fun lessThan(lessThan: Number)

    public fun lessThanOrEqualTo(lessThanOrEqualTo: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.NumericConditions.Builder =
        software.amazon.awscdk.services.sns.NumericConditions.builder()

    override fun allowlist(allowlist: List<Number>) {
      cdkBuilder.allowlist(allowlist)
    }

    override fun allowlist(vararg allowlist: Number): Unit = allowlist(allowlist.toList())

    override fun between(between: BetweenCondition) {
      cdkBuilder.between(between.let(BetweenCondition::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe0d739ad4be376b353187031412a8eaba232c7b7eefa4e0ee5659afdefbbe9e")
    override fun between(between: BetweenCondition.Builder.() -> Unit): Unit =
        between(BetweenCondition(between))

    override fun betweenStrict(betweenStrict: BetweenCondition) {
      cdkBuilder.betweenStrict(betweenStrict.let(BetweenCondition::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5471faa44ced93d9d25314ee7aa32f5c18a1df22b120a213ecc2e842f875f214")
    override fun betweenStrict(betweenStrict: BetweenCondition.Builder.() -> Unit): Unit =
        betweenStrict(BetweenCondition(betweenStrict))

    override fun greaterThan(greaterThan: Number) {
      cdkBuilder.greaterThan(greaterThan)
    }

    override fun greaterThanOrEqualTo(greaterThanOrEqualTo: Number) {
      cdkBuilder.greaterThanOrEqualTo(greaterThanOrEqualTo)
    }

    override fun lessThan(lessThan: Number) {
      cdkBuilder.lessThan(lessThan)
    }

    override fun lessThanOrEqualTo(lessThanOrEqualTo: Number) {
      cdkBuilder.lessThanOrEqualTo(lessThanOrEqualTo)
    }

    public fun build(): software.amazon.awscdk.services.sns.NumericConditions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.NumericConditions,
  ) : NumericConditions {
    override fun allowlist(): List<Number> = unwrap(this).getAllowlist() ?: emptyList()

    override fun between(): BetweenCondition? =
        unwrap(this).getBetween()?.let(BetweenCondition::wrap)

    override fun betweenStrict(): BetweenCondition? =
        unwrap(this).getBetweenStrict()?.let(BetweenCondition::wrap)

    override fun greaterThan(): Number? = unwrap(this).getGreaterThan()

    override fun greaterThanOrEqualTo(): Number? = unwrap(this).getGreaterThanOrEqualTo()

    override fun lessThan(): Number? = unwrap(this).getLessThan()

    override fun lessThanOrEqualTo(): Number? = unwrap(this).getLessThanOrEqualTo()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NumericConditions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.NumericConditions):
        NumericConditions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumericConditions):
        software.amazon.awscdk.services.sns.NumericConditions = (wrapped as Wrapper).cdkObject
  }
}
