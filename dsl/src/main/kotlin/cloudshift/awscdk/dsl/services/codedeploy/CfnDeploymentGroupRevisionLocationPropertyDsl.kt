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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.String

@CdkDslMarker
public class CfnDeploymentGroupRevisionLocationPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.RevisionLocationProperty.Builder =
        CfnDeploymentGroup.RevisionLocationProperty.builder()

    public fun gitHubLocation(gitHubLocation: IResolvable) {
        cdkBuilder.gitHubLocation(gitHubLocation)
    }

    public fun gitHubLocation(gitHubLocation: CfnDeploymentGroup.GitHubLocationProperty) {
        cdkBuilder.gitHubLocation(gitHubLocation)
    }

    public fun revisionType(revisionType: String) {
        cdkBuilder.revisionType(revisionType)
    }

    public fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun s3Location(s3Location: CfnDeploymentGroup.S3LocationProperty) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): CfnDeploymentGroup.RevisionLocationProperty = cdkBuilder.build()
}
