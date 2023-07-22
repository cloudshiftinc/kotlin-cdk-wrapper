@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
import software.constructs.Construct

public object iotcoredeviceadvisor {
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
   * import software.amazon.awscdk.services.iotcoredeviceadvisor.*;
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
  public inline fun cfnSuiteDefinition(
    scope: Construct,
    id: String,
    block: CfnSuiteDefinitionDsl.() -> Unit = {},
  ): CfnSuiteDefinition {
    val builder = CfnSuiteDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotcoredeviceadvisor.*;
   * DeviceUnderTestProperty deviceUnderTestProperty = DeviceUnderTestProperty.builder()
   * .certificateArn("certificateArn")
   * .thingArn("thingArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html)
   */
  public inline
      fun cfnSuiteDefinitionDeviceUnderTestProperty(block: CfnSuiteDefinitionDeviceUnderTestPropertyDsl.() -> Unit
      = {}): CfnSuiteDefinition.DeviceUnderTestProperty {
    val builder = CfnSuiteDefinitionDeviceUnderTestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSuiteDefinition`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotcoredeviceadvisor.*;
   * Object suiteDefinitionConfiguration;
   * CfnSuiteDefinitionProps cfnSuiteDefinitionProps = CfnSuiteDefinitionProps.builder()
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
  public inline fun cfnSuiteDefinitionProps(block: CfnSuiteDefinitionPropsDsl.() -> Unit = {}):
      CfnSuiteDefinitionProps {
    val builder = CfnSuiteDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotcoredeviceadvisor.*;
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
  public inline
      fun cfnSuiteDefinitionSuiteDefinitionConfigurationProperty(block: CfnSuiteDefinitionSuiteDefinitionConfigurationPropertyDsl.() -> Unit
      = {}): CfnSuiteDefinition.SuiteDefinitionConfigurationProperty {
    val builder = CfnSuiteDefinitionSuiteDefinitionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
