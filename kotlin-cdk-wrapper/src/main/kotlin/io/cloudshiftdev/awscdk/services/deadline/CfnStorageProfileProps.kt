@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStorageProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnStorageProfileProps cfnStorageProfileProps = CfnStorageProfileProps.builder()
 * .displayName("displayName")
 * .osFamily("osFamily")
 * // the properties below are optional
 * .farmId("farmId")
 * .fileSystemLocations(List.of(FileSystemLocationProperty.builder()
 * .name("name")
 * .path("path")
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html)
 */
public interface CfnStorageProfileProps {
  /**
   * The display name of the storage profile summary to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-displayname)
   */
  public fun displayName(): String

  /**
   * The unique identifier of the farm that contains the storage profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-farmid)
   */
  public fun farmId(): String? = unwrap(this).getFarmId()

  /**
   * Operating system specific file system path to the storage location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
   */
  public fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

  /**
   * The operating system (OS) family.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-osfamily)
   */
  public fun osFamily(): String

  /**
   * A builder for [CfnStorageProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayName The display name of the storage profile summary to update. 
     */
    public fun displayName(displayName: String)

    /**
     * @param farmId The unique identifier of the farm that contains the storage profile.
     */
    public fun farmId(farmId: String)

    /**
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location.
     */
    public fun fileSystemLocations(fileSystemLocations: IResolvable)

    /**
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location.
     */
    public fun fileSystemLocations(fileSystemLocations: List<Any>)

    /**
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: Any)

    /**
     * @param osFamily The operating system (OS) family. 
     */
    public fun osFamily(osFamily: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnStorageProfileProps.Builder
        = software.amazon.awscdk.services.deadline.CfnStorageProfileProps.builder()

    /**
     * @param displayName The display name of the storage profile summary to update. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param farmId The unique identifier of the farm that contains the storage profile.
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location.
     */
    override fun fileSystemLocations(fileSystemLocations: IResolvable) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.let(IResolvable::unwrap))
    }

    /**
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location.
     */
    override fun fileSystemLocations(fileSystemLocations: List<Any>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location.
     */
    override fun fileSystemLocations(vararg fileSystemLocations: Any): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * @param osFamily The operating system (OS) family. 
     */
    override fun osFamily(osFamily: String) {
      cdkBuilder.osFamily(osFamily)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnStorageProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnStorageProfileProps,
  ) : CdkObject(cdkObject), CfnStorageProfileProps {
    /**
     * The display name of the storage profile summary to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The unique identifier of the farm that contains the storage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-farmid)
     */
    override fun farmId(): String? = unwrap(this).getFarmId()

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     */
    override fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

    /**
     * The operating system (OS) family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-osfamily)
     */
    override fun osFamily(): String = unwrap(this).getOsFamily()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnStorageProfileProps):
        CfnStorageProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStorageProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageProfileProps):
        software.amazon.awscdk.services.deadline.CfnStorageProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.deadline.CfnStorageProfileProps
  }
}
