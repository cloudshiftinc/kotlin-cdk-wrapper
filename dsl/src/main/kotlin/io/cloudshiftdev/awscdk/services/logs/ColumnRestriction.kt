package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ColumnRestriction {
  /**
   * Comparison operator to use.
   */
  public fun comparison(): String

  /**
   * Number value to compare to.
   *
   * Exactly one of 'stringValue' and 'numberValue' must be set.
   */
  public fun numberValue(): Number? = unwrap(this).getNumberValue()

  /**
   * String value to compare to.
   *
   * Exactly one of 'stringValue' and 'numberValue' must be set.
   */
  public fun stringValue(): String? = unwrap(this).getStringValue()

  /**
   * A builder for [ColumnRestriction]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comparison Comparison operator to use. 
     */
    public fun comparison(comparison: String)

    /**
     * @param numberValue Number value to compare to.
     * Exactly one of 'stringValue' and 'numberValue' must be set.
     */
    public fun numberValue(numberValue: Number)

    /**
     * @param stringValue String value to compare to.
     * Exactly one of 'stringValue' and 'numberValue' must be set.
     */
    public fun stringValue(stringValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ColumnRestriction.Builder =
        software.amazon.awscdk.services.logs.ColumnRestriction.builder()

    /**
     * @param comparison Comparison operator to use. 
     */
    override fun comparison(comparison: String) {
      cdkBuilder.comparison(comparison)
    }

    /**
     * @param numberValue Number value to compare to.
     * Exactly one of 'stringValue' and 'numberValue' must be set.
     */
    override fun numberValue(numberValue: Number) {
      cdkBuilder.numberValue(numberValue)
    }

    /**
     * @param stringValue String value to compare to.
     * Exactly one of 'stringValue' and 'numberValue' must be set.
     */
    override fun stringValue(stringValue: String) {
      cdkBuilder.stringValue(stringValue)
    }

    public fun build(): software.amazon.awscdk.services.logs.ColumnRestriction = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.ColumnRestriction,
  ) : CdkObject(cdkObject), ColumnRestriction {
    /**
     * Comparison operator to use.
     */
    override fun comparison(): String = unwrap(this).getComparison()

    /**
     * Number value to compare to.
     *
     * Exactly one of 'stringValue' and 'numberValue' must be set.
     */
    override fun numberValue(): Number? = unwrap(this).getNumberValue()

    /**
     * String value to compare to.
     *
     * Exactly one of 'stringValue' and 'numberValue' must be set.
     */
    override fun stringValue(): String? = unwrap(this).getStringValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ColumnRestriction {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ColumnRestriction):
        ColumnRestriction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ColumnRestriction):
        software.amazon.awscdk.services.logs.ColumnRestriction = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.ColumnRestriction
  }
}
