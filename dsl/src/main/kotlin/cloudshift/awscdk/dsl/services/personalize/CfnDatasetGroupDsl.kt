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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.personalize.CfnDatasetGroup
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDatasetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDatasetGroup.Builder = CfnDatasetGroup.Builder.create(scope, id)

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDatasetGroup = cdkBuilder.build()
}
