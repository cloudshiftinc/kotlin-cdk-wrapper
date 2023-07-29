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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps

/**
 * Properties for defining a `CfnExtensionAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnExtensionAssociationProps cfnExtensionAssociationProps =
 * CfnExtensionAssociationProps.builder()
 * .extensionIdentifier("extensionIdentifier")
 * .extensionVersionNumber(123)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html)
 */
@CdkDslMarker
public class CfnExtensionAssociationPropsDsl {
    private val cdkBuilder: CfnExtensionAssociationProps.Builder =
        CfnExtensionAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param extensionIdentifier The name, the ID, or the Amazon Resource Name (ARN) of the
     *   extension.
     */
    public fun extensionIdentifier(extensionIdentifier: String) {
        cdkBuilder.extensionIdentifier(extensionIdentifier)
    }

    /**
     * @param extensionVersionNumber The version number of the extension. If not specified, AWS
     *   AppConfig uses the maximum version of the extension.
     */
    public fun extensionVersionNumber(extensionVersionNumber: Number) {
        cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    /**
     * @param parameters The parameter names and values defined in the extensions. Extension
     *   parameters marked `Required` must be entered for this field.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param parameters The parameter names and values defined in the extensions. Extension
     *   parameters marked `Required` must be entered for this field.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param resourceIdentifier The ARN of an application, configuration profile, or environment.
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param tags Adds one or more tags for the specified extension association. Tags are metadata
     *   that help you categorize resources in different ways, for example, by purpose, owner, or
     *   environment. Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Adds one or more tags for the specified extension association. Tags are metadata
     *   that help you categorize resources in different ways, for example, by purpose, owner, or
     *   environment. Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnExtensionAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
