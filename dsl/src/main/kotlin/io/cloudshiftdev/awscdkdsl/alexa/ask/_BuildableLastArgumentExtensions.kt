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

import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill

/** Login with Amazon (LWA) configuration used to authenticate with the Alexa service. */
public inline fun CfnSkill.setAuthenticationConfiguration(
    block: CfnSkillAuthenticationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSkillAuthenticationConfigurationPropertyDsl()
    builder.apply(block)
    return setAuthenticationConfiguration(builder.build())
}

/** Configuration for the skill package that contains the components of the Alexa skill. */
public inline fun CfnSkill.setSkillPackage(block: CfnSkillSkillPackagePropertyDsl.() -> Unit = {}) {
    val builder = CfnSkillSkillPackagePropertyDsl()
    builder.apply(block)
    return setSkillPackage(builder.build())
}
