@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import software.constructs.Construct

/**
 * Creates a Device Advisor test suite.
 *
 * Requires permission to access the
 * [CreateSuiteDefinition](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
 * action.
 *
 * Example:
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
@CdkDslMarker
public class CfnSuiteDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSuiteDefinition.Builder =
        CfnSuiteDefinition.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The configuration of the Suite Definition. Listed below are the required elements of the
     * `SuiteDefinitionConfiguration` .
     * * ***devicePermissionRoleArn*** - The device permission arn.
     *
     * This is a required element.
     *
     * *Type:* String
     * * ***devices*** - The list of configured devices under test. For more information on devices
     *   under test, see
     *   [DeviceUnderTest](https://docs.aws.amazon.com/iot/latest/apireference/API_iotdeviceadvisor_DeviceUnderTest.html)
     *
     * Not a required element.
     *
     * *Type:* List of devices under test
     * * ***intendedForQualification*** - The tests intended for qualification in a suite.
     *
     * Not a required element.
     *
     * *Type:* Boolean
     * * ***rootGroup*** - The test suite root group. For more information on creating and using
     *   root groups see the
     *   [Device Advisor workflow](https://docs.aws.amazon.com/iot/latest/developerguide/device-advisor-workflow.html)
     *   .
     *
     * This is a required element.
     *
     * *Type:* String
     * * ***suiteDefinitionName*** - The Suite Definition Configuration name.
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration)
     *
     * @param suiteDefinitionConfiguration The configuration of the Suite Definition. Listed below
     *   are the required elements of the `SuiteDefinitionConfiguration` .
     */
    public fun suiteDefinitionConfiguration(
        suiteDefinitionConfiguration: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(suiteDefinitionConfiguration)
        cdkBuilder.suiteDefinitionConfiguration(builder.map)
    }

    /**
     * The configuration of the Suite Definition. Listed below are the required elements of the
     * `SuiteDefinitionConfiguration` .
     * * ***devicePermissionRoleArn*** - The device permission arn.
     *
     * This is a required element.
     *
     * *Type:* String
     * * ***devices*** - The list of configured devices under test. For more information on devices
     *   under test, see
     *   [DeviceUnderTest](https://docs.aws.amazon.com/iot/latest/apireference/API_iotdeviceadvisor_DeviceUnderTest.html)
     *
     * Not a required element.
     *
     * *Type:* List of devices under test
     * * ***intendedForQualification*** - The tests intended for qualification in a suite.
     *
     * Not a required element.
     *
     * *Type:* Boolean
     * * ***rootGroup*** - The test suite root group. For more information on creating and using
     *   root groups see the
     *   [Device Advisor workflow](https://docs.aws.amazon.com/iot/latest/developerguide/device-advisor-workflow.html)
     *   .
     *
     * This is a required element.
     *
     * *Type:* String
     * * ***suiteDefinitionName*** - The Suite Definition Configuration name.
     *
     * This is a required element.
     *
     * *Type:* String
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration)
     *
     * @param suiteDefinitionConfiguration The configuration of the Suite Definition. Listed below
     *   are the required elements of the `SuiteDefinitionConfiguration` .
     */
    public fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any) {
        cdkBuilder.suiteDefinitionConfiguration(suiteDefinitionConfiguration)
    }

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     *
     * @param tags Metadata that can be used to manage the the Suite Definition.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata that can be used to manage the the Suite Definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotcoredeviceadvisor-suitedefinition.html#cfn-iotcoredeviceadvisor-suitedefinition-tags)
     *
     * @param tags Metadata that can be used to manage the the Suite Definition.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSuiteDefinition {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
