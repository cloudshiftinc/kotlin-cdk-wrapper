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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnStudioDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStudio.Builder = CfnStudio.Builder.create(scope, id)

    public fun adminRoleArn(adminRoleArn: String) {
        cdkBuilder.adminRoleArn(adminRoleArn)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
        cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration)
    }

    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty) {
        cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration)
    }

    public fun studioName(studioName: String) {
        cdkBuilder.studioName(studioName)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun userRoleArn(userRoleArn: String) {
        cdkBuilder.userRoleArn(userRoleArn)
    }

    public fun build(): CfnStudio = cdkBuilder.build()
}
