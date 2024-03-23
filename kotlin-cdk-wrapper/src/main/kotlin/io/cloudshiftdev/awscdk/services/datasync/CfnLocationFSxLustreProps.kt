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
   * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
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
   * A subdirectory in the location's path.
   *
   * This subdirectory in the FSx for Lustre file system is used to read data from the FSx for
   * Lustre source location or write data to the FSx for Lustre destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   *
   * The value can be an empty string. This value helps you manage, filter, and search for your
   * resources. We recommend that you create a name tag for your location.
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
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Lustre file system.
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
     * @param subdirectory A subdirectory in the location's path.
     * This subdirectory in the FSx for Lustre file system is used to read data from the FSx for
     * Lustre source location or write data to the FSx for Lustre destination.
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
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps.builder()

    /**
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Lustre file system.
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
     * @param subdirectory A subdirectory in the location's path.
     * This subdirectory in the FSx for Lustre file system is used to read data from the FSx for
     * Lustre source location or write data to the FSx for Lustre destination.
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

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps,
  ) : CdkObject(cdkObject), CfnLocationFSxLustreProps {
    /**
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
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
     * A subdirectory in the location's path.
     *
     * This subdirectory in the FSx for Lustre file system is used to read data from the FSx for
     * Lustre source location or write data to the FSx for Lustre destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * The key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
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
