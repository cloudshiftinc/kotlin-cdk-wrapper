@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataSync::LocationFSxLustre` resource specifies an endpoint for an Amazon FSx for
 * Lustre file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationFSxLustre cfnLocationFSxLustre = CfnLocationFSxLustre.Builder.create(this,
 * "MyCfnLocationFSxLustre")
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
public open class CfnLocationFSxLustre(
  cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustre,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationFSxLustreProps,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnLocationFSxLustre(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLocationFSxLustreProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationFSxLustreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLocationFSxLustreProps(props)
  )

  /**
   * The ARN of the specified FSx for Lustre file system location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified FSx for Lustre file system location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file system.
   */
  public open fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  /**
   * Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file system.
   */
  public open fun fsxFilesystemArn(`value`: String) {
    unwrap(this).setFsxFilesystemArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
   */
  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

  /**
   * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
   */
  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  /**
   * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
   */
  public open fun securityGroupArns(vararg `value`: String): Unit =
      securityGroupArns(`value`.toList())

  /**
   * Specifies a mount path for your FSx for Lustre file system.
   *
   * The path can include subdirectories.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies a mount path for your FSx for Lustre file system.
   *
   * The path can include subdirectories.
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationFSxLustre].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-fsxfilesystemarn)
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file
     * system. 
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    /**
     * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * Specifies a mount path for your FSx for Lustre file system. The path can include
     * subdirectories.
     *
     * When the location is used as a source, DataSync reads data from the mount path. When the
     * location is used as a destination, DataSync writes data to the mount path. If you don't include
     * this parameter, DataSync uses the file system's root directory ( `/` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-subdirectory)
     * @param subdirectory Specifies a mount path for your FSx for Lustre file system. The path can
     * include subdirectories. 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxLustre.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustre.Builder.create(scope, id)

    /**
     * Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-fsxfilesystemarn)
     * @param fsxFilesystemArn Specifies the Amazon Resource Name (ARN) of the FSx for Lustre file
     * system. 
     */
    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * The ARNs of the security groups that are used to configure the FSx for Lustre file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for Lustre file system. 
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * Specifies a mount path for your FSx for Lustre file system. The path can include
     * subdirectories.
     *
     * When the location is used as a source, DataSync reads data from the mount path. When the
     * location is used as a destination, DataSync writes data to the mount path. If you don't include
     * this parameter, DataSync uses the file system's root directory ( `/` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-subdirectory)
     * @param subdirectory Specifies a mount path for your FSx for Lustre file system. The path can
     * include subdirectories. 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html#cfn-datasync-locationfsxlustre-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxLustre =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustre.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxLustre {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxLustre(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxLustre):
        CfnLocationFSxLustre = CfnLocationFSxLustre(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxLustre):
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustre = wrapped.cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationFSxLustre
  }
}
