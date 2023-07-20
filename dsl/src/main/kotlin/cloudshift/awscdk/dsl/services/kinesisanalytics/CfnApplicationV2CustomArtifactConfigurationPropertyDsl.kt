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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2CustomArtifactConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.CustomArtifactConfigurationProperty.Builder =
        CfnApplicationV2.CustomArtifactConfigurationProperty.builder()

    public fun artifactType(artifactType: String) {
        cdkBuilder.artifactType(artifactType)
    }

    public fun mavenReference(mavenReference: IResolvable) {
        cdkBuilder.mavenReference(mavenReference)
    }

    public fun mavenReference(mavenReference: CfnApplicationV2.MavenReferenceProperty) {
        cdkBuilder.mavenReference(mavenReference)
    }

    public fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun s3ContentLocation(s3ContentLocation: CfnApplicationV2.S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun build(): CfnApplicationV2.CustomArtifactConfigurationProperty = cdkBuilder.build()
}
