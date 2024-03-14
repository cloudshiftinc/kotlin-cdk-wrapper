package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface TransferAccelerationUrlOptions {
  /**
   * Dual-stack support to connect to the bucket over IPv6.
   *
   * Default: - false
   */
  public fun dualStack(): Boolean? = unwrap(this).getDualStack()

  /**
   * A builder for [TransferAccelerationUrlOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dualStack Dual-stack support to connect to the bucket over IPv6.
     */
    public fun dualStack(dualStack: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions.Builder =
        software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions.builder()

    /**
     * @param dualStack Dual-stack support to connect to the bucket over IPv6.
     */
    override fun dualStack(dualStack: Boolean) {
      cdkBuilder.dualStack(dualStack)
    }

    public fun build(): software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions,
  ) : CdkObject(cdkObject), TransferAccelerationUrlOptions {
    /**
     * Dual-stack support to connect to the bucket over IPv6.
     *
     * Default: - false
     */
    override fun dualStack(): Boolean? = unwrap(this).getDualStack()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TransferAccelerationUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions):
        TransferAccelerationUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransferAccelerationUrlOptions):
        software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions
  }
}
