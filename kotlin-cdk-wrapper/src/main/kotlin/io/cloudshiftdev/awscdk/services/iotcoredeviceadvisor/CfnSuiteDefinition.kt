@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Device Advisor test suite.
 *
 * Requires permission to access the
 * [CreateSuiteDefinition](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor.*;
 * Object suiteDefinitionConfiguration;
 * CfnSuiteDefinition cfnSuiteDefinition = CfnSuiteDefinition.Builder.create(this,
 * "MyCfnSuiteDefinition")
 * .suiteDefinitionConfiguration(suiteDefinitionConfiguration)
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html)
 */
public open class CfnSuiteDefinition(
  cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSuiteDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSuiteDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSuiteDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSuiteDefinitionProps(props)
  )

  /**
   * The Arn of the Suite Definition.
   */
  public open fun attrSuiteDefinitionArn(): String = unwrap(this).getAttrSuiteDefinitionArn()

  /**
   * The version of the Suite Definition.
   */
  public open fun attrSuiteDefinitionId(): String = unwrap(this).getAttrSuiteDefinitionId()

  /**
   * The ID of the Suite Definition.
   */
  public open fun attrSuiteDefinitionVersion(): String =
      unwrap(this).getAttrSuiteDefinitionVersion()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration of the Suite Definition.
   *
   * Listed below are the required elements of the `SuiteDefinitionConfiguration` .
   */
  public open fun suiteDefinitionConfiguration(): Any =
      unwrap(this).getSuiteDefinitionConfiguration()

  /**
   * The configuration of the Suite Definition.
   *
   * Listed below are the required elements of the `SuiteDefinitionConfiguration` .
   */
  public open fun suiteDefinitionConfiguration(`value`: Any) {
    unwrap(this).setSuiteDefinitionConfiguration(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the the Suite Definition.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the the Suite Definition.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the the Suite Definition.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration of the Suite Definition. Listed below are the required elements of the
     * `SuiteDefinitionConfiguration` .
     *
     * * ***devicePermissionRoleArn*** - The device permission arn.
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * * ***devices*** - The list of configured devices under test. For more information on devices
     * under test, see
     * [DeviceUnderTest](https://docs.aws.amazon.com/iot/latest/apireference/API_iotdeviceadvisor_DeviceUnderTest.html)
     *
     * Not a required element.
     *
     * *Type:* List of devices under test
     *
     * * ***intendedForQualification*** - The tests intended for qualification in a suite.
     *
     * Not a required element.
     *
     * *Type:* Boolean
     *
     * * ***rootGroup*** - The test suite root group. For more information on creating and using
     * root groups see the [Device Advisor
     * workflow](https://docs.aws.amazon.com/iot/latest/developerguide/device-advisor-workflow.html) .
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * * ***suiteDefinitionName*** - The Suite Definition Configuration name.
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration)
     * @param suiteDefinitionConfiguration The configuration of the Suite Definition. Listed below
     * are the required elements of the `SuiteDefinitionConfiguration` . 
     */
    public fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any)

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     * @param tags Metadata that can be used to manage the the Suite Definition. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     * @param tags Metadata that can be used to manage the the Suite Definition. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.Builder =
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.Builder.create(scope,
        id)

    /**
     * The configuration of the Suite Definition. Listed below are the required elements of the
     * `SuiteDefinitionConfiguration` .
     *
     * * ***devicePermissionRoleArn*** - The device permission arn.
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * * ***devices*** - The list of configured devices under test. For more information on devices
     * under test, see
     * [DeviceUnderTest](https://docs.aws.amazon.com/iot/latest/apireference/API_iotdeviceadvisor_DeviceUnderTest.html)
     *
     * Not a required element.
     *
     * *Type:* List of devices under test
     *
     * * ***intendedForQualification*** - The tests intended for qualification in a suite.
     *
     * Not a required element.
     *
     * *Type:* Boolean
     *
     * * ***rootGroup*** - The test suite root group. For more information on creating and using
     * root groups see the [Device Advisor
     * workflow](https://docs.aws.amazon.com/iot/latest/developerguide/device-advisor-workflow.html) .
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * * ***suiteDefinitionName*** - The Suite Definition Configuration name.
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration)
     * @param suiteDefinitionConfiguration The configuration of the Suite Definition. Listed below
     * are the required elements of the `SuiteDefinitionConfiguration` . 
     */
    override fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any) {
      cdkBuilder.suiteDefinitionConfiguration(suiteDefinitionConfiguration)
    }

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     * @param tags Metadata that can be used to manage the the Suite Definition. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     * @param tags Metadata that can be used to manage the the Suite Definition. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSuiteDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSuiteDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition):
        CfnSuiteDefinition = CfnSuiteDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnSuiteDefinition):
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition = wrapped.cdkObject
        as software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
  }

  /**
   * Information of a test device.
   *
   * A thing ARN, certificate ARN or device role ARN is required.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor.*;
   * DeviceUnderTestProperty deviceUnderTestProperty = DeviceUnderTestProperty.builder()
   * .certificateArn("certificateArn")
   * .thingArn("thingArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html)
   */
  public interface DeviceUnderTestProperty {
    /**
     * Lists device's certificate ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html#cfn-iotcoredeviceadvisor-suitedefinition-deviceundertest-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Lists device's thing ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html#cfn-iotcoredeviceadvisor-suitedefinition-deviceundertest-thingarn)
     */
    public fun thingArn(): String? = unwrap(this).getThingArn()

    /**
     * A builder for [DeviceUnderTestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn Lists device's certificate ARN.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param thingArn Lists device's thing ARN.
       */
      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty.Builder
          =
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty.builder()

      /**
       * @param certificateArn Lists device's certificate ARN.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param thingArn Lists device's thing ARN.
       */
      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty,
    ) : CdkObject(cdkObject), DeviceUnderTestProperty {
      /**
       * Lists device's certificate ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html#cfn-iotcoredeviceadvisor-suitedefinition-deviceundertest-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Lists device's thing ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html#cfn-iotcoredeviceadvisor-suitedefinition-deviceundertest-thingarn)
       */
      override fun thingArn(): String? = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceUnderTestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty):
          DeviceUnderTestProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceUnderTestProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceUnderTestProperty):
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.DeviceUnderTestProperty
    }
  }

  /**
   * Gets the suite definition configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor.*;
   * SuiteDefinitionConfigurationProperty suiteDefinitionConfigurationProperty =
   * SuiteDefinitionConfigurationProperty.builder()
   * .devicePermissionRoleArn("devicePermissionRoleArn")
   * .rootGroup("rootGroup")
   * // the properties below are optional
   * .devices(List.of(DeviceUnderTestProperty.builder()
   * .certificateArn("certificateArn")
   * .thingArn("thingArn")
   * .build()))
   * .intendedForQualification(false)
   * .suiteDefinitionName("suiteDefinitionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html)
   */
  public interface SuiteDefinitionConfigurationProperty {
    /**
     * Gets the device permission ARN.
     *
     * This is a required parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-devicepermissionrolearn)
     */
    public fun devicePermissionRoleArn(): String

    /**
     * Gets the devices configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-devices)
     */
    public fun devices(): Any? = unwrap(this).getDevices()

    /**
     * Gets the tests intended for qualification in a suite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-intendedforqualification)
     */
    public fun intendedForQualification(): Any? = unwrap(this).getIntendedForQualification()

    /**
     * Gets the test suite root group.
     *
     * This is a required parameter. For updating or creating the latest qualification suite, if
     * `intendedForQualification` is set to true, `rootGroup` can be an empty string. If
     * `intendedForQualification` is false, `rootGroup` cannot be an empty string. If `rootGroup` is
     * empty, and `intendedForQualification` is set to true, all the qualification tests are included,
     * and the configuration is default.
     *
     * For a qualification suite, the minimum length is 0, and the maximum is 2048. For a
     * non-qualification suite, the minimum length is 1, and the maximum is 2048.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-rootgroup)
     */
    public fun rootGroup(): String

    /**
     * Gets the suite definition name.
     *
     * This is a required parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-suitedefinitionname)
     */
    public fun suiteDefinitionName(): String? = unwrap(this).getSuiteDefinitionName()

    /**
     * A builder for [SuiteDefinitionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param devicePermissionRoleArn Gets the device permission ARN. 
       * This is a required parameter.
       */
      public fun devicePermissionRoleArn(devicePermissionRoleArn: String)

      /**
       * @param devices Gets the devices configured.
       */
      public fun devices(devices: IResolvable)

      /**
       * @param devices Gets the devices configured.
       */
      public fun devices(devices: List<Any>)

      /**
       * @param devices Gets the devices configured.
       */
      public fun devices(vararg devices: Any)

      /**
       * @param intendedForQualification Gets the tests intended for qualification in a suite.
       */
      public fun intendedForQualification(intendedForQualification: Boolean)

      /**
       * @param intendedForQualification Gets the tests intended for qualification in a suite.
       */
      public fun intendedForQualification(intendedForQualification: IResolvable)

      /**
       * @param rootGroup Gets the test suite root group. 
       * This is a required parameter. For updating or creating the latest qualification suite, if
       * `intendedForQualification` is set to true, `rootGroup` can be an empty string. If
       * `intendedForQualification` is false, `rootGroup` cannot be an empty string. If `rootGroup` is
       * empty, and `intendedForQualification` is set to true, all the qualification tests are
       * included, and the configuration is default.
       *
       * For a qualification suite, the minimum length is 0, and the maximum is 2048. For a
       * non-qualification suite, the minimum length is 1, and the maximum is 2048.
       */
      public fun rootGroup(rootGroup: String)

      /**
       * @param suiteDefinitionName Gets the suite definition name.
       * This is a required parameter.
       */
      public fun suiteDefinitionName(suiteDefinitionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.builder()

      /**
       * @param devicePermissionRoleArn Gets the device permission ARN. 
       * This is a required parameter.
       */
      override fun devicePermissionRoleArn(devicePermissionRoleArn: String) {
        cdkBuilder.devicePermissionRoleArn(devicePermissionRoleArn)
      }

      /**
       * @param devices Gets the devices configured.
       */
      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      /**
       * @param devices Gets the devices configured.
       */
      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      /**
       * @param devices Gets the devices configured.
       */
      override fun devices(vararg devices: Any): Unit = devices(devices.toList())

      /**
       * @param intendedForQualification Gets the tests intended for qualification in a suite.
       */
      override fun intendedForQualification(intendedForQualification: Boolean) {
        cdkBuilder.intendedForQualification(intendedForQualification)
      }

      /**
       * @param intendedForQualification Gets the tests intended for qualification in a suite.
       */
      override fun intendedForQualification(intendedForQualification: IResolvable) {
        cdkBuilder.intendedForQualification(intendedForQualification.let(IResolvable::unwrap))
      }

      /**
       * @param rootGroup Gets the test suite root group. 
       * This is a required parameter. For updating or creating the latest qualification suite, if
       * `intendedForQualification` is set to true, `rootGroup` can be an empty string. If
       * `intendedForQualification` is false, `rootGroup` cannot be an empty string. If `rootGroup` is
       * empty, and `intendedForQualification` is set to true, all the qualification tests are
       * included, and the configuration is default.
       *
       * For a qualification suite, the minimum length is 0, and the maximum is 2048. For a
       * non-qualification suite, the minimum length is 1, and the maximum is 2048.
       */
      override fun rootGroup(rootGroup: String) {
        cdkBuilder.rootGroup(rootGroup)
      }

      /**
       * @param suiteDefinitionName Gets the suite definition name.
       * This is a required parameter.
       */
      override fun suiteDefinitionName(suiteDefinitionName: String) {
        cdkBuilder.suiteDefinitionName(suiteDefinitionName)
      }

      public fun build():
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty,
    ) : CdkObject(cdkObject), SuiteDefinitionConfigurationProperty {
      /**
       * Gets the device permission ARN.
       *
       * This is a required parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-devicepermissionrolearn)
       */
      override fun devicePermissionRoleArn(): String = unwrap(this).getDevicePermissionRoleArn()

      /**
       * Gets the devices configured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-devices)
       */
      override fun devices(): Any? = unwrap(this).getDevices()

      /**
       * Gets the tests intended for qualification in a suite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-intendedforqualification)
       */
      override fun intendedForQualification(): Any? = unwrap(this).getIntendedForQualification()

      /**
       * Gets the test suite root group.
       *
       * This is a required parameter. For updating or creating the latest qualification suite, if
       * `intendedForQualification` is set to true, `rootGroup` can be an empty string. If
       * `intendedForQualification` is false, `rootGroup` cannot be an empty string. If `rootGroup` is
       * empty, and `intendedForQualification` is set to true, all the qualification tests are
       * included, and the configuration is default.
       *
       * For a qualification suite, the minimum length is 0, and the maximum is 2048. For a
       * non-qualification suite, the minimum length is 1, and the maximum is 2048.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-rootgroup)
       */
      override fun rootGroup(): String = unwrap(this).getRootGroup()

      /**
       * Gets the suite definition name.
       *
       * This is a required parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration-suitedefinitionname)
       */
      override fun suiteDefinitionName(): String? = unwrap(this).getSuiteDefinitionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SuiteDefinitionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty):
          SuiteDefinitionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SuiteDefinitionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuiteDefinitionConfigurationProperty):
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.SuiteDefinitionConfigurationProperty
    }
  }
}
