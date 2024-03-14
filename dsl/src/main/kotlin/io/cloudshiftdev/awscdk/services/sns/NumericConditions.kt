package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface NumericConditions {
  /**
   * Match one or more values.
   *
   * Default: - None
   */
  public fun allowlist(): List<Number> = unwrap(this).getAllowlist() ?: emptyList()

  /**
   * Match values that are between the specified values.
   *
   * Default: - None
   */
  public fun between(): BetweenCondition? = unwrap(this).getBetween()?.let(BetweenCondition::wrap)

  /**
   * Match values that are strictly between the specified values.
   *
   * Default: - None
   */
  public fun betweenStrict(): BetweenCondition? =
      unwrap(this).getBetweenStrict()?.let(BetweenCondition::wrap)

  /**
   * Match values that are greater than the specified value.
   *
   * Default: - None
   */
  public fun greaterThan(): Number? = unwrap(this).getGreaterThan()

  /**
   * Match values that are greater than or equal to the specified value.
   *
   * Default: - None
   */
  public fun greaterThanOrEqualTo(): Number? = unwrap(this).getGreaterThanOrEqualTo()

  /**
   * Match values that are less than the specified value.
   *
   * Default: - None
   */
  public fun lessThan(): Number? = unwrap(this).getLessThan()

  /**
   * Match values that are less than or equal to the specified value.
   *
   * Default: - None
   */
  public fun lessThanOrEqualTo(): Number? = unwrap(this).getLessThanOrEqualTo()

  /**
   * A builder for [NumericConditions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowlist Match one or more values.
     */
    public fun allowlist(allowlist: List<Number>)

    /**
     * @param allowlist Match one or more values.
     */
    public fun allowlist(vararg allowlist: Number)

    /**
     * @param between Match values that are between the specified values.
     */
    public fun between(between: BetweenCondition)

    /**
     * @param between Match values that are between the specified values.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe0d739ad4be376b353187031412a8eaba232c7b7eefa4e0ee5659afdefbbe9e")
    public fun between(between: BetweenCondition.Builder.() -> Unit)

    /**
     * @param betweenStrict Match values that are strictly between the specified values.
     */
    public fun betweenStrict(betweenStrict: BetweenCondition)

    /**
     * @param betweenStrict Match values that are strictly between the specified values.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5471faa44ced93d9d25314ee7aa32f5c18a1df22b120a213ecc2e842f875f214")
    public fun betweenStrict(betweenStrict: BetweenCondition.Builder.() -> Unit)

    /**
     * @param greaterThan Match values that are greater than the specified value.
     */
    public fun greaterThan(greaterThan: Number)

    /**
     * @param greaterThanOrEqualTo Match values that are greater than or equal to the specified
     * value.
     */
    public fun greaterThanOrEqualTo(greaterThanOrEqualTo: Number)

    /**
     * @param lessThan Match values that are less than the specified value.
     */
    public fun lessThan(lessThan: Number)

    /**
     * @param lessThanOrEqualTo Match values that are less than or equal to the specified value.
     */
    public fun lessThanOrEqualTo(lessThanOrEqualTo: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.NumericConditions.Builder =
        software.amazon.awscdk.services.sns.NumericConditions.builder()

    /**
     * @param allowlist Match one or more values.
     */
    override fun allowlist(allowlist: List<Number>) {
      cdkBuilder.allowlist(allowlist)
    }

    /**
     * @param allowlist Match one or more values.
     */
    override fun allowlist(vararg allowlist: Number): Unit = allowlist(allowlist.toList())

    /**
     * @param between Match values that are between the specified values.
     */
    override fun between(between: BetweenCondition) {
      cdkBuilder.between(between.let(BetweenCondition::unwrap))
    }

    /**
     * @param between Match values that are between the specified values.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe0d739ad4be376b353187031412a8eaba232c7b7eefa4e0ee5659afdefbbe9e")
    override fun between(between: BetweenCondition.Builder.() -> Unit): Unit =
        between(BetweenCondition(between))

    /**
     * @param betweenStrict Match values that are strictly between the specified values.
     */
    override fun betweenStrict(betweenStrict: BetweenCondition) {
      cdkBuilder.betweenStrict(betweenStrict.let(BetweenCondition::unwrap))
    }

    /**
     * @param betweenStrict Match values that are strictly between the specified values.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5471faa44ced93d9d25314ee7aa32f5c18a1df22b120a213ecc2e842f875f214")
    override fun betweenStrict(betweenStrict: BetweenCondition.Builder.() -> Unit): Unit =
        betweenStrict(BetweenCondition(betweenStrict))

    /**
     * @param greaterThan Match values that are greater than the specified value.
     */
    override fun greaterThan(greaterThan: Number) {
      cdkBuilder.greaterThan(greaterThan)
    }

    /**
     * @param greaterThanOrEqualTo Match values that are greater than or equal to the specified
     * value.
     */
    override fun greaterThanOrEqualTo(greaterThanOrEqualTo: Number) {
      cdkBuilder.greaterThanOrEqualTo(greaterThanOrEqualTo)
    }

    /**
     * @param lessThan Match values that are less than the specified value.
     */
    override fun lessThan(lessThan: Number) {
      cdkBuilder.lessThan(lessThan)
    }

    /**
     * @param lessThanOrEqualTo Match values that are less than or equal to the specified value.
     */
    override fun lessThanOrEqualTo(lessThanOrEqualTo: Number) {
      cdkBuilder.lessThanOrEqualTo(lessThanOrEqualTo)
    }

    public fun build(): software.amazon.awscdk.services.sns.NumericConditions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.NumericConditions,
  ) : NumericConditions {
    /**
     * Match one or more values.
     *
     * Default: - None
     */
    override fun allowlist(): List<Number> = unwrap(this).getAllowlist() ?: emptyList()

    /**
     * Match values that are between the specified values.
     *
     * Default: - None
     */
    override fun between(): BetweenCondition? =
        unwrap(this).getBetween()?.let(BetweenCondition::wrap)

    /**
     * Match values that are strictly between the specified values.
     *
     * Default: - None
     */
    override fun betweenStrict(): BetweenCondition? =
        unwrap(this).getBetweenStrict()?.let(BetweenCondition::wrap)

    /**
     * Match values that are greater than the specified value.
     *
     * Default: - None
     */
    override fun greaterThan(): Number? = unwrap(this).getGreaterThan()

    /**
     * Match values that are greater than or equal to the specified value.
     *
     * Default: - None
     */
    override fun greaterThanOrEqualTo(): Number? = unwrap(this).getGreaterThanOrEqualTo()

    /**
     * Match values that are less than the specified value.
     *
     * Default: - None
     */
    override fun lessThan(): Number? = unwrap(this).getLessThan()

    /**
     * Match values that are less than or equal to the specified value.
     *
     * Default: - None
     */
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
