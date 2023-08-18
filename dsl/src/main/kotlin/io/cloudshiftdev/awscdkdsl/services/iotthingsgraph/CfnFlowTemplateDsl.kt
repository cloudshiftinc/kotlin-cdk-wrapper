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

package io.cloudshiftdev.awscdkdsl.services.iotthingsgraph

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.constructs.Construct

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
@CdkDslMarker
public class CfnFlowTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlowTemplate.Builder = CfnFlowTemplate.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion)
     *
     * @param compatibleNamespaceVersion
     */
    public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
        cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     *
     * @param definition
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     *
     * @param definition
     */
    public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
        cdkBuilder.definition(definition)
    }

    public fun build(): CfnFlowTemplate = cdkBuilder.build()
}
