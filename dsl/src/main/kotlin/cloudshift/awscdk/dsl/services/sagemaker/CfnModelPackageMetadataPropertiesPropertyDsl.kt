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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.String

@CdkDslMarker
public class CfnModelPackageMetadataPropertiesPropertyDsl {
    private val cdkBuilder: CfnModelPackage.MetadataPropertiesProperty.Builder =
        CfnModelPackage.MetadataPropertiesProperty.builder()

    public fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
    }

    public fun generatedBy(generatedBy: String) {
        cdkBuilder.generatedBy(generatedBy)
    }

    public fun projectId(projectId: String) {
        cdkBuilder.projectId(projectId)
    }

    public fun repository(repository: String) {
        cdkBuilder.repository(repository)
    }

    public fun build(): CfnModelPackage.MetadataPropertiesProperty = cdkBuilder.build()
}
