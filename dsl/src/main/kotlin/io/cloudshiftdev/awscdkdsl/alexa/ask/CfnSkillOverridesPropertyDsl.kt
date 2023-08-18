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

package io.cloudshiftdev.awscdkdsl.alexa.ask

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill

/**
 * The `Overrides` property type provides overrides to the skill package to apply when creating or
 * updating the skill.
 *
 * Values provided here do not modify the contents of the original skill package. Currently, only
 * overriding values inside of the skill manifest component of the package is supported.
 *
 * `Overrides` is a property of the `Alexa::ASK::Skill SkillPackage` property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.alexa.ask.*;
 * Object manifest;
 * OverridesProperty overridesProperty = OverridesProperty.builder()
 * .manifest(manifest)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-overrides.html)
 */
@CdkDslMarker
public class CfnSkillOverridesPropertyDsl {
    private val cdkBuilder: CfnSkill.OverridesProperty.Builder =
        CfnSkill.OverridesProperty.builder()

    /**
     * @param manifest Overrides to apply to the skill manifest inside of the skill package. The
     *   skill manifest contains metadata about the skill. For more information, see .
     */
    public fun manifest(manifest: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(manifest)
        cdkBuilder.manifest(builder.map)
    }

    /**
     * @param manifest Overrides to apply to the skill manifest inside of the skill package. The
     *   skill manifest contains metadata about the skill. For more information, see .
     */
    public fun manifest(manifest: Any) {
        cdkBuilder.manifest(manifest)
    }

    public fun build(): CfnSkill.OverridesProperty = cdkBuilder.build()
}
