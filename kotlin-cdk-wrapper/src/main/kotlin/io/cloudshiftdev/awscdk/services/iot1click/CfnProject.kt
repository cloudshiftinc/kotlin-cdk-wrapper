@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IoT1Click::Project` resource creates an empty project with a placement template.
 *
 * A project contains zero or more placements that adhere to the placement template defined in the
 * project. For more information, see
 * [CreateProject](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_CreateProject.html)
 * in the *AWS IoT 1-Click Projects API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot1click.*;
 * Object callbackOverrides;
 * Object defaultAttributes;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
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
public open class CfnProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot1click.CfnProject,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps,
  ) :
      this(software.amazon.awscdk.services.iot1click.CfnProject(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnProjectProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the project, such as
   * `arn:aws:iot1click:us-east-1:123456789012:projects/project-a1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the project, such as `project-a1bzhi` .
   */
  public open fun attrProjectName(): String = unwrap(this).getAttrProjectName()

  /**
   * The description of the project.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the project.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An object describing the project's placement specifications.
   */
  public open fun placementTemplate(): Any = unwrap(this).getPlacementTemplate()

  /**
   * An object describing the project's placement specifications.
   */
  public open fun placementTemplate(`value`: IResolvable) {
    unwrap(this).setPlacementTemplate(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object describing the project's placement specifications.
   */
  public open fun placementTemplate(`value`: PlacementTemplateProperty) {
    unwrap(this).setPlacementTemplate(`value`.let(PlacementTemplateProperty::unwrap))
  }

  /**
   * An object describing the project's placement specifications.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("36e534349e8c355573d2f3a2c312529f9f6f5e28864d7d09130c4975173b649f")
  public open fun placementTemplate(`value`: PlacementTemplateProperty.Builder.() -> Unit): Unit =
      placementTemplate(PlacementTemplateProperty(`value`))

  /**
   * The name of the project from which to obtain information.
   */
  public open fun projectName(): String? = unwrap(this).getProjectName()

  /**
   * The name of the project from which to obtain information.
   */
  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot1click.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
     * @param description The description of the project. 
     */
    public fun description(description: String)

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    public fun placementTemplate(placementTemplate: IResolvable)

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    public fun placementTemplate(placementTemplate: PlacementTemplateProperty)

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ac3a1f80fd46182218bfd96b96a0cfed1cbc7a13894f7464c96e24fa4a74f97")
    public fun placementTemplate(placementTemplate: PlacementTemplateProperty.Builder.() -> Unit)

    /**
     * The name of the project from which to obtain information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
     * @param projectName The name of the project from which to obtain information. 
     */
    public fun projectName(projectName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnProject.Builder =
        software.amazon.awscdk.services.iot1click.CfnProject.Builder.create(scope, id)

    /**
     * The description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
     * @param description The description of the project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    override fun placementTemplate(placementTemplate: IResolvable) {
      cdkBuilder.placementTemplate(placementTemplate.let(IResolvable::unwrap))
    }

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    override fun placementTemplate(placementTemplate: PlacementTemplateProperty) {
      cdkBuilder.placementTemplate(placementTemplate.let(PlacementTemplateProperty::unwrap))
    }

    /**
     * An object describing the project's placement specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
     * @param placementTemplate An object describing the project's placement specifications. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ac3a1f80fd46182218bfd96b96a0cfed1cbc7a13894f7464c96e24fa4a74f97")
    override fun placementTemplate(placementTemplate: PlacementTemplateProperty.Builder.() -> Unit):
        Unit = placementTemplate(PlacementTemplateProperty(placementTemplate))

    /**
     * The name of the project from which to obtain information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
     * @param projectName The name of the project from which to obtain information. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot1click.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.iot1click.CfnProject =
        wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot1click.*;
   * Object callbackOverrides;
   * DeviceTemplateProperty deviceTemplateProperty = DeviceTemplateProperty.builder()
   * .callbackOverrides(callbackOverrides)
   * .deviceType("deviceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html)
   */
  public interface DeviceTemplateProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides)
     */
    public fun callbackOverrides(): Any? = unwrap(this).getCallbackOverrides()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype)
     */
    public fun deviceType(): String? = unwrap(this).getDeviceType()

    /**
     * A builder for [DeviceTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param callbackOverrides the value to be set.
       */
      public fun callbackOverrides(callbackOverrides: Any)

      /**
       * @param deviceType the value to be set.
       */
      public fun deviceType(deviceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder =
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.builder()

      /**
       * @param callbackOverrides the value to be set.
       */
      override fun callbackOverrides(callbackOverrides: Any) {
        cdkBuilder.callbackOverrides(callbackOverrides)
      }

      /**
       * @param deviceType the value to be set.
       */
      override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty,
    ) : CdkObject(cdkObject), DeviceTemplateProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides)
       */
      override fun callbackOverrides(): Any? = unwrap(this).getCallbackOverrides()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype)
       */
      override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty):
          DeviceTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceTemplateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceTemplateProperty):
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty
    }
  }

  /**
   * In AWS CloudFormation , use the `PlacementTemplate` property type to define the template for an
   * AWS IoT 1-Click project.
   *
   * `PlacementTemplate` is a property of the `AWS::IoT1Click::Project` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot1click.*;
   * Object callbackOverrides;
   * Object defaultAttributes;
   * PlacementTemplateProperty placementTemplateProperty = PlacementTemplateProperty.builder()
   * .defaultAttributes(defaultAttributes)
   * .deviceTemplates(Map.of(
   * "deviceTemplatesKey", DeviceTemplateProperty.builder()
   * .callbackOverrides(callbackOverrides)
   * .deviceType("deviceType")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html)
   */
  public interface PlacementTemplateProperty {
    /**
     * The default attributes (key-value pairs) to be applied to all placements using this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes)
     */
    public fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

    /**
     * An object specifying the
     * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
     * for all placements using this (
     * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
     * ) template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates)
     */
    public fun deviceTemplates(): Any? = unwrap(this).getDeviceTemplates()

    /**
     * A builder for [PlacementTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultAttributes The default attributes (key-value pairs) to be applied to all
       * placements using this template.
       */
      public fun defaultAttributes(defaultAttributes: Any)

      /**
       * @param deviceTemplates An object specifying the
       * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
       * for all placements using this (
       * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
       * ) template.
       */
      public fun deviceTemplates(deviceTemplates: IResolvable)

      /**
       * @param deviceTemplates An object specifying the
       * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
       * for all placements using this (
       * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
       * ) template.
       */
      public fun deviceTemplates(deviceTemplates: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder =
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.builder()

      /**
       * @param defaultAttributes The default attributes (key-value pairs) to be applied to all
       * placements using this template.
       */
      override fun defaultAttributes(defaultAttributes: Any) {
        cdkBuilder.defaultAttributes(defaultAttributes)
      }

      /**
       * @param deviceTemplates An object specifying the
       * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
       * for all placements using this (
       * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
       * ) template.
       */
      override fun deviceTemplates(deviceTemplates: IResolvable) {
        cdkBuilder.deviceTemplates(deviceTemplates.let(IResolvable::unwrap))
      }

      /**
       * @param deviceTemplates An object specifying the
       * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
       * for all placements using this (
       * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
       * ) template.
       */
      override fun deviceTemplates(deviceTemplates: Map<String, Any>) {
        cdkBuilder.deviceTemplates(deviceTemplates)
      }

      public fun build():
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty,
    ) : CdkObject(cdkObject), PlacementTemplateProperty {
      /**
       * The default attributes (key-value pairs) to be applied to all placements using this
       * template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes)
       */
      override fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

      /**
       * An object specifying the
       * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
       * for all placements using this (
       * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
       * ) template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates)
       */
      override fun deviceTemplates(): Any? = unwrap(this).getDeviceTemplates()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty):
          PlacementTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PlacementTemplateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTemplateProperty):
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty
    }
  }
}
