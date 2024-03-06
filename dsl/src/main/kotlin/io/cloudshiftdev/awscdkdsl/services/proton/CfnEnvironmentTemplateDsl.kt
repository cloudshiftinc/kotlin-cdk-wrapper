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
import software.amazon.awscdk.services.proton.CfnEnvironmentTemplate
import software.constructs.Construct

/**
 * Create an environment template for AWS Proton .
 *
 * For more information, see
 * [Environment Templates](https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html) in
 * the *AWS Proton User Guide* .
 *
 * You can create an environment template in one of the two following ways:
 * * Register and publish a *standard* environment template that instructs AWS Proton to deploy and
 *   manage environment infrastructure.
 * * Register and publish a *customer managed* environment template that connects AWS Proton to your
 *   existing provisioned infrastructure that you manage. AWS Proton *doesn't* manage your existing
 *   provisioned infrastructure. To create an environment template for customer provisioned and
 *   managed infrastructure, include the `provisioning` parameter and set the value to
 *   `CUSTOMER_MANAGED` . For more information, see
 *   [Register and publish an environment template](https://docs.aws.amazon.com/proton/latest/userguide/template-create.html)
 *   in the *AWS Proton User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.proton.*;
 * CfnEnvironmentTemplate cfnEnvironmentTemplate = CfnEnvironmentTemplate.Builder.create(this,
 * "MyCfnEnvironmentTemplate")
 * .description("description")
 * .displayName("displayName")
 * .encryptionKey("encryptionKey")
 * .name("name")
 * .provisioning("provisioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html)
 */
@CdkDslMarker
public class CfnEnvironmentTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironmentTemplate.Builder =
        CfnEnvironmentTemplate.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-description)
     *
     * @param description A description of the environment template.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the environment template as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-displayname)
     *
     * @param displayName The name of the environment template as displayed in the developer
     *   interface.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The customer provided encryption key for the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-encryptionkey)
     *
     * @param encryptionKey The customer provided encryption key for the environment template.
     */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The name of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-name)
     *
     * @param name The name of the environment template.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * When included, indicates that the environment template is for customer provisioned and
     * managed infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-provisioning)
     *
     * @param provisioning When included, indicates that the environment template is for customer
     *   provisioned and managed infrastructure.
     */
    public fun provisioning(provisioning: String) {
        cdkBuilder.provisioning(provisioning)
    }

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see
     * [AWS Proton resources and tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html)
     * in the *AWS Proton User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     *
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     *   environment template.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see
     * [AWS Proton resources and tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html)
     * in the *AWS Proton User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     *
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     *   environment template.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironmentTemplate {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
