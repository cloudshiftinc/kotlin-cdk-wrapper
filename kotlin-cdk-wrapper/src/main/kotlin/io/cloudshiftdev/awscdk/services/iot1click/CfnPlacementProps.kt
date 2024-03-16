@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPlacement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot1click.*;
 * Object associatedDevices;
 * Object attributes;
 * CfnPlacementProps cfnPlacementProps = CfnPlacementProps.builder()
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
public interface CfnPlacementProps {
  /**
   * The devices to associate with the placement, as defined by a mapping of zero or more key-value
   * pairs wherein the key is a template name and the value is a device ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
   */
  public fun associatedDevices(): Any? = unwrap(this).getAssociatedDevices()

  /**
   * The user-defined attributes associated with the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * The name of the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
   */
  public fun placementName(): String? = unwrap(this).getPlacementName()

  /**
   * The name of the project containing the placement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
   */
  public fun projectName(): String

  /**
   * A builder for [CfnPlacementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associatedDevices The devices to associate with the placement, as defined by a mapping
     * of zero or more key-value pairs wherein the key is a template name and the value is a device ID.
     */
    public fun associatedDevices(associatedDevices: Any)

    /**
     * @param attributes The user-defined attributes associated with the placement.
     */
    public fun attributes(attributes: Any)

    /**
     * @param placementName The name of the placement.
     */
    public fun placementName(placementName: String)

    /**
     * @param projectName The name of the project containing the placement. 
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder =
        software.amazon.awscdk.services.iot1click.CfnPlacementProps.builder()

    /**
     * @param associatedDevices The devices to associate with the placement, as defined by a mapping
     * of zero or more key-value pairs wherein the key is a template name and the value is a device ID.
     */
    override fun associatedDevices(associatedDevices: Any) {
      cdkBuilder.associatedDevices(associatedDevices)
    }

    /**
     * @param attributes The user-defined attributes associated with the placement.
     */
    override fun attributes(attributes: Any) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param placementName The name of the placement.
     */
    override fun placementName(placementName: String) {
      cdkBuilder.placementName(placementName)
    }

    /**
     * @param projectName The name of the project containing the placement. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnPlacementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacementProps,
  ) : CdkObject(cdkObject), CfnPlacementProps {
    /**
     * The devices to associate with the placement, as defined by a mapping of zero or more
     * key-value pairs wherein the key is a template name and the value is a device ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
     */
    override fun associatedDevices(): Any? = unwrap(this).getAssociatedDevices()

    /**
     * The user-defined attributes associated with the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The name of the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
     */
    override fun placementName(): String? = unwrap(this).getPlacementName()

    /**
     * The name of the project containing the placement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
     */
    override fun projectName(): String = unwrap(this).getProjectName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlacementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnPlacementProps):
        CfnPlacementProps = CdkObjectWrappers.wrap(cdkObject) as CfnPlacementProps

    internal fun unwrap(wrapped: CfnPlacementProps):
        software.amazon.awscdk.services.iot1click.CfnPlacementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot1click.CfnPlacementProps
  }
}
