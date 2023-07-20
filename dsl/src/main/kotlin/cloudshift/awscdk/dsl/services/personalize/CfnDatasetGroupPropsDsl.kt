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
import software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
import kotlin.String

@CdkDslMarker
public class CfnDatasetGroupPropsDsl {
    private val cdkBuilder: CfnDatasetGroupProps.Builder = CfnDatasetGroupProps.builder()

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

    public fun build(): CfnDatasetGroupProps = cdkBuilder.build()
}
