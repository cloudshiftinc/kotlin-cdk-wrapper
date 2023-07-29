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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Represents information about a stage and its definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * Object configuration;
 * StageDeclarationProperty stageDeclarationProperty = StageDeclarationProperty.builder()
 * .actions(List.of(ActionDeclarationProperty.builder()
 * .actionTypeId(ActionTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .configuration(configuration)
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .namespace("namespace")
 * .outputArtifacts(List.of(OutputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .region("region")
 * .roleArn("roleArn")
 * .runOrder(123)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .blockers(List.of(BlockerDeclarationProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html)
 */
@CdkDslMarker
public class CfnPipelineStageDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.StageDeclarationProperty.Builder =
        CfnPipeline.StageDeclarationProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    private val _blockers: MutableList<Any> = mutableListOf()

    /** @param actions The actions included in a stage. */
    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    /** @param actions The actions included in a stage. */
    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    /** @param actions The actions included in a stage. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /** @param blockers Reserved for future use. */
    public fun blockers(vararg blockers: Any) {
        _blockers.addAll(listOf(*blockers))
    }

    /** @param blockers Reserved for future use. */
    public fun blockers(blockers: Collection<Any>) {
        _blockers.addAll(blockers)
    }

    /** @param blockers Reserved for future use. */
    public fun blockers(blockers: IResolvable) {
        cdkBuilder.blockers(blockers)
    }

    /** @param name The name of the stage. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPipeline.StageDeclarationProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_blockers.isNotEmpty()) cdkBuilder.blockers(_blockers)
        return cdkBuilder.build()
    }
}
