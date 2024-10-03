@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::SoftwarePackageVersion` resource to create a software package version.
 *
 * For information about working with software package versions, see [AWS IoT Device Management
 * Software Package
 * Catalog](https://docs.aws.amazon.com/iot/latest/developerguide/software-package-catalog.html) and
 * [Creating a software package and package
 * version](https://docs.aws.amazon.com/iot/latest/developerguide/creating-package-and-version.html) in
 * the *AWS IoT Developer Guide* . See also,
 * [CreatePackageVersion](https://docs.aws.amazon.com/iot/latest/apireference/API_CreatePackageVersion.html)
 * in the *API Guide* .
 *
 *
 * The associated software package must exist before the package version is created. If you create a
 * software package and package version in the same CloudFormation template, set the software package
 * as a
 * [dependency](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * of the package version. If they are created out of sequence, you will receive an error.
 *
 * Package versions and created in a `draft` state, for more information, see [Package version
 * lifecycle](https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle)
 * . To change the package version state after it’s created, use the
 * [UpdatePackageVersionAPI](https://docs.aws.amazon.com/iot/latest/apireference/API_UpdatePackageVersion.html)
 * command.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSoftwarePackageVersion cfnSoftwarePackageVersion =
 * CfnSoftwarePackageVersion.Builder.create(this, "MyCfnSoftwarePackageVersion")
 * .packageName("packageName")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .versionName("versionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html)
 */
public open class CfnSoftwarePackageVersion(
  cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSoftwarePackageVersionProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSoftwarePackageVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSoftwarePackageVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSoftwarePackageVersionProps(props)
  )

  /**
   * Error reason for a package version failure during creation or update.
   */
  public open fun attrErrorReason(): String = unwrap(this).getAttrErrorReason()

  /**
   * The Amazon Resource Name (ARN) for the package.
   */
  public open fun attrPackageVersionArn(): String = unwrap(this).getAttrPackageVersionArn()

  /**
   * The status of the package version.
   *
   * For more information, see [Package version
   * lifecycle](https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle)
   * .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   *
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   *
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   *
   */
  public open fun packageName(): String = unwrap(this).getPackageName()

  /**
   *
   */
  public open fun packageName(`value`: String) {
    unwrap(this).setPackageName(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   *
   */
  public open fun versionName(): String? = unwrap(this).getVersionName()

  /**
   *
   */
  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnSoftwarePackageVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes 
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
     * @param packageName 
     */
    public fun packageName(packageName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
     * @param versionName 
     */
    public fun versionName(versionName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
     * @param packageName 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
     * @param versionName 
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSoftwarePackageVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSoftwarePackageVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion):
        CfnSoftwarePackageVersion = CfnSoftwarePackageVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageVersion):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion
  }
}
