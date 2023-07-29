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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps
import software.constructs.Construct

public object iotthingsgraph {
    /**
     * Resource Type definition for AWS::IoTThingsGraph::FlowTemplate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotthingsgraph.*;
     * CfnFlowTemplate cfnFlowTemplate = CfnFlowTemplate.Builder.create(this, "MyCfnFlowTemplate")
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
    public inline fun cfnFlowTemplate(
        scope: Construct,
        id: String,
        block: CfnFlowTemplateDsl.() -> Unit = {},
    ): CfnFlowTemplate {
        val builder = CfnFlowTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotthingsgraph.*;
     * DefinitionDocumentProperty definitionDocumentProperty = DefinitionDocumentProperty.builder()
     * .language("language")
     * .text("text")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html)
     */
    public inline fun cfnFlowTemplateDefinitionDocumentProperty(
        block: CfnFlowTemplateDefinitionDocumentPropertyDsl.() -> Unit = {}
    ): CfnFlowTemplate.DefinitionDocumentProperty {
        val builder = CfnFlowTemplateDefinitionDocumentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnFlowTemplateProps(
        block: CfnFlowTemplatePropsDsl.() -> Unit = {}
    ): CfnFlowTemplateProps {
        val builder = CfnFlowTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
