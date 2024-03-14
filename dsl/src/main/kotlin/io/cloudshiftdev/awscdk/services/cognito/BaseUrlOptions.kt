package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface BaseUrlOptions {
  /**
   * Whether to return the FIPS-compliant endpoint.
   *
   * Default: return the standard URL
   */
  public fun fips(): Boolean? = unwrap(this).getFips()

  /**
   * A builder for [BaseUrlOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fips Whether to return the FIPS-compliant endpoint.
     */
    public fun fips(fips: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.BaseUrlOptions.Builder =
        software.amazon.awscdk.services.cognito.BaseUrlOptions.builder()

    /**
     * @param fips Whether to return the FIPS-compliant endpoint.
     */
    override fun fips(fips: Boolean) {
      cdkBuilder.fips(fips)
    }

    public fun build(): software.amazon.awscdk.services.cognito.BaseUrlOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.BaseUrlOptions,
  ) : BaseUrlOptions {
    /**
     * Whether to return the FIPS-compliant endpoint.
     *
     * Default: return the standard URL
     */
    override fun fips(): Boolean? = unwrap(this).getFips()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.BaseUrlOptions):
        BaseUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseUrlOptions):
        software.amazon.awscdk.services.cognito.BaseUrlOptions = (wrapped as Wrapper).cdkObject
  }
}
