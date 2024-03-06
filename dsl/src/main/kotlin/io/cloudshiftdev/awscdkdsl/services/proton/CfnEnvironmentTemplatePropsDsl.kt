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
import software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps

/**
 * Properties for defining a `CfnEnvironmentTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.proton.*;
 * CfnEnvironmentTemplateProps cfnEnvironmentTemplateProps = CfnEnvironmentTemplateProps.builder()
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
public class CfnEnvironmentTemplatePropsDsl {
    private val cdkBuilder: CfnEnvironmentTemplateProps.Builder =
        CfnEnvironmentTemplateProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the environment template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the environment template as displayed in the developer
     *   interface.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /** @param encryptionKey The customer provided encryption key for the environment template. */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param name The name of the environment template. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param provisioning When included, indicates that the environment template is for customer
     *   provisioned and managed infrastructure.
     */
    public fun provisioning(provisioning: String) {
        cdkBuilder.provisioning(provisioning)
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     *   environment template. A tag is a key-value pair.
     *
     * For more information, see
     * [AWS Proton resources and tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html)
     * in the *AWS Proton User Guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     *   environment template. A tag is a key-value pair.
     *
     * For more information, see
     * [AWS Proton resources and tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html)
     * in the *AWS Proton User Guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironmentTemplateProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
