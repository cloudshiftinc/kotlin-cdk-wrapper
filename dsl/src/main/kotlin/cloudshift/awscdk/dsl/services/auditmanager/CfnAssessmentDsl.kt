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

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssessmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssessment.Builder = CfnAssessment.Builder.create(scope, id)

    private val _delegations: MutableList<Any> = mutableListOf()

    private val _roles: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
        cdkBuilder.assessmentReportsDestination(assessmentReportsDestination)
    }

    public fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty) {
        cdkBuilder.assessmentReportsDestination(assessmentReportsDestination)
    }

    public fun awsAccount(awsAccount: IResolvable) {
        cdkBuilder.awsAccount(awsAccount)
    }

    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty) {
        cdkBuilder.awsAccount(awsAccount)
    }

    public fun delegations(vararg delegations: Any) {
        _delegations.addAll(listOf(*delegations))
    }

    public fun delegations(delegations: Collection<Any>) {
        _delegations.addAll(delegations)
    }

    public fun delegations(delegations: IResolvable) {
        cdkBuilder.delegations(delegations)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun frameworkId(frameworkId: String) {
        cdkBuilder.frameworkId(frameworkId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun roles(vararg roles: Any) {
        _roles.addAll(listOf(*roles))
    }

    public fun roles(roles: Collection<Any>) {
        _roles.addAll(roles)
    }

    public fun roles(roles: IResolvable) {
        cdkBuilder.roles(roles)
    }

    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    public fun scope(scope: CfnAssessment.ScopeProperty) {
        cdkBuilder.scope(scope)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssessment {
        if (_delegations.isNotEmpty()) cdkBuilder.delegations(_delegations)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
