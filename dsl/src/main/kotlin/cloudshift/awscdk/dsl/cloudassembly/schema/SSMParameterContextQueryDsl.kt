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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
import kotlin.String

@CdkDslMarker
public class SSMParameterContextQueryDsl {
    private val cdkBuilder: SSMParameterContextQuery.Builder = SSMParameterContextQuery.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): SSMParameterContextQuery = cdkBuilder.build()
}
