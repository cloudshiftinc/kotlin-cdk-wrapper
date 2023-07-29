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

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps

/**
 * Properties for defining a `CfnFlowTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotthingsgraph.*;
 * CfnFlowTemplateProps cfnFlowTemplateProps = CfnFlowTemplateProps.builder()
 * .definition(DefinitionDocumentProperty.builder()
 * .language("language")
 * .text("text")
 * .build())
 * // the properties below are optional
 * .compatibleNamespaceVersion(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html)
 */
@CdkDslMarker
public class CfnFlowTemplatePropsDsl {
    private val cdkBuilder: CfnFlowTemplateProps.Builder = CfnFlowTemplateProps.builder()

    /** @param compatibleNamespaceVersion the value to be set. */
    public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
        cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
        cdkBuilder.definition(definition)
    }

    public fun build(): CfnFlowTemplateProps = cdkBuilder.build()
}
