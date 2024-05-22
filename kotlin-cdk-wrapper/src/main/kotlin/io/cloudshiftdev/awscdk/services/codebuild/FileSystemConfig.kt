@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The type returned from `IFileSystemLocation#bind`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * FileSystemConfig fileSystemConfig = FileSystemConfig.builder()
 * .location(ProjectFileSystemLocationProperty.builder()
 * .identifier("identifier")
 * .location("location")
 * .mountPoint("mountPoint")
 * .type("type")
 * // the properties below are optional
 * .mountOptions("mountOptions")
 * .build())
 * .build();
 * ```
 */
public interface FileSystemConfig {
  /**
   * File system location wrapper property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html)
   */
  public fun location(): CfnProject.ProjectFileSystemLocationProperty

  /**
   * A builder for [FileSystemConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param location File system location wrapper property. 
     */
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty)

    /**
     * @param location File system location wrapper property. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed1a7c5c4d7a90387275d61d3365c66e9a21d98bb1c1fb761d7f96e824015488")
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.FileSystemConfig.Builder =
        software.amazon.awscdk.services.codebuild.FileSystemConfig.builder()

    /**
     * @param location File system location wrapper property. 
     */
    override fun location(location: CfnProject.ProjectFileSystemLocationProperty) {
      cdkBuilder.location(location.let(CfnProject.ProjectFileSystemLocationProperty.Companion::unwrap))
    }

    /**
     * @param location File system location wrapper property. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed1a7c5c4d7a90387275d61d3365c66e9a21d98bb1c1fb761d7f96e824015488")
    override
        fun location(location: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit):
        Unit = location(CfnProject.ProjectFileSystemLocationProperty(location))

    public fun build(): software.amazon.awscdk.services.codebuild.FileSystemConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.FileSystemConfig,
  ) : CdkObject(cdkObject), FileSystemConfig {
    /**
     * File system location wrapper property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html)
     */
    override fun location(): CfnProject.ProjectFileSystemLocationProperty =
        unwrap(this).getLocation().let(CfnProject.ProjectFileSystemLocationProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FileSystemConfig):
        FileSystemConfig = CdkObjectWrappers.wrap(cdkObject) as? FileSystemConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemConfig):
        software.amazon.awscdk.services.codebuild.FileSystemConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.FileSystemConfig
  }
}
