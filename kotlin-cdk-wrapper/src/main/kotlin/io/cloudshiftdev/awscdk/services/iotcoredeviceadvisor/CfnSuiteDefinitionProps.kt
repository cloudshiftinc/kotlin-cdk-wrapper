@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSuiteDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor.*;
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
public interface CfnSuiteDefinitionProps {
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
   * * ***rootGroup*** - The test suite root group. For more information on creating and using root
   * groups see the [Device Advisor
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
   */
  public fun suiteDefinitionConfiguration(): Any

  /**
   * Metadata that can be used to manage the the Suite Definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSuiteDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param suiteDefinitionConfiguration The configuration of the Suite Definition. Listed below
     * are the required elements of the `SuiteDefinitionConfiguration` . 
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
     */
    public fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any)

    /**
     * @param tags Metadata that can be used to manage the the Suite Definition.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the the Suite Definition.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps.Builder =
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps.builder()

    /**
     * @param suiteDefinitionConfiguration The configuration of the Suite Definition. Listed below
     * are the required elements of the `SuiteDefinitionConfiguration` . 
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
     */
    override fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any) {
      cdkBuilder.suiteDefinitionConfiguration(suiteDefinitionConfiguration)
    }

    /**
     * @param tags Metadata that can be used to manage the the Suite Definition.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the the Suite Definition.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps,
  ) : CdkObject(cdkObject), CfnSuiteDefinitionProps {
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
     */
    override fun suiteDefinitionConfiguration(): Any =
        unwrap(this).getSuiteDefinitionConfiguration()

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSuiteDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps):
        CfnSuiteDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSuiteDefinitionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSuiteDefinitionProps):
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
  }
}
