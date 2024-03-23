@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a profile that can be applied to one or more private fleet device instances.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devicefarm.*;
 * CfnInstanceProfile cfnInstanceProfile = CfnInstanceProfile.Builder.create(this,
 * "MyCfnInstanceProfile")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .excludeAppPackagesFromCleanup(List.of("excludeAppPackagesFromCleanup"))
 * .packageCleanup(false)
 * .rebootAfterUse(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html)
 */
public open class CfnInstanceProfile(
  cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceProfileProps,
  ) :
      this(software.amazon.awscdk.services.devicefarm.CfnInstanceProfile(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInstanceProfileProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInstanceProfileProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the instance profile.
   *
   * See [Amazon resource
   * names](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *General
   * Reference guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The description of the instance profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the instance profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An array of strings containing the list of app packages that should not be cleaned up from the
   * device after a test run completes.
   */
  public open fun excludeAppPackagesFromCleanup(): List<String> =
      unwrap(this).getExcludeAppPackagesFromCleanup() ?: emptyList()

  /**
   * An array of strings containing the list of app packages that should not be cleaned up from the
   * device after a test run completes.
   */
  public open fun excludeAppPackagesFromCleanup(`value`: List<String>) {
    unwrap(this).setExcludeAppPackagesFromCleanup(`value`)
  }

  /**
   * An array of strings containing the list of app packages that should not be cleaned up from the
   * device after a test run completes.
   */
  public open fun excludeAppPackagesFromCleanup(vararg `value`: String): Unit =
      excludeAppPackagesFromCleanup(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the instance profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the instance profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * When set to `true` , Device Farm removes app packages after a test run.
   */
  public open fun packageCleanup(): Any? = unwrap(this).getPackageCleanup()

  /**
   * When set to `true` , Device Farm removes app packages after a test run.
   */
  public open fun packageCleanup(`value`: Boolean) {
    unwrap(this).setPackageCleanup(`value`)
  }

  /**
   * When set to `true` , Device Farm removes app packages after a test run.
   */
  public open fun packageCleanup(`value`: IResolvable) {
    unwrap(this).setPackageCleanup(`value`.let(IResolvable::unwrap))
  }

  /**
   * When set to `true` , Device Farm reboots the instance after a test run.
   */
  public open fun rebootAfterUse(): Any? = unwrap(this).getRebootAfterUse()

  /**
   * When set to `true` , Device Farm reboots the instance after a test run.
   */
  public open fun rebootAfterUse(`value`: Boolean) {
    unwrap(this).setRebootAfterUse(`value`)
  }

  /**
   * When set to `true` , Device Farm reboots the instance after a test run.
   */
  public open fun rebootAfterUse(`value`: IResolvable) {
    unwrap(this).setRebootAfterUse(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devicefarm.CfnInstanceProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-description)
     * @param description The description of the instance profile. 
     */
    public fun description(description: String)

    /**
     * An array of strings containing the list of app packages that should not be cleaned up from
     * the device after a test run completes.
     *
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-excludeapppackagesfromcleanup)
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes. 
     */
    public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>)

    /**
     * An array of strings containing the list of app packages that should not be cleaned up from
     * the device after a test run completes.
     *
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-excludeapppackagesfromcleanup)
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes. 
     */
    public fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String)

    /**
     * The name of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-name)
     * @param name The name of the instance profile. 
     */
    public fun name(name: String)

    /**
     * When set to `true` , Device Farm removes app packages after a test run.
     *
     * The default value is `false` for private devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-packagecleanup)
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * 
     */
    public fun packageCleanup(packageCleanup: Boolean)

    /**
     * When set to `true` , Device Farm removes app packages after a test run.
     *
     * The default value is `false` for private devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-packagecleanup)
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * 
     */
    public fun packageCleanup(packageCleanup: IResolvable)

    /**
     * When set to `true` , Device Farm reboots the instance after a test run.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-rebootafteruse)
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * 
     */
    public fun rebootAfterUse(rebootAfterUse: Boolean)

    /**
     * When set to `true` , Device Farm reboots the instance after a test run.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-rebootafteruse)
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * 
     */
    public fun rebootAfterUse(rebootAfterUse: IResolvable)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.Builder =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.Builder.create(scope, id)

    /**
     * The description of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-description)
     * @param description The description of the instance profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An array of strings containing the list of app packages that should not be cleaned up from
     * the device after a test run completes.
     *
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-excludeapppackagesfromcleanup)
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes. 
     */
    override fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>) {
      cdkBuilder.excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup)
    }

    /**
     * An array of strings containing the list of app packages that should not be cleaned up from
     * the device after a test run completes.
     *
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-excludeapppackagesfromcleanup)
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes. 
     */
    override fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String): Unit =
        excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup.toList())

    /**
     * The name of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-name)
     * @param name The name of the instance profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * When set to `true` , Device Farm removes app packages after a test run.
     *
     * The default value is `false` for private devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-packagecleanup)
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * 
     */
    override fun packageCleanup(packageCleanup: Boolean) {
      cdkBuilder.packageCleanup(packageCleanup)
    }

    /**
     * When set to `true` , Device Farm removes app packages after a test run.
     *
     * The default value is `false` for private devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-packagecleanup)
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * 
     */
    override fun packageCleanup(packageCleanup: IResolvable) {
      cdkBuilder.packageCleanup(packageCleanup.let(IResolvable::unwrap))
    }

    /**
     * When set to `true` , Device Farm reboots the instance after a test run.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-rebootafteruse)
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * 
     */
    override fun rebootAfterUse(rebootAfterUse: Boolean) {
      cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    /**
     * When set to `true` , Device Farm reboots the instance after a test run.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-rebootafteruse)
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * 
     */
    override fun rebootAfterUse(rebootAfterUse: IResolvable) {
      cdkBuilder.rebootAfterUse(rebootAfterUse.let(IResolvable::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnInstanceProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile):
        CfnInstanceProfile = CfnInstanceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfile):
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile
  }
}
