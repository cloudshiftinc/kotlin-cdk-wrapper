package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface AddHeaderActionConfig {
  public fun headerName(): String

  public fun headerValue(): String

  public interface Builder {
    public fun headerName(headerName: String)

    public fun headerValue(headerValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.AddHeaderActionConfig.Builder =
        software.amazon.awscdk.services.ses.AddHeaderActionConfig.builder()

    override fun headerName(headerName: String) {
      cdkBuilder.headerName(headerName)
    }

    override fun headerValue(headerValue: String) {
      cdkBuilder.headerValue(headerValue)
    }

    public fun build(): software.amazon.awscdk.services.ses.AddHeaderActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.AddHeaderActionConfig,
  ) : AddHeaderActionConfig {
    override fun headerName(): String = unwrap(this).getHeaderName()

    override fun headerValue(): String = unwrap(this).getHeaderValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.AddHeaderActionConfig):
        AddHeaderActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddHeaderActionConfig):
        software.amazon.awscdk.services.ses.AddHeaderActionConfig = (wrapped as Wrapper).cdkObject
  }
}
