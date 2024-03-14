package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ExecuteFileOptions {
  /**
   * The arguments to be passed to the file.
   *
   * Default: No arguments are passed to the file.
   */
  public fun arguments(): String? = unwrap(this).getArguments()

  /**
   * The path to the file.
   */
  public fun filePath(): String

  /**
   * A builder for [ExecuteFileOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arguments The arguments to be passed to the file.
     */
    public fun arguments(arguments: String)

    /**
     * @param filePath The path to the file. 
     */
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ExecuteFileOptions.Builder =
        software.amazon.awscdk.services.ec2.ExecuteFileOptions.builder()

    /**
     * @param arguments The arguments to be passed to the file.
     */
    override fun arguments(arguments: String) {
      cdkBuilder.arguments(arguments)
    }

    /**
     * @param filePath The path to the file. 
     */
    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ExecuteFileOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ExecuteFileOptions,
  ) : CdkObject(cdkObject), ExecuteFileOptions {
    /**
     * The arguments to be passed to the file.
     *
     * Default: No arguments are passed to the file.
     */
    override fun arguments(): String? = unwrap(this).getArguments()

    /**
     * The path to the file.
     */
    override fun filePath(): String = unwrap(this).getFilePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteFileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ExecuteFileOptions):
        ExecuteFileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExecuteFileOptions):
        software.amazon.awscdk.services.ec2.ExecuteFileOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.ExecuteFileOptions
  }
}