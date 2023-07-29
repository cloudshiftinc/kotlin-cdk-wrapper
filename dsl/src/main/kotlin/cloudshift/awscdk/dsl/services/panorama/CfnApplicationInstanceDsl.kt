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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.constructs.Construct

/**
 * Creates an application instance and deploys it to a device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * CfnApplicationInstance cfnApplicationInstance = CfnApplicationInstance.Builder.create(this,
 * "MyCfnApplicationInstance")
 * .defaultRuntimeContextDevice("defaultRuntimeContextDevice")
 * .manifestPayload(ManifestPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build())
 * // the properties below are optional
 * .applicationInstanceIdToReplace("applicationInstanceIdToReplace")
 * .description("description")
 * .manifestOverridesPayload(ManifestOverridesPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build())
 * .name("name")
 * .runtimeRoleArn("runtimeRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html)
 */
@CdkDslMarker
public class CfnApplicationInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationInstance.Builder =
        CfnApplicationInstance.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of an application instance to replace with the new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-applicationinstanceidtoreplace)
     *
     * @param applicationInstanceIdToReplace The ID of an application instance to replace with the
     *   new instance.
     */
    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String) {
        cdkBuilder.applicationInstanceIdToReplace(applicationInstanceIdToReplace)
    }

    /**
     * The device's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-defaultruntimecontextdevice)
     *
     * @param defaultRuntimeContextDevice The device's ID.
     */
    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String) {
        cdkBuilder.defaultRuntimeContextDevice(defaultRuntimeContextDevice)
    }

    /**
     * A description for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-description)
     *
     * @param description A description for the application instance.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     *
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable) {
        cdkBuilder.manifestOverridesPayload(manifestOverridesPayload)
    }

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     *
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    public fun manifestOverridesPayload(
        manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty
    ) {
        cdkBuilder.manifestOverridesPayload(manifestOverridesPayload)
    }

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     *
     * @param manifestPayload The application's manifest document.
     */
    public fun manifestPayload(manifestPayload: IResolvable) {
        cdkBuilder.manifestPayload(manifestPayload)
    }

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     *
     * @param manifestPayload The application's manifest document.
     */
    public fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty) {
        cdkBuilder.manifestPayload(manifestPayload)
    }

    /**
     * A name for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-name)
     *
     * @param name A name for the application instance.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN of a runtime role for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-runtimerolearn)
     *
     * @param runtimeRoleArn The ARN of a runtime role for the application instance.
     */
    public fun runtimeRoleArn(runtimeRoleArn: String) {
        cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     *
     * @param tags Tags for the application instance.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     *
     * @param tags Tags for the application instance.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationInstance {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
