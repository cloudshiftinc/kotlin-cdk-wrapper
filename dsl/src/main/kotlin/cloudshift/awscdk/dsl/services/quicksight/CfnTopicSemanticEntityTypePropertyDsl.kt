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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a semantic entity type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SemanticEntityTypeProperty semanticEntityTypeProperty = SemanticEntityTypeProperty.builder()
 * .subTypeName("subTypeName")
 * .typeName("typeName")
 * .typeParameters(Map.of(
 * "typeParametersKey", "typeParameters"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html)
 */
@CdkDslMarker
public class CfnTopicSemanticEntityTypePropertyDsl {
    private val cdkBuilder: CfnTopic.SemanticEntityTypeProperty.Builder =
        CfnTopic.SemanticEntityTypeProperty.builder()

    /** @param subTypeName The semantic entity sub type name. */
    public fun subTypeName(subTypeName: String) {
        cdkBuilder.subTypeName(subTypeName)
    }

    /** @param typeName The semantic entity type name. */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /** @param typeParameters The semantic entity type parameters. */
    public fun typeParameters(typeParameters: Map<String, String>) {
        cdkBuilder.typeParameters(typeParameters)
    }

    /** @param typeParameters The semantic entity type parameters. */
    public fun typeParameters(typeParameters: IResolvable) {
        cdkBuilder.typeParameters(typeParameters)
    }

    public fun build(): CfnTopic.SemanticEntityTypeProperty = cdkBuilder.build()
}
