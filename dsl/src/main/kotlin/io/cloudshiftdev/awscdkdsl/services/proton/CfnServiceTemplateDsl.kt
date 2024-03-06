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
import software.amazon.awscdk.services.proton.CfnServiceTemplate
import software.constructs.Construct

/**
 * Create a service template.
 *
 * The administrator creates a service template to define standardized infrastructure and an
 * optional CI/CD service pipeline. Developers, in turn, select the service template from AWS Proton
 * . If the selected service template includes a service pipeline definition, they provide a link to
 * their source code repository. AWS Proton then deploys and manages the infrastructure defined by
 * the selected service template. For more information, see
 * [AWS Proton templates](https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html) in
 * the *AWS Proton User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.proton.*;
 * CfnServiceTemplate cfnServiceTemplate = CfnServiceTemplate.Builder.create(this,
 * "MyCfnServiceTemplate")
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
public class CfnServiceTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceTemplate.Builder =
        CfnServiceTemplate.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-description)
     *
     * @param description A description of the service template.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The service template name as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-displayname)
     *
     * @param displayName The service template name as displayed in the developer interface.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The customer provided service template encryption key that's used to encrypt data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-encryptionkey)
     *
     * @param encryptionKey The customer provided service template encryption key that's used to
     *   encrypt data.
     */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The name of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-name)
     *
     * @param name The name of the service template.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
     *
     * Otherwise, a service pipeline *isn't* included in the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-pipelineprovisioning)
     *
     * @param pipelineProvisioning If `pipelineProvisioning` is `true` , a service pipeline is
     *   included in the service template.
     */
    public fun pipelineProvisioning(pipelineProvisioning: String) {
        cdkBuilder.pipelineProvisioning(pipelineProvisioning)
    }

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     *
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     *   version of a service template.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     *
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     *   version of a service template.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceTemplate {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
