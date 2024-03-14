package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface Dimension {
  /**
   * Name of the dimension.
   */
  public fun name(): String

  /**
   * Value of the dimension.
   */
  public fun `value`(): Any

  /**
   * A builder for [Dimension]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of the dimension. 
     */
    public fun name(name: String)

    /**
     * @param value Value of the dimension. 
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Dimension.Builder =
        software.amazon.awscdk.services.cloudwatch.Dimension.builder()

    /**
     * @param name Name of the dimension. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value Value of the dimension. 
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Dimension = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.Dimension,
  ) : CdkObject(cdkObject), Dimension {
    /**
     * Name of the dimension.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Value of the dimension.
     */
    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Dimension {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Dimension): Dimension =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Dimension): software.amazon.awscdk.services.cloudwatch.Dimension =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.Dimension
  }
}
