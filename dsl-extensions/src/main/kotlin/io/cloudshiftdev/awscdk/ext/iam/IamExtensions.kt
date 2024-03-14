package io.cloudshiftdev.awscdk.ext.iam

import io.cloudshiftdev.awscdk.services.iam.Effect
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement

public fun PolicyStatement.Builder.allow() {
    effect(Effect.ALLOW)
}

public fun PolicyStatement.Builder.deny() {
    effect(Effect.DENY)
}

public fun PolicyStatement.Builder.action(action: String) {
    actions(action)
}

public fun PolicyStatement.Builder.resource(arn: String) {
    resources(arn)
}

public fun PolicyStatement.Builder.anyResource() {
    resources("*")
}

public fun policyStatements(block: (PolicyStatementsDsl).() -> Unit): List<PolicyStatement> {
    return PolicyStatementsDsl().apply(block).policyStatements
}

public class PolicyStatementsDsl {
    internal val policyStatements = mutableListOf<PolicyStatement>()

    public fun policyStatement(block: PolicyStatement.Builder.() -> Unit) {
        policyStatements.add(PolicyStatement(block))
    }
}
