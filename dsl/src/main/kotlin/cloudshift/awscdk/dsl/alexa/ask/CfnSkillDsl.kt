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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.alexa.ask.CfnSkill
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSkillDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSkill.Builder = CfnSkill.Builder.create(scope, id)

    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    public fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    public fun skillPackage(skillPackage: IResolvable) {
        cdkBuilder.skillPackage(skillPackage)
    }

    public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty) {
        cdkBuilder.skillPackage(skillPackage)
    }

    public fun vendorId(vendorId: String) {
        cdkBuilder.vendorId(vendorId)
    }

    public fun build(): CfnSkill = cdkBuilder.build()
}
