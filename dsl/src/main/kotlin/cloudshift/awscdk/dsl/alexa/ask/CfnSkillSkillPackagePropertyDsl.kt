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
import kotlin.String

@CdkDslMarker
public class CfnSkillSkillPackagePropertyDsl {
    private val cdkBuilder: CfnSkill.SkillPackageProperty.Builder =
        CfnSkill.SkillPackageProperty.builder()

    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    public fun overrides(overrides: CfnSkill.OverridesProperty) {
        cdkBuilder.overrides(overrides)
    }

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3BucketRole(s3BucketRole: String) {
        cdkBuilder.s3BucketRole(s3BucketRole)
    }

    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
    }

    public fun build(): CfnSkill.SkillPackageProperty = cdkBuilder.build()
}
