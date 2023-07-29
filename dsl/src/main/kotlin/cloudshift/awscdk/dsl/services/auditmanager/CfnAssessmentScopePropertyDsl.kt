@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.auditmanager.CfnAssessment

/**
 * The `Scope` property type specifies the wrapper that contains the AWS accounts and services that
 * are in scope for the assessment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * ScopeProperty scopeProperty = ScopeProperty.builder()
 * .awsAccounts(List.of(AWSAccountProperty.builder()
 * .emailAddress("emailAddress")
 * .id("id")
 * .name("name")
 * .build()))
 * .awsServices(List.of(AWSServiceProperty.builder()
 * .serviceName("serviceName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-scope.html)
 */
@CdkDslMarker
public class CfnAssessmentScopePropertyDsl {
    private val cdkBuilder: CfnAssessment.ScopeProperty.Builder =
        CfnAssessment.ScopeProperty.builder()

    private val _awsAccounts: MutableList<Any> = mutableListOf()

    private val _awsServices: MutableList<Any> = mutableListOf()

    /** @param awsAccounts The AWS accounts that are included in the scope of the assessment. */
    public fun awsAccounts(vararg awsAccounts: Any) {
        _awsAccounts.addAll(listOf(*awsAccounts))
    }

    /** @param awsAccounts The AWS accounts that are included in the scope of the assessment. */
    public fun awsAccounts(awsAccounts: Collection<Any>) {
        _awsAccounts.addAll(awsAccounts)
    }

    /** @param awsAccounts The AWS accounts that are included in the scope of the assessment. */
    public fun awsAccounts(awsAccounts: IResolvable) {
        cdkBuilder.awsAccounts(awsAccounts)
    }

    /** @param awsServices The AWS services that are included in the scope of the assessment. */
    public fun awsServices(vararg awsServices: Any) {
        _awsServices.addAll(listOf(*awsServices))
    }

    /** @param awsServices The AWS services that are included in the scope of the assessment. */
    public fun awsServices(awsServices: Collection<Any>) {
        _awsServices.addAll(awsServices)
    }

    /** @param awsServices The AWS services that are included in the scope of the assessment. */
    public fun awsServices(awsServices: IResolvable) {
        cdkBuilder.awsServices(awsServices)
    }

    public fun build(): CfnAssessment.ScopeProperty {
        if (_awsAccounts.isNotEmpty()) cdkBuilder.awsAccounts(_awsAccounts)
        if (_awsServices.isNotEmpty()) cdkBuilder.awsServices(_awsServices)
        return cdkBuilder.build()
    }
}
