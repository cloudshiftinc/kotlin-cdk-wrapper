@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IoT1Click::Placement` resource creates a placement to be associated with an AWS IoT
 * 1-Click project.
 *
 * A placement is an instance of a device in a location. For more information, see [Projects,
 * Templates, and
 * Placements](https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-PTP.html) in the
 * *AWS IoT 1-Click Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot1click.*;
 * Object associatedDevices;
 * Object attributes;
 * CfnPlacement cfnPlacement = CfnPlacement.Builder.create(this, "MyCfnPlacement")
 * .projectName("projectName")
 * // the properties below are optional
 * .associatedDevices(associatedDevices)
 * .attributes(attributes)
 * .placementName("placementName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html)
 */
public open class CfnPlacement(
  cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacement,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlacementProps,
  ) :
      this(software.amazon.awscdk.services.iot1click.CfnPlacement(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPlacementProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlacementProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPlacementProps(props)
  )

  /**
   * The devices to associate with the placement, as defined by a mapping of zero or more key-value
   * pairs wherein the key is a template name and the value is a device ID.
   */
  public open fun associatedDevices(): Any? = unwrap(this).getAssociatedDevices()

  /**
   * The devices to associate with the placement, as defined by a mapping of zero or more key-value
   * pairs wherein the key is a template name and the value is a device ID.
   */
  public open fun associatedDevices(`value`: Any) {
    unwrap(this).setAssociatedDevices(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the placement, such as `floor17` .
   */
  public open fun attrPlacementName(): String = unwrap(this).getAttrPlacementName()

  /**
   * The name of the project containing the placement, such as `conference-rooms` .
   */
  public open fun attrProjectName(): String = unwrap(this).getAttrProjectName()

  /**
   * The user-defined attributes associated with the placement.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * The user-defined attributes associated with the placement.
   */
  public open fun attributes(`value`: Any) {
    unwrap(this).setAttributes(`value`)
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
   * The name of the placement.
   */
  public open fun placementName(): String? = unwrap(this).getPlacementName()

  /**
   * The name of the placement.
   */
  public open fun placementName(`value`: String) {
    unwrap(this).setPlacementName(`value`)
  }

  /**
   * The name of the project containing the placement.
   */
  public open fun projectName(): String = unwrap(this).getProjectName()

  /**
   * The name of the project containing the placement.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot1click.CfnPlacement].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The devices to associate with the placement, as defined by a mapping of zero or more
     * key-value pairs wherein the key is a template name and the value is a device ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
     * @param associatedDevices The devices to associate with the placement, as defined by a mapping
     * of zero or more key-value pairs wherein the key is a template name and the value is a device ID.
     * 
     */
    public fun associatedDevices(associatedDevices: Any)

    /**
     * The user-defined attributes associated with the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
     * @param attributes The user-defined attributes associated with the placement. 
     */
    public fun attributes(attributes: Any)

    /**
     * The name of the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
     * @param placementName The name of the placement. 
     */
    public fun placementName(placementName: String)

    /**
     * The name of the project containing the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
     * @param projectName The name of the project containing the placement. 
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnPlacement.Builder =
        software.amazon.awscdk.services.iot1click.CfnPlacement.Builder.create(scope, id)

    /**
     * The devices to associate with the placement, as defined by a mapping of zero or more
     * key-value pairs wherein the key is a template name and the value is a device ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
     * @param associatedDevices The devices to associate with the placement, as defined by a mapping
     * of zero or more key-value pairs wherein the key is a template name and the value is a device ID.
     * 
     */
    override fun associatedDevices(associatedDevices: Any) {
      cdkBuilder.associatedDevices(associatedDevices)
    }

    /**
     * The user-defined attributes associated with the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
     * @param attributes The user-defined attributes associated with the placement. 
     */
    override fun attributes(attributes: Any) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * The name of the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
     * @param placementName The name of the placement. 
     */
    override fun placementName(placementName: String) {
      cdkBuilder.placementName(placementName)
    }

    /**
     * The name of the project containing the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
     * @param projectName The name of the project containing the placement. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnPlacement = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot1click.CfnPlacement.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlacement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlacement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacement):
        CfnPlacement = CfnPlacement(cdkObject)

    internal fun unwrap(wrapped: CfnPlacement):
        software.amazon.awscdk.services.iot1click.CfnPlacement = wrapped.cdkObject as
        software.amazon.awscdk.services.iot1click.CfnPlacement
  }
}
