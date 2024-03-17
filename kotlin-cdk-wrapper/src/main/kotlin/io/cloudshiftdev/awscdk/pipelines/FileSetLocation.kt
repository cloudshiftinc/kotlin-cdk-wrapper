@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Location of a FileSet consumed or produced by a ShellStep.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * FileSet fileSet;
 * FileSetLocation fileSetLocation = FileSetLocation.builder()
 * .directory("directory")
 * .fileSet(fileSet)
 * .build();
 * ```
 */
public interface FileSetLocation {
  /**
   * The (relative) directory where the FileSet is found.
   */
  public fun directory(): String

  /**
   * The FileSet object.
   */
  public fun fileSet(): FileSet

  /**
   * A builder for [FileSetLocation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param directory The (relative) directory where the FileSet is found. 
     */
    public fun directory(directory: String)

    /**
     * @param fileSet The FileSet object. 
     */
    public fun fileSet(fileSet: FileSet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.FileSetLocation.Builder =
        software.amazon.awscdk.pipelines.FileSetLocation.builder()

    /**
     * @param directory The (relative) directory where the FileSet is found. 
     */
    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    /**
     * @param fileSet The FileSet object. 
     */
    override fun fileSet(fileSet: FileSet) {
      cdkBuilder.fileSet(fileSet.let(FileSet::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.FileSetLocation = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.FileSetLocation,
  ) : CdkObject(cdkObject), FileSetLocation {
    /**
     * The (relative) directory where the FileSet is found.
     */
    override fun directory(): String = unwrap(this).getDirectory()

    /**
     * The FileSet object.
     */
    override fun fileSet(): FileSet = unwrap(this).getFileSet().let(FileSet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSetLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.FileSetLocation): FileSetLocation
        = CdkObjectWrappers.wrap(cdkObject) as? FileSetLocation ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSetLocation): software.amazon.awscdk.pipelines.FileSetLocation
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.FileSetLocation
  }
}
