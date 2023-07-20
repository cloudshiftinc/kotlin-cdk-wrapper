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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationCustomArtifactConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.CustomArtifactConfigurationProperty.Builder =
        CfnApplication.CustomArtifactConfigurationProperty.builder()

    public fun artifactType(artifactType: String) {
        cdkBuilder.artifactType(artifactType)
    }

    public fun mavenReference(mavenReference: IResolvable) {
        cdkBuilder.mavenReference(mavenReference)
    }

    public fun mavenReference(mavenReference: CfnApplication.MavenReferenceProperty) {
        cdkBuilder.mavenReference(mavenReference)
    }

    public fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun s3ContentLocation(s3ContentLocation: CfnApplication.S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun build(): CfnApplication.CustomArtifactConfigurationProperty = cdkBuilder.build()
}
