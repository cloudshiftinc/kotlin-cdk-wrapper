@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLocationFSxLustre`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationFSxLustreProps cfnLocationFSxLustreProps = CfnLocationFSxLustreProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html)
 */
public interface CfnLocationFSxLustreProps {
  /**
   * Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-fsxfilesystemarn)
   */
  public fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  /**
   * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
   *
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * *Length constraints* : Maximum length of 128.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-securitygrouparns)
   */
  public fun securityGroupArns(): List<String>

  /**
   * Specifies a mount path for your FSx for Lustre file system. The path can include
   * subdirectories.
   *
   * When the location is used as a source, DataSync reads data from the mount path. When the
   * location is used as a destination, DataSync writes data to the mount path. If you don't include
   * this parameter, DataSync uses the file system's root directory ( `/` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationFSxLustreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file
     * system.
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * @param subdirectory Specifies a mount path for your FSx for Lustre file system. The path can
     * include subdirectories.
     * When the location is used as a source, DataSync reads data from the mount path. When the
     * location is used as a destination, DataSync writes data to the mount path. If you don't include
     * this parameter, DataSync uses the file system's root directory ( `/` ).
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps.builder()

    /**
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file
     * system.
     */
    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
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
     * for Lustre file system. 
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * @param subdirectory Specifies a mount path for your FSx for Lustre file system. The path can
     * include subdirectories.
     * When the location is used as a source, DataSync reads data from the mount path. When the
     * location is used as a destination, DataSync writes data to the mount path. If you don't include
     * this parameter, DataSync uses the file system's root directory ( `/` ).
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps,
  ) : CdkObject(cdkObject),
      CfnLocationFSxLustreProps {
    /**
     * Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-fsxfilesystemarn)
     */
    override fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

    /**
     * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-securitygrouparns)
     */
    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    /**
     * Specifies a mount path for your FSx for Lustre file system. The path can include
     * subdirectories.
     *
     * When the location is used as a source, DataSync reads data from the mount path. When the
     * location is used as a destination, DataSync writes data to the mount path. If you don't include
     * this parameter, DataSync uses the file system's root directory ( `/` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxLustreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps):
        CfnLocationFSxLustreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationFSxLustreProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxLustreProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps
  }
}
