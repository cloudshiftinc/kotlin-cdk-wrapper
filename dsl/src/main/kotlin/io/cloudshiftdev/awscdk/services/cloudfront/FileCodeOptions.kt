package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.Unit

public interface FileCodeOptions {
  public fun filePath(): String

  public interface Builder {
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FileCodeOptions.Builder =
        software.amazon.awscdk.services.cloudfront.FileCodeOptions.builder()

    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FileCodeOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.FileCodeOptions,
  ) : FileCodeOptions {
    override fun filePath(): String = unwrap(this).getFilePath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileCodeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FileCodeOptions):
        FileCodeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileCodeOptions):
        software.amazon.awscdk.services.cloudfront.FileCodeOptions = (wrapped as Wrapper).cdkObject
  }
}
