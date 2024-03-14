package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface NumberAttributeConstraints {
  /**
   * Maximum value of this attribute.
   *
   * Default: - no maximum value
   */
  public fun max(): Number? = unwrap(this).getMax()

  /**
   * Minimum value of this attribute.
   *
   * Default: - no minimum value
   */
  public fun min(): Number? = unwrap(this).getMin()

  /**
   * A builder for [NumberAttributeConstraints]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param max Maximum value of this attribute.
     */
    public fun max(max: Number)

    /**
     * @param min Minimum value of this attribute.
     */
    public fun min(min: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.Builder =
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.builder()

    /**
     * @param max Maximum value of this attribute.
     */
    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    /**
     * @param min Minimum value of this attribute.
     */
    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttributeConstraints =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints,
  ) : NumberAttributeConstraints {
    /**
     * Maximum value of this attribute.
     *
     * Default: - no maximum value
     */
    override fun max(): Number? = unwrap(this).getMax()

    /**
     * Minimum value of this attribute.
     *
     * Default: - no minimum value
     */
    override fun min(): Number? = unwrap(this).getMin()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttributeConstraints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints):
        NumberAttributeConstraints = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumberAttributeConstraints):
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints = (wrapped as
        Wrapper).cdkObject
  }
}
