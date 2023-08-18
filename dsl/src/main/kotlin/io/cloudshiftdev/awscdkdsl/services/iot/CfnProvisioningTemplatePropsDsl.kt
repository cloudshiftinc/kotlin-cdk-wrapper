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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps

/**
 * Properties for defining a `CfnProvisioningTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnProvisioningTemplateProps cfnProvisioningTemplateProps =
 * CfnProvisioningTemplateProps.builder()
 * .provisioningRoleArn("provisioningRoleArn")
 * .templateBody("templateBody")
 * // the properties below are optional
 * .description("description")
 * .enabled(false)
 * .preProvisioningHook(ProvisioningHookProperty.builder()
 * .payloadVersion("payloadVersion")
 * .targetArn("targetArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateName("templateName")
 * .templateType("templateType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-provisioningtemplate.html)
 */
@CdkDslMarker
public class CfnProvisioningTemplatePropsDsl {
    private val cdkBuilder: CfnProvisioningTemplateProps.Builder =
        CfnProvisioningTemplateProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the fleet provisioning template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param enabled True to enable the fleet provisioning template, otherwise false. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled True to enable the fleet provisioning template, otherwise false. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param preProvisioningHook Creates a pre-provisioning hook template. */
    public fun preProvisioningHook(preProvisioningHook: IResolvable) {
        cdkBuilder.preProvisioningHook(preProvisioningHook)
    }

    /** @param preProvisioningHook Creates a pre-provisioning hook template. */
    public fun preProvisioningHook(
        preProvisioningHook: CfnProvisioningTemplate.ProvisioningHookProperty
    ) {
        cdkBuilder.preProvisioningHook(preProvisioningHook)
    }

    /**
     * @param provisioningRoleArn The role ARN for the role associated with the fleet provisioning
     *   template. This IoT role grants permission to provision a device.
     */
    public fun provisioningRoleArn(provisioningRoleArn: String) {
        cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    /** @param tags Metadata that can be used to manage the fleet provisioning template. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata that can be used to manage the fleet provisioning template. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param templateBody The JSON formatted contents of the fleet provisioning template version.
     */
    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    /** @param templateName The name of the fleet provisioning template. */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    /** @param templateType The type of the provisioning template. */
    public fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
    }

    public fun build(): CfnProvisioningTemplateProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
