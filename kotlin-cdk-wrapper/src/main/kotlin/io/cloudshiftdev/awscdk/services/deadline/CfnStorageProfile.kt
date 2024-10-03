@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a storage profile that specifies the operating system, file type, and file location of
 * resources used on a farm.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnStorageProfile cfnStorageProfile = CfnStorageProfile.Builder.create(this,
 * "MyCfnStorageProfile")
 * .displayName("displayName")
 * .farmId("farmId")
 * .osFamily("osFamily")
 * // the properties below are optional
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
public open class CfnStorageProfile(
  cdkObject: software.amazon.awscdk.services.deadline.CfnStorageProfile,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStorageProfileProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnStorageProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStorageProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStorageProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStorageProfileProps(props)
  )

  /**
   * The storage profile ID.
   */
  public open fun attrStorageProfileId(): String = unwrap(this).getAttrStorageProfileId()

  /**
   * The display name of the storage profile summary to update.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The display name of the storage profile summary to update.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The unique identifier of the farm that contains the storage profile.
   */
  public open fun farmId(): String = unwrap(this).getFarmId()

  /**
   * The unique identifier of the farm that contains the storage profile.
   */
  public open fun farmId(`value`: String) {
    unwrap(this).setFarmId(`value`)
  }

  /**
   * Operating system specific file system path to the storage location.
   */
  public open fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

  /**
   * Operating system specific file system path to the storage location.
   */
  public open fun fileSystemLocations(`value`: IResolvable) {
    unwrap(this).setFileSystemLocations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Operating system specific file system path to the storage location.
   */
  public open fun fileSystemLocations(`value`: List<Any>) {
    unwrap(this).setFileSystemLocations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Operating system specific file system path to the storage location.
   */
  public open fun fileSystemLocations(vararg `value`: Any): Unit =
      fileSystemLocations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The operating system (OS) family.
   */
  public open fun osFamily(): String = unwrap(this).getOsFamily()

  /**
   * The operating system (OS) family.
   */
  public open fun osFamily(`value`: String) {
    unwrap(this).setOsFamily(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnStorageProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The display name of the storage profile summary to update.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-displayname)
     * @param displayName The display name of the storage profile summary to update. 
     */
    public fun displayName(displayName: String)

    /**
     * The unique identifier of the farm that contains the storage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-farmid)
     * @param farmId The unique identifier of the farm that contains the storage profile. 
     */
    public fun farmId(farmId: String)

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location. 
     */
    public fun fileSystemLocations(fileSystemLocations: IResolvable)

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location. 
     */
    public fun fileSystemLocations(fileSystemLocations: List<Any>)

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location. 
     */
    public fun fileSystemLocations(vararg fileSystemLocations: Any)

    /**
     * The operating system (OS) family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-osfamily)
     * @param osFamily The operating system (OS) family. 
     */
    public fun osFamily(osFamily: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnStorageProfile.Builder =
        software.amazon.awscdk.services.deadline.CfnStorageProfile.Builder.create(scope, id)

    /**
     * The display name of the storage profile summary to update.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-displayname)
     * @param displayName The display name of the storage profile summary to update. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The unique identifier of the farm that contains the storage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-farmid)
     * @param farmId The unique identifier of the farm that contains the storage profile. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location. 
     */
    override fun fileSystemLocations(fileSystemLocations: IResolvable) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.let(IResolvable.Companion::unwrap))
    }

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location. 
     */
    override fun fileSystemLocations(fileSystemLocations: List<Any>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Operating system specific file system path to the storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-filesystemlocations)
     * @param fileSystemLocations Operating system specific file system path to the storage
     * location. 
     */
    override fun fileSystemLocations(vararg fileSystemLocations: Any): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * The operating system (OS) family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-storageprofile.html#cfn-deadline-storageprofile-osfamily)
     * @param osFamily The operating system (OS) family. 
     */
    override fun osFamily(osFamily: String) {
      cdkBuilder.osFamily(osFamily)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnStorageProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnStorageProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnStorageProfile):
        CfnStorageProfile = CfnStorageProfile(cdkObject)

    internal fun unwrap(wrapped: CfnStorageProfile):
        software.amazon.awscdk.services.deadline.CfnStorageProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.deadline.CfnStorageProfile
  }

  /**
   * The details of the file system location for the resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.deadline.*;
   * FileSystemLocationProperty fileSystemLocationProperty = FileSystemLocationProperty.builder()
   * .name("name")
   * .path("path")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html)
   */
  public interface FileSystemLocationProperty {
    /**
     * The location name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html#cfn-deadline-storageprofile-filesystemlocation-name)
     */
    public fun name(): String

    /**
     * The file path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html#cfn-deadline-storageprofile-filesystemlocation-path)
     */
    public fun path(): String

    /**
     * The type of file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html#cfn-deadline-storageprofile-filesystemlocation-type)
     */
    public fun type(): String

    /**
     * A builder for [FileSystemLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The location name. 
       */
      public fun name(name: String)

      /**
       * @param path The file path. 
       */
      public fun path(path: String)

      /**
       * @param type The type of file. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty.Builder
          =
          software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty.builder()

      /**
       * @param name The location name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param path The file path. 
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param type The type of file. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty,
    ) : CdkObject(cdkObject),
        FileSystemLocationProperty {
      /**
       * The location name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html#cfn-deadline-storageprofile-filesystemlocation-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The file path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html#cfn-deadline-storageprofile-filesystemlocation-path)
       */
      override fun path(): String = unwrap(this).getPath()

      /**
       * The type of file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-deadline-storageprofile-filesystemlocation.html#cfn-deadline-storageprofile-filesystemlocation-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty):
          FileSystemLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FileSystemLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemLocationProperty):
          software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.deadline.CfnStorageProfile.FileSystemLocationProperty
    }
  }
}
