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

package io.cloudshiftdev.awscdkdsl.services.proton

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.proton.CfnServiceTemplateProps

/**
 * Properties for defining a `CfnServiceTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.proton.*;
 * CfnServiceTemplateProps cfnServiceTemplateProps = CfnServiceTemplateProps.builder()
 * .description("description")
 * .displayName("displayName")
 * .encryptionKey("encryptionKey")
 * .name("name")
 * .pipelineProvisioning("pipelineProvisioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html)
 */
@CdkDslMarker
public class CfnServiceTemplatePropsDsl {
    private val cdkBuilder: CfnServiceTemplateProps.Builder = CfnServiceTemplateProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the service template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param displayName The service template name as displayed in the developer interface. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param encryptionKey The customer provided service template encryption key that's used to
     *   encrypt data.
     */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param name The name of the service template. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param pipelineProvisioning If `pipelineProvisioning` is `true` , a service pipeline is
     *   included in the service template. Otherwise, a service pipeline *isn't* included in the
     *   service template.
     */
    public fun pipelineProvisioning(pipelineProvisioning: String) {
        cdkBuilder.pipelineProvisioning(pipelineProvisioning)
    }

    /**
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     *   version of a service template.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     *   version of a service template.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceTemplateProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
