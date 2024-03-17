@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options when reading the function's code from an external file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * FileCodeOptions fileCodeOptions = FileCodeOptions.builder()
 * .filePath("filePath")
 * .build();
 * ```
 */
public interface FileCodeOptions {
  /**
   * The path of the file to read the code from.
   */
  public fun filePath(): String

  /**
   * A builder for [FileCodeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filePath The path of the file to read the code from. 
     */
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FileCodeOptions.Builder =
        software.amazon.awscdk.services.cloudfront.FileCodeOptions.builder()

    /**
     * @param filePath The path of the file to read the code from. 
     */
    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FileCodeOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.FileCodeOptions,
  ) : CdkObject(cdkObject), FileCodeOptions {
    /**
     * The path of the file to read the code from.
     */
    override fun filePath(): String = unwrap(this).getFilePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileCodeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FileCodeOptions):
        FileCodeOptions = CdkObjectWrappers.wrap(cdkObject) as? FileCodeOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileCodeOptions):
        software.amazon.awscdk.services.cloudfront.FileCodeOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.FileCodeOptions
  }
}
