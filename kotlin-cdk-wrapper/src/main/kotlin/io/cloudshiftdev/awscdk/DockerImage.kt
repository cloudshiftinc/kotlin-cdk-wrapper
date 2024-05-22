@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Docker image.
 *
 * Example:
 *
 * ```
 * String entry = "/path/to/function";
 * DockerImage image = DockerImage.fromBuild(entry);
 * PythonFunction.Builder.create(this, "function")
 * .entry(entry)
 * .runtime(Runtime.PYTHON_3_8)
 * .bundling(BundlingOptions.builder()
 * .buildArgs(Map.of("PIP_INDEX_URL", "https://your.index.url/simple/", "PIP_EXTRA_INDEX_URL",
 * "https://your.extra-index.url/simple/"))
 * .build())
 * .build();
 * ```
 */
public open class DockerImage(
  cdkObject: software.amazon.awscdk.DockerImage,
) : CdkObject(cdkObject) {
  public constructor(image: String) : this(software.amazon.awscdk.DockerImage(image)
  )

  public constructor(image: String, imageHash: String) :
      this(software.amazon.awscdk.DockerImage(image, imageHash)
  )

  /**
   * Copies a file or directory out of the Docker image to the local filesystem.
   *
   * If `outputPath` is omitted the destination path is a temporary directory.
   *
   * @return the destination path
   * @param imagePath the path in the Docker image. 
   * @param outputPath the destination path for the copy operation.
   */
  public open fun cp(imagePath: String): String = unwrap(this).cp(imagePath)

  /**
   * Copies a file or directory out of the Docker image to the local filesystem.
   *
   * If `outputPath` is omitted the destination path is a temporary directory.
   *
   * @return the destination path
   * @param imagePath the path in the Docker image. 
   * @param outputPath the destination path for the copy operation.
   */
  public open fun cp(imagePath: String, outputPath: String): String = unwrap(this).cp(imagePath,
      outputPath)

  /**
   * The Docker image.
   */
  public open fun image(): String = unwrap(this).getImage()

  /**
   * Runs a Docker image.
   *
   * @param options
   */
  public open fun run() {
    unwrap(this).run()
  }

  /**
   * Runs a Docker image.
   *
   * @param options
   */
  public open fun run(options: DockerRunOptions) {
    unwrap(this).run(options.let(DockerRunOptions.Companion::unwrap))
  }

  /**
   * Runs a Docker image.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9137d0a62ac33b4ff6263285d372ca2e4172964b9f7855d0be63ff4bea62e9a3")
  public open fun run(options: DockerRunOptions.Builder.() -> Unit): Unit =
      run(DockerRunOptions(options))

  /**
   * Provides a stable representation of this image for JSON serialization.
   *
   * @return The overridden image name if set or image hash name in that order
   */
  public open fun toJSON(): String = unwrap(this).toJSON()

  public companion object {
    public fun fromBuild(path: String): DockerImage =
        software.amazon.awscdk.DockerImage.fromBuild(path).let(DockerImage::wrap)

    public fun fromBuild(path: String, options: DockerBuildOptions): DockerImage =
        software.amazon.awscdk.DockerImage.fromBuild(path,
        options.let(DockerBuildOptions.Companion::unwrap)).let(DockerImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa809b479d7fa4f75675888e725dc7bc71e72b027ae5adeca331083178755c4")
    public fun fromBuild(path: String, options: DockerBuildOptions.Builder.() -> Unit): DockerImage
        = fromBuild(path, DockerBuildOptions(options))

    public fun fromRegistry(image: String): DockerImage =
        software.amazon.awscdk.DockerImage.fromRegistry(image).let(DockerImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImage): DockerImage =
        DockerImage(cdkObject)

    internal fun unwrap(wrapped: DockerImage): software.amazon.awscdk.DockerImage =
        wrapped.cdkObject as software.amazon.awscdk.DockerImage
  }
}
