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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.efs.CfnFileSystem
import kotlin.String

@CdkDslMarker
public class CfnFileSystemElasticFileSystemTagPropertyDsl {
    private val cdkBuilder: CfnFileSystem.ElasticFileSystemTagProperty.Builder =
        CfnFileSystem.ElasticFileSystemTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFileSystem.ElasticFileSystemTagProperty = cdkBuilder.build()
}
