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
 * Properties for defining a `CfnLocationFSxOpenZFS`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationFSxOpenZFSProps cfnLocationFSxOpenZFSProps = CfnLocationFSxOpenZFSProps.builder()
 * .protocol(ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .securityGroupArns(List.of("securityGroupArns"))
 * // the properties below are optional
 * .fsxFilesystemArn("fsxFilesystemArn")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html)
 */
public interface CfnLocationFSxOpenZFSProps {
  /**
   * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-fsxfilesystemarn)
   */
  public fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  /**
   * The type of protocol that AWS DataSync uses to access your file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
   */
  public fun protocol(): Any

  /**
   * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
   *
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
   */
  public fun securityGroupArns(): List<String>

  /**
   * A subdirectory in the location's path that must begin with `/fsx` .
   *
   * DataSync uses this subdirectory to read or write data (depending on whether the file system is
   * a source or destination location).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationFSxOpenZFSProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    /**
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    public fun protocol(protocol: IResolvable)

    /**
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty)

    /**
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f98830f77b704d60632afbec3c06d164bddba080e917dac6e8c19711206b353")
    public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty.Builder.() -> Unit)

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * @param subdirectory A subdirectory in the location's path that must begin with `/fsx` .
     * DataSync uses this subdirectory to read or write data (depending on whether the file system
     * is a source or destination location).
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags The key-value pair that represents a tag that you want to add to the resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key-value pair that represents a tag that you want to add to the resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps.builder()

    /**
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
     */
    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    /**
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    override fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(CfnLocationFSxOpenZFS.ProtocolProperty::unwrap))
    }

    /**
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f98830f77b704d60632afbec3c06d164bddba080e917dac6e8c19711206b353")
    override fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty.Builder.() -> Unit): Unit
        = protocol(CfnLocationFSxOpenZFS.ProtocolProperty(protocol))

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * @param subdirectory A subdirectory in the location's path that must begin with `/fsx` .
     * DataSync uses this subdirectory to read or write data (depending on whether the file system
     * is a source or destination location).
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags The key-value pair that represents a tag that you want to add to the resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The key-value pair that represents a tag that you want to add to the resource.
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps,
  ) : CdkObject(cdkObject), CfnLocationFSxOpenZFSProps {
    /**
     * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-fsxfilesystemarn)
     */
    override fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     */
    override fun protocol(): Any = unwrap(this).getProtocol()

    /**
     * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
     */
    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    /**
     * A subdirectory in the location's path that must begin with `/fsx` .
     *
     * DataSync uses this subdirectory to read or write data (depending on whether the file system
     * is a source or destination location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * The key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxOpenZFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps):
        CfnLocationFSxOpenZFSProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLocationFSxOpenZFSProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxOpenZFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps
  }
}
