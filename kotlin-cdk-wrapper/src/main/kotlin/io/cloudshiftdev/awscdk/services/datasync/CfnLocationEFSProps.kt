@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationEFS`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationEFSProps cfnLocationEFSProps = CfnLocationEFSProps.builder()
 * .ec2Config(Ec2ConfigProperty.builder()
 * .securityGroupArns(List.of("securityGroupArns"))
 * .subnetArn("subnetArn")
 * .build())
 * // the properties below are optional
 * .accessPointArn("accessPointArn")
 * .efsFilesystemArn("efsFilesystemArn")
 * .fileSystemAccessRoleArn("fileSystemAccessRoleArn")
 * .inTransitEncryption("inTransitEncryption")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html)
 */
public interface CfnLocationEFSProps {
  /**
   * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to mount your
   * Amazon EFS file system.
   *
   * For more information, see [Accessing restricted file
   * systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-accesspointarn)
   */
  public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  /**
   * Specifies the subnet and security groups DataSync uses to connect to one of your Amazon EFS
   * file system's [mount targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
   */
  public fun ec2Config(): Any

  /**
   * Specifies the ARN for your Amazon EFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-efsfilesystemarn)
   */
  public fun efsFilesystemArn(): String? = unwrap(this).getEfsFilesystemArn()

  /**
   * Specifies an AWS Identity and Access Management (IAM) role that allows DataSync to access your
   * Amazon EFS file system.
   *
   * For information on creating this role, see [Creating a DataSync IAM role for file system
   * access](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam-role)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-filesystemaccessrolearn)
   */
  public fun fileSystemAccessRoleArn(): String? = unwrap(this).getFileSystemAccessRoleArn()

  /**
   * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when
   * it transfers data to or from your Amazon EFS file system.
   *
   * If you specify an access point using `AccessPointArn` or an IAM role using
   * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-intransitencryption)
   */
  public fun inTransitEncryption(): String? = unwrap(this).getInTransitEncryption()

  /**
   * Specifies a mount path for your Amazon EFS file system.
   *
   * This is where DataSync reads or writes data (depending on if this is a source or destination
   * location) on your file system.
   *
   * By default, DataSync uses the root directory (or [access
   * point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) if you provide one by
   * using `AccessPointArn` ). You can also include subdirectories using forward slashes (for example,
   * `/path/to/folder` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies the key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationEFSProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPointArn Specifies the Amazon Resource Name (ARN) of the access point that
     * DataSync uses to mount your Amazon EFS file system.
     * For more information, see [Accessing restricted file
     * systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam)
     * .
     */
    public fun accessPointArn(accessPointArn: String)

    /**
     * @param ec2Config Specifies the subnet and security groups DataSync uses to connect to one of
     * your Amazon EFS file system's [mount
     * targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) . 
     */
    public fun ec2Config(ec2Config: IResolvable)

    /**
     * @param ec2Config Specifies the subnet and security groups DataSync uses to connect to one of
     * your Amazon EFS file system's [mount
     * targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) . 
     */
    public fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty)

    /**
     * @param ec2Config Specifies the subnet and security groups DataSync uses to connect to one of
     * your Amazon EFS file system's [mount
     * targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3af66aa99dca56cb35a3347bb145188a2ff6c86fa7d4f760b1442dcabf27da27")
    public fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty.Builder.() -> Unit)

    /**
     * @param efsFilesystemArn Specifies the ARN for your Amazon EFS file system.
     */
    public fun efsFilesystemArn(efsFilesystemArn: String)

    /**
     * @param fileSystemAccessRoleArn Specifies an AWS Identity and Access Management (IAM) role
     * that allows DataSync to access your Amazon EFS file system.
     * For information on creating this role, see [Creating a DataSync IAM role for file system
     * access](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam-role)
     * .
     */
    public fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String)

    /**
     * @param inTransitEncryption Specifies whether you want DataSync to use Transport Layer
     * Security (TLS) 1.2 encryption when it transfers data to or from your Amazon EFS file system.
     * If you specify an access point using `AccessPointArn` or an IAM role using
     * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
     */
    public fun inTransitEncryption(inTransitEncryption: String)

    /**
     * @param subdirectory Specifies a mount path for your Amazon EFS file system.
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location) on your file system.
     *
     * By default, DataSync uses the root directory (or [access
     * point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) if you provide one by
     * using `AccessPointArn` ). You can also include subdirectories using forward slashes (for
     * example, `/path/to/folder` ).
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationEFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationEFSProps.builder()

    /**
     * @param accessPointArn Specifies the Amazon Resource Name (ARN) of the access point that
     * DataSync uses to mount your Amazon EFS file system.
     * For more information, see [Accessing restricted file
     * systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam)
     * .
     */
    override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    /**
     * @param ec2Config Specifies the subnet and security groups DataSync uses to connect to one of
     * your Amazon EFS file system's [mount
     * targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) . 
     */
    override fun ec2Config(ec2Config: IResolvable) {
      cdkBuilder.ec2Config(ec2Config.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ec2Config Specifies the subnet and security groups DataSync uses to connect to one of
     * your Amazon EFS file system's [mount
     * targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) . 
     */
    override fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty) {
      cdkBuilder.ec2Config(ec2Config.let(CfnLocationEFS.Ec2ConfigProperty.Companion::unwrap))
    }

    /**
     * @param ec2Config Specifies the subnet and security groups DataSync uses to connect to one of
     * your Amazon EFS file system's [mount
     * targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3af66aa99dca56cb35a3347bb145188a2ff6c86fa7d4f760b1442dcabf27da27")
    override fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty.Builder.() -> Unit): Unit =
        ec2Config(CfnLocationEFS.Ec2ConfigProperty(ec2Config))

    /**
     * @param efsFilesystemArn Specifies the ARN for your Amazon EFS file system.
     */
    override fun efsFilesystemArn(efsFilesystemArn: String) {
      cdkBuilder.efsFilesystemArn(efsFilesystemArn)
    }

    /**
     * @param fileSystemAccessRoleArn Specifies an AWS Identity and Access Management (IAM) role
     * that allows DataSync to access your Amazon EFS file system.
     * For information on creating this role, see [Creating a DataSync IAM role for file system
     * access](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam-role)
     * .
     */
    override fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String) {
      cdkBuilder.fileSystemAccessRoleArn(fileSystemAccessRoleArn)
    }

    /**
     * @param inTransitEncryption Specifies whether you want DataSync to use Transport Layer
     * Security (TLS) 1.2 encryption when it transfers data to or from your Amazon EFS file system.
     * If you specify an access point using `AccessPointArn` or an IAM role using
     * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
     */
    override fun inTransitEncryption(inTransitEncryption: String) {
      cdkBuilder.inTransitEncryption(inTransitEncryption)
    }

    /**
     * @param subdirectory Specifies a mount path for your Amazon EFS file system.
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location) on your file system.
     *
     * By default, DataSync uses the root directory (or [access
     * point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) if you provide one by
     * using `AccessPointArn` ). You can also include subdirectories using forward slashes (for
     * example, `/path/to/folder` ).
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies the key-value pair that represents a tag that you want to add to the
     * resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationEFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFSProps,
  ) : CdkObject(cdkObject),
      CfnLocationEFSProps {
    /**
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to mount your
     * Amazon EFS file system.
     *
     * For more information, see [Accessing restricted file
     * systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-accesspointarn)
     */
    override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    /**
     * Specifies the subnet and security groups DataSync uses to connect to one of your Amazon EFS
     * file system's [mount targets](https://docs.aws.amazon.com/efs/latest/ug/accessing-fs.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
     */
    override fun ec2Config(): Any = unwrap(this).getEc2Config()

    /**
     * Specifies the ARN for your Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-efsfilesystemarn)
     */
    override fun efsFilesystemArn(): String? = unwrap(this).getEfsFilesystemArn()

    /**
     * Specifies an AWS Identity and Access Management (IAM) role that allows DataSync to access
     * your Amazon EFS file system.
     *
     * For information on creating this role, see [Creating a DataSync IAM role for file system
     * access](https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html#create-efs-location-iam-role)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-filesystemaccessrolearn)
     */
    override fun fileSystemAccessRoleArn(): String? = unwrap(this).getFileSystemAccessRoleArn()

    /**
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when
     * it transfers data to or from your Amazon EFS file system.
     *
     * If you specify an access point using `AccessPointArn` or an IAM role using
     * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-intransitencryption)
     */
    override fun inTransitEncryption(): String? = unwrap(this).getInTransitEncryption()

    /**
     * Specifies a mount path for your Amazon EFS file system.
     *
     * This is where DataSync reads or writes data (depending on if this is a source or destination
     * location) on your file system.
     *
     * By default, DataSync uses the root directory (or [access
     * point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) if you provide one by
     * using `AccessPointArn` ). You can also include subdirectories using forward slashes (for
     * example, `/path/to/folder` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies the key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationEFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFSProps):
        CfnLocationEFSProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationEFSProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationEFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationEFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationEFSProps
  }
}
