@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.alexa.ask

import software.amazon.awscdk.alexa.ask.CfnSkill
import software.amazon.awscdk.alexa.ask.CfnSkillProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object ask {
    public inline fun cfnSkill(
        scope: Construct,
        id: String,
        block: CfnSkillDsl.() -> Unit = {},
    ): CfnSkill {
        val builder = CfnSkillDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSkillAuthenticationConfigurationProperty(
        block: CfnSkillAuthenticationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnSkill.AuthenticationConfigurationProperty {
        val builder = CfnSkillAuthenticationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSkillOverridesProperty(block: CfnSkillOverridesPropertyDsl.() -> Unit = {}): CfnSkill.OverridesProperty {
        val builder = CfnSkillOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSkillProps(block: CfnSkillPropsDsl.() -> Unit = {}): CfnSkillProps {
        val builder = CfnSkillPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSkillSkillPackageProperty(
        block: CfnSkillSkillPackagePropertyDsl.() -> Unit =
            {},
    ): CfnSkill.SkillPackageProperty {
        val builder = CfnSkillSkillPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
