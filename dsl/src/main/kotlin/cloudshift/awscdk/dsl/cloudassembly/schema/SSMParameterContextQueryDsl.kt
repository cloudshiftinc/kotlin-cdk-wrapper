@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
import kotlin.String

/**
 * Query to SSM Parameter Context Provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * SSMParameterContextQuery sSMParameterContextQuery = SSMParameterContextQuery.builder()
 * .account("account")
 * .parameterName("parameterName")
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class SSMParameterContextQueryDsl {
    private val cdkBuilder: SSMParameterContextQuery.Builder = SSMParameterContextQuery.builder()

    /**
     * @param account Query account.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param parameterName Parameter name to query.
     */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param region Query region.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): SSMParameterContextQuery = cdkBuilder.build()
}
