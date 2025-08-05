@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::SoftwarePackage` resource to create a software package.
 *
 * For information about working with software packages, see [AWS IoT Device Management Software
 * Package
 * Catalog](https://docs.aws.amazon.com/iot/latest/developerguide/software-package-catalog.html) and
 * [Creating a software package and package
 * version](https://docs.aws.amazon.com/iot/latest/developerguide/creating-package-and-version.html) in
 * the *AWS IoT Developer Guide* . See also,
 * [CreatePackage](https://docs.aws.amazon.com/iot/latest/apireference/API_CreatePackage.html) in the
 * *API Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSoftwarePackage cfnSoftwarePackage = CfnSoftwarePackage.Builder.create(this,
 * "MyCfnSoftwarePackage")
 * .description("description")
 * .packageName("packageName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html)
 */
public open class CfnSoftwarePackage(
  cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackage,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iot.CfnSoftwarePackage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSoftwarePackageProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnSoftwarePackage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSoftwarePackageProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSoftwarePackageProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSoftwarePackageProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the package.
   */
  public open fun attrPackageArn(): String = unwrap(this).getAttrPackageArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A summary of the package being created.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A summary of the package being created.
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
   * The name of the new software package.
   */
  public open fun packageName(): String? = unwrap(this).getPackageName()

  /**
   * The name of the new software package.
   */
  public open fun packageName(`value`: String) {
    unwrap(this).setPackageName(`value`)
  }

  /**
   * Metadata that can be used to manage the package.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that can be used to manage the package.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the package.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnSoftwarePackage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A summary of the package being created.
     *
     * This can be used to outline the package's contents or purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-description)
     * @param description A summary of the package being created. 
     */
    public fun description(description: String)

    /**
     * The name of the new software package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-packagename)
     * @param packageName The name of the new software package. 
     */
    public fun packageName(packageName: String)

    /**
     * Metadata that can be used to manage the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-tags)
     * @param tags Metadata that can be used to manage the package. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-tags)
     * @param tags Metadata that can be used to manage the package. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSoftwarePackage.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackage.Builder.create(scope, id)

    /**
     * A summary of the package being created.
     *
     * This can be used to outline the package's contents or purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-description)
     * @param description A summary of the package being created. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the new software package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-packagename)
     * @param packageName The name of the new software package. 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * Metadata that can be used to manage the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-tags)
     * @param tags Metadata that can be used to manage the package. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-tags)
     * @param tags Metadata that can be used to manage the package. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnSoftwarePackage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSoftwarePackage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSoftwarePackage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackage):
        CfnSoftwarePackage = CfnSoftwarePackage(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackage):
        software.amazon.awscdk.services.iot.CfnSoftwarePackage = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnSoftwarePackage
  }
}
