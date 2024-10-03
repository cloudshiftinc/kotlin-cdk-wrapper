@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot1click.*;
 * Object callbackOverrides;
 * Object defaultAttributes;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .placementTemplate(PlacementTemplateProperty.builder()
 * .defaultAttributes(defaultAttributes)
 * .deviceTemplates(Map.of(
 * "deviceTemplatesKey", DeviceTemplateProperty.builder()
 * .callbackOverrides(callbackOverrides)
 * .deviceType("deviceType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .description("description")
 * .projectName("projectName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html)
 */
public interface CfnProjectProps {
  /**
   * The description of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An object describing the project's placement specifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
   */
  public fun placementTemplate(): Any

  /**
   * The name of the project from which to obtain information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
   */
  public fun projectName(): String? = unwrap(this).getProjectName()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the project.
     */
    public fun description(description: String)

    /**
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    public fun placementTemplate(placementTemplate: IResolvable)

    /**
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    public fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty)

    /**
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("711c77e633b457a35fadf1453a24c72a6b8db410a655f53352c3104af65182ce")
    public
        fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty.Builder.() -> Unit)

    /**
     * @param projectName The name of the project from which to obtain information.
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder =
        software.amazon.awscdk.services.iot1click.CfnProjectProps.builder()

    /**
     * @param description The description of the project.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    override fun placementTemplate(placementTemplate: IResolvable) {
      cdkBuilder.placementTemplate(placementTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    override fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty) {
      cdkBuilder.placementTemplate(placementTemplate.let(CfnProject.PlacementTemplateProperty.Companion::unwrap))
    }

    /**
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("711c77e633b457a35fadf1453a24c72a6b8db410a655f53352c3104af65182ce")
    override
        fun placementTemplate(placementTemplate: CfnProject.PlacementTemplateProperty.Builder.() -> Unit):
        Unit = placementTemplate(CfnProject.PlacementTemplateProperty(placementTemplate))

    /**
     * @param projectName The name of the project from which to obtain information.
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot1click.CfnProjectProps,
  ) : CdkObject(cdkObject),
      CfnProjectProps {
    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     */
    override fun placementTemplate(): Any = unwrap(this).getPlacementTemplate()

    /**
     * The name of the project from which to obtain information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
     */
    override fun projectName(): String? = unwrap(this).getProjectName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.iot1click.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot1click.CfnProjectProps
  }
}
